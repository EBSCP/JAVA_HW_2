public  class Duck extends Animal implements Moveable,Swimable,Flyable{

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
    @Override
    public void move(){
        System.out.println("Duck is moving");
    }
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

}
