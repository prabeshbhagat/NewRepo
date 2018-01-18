public class ClassSon extends ClassFather {

    public ClassSon(){
        super(10,12);

//        super();  Call to super must be the 1st statement
        System.out.println("Constructor of ClassSon ");

    }

    public static void main(String [] args){
        System.out.println("Hello");
        ClassFather c1= new ClassFather();
        ClassFather c2= new ClassFather(10,11);
        ClassSon c3= new ClassSon();
        ClassFather c4=new ClassFather("Prabesh",1001,"Tester");
    }
}
