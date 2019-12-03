## LAB 5

# Obiekty

1. Stw�rz klas� o nazwie Samochod reprezentuj�c� dane pojazdu zawieraj�c�
    nast�puj�ce pola:
       marka,
       model,
       pojemnosc,
       typ,
       silnik,
       rok produkcji,
       data 1 rejestracji,
       cena.

```
Klasa powinna zawiera� osobne metody s�u��ce do ustawiania i zwracania warto�ci
poszczeg�lnych p�l obiekt�w.
```
2. Dodatkowo metod�, kt�ra sprawdzi, czy samoch�d posiada jeszcze gwarancj� (wiek
    pojazdu do 2 lat licz�c od daty rejestracji) i zwr�ci informacj� w formie komunikatu
    tekstowego.
3. Dodaj klas� AutoKomis, w kt�rej stworzone b�d� nowe obiekty klasy Samochod,
    przechowuj�ce dane o pojazdach (10 sztuk).
4. Korzystaj�c z obiektowego modelu programowania nale�y zaprojektowa� oraz
    wykona� implementacj� kodu realizuj�cego symulacj� funkcjonalno�ci ekspresu do
    kawy. Nale�y wykona� API steruj�ce ekspresem oraz zrealizowa� poni�sze za�o�enia
    projektowe:
    - ekspres do kawy sk�ada si� z komponent�w takich jak:
    grza�ka do mleka, grza�ka do wody, pojemnika na kubki, zbiornik�w na wod�,
    element�w wykonawczych takich jak pompy do wody, pompy do mleka,
    odseparowanych pojemnik�w na ziarna kawy i cukier, panelu przedniego
    posiadaj�cego w��cznik on/off oraz diod� informuj�c� o stanie urz�dzenia,
    - ekspres posiada interfejs dotykowy odpowiedzialny za sterowanie urz�dzeniem,
    - u�ytkownik wybiera rodzaj kawy, wskazuje ilo�� poszczeg�lnych sk�adnik�w takich
    jak typ i ilo�� mleka, kawy, cukru,
    - u�ytkownik wybiera kaw� spo�r�d dost�pnych propozycji w ekspresie (5 gatunk�w)
    - jednymi z akcji jakie wykonuje ekspres s�:mielenie kawy, przesypywanie do g�owicy,
    w��czanie grza�ki, uruchamianie pomp wody i/lub mleka, kt�re s� przesy�ane
    przewodami z pojemnika do g�owicy,
    - mo�liwa jest regulacja ci�nienia oraz temperatury wody i/lub mleka
    przep�ywaj�cego w celu zachowania optymalnych dla danego gatunku kawy
    parametr�w t�oczonej wody i/lub mleka,


- nale�y pami�ta� o czujnikach wyst�puj�cych w urz�dzeniu: ci�nienia wody i mleka,
poziomu wody, mleka, kawy, cukru oraz resztek zmielonej kawy stanowi�cej odpad
po zaparzeniu oraz temperatury wody i mleka.
- sterowanie przez u�ytkownika ekspresem powinno przebiega� w prosty i przejrzysty
spos�b umo�liwiaj�c dodawanie w�asnych przepis�w kawy.
Aplikacja dzia�a w spos�b wielow�tkowy. Nale�y wzi�� pod uwag� zasady DRY, KISS,
YAGNI oraz pami�ta� o zachowaniu �czystego kodu�.
5. Nale�y poprawi� poni�szy program, tak aby dzia�a� poprawnie
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
6. Do zadania poprzedniego dopisa� konstruktory kopiuj�ce, konstruktory klasy Point
    dla wywo�ania z jednym i dwoma parametrami (zrobi� to jak najkr�cej-domy�lne
    warto�ci 0), oraz pola statyczne maj�ce za zadanie zlicza� liczb� obiekt�w danej klasy
    wyst�puj�cych w pami�ci. Dopisa� metod� statyczn� wy�wietlaj�c� na konsoli liczb�
    obiekt�w danej klasy. W celu zliczania obiekt�w zdefiniowa� metod� finalize
    (protected void finalize () throws Throwable).
7. Do zdefiniowanych powy�ej klas dopisa� klas� nadrz�dn� Obiekt, przechowuj�c�
    kolor obiektu w postaci instancji klasy Color (pakiet java.awt).
8. Zdefiniowa� struktur� klas bramek logicznych (nadrz�dna Bramka i podrz�dne AND,
    OR , NOT, XOR) gdzie **Bramka** jest klas� abstrakcyjn� i zawiera elementy sk�adowe: -
    pola klasy: **inputs** (typu ca�kowitego - ilo�� wej�� bramki logicznej); **Input** (stan wej��
    bramki logicznej - ci�g zer i jedynek; typu int lub String) , - metody klasy: **setInputs**
    (metoda ustawiaj�ca stan wej�� - zmienn� Input), - metody abstrakcyjne: **getOutput**
    (metoda s�u��ca do odczytu stanu wyj�ciowego - zwraca 0 lub jeden). AND, OR, XOR,
    NOT s� klasami pochodnymi klasy **Bramka** i zawieraj� metod� **getOutput** zwracaj�ca
    warto�� - stan logiczny na wyj�ciu bramki zale�ny od stanu wej�� i typu bramki.
9. Napisa� program kt�ry b�dzie wy�wietla� inicja�y na podstawie nazwiska podanego w
    parametrze.

10.Ten program si� skompiluje ale nie uruchomi � dlaczego? Przeanalizowa� poni�szy
program (wykorzystuj�c dokumentacj� klasy StringBuffer):

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

