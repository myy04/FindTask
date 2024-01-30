import java.time.LocalDate;

/**
 * A class to store information about a listing (date)
 * @author Yerdaulet
 */
public class Listing {
    private int year;
    private int month;
    private int day;

    // Array of month names, in order from January to December
    private static final String[] monthsName = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Default constructor, sets the date to the current date
    Listing() {
        setDate();
    }

    /**
     * Getter function for the year
     * @return year of the listing
     */
    public int getYear() {
        return year;
    }

    /**
     * Getter function for the month of the listing
     * @return index of the month (1 for January, 2 for February, etc.)
     */
    public int getMonthInt() {
        return month;
    }

    /**
     * Getter function for the month of the listing
     * @return name of the month (e.g. "January")
     */
    public String getMonthString() {
        return monthsName[month - 1];
    }

    /**
     * Getter function for the day of the listing
     * @return day of the listing
     */
    public int getDay() {
        return day;
    }

    /**
     * Setter function for the day of the listing
     * @param day day of the listing
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Setter function for the month of the listing
     * @param month index of the month (1 for January, 2 for February, etc.)
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Setter function for the year of the listing
     * @param year year of the listing
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Sets the date of the listing to the current date
     */
    public void setDate() {
        // Get the current date using the LocalDate class
        LocalDate currentDate = LocalDate.now();

        // Extract the month, day, and year values from the LocalDate object
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        int year = currentDate.getYear();

        // Set the month, day, and year values using the setter methods
        setMonth(month);
        setDay(day);
        setYear(year);
    }
}