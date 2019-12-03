## LAB 10

# Wyj¹tki, Socket, ServerSocket

1. Napisz aplikacjê, która obs³u¿y wyj¹tek w przypadku wyst¹pienia operacji
    niedozwolonej – np. dzielenia liczby przez zero (ArithmeticException). Po wykryciu
    wyst¹pienia wyj¹tku nale¿y wyœwietliæ komunikat „Nie dziel przez zero”, nastêpnie
    pomimo wyst¹pienia b³êdu zwróciæ komunikat i zakoñczyæ dzia³anie programu.
2. Z u¿yciem Socket, ServerSocket napisz aplikacjê typu klient-serwer.

```
Server:
* po uruchomieniu oczekuje na po³¹czenie
* po po³¹czeniu serwer wysy³a do klienta komunikat "Wys³ano komunikat do
klienta" i oczekuje na odpowiedŸ.
* w przypadku gdy klient odpowie "Nawi¹zano komunikacjê i wys³ano
odpowiedŸ"
* serwer po 5 sekundach wyœle komunikat „Po³¹czenie zatwierdzone” w
przypadku otrzymania z³ej odpowiedzi serwer siê wy³¹cza.
```
```
Klient:
* sprawdza przychodz¹ce komunikaty
* jeœli otrzyma "Wys³ano komunikat do klienta" to odpowiada "Nawi¹zano
komunikacjê i wys³ano odpowiedŸ"
* po 120 sekundach dzia³ania wyœle komunikat "Koñczê pracê" i siê wy³¹czy
```
3. U¿ywaj¹c bibliotekê Java Mail napisz program, który wysy³a wiadomoœci email. Do
    tego celu nale¿y wykorzystaæ studenckie konto pocztowe UZ.


