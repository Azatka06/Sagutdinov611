package com.example.Sagutdinov621;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView logText;
    private static final String KEY="text";

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        String methodName="OnSaveInstanceState";
        log(methodName);
        outState.putCharSequence(KEY,logText.getText());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        logText.setText(savedInstanceState.getCharSequence(KEY));
        String methodName="OnRestoreInstanceState";
        log(methodName);
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logText=findViewById(R.id.logText);
        if(savedInstanceState==null){
            Log.d("Lifecycle","OnCreate, savedInstanceState.equals(null)");
        }else {
            String methodName = "OnCreate";
            log(methodName);
        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        String methodName="OnPostCreate";
        log(methodName);
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onPostResume() {
        String methodName="OnPostResume";
        log(methodName);
        super.onPostResume();
    }

    @Override
    protected void onStart() {
        String methodName="onStart";
        log(methodName);
        super.onStart();
    }

    @Override
    protected void onStop() {
        String methodName="OnStop";
        log(methodName);
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        String methodName="OnDestroy";
        log(methodName);
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        String methodName="OnPause";
        log(methodName);
        super.onPause();
    }

    @Override
    protected void onResume() {
        String methodName="OnResume";
        log(methodName);
        super.onResume();
    }

    @Override
    protected void onRestart() {
        String methodName="OnRestart";
        log(methodName);
        super.onRestart();
    }

    @Override
    public void onBackPressed() {
        String methodName="OnBackPressed";
        log(methodName);
        super.onBackPressed();
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        String methodName="OnKeyLongPress";
        log(methodName);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        String methodName="OnKeyDown";
        log(methodName);
        return super.onKeyDown(keyCode, event);
    }

    private void log(String metodName){
        Log.d("Lifecycle",metodName);
        logText.append(metodName+'\n');
    }
}
