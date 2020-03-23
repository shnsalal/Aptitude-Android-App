package com.example.shaan.main_project._16_SimpleInterest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shaan.main_project.R;

public class Simple_Interest_Calculator extends AppCompatActivity {


    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple__interest_calculator);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                                 Bundle savedInstanceState) {
            Button button1;
            final TextView textView1;
            final EditText editText1,editText2,editText3;
            if(getArguments().getInt(ARG_SECTION_NUMBER)==1) {
                View rootView = inflater.inflate(R.layout.fragment_fragment_si1, container, false);
                editText1 = (EditText)rootView.findViewById(R.id.SI_editText11);
                editText2 = (EditText)rootView.findViewById(R.id.SI_editText21);
                editText3 = (EditText)rootView.findViewById(R.id.SI_editText31);
                button1= (Button)rootView.findViewById(R.id.SI_button11);
                textView1 = (TextView)rootView.findViewById(R.id.SI_textView11);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(editText1.getText().toString().length()==0)
                        {
                            editText1.setError("Enter principal value");
                            return;
                        }
                        if(editText2.getText().toString().length()==0)
                        {
                            editText2.setError("Enter Rate in percentage");
                            return;
                        }
                        if(editText3.getText().toString().length()==0)
                        {
                            editText3.setError("Enter Time in year");
                            return;
                        }
                        Double principal = Double.parseDouble(editText1.getText().toString());
                        Double rate = Double.parseDouble(editText2.getText().toString());
                        Double time = Double.parseDouble(editText3.getText().toString());
                        Double ans = principal*rate*time;
                        Double si = ans/100;
                        textView1.setText("Simple Interest : " + si);
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==2) {
                View rootView = inflater.inflate(R.layout.fragment_fragment_si2, container, false);
                editText1 = (EditText)rootView.findViewById(R.id.SI_editText11);
                editText2 = (EditText)rootView.findViewById(R.id.SI_editText21);
                editText3 = (EditText)rootView.findViewById(R.id.SI_editText31);
                button1= (Button)rootView.findViewById(R.id.SI_button11);
                textView1 = (TextView)rootView.findViewById(R.id.SI_textView11);

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(editText1.getText().toString().length()==0)
                        {
                            editText1.setError("Enter Simple Interest");
                            return;
                        }
                        if(editText2.getText().toString().length()==0)
                        {
                            editText2.setError("Enter Rate in percentage");
                            return;
                        }
                        if(editText3.getText().toString().length()==0)
                        {
                            editText3.setError("Enter Time in year");
                            return;
                        }
                        Double si = Double.parseDouble(editText1.getText().toString());
                        Double rate = Double.parseDouble(editText2.getText().toString());
                        Double time = Double.parseDouble(editText3.getText().toString());
                        Double principal = (si*100)/(rate*time);
                        textView1.setText("Principal : " + principal);
                    }
                });
                return rootView;
            }
            else if(getArguments().getInt(ARG_SECTION_NUMBER)==3) {
                View rootView = inflater.inflate(R.layout.fragment_fragment_si3, container, false);
                editText1 = (EditText)rootView.findViewById(R.id.SI_editText11);
                editText2 = (EditText)rootView.findViewById(R.id.SI_editText21);
                editText3 = (EditText)rootView.findViewById(R.id.SI_editText31);
                button1= (Button)rootView.findViewById(R.id.SI_button11);
                textView1 = (TextView)rootView.findViewById(R.id.SI_textView11);

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(editText1.getText().toString().length()==0)
                        {
                            editText1.setError("Enter Simple Interest");
                            return;
                        }
                        if(editText2.getText().toString().length()==0)
                        {
                            editText2.setError("Enter Principal");
                            return;
                        }
                        if(editText3.getText().toString().length()==0)
                        {
                            editText3.setError("Enter Time in year");
                            return;
                        }
                        Double si = Double.parseDouble(editText1.getText().toString());
                        Double principal = Double.parseDouble(editText2.getText().toString());
                        Double time = Double.parseDouble(editText3.getText().toString());
                        Double rate = (si*100)/(principal*time);
                        textView1.setText("Rate : " + rate+"%");
                    }
                });
                return rootView;
            }
            else{
                View rootView = inflater.inflate(R.layout.fragment_fragment_si4, container, false);
                editText1 = (EditText)rootView.findViewById(R.id.SI_editText11);
                editText2 = (EditText)rootView.findViewById(R.id.SI_editText21);
                editText3 = (EditText)rootView.findViewById(R.id.SI_editText31);
                button1= (Button)rootView.findViewById(R.id.SI_button11);
                textView1 = (TextView)rootView.findViewById(R.id.SI_textView11);

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(editText1.getText().toString().length()==0)
                        {
                            editText1.setError("Enter Simple Interest");
                            return;
                        }
                        if(editText2.getText().toString().length()==0)
                        {
                            editText2.setError("Enter Rate in percentage");
                            return;
                        }
                        if(editText3.getText().toString().length()==0)
                        {
                            editText3.setError("Enter Principal value");
                            return;
                        }
                        Double si = Double.parseDouble(editText1.getText().toString());
                        Double rate = Double.parseDouble(editText2.getText().toString());
                        Double principal = Double.parseDouble(editText3.getText().toString());
                        Double time = (si*100)/(rate*principal);
                        textView1.setText("Time : " + time);
                    }
                });
                return rootView;
            }
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }
    }
}
