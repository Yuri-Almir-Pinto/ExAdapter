package com.example.exadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlanetaAdapter extends RecyclerView.Adapter<PlanetaAdapter.ViewHolder> {
    private List<Planeta> localDataSet;

    public PlanetaAdapter(List<Planeta> localDataSet) {
        this.localDataSet = localDataSet;
    }

    @NonNull
    @Override
    public PlanetaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_row_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetaAdapter.ViewHolder holder, int position) {
        Planeta planeta = localDataSet.get(position);
        holder.getTextView().setText(planeta.nome);
        holder.getImageView().setImageResource(planeta.img);
        holder.getFrase().setText(planeta.frase);
    }

    @Override
    public int getItemCount() {
        return this.localDataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageView;
        private final TextView frase;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            frase = itemView.findViewById(R.id.apelidoPlaneta);
            textView = itemView.findViewById(R.id.txtPlaneta);
            imageView = itemView.findViewById(R.id.imgPlaneta);
        }

        public TextView getTextView() { return textView; }
        public ImageView getImageView() { return imageView; }
        public TextView getFrase() { return frase; }
    }
}
