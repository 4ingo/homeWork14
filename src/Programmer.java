public class Programmer extends Person{
    private  String companyName;


//    public  Programmer(){
//
//    }
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer\n" +
                "CompanyName: " + companyName+"\n" +
                "Name: " + super.getName()+"\n" +
                "Designation: " + super.getDesignation();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dinner");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Java");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("PeKsoft");
    }

    public  void  coding(){
        System.out.println("Cod");


    }
}
