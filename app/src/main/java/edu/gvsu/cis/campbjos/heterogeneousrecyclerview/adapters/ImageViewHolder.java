package edu.gvsu.cis.campbjos.heterogeneousrecyclerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import edu.gvsu.cis.campbjos.heterogeneousrecyclerview.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * ViewHolder class for image item.
 *
 * @author Josiah Campbell
 * @version 11/26/15
 */
public class ImageViewHolder extends RecyclerView.ViewHolder {

  @InjectView(R.id.imageViewExample)
  ImageView imageViewExample;

  public ImageViewHolder(View view) {
    super(view);
    ButterKnife.inject(this, view);
  }

  public ImageView getImageView() {
    return this.imageViewExample;
  }

  public void setImageView(ImageView imageViewExample) {
    this.imageViewExample = imageViewExample;
  }
}