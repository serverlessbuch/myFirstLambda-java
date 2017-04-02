# myFirstLambda-java

Eine erste AWS Lambda Funktion - für Java Umgebungen.

Das Projekt mit der Handler-Funktionsklasse `de.serverlessbuch.lambda.MyFirstLambda` muss zunächst mit `mvn clean package` kompiliert und paketiert werden, bevor die Jar-Datei `myFirstLambda.jar` zu AWS Lambda hochgeladen werden kann.

Es existiert auch ein (minimaler, nur zur Veranschaulichung vorhandener) JUnit-Test unter `de.serverlessbuch.lambda.MyFirstLambdaTest`.

Die Funktion kann letztendlich mit dem Test-Event in `event.json` aufgerufen werden.
