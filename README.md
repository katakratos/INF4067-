# INF4067-Design Pattern
Ce repository contient les codes sources des differents types de patrons de conception implémentés en JAVA. 
Il est organisé tel que nous avons un grand dossier "INF4067 Design_pattern " qui contient un sous dossier "Patron de creation" qui contient plusieurs sous dossier 
et chaque sous dossier contient le code source de l'implementation d'un patron spécifique.
Ces dossiers sont:
   • Abstract factory
   • Builder
   • Factory method
   • Singleton
Aussi un sous dossier "Patron de structuration" qui contient plusieurs sous dossier et chaque sous dossier contient le code source de l'implementation d'un patron spécifique. Ces dossiers sont: 
   • ADAPTER 
   • BRIDGE 
   • Composite 
   • Decorateur  

*********************  Premièrement nous parlerons du dossier "Patron de creation"  ********************

   Le dossier Abstract factory contient le code source d'implementation le patron "Abstract Factory": un type de patron de construction.
	   Ce dossier comporte 02 dossiers intitulés:
		    • AbstractFactory0
		    • AbstractFactory1
		  AbstractFactory permet de créer des objets regroupés en famille sans avoir à connaitre leurs classes concrétes.
      Permet de forunir une interface unique pour instancier des objets d'une même famille sans avoir à connaitre les classes à instancier.
    °Participants du patron Abstractfactory:
           FrabriqueAbstraite : interface spécifiant les signatures des méthodes
            créant les différents objets
           FrabriqueConcrete (1 et 2) : classes implémentant les méthodes de
            création d’objets. Connaissent les familles et les produits, capable de
            créer une instance d’un produit pour une famille.
           Produit (A et B) : interfaces (ou classes abstraites) des produits
            indépendamment de leur famille.
           Produit (Ax et Bx) : introduisent les familles de produits
           Client : le classe(programme) qui fait appel à la fabrique pour lui
            fournir des objets de type Produit
      **Enoncé du problème: On gère deux types de produits. Dans chaque type, les produits
          sont regroupés par catégorie. Mais le programme qui se charge de manipuler
          ces produits ne connait que les types de produits, et c’est à l’exécution que la
          catégorie du produit est déterminée.
      • AbstractFactory0 contient le dossier source de l'implementation du patron AbstractFactory qui utilise une fabrique abstraite et
        une fabrique concréte pour chaque famille d'objets(nous avons la famille de produits A:categorisé en  produits A1 et A2 
        et la famille de produit B: categorisé en produit B1 et B2, une fabrique abstraite IProduitFactory et ses fabriques filles 
        produitFactory1(construit les produits A1 et B1) et ProduitFactory2(construit les produits A2 et B2),et une classe 
        Client(main()) qui éxécute le programme.)
			  • AbstractFactory1 contient le dossier source de l'implementation du patron AbstractFactory qui utilise une fabrique abstraite et
        une fabrique concréte pour chaque famille d'objets(nous avons la famille de produits A:categorisé en  produits A1 et A2, 
        la famille de produit B: categorisé en produit B1 et B2 et une famille de produit C : categorisé en produit C1 et C2, 
        une fabrique abstraite IProduitFactory et ses fabriques filles produitFactory1(construit les produits A1, B1,C2), 
        ProduitFactory2(construit les produits A2, B2, C2) et une classe 
        Client(main()) qui éxécute le programme.).

 --> comment éxécuter ou tester ce code?

  pour executer ou lancer ce code, il y a deux methodes:

 - Premiere méthode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns.git,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. étant donné que chaque dossier notamment (AbstractFactory0, AbstractFactory1) est codé de façon independante,
      donc dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

 - Deuxieme méthode: creer un projet java, copier le dossier du patron que vous souhaitez executer(aAbstractFactory0, AbstractFactory1) dans le dossier src du projet java vous venez de creer,
 -  supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
 -  Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.


   Le dossier Builder contient le code source d'implementation le patron "Builder": un type de patron de construction.
	   Ce dossier comporte 03 dossiers intitulés:
		    • Builder_0
		    • Builder_1
                    • Builder_2
    • Créer des objets complexes à partir d’autres objets sources.
    • Ces parties (objets sources) doivent (généralement) être créées
    suivant un ordre ou un algorithme spécifique.
    • Concrètement, assembler plusieurs objets pour les « monter » et
    n’en faire qu’un.
    • Son but est donc d’encapsuler la construction d’objets complexes de
    sorte qu’un client puisse créer ces objets sans se préoccuper des
    différents étapes nécessaires.
    • Chaque objet source peut servir à construire une partie de l’objet
    complexe( objet cible).
  ° Participants du patron Builder :
      MonteurAbstrait : précise une classe abstraite (ou une interface)
        pour la création de partie d’un objet Produit.
      MonteurConcret : construit et assemble des parties du produit
        par implémentation des méthodes du MonteurAbstrait.
      Directeur : construit un objet en utilisant l’interface du Monteur.
      Produit : représente l’objet complexe en cours de construction.
    ** Enoncé du problème :
       On souhaite fabriquer des pizza. On a 2 types de pizza : la pizza
        reine et le pizza piquante,
        Pour fabriquer une pizza : on prépare la pate, on prépare et ajoute
        une sauce et on prépare et ajoute une garniture.
        – pour la pizza reine, on utilise : pate = « croisée », sauce =
        « douce » et garniture = « jambon et champignon »
        – pour la pizza piquante, on utilise : pate = « feuilletée », sauce =
        « piquante » et garniture = « pepperoni + salami »
        On veut utiliser le design pattern Builder pour faciliter la fabrication
        des pizza.
    • Builder_0 contient le code source de l'implémentation du patron Builder qui encapsuler la construction d’objets complexes de
      sorte qu’un client puisse créer ces objets sans se préoccuper des
      différents étapes nécessaires( nous avons une classe pizza qui représente l'objet complexe en cours de construction, 
      la classe Directeur  qui construit un objet en utilisant l'interface du Monteur,les deux MontConcret : 
      MonteurPizzaPiquante et MonteurPizzaReine qui construisent et assemble les parties du produit,une classe abstraite
      MonteurPizza pour la création de partie d'un objet produit et la classe Client qui éxécute le programme.)
		• Builder_1 contient le code source de l'implémentation du patron Builder qui encapsuler la construction d’objets complexes de
      sorte qu’un client puisse créer ces objets sans se préoccuper des
      différents étapes nécessaires( nous avons la même implementation du patron Builder que dans le dossier Builder_0 à la seule differrence 
      que les deux MonteurConcret MonteurPizzaPiquante et MonteurPizzaReine implemententent la méthode getPizza  et elle devient abstrait dans la classe MonteurPizza.).
    • Builder_2 contient le code source de l'implémentation du patron Builder qui encapsuler la construction d’objets complexes de
      sorte qu’un client puisse créer ces objets sans se préoccuper des
      différents étapes nécessaires( nous avons une classe pizza qui représente l'objet complexe en cours de construction, 
      la classe Directeur  qui construit un objet en utilisant l'interface du Monteur,les deux MontConcrets : 
      MonteurPizzaPiquante, MonteurPizzaReine et le MonteurPizzaLocal qui construisent et assemblent les parties du produit, une classe abstraite
      MonteurPizza pour la création de partie d'un objet produit et une classe Client pour éxécuter le programme).
      
-> comment éxécuter ou tester ce code?

  pour éxécuter ou lancer ce code, il y a deux methodes:

 - Premiere méthode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns.git,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. étant donné que chaque dossier notamment (Builder_0 ,Builder_1 et Builder_2) est codé de façon independante,
      donc dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

 - Deuxieme méthode: creer un projet java, copier le dossier du patron que vous souhaitez executer(aAbstractFactory0, AbstractFactory1) dans le dossier src du projet java vous venez de creer,
 -  supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
 -  Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.

    
   Le dossier Factory méthod contient le code source d'implementation du patron "Factory": un type de patron de construction.
	   Ce dossier comporte 04 dossiers intitulés:
		    • Factory methode0
		    • Factory methode1
		    • Second Factory methode_0
                    • Second Factory methhode_1
      Factory Method permet de créer un objet dont le type dépend du contexte.
       Cet objet fait partie d’un ensemble de sous classe.
       L’objet retourné est toujours du type de la classe mère. 
       L’utilisation d’une fabrique permet de rendre l’instanciation d’objets
        plus flexible qu’avec l’opérateur new.
        --> La fabrique peut s’implémenter de 2 manières :
			        • Déclarer une fabrique avec une méthode de création de l’objet qui
			        attend les données nécessaires pour déterminer le type de l’objet à
			        créer.
			        • Déclarer la fabrique abstraite et laisser ses sous classe créer les objets.
				-Première implémentation de Factory Méthod :
			       • Déclarer une fabrique avec une méthode de création de l’objet qui
				        attend les données nécessaires pour déterminer le type de l’objet à
				        créer.
				  ° Participants du patron Factory :
	           Frabrique : la classe qui définit la méthode de création d’objets
	           Produit : la classe abstraite dont les sous –classes seront instanciées
	           ProduitConcret : les sous classes concrètes à instancier
	           Client : la classe(main()) qui fait appel à la fabrique pour lui
	            fournir des objets de type Produit.
				 **Enoncé du problème: On gère deux types de produits dans un système. Mais le
		      programme qui se charge de manipuler ces produits ne connait le type de
		      produit à exécuter que lors de l’exécution. 
				  • Factory methode0 qui contient le dossier du code source de l'implemenationt du patron Factory qui utilise une fabrique avec une méthode de création d'objet, plus precisement 
					    (nous avons deux produits A1 et A2 qui herite du produit A, une  classe fabrique "ProduitFactory"  et une classe Client(main()) tel que 
					    dans le cours.).  
				  • Factory methode1 qui contient le dossier du code source de l'implemenation du patron Factory qui utilise une fabrique avec une méthode de création d'objet, C'est le même procédé que la méthode factory ci-dessus
					  à la seule différence qu'on a ajouter un troixième produit A3, donc on a toujours une classe fabrique,la classe Client(main()) qui exécute le programme. 
       
 -Deuxième implémentation de Factory Méthod :
       • Déclarer la fabrique abstraite et laisser ses sous classes créer les objets.
	   ° Participants du patron Factory:
		        FrabriqueAbstraite : Classe abstraite qui abrite la signature de la méthode de
						fabrique et l’implémentation des méthodes qui invoquent cette méthode de
						fabrique.
						 FabriqueConcrete : Classe concrète qui implémente la méthode fabrique. On
						peut avoir plusieurs fabriques concrètes.
						 Produit : la classe abstraite dont les sous classes seront instanciées
						 ProduitConcret : les sous classes concrètes à instancier
						 Client : le classe(programme) qui fait appel à la fabrique pour lui fournir des
						objets de type Produit.  
			     **Enoncé du problème:  On gère deux types de produits dans un système. Mais le
							programme qui se charge de manipuler ces produits ne connait le type de
							produit à exécuter que lors de l’exécution. On souhaite utiliser cette fois le
							pattern Factory pour gérer cette situation.				
            • Second Factory methode_0 qui contient  le dossier du code source de l'implementation du patron Factory qui utitlise une fabrique Abstraite qui abitre la signature de la méthode de fabrique et 
					      l'implementation des méthodes qui invoquent cette méthode de fabrique ( nous avons deux produits A1 et A2 qui herite du produit A et chaque produit à sa fabrique concrète ProduitFactory1 pour le produit A1 
					      et ProduitFactory2 pour le produit A2 qui hérite de la class asbtraite ProduitFactory et une classe Client(main()) qui éxécute le programme.)
           • Second Factory methhode_1 qui contient  le dossier du code source de l'implementation du patron Factory qui utitlise une fabrique Abstraite qui abitre la signature de la méthode de fabrique et 
					      l'implementation des méthodes qui invoquent cette méthode de fabrique ( nous avons troix produits A1, A2 et A3 qui herite du produit A et chaque produit à sa fabrique concrète: ProduitFactory1 pour le produit A1, 
					       ProduitFactory2 pour le produit A2 et ProduitFactory3 pour le produit A3 qui hérite de la class asbtraite ProduitFactory et une classe Client(main()) qui éxécute le programme.).

 -> comment éxécuter ou  tester ce code?

  pour éxécuter ou lancer ce code, nous verrons deux méthodes:

 - Premiere méthode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns.git,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. étant donné que chaque dossier notamment (Factory methode0, Factory methode1, Second Factory methode_0, Second Factory methhode_1) est codé de façon independante,
      donc dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

 - Deuxieme méthode: creer un projet java, copier le dossier du patron que vous souhaitez executer(aAbstractFactory0, AbstractFactory1) dans le dossier src du projet java vous venez de creer,
 -  supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
 -  Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.

     
     
 Le dossier Singleton contient le code source d'implémentation le patron "Singleton": un type de patron de construction.
	   Ce dossier comporte 02 dossiers intitulés:
		    • Arithmetic
		    • Singleton_0
    • L’objectif du pattern SINGLETON est de garantir qu’une classe ne
    possède qu’une seule instance et de fournir un point d’accès global à
    celle-ci.
    • Fourni une méthode de classe unique retournant cette unique instance.
    • Restreint l'instanciation d'une classe à un seul point.
    • Est utilisé lorsque l'on a besoin d'exactement un objet pour coordonner
    des opérations dans un système.
    • L’instance ne doit être accessible qu’au travers d’une méthode de
    classe.
    • On l’implémente en écrivant une classe contenant une méthode qui
    crée une instance uniquement s'il n'en existe pas encore. Sinon elle
    renvoie une référence vers l'objet qui existe déjà.
    • Il faudra veiller à ce que le constructeur de la classe soit privé, afin de
    s'assurer que la classe ne puisse être instanciée autrement que par la
    méthode de création contrôlée.
  °Participants du patron Singleton
    Un seul participant : la classe singleton
         Ses propriétés :
        • Le ou les constructeurs sont privés. Redéfinir le constructeur par
        défaut, si aucun n’est explicitement défini.
        • Une attribut de classe : pour stocker l’unique instance en cours
        • Un getter static et public : pour renvoyer l’instance et la créer au
        besoin.
    • Arithmetic contient le code source de l'implémentation du patron Singleton qui utilise une classe contenant une méthode qui créé
    une instance uniquement s'il n'en existe pas encore sinon elle renvoie une référence vers l'objet qui existe déja
    (l'unique instance de classe contient 03 constructeurs: l'un qui ne prend rien en parametre, l'autre qui prend deux paramètre x et y et
    le troixième qui prend 03 paramètres x,y et nom, également implémente les méthodes somme, soustrction, multiplication et moyenne 
    et aussi affiche les valeurs de l'instance).
		• Singleton_0 contient le code source de l'implémentation du patron Singleton qui utilise une classe contenant une méthode qui créé
    une instance uniquement s'il n'en existe pas encore sinon elle renvoie une référence vers l'objet qui existe déja
    (l'unique instance de classe contient 02 constructeurs: l'un qui ne prend rien en paramètre et l'autre qui prend deux paramètre x et y, également implémente
    les méthodes somme et moyenne et affiche les valeurs de l'instance).

-> comment éxécuter ou Comment tester ce code?

  pour éxécuter ou lancer ce code, il y a deux méthodes:

 - Premiere méthode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns.git,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. étant donné que chaque dossier notamment (Arithmetic, Singleton_0) est codé de façon independante,
      donc dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

 - Deuxieme méthode: creer un projet java, copier le dossier du patron que vous souhaitez executer(aAbstractFactory0, AbstractFactory1) dans le dossier src du projet java vous venez de creer,
 -  supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
 -  Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.

******************** Deuxièment nous parlerons du dossier "Patron de structuration"  ********************

	  L'objectif du patron de structuration permet de faciliter l’organisation de la hiérarchie des classes et des objets.
            Dans le cas d’un ensemble d’objets, il est aussi question de rendre
cette interface indépendante de la hiérarchie des classes et de la
composition des objets.
             L’objectif est de faciliter l’indépendance de l’interface d’un objet ou
d’un ensemble d’objets vis-à-vis de son implémentation.
             Ils encapsulent la composition des objets, augmentant le niveau
d’abstraction du système, à l’image des patterns de construction ou
création qui encapsulent la création des objets.

    Le dossier ADAPTER contient le code source d'implémentation le patron "Adapter": un type de patron de structuration.
	   Ce dossier comporte 03 dossiers intitulés:
		    • Adapter
		    • Carré_Adapter
                    • Dlist_Adapter 
      Son but est de convertir l’interface d’une classe existante en un
autre attendue par le client également existants afin qu’ils
puissent travailler ensemble.
      Il s’agit de confier à une classe existante une nouvelle interface
pour répondre aux besoins de clients.
      Permettre la collaboration d’instances dont les classes ont des
interfaces incompatibles.
     °Participants du Patron Adapter:
         Interface : introduit la signature des méthodes de l’objet
         Client : programme ou classe qui interagit avec les objets répondant à interface
         Adaptateur : implémente les méthodes de Interface en invoquant les méthodes de l’objet adapte
         Adapte : l’objet dont l’interface doit être adaptée pour correspondre a Interface.
     **Enoncé du prolème : On considère un système de vente des véhicules en ligne. Le serveur web de
ce système crée et gère des documents destinés aux clients (facture, bon de
livraison, etc…). Dans un premier temps, l’entreprise ne veut générer que des
documents HTML directement imprimable. Pour ce faire les développeurs de
ce système ont créé lors de l’implémentation du système, une classe
Document qui crée et gère donc les document HTML.
On décide maintenant de générer des documents PDF, et pour cela, les
développeurs ont trouvé un composant logiciel qui le fait et ne voudraient pas
recoder. Proposer une solution pour l’utilisation de ce composant à l’aide du pattern Adapter.
      • Le dossier Adapter contient le dossier source de l'implementation du patron Addapter, nous avons une classe Serveur web qui sait créer et gérer les documents Html,l'interface Document qui introduit les méthode du document, une classe document Html qui implémente l'interface, nous avons également,un composant Pdf déjà existant et que le serveur web doit également crére et gérer,  sans modifier son code du serveur web ni celui du composant. Ainsi, on a créer un Document PDF qui impémente les méthodes de l'interface en faisant appel aux méthodes du composant PDF et enfin on a une classe Client, (le main) qui fait le test en utitlisant les différentes implémentations du document.   

       • Le dossier Carré_Adapter contient le dossier source de l'implementation du patron Addapter, nous avons une classe Programme qui gére les Carrés,l'interface ICarré qui introduit les méthode du Carré, une classe Carré qui implémente l'interface, nous avons également,une classe Rectangle déjà existant et que le programme  doit également gérer,  sans modifier le code du programme ni celui de Rectangle. Ainsi, on a créer une classe AdaptRectangle qui impémente les méthodes de l'interface en faisant appel aux méthodes de Rectangle et enfin on a une classe Client, (le main) qui fait le test en utitlisant les différentes implémentations de ICarré.   

       • Le dossier DList_Adapter contient le dossier source de l'implementation du patron Addapter, nous avons une classe Gestion qui manipule les piles,l'interface Stack qui introduit les méthode de la pile, une classe StackImpl qui implémente l'interface, nous avons également,une classe DList déjà existant et que Gestion  doit également manipuler,  sans modifier son code Gestion ni celui de DList. Ainsi, on a créer une classe DListImplStack qui impémente les méthodes de l'interface en faisant appel aux méthodes de DList et enfin on a une classe Client, (le main) qui fait le test en utitlisant les différentes implémentations de Stack.   
       
      
     -> comment éxécuter ou Comment tester ce code?

  pour éxécuter ou lancer ce code, il y a deux méthodes:

       - Premiere méthode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. Etant donné que chaque dossier notamment (Adapter, Carré_Adapter, Dlist_Adapter) est codé de façon independante,
      donc dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

      - Deuxieme méthode: créer un projet java, copier le dossier du patron que vous souhaitez éxecuter(Adapter, Carré_Adapter, Dlist_Adapter) dans le dossier src du projet java vous venez de créer,
       supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
       Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.

 Le dossier BRIDGE contient le code source d'implémentation le patron "Bridge": un type de patron de structuration.
	   Ce dossier comporte 03 dossiers intitulés:
		    • Bridge
		    • Bridge_1
                    • Bridge_2 
        Il permet de découpler l’interface d’une classe et son implémentation.
       Ceci permet à l’interface et l’implémentation de varier séparément.
           °Participants du Patron Bridge :
	      Abstraction : définit l’interface de l’abstraction; gère une référence à un objet de type implémentation.
              RefineAbstration : enrichit l’interface définie par l’abstraction pour constituer une classe concrète
              Implementor : définit l’interface commune pour toutes les implémentations concrètes. En général elle définit des opérations primitives
              ConcreteImplementor : réalise concrètement l’implémentation de l’interface.
              bridge : lien d’association qui fait le pont entre l’abstraction et l’implémentation.
	   **Enoncer du problème : On veut gérer des formes géométriques. On a des Rectangles et des cercles pouvant être de couleur rouge ou bleu. La solution avec le patron Pont est la suivante :
        • Le dossier Bridge contient le dossier source de l'implementation du patron Bridge, nous avons la classe abstraite Shape qui définit les méthodes  des classes à implémenter, les deux classes qui héritent de la classe abstraite Rectangle et Circle qui décrivent comment les méthodes seront implémentées, nous avouns l'interface Color, les deux classes concrétent RedColor et BlueColor qui l'implémentent Color, la classe BridgeDesignPatternMain( qui lien entre la classe abstraite et l'inteface ) qui contient le main et teste le programme. 
         • Le dossier Bridge_1 contient le dossier source de l'implementation du patron Bridge, nous avons la classe abstraite Shape qui définit les méthodes  des classes à implémenter, les deux classes qui héritent de la classe abstraite Rectangle et Circle qui décrivent comment les méthodes seront implémentées, nous avouns l'interface Color, les trois classes concrétent RedColor,BlueColor,PurpleColor qui l'implémentent Color, la classe BridgeDesignPatternMain( qui lien entre la classe abstraite et l'inteface ) qui contient le main et teste le programme. 
	  • Le dossier Bridge_2 contient le dossier source de l'implementation du patron Bridge, nous avons la classe abstraite Shape qui définit les méthodes  des classes à implémenter, les trois classes qui héritent de la classe abstraite Rectangle, Circle, Triangle qui décrivent comment les méthodes seront implémentées, nous avouns l'interface Color, les trois classes concrétent RedColor,BlueColor,PurpleColor qui l'implémentent Color, la classe BridgeDesignPatternMain( qui lien entre la classe abstraite et l'inteface ) qui contient le main et teste le programme. 
	 

  -> comment éxécuter ou Comment tester ce code?

  pour éxécuter ou lancer ce code, il y a deux méthodes:

       - Premiere méthode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. Etant donné que chaque dossier notamment (Bridge, Bridge_1, Bridge_2) est codé de façon independante,
      donc dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

      - Deuxieme méthode: créer un projet java, copier le dossier du patron que vous souhaitez éxecuter(Bridge, Bridge_1, Bridge_2) dans le dossier src du projet java vous venez de créer,
       supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
       Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.


