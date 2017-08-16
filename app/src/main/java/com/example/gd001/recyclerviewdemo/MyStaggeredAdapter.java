package com.example.gd001.recyclerviewdemo;

import android.view.ViewGroup;

import java.util.List;

/**
 * Created by gd001 on 17-8-16.
 */

public class MyStaggeredAdapter extends MyAdapter {
    public MyStaggeredAdapter(List<String> myDataset) {
        super(myDataset);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        ViewGroup.LayoutParams params= holder.mTextView.getLayoutParams();
        params.height = (int) (100 + Math.random() * 400);
        holder.mTextView.setLayoutParams(params);
        holder.mTextView.setText(mDataset.get(position));

    }
}