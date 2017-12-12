package com.example.tharani.custom_listfragment;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /*onCreate is the first method in the life cycle of an activity
      savedInstance passes data to super class,data is pull to store state of application
    * setContentView is used to set layout for the activity
    *R is a resource and it is auto generate file
    * activity_main assign an integer value*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
