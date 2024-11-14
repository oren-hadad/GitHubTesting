package com.example.githubtesting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class board extends View {
    Context context;

    float x,y,r;
    float deltax, deltay;
    Paint p;
    public board(Context context) {
        super(context);
        this.context= context;

        p = new Paint();
        p.setColor(Color.BLUE);
        p.setStrokeWidth(12);
        x= 10;
        y = 100;
        deltax = 50;
        deltay = 10;
        r = 100;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(x,y,r,p);
        x = x + deltax;
        y = y + deltay;
        invalidate();
        if (x< 0 || x > canvas.getWidth() - r){
            deltax = -deltax;
        }
        if (y< 0 || y > canvas.getHeight() - r){
            deltay = -deltay;
        }
        invalidate();
    }

    public board(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
