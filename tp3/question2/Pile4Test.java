package question2;

/**
 * Classe-test Pile4Test.
 * 
 * @author (votre nom)
 * @version (un numé?ro de version ou une date)
 * 
 *          Les classes-test sont documenté?es ici :
 *          http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 *          et sont basé?es sur le document ©? 2002 Robert A. Ballance intitulé?
 *          «JUnit: Unit Testing Framework».
 * 
 *          Les objets Test (et TestSuite) sont associé?s aux classes à tester
 *          par la simple relation yyyTest (e.g. qu'un Test de la classe
 *          Name.java se nommera NameTest.java); les deux se retrouvent dans le
 *          même paquetage. Les "engagements" (anglais : "fixture") forment un
 *          ensemble de conditions qui sont vraies pour chaque mé?thode Test à
 *          exé?cuter. Il peut y avoir plus d'une mé?thode Test dans une classe
 *          Test; leur ensemble forme un objet TestSuite. BlueJ dé?couvrira
 *          automatiquement (par introspection) les mé?thodes Test de votre
 *          classe Test et gé?né?rera la TestSuite consé?quente. Chaque appel d'une
 *          mé?thode Test sera pré?cé?dé? d'un appel de setUp(), qui ré?alise les
 *          engagements, et suivi d'un appel à tearDown(), qui les dé?truit.
 */
public class Pile4Test extends junit.framework.TestCase {
    // Dé?finissez ici les variables d'instance né?cessaires à vos engagements;
    // Vous pouvez é?galement les saisir automatiquement du pré?sentoir
    // à l'aide du menu contextuel "Pré?sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du pré?sentoir (les objets sans constructeur, comme int, float, etc.).

    /**
     * Constructeur de la classe-test Pile4Test
     */
    public Pile4Test() {
    }

    /**
     * Met en place les engagements.
     * 
     * Mé?thode appelé?e avant chaque appel de mé?thode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements

    }

    /**
     * Supprime les engagements
     * 
     * Mé?thode appelé?e après chaque appel de mé?thode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        // Libé?rez ici les ressources engagé?es par setUp()
    }

}