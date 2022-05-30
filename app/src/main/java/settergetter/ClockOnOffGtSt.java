package settergetter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockOnOffGtSt {

    public String date;
    public String intime;
    public String outtime;
    public boolean isweeklyoff;
    public boolean isonleave;
    public boolean isclockonforday;
    public boolean isclockoffforday;
    public String totalTime;



    public void calculateTotalTime() {
        String inTime1 = this.intime+":00";
        String outTime1 = this.outtime+":00";
        try {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            Date date1 = format.parse(inTime1);
            Date date2 = format.parse(outTime1);
            long diff = date2.getTime() - date1.getTime();
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            setTotalTime(""+diffHours+" Hrs, "+diffMinutes+" Mins.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public boolean isIsclockonforday() {
        return isclockonforday;
    }

    public void setIsclockonforday(boolean isclockonforday) {
        this.isclockonforday = isclockonforday;
    }

    public boolean isIsclockoffforday() {
        return isclockoffforday;
    }

    public void setIsclockoffforday(boolean isclockoffforday) {
        this.isclockoffforday = isclockoffforday;
    }




    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }

    public String getOuttime() {
        return outtime;
    }

    public void setOuttime(String outtime) {
        this.outtime = outtime;
    }

    public boolean isIsweeklyoff() {
        return isweeklyoff;
    }

    public void setIsweeklyoff(boolean isweeklyoff) {
        this.isweeklyoff = isweeklyoff;
    }

    public boolean isIsonleave() {
        return isonleave;
    }

    public void setIsonleave(boolean isonleave) {
        this.isonleave = isonleave;
    }


}
