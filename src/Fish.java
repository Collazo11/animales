
public class Fish extends Animal implements Pet{
    private String name="";

    public Fish(){
        super(0);
    }

    @Override
    public void walk(){
        System.out.println("Fishes have no legs and cannot walk.");
    }
    @Override
    public void eat(){
        System.out.println(name+" eats shrimp.");
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void play(){
        System.out.println(name+" likes to play with Nemo");
    }
}