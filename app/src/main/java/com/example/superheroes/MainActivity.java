package com.example.superheroes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
   RecyclerView recyclerView;
   List<Hero> heroList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.Recycler_view);
        heroList= new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://akabab.github.io/superhero-api/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        HeroApi heroApi = retrofit.create(HeroApi.class);

        Call<List<Hero>> call= heroApi.getHeroes();
       call.enqueue(new Callback<List<Hero>>() {
           @Override
           public void onResponse(@NotNull Call<List<Hero>> call, @NotNull Response<List<Hero>> response) {
               if(response.code()!=200){
                   return;
               }
               List<Hero> heroes= response.body();

               assert heroes != null;
               heroList.addAll(heroes);
               PutDataIntoRv(heroList);
           }

           @Override
           public void onFailure(@NotNull Call<List<Hero>> call, @NotNull Throwable t) {

           }
       });
    }

    private void PutDataIntoRv(List<Hero> heroList) {
        Adaptery adaptery=new Adaptery(this,heroList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adaptery);
    }

}






