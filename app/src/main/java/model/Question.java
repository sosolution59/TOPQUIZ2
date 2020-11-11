package model;

import java.util.List;

public class Question {

    private  String mQuestion;
    private  List<String> mChoicelist;
    private  int mRep ;

public Question(String question, List<String> choicelist, int mRep){
    this.mQuestion(mQuestion);
    this.mChoicelist(mChoicelist);
    this.mRep(mRep);
}


    private void mQuestion(String question) {
    }

    public String getQuestion(){
    return mQuestion;
    }

    public void setQuestion(String question){
        mQuestion = question ;
        }

    public List<String> getChoicelist() {
        return mChoicelist;
    }

    public void mChoicelist(List<String> choicelist) {
        if (choicelist == null){
            throw new IllegalArgumentException("Array ne peut être null");
        }
        mChoicelist = choicelist ;
}
        public int mRep(int mRep) {
            return this.mRep;
}

    public void setRep(int rep){
        if (rep < 0 || rep >= mChoicelist.size()){
            throw new  IllegalArgumentException("L'index de réponse est hors limite");
        }
        rep = rep ;
    }
    
    @Override
    public String toString() {
        return  "Question{" +
                "mQuestion='" + mQuestion + '\''+
                ", mChoicelist=" + mChoicelist + 
                ",mQuestion=" + mRep +
            '}';


    }

    public int setRep() {
    QuestionBANk Reponses= new QuestionBANk()
    }
}

