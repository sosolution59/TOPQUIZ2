package model;

import android.widget.EditText;

public class User {
    private String mPrenom_input;

    public User(EditText mPrenom_in) {
    }


    public String getPrenom_input() {
        return mPrenom_input;
    }

    public void setPrenom_input(String Prenom_input) {
        mPrenom_input = mPrenom_input;
    }

    @Override
    public String toString() {
        return "User{" +
                "mPrenom_input='" + mPrenom_input + '\'' +
                '}';
    }
}
