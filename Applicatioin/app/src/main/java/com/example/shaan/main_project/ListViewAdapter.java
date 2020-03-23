package com.example.shaan.main_project;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shaan.main_project._1_NumberSystem.Number_Sys_Main;
import com.example.shaan.main_project._2_HcfAndLcm.HcfAndLcm_Explanation;
import com.example.shaan.main_project._3_Average.Average_Explanation;
import com.example.shaan.main_project._4_Age.Age_Explanation;
import com.example.shaan.main_project._5_Percentage.Percentage_Explanation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Info> Infolist;
    ArrayList<Info> arrayList;

    //constructor
    public ListViewAdapter(Context context, List<Info> Infolist) {
        mContext = context;
        this.Infolist = Infolist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Info>();
        this.arrayList.addAll(Infolist);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return Infolist.size();
    }

    @Override
    public Object getItem(int i) {
        return Infolist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.item_list, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(Infolist.get(postition).getTitle());

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                if (Infolist.get(postition).getTitle().equals("Number System")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Number_Sys_Main.class);
                    intent.putExtra("actionBarTitle", "Battery");
                    intent.putExtra("contentTv", "This is Battery detail...");
                    mContext.startActivity(intent);
                }
                if (Infolist.get(postition).getTitle().equals("HCF & LCM")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, HcfAndLcm_Explanation.class);
                    intent.putExtra("actionBarTitle", "Cpu");
                    intent.putExtra("contentTv", "This is Cpu detail...");
                    mContext.startActivity(intent);
                }
                if (Infolist.get(postition).getTitle().equals("Average")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Average_Explanation.class);
                    intent.putExtra("actionBarTitle", "Display");
                    intent.putExtra("contentTv", "This is Display detail...");
                    mContext.startActivity(intent);
                }
                if (Infolist.get(postition).getTitle().equals("Age")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Age_Explanation.class);
                    intent.putExtra("actionBarTitle", "Memory");
                    intent.putExtra("contentTv", "This is Memory detail...");
                    mContext.startActivity(intent);
                }
                if (Infolist.get(postition).getTitle().equals("Percentage")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, Percentage_Explanation.class);
                    intent.putExtra("actionBarTitle", "Sensor");
                    intent.putExtra("contentTv", "This is Sensor detail...");
                    mContext.startActivity(intent);
                }
            }
        });


        return view;
    }

    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        Infolist.clear();
        if (charText.length()==0){
            Infolist.addAll(arrayList);
        }
        else {
            for (Info Info : arrayList){
                if (Info.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    Infolist.add(Info);
                }
            }
        }
        notifyDataSetChanged();
    }

}