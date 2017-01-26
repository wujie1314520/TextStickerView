package com.freesub.wujie.textstickerviewdemo.view;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import com.freesub.wujie.textstickerviewdemo.R;

/**
 * 输入框
 */
public class TextInputDialog extends Dialog implements View.OnClickListener{

    private Context context;
    private EditText et_input;

    public interface OnSharePlatformClick {
//        void onPlatformClick(int id, String comment);
        void onPlatformClick(View v);
    }

    private OnSharePlatformClick mListener;

    private TextInputDialog(Context context, boolean flag, OnCancelListener listener) {
        super(context, flag, listener);
    }

    @SuppressLint("InflateParams")
    private TextInputDialog(Context context, int defStyle) {
        super(context, defStyle);
        View view = getLayoutInflater().inflate(R.layout.dialog_input_text, null);
        et_input = (EditText)view.findViewById(R.id.et_input);
        view.findViewById(R.id.color_picker).setOnClickListener(this);

        super.setContentView(view);
    }

    public TextInputDialog(Context context) {
        this(context, R.style.dialog_bottom);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(Gravity.BOTTOM);

        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        p.width = d.getWidth();
        getWindow().setAttributes(p);
    }

    public void setOnPlatformClickListener(OnSharePlatformClick lis) {
        mListener = lis;
    }

    @Override
    public void onClick(View v) {
//        final int id = v.getId();
//        String comment = et_input.getText().toString().trim();
        if (mListener != null) {
            mListener.onPlatformClick(v);
        }
    }

    public EditText getEditInput() {
        return et_input;
    }
}
