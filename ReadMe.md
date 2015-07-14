#exercice

## exercice 1

a- il manque les supers

b- constructeur baseD, ag = null


#Cours

##5 - les classes internes

particularité :

classe que l'on construit dans d'autres classe

4 types de classes :

- classe membre
- membres statiques
- locales
- anonymes

la plus utilisée est la classe anonymes.

###Syntaxe
[M]class X {
  
  }

##Les classes locales
les classes locales sont des classes dans des fonctions.

##les classes anonymes
les classes anonymes sont des classes sans noms. Elle ne peuvent servir qu'a fabriquer qu'un seul objet
Elle ne peuvent se creer qu'a partir d'un héritage. Elle ne sont fabriqué qu'au moment de la location de l'objet que nous souhaitons exploiter

### syntaxe

Base objet = new Base (){
    //fonctions
    //membres
};

a connaitre :
arrayList
LinkedList
HashSet
TreeSet
PriorityQueue

ca fait partie d'une collection dans les grandes collections List, Set, Queue
Map -> HashMap, TreeMap

