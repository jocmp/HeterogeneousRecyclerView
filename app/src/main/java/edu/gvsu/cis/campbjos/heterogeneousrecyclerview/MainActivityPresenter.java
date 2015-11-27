package edu.gvsu.cis.campbjos.heterogeneousrecyclerview;

import android.support.v7.widget.RecyclerView.Adapter;

import edu.gvsu.cis.campbjos.heterogeneousrecyclerview.adapters.ComplexRecyclerViewAdapter;
import edu.gvsu.cis.campbjos.heterogeneousrecyclerview.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Presenter class for Main Activity.
 *
 * @author Josiah Campbell
 * @version November 2015
 */
public class MainActivityPresenter {

  private MainView mainView;
  private Adapter adapter;

  public MainActivityPresenter(MainView mainView) {
    this.mainView = mainView;
  }

  public void loadRecyclerObjects() {
    adapter = new ComplexRecyclerViewAdapter(getSampleArrayList());
    mainView.swapAdapter(adapter);
  }
  private List<Object> getSampleArrayList() {
    List<Object> items = new ArrayList<>();
    items.add(new User("Dany Targaryen", "Valyria"));
    items.add(new User("Rob Stark", "Winterfell"));
    items.add("image");
    items.add(new User("Jon Snow", "Castle Black"));
    items.add("image");
    items.add(new User("Tyrion Lanister", "King's Landing"));
    return items;
  }
}
