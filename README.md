# Konzeption und Implementierung einer webbasierten Abstimmungsplattform mit Fokus auf Gamifizierung in der Lehre

## Projekt lokal installieren
### 1. Hinweis

Die folgende Applikation ist im Moment noch nicht betriebsfähig, das Konzept und die Designentscheidungen finden sich in der Bachelorarbeit wieder. Hier wurde lediglich die Grundstruktur angerissen.



### 2. Umgebung
Benötigt werden:

1. MySQL-Server + MySQL-Workbench(siehe http://dev.mysql.com/downloads/)
2. Eine IDE mit Maven-Support (Intellij, Netbeans, Eclipse)



### 3. Startanleitung

1. Beide Umgebungen installieren
2. MySQL-Workbench und Server starten und verbinden.
3. MySQL-Schema mit dem namen "arsdb" oder folgenden Befehl erstellen
  <pre><code>CREATE SCHEMA `arsdb` ;</code></pre>
4. Projekt von der Githubseite https://github.com/ly000/ars-webapp pullen
5. In der Datei "src/main/resources/application.properties" Konfigurationen an das eigene System anpassen:
  <pre><code>server.port = 7070</code></pre> auf einen freien Port setzen, der später die Seite über localhost:[server.port] aufrufen lässt.
  <pre><code>spring.datasource.url = jdbc:mysql://localhost:3306/arsdb </code></pre> auf die URL der Datenbank setzen.
  <pre><code>spring.datasource.username = root</code></pre> Datenbank-Username setzen.
  <pre><code>spring.datasource.password = test123</code></pre> Datenbank-Passwort setzen.
6. Projekt in der IDE öffnen und die Maven-Dependencies und Sources updaten.
7. Projekt in der IDE starten (ARSSpringAppApplication)
8. Über <pre><code>http://localhost:port</code></pre> (wobei port der in Schritt 5 gesetzte Wert entspricht) die Seite aufrufen.
9. Username: admin Passwort: admin



