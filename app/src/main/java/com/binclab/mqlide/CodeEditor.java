package com.binclab.mqlide;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.EditText;
import android.graphics.Rect;
import android.graphics.Paint;
import android.graphics.Color;

public class CodeEditor extends EditText
{
	private Rect rect;
    private Paint paint;
	
	public CodeEditor(Context context, AttributeSet attrs) {
        super(context, attrs);
  		rect = new Rect();
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        paint.setTextSize(40);
    }

	@Override
	protected void onDraw(Canvas canvas)
	{
		int baseline = getBaseline();
		for (int i = 0; i < getLineCount(); i++) {
			canvas.drawText("" + (i+1),rect.left, baseline, paint);
			baseline += getLineHeight();
		}
		super.onDraw(canvas);
	}
}
