package snru.ngo.theerapat.snrurun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUp extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, userEditText, passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton ChoiceRadioButton, Choice2RadioButton,
            Choice3RadioButton, Choice4RadioButton, Choice5RadioButton;
    private  String nameString, userString, passwordString, avataString = "0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Bind Widget
        bindWidget();

        //Radio Button Controller
        radioButtonController();


    } // Main Method

    private void radioButtonController() {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {

                switch (i) {
                    case R.id.radioButton:
                        avataString = "0";
                        break;
                    case R.id.radioButton2:
                        avataString = "1";
                        break;
                    case R.id.radioButton3:
                        avataString = "2";
                        break;
                    case R.id.radioButton4:
                        avataString = "3";
                        break;
                    case R.id.radioButton5:
                        avataString = "4";
                        break;
                }


            }
        });
    }

    private void bindWidget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        radioGroup = (RadioGroup) findViewById(R.id.ragAvata);
        ChoiceRadioButton = (RadioButton) findViewById(R.id.radioButton);
        ChoiceRadioButton = (RadioButton) findViewById(R.id.radioButton2);
        ChoiceRadioButton = (RadioButton) findViewById(R.id.radioButton3);
        ChoiceRadioButton = (RadioButton) findViewById(R.id.radioButton4);
        ChoiceRadioButton = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void clickSignUpSign(View view) {

        //Get Value From EditText
        nameString = nameEditText.getText().toString().trim(); // trim tab value forword and value back
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("") || userString.equals("") || passwordString.equals("") ) {

            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง", "กรุณากรอกทุกช่องครับ");

        } else {





        }

    }

} // MainClass
