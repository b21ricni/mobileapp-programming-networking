package com.example.networking;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<String> mountains = Arrays.asList("Kinnekulle", "Billingen","Mount Everest","Kebnekaise","Fiji" );
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mountain, parent);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mountain, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(mountains.get(position));
    }
    @Override
    public int getItemCount() {
        return mountains.size();
    }
}