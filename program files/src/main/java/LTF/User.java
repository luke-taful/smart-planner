package LTF;
import LTF.Day;

public class User{

    private String name;
    private Day[] week = {};
    
    public User(String name, Day[] week){
        this.name = name;
        this.week = week;
    }

    public Day getDayById(String id){
        switch(id){
            case "M":
                return week[0];
            case "Tu":
                return week[1];
            case "W":
                return week[2];
            case "Th":
                return week[3];
            case "F":
                return week[4];
            case "Sa":
                return week[5];
        }
        return week[6];
    }
}
