# Java 08 - Exercitii SOLID si Generics

Acest proiect contine exercitii Java despre principii SOLID, interfete, generics,
pattern-uri de proiectare si separarea responsabilitatilor.

## Cum rulezi exercitiile

Din directorul proiectului:

```bash
rm -rf /tmp/java08-classes
mkdir -p /tmp/java08-classes
javac -d /tmp/java08-classes ex00/*.java
java -cp /tmp/java08-classes ex00.InterfaceSegregationTest
```

Pentru alt exercitiu, inlocuieste `ex00` si clasa de test cu valorile din lista de mai jos.

## Exercitii

### ex00 - Interface Segregation Principle

**Ce face:**
- defineste un `Document`;
- separa responsabilitatile de imprimare si scanare in interfetele `Printer` si `Scanner`;
- implementeaza ambele interfete in `MultiFunctionDevice`;
- testeaza imprimarea unui text si scanarea documentului rezultat.

**Ce inveti:**
- cum se definesc si se implementeaza interfete;
- principiul ISP: o clasa nu trebuie fortata sa depinda de metode pe care nu le foloseste;
- polimorfismul prin interfete.

**Clasa de rulare:** `ex00.InterfaceSegregationTest`

### ex01 - Gestionarea studentilor

**Ce face:**
- reprezinta un student printr-un ID, o lista de cursuri si un set de cluburi;
- foloseste `Map<Integer, Student>` pentru a gasi studentii dupa ID;
- permite adaugarea unui student, inscrierea la un curs si inscrierea la un club.

**Ce inveti:**
- diferenta dintre `List`, `Set` si `Map`;
- alegerea unei colectii potrivite pentru problema rezolvata;
- organizarea datelor folosind compozitie si incapsulare.

### ex02 - Dependency Inversion Principle

**Ce face:**
- defineste interfata `NotificationSender`;
- implementeaza trimiterea prin `EmailSender` si `SMSSender`;
- `NotificationManager` pastreaza o lista de `NotificationSender` si trimite mesajul prin toate implementarile inregistrate.

**Ce inveti:**
- principiul DIP: clasele de nivel inalt depind de abstractii, nu de clase concrete;
- programarea fata de interfete;
- adaugarea unei metode noi de notificare fara modificarea managerului.

**Clasa de rulare:** `ex02.DependencyInversionTest`

### ex03 - Pair generic

**Ce face:**
- implementeaza `Pair<T, U>` pentru doua valori de tipuri diferite;
- ofera metode pentru recuperarea primei si celei de-a doua valori;
- suprascrie `toString()` pentru afisarea perechii.

**Ce inveti:**
- generics in Java;
- reutilizarea aceleiasi clase pentru tipuri diferite;
- similaritatea dintre generics in Java si templates in C++;
- inferenta tipurilor folosind operatorul `<>`.

**Clasa de rulare:** `ex03.GenericsTest`

### ex04 - Observer generic pentru un blog

**Ce face:**
- `Subject<T>` defineste atasarea, detasarea si notificarea observatorilor;
- `Observer<T>` defineste metoda `update(T data)`;
- `Blog` pastreaza observatorii si ii notifica atunci cand apare o postare noua;
- `Subscriber` primeste continutul postarii.

**Ce inveti:**
- pattern-ul Observer;
- generics aplicat interfetelor;
- notificarea mai multor obiecte printr-un contract comun;
- separarea subiectului de observatorii sai.

**Clasa de rulare:** `ex04.SolidObserverTest`

### ex05 - SortedList si upper bounds

**Ce face:**
- implementeaza `SortedList<T extends Comparable<T>>`;
- adauga elemente si sorteaza automat lista;
- demonstreaza folosirea clasei cu `Integer` si `Double`.

**Ce inveti:**
- limite superioare pentru tipuri generice;
- de ce `Integer` si `Double` pot fi sortate: ambele implementeaza `Comparable`;
- folosirea `compareTo()` si a sortarii generice;
- verificarea constrangerilor de tip la compilare.

