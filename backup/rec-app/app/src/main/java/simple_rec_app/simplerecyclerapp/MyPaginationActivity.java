package simple_rec_app.simplerecyclerapp;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MyPaginationActivity extends AppCompatActivity {


    private LinearLayoutManager layoutManager;
    private MyPaginationAdapter myPaginationAdapter;
    private boolean isScrolling = false;
    private ArrayList mList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView recyclerView = findViewById(R.id.recycler_view_list);
        layoutManager = new LinearLayoutManager(this);

        //init data
        String[] randomNumbers = {"12", "23", "36", "48", "52", "64", "77", "84", "91", "11", "3", "9"};
        mList = new ArrayList(Arrays.asList(randomNumbers));


        //set layout manager
        recyclerView.setLayoutManager(layoutManager);

        //set adapter
        myPaginationAdapter = new MyPaginationAdapter(mList);
        recyclerView.setAdapter(myPaginationAdapter);


       //pagination
        recyclerView.addOnScrollListener(recyclerViewPagination);
    }


    private RecyclerView.OnScrollListener recyclerViewPagination = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL) {
                isScrolling = true;
            }
        }

        @Override
        public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);

            int totalItems = layoutManager.getItemCount();
            int visibleItems = layoutManager.getChildCount();
            int scrolledOutItems = layoutManager.findFirstVisibleItemPosition();
            if (isScrolling && visibleItems + scrolledOutItems == totalItems) {
                Toast.makeText(MyPaginationActivity.this, "loading more...", Toast.LENGTH_SHORT).show();
                isScrolling = false;
                fetchData();
            }
        }
    };

    private void fetchData() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    mList.add(Math.floor(Math.random()*100)+"");
                    myPaginationAdapter.notifyDataSetChanged();

                }
            }
        }, 2000);
    }
}
