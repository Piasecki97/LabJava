## LAB 10

# Wyj�tki, Socket, ServerSocket

1. Napisz aplikacj�, kt�ra obs�u�y wyj�tek w przypadku wyst�pienia operacji
    niedozwolonej � np. dzielenia liczby przez zero (ArithmeticException). Po wykryciu
    wyst�pienia wyj�tku nale�y wy�wietli� komunikat �Nie dziel przez zero�, nast�pnie
    pomimo wyst�pienia b��du zwr�ci� komunikat i zako�czy� dzia�anie programu.
2. Z u�yciem Socket, ServerSocket napisz aplikacj� typu klient-serwer.

```
Server:
* po uruchomieniu oczekuje na po��czenie
* po po��czeniu serwer wysy�a do klienta komunikat "Wys�ano komunikat do
klienta" i oczekuje na odpowied�.
* w przypadku gdy klient odpowie "Nawi�zano komunikacj� i wys�ano
odpowied�"
* serwer po 5 sekundach wy�le komunikat �Po��czenie zatwierdzone� w
przypadku otrzymania z�ej odpowiedzi serwer si� wy��cza.
```
```
Klient:
* sprawdza przychodz�ce komunikaty
* je�li otrzyma "Wys�ano komunikat do klienta" to odpowiada "Nawi�zano
komunikacj� i wys�ano odpowied�"
* po 120 sekundach dzia�ania wy�le komunikat "Ko�cz� prac�" i si� wy��czy
```
3. U�ywaj�c bibliotek� Java Mail napisz program, kt�ry wysy�a wiadomo�ci email. Do
    tego celu nale�y wykorzysta� studenckie konto pocztowe UZ.


