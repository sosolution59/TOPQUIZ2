package controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import model.User;
import n.s.myapplication.R;


public class MainActivity<gameActivityIntent> extends AppCompatActivity {
    private TextView welcome_in ;
    private EditText Prenom_in ;
    private Button BT_Valider_in ;
    private User mUser;
    public static final int GAME_ACTIVITY_REQUEST_CODE = 42;
    private SharedPreferences mPreferences;

    public static final String PREF_KEY_SCORE = "PREF_KEY_SCORE";
    public static final String PREF_KEY_FIRSTNAME = "PREF_KEY_FIRSTNAME";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_game);

         welcome_in = (TextView) findViewById(R.id.welcome);

        mUser = new User(Prenom_in);
        Prenom_in = (EditText) findViewById(R.id.Prenom_input);
        BT_Valider_in = (Button) findViewById(R.id.BT_Valider);

        BT_Valider_in.setEnabled(false);

        Prenom_in.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                BT_Valider_in.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
    });
        BT_Valider_in.setOnClickListener(new View.OnClickListener() {
            public Object GameActivity;

            @Override
            public void onClick(View v) {
                // utilisateur à juste cliquer ! Puisque il a entrez un prenom  le bouton c'est activer

                Intent GameActivity = new Intent(MainActivity.this, GameActivity.class);
                startActivity(GameActivity);
            }


        });
    }

}