package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.example.xyzreader.R;

/**
 * Created by Jacob on 12/1/2015.
 */
public class ImageAspectRatio extends ImageView{
    public ImageAspectRatio (Context context) {
        super(context);
    }
    public ImageAspectRatio (Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public ImageAspectRatio (Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthSpec) * 1/2;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec, threeTwoHeightSpec);
    }
}
