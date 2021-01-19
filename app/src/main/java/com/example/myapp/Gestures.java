package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;

public class Gestures extends AppCompatActivity implements GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener {

    private TextView txtMessage;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestures);

        txtMessage = (TextView)findViewById(R.id.textMessage);
        this.gestureDetector = new GestureDetectorCompat(this, this);

        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        txtMessage.setText("Single Tap!");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        txtMessage.setText("Double Tap!");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        txtMessage.setText("Double Tap EVent!");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        txtMessage.setText("On Down!");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        txtMessage.setText("Show Press!");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        txtMessage.setText("Single Tap Up!");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        txtMessage.setText("Scroll effect!");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        txtMessage.setText("Long Press!");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        txtMessage.setText("On Fling!");
        return true;
    }
}