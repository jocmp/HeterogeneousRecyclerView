package edu.gvsu.cis.campbjos.heterogeneousrecyclerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import edu.gvsu.cis.campbjos.heterogeneousrecyclerview.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * @author josiah
 * @version 11/26/15
 */
public class SimpleTextViewHolder extends RecyclerView.ViewHolder {

  @InjectView(android.R.id.text1)
  TextView simpleLabel;

  public SimpleTextViewHolder(View view) {
    super(view);
    ButterKnife.inject(this, view);
  }

  public TextView getSimpleLabel() {
    return this.simpleLabel;
  }

  public void setSimpleLabel(TextView simpleLabel) {
    this.simpleLabel = simpleLabel;
  }
}
