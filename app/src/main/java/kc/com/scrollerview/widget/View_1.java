package kc.com.scrollerview.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * @Auther: Lemon
 * @Date: 2018/4/11 16:12 51
 * @Describe: the infor of the class
 */
public class View_1 extends View {
    private static final String TAG = "View_1";
    private int lastX,lastY;


    public View_1(Context context) {
        super(context);
    }

    public View_1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int x = (int) event.getX();
        int y = (int) event.getY();
        Log.d(TAG, "onTouchEvent: x==="+x+"....y=="+y);

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX=x;
                lastY=y;
                break;
            case MotionEvent.ACTION_MOVE:

                int offsetX=x-lastX;
                int offsetY=y-lastY;
                Log.d(TAG, "onTouchEvent: offsetX==="+offsetX+"....offsetY=="+offsetY);
                layout(getLeft()+offsetX,getTop()+offsetY,getRight()+offsetX,getBottom()+offsetY);
                break;
        }
        return true;
    }
}
