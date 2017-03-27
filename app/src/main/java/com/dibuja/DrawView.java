package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
	   //.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.RED);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.CYAN);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);
		
		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);
		
		//.drawText(text, x, y, paint)
		canvas.drawText("Texto con CANVAS", 200, 30, paint);


		//.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, 350, 100, paint);

		paint.setColor(Color.MAGENTA);
		canvas.drawRect(70, 140, 140, 165, paint);

		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(8);
		paint.setStrokeCap(Paint.Cap.ROUND);
		canvas.drawLine(50,180,20,250,paint);
		canvas.drawLine(50,180,120,250, paint);
		canvas.drawLine(20,250,120,250, paint);
		
		paint.setColor(Color.rgb(45, 192,69));
		paint.setStrokeWidth(3);
		paint.setStyle(Paint.Style.FILL);
		canvas.drawLine(200,180,240,180,paint);
		canvas.drawLine(200,180,170,215, paint);
		canvas.drawLine(240,180,270,215, paint);
		canvas.drawLine(170,215,220,250,paint);
		canvas.drawLine(270,215,220,250,paint);

		Path figura = new Path();
		figura.addArc(new RectF(350,350,400,420),30,360);
		paint.setColor(Color.rgb(108, 245, 39));
		paint.setStyle(Paint.Style.FILL_AND_STROKE);
		canvas.drawPath(figura, paint);

		Path ovalo = new Path();
		ovalo.addOval(new RectF(350, 450,450,500),Path.Direction.CCW);
		paint.setColor(Color.rgb(245, 245, 39));
		paint.setStyle(Paint.Style.FILL_AND_STROKE);
		canvas.drawPath(ovalo,paint);


        Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);


	}

}
