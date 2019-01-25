package com.example.pintu.notepad.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NotesAdapters extends RecyclerView.Adapter<NotesAdapters.NoteHolder> {

    @NonNull
    @Override
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder noteHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class NoteHolder extends RecyclerView.ViewHolder{

        TextView noteText,noteDate;

        public NoteHolder(View itemView) {
            super(itemView);
        }
    }
}
