package com.example.recyclerviewcardview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SiswaAdapter extends RecyclerView.Adapter<SiswaAdapter.ViewBolder> {

    private Context context;
    private List<Siswa> siswalist;

    public SiswaAdapter(Context context, List<Siswa> siswalist) {
        this.context = context;
        this.siswalist = siswalist;
    }

    @NonNull
    @Override
    public ViewBolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        ViewGroup ViewGroup = null;
        View v = LayoutInflater.from(ViewGroup.getContext()).inflate(R.layout.item_siswa, ViewGroup,false);
        return new ViewBolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewBolder Bolder, int i) {
        Siswa siswa = siswalist.get(i);
       ViewBolder.tvNama.setText(siswa.getNama());
       ViewBolder.tvAlamat.setText(siswa.getAlamat());
    }

    @Override
    public int getItemCount() {
        return siswalist.size();
    }

    public static class ViewBolder extends RecyclerView.ViewHolder{

       static TextView tvNama;
       static TextView tvAlamat;

        public ViewBolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tvNama);
            tvAlamat = itemView.findViewById(R.id.tvAlamat);
        }
    }

}
