package net.kaosfield.vhh;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Activity;
import android.widget.TextView;

public class GuideFragment extends Fragment {
  public GuideFragment() {
  }

  @Override
  public View onCreateView(
    LayoutInflater inflater,
    ViewGroup container,
    Bundle savedInstanceState
  ) {
    View rootView = inflater.inflate(R.layout.guide_fragment, container, false);
    TextView spotTitle = (TextView)(rootView.findViewById(R.id.spot_title));
    TextView spotDescription = (TextView)(rootView.findViewById(R.id.spot_description));
    return rootView;
  }

  @Override
  public void onAttach(Activity activity) {
      super.onAttach(activity);
      ((MainActivity) activity).onSectionAttached(2);
  }
}
