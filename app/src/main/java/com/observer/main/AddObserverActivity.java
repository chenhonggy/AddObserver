package com.observer.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.observer.main.Observer.NotificationCenter;


public class AddObserverActivity extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_observer);

        //add observer
        NotificationCenter.getInstance().addObserver("key", this, "test");

        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(AddObserverActivity.this,OtherActivity.class);
                startActivity(intent);
            }
        });
    }

    public void test(){
        Log.e("Log","I will run by other Activity Click");
    }
}
