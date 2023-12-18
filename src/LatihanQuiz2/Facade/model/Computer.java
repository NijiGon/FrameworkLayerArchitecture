package LatihanQuiz2.Facade.model;

public class Computer {
    String state;

    public Computer() {
        state = "off";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if(state.equals("on")){
            System.out.println("Turning on the fan");
            System.out.println("Turning on the Monitor");
            System.out.println("Turning on the CPU");
        }
        else if(state.equals("off")){
            System.out.println("Turning off the fan");
            System.out.println("Turning off the Monitor");
            System.out.println("Turning off the CPU");
        }
        this.state = state;
    }

    public void display(){
        if(state.equals("off")){
            System.out.println("CPU is off");
            System.out.println("Monitor is off");
            System.out.println("Fan is off");
        }
        if(state.equals("on")){
            System.out.println("CPU is running");
            System.out.println("Monitor is on");
            System.out.println("Fan is on");
        }

    }
}
