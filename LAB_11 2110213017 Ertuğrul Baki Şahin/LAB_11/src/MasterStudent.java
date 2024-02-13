public class MasterStudent extends Student implements ConferenceScoreBehaviour{
    public int  numberofConf;
    public MasterStudent(int id,float mid,float fin, int numberofConf) {
            super(id, mid, fin);
            this.numberofConf =numberofConf;
    }

    @Override
    public float ComputeTotalScore() {
       return ComputeBaseScore()+ConferenceScore();
    }
    @Override
    public float ConferenceScore() {
            return numberofConf*5f;
    }
}
