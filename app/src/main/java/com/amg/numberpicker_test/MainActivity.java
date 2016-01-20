package com.amg.numberpicker_test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.amg.numberpicker.NumberPicker;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker np = (NumberPicker)findViewById(R.id.number_picker);
        np.setValueChangedListener(new NumberPicker.ValueChangedListener() {
            @Override
            public void onValueChanged(int value) {
                Log.w("test", "value " + value);
            }
        });
    }

}
