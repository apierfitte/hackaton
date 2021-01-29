# hackaton

Mise en place d'un rogue-like

## Début de l'aventure

Le héros démarre avec :

* 100 points de vie
* 0€
* une force de 10
* une armure de 1 (xavier est vétu uniquement de ses chaussettes)
* il n'a pas faim
* pas soif
* n'est pas empoisonné
* n'a pas de pouvoir
* ni d'arme

## Ordres de grandeurs

* armures : de 1 à 7
* armes : de 2 à 10
* PV : 50 à 100
* force : de 5 à 15

## Listes

### Liste des pouvoirs

0. Transit intestinal sain
1. Esprit serein

### Liste des armes

0. Répartie : dégâts = 6
1. Sens de la fête : dégâts = 7
2. Confiance en soi : dégâts = 8
3. Compassion : dégâts = 5
4. poings : dégâts = 2
5. appareil juridique : dégâts = 4
6. poireau : dégâts = 3

### Liste des enchantements

Ces sorts s'appliquent sur les objets

0. de mauvaise facture (pas très bien : baisse dégâts d'une arme ou baisse la protection d'une armure) : modificateur = -1
1. très coupant (cool pour les armes, moins pour les armures) : modificateur = +2

### Liste des armures

0. col roulé d'entrepreneur : armure = 3
1. pagne en feuilles de cocotier : armure = 5
2. chemise très chère : armure = 2
3. nu : armure = 1

### Liste des monstres

0. Le lobbyiste
	* vie : 75
	* force : 11
	* arme : appareil juridique
	* armure : chemise chère
1. L'écologiste poilu
	* vie : 80
	* force : 7
	* arme : poireau
	* armure : pagne en feuilles de cocotier
	
### Liste de la nourriture

0. **¨** : Antinourriture+faim 2
1. **T** tacos 69 : viandes-faim 7+soif 2
2. **J** : jonquilles-faim 1-soif 1
3. **f** conte de : fées nourriture ; intellectuelle-faim 5
4. **w** petit wrap des familles : faim-6 soif+1

### Liste des boissons

0. **o** eau : soif-2
1. **è** coca-cola : très sucré, soif+1
2. **&** bière de tradition allemande : soif-3 faim-1
3. **~** powerade goût ice storm : soif-4 faim+1

### Liste des potions

0. **V** potion de vie : par défaut, +10PV
1. **s** potion de poison : empoisonne
2. **F** potion de force : par défaut, +2 force (-2 de santé si force max)
