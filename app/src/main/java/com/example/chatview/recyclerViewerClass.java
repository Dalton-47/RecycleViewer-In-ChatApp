package com.example.chatview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

//declare a class called  recyclerViewer class that extends the RecyclerView.Adapter
public class recyclerViewerClass extends RecyclerView.Adapter<recyclerViewerClass.myViewHolder> {

private ArrayList<String> message=new ArrayList<>();

    public static class myViewHolder extends RecyclerView.ViewHolder {
    //public EditText myEditText;
    public TextView myTextView;
        public Button myButton;
        //a constructor
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            //myEditText = (EditText)  itemView.findViewById(R.id.editTextMessage);
            myTextView = (TextView) itemView.findViewById(R.id.textViewMessage);

        }
    }

    public recyclerViewerClass(ArrayList<String> myMessage)
    {
         message=myMessage;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_viewer_items,parent, false );
        myViewHolder mv = new myViewHolder(v);

        return mv;
    }


    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

          holder.myTextView.setText(message.get(position));

    }

    @Override
    public int getItemCount() {
        return message.size();
    }



}