Le dossier Composite contient le code source d'implémentation le patron "Composite": un type de patron de structuration.
	  Ce dossier comporte 01 dossier intitulé:
		    • Composite
    Il permet de combiner des objets en structures plus grandes.
    Il décrit une façon de traiter de la même manière les objets simples et les objets composites .
    Composer des objets dans des structures arborescentes pour représenter des hiérarchies composants/composés
    Permet au client de manipuler uniformément les objets simples et les objets au sein de leurs compositions
         °Participants du Patron Composite:
	       Component
                    – déclare l’interface commune à tous les objets
                    – déclare le comportement par défaut pour toutes les classes
                Leaf : représente une feuille
                    – Implémente le comportement élémentaire
                 Composite : définit le comportement des composants ayant des fils, stocke les fils et implémente les opérations nécessaires à leur gestion.
                 Client : utilise l’interface component
                     – Si le receveur est une feuille la requête est directement traitée
                     – Sinon le composite retransmet la requête à ses fils.
	 **Enoncé du problème : On considère un système de gestion de fichiers. Ce système gère des
dossiers(répertoires) et chaque répertoire peut contenir des sous répertoires (pouvant eux aussi contenir des  sous répertoires) et des fichiers. Le système ne connait que 2 types de fichiers : les fichiers TXT et les fichiers PDF.
        Chaque élément du système de fichier est caractérisé par :
             - Deux attributs : nom et type (txt, pdf, ou dossier)
             - Des méthodes :
             - decrire : affiche le nom et le type de l’élément. Un dossier affiche en plus, la description de tous les éléments qu’il contient.
             - ajouter un élément à un autre
             - supprimer un élément d’un autre
             - obtenir le ieme élément d’un autre
	Proposer une modélisation du problème  à l’aide du pattern Composite.
        • Le dossier Composite contient le dossier source de l'implementation du patron Composite, nous avons deux classes FichierPdf et FichierTxt qui sont des éléments élementaires ( des feuilles), une classe élement qui déclare le comportement par default de toutes les classes, la classe Dossier qui définit le comportement des dossiers ayant des fils et la classe Client qui contient le main (ou on a créer les fichiers et les dossiers ) pour  tester le programme. 

 -> comment éxécuter ou Comment tester ce code?

  pour éxécuter ou lancer ce code, il y a deux méthodes:

       - Premiere méthode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. 
      donc dans le dossier "code"  du  dossier il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

      - Deuxieme méthode: créer un projet java, copier le dossier du patron que vous souhaitez éxecuter dans le dossier src du projet java vous venez de créer,
       supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
       Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.

    Le dossier Decorateur contient le code source d'implémentation le patron "Decorateur": un type de patron de structuration.
	  Ce dossier comporte 01 dossier intitulé:
		    • Decorateur
         Attacher dynamiquement des fonctionnalités supplémentaires à un objet.
         L’ajout se fait dynamiquement à l’exécution
         Cet ajout de fonctionnalités ne modifie pas l’interface de l’objet
         L’ajout reste transparent vis-à-vis des clients.
         il offre une alternative assez souple à l’héritage pour composer de nouvelles fonctionnalités.
     °Participants du Patron Decorateur:
          ComposantAbstrait : déclare l’interface commune pour les décorateurs et les objets décorés.
          ComposantConcret : la classe qui définit les objets initiaux auxquels de nouvelles fonctionnalités doivent être ajoutées.
           Decorateur: classe abstraite ayant une référence vers un composant
           DecorateurConcretA et DecorateurConcretB : définissent des comportement supplémentaires pouvant être
