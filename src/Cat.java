
public class Cat extends Animal implements Pet{
    String name="cat";

    public Cat(){
        this("");
    }
    public Cat(String name){
        super(4);
        this.name=name;
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
        System.out.println(name+" likes to play with Kitty");
    }
    @Override
    public void eat(){
        System.out.println(name+" eats fishes.");
    }
}