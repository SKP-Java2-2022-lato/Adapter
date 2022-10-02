public class Main {
    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if(roundHole.fits(roundPeg))
            System.out.println("Pasuje!");

        SquarePeg squarePeg1 = new SquarePeg(2);
        SquarePeg squarePeg2 = new SquarePeg(20);

        SquerePegAdapter squerePegAdapter1 = new SquerePegAdapter(squarePeg1);
        SquerePegAdapter squerePegAdapter2 = new SquerePegAdapter(squarePeg2);

        if(roundHole.fits(squerePegAdapter1))
            System.out.println("Pasuje");

        if(!roundHole.fits(squerePegAdapter2))
            System.out.println("Ups...");
    }
}