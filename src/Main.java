public class Main {
    public static void main(String[] args) {

        Programmer programmer =new Programmer("Kuban","java","Peaksoft");
        System.out.println(programmer);
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();

        Singer singer=new Singer("nasha","Lezgibka","Ak shoola");
        System.out.println(singer);
        singer.eat();
        singer.learn();
        singer.walk();
        singer.singing();
        singer.playGitar();

        Dancer dancer=new Dancer("Nastya","Ay chykty","Joogazyn");
        System.out.println(dancer);
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();




    }
}