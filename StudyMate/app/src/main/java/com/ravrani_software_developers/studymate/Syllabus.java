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

public class Syllabus extends AppCompatActivity {
    private Spinner spinner,course;
    ListView listView;
    ListViewAdapter listViewAdapter,listViewAdapter2,listViewAdapter3,listViewAdapter4,listViewAdapter5,listViewAdapter6
            ,listViewAdapterEC,listViewAdapterEC2,listViewAdapterEC3,listViewAdapterEC4,listViewAdapterEC5,listViewAdapterEC6
            ,listViewAdapterElect,listViewAdapterElect2,listViewAdapterElect3,listViewAdapterElect4,listViewAdapterElect5,listViewAdapterElect6
            ,listViewAdapterIC,listViewAdapterIC2,listViewAdapterIC3,listViewAdapterIC4,listViewAdapterIC5,listViewAdapterIC6
            ,listViewAdapterBIO,listViewAdapterBIO2,listViewAdapterBIO3,listViewAdapterBIO4,listViewAdapterBIO5,listViewAdapterBIO6
            ,listViewAdapterMech,listViewAdapterMech2,listViewAdapterMech3,listViewAdapterMech4,listViewAdapterMech5,listViewAdapterMech6
            ,listViewAdapterCivil,listViewAdapterCivil2,listViewAdapterCivil3,listViewAdapterCivil4,listViewAdapterCivil5,listViewAdapterCivil6;

//    Computer Department Diploma
//    Subjects Semester wise

//    Semester 1
    private final static String subName[] = {"Basic Mathematics","English","Environment Conservation and Hazard Management","Computer Programming","Fundamental of Digital Electronics","Fundamental of Computer Application"};
    private final static String subCode[] = {"3300001","3300002","3300003","3310701","3310702","3310703"};

//    Semester 2
    private final static String subName2[] = {"Basic Physics","Advanced Mathematics Group-1","Basic Electronics","Advanced Computer Programming","Static Web Page Designing","Contributor Personality Development"};
    private final static String subCode2[] = {"3300005","3320002","3320701","3320702","3320703","3990001"};

//    Semester 3
    private final static String subName3[] = {"Operating System","Programming in C++","Database Management System","Data Structure","Microprocessor and Assembly Language Programming"};
    private final static String subCode3[] = {"3330701","3330702","3330703","3330704","3330705"};

//    Semester 4
    private final static String subName4[] = {"Advanced Database Management System","Computer Networks",".Net Programming","Computer Organization and Architecture","Web Development Tools","Fundamentals of Software Development"};
    private final static String subCode4[] = {"3340701","3340702","3340704","3340705","3340706","3341603"};

//    Semester 5
    private final static String subName5[] = {"Computer Management and Trouble \nShooting","Dynamic Web Page Development","Java Programming","Computer And Network Security","Multimedia and Animation techniques"};
    private final static String subCode5[] = {"3350701","3350702","3350703","3350704","3350705"};

//    Semester 6
    private final static String subName6[] = {"Advance Java Programming","Professional Practices Using Database","Network Management and Administration","Dynamic Web Page with Scripting \nLanguage","Mobile Computing and Application Development","Advanced Web Technology"};
    private final static String subCode6[] = {"3360701","3360702","3360703","3360705","3360704","3360706"};
	
//    Mechanical Department Diploma
//    Subjects Semester wise

//    Semester 1
    private final static String subNameM[] = {"Basic Mathematics","English","Environment Conservation and Hazard Management","Engineering Physics","Basic Engineering Drawing","Engineering Workshop Practice"};
    private final static String subCodeM[] = {"3300001","3300002","3300003","3300004","3300007","3301901"};

//    Semester 2
    private final static String subNameM2[] = {"Advance Mathematics Group-2","Aplied Mechanics","Material Science and Metallurgy","Basic of Civil Engineering","Mechanical Drafting","Contributor Personality Development"};
    private final static String subCodeM2[] = {"3320003","3300008","3321902","3320004","3321901","1990001"};

//    Semester 3
    private final static String subNameM3[] = {"Manufacturing Engineering-I","Thermodynamics","Fluid Mechanics And Hydraulic Machines","Strength of Material","Applied Electrical and Electronics Engineering","Computer Aided Machine Drawing","Human Resource Management"};
    private final static String subCodeM3[] = {"3331901","3331902","3331903","3331904","3331905","3331906","3330001"};

//    Semester 4
    private final static String subNameM4[] = {"Manufacturing Engineering-II","Thermal Engineering-I","Theory of Machines","Computer Aided Design","Metrology and Instrumentation","Plant Maintenance and Safety"};
	private final static String subCodeM4[] = {"3341901","3341902","3341903","3341904","3341905","3341906"};

//    Semester 5
    private final static String subNameM5[] = {"Thermal Engineering-II","Design of Machine Elements","Manufacturing Engineering-III","Industrial Engineering","Estimating, Costing and Contracting","Self Employment and Enterpreneurship Development","Project-I"};	
	private final static String subCodeM5[] = {"3351901","3351902","3351903","3351904","3351905","3351906","3351908"};

//    Semester 6
    private final static String subNameM6[] = {"Computer Aided Manufacturing","Tool Engineering","Industrial Management","Manufacturing Systems","Fabrication Technology","Project-II"};
	private final static String subCodeM6[] = {"3361901","3361902","3361903","3361904","3361905","3361910"};
	
//    EC Department Diploma
//    Subjects Semester wise

//    Semester 1
    private final static String subNameEC[] = {"Basic Matematics","English","Basic Physics","Basics of Computer & Information Technology","Electronic Components & Practice","Basic of Electrical Engineering"};
	private final static String subCodeEC[] = {"3300001","3300002","3300005","3300013","3311101","3320901"};

//    Semester 2
    private final static String subNameEC2[] = {"Environment Conservation and Hazard Management","Advance Mathematics Group-1","Electronic Circuits and Applications","Electronic Networks","Electronics Workshop"};
	private final static String subCodeEC2[] = {"3300003","3320002","3321101","3321102","3321103"};
	
//    Semester 3
    private final static String subNameEC3[] = {"Antenna and Wave Propagation","Analog Electronics","Principles of Electronic Communication","Digital Logic Design","Programming in C"};
	private final static String subCodeEC3[] = {"3331101","3331102","3331103","3331104","3331105"};
	
//    Semester 4
    private final static String subNameEC4[] = {"MALP","Digital Communication","Optical Communication","Electronics Instruments and Measurement","Industrial Electronics","Circuit Design Tools"};
	private final static String subCodeEC4[] = {"3341101","3341102","3341103","3341104","3341105","3341106"};
	
//    Semester 5
    private final static String subNameEC5[] = {"MicroController","Mobile Communication","MicroWave and Radar Engineering","Software Lab Practice","Computer Networks","Instrumentation and Control Engineering","Project - I"};
	private final static String subCodeEC5[] = {"3351101","3351102","3351103","3351104","3351105","3351106","3351107"};
	
//    Semester 6
    private final static String subNameEC6[] = {"Enterpreneurship and Industrial Management","Consumer Electronics","Maintenance of Electronics Equipment","VLSI","Embedded System","Multimedia Communication","Industrial Automation","Robotics & Autotronics","Project - II"};
	private final static String subCodeEC6[] = {"3361101","3361102","3361103","3361104","3361105","3361106","3361107","3361108","3361109"};
	
//    IC Department Diploma
//    Subjects Semester wise

//    Semester 1
    private final static String subNameIC[] = {"Basic Mathematics","English","Environment Conservation and Hazard Management","Basic Instrumentation","Instrumentation Workshop","Principles of Chemical Engineering"};
	private final static String subCodeIC[] = {"3300001","3300002","3300003","3311701","3311702","3311703"};

//    Semester 2
    private final static String subNameIC2[] = {"Basic Physics","Industrial Transducers","Instrumentation Device Materials","Instrumentation Devices and Components","Instrument Configuration Practices"};
	private final static String subCodeIC2[] = {"3300005","3321701","3321702","3321703","3321704"};
	
//    Semester 3
    private final static String subNameIC3[] = {"Safety Instrumented Systems and Safety Integrated Level","Telemetry System","Digital Techniques","Control Components","Process Application and Instrumentation Maintenance Management","Instrumentaion Drawing"};
	private final static String subCodeIC3[] = {"3331701","3331702","3331703","3331704","3331705","3331706"};
	
//    Semester 4
    private final static String subNameIC4[] = {"Control Instrumentation System","Programmable Logic Controller and Distributed Control System","Process Instrumentation-I","Bio-Medical Instrumentation","Instrumentation Simulation Practices"};
	private final static String subCodeIC4[] = {"3341701","3341702","3341703","3341704","3341705"};
	
//    Semester 5
    private final static String subNameIC5[] = {"Electronic and Pneumatic Instrumentation","Process Instrumentation-II","Analytical Instrumentation","PLC Programming","Microprocessor and Microcontroller in Instrumentation"};
	private final static String subCodeIC5[] = {"3351701","3351702","3351703","3351704","3351705"};
	
//    Semester 6
    private final static String subNameIC6[] = {"Applied Instrumentation","Industrial Power Control","DCS and SCADA","Industrial Data Communication","PIC Microcontroller and Embedded Systems","Embedded Networks","Project-II (With Seminar)"};
	private final static String subCodeIC6[] = {"3361701","3361702","3361703","3361704","3361705","3361706","3361707"};	
	
//    Civil Department Diploma
//    Subjects Semester wise

//    Semester 1
    private final static String subNameCivil[] = {"Basic Mathematics","Computer Application & Graphics","English","Environment Conservation and Hazard Management","Engineering Physics Group-1","Basics Engineering Drawing"};
	private final static String subCodeCivil[] = {"3300001","3300012","3300002","3300003","3300004","3300007"};

//    Semester 2
    private final static String subNameCivil2[] = {"Advance Mathematics Group-2","Applied Mechanics","Applied Chemistry Group-1","Building Drawing","Basic Mechanical Engineering","Civil Engineering WorkShop Practice"};
	private final static String subCodeCivil2[] = {"3320003","3300008","3300009","3320601","3320602","3320603"};
	
//    Semester 3
    private final static String subNameCivil3[] = {"Building Materials","Construction Technology","Hydraulics","Structural Mechanics","Surveying"};
	private final static String subCodeCivil3[] = {"3330601","3330602","3330603","3330604","3330605"};
	
//    Semester 4
    private final static String subNameCivil4[] = {"Structural Mechanics-II","Advanced Surveying","Basic Transportation Engineering","Water Resources Management","Soil Mechanics","Computer Aided Drawing"};
	private final static String subCodeCivil4[] = {"3340601","3340602","3340603","3340604","3340605","3340606"};
	
//    Semester 5
    private final static String subNameCivil5[] = {"Design of Steel Structure","Concrete Technology","Water Supply & Sanitary Engineering","Estimating Costing & Valuation","Highway Engineering","Project-I"};
	private final static String subCodeCivil5[] = {"3350601","3350602","3350603","3350604","3350606","3350609"};
	
//    Semester 6
    private final static String subNameCivil6[] = {"Design of Reinforced Concete Structure","Construction Quality Control & Monitoring","Construction Project Management","Railway, Harbour and Tunnel Engineering","Traffic Engineering","Project-II"};
	private final static String subCodeCivil6[] = {"3360601","3360602","3360603","3360606","3360607","3360613"};	
	
//    BIO Department Diploma
//    Subjects Semester wise

//    Semester 1
    private final static String subNameBIO[] = {"Basic Mathematics","English","Environment Conservation and Hazard Management","Engineering Chemistry Group-2","Basic of Computer and Information Technology","Electronic Components & Practice"};
	private final static String subCodeBIO[] = {"3300001","3300002","3300003","3300006","3300013","3311101"};

//    Semester 2
    private final static String subNameBIO2[] = {"CPD","Basic Physics","Fundamentals of Digital Electronics","Advance Mathematics Group-1","Human Anatomy","Human Physiology"};
	private final static String subCodeBIO2[] = {"1190001","3300005","3310702","3320002","3320301","3320302"};

//    Semester 3
    private final static String subNameBIO3[] = {"Human Resource Management","Basic Electronics","Data Communication and Networking","Medical Electronics","Medical Sensors and Measurement Techniques"};
	private final static String subCodeBIO3[] = {"3330001","3330301","3330302","3330303","3330304"};
	
//    Semester 4
    private final static String subNameBIO4[] = {"Entrepreneurship Development","Microprocessor and Assembly Language Programming","Hospital Management and Information System","Diagnostic Medical Instrumentation","Analytical and Optical Instrumentation","Seminar"};
	private final static String subCodeBIO4[] = {"3340001","3340302","3340303","3340304","3340305","3340306"};
	
//    Semester 5
    private final static String subNameBIO5[] = {"Microprocessor Applications in Medical Technology","Medical Imaging Techniques","Critical Care Instrumentation","Therapeutic Medical Instrumentation"};
	private final static String subCodeBIO5[] = {"3350301","3350302","3350303","3350304"};
	
//    Semester 6
    private final static String subNameBIO6[] = {"BIO-Medical Digital Signal Processing","Rehabilitation Engineering","Telemedical Instrumentation","Ophthalmic Instrumenation","Virtual Medial Instrumentation","Bio Materials and Implants","Project-II"};
	private final static String subCodeBIO6[] = {"3360301","3360302","3360303","3360304","3360305","3360306","3360307"};	
	
//    Electrical Department Diploma
//    Subjects Semester wise

//    Semester 1
    private final static String subNameE[] = {"Basic Mathematics","English","Environment Conservation and Hazard Management","Engineering Chemistry Group-2","Basic of Computer & Information Technology","Fundamental of Mechanical Engineering"};
	private final static String subCodeE[] = {"3300001","3300002","3300003","3300006","3300013","3300015"};

//    Semester 2
    private final static String subNameE2[] = {"Basic Physics Group-2","Basic Engineering Drawing","Advance Mathematics Group-1","Basics of Civil  Engineering","Electrical Engineering Workshop Practise","DC Circuits"};
	private final static String subCodeE2[] = {"3300005","3300007","3320002","3320004","3320902","3320903"};
	
//    Semester 3
    private final static String subNameE3[] = {"AC Circuits","DC Machines and Transformers","Electrical Instrumentation","Electric Power Generation","Electronic Components And Circuits"};
	private final static String subCodeE3[] = {"3330901","3330902","3330903","3330904","3330905"};
	
//    Semester 4
    private final static String subNameE4[] = {"Poly Phase Transformers and Rotating AC Machines","Tranmission and Distribution of Electrical Power","Utilization of Electrical Enenrgy","Digital Electronics and Digital Instruments","Computer Aided Electrical Drawing and Simulation"};
	private final static String subCodeE4[] = {"3340901","3340902","3340903","3340904","3340905"};
	
//    Semester 5
    private final static String subNameE5[] = {"Wiring Estimating Costing And Contracting","Energy Conservation And Audit","Power Electronics","Microprocessor and Controller Applications","Wind And Solar Energy Systems","Special Electrical Machines","Electric Traction and Control"};
	private final static String subCodeE5[] = {"3350901","3350902","3350903","3350904","3350905","3350906","3350907"};
	
//    Semester 6
    private final static String subNameE6[] = {"Power System Operation and Control","Substraction Engineering and Power Quality","Design Parameters of Electrical Equipement and Machines","Electrical Drives","Maintenance of Transformer and Circuit Breaker","Electrification of Building Complexes"};
	private final static String subCodeE6[] = {"3360903","3360904","3360905","3360906","3360907","3360908"};	
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        listView = (ListView)findViewById(R.id.list);

//        Adapter for Computer Department
        listViewAdapter = new ListViewAdapter(this, subName, subCode);
        listViewAdapter2 = new ListViewAdapter(this, subName2, subCode2);
        listViewAdapter3 = new ListViewAdapter(this, subName3, subCode3);
        listViewAdapter4 = new ListViewAdapter(this, subName4, subCode4);
        listViewAdapter5 = new ListViewAdapter(this, subName5, subCode5);
        listViewAdapter6 = new ListViewAdapter(this, subName6, subCode6);

//        Adapter for EC Department
        listViewAdapterEC = new ListViewAdapter(this, subNameEC, subCodeEC);
        listViewAdapterEC2 = new ListViewAdapter(this, subNameEC2, subCodeEC2);
        listViewAdapterEC3 = new ListViewAdapter(this, subNameEC3, subCodeEC3);
        listViewAdapterEC4 = new ListViewAdapter(this, subNameEC4, subCodeEC4);
        listViewAdapterEC5 = new ListViewAdapter(this, subNameEC5, subCodeEC5);
        listViewAdapterEC6 = new ListViewAdapter(this, subNameEC6, subCodeEC6);

//        Adapter for Electrical Department
        listViewAdapterElect = new ListViewAdapter(this, subNameE, subCodeE);
        listViewAdapterElect2 = new ListViewAdapter(this, subNameE2, subCodeE2);
        listViewAdapterElect3 = new ListViewAdapter(this, subNameE3, subCodeE3);
        listViewAdapterElect4 = new ListViewAdapter(this, subNameE4, subCodeE4);
        listViewAdapterElect5 = new ListViewAdapter(this, subNameE5, subCodeE5);
        listViewAdapterElect6 = new ListViewAdapter(this, subNameE6, subCodeE6);

//        Adapter for IC Department
        listViewAdapterIC = new ListViewAdapter(this, subNameIC, subCodeIC);
        listViewAdapterIC2 = new ListViewAdapter(this, subNameIC2, subCodeIC2);
        listViewAdapterIC3 = new ListViewAdapter(this, subNameIC3, subCodeIC3);
        listViewAdapterIC4 = new ListViewAdapter(this, subNameIC4, subCodeIC4);
        listViewAdapterIC5 = new ListViewAdapter(this, subNameIC5, subCodeIC5);
        listViewAdapterIC6 = new ListViewAdapter(this, subNameIC6, subCodeIC6);

//        Adapter for BIO Department
        listViewAdapterBIO = new ListViewAdapter(this, subNameBIO, subCodeBIO);
        listViewAdapterBIO2 = new ListViewAdapter(this, subNameBIO2, subCodeBIO2);
        listViewAdapterBIO3 = new ListViewAdapter(this, subNameBIO3, subCodeBIO3);
        listViewAdapterBIO4 = new ListViewAdapter(this, subNameBIO4, subCodeBIO4);
        listViewAdapterBIO5 = new ListViewAdapter(this, subNameBIO5, subCodeBIO5);
        listViewAdapterBIO6 = new ListViewAdapter(this, subNameBIO6, subCodeBIO6);

//        Adapter for Mechanical Department
        listViewAdapterMech = new ListViewAdapter(this, subNameM, subCodeM);
        listViewAdapterMech2 = new ListViewAdapter(this, subNameM2, subCodeM2);
        listViewAdapterMech3 = new ListViewAdapter(this, subNameM3, subCodeM3);
        listViewAdapterMech4 = new ListViewAdapter(this, subNameM4, subCodeM4);
        listViewAdapterMech5 = new ListViewAdapter(this, subNameM5, subCodeM5);
        listViewAdapterMech6 = new ListViewAdapter(this, subNameM6, subCodeM6);

//        Adapter for Civil Department
        listViewAdapterCivil = new ListViewAdapter(this, subNameCivil, subCodeCivil);
        listViewAdapterCivil2 = new ListViewAdapter(this, subNameCivil2, subCodeCivil2);
        listViewAdapterCivil3 = new ListViewAdapter(this, subNameCivil3, subCodeCivil3);
        listViewAdapterCivil4 = new ListViewAdapter(this, subNameCivil4, subCodeCivil4);
        listViewAdapterCivil5 = new ListViewAdapter(this, subNameCivil5, subCodeCivil5);
        listViewAdapterCivil6 = new ListViewAdapter(this, subNameCivil6, subCodeCivil6);

//        Spinner for course
        course = (Spinner)findViewById(R.id.course);
        ArrayAdapter<CharSequence> adaptercourse = ArrayAdapter.createFromResource(this, R.array.course,
                android.R.layout.simple_spinner_item);

