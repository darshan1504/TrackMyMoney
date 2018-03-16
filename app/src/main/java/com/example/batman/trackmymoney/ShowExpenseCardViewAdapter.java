package com.example.batman.trackmymoney;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ShowExpenseCardViewAdapter extends RecyclerView.Adapter<ShowExpenseCardViewAdapter.ViewHolder> {


    private List<SaveData> saveData;
    private Context context;

    public ShowExpenseCardViewAdapter(List<SaveData> saveData, Context context) {
        this.saveData = saveData;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_summary,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        SaveData populateData = saveData.get(position);

        holder.summaryMerchantName.setText(populateData.getMerchant());
        holder.summaryCategoryName.setText(populateData.getExpense());
        holder.summaryAmount.setText(populateData.getAmount());
        holder.summaryDate.setText(populateData.getDate());



    }

    @Override
    public int getItemCount() {
        return saveData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView summaryMerchantName;
        TextView summaryCategoryName;
        TextView summaryAmount;
        TextView summaryDate;

        public ViewHolder(View itemView) {
            super(itemView);

            summaryMerchantName = (TextView)itemView.findViewById(R.id.summary_merchant_name);
            summaryCategoryName = (TextView)itemView.findViewById(R.id.summary_category_name);
            summaryAmount = (TextView)itemView.findViewById(R.id.summary_amount);
            summaryDate = (TextView)itemView.findViewById(R.id.summary_date);



        }
    }
}
