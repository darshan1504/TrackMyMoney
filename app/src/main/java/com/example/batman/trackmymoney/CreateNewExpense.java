package com.example.batman.trackmymoney;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class CreateNewExpense extends Fragment {
    private EditText addNewCategory;
    private EditText addNewMerchant;
    private EditText addNewAmount;
    private EditText addNewDate;
    private Button saveExpense;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View fragmentCreatenewExpense = inflater.inflate(R.layout.fragment_create_new_expense, container, false);

        saveExpense = (Button)fragmentCreatenewExpense.findViewById(R.id.save_expense);
        addNewCategory = (EditText)fragmentCreatenewExpense.findViewById(R.id.create_new_category);
        addNewMerchant = (EditText)fragmentCreatenewExpense.findViewById(R.id.create_new_merchant);
        addNewAmount = (EditText)fragmentCreatenewExpense.findViewById(R.id.create_new_amount);
        addNewDate = (EditText)fragmentCreatenewExpense.findViewById(R.id.create_new_date);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("AddExpense");



        saveExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddData();
            }
        });



        return fragmentCreatenewExpense;


    }

    public void AddData(){

        String Expense, Merchant, Amount, Date;

        Expense = addNewCategory.getText().toString().trim();
        Merchant = addNewMerchant.getText().toString().trim();
        Amount = addNewAmount.getText().toString().trim();
        Date = addNewDate.getText().toString().trim();

        SaveData saveData = new SaveData(Expense,Merchant,Amount,Date);
        databaseReference.push().setValue(saveData);
        Toast.makeText(getContext(), "Saved Successfully", Toast.LENGTH_SHORT).show();
    }

}
