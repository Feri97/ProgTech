
### Az alkalmazás

Egy olyan gépjármű összerakó alkalmazás amelyel a Tesla weboldalán is találkozhatunk, ami használhatóságban, megjelenésben és funkcióit tekintve ennek, egy leegyszerűsített asztali alkalmazás változata lesz. Az alkalmazásban lehetőség lesz megválasztani az autó színét, felniméretet, ülésfűtést és egyébb extrákat hozzáadni 
ami segitségével a felhasználó igényeinek pontosan megfelelő kocsit rendelhet. Az alkalmazás első verziója nem rendelkezik majd grafikus felülettel, de amennyiben a munka megfelelő sebességgel halad grafikus kezelőfelület is lesz egy illusztrációval a gépjárműről.

### Tervezési minták
	- Decorator: Az egyes plusz felszereltségek díszítő osztályokkal kerülnének a járműre.
	- Factory: Az alap felszereltség mellett a Factory pattern-el előre összeállított extrákat lehetne választani.
	- Singleton: A megrendelésekről és tesztekről log bejegyzés készülne Singletonnal.
	- Observer: Observer tervezési minta felhasználásával működne az extrák hozzáadása ami csak a véglegesítéskor készítené össze a megrendelést. 

### Alapelvek
	- SRP: Egy felelősség.
	- OCP: Nyitott a bővítésre, zárt a módosításra.

### Tesztelés

- Unit teszt:
	- A unit tesztek a kiegészítő elemek osztályaira készülnek, melyekben az ezen osztályok által végzett feladat végrehajtása kerül tesztelésre. 
	- A factory-k álltal elkészített extra "csomagok" tesztelése.
	- Logger osztály tesztelése.

Amennyiben felderítenek egy hibát log bejegyzés készül róla Singleton osztállyal.
	