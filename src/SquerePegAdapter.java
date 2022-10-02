public class SquerePegAdapter extends RoundPeg {

    private final SquarePeg peg;

    public SquerePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result = peg.getWidth()*Math.sqrt(2)/2;
        return result;
    }
}

