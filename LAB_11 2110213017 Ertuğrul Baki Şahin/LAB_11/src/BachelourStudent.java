public class BachelourStudent extends Student implements ProjectScoreBehaviour{
    public BachelourStudent (int id, float mid, float fin) {
        super(id, mid, fin);
    }
    @Override
    public float ComputeTotalScore() {
        return ComputeBaseScore()+projectScore();
    }
    @Override
    public float projectScore() {
        return 20;
    }
}
