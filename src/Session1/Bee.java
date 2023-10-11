package Session1;

public class Bee extends Animal implements Moveable{
    public Bee(String name, int legs){
        super(name, legs);
    }
    void fly(){
        System.out.println("buzz");
    }

    @Override
    void eat(){
        System.out.println("slurp");
    }

    @Override
    public void move() {
        fly();
    }

    void eat(int foodAmount){
        for(int i = 0; i < foodAmount; i++){
            System.out.print("slurp ");
        }
    }
}