        adaptercourse.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        course.setAdapter(adaptercourse);

//        Spinner for semester
        spinner = (Spinner) findViewById(R.id.spinner);
//        Computer
        final ArrayAdapter<CharSequence> adapterCom = ArrayAdapter.createFromResource(this,
                R.array.syllabus_computer, android.R.layout.simple_spinner_item);

//        Mechanical
        final ArrayAdapter<CharSequence> adapterM = ArrayAdapter.createFromResource(this,
                R.array.syllabus_mechanical, android.R.layout.simple_spinner_item);

//        Civil
        final ArrayAdapter<CharSequence> adapterCivil = ArrayAdapter.createFromResource(this,
                R.array.syllabus_civil, android.R.layout.simple_spinner_item);

//        Electrical
        final ArrayAdapter<CharSequence> adapterElect = ArrayAdapter.createFromResource(this,
                R.array.syllabus_electrical, android.R.layout.simple_spinner_item);

//        BIO
        final ArrayAdapter<CharSequence> adapterBIO = ArrayAdapter.createFromResource(this,
                R.array.syllabus_bio, android.R.layout.simple_spinner_item);

//        EC
        final ArrayAdapter<CharSequence> adapterEC = ArrayAdapter.createFromResource(this,
                R.array.syllabus_ec, android.R.layout.simple_spinner_item);

//        IC
        final ArrayAdapter<CharSequence> adapterIC = ArrayAdapter.createFromResource(this,
                R.array.syllabus_ic, android.R.layout.simple_spinner_item);

