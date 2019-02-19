package com.example.zubair.user;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class JobsList extends ArrayAdapter<Jobs> {

    private Activity context;
    private List<Jobs> jobsList;

    public JobsList(Activity context, List<Jobs> jobsList){

        super(context, R.layout.list_layout, jobsList);
        this.context = context;
        this.jobsList = jobsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItems = inflater.inflate(R.layout.list_layout, null, true);
        TextView textjob = (TextView) listViewItems.findViewById(R.id.jobs);
        TextView textpayment = (TextView) listViewItems.findViewById(R.id.payment);
        TextView textman = (TextView) listViewItems.findViewById(R.id.worker);

        Jobs jobs = jobsList.get(position);

        textjob.setText(jobs.getJobname());
        textpayment.setText(jobs.getMoney());
        textman.setText(jobs.getMan());

        return listViewItems;

    }
}
