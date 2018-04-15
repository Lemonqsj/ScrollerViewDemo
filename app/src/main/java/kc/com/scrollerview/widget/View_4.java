package kc.com.scrollerview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;


/**
 * @Auther: Lemon
 * @Date: 2018/4/12 15:44 36
 * @Describe: the infor of the class
 */
public class View_4 extends View {

/**
  * Desc：自定义view的生命周期
  *   1: 创建creat：通常有两种方式，下面有四个构造方法，平时也只是能用到两个，最后一个四个参数的构造方法没有用到过
 *          1. 一个参数的构造，在代码中new 的时候调用；
 *          2. 两个参数的构造，在XML中使用的时候回调用
 *          3. 三个参数的构造一般是在获取一些自定义属性的时候调用的到
 *    2： 加载view：当加载完成的时候会调用onFinshInflate，创建和加载完成是相对应的；
 *    3： 进入activity的创建，开始，显示，加载到window上面，当activity加载完成之后会调用view 的onAttachToWindow
 *    4:  当attach完成之后会onMeasure和onLayout
 *    5:  布局和测量完成之后activity就会获取到焦点，这时候activity和view的都会被调用onWindowFocusChanged，并且获取到焦点hasWindowFocus
 *    6： 获取到
 *
  *
  *
  */

    private static final String TAG = "View_4";
    public View_4(Context context) {
        super(context);



        Log.d(TAG, "View_4: 一个参数的构造");
        
        
    }



    public View_4(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        Log.d(TAG, "View_4: 两个参数的构造");
    }

    @Override
    protected void onFinishInflate() {

        Log.d(TAG, "onFinishInflate: ");
        super.onFinishInflate();
    }


    @Override
    protected void onAttachedToWindow() {

        Log.d(TAG, "onAttachedToWindow: ");
        super.onAttachedToWindow();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.d(TAG, "onMeasure: ");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {

        Log.d(TAG, "onLayout: ");
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Log.d(TAG, "onDraw: ");
        super.onDraw(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        Log.d(TAG, "onSizeChanged: ");
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {

        Log.d(TAG, "onWindowFocusChanged: ");
        super.onWindowFocusChanged(hasWindowFocus);
    }

    @Override
    public boolean hasWindowFocus() {

        Log.d(TAG, "hasWindowFocus: ");
        return super.hasWindowFocus();
    }

    @Override
    protected void onDetachedFromWindow() {
        Log.d(TAG, "onDetachedFromWindow: ");
        super.onDetachedFromWindow();
    }

    private int lastX, lastY;

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX=x;
                lastY=y;
                break;
            case MotionEvent.ACTION_MOVE:

//                int offsetX=x-lastX;
//                int offsetY=y-lastY;
//                ((View)getParent()).scrollBy(-offsetX,-offsetY);

                //注意为啥是负值，主要的原因是这个偏移量的值的计算，偏移量的计算是开始的点减去后面的点

                //计算偏移量是前面的点减去后面的点：


                int offsetX= lastX-x;
                int offsetY=lastY-y;
                ((View)getParent()).scrollBy(offsetX,offsetY);



                break;
        }
        return true;
    }
}
