package Task_1;

public class Flows {
    public void methodA(){
        System.out.println("J");
        System.out.println("a");
        methodB("Now methodB");
    }

    public void methodB(String next) {
        System.out.println("v");
        System.out.println("a");
        methodC(next);
        System.out.println("t");
    }

    public int methodC(String input) {
        System.out.println("e");
        methodD(input.length());
        return input.length() *117;
    }

    public void methodD(int number) {
        if(number > 1) {
            System.out.println("r");
            System.out.println("s");
            System.out.println("j");
            System.out.println("o");
            System.out.println("v");
        }
    }
}
