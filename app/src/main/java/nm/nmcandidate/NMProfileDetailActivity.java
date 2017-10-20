package nm.nmcandidate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class NMProfileDetailActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView5;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonFemale;
    private RadioButton radioButtonMale;
    private EditText editTextDate;
    private AppCompatButton buttonSaveProfileDetails;


    private void initializeViews() {
        textView5 = (TextView)findViewById( R.id.textView5 );
        radioGroupGender = (RadioGroup)findViewById( R.id.radioGroup_gender );
        radioButtonFemale = (RadioButton)findViewById( R.id.radioButton_female );
        radioButtonMale = (RadioButton)findViewById( R.id.radioButton_male );
        editTextDate = (EditText)findViewById( R.id.editText_date );
        buttonSaveProfileDetails = (AppCompatButton)findViewById( R.id.button_save_profile_details );

        radioButtonFemale.setOnClickListener( this );
        radioButtonMale.setOnClickListener( this );
        buttonSaveProfileDetails.setOnClickListener( this );
    }


    @Override
    public void onClick(View v) {
        if ( v == radioButtonFemale ) {
            // Handle clicks for radioButtonFemale
        } else if ( v == radioButtonMale ) {
            // Handle clicks for radioButtonMale
        } else if ( v == buttonSaveProfileDetails ) {
            // Handle clicks for buttonSaveProfileDetails
            Intent intent = new Intent(NMProfileDetailActivity.this,KindOfJobActivity.class);
            startActivity(intent);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nmprofile_detail);
        initializeViews();
    }
}
