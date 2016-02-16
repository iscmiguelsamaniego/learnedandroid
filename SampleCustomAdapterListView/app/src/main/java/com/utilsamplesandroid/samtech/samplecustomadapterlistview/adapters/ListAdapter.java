package com.utilsamplesandroid.samtech.samplecustomadapterlistview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.utilsamplesandroid.samtech.samplecustomadapterlistview.R;

import java.util.ArrayList;

/**
 * Created by Miguel on 1/28/16.
 */
public class ListAdapter extends ArrayAdapter<String> {

    private Context mContext;
    private ArrayList<String> mValues;
    private TextView tv1, tv2, tv3;

    public ListAdapter(Context context, int resource, ArrayList<String> values){
        super(context, resource, values);

        this.mContext = context;
        this.mValues = values;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_list, null);
        }

        tv1 = (TextView) convertView.findViewById(R.id.item_one);
        tv2 = (TextView) convertView.findViewById(R.id.item_two);
        tv3 = (TextView) convertView.findViewById(R.id.item_three);

        tv1.setText(mValues.get(position));
        tv2.setText(mValues.get(position));
        tv3.setText(mValues.get(position));

        //Set color to odd items in the list
        if(position % 2 == 0){

            mContext.getResources().getColor(R.color.colorWhite);
            tv1.setTextColor(mContext.getResources().getColor(R.color.colorAccent));
            tv2.setTextColor(mContext.getResources().getColor(R.color.colorAccent));
            tv3.setTextColor(mContext.getResources().getColor(R.color.colorAccent));
        }

        return convertView;
    }
}
