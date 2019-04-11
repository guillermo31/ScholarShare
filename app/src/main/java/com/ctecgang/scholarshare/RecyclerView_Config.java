package com.ctecgang.scholarshare;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerView_Config
{
    private Context mcContext;

    class ScholarshipItemView extends RecyclerView.ViewHolder
    {
        private TextView mTitle;
        private TextView mLink;

        private String key;

        public ScholarshipItemView(ViewGroup parent)
        {
            super(LayoutInflater.from(mcContext).inflate(R.layout.scholarship_list_item, parent, false));

            mTitle = (TextView) itemView.findViewById(R.id.title_txtView);
            mLink = (TextView) itemView.findViewById(R.id.link_txtView);
        }

        public void bind(Scholarship scholarship, String key)
        {
            mTitle.setText(scholarship.getName());
            m
        }

    }
}
