package ashwin.com.android.expensetracker.Models;

/**
 * Created by Ashwin on 8/19/2015.
 */
public class Transaction {

    private String Name;
    private double Amount;
    private String Category;
    private String Comment;
    private int Day;
    private String Month;
    private int Year;

    public Transaction(String name, double amount, String category, String comment, int day, String month, int year) {
        Name = name;
        Amount = amount;
        Category = category;
        Comment = comment;
        Day = day;
        Month = month;
        Year = year;

    }

}
