package kc.com.scrollerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "View_4";
    @BindView(R.id.text)
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.d(TAG, "onCreate: activity");

        mText.setText("test butterknife");

    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: activity");
        super.onStart();
    }

    @Override
    protected void onResume() {

        Log.d(TAG, "onResume: activity");
        super.onResume();
    }

    @Override
    protected void onStop() {

        Log.d(TAG, "onStop: activity");
        super.onStop();
    }

    @Override
    protected void onPause() {

        Log.d(TAG, "onPause: activity");
        super.onPause();
    }

    @Override
    public void onDetachedFromWindow() {

        Log.d(TAG, "onDetachedFromWindow: activity");
        super.onDetachedFromWindow();
    }

    @Override
    public void onAttachedToWindow() {

        Log.d(TAG, "onAttachedToWindow: activity");
        super.onAttachedToWindow();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        Log.d(TAG, "onWindowFocusChanged: activity");
        super.onWindowFocusChanged(hasFocus);
    }

    @Override
    protected void onDestroy() {

        Log.d(TAG, "onDestroy: activity");
        super.onDestroy();
    }
}
