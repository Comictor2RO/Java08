# Java 08 - SOLID and Generics Exercises

This project contains Java exercises about SOLID principles, interfaces, generics,
design patterns, and separation of responsibilities.

## Running the exercises

Din directorul proiectului:

```bash
rm -rf /tmp/java08-classes
mkdir -p /tmp/java08-classes
javac -d /tmp/java08-classes ex00/*.java
java -cp /tmp/java08-classes ex00.InterfaceSegregationTest
```

For another exercise, replace `ex00` and the test class with the values listed below.

## Exercises

### ex00 - Interface Segregation Principle

**What it does:**
- defines a `Document`;
- separates printing and scanning responsibilities into the `Printer` and `Scanner` interfaces;
- implements both interfaces in `MultiFunctionDevice`;
- tests printing text and scanning the resulting document.

**What you learn:**
- how to define and implement interfaces;
- the ISP: a class should not be forced to depend on methods it does not use;
- polymorphism through interfaces.

**Run class:** `ex00.InterfaceSegregationTest`

### ex01 - Student Management

**What it does:**
- represents a student with an ID, a list of courses, and a set of clubs;
- uses `Map<Integer, Student>` to find students by ID;
- allows adding a student, enrolling in a course, and joining a club.

**What you learn:**
- the difference between `List`, `Set`, and `Map`;
- how to choose the right collection for a problem;
- how to organize data using composition and encapsulation.

### ex02 - Dependency Inversion Principle

**What it does:**
- defines the `NotificationSender` interface;
- implements email and SMS sending through `EmailSender` and `SMSSender`;
- `NotificationManager` stores a list of `NotificationSender` objects and sends the message through every registered implementation.

**What you learn:**
- the DIP: high-level classes depend on abstractions, not concrete classes;
- programming against interfaces;
- adding a new notification method without modifying the manager.

**Run class:** `ex02.DependencyInversionTest`

### ex03 - Generic Pair

**What it does:**
- implements `Pair<T, U>` for two values of different types;
- provides methods for retrieving the first and second values;
- overrides `toString()` to display the pair.

**What you learn:**
- generics in Java;
- reusing the same class with different types;
- the similarity between Java generics and C++ templates;
- type inference using the `<>` operator.

**Run class:** `ex03.GenericsTest`

### ex04 - Generic Observer for a Blog

**What it does:**
- `Subject<T>` defines attaching, detaching, and notifying observers;
- `Observer<T>` defines the `update(T data)` method;
- `Blog` stores observers and notifies them when a new post is added;
- `Subscriber` receives the post content.

**What you learn:**
- the Observer pattern;
- applying generics to interfaces;
- notifying multiple objects through a common contract;
- separating a subject from its observers.

**Run class:** `ex04.SolidObserverTest`

### ex05 - SortedList and Upper Bounds

**What it does:**
- implements `SortedList<T extends Comparable<T>>`;
- adds elements and automatically sorts the list;
- demonstrates using the class with `Integer` and `Double`.

**What you learn:**
- upper bounds for generic types;
- why `Integer` and `Double` can be sorted: both implement `Comparable`;
- using `compareTo()` and generic sorting;
- checking type constraints at compile time.

**Run class:** `ex05.UpperBoundedCollectionsTest`

### ex06 - Smart Home and Interface Segregation

**What it does:**
- separates control into `LightControl`, `TemperatureControl`, and `SecurityControl`;
- implements the `SmartLight`, `SmartThermostat`, and `SmartCamera` devices;
- `SmartHomeHub` stores devices through their interfaces and performs group actions.

**What you learn:**
- applying ISP in a larger system;
- programming against interfaces instead of concrete implementations;
- using collections of interfaces;
- performing common actions on multiple devices.

**Run class:** `ex06.MovieRatingTest`

Note: the test class name is kept as it exists in the project skeleton.

### ex07 - Concert Notifications with a Generic Observer

**What it does:**
- `ConcertNotifier` is the subject that manages followers;
- `Follower` is the observer that receives notifications;
- `ConcertEvent` is sent directly through `update`, without a separate callback;
- followers can be attached and detached.

**What you learn:**
- a generic version of the Observer pattern;
- passing complex objects between a subject and its observers;
- the difference between direct data transfer and a separate callback;
- subscriber management.

**Run class:** `ex07.ConcertNotificationTest`

### ex08 - eSports Tournament and Ranking Strategies

**What it does:**
- `Team` defines the common contract and extends `Comparable<Team>`;
- `EsportsTeam` stores the team name and position and implements `compareTo()`;
- `Tournament<T extends Team>` registers compatible team types;
- `RankingStrategy<T extends Team>` defines a ranking algorithm;
- the test applies a strategy that sorts teams by position.

**What you learn:**
- generics with upper bounds such as `T extends Team`;
- how to use `Comparable` for sorting;
- the Strategy pattern: the algorithm is separated from the tournament data;
- how to change the ranking algorithm without modifying `Tournament`.

**Run class:** `ex08.EsportsTournamentTest`

### ex09 - Streaming Recommendation Engine

**What it does:**
- `Content` is the common contract for `Movie` and `Series`;
- `User` has a preferred genre;
- `RecommendationAlgorithm<T extends Content>` defines the recommendation algorithm;
- `GenreRecommendationAlgorithm` filters content by genre;
- `RecommendationEngine<T extends Content>` uses the injected algorithm;
- `StreamingService<T extends Content>` registers users and notifies only interested users when new content is added.

**What you learn:**
- composing multiple generics in a real project;
- Dependency Inversion by injecting the algorithm into the engine;
- the Strategy Pattern for recommendation algorithms;
- separation of responsibilities according to SOLID principles;
- content filtering and selective user notifications.

**Run class:** `ex09.SsreTest`

## Main Concepts Recap

- **Interfaces:** define contracts and reduce dependencies on concrete implementations.
- **Generics:** enable reusable code with compile-time type checking.
- **List, Set, Map:** data structures for different scenarios.
- **Comparable:** enables object comparison and sorting.
- **Observer:** notifies multiple objects when a change occurs.
- **Strategy:** allows changing an algorithm without modifying the main class.
- **SOLID:** helps create code that is extensible, testable, and maintainable.