ajoutés dynamiquement aux composants.
           Client: utilise le décorateur pour l’ajout dynamique des fonctionnalités.
     **Enoncé du problème : On considère un système disposant des fenêtres simples affichant du texte dans une zone bien définit. Quand le texte à afficher dépasse la zone d’affichage prévue, une partie du texte n’est pas visible. On souhaite donner la possibilité à ces fenêtres de pouvoir défiler verticalement ou horizontalement.
    	Proposer une modélisation du problème  à l’aide du pattern Composite.
     • Le dossier Decorateur contient le dossier source de l'implémentation du patron Decorateur, nous avons la classe Fenetre qui est abstraite et definit l'nterface commune pour la classe DecorateurFenetre ( déclare l'interface commune pour les décorateurs) et FenetreSimple ( définit l'objet initiaux auxquelles de nouveaux Decorateus vont être ajoutés), les classes DecorateurCurseurVertical ( qui ajoute un curseur vertical) et DecorateurCurseurHorizontal ( qui ajoute un curseur Horizontal) et la classe Client qui utlise DecorateurFenetre pour ajouter dynamiquement des fonctionnalités à la classe FenetreSimple.

     -> comment éxécuter ou Comment tester ce code?

  pour éxécuter ou lancer ce code, il y a deux méthodes:

       - Premiere méthode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. 
      donc dans le dossier "code"  du  dossier il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

      - Deuxieme méthode: créer un projet java, copier le dossier du patron que vous souhaitez éxecuter dans le dossier src du projet java vous venez de créer,
       supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
       Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.
