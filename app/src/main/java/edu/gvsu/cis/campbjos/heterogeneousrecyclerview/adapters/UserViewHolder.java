package edu.gvsu.cis.campbjos.heterogeneousrecyclerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import edu.gvsu.cis.campbjos.heterogeneousrecyclerview.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * ViewHolder class for text item.
 *
 * @author Josiah Campbell
 * @version November 2015
 */
public class UserViewHolder extends RecyclerView.ViewHolder {

  @InjectView(R.id.userNameText)
  TextView userNameLabel;
  @InjectView(R.id.locationText)
  TextView locationLabel;

  public UserViewHolder(View view) {
    super(view);
    ButterKnife.inject(this, view);
  }

  public TextView getUserNameLabel() {
    return this.userNameLabel;
  }

  public void setUserNameLabel(TextView userNameLabel) {
    this.userNameLabel = userNameLabel;
  }

  public TextView getLocationLabel() {
    return this.locationLabel;
  }

  public void setLabel2(TextView locationLabel) {
    this.locationLabel = locationLabel;
  }
}
