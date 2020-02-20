package com.example.recyclerviewapp1;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

public class MainActivity extends AppCompatActivity {

    SwipeRefreshLayout swipeRefreshLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView programList = (RecyclerView) findViewById(R.id.programList);
        programList.setLayoutManager(new LinearLayoutManager(this));
        final String[] languages = {"java", "javascript", "c", "c++", "Python", "php", "c#", "java", "javascript", "c", "c++", "Python", "php", "c#"};
        programList.setAdapter(new ProgramAdapter(languages, this));


        swipeRefreshLayout = findViewById(R.id.swipeRefresh);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                programList.setAdapter(new ProgramAdapter(languages, MainActivity.this));
                swipeRefreshLayout.setRefreshing(false);
            }
        });


    }

    private void runAnimation() {
        /*final LayoutAnimationController controller =
                AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation_fall_down);
        recyclerView.setLayoutAnimation(controller);
        recyclerView.scheduleLayoutAnimation();

*/
    }
    /////////////////////////////////
    /////////////////////////////////
    /////////////////////////////////



}
