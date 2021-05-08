package com.example.saath.ui.Psychatrist;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saath.R;

public class ConsultAPsychatrist extends Fragment {

    private ConsultAPsychatristViewModel mViewModel;

    public static ConsultAPsychatrist newInstance() {
        return new ConsultAPsychatrist();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.consult_a_psychatrist_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ConsultAPsychatristViewModel.class);
        // TODO: Use the ViewModel
    }

}