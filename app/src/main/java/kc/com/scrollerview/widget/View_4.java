package kc.com.scrollerview.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * @Auther: Lemon
 * @Date: 2018/4/12 15:44 36
 * @Describe: the infor of the class
 */
public class View_4 extends View {
    public View_4(Context context) {
        super(context);
    }

    public View_4(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
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
