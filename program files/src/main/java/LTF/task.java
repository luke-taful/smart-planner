package LTF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Task{

    private String name;
    private int duration;
    private LocalDate deadline;
    private int dtd;

    private boolean recurring;
    private String freq; //D = daily, W = weekly, M = Monthly, Y = Yearly
    private LocalDate startDate;

    private boolean fixedTime;
    private LocalDateTime startTime;


    /*  There are 4 potential types of task:
        - non-recurring w/ set deadline
        - recurring w/ rolling deadline
        - non-recurring w/ set start time
        - recurring w/ set recurring start time
    */    
        

    public Task(String name, int duration, LocalDate deadline){
        this.name = name;
        this.duration = duration;
        this.deadline = deadline;
        
        this.recurring = false;
        this.fixedTime = false;

        Period period = Period.between(LocalDate.now(), deadline);
        this.dtd = period.getDays();

    }

    public Task(String name, int duration, LocalDate startDate, String freq){
        this.name = name;
        this.duration = duration;
        this.startDate = startDate;

        this.recurring = true;
        this.fixedTime = false;

        this.freq = freq; 
        switch (freq){
            case "D":
                this.dtd = 1;
            case "W":
                this.dtd = 7;
            case "M":
                this.dtd = 30; //Need to add logic for varying days in each month here, use StartDate?
            case "Y":
                this.dtd = 36;
        }
    }

    public Task(String name, int duration, LocalDateTime startTime){
        this.name = name;
        this.duration = duration;
        this.startTime = startTime;
        this.recurring = false;
        this.fixedTime = true;
    }

    public Task(String name, int duration, LocalDateTime startTime, String freq){
        this.name = name;
        this.duration = duration;
        this.startTime = startTime;
        this.recurring = true;
        this.fixedTime = true;

        this.freq = freq; 
        switch (freq){
            case "D":
                this.dtd = 1;
            case "W":
                this.dtd = 7;
            case "M":
                this.dtd = 30; //Need to add logic for varying days in each month here, use StartDate?
            case "Y":
                this.dtd = 36;
        }
    }


    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Getter and Setter for duration
    public int getDuration() {
        return duration;
    }
    public String getDurationString(){
        int hours = duration/60;
        int minutes = duration%60;
        
        if(hours == 0){
            return(minutes + " minutes");
        }
        if (minutes == 0){
            return(hours + " hour(s)");
        }
        return hours + " hour(s) " + minutes + " minutes ";
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    // Getter and Setter for deadline
    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }


    // Getter and Setter for recurring
    public boolean isRecurring() {
        return recurring;
    }

    public void setRecurring(boolean recurring) {
        this.recurring = recurring;
    }


    // Getter and Setter for freq
    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    

}