package com.appbusters.robinkamboj.firebasehack;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {

    DatabaseReference databaseReference ;

    SharedPreferences sharedPreferences ;
    SharedPreferences.Editor editor ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("MyData" , MODE_PRIVATE) ;
        editor = sharedPreferences.edit();

        editor.putString("UserId" , "vasu123");
        editor.putString("Name" , "vasu");
        editor.putString("UserType" , "student");

        editor.commit();

        databaseReference = FirebaseDatabase.getInstance().getReference("Users");

        AddData addData = new AddData("Vasu" , "student" , "vasu123");
        databaseReference.child("vasu123").setValue(addData);

        AddData addData2 = new AddData("Robin" , "student" , "robin123");
        databaseReference.child("robin123").setValue(addData2);

        AddData addData3 = new AddData("Rishab" , "student" , "rishab123");
        databaseReference.child("rishab123").setValue(addData3);

        startActivity(new Intent(this, UsersActivity.class));
        finish();
    }
}
