public abstract class Student {
    public int id;
    public float mid;
    public  float fin;

    public Student (int id,float mid,float fin){
            this.fin =fin;
            this.id =id;
            this.mid = mid;
    }
    public abstract  float ComputeTotalScore();
    public  float ComputeBaseScore() {
        return mid*0.4f+fin*0.6f;
    }

}
