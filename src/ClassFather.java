public class ClassFather {

    String empName;
    int empCode;
    String designation;
    //parent class
    public ClassFather() {
        System.out.println("Defalut constructor");

    }


    public ClassFather(int i, int i1) {
        System.out.println("Constructor with two arguments");

    }

    public ClassFather(String empName, int empCode,String designation){
        this.empName=empName;
        this.empCode=empCode;
        this.designation=designation;
        System.out.println(empName+empCode+designation);

    }


}
