package com.example.exercise5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class DialogFragmentExample extends DialogFragment {

    private EditText mName;
    private Button mDone, mCancel;
    private IDialogFragmentListener mListener;

    public interface IDialogFragmentListener {
        void sendData(String name);
    }

    public void setFragmentComm(IDialogFragmentListener listener) {
        this.mListener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mName = view.findViewById(R.id.input_name);
        mDone = view.findViewById(R.id.btn_done);
        mCancel = view.findViewById(R.id.btn_cancel);

        mName.setText("");

        mDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = mName.getText().toString();
                if (!data.equals("")) {
                    mListener.sendData(data);
                }
                dismiss();
            }
        });

        mCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
