package com.kashbon.foodpanda.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kashbon.foodpanda.R;
import com.kashbon.foodpanda.models.ExclusiveModels;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class ExclusiveAdapter extends RecyclerView.Adapter<ExclusiveAdapter.ViewHolder> {

    List<ExclusiveModels>list;
    public ExclusiveAdapter(List<ExclusiveModels>list){
        this.list=list;
    }

    @NonNull
    @Override
    public ExclusiveAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.exclusive_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.roundedImageView.setImageResource(list.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView roundedImageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            roundedImageView=itemView.findViewById(R.id.roundedImageView2);
        }
    }
}
