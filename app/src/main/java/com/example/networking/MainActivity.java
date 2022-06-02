package com.example.networking;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    RecyclerView recyclerView;

    private List<Mountain> listOfMountains;
    private MyAdapter adapter;


    private final String TAG = "==>" ;
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listOfMountains = new ArrayList<Mountain>();
        adapter = new MyAdapter();

        recyclerView =findViewById(R.id.my_recycler);
        recyclerView.setAdapter(new MyAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        new JsonTask(this).execute(JSON_URL);
    }





    //Parsing
    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Mountain>>() {}.getType();
        listOfMountains = gson.fromJson(json, type);
        adapter.setMountains(listOfMountains);
        adapter.notifyDataSetChanged();
        //Log.d("==>", json);
    }



}
