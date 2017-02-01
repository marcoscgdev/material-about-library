package com.marcoscg.utils.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;

/**
 * Created by @MarcosCGdev on 06/01/2017.
 */

public class IconView extends ImageView {

    public IconView (Context context) {
        super(context);
        tint(context);
    }

    public IconView(Context context, AttributeSet attrs) {
        super(context, attrs);
        tint(context);
    }

    public IconView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        tint(context);
    }
    private void tint(Context ctx) {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = ctx.getTheme();
        theme.resolveAttribute(android.R.attr.textColorPrimary, typedValue, true);
        TypedArray arr =
                ctx.obtainStyledAttributes(typedValue.data, new int[]{
                        android.R.attr.textColorSecondary});
        int secondaryColor = arr.getColor(0, -1);
        setColorFilter(secondaryColor, PorterDuff.Mode.SRC_IN);
        arr.recycle();
    }
}
