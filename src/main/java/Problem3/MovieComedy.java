package Problem3;

public class MovieComedy extends Movie {

    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        super(rating, title);
    }

    public MovieComedy(MovieComedy anotherMovie) {
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // use standard rate for comedy movie
        if (numOfDaysPastDue > 0) {
            return numOfDaysPastDue * lateFeePerDayInDollar;
        }
        return 0;
    }
}
