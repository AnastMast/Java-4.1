public class BonusMilesService {

    private static final int ONE_MILE_UNIT = 20;

    public int calculate(int cost) {
        return cost / ONE_MILE_UNIT;
    }

}
