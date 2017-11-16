package com.ravrani_software_developers.studymate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

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
    private final static String subName2[] = {"Basic Physics","Advanced Mathematics Group-1","Basic Electronics","Advanced Computer Programming","Static Web Page Designing"};
    private final static String subCode2[] = {"3300005","3320002","3320701","3320702","3320703"};

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
                    final String ce_pdf = "https://parthravrani.github.io/studymate/syllabus/computer%20department/";
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
                                                    String pdf = ce_pdf+"sem1/3300001%20Basic%20Mathematics.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf);
                                                    intent.putExtra("sub_names","Basic Mathematics");
                                                    intent.putExtra("sub_codes","3300001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_english = ce_pdf+"sem1/3300002%20English.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_english);
                                                    intent.putExtra("sub_names","English");
                                                    intent.putExtra("sub_codes","3300002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_echm = ce_pdf+"sem1/3300003%20Environment%20Conservation%20and%20Hazard%20Management%20.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_echm);
                                                    intent.putExtra("sub_names","Environment Conservation and Hazard Management");
                                                    intent.putExtra("sub_codes","3300003");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_cp = ce_pdf+"sem1/3310701%20Computer%20programming.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_cp);
                                                    intent.putExtra("sub_names","Computer programming");
                                                    intent.putExtra("sub_codes","3310701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_fde = ce_pdf+"sem1/3310702%20Fundamentals%20of%20Digital%20Electronics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_fde);
                                                    intent.putExtra("sub_names","Fundamental of Digital Electronics");
                                                    intent.putExtra("sub_codes","3310702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_fca = ce_pdf+"sem1/3310703%20Fundamentals%20of%20Computer%20Application.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_fca);
                                                    intent.putExtra("sub_names","Fundamentals of Computer Application");
                                                    intent.putExtra("sub_codes","3310703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
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
                                                    String pdf_bp = ce_pdf+"sem2/3300005%20Basic%20Physics%20Group-2.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_bp);
                                                    intent.putExtra("sub_names","Basic Physics Group-2");
                                                    intent.putExtra("sub_codes","3300005");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_am = ce_pdf+"sem2/3320002%20Advance%20Mathematics%20Group-1.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_am);
                                                    intent.putExtra("sub_names","Advance Mathematics Group-1");
                                                    intent.putExtra("sub_codes","3320002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_be = ce_pdf+"sem2/3320701%20Basic%20Electronics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_be);
                                                    intent.putExtra("sub_names","Basic Electronics");
                                                    intent.putExtra("sub_codes","3320701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_acp = ce_pdf+"sem2/3320702%20Advanced%20Computer%20Programming.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_acp);
                                                    intent.putExtra("sub_names","Advanced Computer Programming");
                                                    intent.putExtra("sub_codes","3320702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_wpd = ce_pdf+"sem2/3320703%20Static%20Webpage%20Designing.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_wpd);
                                                    intent.putExtra("sub_names","Static Webpage Designing");
                                                    intent.putExtra("sub_codes","3320703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapter3);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_os = ce_pdf+"sem3/3330701%20Operating%20Systems.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_os);
                                                    intent.putExtra("sub_names","Operating Systems");
                                                    intent.putExtra("sub_codes","3330701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_c = ce_pdf+"sem3/3330702%20Programming%20in%20C++.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_c);
                                                    intent.putExtra("sub_names","Programming in C++");
                                                    intent.putExtra("sub_codes","3330702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_dbms = ce_pdf+"sem3/3330703%20DBMS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_dbms);
                                                    intent.putExtra("sub_names","Database Management System");
                                                    intent.putExtra("sub_codes","3330703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_ds = ce_pdf+"sem3/3330704%20Data%20Structures.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_ds);
                                                    intent.putExtra("sub_names","Data Structures");
                                                    intent.putExtra("sub_codes","3330704");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_malp = ce_pdf+"sem3/3330705%20MALP.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_malp);
                                                    intent.putExtra("sub_names","Microprocessor and Assembly Language Programming");
                                                    intent.putExtra("sub_codes","3330705");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapter4);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_adbms = ce_pdf+"sem4/3340701%20ADVANCED%20DBMS.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_adbms);
                                                    intent.putExtra("sub_names","Advanced Database Management System");
                                                    intent.putExtra("sub_codes","3340701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_cn = ce_pdf+"sem4/3340702%20COMPUTER%20NETWORKS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_cn);
                                                    intent.putExtra("sub_names","Computer Networks");
                                                    intent.putExtra("sub_codes","3340702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_net = ce_pdf+"sem4/3340704%20DOT%20NET%20PROGRAMMING.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_net);
                                                    intent.putExtra("sub_names",".Net Programming");
                                                    intent.putExtra("sub_codes","3340704");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_coa = ce_pdf+"sem4/3340705%20%20COMPUTER%20ORGANIZATION%20AND%20ARCHITECTURE.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_coa);
                                                    intent.putExtra("sub_names","Computer Organization and Architecture");
                                                    intent.putExtra("sub_codes","3340705");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_wdt = ce_pdf+"sem4/3340706%20WEB%20DEVELOPMENT%20TOOLS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_wdt);
                                                    intent.putExtra("sub_names","Web Development Tools");
                                                    intent.putExtra("sub_codes","3340706");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_fsd = ce_pdf+"sem4/3341603%20FUNDAMENTALS%20OF%20SOFTWARE%20DEVELOPMENT.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_fsd);
                                                    intent.putExtra("sub_names","Fundamentals of Software Development");
                                                    intent.putExtra("sub_codes","3341603");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapter5);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_cmt = ce_pdf+"sem5/3350701%20COMPUTER%20MAINTENANCE%20AND%20TROUBLE%20SHOOTING.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_cmt);
                                                    intent.putExtra("sub_names","Computer Maintenance and Trouble Shooting");
                                                    intent.putExtra("sub_codes","3350701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_dwpd = ce_pdf+"sem5/3350702%20DYNAMIC%20WEB%20PAGE%20DEVELOPMENT.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_dwpd);
                                                    intent.putExtra("sub_names","Dynamic Web Page Develpoment");
                                                    intent.putExtra("sub_codes","3350702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_jp = ce_pdf+"sem5/3350703%20JAVA%20PROGRAMMING.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_jp);
                                                    intent.putExtra("sub_names","Java Programming");
                                                    intent.putExtra("sub_codes","3350703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_cns = ce_pdf+"sem5/3350704%20COMPUTER%20AND%20NETWORK%20SECURITY.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_cns);
                                                    intent.putExtra("sub_names","Computer And Network Security");
                                                    intent.putExtra("sub_codes","3350704");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_mat = ce_pdf+"sem5/3350705%20MULTIMEDIA%20AND%20ANIMATION%20TECHNIQUES.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf",pdf_mat);
                                                    intent.putExtra("sub_names","Multimedia and Animation techniques");
                                                    intent.putExtra("sub_codes","3350705");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapter6);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_ajp = ce_pdf + "sem6/3360701%20ADVANCE%20JAVA%20PROGRAMMING.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ajp);
                                                    intent.putExtra("sub_names", "Advance Java Programming");
                                                    intent.putExtra("sub_codes", "3360701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_ppud = ce_pdf + "sem6/3360702%20PROFESSIONAL%20PRACTICES%20USING%20DATABASE.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ppud);
                                                    intent.putExtra("sub_names", "Professional Practices Using Database");
                                                    intent.putExtra("sub_codes", "3360702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_nma = ce_pdf + "sem6/3360703%20NETWORK%20MANAGEMENT%20AND%20ADMINISTRATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_nma);
                                                    intent.putExtra("sub_names", "Network Management and Administration");
                                                    intent.putExtra("sub_codes", "3360703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_dwpsl = ce_pdf + "sem6/3360705%20DYNAMIC%20WEBPAGE%20WITH%20SCRIPTING%20LANGUAGE.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dwpsl);
                                                    intent.putExtra("sub_names", "Dynamic Webpage with Scripting Language");
                                                    intent.putExtra("sub_codes", "3360705");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_mca = ce_pdf + "sem6/3360704%20MOBILE%20COMPUTING%20AND%20APPLICATION%20DEVELOPMENT.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mca);
                                                    intent.putExtra("sub_names", "Mobile Computing and Application Development");
                                                    intent.putExtra("sub_codes", "3360704");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_awt = ce_pdf + "sem6/3360706%20ADVANCE%20WEB%20TECHNOLOGY.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_awt);
                                                    intent.putExtra("sub_names", "Advanced Web Technology");
                                                    intent.putExtra("sub_codes", "3360706");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;

                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Mechanical")){
                    final String m_pdf = "https://parthravrani.github.io/studymate/syllabus/mechanical/";
                    spinner.setAdapter(adapterM);
                    adapterM.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterMech);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf = m_pdf + "sem1/3300001%20Basic%20Mathematics.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf);
                                                    intent.putExtra("sub_names", "Basic Mathematics");
                                                    intent.putExtra("sub_codes", "3300001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_english = m_pdf + "sem1/3300002%20English.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_english);
                                                    intent.putExtra("sub_names", "English");
                                                    intent.putExtra("sub_codes", "3300002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_echm = m_pdf + "sem1/3300003%20Environment%20Conservation%20and%20Hazard%20Management.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_echm);
                                                    intent.putExtra("sub_names", "Environment Conservation and Hazard Management");
                                                    intent.putExtra("sub_codes", "3300003");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_ep = m_pdf + "sem1/3300004%20Engineering%20Physics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ep);
                                                    intent.putExtra("sub_names", "Engineering Physics");
                                                    intent.putExtra("sub_codes", "3300004");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_bed = m_pdf + "sem1/3300007%20Basic%20Engineering%20Drawing.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bed);
                                                    intent.putExtra("sub_names", "Basic Engineering Drawing");
                                                    intent.putExtra("sub_codes", "3300007");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_ewp = m_pdf + "sem1/3301901%20Engineering%20Workshop%20Practice.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ewp);
                                                    intent.putExtra("sub_names", "Engineering Workshop Practice");
                                                    intent.putExtra("sub_codes", "3301901");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterMech2);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_amg = m_pdf + "sem2/3320003%20Advance%20Mathematics%20Group-2.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_amg);
                                                    intent.putExtra("sub_names", "Advance Mathematics Group-2");
                                                    intent.putExtra("sub_codes", "3320003");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_am = m_pdf + "sem2/3300008%20Aplied%20Mechanics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_am);
                                                    intent.putExtra("sub_names", "Aplied Mechanics");
                                                    intent.putExtra("sub_codes", "3300008");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_mcm = m_pdf + "sem2/3321902%20Material%20Science%20and%20Metallurgy.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mcm);
                                                    intent.putExtra("sub_names", "Material Science and Metallurgy");
                                                    intent.putExtra("sub_codes", "3321902");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_bce = m_pdf + "sem2/3320004%20Basic%20of%20Civil%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bce);
                                                    intent.putExtra("sub_names", "Basic of Civil Engineering");
                                                    intent.putExtra("sub_codes", "3320004");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_md = m_pdf + "sem2/3321901%20Mechanical%20Drafting.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_md);
                                                    intent.putExtra("sub_names", "Mechanical Drafting");
                                                    intent.putExtra("sub_codes", "3321901");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_cpd = m_pdf + "sem2/1990001%20Contributor%20Personality%20Development.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cpd);
                                                    intent.putExtra("sub_names", "Contributor Personality Development");
                                                    intent.putExtra("sub_codes", "1990001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterMech3);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_me = m_pdf + "sem3/3331901%20Manufacturing%20Engineering-I.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_me);
                                                    intent.putExtra("sub_names", "Manufacturing Engineering-I");
                                                    intent.putExtra("sub_codes", "3331901");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_th = m_pdf + "sem3/3331902%20Thermodynamics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_th);
                                                    intent.putExtra("sub_names", "Thermodynamics");
                                                    intent.putExtra("sub_codes", "3331902");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_fmhm = m_pdf + "sem3/3331903%20Fluid%20Mechanics%20And%20Hydraulic%20Machines.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_fmhm);
                                                    intent.putExtra("sub_names", "Fluid Mechanics And Hydraulic Machines");
                                                    intent.putExtra("sub_codes", "3331903");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_sm = m_pdf + "sem3/3331904%20Strength%20of%20Material.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_sm);
                                                    intent.putExtra("sub_names", "Strength of Material");
                                                    intent.putExtra("sub_codes", "3331904");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_aeee = m_pdf + "sem3/3331905%20Applied%20Electrical%20and%20Electronics%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_aeee);
                                                    intent.putExtra("sub_names", "Applied Electrical and Electronics Engineering");
                                                    intent.putExtra("sub_codes", "3331905");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_camd = m_pdf + "sem3/3331906%20Computer%20Aided%20Machine%20Drawing.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_camd);
                                                    intent.putExtra("sub_names", "Computer Aided Machine Drawing");
                                                    intent.putExtra("sub_codes", "3331906");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 6:
                                                    String pdf_hrm = m_pdf + "sem3/3330001%20Human%20Resource%20Management.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_hrm);
                                                    intent.putExtra("sub_names", "Human Resource Management");
                                                    intent.putExtra("sub_codes", "3330001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterMech4);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_me2 = m_pdf + "sem4/3341901%20Manufacturing%20Engineering-II.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_me2);
                                                    intent.putExtra("sub_names", "Manufacturing Engineering-II");
                                                    intent.putExtra("sub_codes", "3341901");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_te = m_pdf + "sem4/3341902%20Thermal%20Engineering-I.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_te);
                                                    intent.putExtra("sub_names", "Thermal Engineering-I");
                                                    intent.putExtra("sub_codes", "3341902");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_tm = m_pdf + "sem4/3341903%20Theory%20of%20Machines.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_tm);
                                                    intent.putExtra("sub_names", "Theory of Machines");
                                                    intent.putExtra("sub_codes", "3341903");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_cad = m_pdf + "sem4/3341904%20Computer%20Aided%20Design.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cad);
                                                    intent.putExtra("sub_names", "Computer Aided Design");
                                                    intent.putExtra("sub_codes", "3341904");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_mi = m_pdf + "sem4/3341905%20Metrology%20and%20Instrumentation.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mi);
                                                    intent.putExtra("sub_names", "Metrology and Instrumentation");
                                                    intent.putExtra("sub_codes", "3341905");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_pms = m_pdf + "sem4/3341906%20Plant%20Maintenance%20and%20Safety.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_pms);
                                                    intent.putExtra("sub_names", "Plant Maintenance and Safety");
                                                    intent.putExtra("sub_codes", "3341906");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterMech5);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_te2 = m_pdf + "sem5/3351901%20Thermal%20Engineering-II.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_te2);
                                                    intent.putExtra("sub_names", "Thermal Engineering-II");
                                                    intent.putExtra("sub_codes", "3351901");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_dme = m_pdf + "sem5/3351902%20Design%20of%20Machine%20Elements.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dme);
                                                    intent.putExtra("sub_names", "Design of Machine Elements");
                                                    intent.putExtra("sub_codes", "3351902");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_me3 = m_pdf + "sem5/3351903%20Manufacturing%20Engineering-III.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_me3);
                                                    intent.putExtra("sub_names", "Manufacturing Engineering-III");
                                                    intent.putExtra("sub_codes", "3351903");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_ie = m_pdf + "sem5/3351904%20Industrial%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ie);
                                                    intent.putExtra("sub_names", "Industrial Engineering");
                                                    intent.putExtra("sub_codes", "3351904");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_ecc = m_pdf + "sem5/3351905%20Estimating,%20Costing%20and%20Contracting.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ecc);
                                                    intent.putExtra("sub_names", "Estimating, Costing and Contracting");
                                                    intent.putExtra("sub_codes", "3351905");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_seed = m_pdf + "sem5/3351906%20Self%20Employment%20and%20Enterpreneurship%20Development.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_seed);
                                                    intent.putExtra("sub_names", "Self Employment and Enterpreneurship Development");
                                                    intent.putExtra("sub_codes", "3351906");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 6:
                                                    String pdf_proj = m_pdf + "sem5/3351908%20Project-I.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_proj);
                                                    intent.putExtra("sub_names", "Project-I");
                                                    intent.putExtra("sub_codes", "3351908");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterMech6);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_cam = m_pdf + "sem6/3361901%20Computer%20Aided%20Manufacturing.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cam);
                                                    intent.putExtra("sub_names", "Computer Aided Manufacturing");
                                                    intent.putExtra("sub_codes", "3361901");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_te = m_pdf + "sem6/3361902%20Tool%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_te);
                                                    intent.putExtra("sub_names", "Tool Engineering");
                                                    intent.putExtra("sub_codes", "3361902");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_im = m_pdf + "sem6/3361903%20Industrial%20Management.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_im);
                                                    intent.putExtra("sub_names", "Industrial Management");
                                                    intent.putExtra("sub_codes", "3361903");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_ms = m_pdf + "sem6/3361904%20Manufacturing%20Systems.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ms);
                                                    intent.putExtra("sub_names", "Manufacturing Systems");
                                                    intent.putExtra("sub_codes", "3361904");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_ft = m_pdf + "sem6/3361905%20Fabrication%20Technology.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ft);
                                                    intent.putExtra("sub_names", "Fabrication Technology");
                                                    intent.putExtra("sub_codes", "3361905");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_proj2 = m_pdf + "sem6/3361910%20Project-II.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_proj2);
                                                    intent.putExtra("sub_names", "Project-II");
                                                    intent.putExtra("sub_codes", "3361910");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Civil")){
                    final String c_pdf = "https://parthravrani.github.io/studymate/syllabus/civil/";
                    spinner.setAdapter(adapterCivil);
                    adapterCivil.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterCivil);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_bm = c_pdf + "sem1/3300001%20Basics%20Mathematics.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bm);
                                                    intent.putExtra("sub_names", "Basic Mathematics");
                                                    intent.putExtra("sub_codes", "3300001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_cag = c_pdf + "sem1/3300012%20Computer%20Application%20&%20Graphics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cag);
                                                    intent.putExtra("sub_names", "Computer Application & Graphics");
                                                    intent.putExtra("sub_codes", "3300012");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_eng = c_pdf + "sem1/3300002%20English.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_eng);
                                                    intent.putExtra("sub_names", "English");
                                                    intent.putExtra("sub_codes", "3300002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_echm = c_pdf + "sem1/3300003%20Environment%20Conservation%20and%20Hazard%20Management.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_echm);
                                                    intent.putExtra("sub_names", "Environment Conservation and Hazard Management");
                                                    intent.putExtra("sub_codes", "3300003");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_ep1 = c_pdf + "sem1/3300004%20Engineering%20Physics%20Group-1.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ep1);
                                                    intent.putExtra("sub_names", "Engineering Physics Group-1");
                                                    intent.putExtra("sub_codes", "3300004");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_bed = c_pdf + "sem1/3300007%20Basics%20Engineering%20Drawing.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bed);
                                                    intent.putExtra("sub_names", "Basics Engineering Drawing");
                                                    intent.putExtra("sub_codes", "3300007");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterCivil2);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_am2 = c_pdf + "sem2/3320003%20Advance%20Mathematics%20Group-2.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_am2);
                                                    intent.putExtra("sub_names", "Advance Mathematics Group-2");
                                                    intent.putExtra("sub_codes", "3320003");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_am = c_pdf + "sem2/3300008%20Applied%20Mechanics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_am);
                                                    intent.putExtra("sub_names", "Applied Mechanics");
                                                    intent.putExtra("sub_codes", "3300008");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_ac1 = c_pdf + "sem2/3300009%20Applied%20Chemistry%20Group-1.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ac1);
                                                    intent.putExtra("sub_names", "Applied Chemistry Group-1");
                                                    intent.putExtra("sub_codes", "3300009");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_bd = c_pdf + "sem2/3320601%20Building%20Drawing.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bd);
                                                    intent.putExtra("sub_names", "Building Drawing");
                                                    intent.putExtra("sub_codes", "3320601");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_bme = c_pdf + "sem2/3320602%20Basic%20Mechanical%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bme);
                                                    intent.putExtra("sub_names", "Basic Mechanical Engineering");
                                                    intent.putExtra("sub_codes", "3320602");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_cewp = c_pdf + "sem2/3320603%20Civil%20Engineering%20WorkShop%20Practice.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cewp);
                                                    intent.putExtra("sub_names", "Civil Engineering WorkShop Practice");
                                                    intent.putExtra("sub_codes", "3320603");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterCivil3);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_bm = c_pdf + "sem3/3330601%20Building%20Materials.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bm);
                                                    intent.putExtra("sub_names", "Building Materials");
                                                    intent.putExtra("sub_codes", "3330601");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_ct = c_pdf + "sem3/3330602%20Construction%20Technology.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ct);
                                                    intent.putExtra("sub_names", "Construction Technology");
                                                    intent.putExtra("sub_codes", "3330602");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_hd = c_pdf + "sem3/3330603%20Hydraulics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_hd);
                                                    intent.putExtra("sub_names", "Hydraulics");
                                                    intent.putExtra("sub_codes", "3330603");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_sm = c_pdf + "sem3/3330604%20Structural%20Mechanics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_sm);
                                                    intent.putExtra("sub_names", "Structural Mechanics");
                                                    intent.putExtra("sub_codes", "3330604");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_s = c_pdf + "sem3/3330605%20Surveying.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_s);
                                                    intent.putExtra("sub_names", "Surveying");
                                                    intent.putExtra("sub_codes", "3330605");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterCivil4);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_sm2 = c_pdf + "sem4/3340601%20Structural%20Mechanics-II.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_sm2);
                                                    intent.putExtra("sub_names", "Structural Mechanics-II");
                                                    intent.putExtra("sub_codes", "3340601");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_as = c_pdf + "sem4/3340602%20Advanced%20Surveying.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_as);
                                                    intent.putExtra("sub_names", "Advanced Surveying");
                                                    intent.putExtra("sub_codes", "3340602");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_bte = c_pdf + "sem4/3340603%20Basic%20Transportation%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bte);
                                                    intent.putExtra("sub_names", "Basic Transportation Engineering");
                                                    intent.putExtra("sub_codes", "3340603");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_wrm = c_pdf + "sem4/3340604%20Water%20Resources%20Management.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_wrm);
                                                    intent.putExtra("sub_names", "Water Resources Management");
                                                    intent.putExtra("sub_codes", "3340604");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_sm = c_pdf + "sem4/3340605%20Soil%20Mechanics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_sm);
                                                    intent.putExtra("sub_names", "Soil Mechanics");
                                                    intent.putExtra("sub_codes", "3340605");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_cad = c_pdf + "sem4/3340606%20Computer%20Aided%20Drawing.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cad);
                                                    intent.putExtra("sub_names", "Computer Aided Drawing");
                                                    intent.putExtra("sub_codes", "3340606");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterCivil5);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_dss = c_pdf + "sem5/3350601%20Design%20of%20Steel%20Structure.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dss);
                                                    intent.putExtra("sub_names", "Design of Steel Structure");
                                                    intent.putExtra("sub_codes", "3350601");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_cte = c_pdf + "sem5/3350602%20Concrete%20Technology.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cte);
                                                    intent.putExtra("sub_names", "Concrete Technology");
                                                    intent.putExtra("sub_codes", "3350602");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_wsse = c_pdf + "sem5/3350603%20Water%20Supply%20&%20Sanitary%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_wsse);
                                                    intent.putExtra("sub_names", "Water Supply & Sanitary Engineering");
                                                    intent.putExtra("sub_codes", "3350603");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_ecv = c_pdf + "sem5/3350604%20Estimating%20Costing%20&%20Valuation.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ecv);
                                                    intent.putExtra("sub_names", "Estimating Costing & Valuation");
                                                    intent.putExtra("sub_codes", "3350604");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_he = c_pdf + "sem5/3350606%20Highway%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_he);
                                                    intent.putExtra("sub_names", "Highway Engineering");
                                                    intent.putExtra("sub_codes", "3350606");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_proj1 = c_pdf + "sem5/3350609%20Project-I.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_proj1);
                                                    intent.putExtra("sub_names", "Project-I");
                                                    intent.putExtra("sub_codes", "3350609");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterCivil6);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_drcs = c_pdf + "sem6/3360601%20Design%20of%20Reinforced%20Concete%20Structure.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_drcs);
                                                    intent.putExtra("sub_names", "Design of Reinforced Concete Structure");
                                                    intent.putExtra("sub_codes", "3360601");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_cqcm = c_pdf + "sem6/3360602%20Construction%20Quality%20Control%20&%20Monitoring.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cqcm);
                                                    intent.putExtra("sub_names", "Construction Quality Control & Monitoring");
                                                    intent.putExtra("sub_codes", "3360602");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_cpm = c_pdf + "sem6/3360603%20Construction%20Project%20Management.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cpm);
                                                    intent.putExtra("sub_names", "Construction Project Management");
                                                    intent.putExtra("sub_codes", "3360603");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_rhte = c_pdf + "sem6/3360606%20Railway,%20Harbour%20and%20Tunnel%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_rhte);
                                                    intent.putExtra("sub_names", "Railway, Harbour and Tunnel Engineering");
                                                    intent.putExtra("sub_codes", "3360606");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_te = c_pdf + "sem6/3360607%20Traffic%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_te);
                                                    intent.putExtra("sub_names", "Traffic Engineering");
                                                    intent.putExtra("sub_codes", "3360607");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_proj2 = c_pdf + "sem6/3360613%20Project-II.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_proj2);
                                                    intent.putExtra("sub_names", "Project-II");
                                                    intent.putExtra("sub_codes", "3360613");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Electrical")){
                    final String e_pdf = "https://parthravrani.github.io/studymate/syllabus/electrical/";
                    spinner.setAdapter(adapterElect);
                    adapterElect.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterElect);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_bm = e_pdf + "sem1/3300001%20Basic%20Mathematics.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bm);
                                                    intent.putExtra("sub_names", "Basic Mathematics");
                                                    intent.putExtra("sub_codes", "3300001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_eng = e_pdf + "sem1/3300002%20English.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_eng);
                                                    intent.putExtra("sub_names", "English");
                                                    intent.putExtra("sub_codes", "3300002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_echm = e_pdf + "sem1/3300003%20Environment%20Conservation%20and%20Hazard%20Management%20.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_echm);
                                                    intent.putExtra("sub_names", "Environment Conservation and Hazard Management");
                                                    intent.putExtra("sub_codes", "3300003");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_ecg = e_pdf + "sem1/3300006%20Engineering%20Chemistry%20Group-2.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ecg);
                                                    intent.putExtra("sub_names", "Engineering Chemistry Group-2");
                                                    intent.putExtra("sub_codes", "3300006");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_bcit = e_pdf + "sem1/3300013%20Basic%20of%20Computer%20&%20information%20Technology%20.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bcit);
                                                    intent.putExtra("sub_names", "Basic of Computer & Information Technology");
                                                    intent.putExtra("sub_codes", "3300013");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_fme = e_pdf + "sem1/3300015%20Fundamental%20of%20Mechanical%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_fme);
                                                    intent.putExtra("sub_names", "Fundamental of Mechanical Engineering");
                                                    intent.putExtra("sub_codes", "3300015");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterElect2);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_bpg = e_pdf + "sem2/3300005%20Basic%20Physics%20Group-2.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bpg);
                                                    intent.putExtra("sub_names", "Basic Physics Group-2");
                                                    intent.putExtra("sub_codes", "3300005");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_bed = e_pdf + "sem2/3300007%20Basic%20Engineering%20Drawing.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bed);
                                                    intent.putExtra("sub_names", "Basic Engineering Drawing");
                                                    intent.putExtra("sub_codes", "3300007");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_am1 = e_pdf + "sem2/3320002%20Advance%20Mathematics%20Group-1.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_am1);
                                                    intent.putExtra("sub_names", "Advance Mathematics Group-1");
                                                    intent.putExtra("sub_codes", "3320002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_bce = e_pdf + "sem2/3320004%20Basics%20Of%20Civil%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bce);
                                                    intent.putExtra("sub_names", "Basics of Civil  Engineering");
                                                    intent.putExtra("sub_codes", "3320004");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_eewp = e_pdf + "sem2/3320902%20Electrical%20Engineering%20Workshop%20Practise.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_eewp);
                                                    intent.putExtra("sub_names", "Electrical Engineering Workshop Practise");
                                                    intent.putExtra("sub_codes", "3320902");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_dcs = e_pdf + "sem2/3320903%20DC%20Circuits.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dcs);
                                                    intent.putExtra("sub_names", "DC Circuits");
                                                    intent.putExtra("sub_codes", "3320903");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterElect3);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_acs = e_pdf + "sem3/3330901%20AC%20Circuits.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_acs);
                                                    intent.putExtra("sub_names", "AC Circuits");
                                                    intent.putExtra("sub_codes", "3330901");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_dmt = e_pdf + "sem3/3330902%20DC%20Machines%20and%20Transformers.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dmt);
                                                    intent.putExtra("sub_names", "DC Machines and Transformers");
                                                    intent.putExtra("sub_codes", "3330902");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_ei = e_pdf + "sem3/3330903%20Electrical%20Instrumentation.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ei);
                                                    intent.putExtra("sub_names", "Electrical Instrumentation");
                                                    intent.putExtra("sub_codes", "3330903");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_epg = e_pdf + "sem3/3330904%20Electric%20Power%20Generation.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_epg);
                                                    intent.putExtra("sub_names", "Electric Power Generation");
                                                    intent.putExtra("sub_codes", "3330904");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_ecc = e_pdf + "sem3/3330905%20Electronic%20Components%20And%20Circuits.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ecc);
                                                    intent.putExtra("sub_names", "Electronic Components And Circuits");
                                                    intent.putExtra("sub_codes", "3330905");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterElect4);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_pptrm = e_pdf + "sem4/3340901%20POLY%20PHASE%20TRANSFORMERS%20AND%20ROTATING%20AC%20MACHINES.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_pptrm);
                                                    intent.putExtra("sub_names", "Poly Phase Transformers and Rotating AC Machines");
                                                    intent.putExtra("sub_codes", "3340901");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_tde = e_pdf + "sem4/3340902%20%20TRANSMISSION%20AND%20DISTRIBUTION%20OF%20ELECTRICAL%20POWER.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_tde);
                                                    intent.putExtra("sub_names", "Tranmission and Distribution of Electrical Power");
                                                    intent.putExtra("sub_codes", "3340902");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_uee = e_pdf + "sem4/3340903%20UTILIZATION%20OF%20ELECTRICAL%20ENERGY.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_uee);
                                                    intent.putExtra("sub_names", "Utilization of Electrical Enenrgy");
                                                    intent.putExtra("sub_codes", "3340903");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_dedi = e_pdf + "sem4/3340904%20DIGITAL%20ELECTRONICS%20AND%20DIGITAL%20INSTRUMENTS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dedi);
                                                    intent.putExtra("sub_names", "Digital Electronics and Digital Instruments");
                                                    intent.putExtra("sub_codes", "3340904");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_caeds = e_pdf + "sem4/3340905%20COMPUTER%20AIDED%20ELECTRICAL%20DRAWING%20AND%20SIMULATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_caeds);
                                                    intent.putExtra("sub_names", "Computer Aided Electrical Drawing and Simulation");
                                                    intent.putExtra("sub_codes", "3340905");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterElect5);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_wecc = e_pdf + "sem5/3350901%20WIRING%20ESTIMATING%20COSTING%20AND%20CONTRACTING.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_wecc);
                                                    intent.putExtra("sub_names", "Wiring Estimating Costing And Contracting");
                                                    intent.putExtra("sub_codes", "3350901");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_eca = e_pdf + "sem5/3350902%20ENERGY%20CONSERVATION%20&%20AUDIT.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_eca);
                                                    intent.putExtra("sub_names", "Energy Conservation And Audit");
                                                    intent.putExtra("sub_codes", "3350902");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_pe = e_pdf + "sem5/3350903%20POWER%20ELECTRONICS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_pe);
                                                    intent.putExtra("sub_names", "Power Electronics");
                                                    intent.putExtra("sub_codes", "3350903");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_mca = e_pdf + "sem5/3350904%20MICROPROCESSOR%20AND%20CONTROLLER%20APPLICATIONS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mca);
                                                    intent.putExtra("sub_names", "Microprocessor and Controller Applications");
                                                    intent.putExtra("sub_codes", "3350904");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_wse = e_pdf + "sem5/3350905%20WIND%20AND%20SOLAR%20ENERGY%20SYSTEMS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_wse);
                                                    intent.putExtra("sub_names", "Wind And Solar Energy Systems");
                                                    intent.putExtra("sub_codes", "3350905");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_sem = e_pdf + "sem5/3350906%20SPECIAL%20ELECTRICAL%20MACHINES.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_sem);
                                                    intent.putExtra("sub_names", "Special Electrical Machines");
                                                    intent.putExtra("sub_codes", "3350906");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 6:
                                                    String pdf_etc = e_pdf + "sem5/3350907%20ELECTRIC%20TRACTION%20AND%20CONTROL.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_etc);
                                                    intent.putExtra("sub_names", "Electric Traction and Control");
                                                    intent.putExtra("sub_codes", "3350907");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterElect6);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_psoc = e_pdf + "sem6/3360903%20POWER%20SYSTEM%20OPERATION%20AND%20CONTROL.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_psoc);
                                                    intent.putExtra("sub_names", "Power System Operation and Control");
                                                    intent.putExtra("sub_codes", "3360903");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_sepq = e_pdf + "sem6/3360904%20SUBSTATION%20ENGINEERING%20AND%20POWER%20QUALITY.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_sepq);
                                                    intent.putExtra("sub_names", "Substraction Engineering and Power Quality");
                                                    intent.putExtra("sub_codes", "3360904");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_dpem = e_pdf + "sem6/3360905%20%20DESIGN%20PARAMETERS%20OF%20ELECTRICAL%20EQUIPEMENT%20AND%20MACHINES.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dpem);
                                                    intent.putExtra("sub_names", "Design Parameters of Electrical Equipement and Machines");
                                                    intent.putExtra("sub_codes", "3360905");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_ed = e_pdf + "sem6/3360906%20%20ELECTRICAL%20DRIVES.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ed);
                                                    intent.putExtra("sub_names", "Electrical Drives");
                                                    intent.putExtra("sub_codes", "3360906");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_mtb = e_pdf + "sem6/3360907%20MAINTENANCE%20OF%20TRANSFORMER%20AND%20CIRCUIT%20BREAKER.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mtb);
                                                    intent.putExtra("sub_names", "Maintenance of Transformer and Circuit Breaker");
                                                    intent.putExtra("sub_codes", "3360907");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_ebc = e_pdf + "sem6/3360908%20ELECTRIFICATION%20OF%20BUILDING%20COMPLEXES.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ebc);
                                                    intent.putExtra("sub_names", "Electrification of Building Complexes");
                                                    intent.putExtra("sub_codes", "3360908");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Bio - Medical")){
                    final String bio_pdf = "https://parthravrani.github.io/studymate/syllabus/bio-medical/";
                    spinner.setAdapter(adapterBIO);
                    adapterBIO.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterBIO);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_bm = bio_pdf + "sem1/3300001%20Basic%20Mathematics.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bm);
                                                    intent.putExtra("sub_names", "Basic Mathematics");
                                                    intent.putExtra("sub_codes", "3300001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_eng = bio_pdf + "sem1/3300002%20English.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_eng);
                                                    intent.putExtra("sub_names", "English");
                                                    intent.putExtra("sub_codes", "3300002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_echm = bio_pdf + "sem1/3300003%20Environment%20Conservation%20and%20Hazard%20Management%20.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_echm);
                                                    intent.putExtra("sub_names", "Environment Conservation and Hazard Management");
                                                    intent.putExtra("sub_codes", "3300003");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_ec = bio_pdf + "sem1/3300006%20Engineering%20Chemistry%20Group-2.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ec);
                                                    intent.putExtra("sub_names", "Engineering Chemistry Group-2");
                                                    intent.putExtra("sub_codes", "3300006");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_bcit = bio_pdf + "sem1/3300013%20Basic%20of%20Computer%20And%20information%20Technology%20.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bcit);
                                                    intent.putExtra("sub_names", "Basic of Computer and Information Technology");
                                                    intent.putExtra("sub_codes", "3300013");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_ecp = bio_pdf + "sem1/3311101%20Electronic%20Components%20&%20Practice.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ecp);
                                                    intent.putExtra("sub_names", "Electronic Components & Practice");
                                                    intent.putExtra("sub_codes", "3311101");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterBIO2);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_cpd = bio_pdf + "sem2/1190001%20CPD.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cpd);
                                                    intent.putExtra("sub_names", "CPD");
                                                    intent.putExtra("sub_codes", "1190001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_bp = bio_pdf + "sem2/3300005%20Basic%20Physics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bp);
                                                    intent.putExtra("sub_names", "Basic Physics");
                                                    intent.putExtra("sub_codes", "3300005");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_fde = bio_pdf + "sem2/3310702%20Fundamentals%20of%20Digital%20Electronics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_fde);
                                                    intent.putExtra("sub_names", "Fundamentals of Digital Electronics");
                                                    intent.putExtra("sub_codes", "3310702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_am = bio_pdf + "sem2/3320002%20Advance%20Mathemetics%20Group-1.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_am);
                                                    intent.putExtra("sub_names", "Advance Mathematics Group-1");
                                                    intent.putExtra("sub_codes", "3320002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_ha = bio_pdf + "sem2/3320301%20Human%20Anatomy.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ha);
                                                    intent.putExtra("sub_names", "Human Anatomy");
                                                    intent.putExtra("sub_codes", "3320301");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_hp = bio_pdf + "sem2/3320302%20Human%20Physiology.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_hp);
                                                    intent.putExtra("sub_names", "Human Physiology");
                                                    intent.putExtra("sub_codes", "3320302");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterBIO3);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_hrm = bio_pdf + "sem3/3330001%20Human%20Resource%20Management.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_hrm);
                                                    intent.putExtra("sub_names", "Human Resource Management");
                                                    intent.putExtra("sub_codes", "3330001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_be = bio_pdf + "sem3/3330301%20Basic%20Electronics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_be);
                                                    intent.putExtra("sub_names", "Basic Electronics");
                                                    intent.putExtra("sub_codes", "3330301");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_dcn = bio_pdf + "sem3/3330302%20Data%20Communications%20And%20Networking.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dcn);
                                                    intent.putExtra("sub_names", "Data Communication and Networking");
                                                    intent.putExtra("sub_codes", "3330302");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_me = bio_pdf + "sem3/3330303%20Medical%20Electronics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_me);
                                                    intent.putExtra("sub_names", "Medical Electronics");
                                                    intent.putExtra("sub_codes", "3330303");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_msmt = bio_pdf + "sem3/3330304%20Medical%20Sensors%20and%20Measurement%20Techniques.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_msmt);
                                                    intent.putExtra("sub_names", "Medical Sensors and Measurement Techniques");
                                                    intent.putExtra("sub_codes", "3330304");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterBIO4);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_ed = bio_pdf + "sem4/3340001%20ENTREPRENEURSHIP%20DEVELOPMENT.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ed);
                                                    intent.putExtra("sub_names", "Entrepreneurship Development");
                                                    intent.putExtra("sub_codes", "3340001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_malp = bio_pdf + "sem4/3340302%20MICROPROCESSOR%20AND%20ASSEMBLY%20LANGUAGE%20PROGRAMMING.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_malp);
                                                    intent.putExtra("sub_names", "Microprocessor and Assembly Language Programming");
                                                    intent.putExtra("sub_codes", "3340302");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_hmis = bio_pdf + "sem4/3340303%20%20HOSPITAL%20MANAGEMENT%20AND%20INFORMATION%20SYSTEM.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_hmis);
                                                    intent.putExtra("sub_names", "Hospital Management and Information System");
                                                    intent.putExtra("sub_codes", "3340303");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_dmi = bio_pdf + "sem4/3340304%20DIAGNOSTIC%20MEDICAL%20INSTRUMENTATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dmi);
                                                    intent.putExtra("sub_names", "Diagnostic Medical Instrumentation");
                                                    intent.putExtra("sub_codes", "3340304");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_aoi = bio_pdf + "sem4/3340305%20%20ANALYTICAL%20AND%20OPTICAL%20INSTRUMENTATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_aoi);
                                                    intent.putExtra("sub_names", "Analytical and Optical Instrumentation");
                                                    intent.putExtra("sub_codes", "3340305");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_s = bio_pdf + "sem4/3340306%20SEMINAR.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_s);
                                                    intent.putExtra("sub_names", "Seminar");
                                                    intent.putExtra("sub_codes", "3340306");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterBIO5);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_mamt = bio_pdf + "sem5/3350301%20MICROPROCESSOR%20APPLICATIONS%20IN%20MEDICAL%20TECHNOLOGY.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mamt);
                                                    intent.putExtra("sub_names", "Microprocessor Applications in Medical Technology");
                                                    intent.putExtra("sub_codes", "3350301");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_mmt = bio_pdf + "sem5/3350302%20MEDICAL%20IMAGING%20TECHNIQUES.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mmt);
                                                    intent.putExtra("sub_names", "Medical Imaging Techniques");
                                                    intent.putExtra("sub_codes", "3350302");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_cci = bio_pdf + "sem5/3350303%20CRITICAL%20CARE%20INSTRUMENTATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cci);
                                                    intent.putExtra("sub_names", "Critical Care Instrumentation");
                                                    intent.putExtra("sub_codes", "3350303");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_tmi = bio_pdf + "sem5/3350304%20THERAPEUTIC%20MEDICAL%20INSTRUMENTATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_tmi);
                                                    intent.putExtra("sub_names", "Therapeutic Medical Instrumentation");
                                                    intent.putExtra("sub_codes", "3350304");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterBIO6);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_bdsp = bio_pdf + "sem6/3360301%20BIO-MEDICAL%20DIGITAL%20SIGNAL%20PROCESSING.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bdsp);
                                                    intent.putExtra("sub_names", "BIO-Medical Digital Signal Processing");
                                                    intent.putExtra("sub_codes", "3360301");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_re = bio_pdf + "sem6/3360302%20REHABILITATION%20ENGINEERING.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_re);
                                                    intent.putExtra("sub_names", "Rehabilitation Engineering");
                                                    intent.putExtra("sub_codes", "3360302");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_ti = bio_pdf + "sem6/3360303%20TELEMEDICAL%20INSTRUMENTATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ti);
                                                    intent.putExtra("sub_names", "Telemedical Instrumentation");
                                                    intent.putExtra("sub_codes", "3360303");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_oi = bio_pdf + "sem6/3360304%20OPHTHALMIC%20INSTRUMENTATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_oi);
                                                    intent.putExtra("sub_names", "Ophthalmic Instrumenation");
                                                    intent.putExtra("sub_codes", "3360304");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_vmi = bio_pdf + "sem6/3360305%20%20VIRTUAL%20MEDICAL%20INSTRUMENTATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_vmi);
                                                    intent.putExtra("sub_names", "Virtual Medial Instrumentation");
                                                    intent.putExtra("sub_codes", "3360305");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_bmi = bio_pdf + "sem6/3360306%20BIO%20MATERIALS%20AND%20IMPLANTS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bmi);
                                                    intent.putExtra("sub_names", "Bio Materials and Implants");
                                                    intent.putExtra("sub_codes", "3360306");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 6:
                                                    String pdf_proj = bio_pdf + "sem6/3360307%20PROJECT-II.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_proj);
                                                    intent.putExtra("sub_names", "Project-II");
                                                    intent.putExtra("sub_codes", "3360307");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Electronic Communication")){
                    final String ec_pdf = "https://parthravrani.github.io/studymate/syllabus/ec/";
                    spinner.setAdapter(adapterEC);
                    adapterEC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterEC);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_bm = ec_pdf + "sem1/3300001%20Basic%20Mathematics.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bm);
                                                    intent.putExtra("sub_names", "Basic Mathematics");
                                                    intent.putExtra("sub_codes", "3300001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_eng = ec_pdf + "sem1/3300002%20English.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_eng);
                                                    intent.putExtra("sub_names", "English");
                                                    intent.putExtra("sub_codes", "3300002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_bp = ec_pdf + "sem1/3300005%20Basic%20Physics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bp);
                                                    intent.putExtra("sub_names", "Basic Physics");
                                                    intent.putExtra("sub_codes", "3300005");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_bcit = ec_pdf + "sem1/3300013%20Basic%20of%20Computer%20&%20information%20Technology%20.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bcit);
                                                    intent.putExtra("sub_names", "Basics of Computer & Information Technology");
                                                    intent.putExtra("sub_codes", "3300013");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_ecp = ec_pdf + "sem1/3311101%20Electronic%20Components%20&%20Practice.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ecp);
                                                    intent.putExtra("sub_names", "Electronic Components & Practice");
                                                    intent.putExtra("sub_codes", "3311101");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_bee = ec_pdf + "sem1/3320901%20Basic%20of%20Electrical%20Engineering%20.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bee);
                                                    intent.putExtra("sub_names", "Basic of Electrical Engineering");
                                                    intent.putExtra("sub_codes", "3320901");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterEC2);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_echm = ec_pdf + "sem2/3300003%20Environment%20Conservation%20and%20Hazard%20Management%20.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_echm);
                                                    intent.putExtra("sub_names", "Environment Conservation and Hazard Management");
                                                    intent.putExtra("sub_codes", "3300003");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_am = ec_pdf + "sem2/3320002%20Advance%20Mathematics%20Group-1.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_am);
                                                    intent.putExtra("sub_names", "Advance Mathematics Group-1");
                                                    intent.putExtra("sub_codes", "3320002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_eca = ec_pdf + "sem2/3321101%20Electronic%20Circuits%20And%20Applications.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_eca);
                                                    intent.putExtra("sub_names", "Electronic Circuits and Applications");
                                                    intent.putExtra("sub_codes", "3321101");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_en = ec_pdf + "sem2/3321102%20Electronic%20Networks.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_en);
                                                    intent.putExtra("sub_names", "Electronic Networks");
                                                    intent.putExtra("sub_codes", "3321102");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_ew = ec_pdf + "sem2/3321103%20Electronics%20Workshop.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ew);
                                                    intent.putExtra("sub_names", "Electronics Workshop");
                                                    intent.putExtra("sub_codes", "3321103");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterEC3);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_awp = ec_pdf + "sem3/3331101%20Antenna%20And%20Wave%20Propagation.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_awp);
                                                    intent.putExtra("sub_names", "Antenna and Wave Propagation");
                                                    intent.putExtra("sub_codes", "3331101");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_ae = ec_pdf + "sem3/3331102%20Analog%20Electronics.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ae);
                                                    intent.putExtra("sub_names", "Analog Electronics");
                                                    intent.putExtra("sub_codes", "3331102");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_pec = ec_pdf + "sem3/3331103%20Principles%20of%20Electronic%20Communication.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_pec);
                                                    intent.putExtra("sub_names", "Principles of Electronic Communication");
                                                    intent.putExtra("sub_codes", "3331103");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_dld = ec_pdf + "sem3/3331104%20Digital%20Logic%20Design.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dld);
                                                    intent.putExtra("sub_names", "Digital Logic Design");
                                                    intent.putExtra("sub_codes", "3331104");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_pc = ec_pdf + "sem3/3331105%20Programming%20In%20C.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_pc);
                                                    intent.putExtra("sub_names", "Programming in C");
                                                    intent.putExtra("sub_codes", "3331105");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterEC4);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_malp = ec_pdf + "sem4/3341101%20MALP.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_malp);
                                                    intent.putExtra("sub_names", "MALP");
                                                    intent.putExtra("sub_codes", "3341101");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_dc = ec_pdf + "sem4/3341102%20DIGITAL%20COMMUNICATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dc);
                                                    intent.putExtra("sub_names", "Digital Communication");
                                                    intent.putExtra("sub_codes", "3341102");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_oc = ec_pdf + "sem4/3341103%20OPTICAL%20COMMUNICATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_oc);
                                                    intent.putExtra("sub_names", "Optical Communication");
                                                    intent.putExtra("sub_codes", "3341103");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_eim = ec_pdf + "sem4/3341104%20%20ELECTRONICS%20INSTRUMENTS%20AND%20MEASUREMENT.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_eim);
                                                    intent.putExtra("sub_names", "Electronics Instruments and Measurement");
                                                    intent.putExtra("sub_codes", "3341104");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_ie = ec_pdf + "sem4/3341105%20INDUSTRIAL%20ELECTRONICS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ie);
                                                    intent.putExtra("sub_names", "Industrial Electronics");
                                                    intent.putExtra("sub_codes", "3341105");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_cdt = ec_pdf + "sem4/3341106%20CIRCUIT%20DESIGN%20TOOLS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cdt);
                                                    intent.putExtra("sub_names", "Circuit Design Tools");
                                                    intent.putExtra("sub_codes", "3341106");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterEC5);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_m = ec_pdf + "sem5/3351101%20MICROCONTROLLER.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_m);
                                                    intent.putExtra("sub_names", "MicroController");
                                                    intent.putExtra("sub_codes", "3351101");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_mc = ec_pdf + "sem5/3351102%20%20MOBILE%20COMMUNICATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mc);
                                                    intent.putExtra("sub_names", "Mobile Communication");
                                                    intent.putExtra("sub_codes", "3351102");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_mre = ec_pdf + "sem5/3351103%20MICROWAVE%20AND%20RADAR%20ENGINEERING.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mre);
                                                    intent.putExtra("sub_names", "MicroWave and Radar Engineering");
                                                    intent.putExtra("sub_codes", "3351103");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_slp = ec_pdf + "sem5/3351104%20SOFTWARE%20LAB%20PRACTICE.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_slp);
                                                    intent.putExtra("sub_names", "Software Lab Practice");
                                                    intent.putExtra("sub_codes", "3351104");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_cn = ec_pdf + "sem5/3351105%20COMPUTER%20NETWORKS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cn);
                                                    intent.putExtra("sub_names", "Computer Networks");
                                                    intent.putExtra("sub_codes", "3351105");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_ice = ec_pdf + "sem5/3351106%20INSTRUMENTATION%20AND%20CONTROL%20ENGINEERING.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ice);
                                                    intent.putExtra("sub_names", "Instrumentation and Control Engineering");
                                                    intent.putExtra("sub_codes", "3351106");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 6:
                                                    String pdf_proj = ec_pdf + "sem5/3351107%20PROJECT-I.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_proj);
                                                    intent.putExtra("sub_names", "Project - I");
                                                    intent.putExtra("sub_codes", "3351107");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterEC6);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_eim = ec_pdf + "sem6/3361101%20ENTREPRENEURSHIP%20AND%20INDUSTRIAL%20MANAGEMENT.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_eim);
                                                    intent.putExtra("sub_names", "Enterpreneurship and Industrial Management");
                                                    intent.putExtra("sub_codes", "3361101");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_ce = ec_pdf + "sem6/3361102%20CONSUMER%20ELECTRONICS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ce);
                                                    intent.putExtra("sub_names", "Consumer Electronics");
                                                    intent.putExtra("sub_codes", "3361102");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_mee = ec_pdf + "sem6/3361103%20%20MAINTENANCE%20OF%20ELECTRONICS%20EQUIPMENT.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mee);
                                                    intent.putExtra("sub_names", "Maintenance of Electronics Equipment");
                                                    intent.putExtra("sub_codes", "3361103");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_vlsi = ec_pdf + "sem6/3361104%20VLSI.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_vlsi);
                                                    intent.putExtra("sub_names", "VLSI");
                                                    intent.putExtra("sub_codes", "3361104");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_es = ec_pdf + "sem6/3361105%20%20EMBEDDED%20SYSTEM.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_es);
                                                    intent.putExtra("sub_names", "Embedded System");
                                                    intent.putExtra("sub_codes", "3361105");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_mc = ec_pdf + "sem6/3361106%20MULTIMEDIA%20COMMUNICATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mc);
                                                    intent.putExtra("sub_names", "Multimedia Communication");
                                                    intent.putExtra("sub_codes", "3361106");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 6:
                                                    String pdf_ia = ec_pdf + "sem6/3361107%20INDUSTRIAL%20AUTOMATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ia);
                                                    intent.putExtra("sub_names", "Industrial Automation");
                                                    intent.putExtra("sub_codes", "3361107");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 7:
                                                    String pdf_rs = ec_pdf + "sem6/3361108%20ROBOTICS%20&%20AUTOTRONICS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_rs);
                                                    intent.putExtra("sub_names", "Robotics & Autotronics");
                                                    intent.putExtra("sub_codes", "3361108");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 8:
                                                    String pdf_proj = ec_pdf + "sem6/3361109%20PROJECT-II.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_proj);
                                                    intent.putExtra("sub_names", "Project - II");
                                                    intent.putExtra("sub_codes", "3361109");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (course.getSelectedItem().toString().equals("Instrumentation Control")){
                    final String ic_pdf = "https://parthravrani.github.io/studymate/syllabus/ic/";
                    spinner.setAdapter(adapterIC);
                    adapterIC.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            switch (i) {
                                case 0:
                                    listView.setAdapter(listViewAdapterIC);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_bm = ic_pdf + "sem1/3300001%20Basic%20Mathematics.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bm);
                                                    intent.putExtra("sub_names", "Basic Mathematics");
                                                    intent.putExtra("sub_codes", "3300001");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_eng = ic_pdf + "sem1/3300002%20English.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_eng);
                                                    intent.putExtra("sub_names", "English");
                                                    intent.putExtra("sub_codes", "3300002");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_echm = ic_pdf + "sem1/3300003%20Environment%20Conservation%20and%20Hazard%20Management%20.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_echm);
                                                    intent.putExtra("sub_names", "Environment Conservation and Hazard Management");
                                                    intent.putExtra("sub_codes", "3300003");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_bi = ic_pdf + "sem1/3311701%20Basic%20Instrumentation.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bi);
                                                    intent.putExtra("sub_names", "Basic Instrumentation");
                                                    intent.putExtra("sub_codes", "3311701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_iw = ic_pdf + "sem1/3311702%20Instrumentation%20workshop.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_iw);
                                                    intent.putExtra("sub_names", "Instrumentation Workshop");
                                                    intent.putExtra("sub_codes", "3311702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_pce = ic_pdf + "sem1/3311703%20Principles%20of%20Chemical%20Engineering.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_pce);
                                                    intent.putExtra("sub_names", "Principles of Chemical Engineering");
                                                    intent.putExtra("sub_codes", "3311703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 1:
                                    listView.setAdapter(listViewAdapterIC2);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_bp = ic_pdf + "sem2/3300005%20Basic%20Physics.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bp);
                                                    intent.putExtra("sub_names", "Basic Physics");
                                                    intent.putExtra("sub_codes", "3300005");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_it = ic_pdf + "sem2/3321701%20Industrial%20Transducers.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_it);
                                                    intent.putExtra("sub_names", "Industrial Transducers");
                                                    intent.putExtra("sub_codes", "3321701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_idm = ic_pdf + "sem2/3321702%20Instrumentation%20Device%20Materials.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_idm);
                                                    intent.putExtra("sub_names", "Instrumentation Device Materials");
                                                    intent.putExtra("sub_codes", "3321702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_idc = ic_pdf + "sem2/3321703%20Instrumentation%20Devices%20And%20Components.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_idc);
                                                    intent.putExtra("sub_names", "Instrumentation Devices and Components");
                                                    intent.putExtra("sub_codes", "3321703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_icp = ic_pdf + "sem2/3321704%20Instrument%20Configuration%20Practices.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_icp);
                                                    intent.putExtra("sub_names", "Instrument Configuration Practices");
                                                    intent.putExtra("sub_codes", "3321704");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 2:
                                    listView.setAdapter(listViewAdapterIC3);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_sissi = ic_pdf + "sem3/3331701%20Safety%20Instrumented%20Systems%20and%20Safety%20Integrated%20Level.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_sissi);
                                                    intent.putExtra("sub_names", "Safety Instrumented Systems and Safety Integrated Level");
                                                    intent.putExtra("sub_codes", "3331701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_ts = ic_pdf + "sem3/3331702%20Telemetry%20System.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ts);
                                                    intent.putExtra("sub_names", "Telemetry System");
                                                    intent.putExtra("sub_codes", "3331702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_dt = ic_pdf + "sem3/3331703%20Digital%20Techniques.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dt);
                                                    intent.putExtra("sub_names", "Digital Techniques");
                                                    intent.putExtra("sub_codes", "3331703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_cc = ic_pdf + "sem3/3331704%20Control%20Components.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cc);
                                                    intent.putExtra("sub_names", "Control Components");
                                                    intent.putExtra("sub_codes", "3331704");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_pai = ic_pdf + "sem3/3331705%20Process%20Application%20and%20Instrumentation%20Maintenance%20Management.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_pai);
                                                    intent.putExtra("sub_names", "Process Application and Instrumentation Maintenance Management");
                                                    intent.putExtra("sub_codes", "3331705");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_id = ic_pdf + "sem3/3331706%20Instrumentation%20Drawing.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_id);
                                                    intent.putExtra("sub_names", "Instrumentaion Drawing");
                                                    intent.putExtra("sub_codes", "3331706");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 3:
                                    listView.setAdapter(listViewAdapterIC4);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_cis = ic_pdf + "sem4/3341701%20CONTROL%20INSTRUMENTATION%20SYSTEM.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_cis);
                                                    intent.putExtra("sub_names", "Control Instrumentation System");
                                                    intent.putExtra("sub_codes", "3341701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_plc = ic_pdf + "sem4/3341702%20PROGRAMMABLE%20LOGIC%20CONTROLLER%20AND%20DISTRIBUTED%20CONTROL%20SYSTEM.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_plc);
                                                    intent.putExtra("sub_names", "Programmable Logic Controller and Distributed Control System");
                                                    intent.putExtra("sub_codes", "3341702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_pi = ic_pdf + "sem4/3341703%20PROCESS%20INSTRUMENTATION-I.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_pi);
                                                    intent.putExtra("sub_names", "Process Instrumentation-I");
                                                    intent.putExtra("sub_codes", "3341703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_bi = ic_pdf + "sem4/3341704%20BIOMEDICAL%20INSTRUMENTATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_bi);
                                                    intent.putExtra("sub_names", "Bio-Medical Instrumentation");
                                                    intent.putExtra("sub_codes", "3341704");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_isp = ic_pdf + "sem4/3341705%20%20INSTRUMENTATION%20SIMULATION%20PRACTICES.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_isp);
                                                    intent.putExtra("sub_names", "Instrumentation Simulation Practices");
                                                    intent.putExtra("sub_codes", "3341705");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 4:
                                    listView.setAdapter(listViewAdapterIC5);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_ep = ic_pdf + "sem5/3351701%20ELECTRONIC%20AND%20PNEUMATIC%20INSTRUMENTATION.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ep);
                                                    intent.putExtra("sub_names", "Electronic and Pneumatic Instrumentation");
                                                    intent.putExtra("sub_codes", "3351701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_pi = ic_pdf + "sem5/3351702%20PROCESS%20INSTRUMENTATION-II.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_pi);
                                                    intent.putExtra("sub_names", "Process Instrumentation-II");
                                                    intent.putExtra("sub_codes", "3351702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_ai = ic_pdf + "sem5/3351703%20ANALYTICAL%20INSTRUMENTATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ai);
                                                    intent.putExtra("sub_names", "Analytical Instrumentation");
                                                    intent.putExtra("sub_codes", "3351703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_plc = ic_pdf + "sem5/3351704%20PLC%20PROGRAMMING.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_plc);
                                                    intent.putExtra("sub_names", "PLC Programming");
                                                    intent.putExtra("sub_codes", "3351704");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_mmi = ic_pdf + "sem5/3351705%20MICROPROCESSOR%20AND%20MICROCONTROLLER%20IN%20INSTRUMENTATION.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mmi);
                                                    intent.putExtra("sub_names", "Microprocessor and Microcontrollr in Instrumentation");
                                                    intent.putExtra("sub_codes", "3351705");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
                                break;
                                case 5:
                                    listView.setAdapter(listViewAdapterIC6);
                                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                        @Override
                                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                            switch (i) {
                                                case 0:
                                                    String pdf_ai = ic_pdf + "sem6/3361701%20APPLIED%20INSTRUMENTATION.pdf";
                                                    Intent intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ai);
                                                    intent.putExtra("sub_names", "Applied Instrumentation");
                                                    intent.putExtra("sub_codes", "3361701");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 1:
                                                    String pdf_ipc = ic_pdf + "sem6/3361702%20INDUSTRIAL%20POWER%20CONTROL.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ipc);
                                                    intent.putExtra("sub_names", "Industrial Power Control");
                                                    intent.putExtra("sub_codes", "3361702");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 2:
                                                    String pdf_dcs = ic_pdf + "sem6/3361703%20DCS%20AND%20SCADA.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_dcs);
                                                    intent.putExtra("sub_names", "DCS and SCADA");
                                                    intent.putExtra("sub_codes", "3361703");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 3:
                                                    String pdf_ic = ic_pdf + "sem6/3361704%20%20INDUSTRIAL%20DATA%20COMMUNICATION%20.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_ic);
                                                    intent.putExtra("sub_names", "Industrial Data Communication");
                                                    intent.putExtra("sub_codes", "3361704");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 4:
                                                    String pdf_mce = ic_pdf + "sem6/3361705%20%20PIC%20MICROCONTROLLER%20AND%20EMBEDED%20SYSTEMS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_mce);
                                                    intent.putExtra("sub_names", "PIC Microcontroller and Embedded Systems");
                                                    intent.putExtra("sub_codes", "3361705");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 5:
                                                    String pdf_en = ic_pdf + "sem6/3361706%20%20EMBEDED%20NETWORKS.pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_en);
                                                    intent.putExtra("sub_names", "Embedded Networks");
                                                    intent.putExtra("sub_codes", "3361706");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                                case 6:
                                                    String pdf_proj = ic_pdf + "sem6/3361707%20PROJECT-%20II%20(%20WITH%20SEMINAR).pdf";
                                                    intent = new Intent(getApplicationContext(), SemsterPDF.class);
                                                    intent.putExtra("url_pdf", pdf_proj);
                                                    intent.putExtra("sub_names", "Project-II (With Seminar)");
                                                    intent.putExtra("sub_codes", "3361707");
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                                                    break;
                                            }
                                        }
                                    });
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
