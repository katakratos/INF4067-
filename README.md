# INF4067-Design Pattern
Ce repository contient les codes sources des differents types de patrons de conception implémentés en JAVA. 
Il est organisé tel que nous avons un grand dossier "INF4067 Design_pattern " qui contient un sous dossier "Patron de creation" qui contient plusieurs sous dossier 
et chaque sous dossier contient le code source de l'implementation d'un patron spécifique.
Ces dossiers sont:
  • Abstract factory
  • Builder
  • Factory method
  • Singleton

   Le dossier Abstract factory contient le code source d'implementation le patron "Abstract Factory": un type de patron de conception.
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

 --> comment l'executer? Comment tester ce code?

  pour executer, lancer ce code, il y a deux methodes:

 - Premiere methode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns.git,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. étant donné que chaque dossier notamment (AbstractFactory0, AbstractFactory1) est codé de façon independante,
      donc dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

 - Deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(aAbstractFactory0, AbstractFactory1) dans le dossier src du projet java vous venez de creer,
 -  supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
 -  Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.


   Le dossier Builder contient le code source d'implementation le patron "Builder": un type de patron de conception.
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
      
-> comment l'executer? Comment tester ce code?

  pour executer, lancer ce code, il y a deux methodes:

 - Premiere methode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns.git,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. étant donné que chaque dossier notamment (Builder_0 ,Builder_1 et Builder_2) est codé de façon independante,
      donc dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

 - Deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(aAbstractFactory0, AbstractFactory1) dans le dossier src du projet java vous venez de creer,
 -  supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
 -  Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.

    
   Le dossier Factory method contient le code source d'implementation du patron "Factory": un type de patron de conception.
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

 -> comment l'executer? Comment tester ce code?

  pour executer, lancer ce code, il y a deux methodes:

 - Premiere methode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns.git,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. étant donné que chaque dossier notamment (Factory methode0, Factory methode1, Second Factory methode_0, Second Factory methhode_1) est codé de façon independante,
      donc dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

 - Deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(aAbstractFactory0, AbstractFactory1) dans le dossier src du projet java vous venez de creer,
 -  supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
 -  Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.

     
     
 Le dossier Singleton contient le code source d'implémentation le patron "Singleton": un type de patron de conception.
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

-> comment l'executer? Comment tester ce code?

  pour executer, lancer ce code, il y a deux methodes:

 - Premiere methode: d'abord cloner le projet et executant les commandes git init, ensuite git clone  https://github.com/katakratos/INF4067-Design-Patterns.git,dans votre terminal. 
      Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. 
      Si vous utiliser eclipse ou intellij, vous pourrez facilement éxécuter le code car ces éditeurs ont les configurations du langages java déja inclut, mais si vous utilisez visual studio code,
      il est nécessaire d'installer l'extension java. étant donné que chaque dossier notamment (Arithmetic, Singleton_0) est codé de façon independante,
      donc dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question 
      et la partie du patron concerné sera lancé.

 - Deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(aAbstractFactory0, AbstractFactory1) dans le dossier src du projet java vous venez de creer,
 -  supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer.
 -  Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé.

     
    
          
    
