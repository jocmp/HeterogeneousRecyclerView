package edu.gvsu.cis.campbjos.heterogeneousrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity implements MainView {

  @InjectView(R.id.recyclerView)
  RecyclerView mRecyclerView;

  private MainActivityPresenter mainActivityPresenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);
    mainActivityPresenter = new MainActivityPresenter(this);
    mRecyclerView.setLayoutManager(
        new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    mainActivityPresenter.loadRecyclerObjects();
  }

  @Override
  public void swapAdapter(Adapter adapter) {
    mRecyclerView.swapAdapter(adapter, false);
  }
}
