public class ConstructorStart {

    ConstructorStart() {
        System.out.println("Default constructor");
    }

    ConstructorStart(int a, String b) {
        System.out.println("The value of a " + a + " The value of b " + b);
    }

    ConstructorStart(int a, String b, int c) {
        System.out.println("The value of a " + a + " The value of b " + b + " C value is :" + c);


    }


    public static void main(String[] args) {
        ConstructorStart c1 = new ConstructorStart();
        ConstructorStart c2 = new ConstructorStart(17, "Hello");
        ConstructorStart c3 = new ConstructorStart(17, "Hello", 91);


    }
}
