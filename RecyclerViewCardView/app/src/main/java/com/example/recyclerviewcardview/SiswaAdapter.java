package com.example.recyclerviewcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SiswaAdapter extends RecyclerView.Adapter<SiswaAdapter.ViewHolder> {

    private Context context;
    private List<Siswa> siswalist;

    public SiswaAdapter(Context context, List<Siswa> siswalist) {
        this.context = context;
        this.siswalist = siswalist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        ViewGroup ViewGroup = null;
//        View v = LayoutInflater.from(ViewGroup.getContext()).inflate(R.layout.item_siswa, ViewGroup,false);
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_siswa, viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Siswa siswa = siswalist.get(i);
      viewHolder.tvNama.setText(siswa.getNama());
       viewHolder.tvAlamat.setText(siswa.getAlamat());

    }

    @Override
    public int getItemCount() {
        return siswalist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

       TextView tvNama;
       TextView tvAlamat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tvNama);
            tvAlamat = itemView.findViewById(R.id.tvAlamat);
        }
    }

}
