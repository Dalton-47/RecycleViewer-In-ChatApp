package com.example.chatview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public Button myButton;
   public ArrayList<String> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // data.add("Hello World");
        RecyclerView myRecycleViewer = findViewById(R.id.recyclerViewMain);
        recyclerViewerClass myadapter=new recyclerViewerClass(data);
        myRecycleViewer.setAdapter(myadapter);

        LinearLayoutManager layoutmanager=new LinearLayoutManager(this);
        myRecycleViewer.setLayoutManager(layoutmanager);

        myButton=(Button) findViewById(R.id.sendButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText= (EditText) findViewById(R.id.editTextMessage);
                String text=myEditText.getText().toString().trim();
                data.add(text);
                myadapter.notifyDataSetChanged();

                myEditText.setText("");
            }
        });
    }
}