public class Main {
    private int x;

    //we cannot initialize variables inside constructors
    //Constructors are only for object invocation
    //
    Main(){
       x = 20;
    }

    int getX() {
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main mn = new Main();
        System.out.println(mn.getX());

    }
}