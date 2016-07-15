package edu.dsu_academy_desu.salvation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Email(View view)
    {
        Intent intent = new Intent(this, Email.class);
        startActivity(intent);
    }
    public void Call(View view)
    {
        Intent intent = new Intent(this, Call.class);
        startActivity(intent);
    }
    public void Mission(View view)
    {
        Intent intent = new Intent(this, Mission.class);
        startActivity(intent);
    }
}
