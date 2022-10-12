package model;

import java.text.SimpleDateFormat;

public class Date {
    int day, month, year,expYear;
    String today;
    public Date(){
        day = 0;
        year = 0;
        month = 0;
    }
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date date){
        this.day = getDay();
        this.month = getMonth();
        this.year = getYear();
    }

    //Gets the current date and calculates the expiry date
    public void calculateExpiryDate(){
        //getting today's date
        getToday();
        //Storing the last four digits ie the year in the year attribute
        this.expYear = Integer.parseInt(
                today.substring(
                        today.length()-4));

        //calculating the expiry dat
        expYear= expYear!=0?expYear+4:0;

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

    public int getYear( ) {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getExpYear( ) {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getToday( ) {

        //Getting current today
        java.util.Date jDate = new java.util.Date();

        //Setting format for today
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.today = formatter.format(jDate);
        return today;
    }

    @Override
    public String toString( ) {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", expYear=" + expYear +
                ", today='" + today + '\'' +
                '}';
    }
}
