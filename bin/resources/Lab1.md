## LAB 1

# Wprowadzenie do �rodowiska Eclipse

1. Uruchamiamy program Eclipse, kt�rego ikona znajduje si� na pulpicie.
2. Nale�y utworzy� nowy projekt Java o nazwie "example".


3. W bie��cym projekcie utworzy� nowy pakiet (package) o nazwie "example".


4. Kolejno nale�y utworzy� klas� o nazwie "Lab" w istniej�cym pakiecie o poni�szej
    zawarto�ci:
5. Aby uruchomi� kod programu nale�y klikn�� ikon� �znajduj�c�� si� w g�rnym pasku:
6. Komentarze:
    - blokowe
    /*..........
    ..... */
    -pojedynczej linii
    //
    PRZYK�AD:
       **package** example;
       **public class** Lab1 {

**public** (^) /*System.out.println("Komentowanie"); **static void** main(String[] args) {
System.out.println("ca�ego");


```
System.out.println("bloku");*/
System. out .println("Hello world");
//System.out.println("Komentarz pojedynczej linii");}
}
```
7. Nazewnictwo:
    7.1. Nazw� klasy rozpoczynamy od wielkiej litery:
       class Lab{ ... }
    7.2. Nazw� metody rozpoczynamy od ma�ej litery.
       void metoda1(){ ... }
    7.3. Nazw� zmiennej rozpoczynamy od ma�ej litery.
       int a;
    7.4. Je�eli wyst�puje nazwa z�o�ona, to poszczeg�lne cz�ony rozpoczynaj� si� od
       wielkiej litery:
          class ZadaniaLab{ ... }
void nowaMetoda(){ ... }
int paramX;
    7.5. Nazw� sta�ej piszemy z wielkich liter, jako separator�w u�ywamy
       podkre�lenia _:
          static final int STALA_PARAM_X;
    7.6. W nazewnictwie element�w Javy wielko�� liter ma znaczenie.
       int A;
          int a;
Powy�ej zaprezentowano dwie r�ne zmienne.
Nale�y pami�ta� o �redniku na ko�cu linii kodu.


