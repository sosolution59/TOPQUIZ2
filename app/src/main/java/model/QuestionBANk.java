
/**
 * created by sof
 */
package model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import model.Question;

public class  QuestionBANk {
    private List<Question> mQuestionList;
    private int nNextQuestionIndex;

    public QuestionBANk(List<Question> questionList){
        mQuestionList = questionList ; // constructeur = attend la liste des questions
     //Shuffle liste des questions
       Collections.shuffle(mQuestionList);
        nNextQuestionIndex = 0 ;
    }
    public Question getQuestion() {
        //
        if (nNextQuestionIndex == mQuestionList.size()){
            nNextQuestionIndex = 0;
        }
    //
        return mQuestionList.get(nNextQuestionIndex++);
    }

    Question question1 = new Question("Qui est me créateur de JAVA ? ",
            Arrays.asList("Andy Rubin",
            "Steve Jobs",
            "Jale Wharton",
            "Paul Smith"),
            0);

    Question question2 = new Question("Quand est née Zizoux ?",
            Arrays.asList("1969",
                    "1966",
                    "1970",
                    "1972")
            ,3);

    Question question3 = new Question("Quel est la capitale du brésil ?",
            Arrays.asList("rio",
                    "Brasilia",
                    "Bonus",
                    "kinder")
            ,1);
    //

}
