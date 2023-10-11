package Session1;

public abstract class Animal {
    String name;
    int legs;
    protected int age;
    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
    void eat(){
        System.out.println("munch munch " + name);
    }

    public int getAge() {
        return age;
    }

    public void addAge(int age) {
        age++;
    }

//    public abstract void move();
}
