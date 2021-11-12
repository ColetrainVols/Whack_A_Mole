package com.whacksomething;

public class MainActivity extends ImageView {
    public MainActivity(Context context) {
        super(context);
    }

    public MainActivity(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MainActivity(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth()); //Snap to width
    }
}