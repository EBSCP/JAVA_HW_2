public class Main {
    public static void main(String[] args) {
        Student S1 = new BachelourStudent(0,15,45);
        Student S2 = new MasterStudent(1,15.6f,19.6f,10);
        Student S3 = new PhdStudent(2,15f,25f,15,25);

        Student[] Students =  {S1,S2,S3};

        for (Student student:Students) {
            System.out.println(student.ComputeTotalScore());
        }
    }
}