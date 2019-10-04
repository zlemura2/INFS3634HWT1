package com.example.android.timeapp3634;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String mode="12hr";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Zachary Lemura's World Time App");

        ConstraintLayout city1 = findViewById(R.id.city1);
        ConstraintLayout city2 = findViewById(R.id.city2);
        ConstraintLayout city3 = findViewById(R.id.city3);
        ConstraintLayout city4 = findViewById(R.id.city4);
        ConstraintLayout city5 = findViewById(R.id.city5);
        ConstraintLayout city6 = findViewById(R.id.city6);
        final ConstraintLayout city7 = findViewById(R.id.city7);

        final Button twelveBtn = findViewById(R.id.twelveBtn);
        final Button twentyFourBtn= findViewById(R.id.twentyfourBtn);

        twelveBtn.setBackgroundColor(Color.GREEN);
        twentyFourBtn.setBackgroundColor(Color.LTGRAY);

        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(new City("Sydney","Australia/Sydney",getResources().getIdentifier("sydney_image",
                "drawable",getPackageName())));
        cityList.add(new City("Auckland","Pacific/Auckland",getResources().getIdentifier("auckland_image",
                "drawable",getPackageName())));
        cityList.add(new City("Shanghai","Asia/Shanghai",getResources().getIdentifier("shanghai_image",
                "drawable",getPackageName())));
        cityList.add(new City("Los Angeles","America/Los_Angeles",getResources().getIdentifier("lasangeles_image",
                "drawable",getPackageName())));
        cityList.add(new City("New York","America/New_York",getResources().getIdentifier("newyork_image",
                "drawable",getPackageName())));
        cityList.add(new City("Rome","Europe/Rome",getResources().getIdentifier("rome_image",
                "drawable",getPackageName())));
        cityList.add(new City("London","Europe/London",getResources().getIdentifier("london_image",
                "drawable",getPackageName())));

        //City 1
        TextView city1Name = city1.findViewById(R.id.cityName);
        final TextClock city1Clock12 = city1.findViewById(R.id.cityClock12);
        final TextClock city1Clock24 = city1.findViewById(R.id.cityClock24);
        ImageView city1Image = city1.findViewById(R.id.cityImage);

        city1Name.setText(cityList.get(0).cityName.toString());
        city1Clock12.setTimeZone(cityList.get(0).cityTimezone);
        city1Clock24.setTimeZone(cityList.get(0).cityTimezone);
        city1Image.setImageResource(cityList.get(0).resID);

        //City2
        TextView city2Name = city2.findViewById(R.id.cityName);
        final TextClock city2Clock12 = city2.findViewById(R.id.cityClock12);
        final TextClock city2Clock24 = city2.findViewById(R.id.cityClock24);
        ImageView city2Image = city2.findViewById(R.id.cityImage);

        city2Name.setText(cityList.get(1).cityName.toString());
        city2Clock12.setTimeZone(cityList.get(1).cityTimezone);
        city2Clock24.setTimeZone(cityList.get(1).cityTimezone);
        city2Image.setImageResource(cityList.get(1).resID);

        //City 3
        TextView city3Name = city3.findViewById(R.id.cityName);
        final TextClock city3Clock12 = city3.findViewById(R.id.cityClock12);
        final TextClock city3Clock24 = city3.findViewById(R.id.cityClock24);
        ImageView city3Image = city3.findViewById(R.id.cityImage);

        city3Name.setText(cityList.get(2).cityName.toString());
        city3Clock12.setTimeZone(cityList.get(2).cityTimezone);
        city3Clock24.setTimeZone(cityList.get(2).cityTimezone);
        city3Image.setImageResource(cityList.get(2).resID);

        //City 4
        TextView city4Name = city4.findViewById(R.id.cityName);
        final TextClock city4Clock12 = city4.findViewById(R.id.cityClock12);
        final TextClock city4Clock24 = city4.findViewById(R.id.cityClock24);
        ImageView city4Image = city4.findViewById(R.id.cityImage);

        city4Name.setText(cityList.get(3).cityName.toString());
        city4Clock12.setTimeZone(cityList.get(3).cityTimezone);
        city4Clock24.setTimeZone(cityList.get(3).cityTimezone);
        city4Image.setImageResource(cityList.get(3).resID);

        //City 5
        TextView city5Name = city5.findViewById(R.id.cityName);
        final TextClock city5Clock12 = city5.findViewById(R.id.cityClock12);
        final TextClock city5Clock24 = city5.findViewById(R.id.cityClock24);
        ImageView city5Image = city5.findViewById(R.id.cityImage);

        city5Name.setText(cityList.get(4).cityName.toString());
        city5Clock12.setTimeZone(cityList.get(4).cityTimezone);
        city5Clock24.setTimeZone(cityList.get(4).cityTimezone);
        city5Image.setImageResource(cityList.get(4).resID);

        //City 6
        TextView city6Name = city6.findViewById(R.id.cityName);
        final TextClock city6Clock12 = city6.findViewById(R.id.cityClock12);
        final TextClock city6Clock24 = city6.findViewById(R.id.cityClock24);
        ImageView city6Image = city6.findViewById(R.id.cityImage);

        city6Name.setText(cityList.get(5).cityName.toString());
        city6Clock12.setTimeZone(cityList.get(5).cityTimezone);
        city6Clock24.setTimeZone(cityList.get(5).cityTimezone);
        city6Image.setImageResource(cityList.get(5).resID);

        //City 7
        TextView city7Name = city7.findViewById(R.id.cityName);
        final TextClock city7Clock12 = city7.findViewById(R.id.cityClock12);
        final TextClock city7Clock24 = city7.findViewById(R.id.cityClock24);
        ImageView city7Image = city7.findViewById(R.id.cityImage);

        city7Name.setText(cityList.get(6).cityName.toString());
        city7Clock12.setTimeZone(cityList.get(6).cityTimezone);
        city7Clock24.setTimeZone(cityList.get(6).cityTimezone);
        city7Image.setImageResource(cityList.get(6).resID);

        twelveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                twelveBtn.setBackgroundColor(Color.GREEN);
                twentyFourBtn.setBackgroundColor(Color.LTGRAY);

                city1Clock12.setVisibility(View.VISIBLE);
                city1Clock24.setVisibility(View.INVISIBLE);

                city2Clock12.setVisibility(View.VISIBLE);
                city2Clock24.setVisibility(View.INVISIBLE);

                city3Clock12.setVisibility(View.VISIBLE);
                city3Clock24.setVisibility(View.INVISIBLE);

                city4Clock12.setVisibility(View.VISIBLE);
                city4Clock24.setVisibility(View.INVISIBLE);

                city5Clock12.setVisibility(View.VISIBLE);
                city5Clock24.setVisibility(View.INVISIBLE);

                city6Clock12.setVisibility(View.VISIBLE);
                city6Clock24.setVisibility(View.INVISIBLE);

                city7Clock12.setVisibility(View.VISIBLE);
                city7Clock24.setVisibility(View.INVISIBLE);
            }
        });

        twentyFourBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                twelveBtn.setBackgroundColor(Color.LTGRAY);
                twentyFourBtn.setBackgroundColor(Color.GREEN);

                city1Clock12.setVisibility(View.INVISIBLE);
                city1Clock24.setVisibility(View.VISIBLE);

                city2Clock12.setVisibility(View.INVISIBLE);
                city2Clock24.setVisibility(View.VISIBLE);

                city3Clock12.setVisibility(View.INVISIBLE);
                city3Clock24.setVisibility(View.VISIBLE);

                city4Clock12.setVisibility(View.INVISIBLE);
                city4Clock24.setVisibility(View.VISIBLE);

                city5Clock12.setVisibility(View.INVISIBLE);
                city5Clock24.setVisibility(View.VISIBLE);

                city6Clock12.setVisibility(View.INVISIBLE);
                city6Clock24.setVisibility(View.VISIBLE);

                city7Clock12.setVisibility(View.INVISIBLE);
                city7Clock24.setVisibility(View.VISIBLE);
            }
        });




    }
}
