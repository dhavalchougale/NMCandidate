package nm.nmcandidate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

public class KindOfJobActivity extends AppCompatActivity implements View.OnClickListener {

    private MultiAutoCompleteTextView multiAutoCompleteTextViewKeyword;
    private AutoCompleteTextView autoCompleteTextViewLocation;
    private EditText editTextExpSal;
    private AutoCompleteTextView autoCompleteTextViewIndustry;
    private MultiAutoCompleteTextView multiAutoCompleteTextViewJobCatagory;
    private AutoCompleteTextView autoCompleteTextViewRole;
    private EditText editTextNameOfJobAlert;
    private AppCompatButton buttonSaveKindOfJob;


    private void initializeViews() {
        multiAutoCompleteTextViewKeyword = (MultiAutoCompleteTextView)findViewById( R.id.multiAutoCompleteTextView_keyword );
        autoCompleteTextViewLocation = (AutoCompleteTextView)findViewById( R.id.autoCompleteTextView_location );
        editTextExpSal = (EditText)findViewById( R.id.editText_exp_sal );
        autoCompleteTextViewIndustry = (AutoCompleteTextView)findViewById( R.id.autoCompleteTextView_industry );
        multiAutoCompleteTextViewJobCatagory = (MultiAutoCompleteTextView)findViewById( R.id.multiAutoCompleteTextView_job_catagory );
        autoCompleteTextViewRole = (AutoCompleteTextView)findViewById( R.id.autoCompleteTextView_role );
        editTextNameOfJobAlert = (EditText)findViewById( R.id.editText_nameOfJobAlert );
        buttonSaveKindOfJob = (AppCompatButton)findViewById( R.id.button_save_kind_of_job );

        buttonSaveKindOfJob.setOnClickListener( this );
    }


    @Override
    public void onClick(View v) {
        if ( v == buttonSaveKindOfJob ) {
            // Handle clicks for buttonSaveKindOfJob
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kind_of_job);
        initializeViews();
    }
}
