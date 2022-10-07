package Client.Model;

public class Date {
    int year,day,month;

    Date(){
        this.year = 0;
        this.day = 0;
        this.month = 0;
    }

    public Date(int year, int day, int month, java.util.Date jDate) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    public int calculateExpiryDate(){
        return year!=0?getYear()*4:0;
    }

    public int getYear( ) {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay( ) {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth( ) {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString( ) {
        return "Date{" +
                "year=" + year +
                ", day=" + day +
                ", month=" + month +
                '}';
    }
}
