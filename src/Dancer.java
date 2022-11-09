public class Dancer extends  Person{

    private  String groupName;


//    public  Dancer(){
//
//    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer\n" +
                "groupName: " + groupName + "\n" +
                "Name: "+super.getName()+"\n"+
               "Designation : "+ super.getDesignation()+"\n"
                ;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Breakfast");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Bachata");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Home");
    }
    public  void  dancing(){
        System.out.println("tanes");
    }
}
