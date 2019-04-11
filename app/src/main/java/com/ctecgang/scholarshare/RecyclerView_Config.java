package com.ctecgang.scholarshare;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerView_Config
{
    private Context mcContext;
    private ScholarshipAdapter mScholarAdapter;

    public void setConfig(RecyclerView recyclerView, Context context, ArrayList<Scholarship> scholarships, ArrayList<String> keys)
    {
        mcContext = context;
        mScholarAdapter = new ScholarshipAdapter(scholarships, keys);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(mScholarAdapter);

    }

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
            mLink.setText(scholarship.getLink());
            this.key = key;
        }

    }

    class ScholarshipAdapter extends RecyclerView.Adapter<ScholarshipItemView>
    {
        private ArrayList<Scholarship> scholarships;
        private ArrayList<String> keys;

        public ScholarshipAdapter(ArrayList<Scholarship> scholarships, ArrayList<String> keys) {
            this.scholarships = scholarships;
            this.keys = keys;
        }

        @Override
        public ScholarshipItemView onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ScholarshipItemView(parent);
        }

        @Override
        public void onBindViewHolder(ScholarshipItemView holder, int position) {
            holder.bind(scholarships.get(position), keys.get(position));

        }

        @Override
        public int getItemCount() {
            return scholarships.size();
        }
    }
}
