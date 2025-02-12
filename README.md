📚 Symulator Biblioteki

Symulator Biblioteki to aplikacja konsolowa napisana w Javie, która pozwala na zarządzanie biblioteką. Użytkownik może przeglądać dostępne książki, wypożyczać je, zwracać oraz dodawać nowe pozycje do biblioteki. Projekt wykorzystuje podstawowe zasady programowania obiektowego (OOP), takie jak dziedziczenie, polimorfizm, enkapsulacja i abstrakcja.

📋 Funkcjonalności

Dodaj książkę: Możliwość dodania nowej książki do biblioteki, z podaniem jej tytułu, autora i roku wydania.

Usuń książkę: Usuwanie książki z biblioteki na podstawie jej numeru ID.

Wyświetl wszystkie książki: Wyświetlenie pełnej listy książek w bibliotece wraz z informacjami o ich tytule, autorze, roku wydania oraz statusie (dostępna/wypożyczona).

Zarejestruj użytkownika: Dodanie nowego użytkownika do systemu biblioteki, z podaniem jego imienia i nazwiska.

Wyświetl użytkowników: Przegląd listy wszystkich zarejestrowanych użytkowników wraz z ich unikalnym ID.

Wypożycz książkę: Umożliwia użytkownikowi wypożyczenie książki, jeśli jest dostępna. Wymaga podania ID użytkownika oraz ID książki.

Zwrot książki: Zwracanie książki do biblioteki przez użytkownika, dzięki czemu ponownie staje się dostępna.

Obsługa wyjątków: System sprawdza, czy operacje (np. wypożyczenie niedostępnej książki) są możliwe, i informuje użytkownika o ewentualnych błędach.

📦 Wykorzystywane technologie

Java: Implementacja projektu.
Zasady OOP:
Abstrakcja: Książki są reprezentowane jako obiekty klasy Book.
Dziedziczenie: Możliwość rozszerzenia w przyszłości (np. różne typy książek, jak e-booki czy audiobooki).
Polimorfizm: Różne sposoby obsługi książek w zależności od ich stanu.
Enkapsulacja: Prywatne pola w klasach dostępne przez gettery i settery.

⚙️ Jak uruchomić projekt?

Skonfiguruj środowisko

Zainstaluj JDK (Java Development Kit) w wersji 8 lub nowszej.
Upewnij się, że masz skonfigurowaną Javę na swoim komputerze (zmienna JAVA_HOME).

Uruchom projekt

Skopiuj kod projektu na swój komputer.

Otwórz projekt w IntelliJ IDEA lub innym środowisku wspierającym Javę.

Uruchom klasę Main (punkt wejścia do programu).

🧩 Struktura projektu

Book: Klasa reprezentująca książkę. Zawiera takie pola jak:
Id, Tytuł, Autor, Status dostępności.

Library: Klasa zarządzająca listą książek w bibliotece. Obsługuje operacje takie jak:
Dodanie książki, usuwanie książki, rejestrowanie użytkownika, dostępność książki.

Person: Klasa abstrakcyjna reprezentująca osobę w systemie biblioteki. Pola:
Id, name.

User: Klasa dziedzicząca po Person, reprezentuje użytkownika biblioteki. Dodatkowe funkcjonalności:

Wypożyczanie książki – użytkownik może wypożyczyć maksymalnie 3 książki.

Zwrot książki – użytkownik zwraca książkę, która wraca na listę dostępnych pozycji.

Lista wypożyczonych książek – przechowuje książki wypożyczone przez użytkownika.

Main: Klasa główna odpowiedzialna za interakcję z użytkownikiem (menu konsolowe).

📚 Przykład działania

Dodanie książek:

![image](https://github.com/user-attachments/assets/0eca5e85-0efe-4f84-ae8d-92e1bf6da4a8)

Wyświetlenie oraz próba wypożyczenia książki przez niezarejestrowanego użytkownika:

![image](https://github.com/user-attachments/assets/0b24cce2-640a-45e5-9102-d09460ba5046)
![image](https://github.com/user-attachments/assets/810473a8-16ed-40e4-b44d-f879fcfcfe95)

Dodanie użytkownika oraz wypożyczenie książki:

![image](https://github.com/user-attachments/assets/bb1d3fca-a89f-4320-92b0-adf1534c4e3a)

Wyświetlenie książek (wypożyczona lub nie), zwrot książki:

![image](https://github.com/user-attachments/assets/d83b4163-a573-474d-9d66-7cc2f3c42c02)

🚀 Pomysły na dalszy rozwój

Zapisywanie stanu biblioteki: Dodanie możliwości zapisywania i wczytywania danych o książkach z pliku.

Rozszerzenie o różne typy książek: Dodanie obsługi e-booków i audiobooków.

Filtrowanie i wyszukiwanie: Wyszukiwanie książek po tytule, autorze lub roku wydania.

Interfejs graficzny: Rozbudowa aplikacji o GUI.
