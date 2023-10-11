package Session1;

public class test {
    public static class student{
        String name;
        int age;
        student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }

    }
    public static void main(String[] args){
        student newstudent = new student("gay", 23);
//        System.out.println(newstudent.name);
//        System.out.println(newstudent.age);
        System.out.println(newstudent.getName());
        System.out.println(newstudent.getAge());
    }
}
