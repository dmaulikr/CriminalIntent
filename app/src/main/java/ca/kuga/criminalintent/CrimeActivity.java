package ca.kuga.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        //getting fragment manager (beacuse of support)
        FragmentManager fm = getSupportFragmentManager();

        //adding CrimeFragment
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new CrimeFragment();
            //adds and commits fragment
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }


    }
}
