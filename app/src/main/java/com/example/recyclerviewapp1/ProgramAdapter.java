package com.example.recyclerviewapp1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ProgramViewHolder>{

    private String[] data;
    private Context context;
    public ProgramAdapter(String[] data, Context context)
    {
        this.data=data;
        this.context=context;
    }
    @NonNull
    @Override
    public ProgramViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,viewGroup,false);
        return new ProgramViewHolder(view,context);

    }

    @Override
    public void onBindViewHolder(@NonNull ProgramViewHolder programViewHolder, int i) {

        String title=data[i];
        programViewHolder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    

    public class ProgramViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgIcon;
        TextView txtTitle;
        public ProgramViewHolder(@NonNull View itemView,Context context) {
            super(itemView);
            imgIcon= itemView.findViewById(R.id.imgIcon);
            txtTitle= itemView.findViewById(R.id.txtTitle);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "Clicked recycler", Toast.LENGTH_SHORT).show();
        }
    }
      
}
