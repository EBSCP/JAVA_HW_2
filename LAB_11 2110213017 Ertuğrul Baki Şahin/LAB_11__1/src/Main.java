public class Main {
    public static void main(String[] args) {
        Animal a1 = new Eagle();
        Animal a2 = new Duck();
        Animal a3= new Cat();

        Animal[] animals = {a1,a2,a3};

        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }
}