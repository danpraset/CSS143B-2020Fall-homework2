package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
        super(anotherMovie);
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // if action movie not more than 5 days, normal pay
        if (numOfDaysPastDue > 0 && numOfDaysPastDue < 5)
        {
            return numOfDaysPastDue * lateFeePerDayInDollar;
        }
        if(numOfDaysPastDue <= 0)
        {
            return 0;
        }
        // if action movie overdue more than 5 day, pay * 2
        return 2 * numOfDaysPastDue * lateFeePerDayInDollar;
    }
}
