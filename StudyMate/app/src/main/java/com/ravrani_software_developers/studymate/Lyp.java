package com.ravrani_software_developers.studymate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class Lyp extends AppCompatActivity {
    private Spinner spinner;
    ListView listView;
    ListViewAdapter listViewAdapter,listViewAdapter2,listViewAdapter3,listViewAdapter4,listViewAdapter5,listViewAdapter6;

    private final static String subName[] = {"Basic Mathematics","English","Environment Conservation and Hazard Management","Computer Programming","Fundamental of Digital Electronics","Fundamental of Computer Application"};
    private final static String subCode[] = {"3300001","3300002","3300003","3310701","3310702","3310703"};

    private final static String subName2[] = {"Basic Physics","Advanced Mathematics","Basic Electronics","Advanced Computer Programming","Static Web Page Designing","Contributor Personality Development"};
    private final static String subCode2[] = {"3300005","3320002","3320701","3320702","3320703","3990001"};

    private final static String subName3[] = {"Operating System","Programming in C++","Database Management System","Data Structure","Microprocessor and Assembly Language Programming"};
    private final static String subCode3[] = {"3330701","3330702","3330703","3330704","3330705"};

    private final static String subName4[] = {"Advanced Database Management System","Computer Networks",".Net Programming","Computer Organization and Architecture","Web Development Tools","Fundamentals of Software Development"};
    private final static String subCode4[] = {"3340701","3340702","3340704","3340705","3340706","3341603"};

    private final static String subName5[] = {"Computer Management and Trouble \nShooting","Dynamic Web Page Development","Java Programming","Computer And Network Security"};
    private final static String subCode5[] = {"3350701","3350702","3350703","3350704"};

    private final static String subName6[] = {"Advance Java Programming","Network Management and Administration","Dynamic Web Page with Scripting \nLanguage","Mobile Computing and Application Development","Advanced Web Technology"};
    private final static String subCode6[] = {"3360701","3360703","3360705","3360704","3360706"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyp);

        listView = (ListView)findViewById(R.id.list_lyp);
        listViewAdapter = new ListViewAdapter(this, subName, subCode);

        listViewAdapter2 = new ListViewAdapter(this, subName2, subCode2);
        listViewAdapter3 = new ListViewAdapter(this, subName3, subCode3);
        listViewAdapter4 = new ListViewAdapter(this, subName4, subCode4);
        listViewAdapter5 = new ListViewAdapter(this, subName5, subCode5);
        listViewAdapter6 = new ListViewAdapter(this, subName6, subCode6);

        spinner = (Spinner) findViewById(R.id.spinner_lyp);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.syllabus_computer, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (spinner.getSelectedItem().toString().equals("Semester : 1")){
                    listView.setAdapter(listViewAdapter);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i){
                                case 0:
                                    String pdf = "http://www.bbit.ac.in/course/sem1mathematics.pdf";
                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                    intent.putExtra("url_pdf",pdf);
                                    startActivity(intent);
                                    break;
                                case 1:
                                    String pdf_english = "http://www.bbit.ac.in/course/sem1english.pdf";
                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                    intent.putExtra("url_pdf",pdf_english);
                                    startActivity(intent);
                                    break;
                            }
                        }
                    });
                }
                else if (spinner.getSelectedItem().toString().equals("Semester : 2")){
                    listView.setAdapter(listViewAdapter2);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i){
                                case 0:
                                    Toast.makeText(getApplicationContext(),"Parth Sem2",Toast.LENGTH_LONG).show();
                                    break;
                                case 1:
                                    Toast.makeText(getApplicationContext(),"Parth Bhai Sem2",Toast.LENGTH_LONG).show();
                                    break;
                            }
                        }
                    });
                }
                else if (spinner.getSelectedItem().toString().equals("Semester : 3")){
                    listView.setAdapter(listViewAdapter3);
                }
                else if (spinner.getSelectedItem().toString().equals("Semester : 4")){
                    listView.setAdapter(listViewAdapter4);
                }
                else if (spinner.getSelectedItem().toString().equals("Semester : 5")){
                    listView.setAdapter(listViewAdapter5);
                }
                else if (spinner.getSelectedItem().toString().equals("Semester : 6")){
                    listView.setAdapter(listViewAdapter6);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
