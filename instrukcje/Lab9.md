## LAB 9

# Wielow¹tkowoœæ, wyj¹tki, interfejsy

1. Napisz aplikacjê, która utworzy 15 w¹tków wyœwietlaj¹cych informacje: id w¹tku,
    tekst „w¹tek:...1-15” oraz dzisiejsz¹ datê. Po wykonaniu zadania dzia³anie ka¿dego z
    w¹tków zostaje uœpione na czas 300 milisekund.
2. Napisz aplikacjê generuj¹c¹ logi na dowolnie zadany przez siebie temat (np.
    generator logu oceny filmu bêdzie wygl¹da³ nastêpuj¹co: id_filmu, id_uzytkownika,
    ocena, data_glosowania). Zapis informacji do pliku nale¿y zrealizowaæ wielow¹tkowo
    z u¿yciem dwóch metod: poprzez dziedziczenie klasy Thread, oraz poprzez
    implementacjê interfejsu Runnable. Nastêpie wielow¹tkowo odczytaæ z pliku
    informacje w nim zawarte i wyœwietliæ po 10 linii dla ka¿dego w¹tku.
3. Zaimplementuj wyœcig w¹tków o takim samym priorytecie (wyk³ad 5) i sprawdŸ czy
    u¿ywany system operacyjny segmentuje czas. SprawdŸ wyniki wyœcigu dla w¹tków o
    ró¿nych priorytetach.
4. Utwórz interfejs Playable dziedzicz¹cy po interfejsie Runnable który zapewni metody
    play(), stop(), isInUse() oraz setInUse(). Nastêpnie utwórz klasy Mp3Player oraz
    AviPlayer, które zaimplementuj¹ interfejs Playable. Obiekty tych klas w przypadku
    wywo³ania metody play() maj¹ z odstêpem co jedna sekunda wyœwietlaæ
    powiadomienie do czasu wywo³ania metody stop() (powiadomienie ma brzmieæ
    „odtwarzacz mp3 : gram”). Stworzone klasy powinny dzia³aæ z zaproponowan¹ klas¹
    MultimediaCenter.

```
public class MultimediaCenter {
private Vector<Playable> devices = new Vector<Playable>();
Playable getNotUsedDevice() {
for (Iterator<Playable> iterator = devices.iterator(); iterator
.hasNext();) {
Playable tmpDevice = iterator.next();
if (tmpDevice.setInUse())
return tmpDevice;
}
return null ;
}
```

```
void addDevice(Playable device) {
devices.add(device);
}
public static void main(String[] args) {
MultimediaCenter myMultimediaCenter = new MultimediaCenter();
myMultimediaCenter.addDevice( new Mp3Player("odtwarzaczmp3"));
myMultimediaCenter.addDevice( new AviPlayer("odtwarzaczavi"));
Playable urzadzenie1 = myMultimediaCenter.getNotUsedDevice();
Playable urzadzenie2 = myMultimediaCenter.getNotUsedDevice();
Thread watek_urzadzenia1 = new Thread(urzadzenie1);
Thread watek_urzadzenia2 = new Thread(urzadzenie2);
watek_urzadzenia1.start();
watek_urzadzenia2.start();
try {
Thread. sleep (5000);
} catch (InterruptedException e) {
e.printStackTrace();
}
urzadzenie1.stop();
try {
Thread. sleep (5000);
} catch (InterruptedException e) {
e.printStackTrace();
}
urzadzenie2.stop();
}
}
```
5. Do klasy MultimediaCenter dodaj obiekt spe³niaj¹ce rolê zasobu – G³oœniki (klasa
    powinna zawieraæ takie metody jak : setInUse(), release() ):

```
Speakers speakers = new Speakers("g³oœniki firmy X");
```
6. Zmodyfikuj konstruktory klas Mp3Player oraz AviPlayer aby korzysta³y z
    przydzielonego („pod³¹czonego”) zasobu :

```
myMultimediaCenter.addDevice( new Mp3Player("odtwarzaczmp3",
myMultimediaCenter.speakers));
myMultimediaCenter.addDevice( new AviPlayer("odtwarzaczavi",
myMultimediaCenter.speakers));
```
7. Ponadto zmodyfikuj metody play() w stworzonych klasach aby korzysta³y przy
    wyœwietlaniu z przydzielonego aktualnie zasobu (powiadomienia powinny wygl¹daæ


np.: „odtwarzaczmp3 – gram na g³oœnikach firmy X). Nale¿y pamiêtaæ, ¿e zasoby nie
mog¹ byæ wykorzystywane w tym samym czasie przez dwa urz¹dzenia.


