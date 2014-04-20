package net.kaosfield.vhh;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import android.app.Activity;

public class LanguageSelectorFragment extends Fragment {
  public LanguageSelectorFragment() {
  }

  @Override
  public View onCreateView(
    LayoutInflater inflater,
    ViewGroup container,
    Bundle savedInstanceState
  ) {
    View rootView = inflater.inflate(R.layout.language_selector_fragment, container, false);
    ListView languageListView = (ListView)(rootView.findViewById(R.id.language_list_view));
    final String[] languages = {"English", "Chinese", "Japanese", "Korean"};
    ArrayAdapter<String> aa = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, languages);
    languageListView.setAdapter(aa);
    languageListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getActivity(), languages[i] + " is selected.", Toast.LENGTH_SHORT).show();
        ((MainActivity) getActivity()).changeFragment(1);
        ((MainActivity) getActivity()).onSectionAttached(2);
        ((MainActivity) getActivity()).restoreActionBar();
      }
    });
    return rootView;
  }

  @Override
  public void onAttach(Activity activity) {
      super.onAttach(activity);
      ((MainActivity) activity).onSectionAttached(1);
  }
}
