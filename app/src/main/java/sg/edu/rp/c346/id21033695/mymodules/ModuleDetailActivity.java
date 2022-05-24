package sg.edu.rp.c346.id21033695.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModuleCode;
    TextView tvModuleName;
    TextView tvYear;
    TextView tvSemester;
    TextView tvModuleCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleCode = findViewById(R.id.moduleCode);
        tvModuleName = findViewById(R.id.moduleName);
        tvYear = findViewById(R.id.academicYear);
        tvSemester = findViewById(R.id.semester);
        tvModuleCredit = findViewById(R.id.moduleCredit);
        tvVenue = findViewById(R.id.venue);

        Intent intentReceivedModuleCode = getIntent();
        String moduleCode = intentReceivedModuleCode.getStringExtra("Module Code");
        tvModuleCode.setText("Module Code: " + moduleCode);

        Intent intentReceivedModuleName = getIntent();
        String moduleName = intentReceivedModuleName .getStringExtra("Module Name");
        tvModuleName.setText("Module Name: " + moduleName);

        Intent intentReceivedYear = getIntent();
        int year = intentReceivedYear.getIntExtra("Academic Year", 0);
        tvYear.setText("Academic Year: " + year);

        Intent intentReceivedSemester = getIntent();
        int semester = intentReceivedSemester.getIntExtra("Semester", 0);
        tvSemester.setText("Semester: " + semester);

        Intent intentReceivedModuleCredit = getIntent();
        int moduleCredit = intentReceivedModuleCredit.getIntExtra("Module Credit", 0);
        tvModuleCredit.setText("Module Credit: " + moduleCredit);

        Intent intentReceivedVenue = getIntent();
        String venue = intentReceivedVenue.getStringExtra("Venue");
        tvVenue.setText("Venue: " + venue);


    }
}