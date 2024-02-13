public class PhdStudent extends  MasterStudent implements ArticleScoreBehaviour{
    public int NumberofArticle;

     public PhdStudent(int id,float mid, float fin, int conf,int numberofArticle) {
         super(id,mid,fin,conf);
         this.NumberofArticle =numberofArticle;
     }
    @Override
     public float ComputeTotalScore() {
         return ComputeBaseScore()+articleScore();
     }
     @Override
    public float articleScore() {
         return NumberofArticle*8f;
     }

}
