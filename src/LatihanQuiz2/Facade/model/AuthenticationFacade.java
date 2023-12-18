package LatihanQuiz2.Facade.model;

public class AuthenticationFacade {
    public boolean isValid(String pass){
        return pass.equals("admin");
    }
    public boolean nextState(Computer c, String command){
        if(c.getState().equals(command)){
            if(c.getState().equals("on"))
                System.out.println("Setup already started");
            else if(c.getState().equals("off"))
                System.out.println("Setup already off");
            return false;
        }
        c.setState(command);
        return true;
    }
}
