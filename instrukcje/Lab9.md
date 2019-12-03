## LAB 9

# Wielow�tkowo��, wyj�tki, interfejsy

1. Napisz aplikacj�, kt�ra utworzy 15 w�tk�w wy�wietlaj�cych informacje: id w�tku,
    tekst �w�tek:...1-15� oraz dzisiejsz� dat�. Po wykonaniu zadania dzia�anie ka�dego z
    w�tk�w zostaje u�pione na czas 300 milisekund.
2. Napisz aplikacj� generuj�c� logi na dowolnie zadany przez siebie temat (np.
    generator logu oceny filmu b�dzie wygl�da� nast�puj�co: id_filmu, id_uzytkownika,
    ocena, data_glosowania). Zapis informacji do pliku nale�y zrealizowa� wielow�tkowo
    z u�yciem dw�ch metod: poprzez dziedziczenie klasy Thread, oraz poprzez
    implementacj� interfejsu Runnable. Nast�pie wielow�tkowo odczyta� z pliku
    informacje w nim zawarte i wy�wietli� po 10 linii dla ka�dego w�tku.
3. Zaimplementuj wy�cig w�tk�w o takim samym priorytecie (wyk�ad 5) i sprawd� czy
    u�ywany system operacyjny segmentuje czas. Sprawd� wyniki wy�cigu dla w�tk�w o
    r�nych priorytetach.
4. Utw�rz interfejs Playable dziedzicz�cy po interfejsie Runnable kt�ry zapewni metody
    play(), stop(), isInUse() oraz setInUse(). Nast�pnie utw�rz klasy Mp3Player oraz
    AviPlayer, kt�re zaimplementuj� interfejs Playable. Obiekty tych klas w przypadku
    wywo�ania metody play() maj� z odst�pem co jedna sekunda wy�wietla�
    powiadomienie do czasu wywo�ania metody stop() (powiadomienie ma brzmie�
    �odtwarzacz mp3 : gram�). Stworzone klasy powinny dzia�a� z zaproponowan� klas�
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
5. Do klasy MultimediaCenter dodaj obiekt spe�niaj�ce rol� zasobu � G�o�niki (klasa
    powinna zawiera� takie metody jak : setInUse(), release() ):

```
Speakers speakers = new Speakers("g�o�niki firmy X");
```
6. Zmodyfikuj konstruktory klas Mp3Player oraz AviPlayer aby korzysta�y z
    przydzielonego (�pod��czonego�) zasobu :

```
myMultimediaCenter.addDevice( new Mp3Player("odtwarzaczmp3",
myMultimediaCenter.speakers));
myMultimediaCenter.addDevice( new AviPlayer("odtwarzaczavi",
myMultimediaCenter.speakers));
```
7. Ponadto zmodyfikuj metody play() w stworzonych klasach aby korzysta�y przy
    wy�wietlaniu z przydzielonego aktualnie zasobu (powiadomienia powinny wygl�da�


np.: �odtwarzaczmp3 � gram na g�o�nikach firmy X). Nale�y pami�ta�, �e zasoby nie
mog� by� wykorzystywane w tym samym czasie przez dwa urz�dzenia.


