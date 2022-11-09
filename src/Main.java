public class Main {
    public static void main(String[] args) {

        Programmer programmer =new Programmer("Kuban","java","Peaksoft");
        System.out.println(programmer);
        System.out.print("programmer eat: "+" ");
        programmer.eat();
        System.out.print("programmern learn : "+" ");
        programmer.learn();
        System.out.println("programmer walk : "+" ");
        programmer.walk();
        System.out.println("programmer write :"+" ");
        programmer.coding();

        Singer singer=new Singer("nasha","Lezgibka","Ak shoola");
        System.out.println(singer);
        singer.eat();
        singer.learn();
        singer.walk();
        singer.singing();
        singer.playGitar();
        System.out.println();

        Dancer dancer=new Dancer("Nastya","Ay chykty","Joogazyn");
        System.out.println(dancer);
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();
        System.out.println();




    }
}