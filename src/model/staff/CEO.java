package model.staff;

public class CEO extends Staff {

    public CEO(String name) {
        super(name);
        this.setType("CEO");
        this.setTask(Tasks.GET_RICH.DES());
        this.setSalaryLevel("High!!! =)");
    }
}