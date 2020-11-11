package controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import model.Question;
import model.QuestionBANk;
import model.User;
import controller.MainActivity;
import n.s.myapplication.R;


public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView Activity_question_text ;
    private Button mRep_BT1;
    private Button mRep_BT2;
    private Button mRep_BT3;
    private Button mRep_BT4;

    private QuestionBANk mQuestionBANk;
    private Question mCurrentQuestion;

    private int mScore;
    private int nNombreDeQuestions ;

    public  final  static  String BUNDLE_Extra_score = "mCurrentQuestion";

    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

    //  Action des bouton et référence dans le code

        Activity_question_text = (TextView) findViewById(R.id.question);
        mRep_BT1 = (Button) findViewById(R.id.Rep_BT1);
        mRep_BT2 = (Button) findViewById(R.id.Rep_BT2);
        mRep_BT3 = (Button) findViewById(R.id.Rep_BT3);
        mRep_BT4 = (Button) findViewById(R.id.Rep_BT4);

        nNombreDeQuestions = 4 ;
        mScore = 0 ;

        mQuestionBANk = generateQuestions(); // Genére la liste des questions

        // Assignation des bouton par leurs propriéta/
        mRep_BT1.setTag(0);
        mRep_BT2.setTag(1);
        mRep_BT3.setTag(2);
        mRep_BT4.setTag(3);

        /*clic = appel à la méthode onClick de 'linstance GameActivity */

        mRep_BT1.setOnClickListener(this);
        mRep_BT2.setOnClickListener(this);
        mRep_BT3.setOnClickListener(this);
        mRep_BT4.setOnClickListener(this);

        mCurrentQuestion = mQuestionBANk.getQuestion();
        this.displayQuestion(mCurrentQuestion);

        mQuestionBANk = this.generateQuestions() ;
    }

    private void displayQuestion( final Question question) {
         Activity_question_text.setText(question.getQuestion());
         mRep_BT1.setText(question.getChoicelist().get(0));
         mRep_BT2.setText(question.getChoicelist().get(1));
         mRep_BT3.setText(question.getChoicelist().get(2));
         mRep_BT4.setText(question.getChoicelist().get(3));

    }

    private  QuestionBANk generateQuestions() {
        Question question1 = new Question("What is the name of the current french president?",
                Arrays.asList("François Hollande", "Emmanuel Macron", "Jacques Chirac", "François Mitterand"),
                1);

        Question question2 = new Question("How many countries are there in the European Union?",
                Arrays.asList("15", "24", "28", "32"),
                2);

        Question question3 = new Question("Who is the creator of the Android operating system?",
                Arrays.asList("Andy Rubin", "Steve Wozniak", "Jake Wharton", "Paul Smith"),
                0);

        Question question4 = new Question("When did the first man land on the moon?",
                Arrays.asList("1958", "1962", "1967", "1969"),
                3);

        Question question5 = new Question("What is the capital of Romania?",
                Arrays.asList("Bucarest", "Warsaw", "Budapest", "Berlin"),
                0);

        Question question6 = new Question("Who did the Mona Lisa paint?",
                Arrays.asList("Michelangelo", "Leonardo Da Vinci", "Raphael", "Carravagio"),
                1);

        Question question7 = new Question("In which city is the composer Frédéric Chopin buried?",
                Arrays.asList("Strasbourg", "Warsaw", "Paris", "Moscow"),
                2);

        Question question8 = new Question("What is the country top-level domain of Belgium?",
                Arrays.asList(".bg", ".bm", ".bl", ".be"),
                3);

        Question question9 = new Question("What is the house number of The Simpsons?",
                Arrays.asList("42", "101", "666", "742"),
                3);

        return new QuestionBANk(Arrays.asList(question1,
                question2,
                question3,
                question4,
                question5,
                question6,
                question7,
                question8,
                question9));
    }

    // @Override
    public GameActivity(View v) {
    }




    @Override
   public void onClick(View v) {

       int responseIndex =  (int) v.getTag();

        if ( responseIndex == mCurrentQuestion.()) {

            // bonne réponse

           Toast.makeText(this,"BONNE REPONSE",Toast.LENGTH_SHORT).show();
        }
        else {

            // Mauvaise reponse
            Toast.makeText(this,"Essaie encore mauvaise réponse", Toast.LENGTH_SHORT).show();
        }


    }

}