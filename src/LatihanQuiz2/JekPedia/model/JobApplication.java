package LatihanQuiz2.JekPedia.model;

import LatihanQuiz2.JekPedia.state.IState;
import LatihanQuiz2.JekPedia.state.InterviewState;
import LatihanQuiz2.JekPedia.state.SubmissionState;

import java.util.Random;

public class JobApplication {
    String name;
    int experience;
    String code;
    String preference;
    IState phase;

    public JobApplication(String name, int experience, String preference) {
        this.name = name;
        this.experience = experience;
        this.code = setCode();
        this.preference = preference;
        this.phase = new SubmissionState();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCode() {
        return code;
    }

    public String setCode() {
        String code = "";
        String randChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < 5; i++){
            Random rand = new Random();
            code += (randChar.charAt(rand.nextInt(randChar.length())));
        }
        return code;
    }

    public void next(){
        phase.nextState(this);
    }

    public void display(){
        phase.displayState();
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public IState getPhase() {
        return phase;
    }

    public void setPhase(IState phase) {
        this.phase = phase;
    }
}
