package edu.gvsu.cis.campbjos.heterogeneousrecyclerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.gvsu.cis.campbjos.heterogeneousrecyclerview.R;
import edu.gvsu.cis.campbjos.heterogeneousrecyclerview.models.User;

import java.util.List;

/**
 * @author Josiah Campbell
 * @version November 2015
 */
public class ComplexRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

  // The items to display in your RecyclerView
  private List<Object> dataSet;
  private static final int USER = 0;
  private static final int IMAGE = 1;

  // Provide a suitable constructor (depends on the kind of dataset)
  public ComplexRecyclerViewAdapter(List<Object> dataSet) {
    this.dataSet = dataSet;
  }

  // Return the size of your dataset (invoked by the layout manager)
  @Override
  public int getItemCount() {
    return this.dataSet.size();
  }

  //Returns the view type of the item at position for the purposes of view recycling.
  @Override
  public int getItemViewType(int position) {
    if (dataSet.get(position) instanceof User) {
      return USER;
    } else if (dataSet.get(position) instanceof String) {
      return IMAGE;
    }
    return -1;
  }


  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
    RecyclerView.ViewHolder viewHolder;
    LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

    switch (viewType) {
      case USER:
        View userView = inflater.inflate(R.layout.layout_viewholder_user, viewGroup, false);
        viewHolder = new UserViewHolder(userView);
        break;
      case IMAGE:
        View imageView = inflater.inflate(R.layout.layout_viewholder_image, viewGroup, false);
        viewHolder = new ImageViewHolder(imageView);
        break;
      default:
        View view = inflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
        viewHolder = new SimpleTextViewHolder(view);
        break;
    }
    return viewHolder;
  }


  /**
   * This method internally calls onBindViewHolder(ViewHolder, int) to update the
   * RecyclerView.ViewHolder contents with the item at the given position
   * and also sets up some private fields to be used by RecyclerView.
   *
   * @param viewHolder The type of RecyclerView.ViewHolder to populate
   * @param position Item position in the ViewGroup.
   */
  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
    switch (viewHolder.getItemViewType()) {
      case USER:
        UserViewHolder userVh = (UserViewHolder) viewHolder;
        configureUserViewHolder(userVh, position);
        break;
      case IMAGE:
        ImageViewHolder imageVh = (ImageViewHolder) viewHolder;
        configureImageViewHolder(imageVh);
        break;
      default:
        SimpleTextViewHolder defaultVh = (SimpleTextViewHolder) viewHolder;
        configureDefaultViewHolder(defaultVh, position);
        break;
    }
  }

  private void configureDefaultViewHolder(SimpleTextViewHolder vh, int position) {
    vh.getSimpleLabel().setText((CharSequence) dataSet.get(position));
  }

  private void configureUserViewHolder(UserViewHolder userVh, int position) {
    User user = (User) dataSet.get(position);
    if (user != null) {
      userVh.getUserNameLabel().setText("Name: " + user.getUserName());
      userVh.getLocationLabel().setText("Hometown: " + user.getLocation());
    }
  }

  private void configureImageViewHolder(ImageViewHolder imageVh) {
    imageVh.getImageView().setImageResource(R.drawable.sample_golden_gate);
  }
}