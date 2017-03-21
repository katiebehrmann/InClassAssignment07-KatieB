package com.example.android.inclassassignment07_katieb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference placeRef = database.getReference("Place");
    private DatabaseReference titleRef = database.getReference("Road Trip Name");
    private EditText roadTripName;
    private EditText addPlace;
    private EditText addMiles;
    private CheckBox beenThere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roadTripName = (EditText) findViewById(R.id.title_road_trip);
        addPlace = (EditText) findViewById(R.id.add_place);
        beenThere = (CheckBox) findViewById(R.id.been_there);
        addMiles = (EditText) findViewById(R.id.add_miles);
    }

    public void set(View view) {
        titleRef.setValue(roadTripName.getText().toString());
    }

    public void add(View view) {
        String place = addPlace.getText().toString();
        int miles = Integer.parseInt(addMiles.getText().toString());
        boolean been = beenThere.isChecked();

        RoadTrip fun = new RoadTrip(place, miles, been);
        placeRef.push().setValue(fun);
    }

//    // onClick
//    public void set(View view) {
//        personRef.setValue(new Person("Xi", 100, true));
//    }
//
//    public void add(View view) {
//        peopleRef.push().setValue(new Person("Wei", 20, true));
//    }
}