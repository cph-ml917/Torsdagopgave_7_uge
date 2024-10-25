//----------Task 1: Flow i programmer----------//

/*
1.1 Lav en klasse med mindst fire metoder. Du kan kalde metoderne methodA, methodB, methodC og methodD eller bruge mere kreative navne.

1.2 Lad metoderne printe bogstaver ud. Du kan lade dig inspirere af klassen Flows.java.

1.3 Prøv programmet af fra en main-metode og se om der bliver printet det ud, som du regner med. Du kan lade dig inspirere af klassen Main.java.

1.4 Ret nu til i metoderne klassen Flow, så når du laver dine kald fra main, bliver der printet "Java er sjovt" (du skal ikke rette i main-metoden, men lave samme kald som i opgave 1.3). Hvert bogstav skal printes fra et forskelligt sted i programmet. (Det vil sige, at hvor der før blev printet fx a b c h j k fra de forskellige metodekald, skal der nu printes J a v a e r s j o v t fra samme metodekald.)
 */

package Task_1;

public class Main {
    public static void main(String[] args) {
        Flows flow = new Flows();
        System.out.println("\"Start\");");
        flow.methodA();
    }
}