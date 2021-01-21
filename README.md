# JPA-Intro-Lab
Labuppgift JPA – kursen Utveckling mot databas och databasadministration Javautvecklare 2020


### Syfte
Labuppgiften avser att skapa förståelse för JPA-arkitekturen på grundläggande nivå

### Mål
Att skapa en DAO/repository implementerad med JPA för en enkel Java-klass.

### Implementering
- persistance.xml: Global configuration
- User.java: Java @Entity-klass (för enkelt databastabell utan relationer)
- UserDao.java: DAO-interface för @Entity-klassen User.java
- UserDaoWithJPAImpl.java: implementation av interface i klassen User
- TestMain.java: main-metod som kollar att det alls funkar
- Main.java:
