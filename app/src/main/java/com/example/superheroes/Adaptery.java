package com.example.superheroes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Adaptery extends RecyclerView.Adapter<Adaptery.MyViewHolder> {

    private final Context mContext;
    private final List<Hero> heroesList;

    public Adaptery(Context mContext, List<Hero> heroesList) {
        this.mContext = mContext;
        this.heroesList = heroesList;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        v=layoutInflater.inflate(R.layout.hero_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull Adaptery.MyViewHolder holder, int position) {
        holder.name.setText(heroesList.get(position).getId());

    }

    @Override
    public int getItemCount() {
        return heroesList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;

        public MyViewHolder( @NotNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.textView2);


        }
    }

}
