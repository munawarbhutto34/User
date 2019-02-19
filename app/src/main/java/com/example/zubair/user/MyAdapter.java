package com.example.zubair.user;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Jobs> jobs;
    public MyAdapter (Context c, ArrayList<Jobs> j)
    {
     context = c;
     jobs = j;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview,parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.worker.setText(jobs.get(position).getMan());
        holder.jobs.setText(jobs.get(position).getJobname());
        holder.payment.setText(jobs.get(position).getMoney());

    }

    @Override
    public int getItemCount() {
        return jobs.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView worker,jobs,payment;
        public MyViewHolder(View itemView) {
            super(itemView);
            worker = (TextView) itemView.findViewById(R.id.worker);
            jobs = (TextView) itemView.findViewById(R.id.jobs);
            payment = (TextView) itemView.findViewById(R.id.payment);
        }
    }
}
