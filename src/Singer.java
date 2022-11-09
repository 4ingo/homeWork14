public class Singer extends  Person{
    private  String bandName;


    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getbandName() {
        return bandName;
    }

    public void setbandName(String groupName) {
        this.bandName = groupName;
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("beshbarmak");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println("Another love");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Cafe");
    }

    public   void singing(){
        System.out.println("Song");

    }
    public   void  playGitar(){
        System.out.println("Nursultan");

    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                super.getName()+'\''+
                super.getDesignation()+
                '}';
    }
}
