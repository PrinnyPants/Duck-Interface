package duckinterface;

public class DuckInterface {
    
    public static void main(String[] args) {
        MallardDuck mDuck = new MallardDuck();
        CanvasDuck cDuck = new CanvasDuck();
        WoodDuck wDuck = new WoodDuck();
        RubberDuck rubDuck = new RubberDuck();
        RoboDuck robDuck = new RoboDuck();
        
        mDuck.msg();
        mDuck.type();
        mDuck.fly();
        mDuck.quack();
        System.out.println();
        
        cDuck.msg();
        cDuck.type();
        cDuck.fly();
        cDuck.quack();
        System.out.println();
        
        wDuck.msg();
        wDuck.type();
        wDuck.fly();
        wDuck.quack();
        System.out.println();
        
        rubDuck.msg();
        rubDuck.type();
        rubDuck.fly();
        rubDuck.quack();
        System.out.println();
        
        robDuck.msg();
        robDuck.type();
        robDuck.fly();
        robDuck.quack();
        System.out.println();
    }
    
    public interface canFly{
        public void fly();
    }
    
    public interface canQuack{
        public void quack();
    }
    
    public abstract class Duck{
        String name;
        
        public void msg(){
            System.out.println("Welcome to the World of Ducks!");
        }
        
        public abstract void type();
    }
    
    public static class MallardDuck extends Duck implements canFly, canQuack{
        public void type(){
            System.out.println("I am a Mallard Duck!");
        }
        public void fly(){
            System.out.println("I can fly!");
        }
        public void quack(){
            System.out.println("Listen to me quack! Quack quack!");
        }
    }
    
    public static class CanvasDuck extends Duck implements canFly, canQuack{
        public void type(){
            System.out.println("I am a Canvas Back Duck!");
        }
        public void fly(){
            System.out.println("I can fly!");
        }
        public void quack(){
            System.out.println("Listen to me quack! Quack quack!");
        }
    }
    
    public static class WoodDuck extends Duck implements canFly, canQuack{
        public void type(){
            System.out.println("I am a Wooden Duck!");
        }
        public void fly(){
            System.out.println("I can only fly if you throw me!");
        }
        public void quack(){
            System.out.println("I can't quack. I'm made of wood!");
        }
    }
    
    public static class RubberDuck extends Duck implements canFly, canQuack{
        public void type(){
            System.out.println("I am a Rubber Ducky!");
        }
        public void fly(){
            System.out.println("I can only fly if you throw me!");
        }
        public void quack(){
            System.out.println("I can't quack, but I can squeak! Squeak squeak!");
        }
    }
    
    public static class RoboDuck extends Duck implements canFly, canQuack{
        public void type(){
            System.out.println("I am a Robot Duck from the year 3000!");
        }
        public void fly(){
            System.out.println("I can fly with my robot wings!");
        }
        public void quack(){
            System.out.println("I can quack like a robot! Q u a c k!");
        }
    }
    
}
