package model;

import java.text.SimpleDateFormat;

public class Date {
    int dobDay,dobMonth,dobYear,expYear;
    String today;
    public Date(){ //TODO extend Java.util.Date
        dobDay = 0;
        dobYear = 0;
        dobMonth = 0;
    }
    public Date(int dobDay, int dobMonth, int dobYear) {
        this.dobDay = dobDay;
        this.dobMonth = dobMonth;
        this.dobYear = dobYear;
    }

    public Date(Date date){
        this.dobDay = getDobDay();
        this.dobMonth = getDobMonth();
        this.dobYear = getDobYear();
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

    public int getDobDay( ) {
        return dobDay;
    }

    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    public int getDobMonth( ) {
        return dobMonth;
    }

    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    public int getDobYear( ) {
        return dobYear;
    }

    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
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
                "dobDay=" + dobDay +
                ", dobMonth=" + dobMonth +
                ", dobYear=" + dobYear +
                ", expYear=" + expYear +
                ", today='" + today + '\'' +
                '}';
    }
}
