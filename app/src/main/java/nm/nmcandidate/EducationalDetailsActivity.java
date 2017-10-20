package nm.nmcandidate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EducationalDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_details);
        Intent intent = new Intent(EducationalDetailsActivity.this, NMProfileDetailActivity.class);
        startActivity(intent);
    }
}
