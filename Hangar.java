public class Hangar {
    public static void main(String[] args) {
        Car Tracteur = new Car("John deer", 10000000);
        Boat HoverBoard = new Boat("HoverBoard", 400);

        System.out.println(Tracteur.doStuff());
        System.out.println(HoverBoard.doStuff());
    }
}
