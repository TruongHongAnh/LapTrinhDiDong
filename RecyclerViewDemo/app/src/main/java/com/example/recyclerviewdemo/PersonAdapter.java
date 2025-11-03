package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

interface SelectListener {
    void onItemClicked(Person person);
}

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
    private final Context context;
    private final List<Person> personList;
    private final SelectListener listener;
    public PersonAdapter(Context context, List<Person> personList, SelectListener listener) {
        this.context = context;
        this.personList = personList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_person, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person person = personList.get(position);
        holder.tvName.setText(person.getName());
        holder.tvMsv.setText("Mã sv: " + person.getMsv());
        holder.itemView.setOnClickListener(v -> {
            listener.onItemClicked(person);
        });
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvMsv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvMsv = itemView.findViewById(R.id.tvMsv);
        }
    }
}
