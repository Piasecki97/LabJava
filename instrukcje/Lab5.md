## LAB 5

# Obiekty

1. Stwórz klasê o nazwie Samochod reprezentuj¹c¹ dane pojazdu zawieraj¹c¹
    nastêpuj¹ce pola:
       marka,
       model,
       pojemnosc,
       typ,
       silnik,
       rok produkcji,
       data 1 rejestracji,
       cena.

```
Klasa powinna zawieraæ osobne metody s³u¿¹ce do ustawiania i zwracania wartoœci
poszczególnych pól obiektów.
```
2. Dodatkowo metodê, która sprawdzi, czy samochód posiada jeszcze gwarancjê (wiek
    pojazdu do 2 lat licz¹c od daty rejestracji) i zwróci informacjê w formie komunikatu
    tekstowego.
3. Dodaj klasê AutoKomis, w której stworzone bêd¹ nowe obiekty klasy Samochod,
    przechowuj¹ce dane o pojazdach (10 sztuk).
4. Korzystaj¹c z obiektowego modelu programowania nale¿y zaprojektowaæ oraz
    wykonaæ implementacjê kodu realizuj¹cego symulacjê funkcjonalnoœci ekspresu do
    kawy. Nale¿y wykonaæ API steruj¹ce ekspresem oraz zrealizowaæ poni¿sze za³o¿enia
    projektowe:
    - ekspres do kawy sk³ada siê z komponentów takich jak:
    grza³ka do mleka, grza³ka do wody, pojemnika na kubki, zbiorników na wodê,
    elementów wykonawczych takich jak pompy do wody, pompy do mleka,
    odseparowanych pojemników na ziarna kawy i cukier, panelu przedniego
    posiadaj¹cego w³¹cznik on/off oraz diodê informuj¹c¹ o stanie urz¹dzenia,
    - ekspres posiada interfejs dotykowy odpowiedzialny za sterowanie urz¹dzeniem,
    - u¿ytkownik wybiera rodzaj kawy, wskazuje iloœæ poszczególnych sk³adników takich
    jak typ i iloœæ mleka, kawy, cukru,
    - u¿ytkownik wybiera kawê spoœród dostêpnych propozycji w ekspresie (5 gatunków)
    - jednymi z akcji jakie wykonuje ekspres s¹:mielenie kawy, przesypywanie do g³owicy,
    w³¹czanie grza³ki, uruchamianie pomp wody i/lub mleka, które s¹ przesy³ane
    przewodami z pojemnika do g³owicy,
    - mo¿liwa jest regulacja ciœnienia oraz temperatury wody i/lub mleka
    przep³ywaj¹cego w celu zachowania optymalnych dla danego gatunku kawy
    parametrów t³oczonej wody i/lub mleka,


- nale¿y pamiêtaæ o czujnikach wystêpuj¹cych w urz¹dzeniu: ciœnienia wody i mleka,
poziomu wody, mleka, kawy, cukru oraz resztek zmielonej kawy stanowi¹cej odpad
po zaparzeniu oraz temperatury wody i mleka.
- sterowanie przez u¿ytkownika ekspresem powinno przebiegaæ w prosty i przejrzysty
sposób umo¿liwiaj¹c dodawanie w³asnych przepisów kawy.
Aplikacja dzia³a w sposób wielow¹tkowy. Nale¿y wzi¹æ pod uwagê zasady DRY, KISS,
YAGNI oraz pamiêtaæ o zachowaniu „czystego kodu”.
5. Nale¿y poprawiæ poni¿szy program, tak aby dzia³a³ poprawnie
**public class** Point {
**public int** x = 0;
**public int** y = 0;
**public** Point( **int** x, **int** y) {
**this** .x = x;
**this** .y = y;
}
}
**class** Rectangle {
**public int** width = 0;
**public int** height = 0;
Point origin;
// four constructors
**public** Rectangle() {
origin = **new** Point(0, 0);
}
**public** Rectangle(Point p) {
origin = p;
}
**public** Rectangle( **int** w, **int** h) {
**this** ( **new** Point(0, 0), w, h);
}
**public** Rectangle(Point p, **int** w, **int** h) {
origin = p;
width = w;
height = h;
}
**public void** move( **int** x, **int** y) {
origin.x = x;
origin.y = y;
}
**public int** area() {
**return** width * height; }
}
**public class** Zadanie_1 {
**public static void** main(String[] args) {
Rectangle myRect;


```
myRect.width = 40;
myRect.height = 50;
System.out.println("Obszar kwadratu: " + myRect.area());
}
}
```
6. Do zadania poprzedniego dopisaæ konstruktory kopiuj¹ce, konstruktory klasy Point
    dla wywo³ania z jednym i dwoma parametrami (zrobiæ to jak najkrócej-domyœlne
    wartoœci 0), oraz pola statyczne maj¹ce za zadanie zliczaæ liczbê obiektów danej klasy
    wystêpuj¹cych w pamiêci. Dopisaæ metodê statyczn¹ wyœwietlaj¹c¹ na konsoli liczbê
    obiektów danej klasy. W celu zliczania obiektów zdefiniowaæ metodê finalize
    (protected void finalize () throws Throwable).
7. Do zdefiniowanych powy¿ej klas dopisaæ klasê nadrzêdn¹ Obiekt, przechowuj¹c¹
    kolor obiektu w postaci instancji klasy Color (pakiet java.awt).
8. Zdefiniowaæ strukturê klas bramek logicznych (nadrzêdna Bramka i podrzêdne AND,
    OR , NOT, XOR) gdzie **Bramka** jest klas¹ abstrakcyjn¹ i zawiera elementy sk³adowe: -
    pola klasy: **inputs** (typu ca³kowitego - iloœæ wejœæ bramki logicznej); **Input** (stan wejœæ
    bramki logicznej - ci¹g zer i jedynek; typu int lub String) , - metody klasy: **setInputs**
    (metoda ustawiaj¹ca stan wejœæ - zmienn¹ Input), - metody abstrakcyjne: **getOutput**
    (metoda s³u¿¹ca do odczytu stanu wyjœciowego - zwraca 0 lub jeden). AND, OR, XOR,
    NOT s¹ klasami pochodnymi klasy **Bramka** i zawieraj¹ metodê **getOutput** zwracaj¹ca
    wartoœæ - stan logiczny na wyjœciu bramki zale¿ny od stanu wejœæ i typu bramki.
9. Napisaæ program który bêdzie wyœwietla³ inicja³y na podstawie nazwiska podanego w
    parametrze.

10.Ten program siê skompiluje ale nie uruchomi – dlaczego? Przeanalizowaæ poni¿szy
program (wykorzystuj¹c dokumentacjê klasy StringBuffer):

```
publicclass Zadaie_6 {
public static void main(String[] args) {
StringBuffer[] stringBuffers = new StringBuffer[10];
for ( int i = 0; i < stringBuffers.length; i ++) {
stringBuffers[i].append("StringBuffer o indeksie " + i);
}
}
}
```

