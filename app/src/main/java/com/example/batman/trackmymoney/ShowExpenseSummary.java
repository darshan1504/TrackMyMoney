package com.example.batman.trackmymoney;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ShowExpenseSummary extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View fragmentShowExpenseSummary = inflater.inflate(R.layout.fragment_show_expense_summary, container, false);

        


        return fragmentShowExpenseSummary;


    }

}
