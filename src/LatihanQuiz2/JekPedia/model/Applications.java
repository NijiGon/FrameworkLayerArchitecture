package LatihanQuiz2.JekPedia.model;

import LatihanQuiz2.JekPedia.iterator.FIFOIterator;

import java.util.ArrayList;

public class Applications {
    ArrayList<JobApplication> jobApplications;

    public Applications() {
        jobApplications = new ArrayList<>();
    }

    public void add(JobApplication j){
        jobApplications.add(j);
    }

    public void updateAll(){
        FIFOIterator<JobApplication> iterator = new FIFOIterator<>(jobApplications);
        while (iterator.hasNext()){
            iterator.getNext().next();
        }
    }

    public boolean displayAll(){
        FIFOIterator<JobApplication> iterator = new FIFOIterator<>(jobApplications);
        if(!iterator.hasNext() && iterator.getCurrIdx() == 0){
            System.out.println("No data submitted yet..");
            return false;
        }
        while(iterator.hasNext()){
            JobApplication j = iterator.getNext();
            System.out.println("Applicant Code : " + j.getCode());
            System.out.println("Applicant Name : " + j.getName());
            System.out.println("Job Experience : " + j.getExperience());
            System.out.println("Job Preference : " + j.getPreference());
            System.out.println("Current Phase  : " + j.getPhase().displayState());
            System.out.println();
        }
        return true;
    }
}
