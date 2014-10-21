package com.observer.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.observer.main.Observer.NotificationCenter;

/**
 * Created by hu on 14-10-21.
 */
public class OtherActivity extends Activity{
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCenter.getInstance().postNotification("key");
            }
        });
    }
}
