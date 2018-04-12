package kc.com.scrollerview.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * @Auther: Lemon
 * @Date: 2018/4/11 21:42 10
 * @Describe: the infor of the class
 */
public class View_3 extends View {



    public View_3(Context context) {
        super(context);
    }

    public View_3(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);



    }


    private int lastX, lastY;
//    ViewGroup.MarginLayoutParams params= (ViewGroup.MarginLayoutParams) getLayoutParams();
//    ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) getLayoutParams();

    ViewGroup.LayoutParams params = getLayoutParams();
    ViewGroup.MarginLayoutParams marginParams = null;

    @Override
    protected void onAttachedToWindow() {

        //获取view的margin设置参数
        if (params instanceof ViewGroup.MarginLayoutParams) {
            marginParams = (ViewGroup.MarginLayoutParams) params;
        } else {
            //不存在时创建一个新的参数
            //基于View本身原有的布局参数对象
            marginParams = new ViewGroup.MarginLayoutParams(params);
        }
        super.onAttachedToWindow();
    }

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

                int offsetX=x-lastX;
                int offsetY=y-lastY;
                marginParams.leftMargin=getLeft()+offsetX;
                marginParams.topMargin=getTop()+offsetY;
                setLayoutParams(marginParams);
                break;
        }
        return true;
    }
}
