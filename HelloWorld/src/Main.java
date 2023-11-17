import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //types numériques entiers
        int in = 1000;
        byte bt = 14;
        short sh = 123;
        long lg = 123762883;

        //types décimaux
        float fl = 2.5f;
        double db = 2.5;


        //Afficher les variables
        System.out.println("La valeur de la variable in est :" + in);
        System.out.println("La valeur de la variable bt est :" + bt);
        System.out.println("La valeur de la variable sh est :" + sh);
        System.out.println("La valeur de la variable lg est :" + lg);
        System.out.println("La valeur de la variable fl est :" + fl);
        System.out.println("La valeur de la variable db est :" + db);

        //Déclaration d'une variable
        int nbr;
        double tax;
        String prenom;

        //Utilisation des variables
        nbr = 6;
        tax = 2.5;
        prenom = "Rudy";

        //Afficher la variable
        System.out.println("le nombre est : " + nbr + ", le tax est : " + tax + ", le prénom est : " + prenom);


        //*******************************************************************//
        //Private --> accès au sein de la clase
        //private int nombre;

        //protected --> utilisable dans la classe où la variable est définie
        //protected float taux;

        //public --> accessible partout
        //public double niveau;

        //static --> associé à un des mots clés précédents
        //transformation en variable de classe
        //public static String transformation;


        //*******************************************************************////
        // déclaration de variable
        double distance;
        int conversion;

        //affection de valeur à la valeur distance
        distance = 2435.89;

        //conversion d'un type double vers un type int
        conversion = (int) distance;

        //afficher la valeur
        System.out.println("Afficher la valeur de la variable conversion : " + conversion);

        //initialisation et déclaration de la constante
        final double TAUXTVA = 1.196;

        //Déclaration et initialisation des autres variables
        int prixHT = 10;
        double prixTTC;

        //Utilisation de la constante
        prixTTC = prixHT * TAUXTVA;

        //Affichage du résultat dans la console
        System.out.println("Le prix TTC est : " + prixTTC);


        //*******************ENUMERATION************************//
        // Déclaration de l'énumération
        enum Mois {JANVIER, FEVRIER, MARS, AVRIL, MAI, JUIN, JUILLET, AOUT, SEPTEMBRE, OCTOBRE, NOVEMBRE, DECEMBRE}

        //Afficher le mois de Janvier
        Mois janvier = Mois.JANVIER;
        System.out.println("le premier mois de l'année est : " + janvier);


        //**********************TABLEAU**********************//
        //Déclaration d'une variable de type trableau d'entiers
        int[] chiffreAffaire;

        //Création du tableau et taille du tableau
        chiffreAffaire = new int[12];

        //Initialisation du tableau
        chiffreAffaire[0] = 1234;
        chiffreAffaire[1] = 5633;
        chiffreAffaire[2] = 657;
        chiffreAffaire[3] = 453;
        chiffreAffaire[4] = 986;
        chiffreAffaire[5] = 678;
        chiffreAffaire[6] = 564;
        chiffreAffaire[7] = 234;
        chiffreAffaire[8] = 786;
        chiffreAffaire[9] = 123;
        chiffreAffaire[10] = 534;
        chiffreAffaire[11] = 975;

        //affichage d'un élément du tableau
        System.out.println("l'élément à l'index 0 est : "+chiffreAffaire[0]);
        System.out.println("l'élément à l'index 1 est : "+chiffreAffaire[1]);
        System.out.println("l'élément à l'index 2 est : "+chiffreAffaire[2]);
        System.out.println("l'élément à l'index 3 est : "+chiffreAffaire[3]);
        System.out.println("l'élément à l'index 4 est : "+chiffreAffaire[4]);
        System.out.println("l'élément à l'index 5 est : "+chiffreAffaire[5]);
        System.out.println("l'élément à l'index 6 est : "+chiffreAffaire[6]);
        System.out.println("l'élément à l'index 7 est : "+chiffreAffaire[7]);
        System.out.println("l'élément à l'index 8 est : "+chiffreAffaire[8]);
        System.out.println("l'élément à l'index 9 est : "+chiffreAffaire[9]);
        System.out.println("l'élément à l'index 10 est : "+chiffreAffaire[10]);
        System.out.println("l'élément à l'index 11 est : "+chiffreAffaire[11]);


        //*******TABLEAU A PLUSIEURS DIMENSIONS**********************//
        //Déclaration du tableau à plusieurs dimensions
        int[][] monTableau;

        //Création du tableau à plusieurs dimensions
        monTableau = new int[3][2];

        //Initialisation du premier élément
        monTableau[0][0] = 231;

        //Initialisation des éléments suivant
        monTableau[0][1] = 232;
        monTableau[1][0] = 233;
        monTableau[1][1] = 234;
        monTableau[2][0] = 235;
        monTableau[2][1] = 236;

        //Affichage des éléments du tableau
        System.out.println("L'élément à l'index [0][0] est : "+monTableau[0][0]);
        System.out.println("L'élément à l'index [0][1] est : "+monTableau[0][1]);
        System.out.println("L'élément à l'index [1][0] est : "+monTableau[1][0]);
        System.out.println("L'élément à l'index [1][1] est : "+monTableau[1][1]);
        System.out.println("L'élément à l'index [2][0] est : "+monTableau[2][0]);
        System.out.println("L'élément à l'index [2][1] est : "+monTableau[2][1]);



        //*********************RECHERCHE ELEMENT TABLEAU*****COPIE*******//
        //Création et initialisation du tableau
        int[]chiffrAffaire = {1234,563,657,453,986,678,654,234,786,123,534,975};

        //Tri du tableau dans l'ordre croissant
        Arrays.sort(chiffrAffaire);

        //Affichage du tableau
        System.out.println(Arrays.binarySearch(chiffrAffaire, 123));
        System.out.println(chiffrAffaire[0]);
        System.out.println(Arrays.toString(chiffrAffaire));

        //Copie entière du tableau
        int[]copieChiffrAffaire = Arrays.copyOf(chiffrAffaire, 12);

        //Affichage de la copie entière
        System.out.println(Arrays.toString(copieChiffrAffaire));

        //Copie d'une partie du tableau --> un trimestre
        int[]premierTrimestre = Arrays.copyOf(chiffrAffaire, 3);

        //Affichage du première trimestre
        System.out.println("Premier trimestre : "+Arrays.toString(premierTrimestre));

    }
}