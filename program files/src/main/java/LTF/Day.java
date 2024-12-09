package LTF;
import LTF.Task;

public class Day {
    private String id;
    private int timeAllow;
    private Task[] tasks = {};

    public Day(String id, Task[] tasks, int timeAllow){
        this.id = id;
        this.tasks = tasks;
        this.timeAllow = timeAllow;
    }

}