**Clasa de rulare:** `ex05.UpperBoundedCollectionsTest`

### ex06 - Smart Home si Interface Segregation

**Ce face:**
- separa controlul in `LightControl`, `TemperatureControl` si `SecurityControl`;
- implementeaza dispozitivele `SmartLight`, `SmartThermostat` si `SmartCamera`;
- `SmartHomeHub` pastreaza dispozitivele prin interfetele lor si executa actiuni de grup.

**Ce inveti:**
- aplicarea ISP intr-un sistem mai mare;
- programarea fata de interfete, nu fata de implementari concrete;
- folosirea colectiilor de interfete;
- actiuni comune asupra mai multor dispozitive.

**Clasa de rulare:** `ex06.MovieRatingTest`

Nota: numele clasei de test este pastrat asa cum exista in scheletul proiectului.

### ex07 - Notificari de concerte cu Observer generic

**Ce face:**
- `ConcertNotifier` este subiectul care gestioneaza followerii;
- `Follower` este observatorul care primeste notificari;
- `ConcertEvent` este trimis direct prin `update`, fara un callback separat;
- followerii pot fi atasati si detasati.

**Ce inveti:**
- o varianta generica a pattern-ului Observer;
- transmiterea unor obiecte complexe intre subiect si observatori;
- diferenta dintre transmiterea directa a datelor si un callback separat;
- gestionarea abonatilor.

**Clasa de rulare:** `ex07.ConcertNotificationTest`

### ex08 - Turneu eSports si strategii de clasament

**Ce face:**
- `Team` defineste contractul comun si extinde `Comparable<Team>`;
- `EsportsTeam` contine numele si pozitia echipei si implementeaza `compareTo()`;
- `Tournament<T extends Team>` inregistreaza echipe de tip compatibil;
- `RankingStrategy<T extends Team>` defineste un algoritm de clasare;
- testul aplica o strategie care sorteaza echipele dupa pozitie.

**Ce inveti:**
- generics cu upper bounds, de forma `T extends Team`;
- cum se foloseste `Comparable` pentru sortare;
- pattern-ul Strategy: algoritmul este separat de datele turneului;
- cum schimbi algoritmul de clasare fara sa modifici `Tournament`.

**Clasa de rulare:** `ex08.EsportsTournamentTest`

### ex09 - Motor de recomandari pentru streaming

**Ce face:**
- `Content` este contractul comun pentru `Movie` si `Series`;
- `User` are un gen preferat;
- `RecommendationAlgorithm<T extends Content>` defineste algoritmul de recomandare;
- `GenreRecommendationAlgorithm` filtreaza continutul dupa gen;
- `RecommendationEngine<T extends Content>` foloseste algoritmul primit;
- `StreamingService<T extends Content>` inregistreaza utilizatori si notifica doar utilizatorii interesati cand apare continut nou.

**Ce inveti:**
- compunerea mai multor generics intr-un proiect real;
- Dependency Inversion prin injectarea algoritmului in motor;
- Strategy Pattern pentru algoritmi de recomandare;
- separarea responsabilitatilor conform principiilor SOLID;
- filtrarea continutului si notificarea selectiva a utilizatorilor.

**Clasa de rulare:** `ex09.SsreTest`

## Concepte principale recapitulare

- **Interfete:** definesc contracte si reduc dependenta de implementari concrete.
- **Generics:** permit cod reutilizabil, verificat la compilare.
- **List, Set, Map:** structuri de date pentru scenarii diferite.
- **Comparable:** permite compararea si sortarea obiectelor.
- **Observer:** notifica mai multe obiecte atunci cand apare o schimbare.
- **Strategy:** permite schimbarea algoritmului fara modificarea clasei principale.
- **SOLID:** ajuta la obtinerea unui cod extensibil, testabil si usor de intretinut.
