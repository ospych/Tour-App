package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(getString(R.string.park_title_panfilov), getString(R.string.park_desc_panfilov),
                R.drawable.panfilov, getString(R.string.park_location_panfilov),
                getString(R.string.park_about_panfilov)));
        items.add(new Item(getString(R.string.park_title_pobeda), getString(R.string.park_desc_pobeda),
                R.drawable.pobeda, getString(R.string.park_location_pobeda),
                getString(R.string.park_about_pobeda)));
        items.add(new Item(getString(R.string.park_title_duboviy), getString(R.string.park_desc_duboviy),
                R.drawable.duboviy, getString(R.string.park_location_duboviy),
                getString(R.string.park_about_duboviy)));
        items.add(new Item(getString(R.string.park_title_flamingo), getString(R.string.park_desc_flamingo),
                R.drawable.flamingo, getString(R.string.park_location_flamingo),
                getString(R.string.park_about_flamingo)));
        items.add(new Item(getString(R.string.park_title_botanic), getString(R.string.park_desc_botanic),
                R.drawable.botanic, getString(R.string.park_location_botanic),
                getString(R.string.park_about_botanic)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}