        course.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (course.getSelectedItem().toString().equals("Computer")){
                    spinner.setAdapter(adapterCom);
                    adapterCom.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapter);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i){
                                                case 0:
                                                    String pdf = "https://parthravrani.github.io/studymate/syllabus/computer%20department/sem1/3300001%20Basic%20Mathematics.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf);
                                                    intent.putExtra("sub_names","Basic Mathematics");
                                                    intent.putExtra("sub_codes","3300001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_english = "https://parthravrani.github.io/studymate/syllabus/computer department/sem1/3300002 English.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_english);
                                                    intent.putExtra("sub_names","English");
                                                    intent.putExtra("sub_codes","3300002");
                                                    startActivity(intent);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapter2);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i){
                                                case 0:
                                                    Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                                                    break;
                                                case 1:
                                                    Toast.makeText(getApplicationContext(),"Hello Again!!!",Toast.LENGTH_SHORT).show();
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapter3);
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapter4);
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapter5);
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapter6);
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Mechanical")){
                    spinner.setAdapter(adapterM);
                    adapterM.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterMech);
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterMech2);
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterMech3);
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterMech4);
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterMech5);
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterMech6);
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Civil")){
                    spinner.setAdapter(adapterCivil);
                    adapterCivil.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterCivil);
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterCivil2);
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterCivil3);
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterCivil4);
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterCivil5);
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterCivil6);
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Electrical")){
                    spinner.setAdapter(adapterElect);
                    adapterElect.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterElect);
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterElect2);
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterElect3);
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterElect4);
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterElect5);
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterElect6);
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Bio - Medical")){
                    spinner.setAdapter(adapterBIO);
                    adapterBIO.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterBIO);
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterBIO2);
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterBIO3);
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterBIO4);
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterBIO5);
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterBIO6);
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Electronic Communication")){
                    spinner.setAdapter(adapterEC);
                    adapterEC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterEC);
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterEC2);
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterEC3);
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterEC4);
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterEC5);
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterEC6);
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Instrumentation Control")){
                    spinner.setAdapter(adapterIC);
                    adapterIC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterIC);
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterIC2);
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterIC3);
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterIC4);
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterIC5);
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterIC6);
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
