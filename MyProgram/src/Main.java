public class Main {
    public static void main(String[] args){
        RabbitAndTurtle race = new RabbitAndTurtle();
        System.out.println("Старт!");
        race.race();
    }
}
class AnimalThread extends Thread{
    String name;
    int priority;
    AnimalThread(String name){
        this.name = name;
    }
    public void run(){
        Thread thread = new Thread();

        for (int i = 0; i < 1100; i+=100){
            System.out.println(name+" - "+i+" метров");
            if(i == 500){
                priority = 5;
                thread.setPriority(priority);
            }
        }
    }
}
class RabbitAndTurtle{
    public void race() {
        String name = "Черепаха";
        int priority = 10;
        Thread turtle = new AnimalThread(name);
        turtle.setPriority(priority);
        name = "Кролик";
        priority = 1;
        Thread rabbit = new AnimalThread(name);
        rabbit.setPriority(priority);
        turtle.start();
        rabbit.start();
    }
}
