package LTF;

import java.time.LocalDateTime;

class Task{

    private String name;
    private int duration;
    private LocalDateTime deadline;
    private boolean recurring;
    private String freq;


    public Task(String name, int duration, LocalDateTime deadline){
        this.name = name;
        this.duration = duration;
        this.deadline = deadline;
        this.recurring = false;
    }

    public Task(String name, int duration, LocalDateTime startDate, String freq){
        this.name = name;
        this.duration = duration;
        this.deadline = startDate;
        this.recurring = true;
        this.freq = freq; 
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