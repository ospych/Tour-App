package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(getString(R.string.monument_title_manas),
                getString(R.string.monument_desc_manas), R.drawable.manas,
                getString(R.string.monument_location_manas),
                getString(R.string.monument_about_manas)));
        items.add(new Item(getString(R.string.monument_title_kozhomkul),
                getString(R.string.monument_desc_kaba), R.drawable.kaba,
                getString(R.string.monument_location_kozhomkul),
                getString(R.string.monument_about_kozhomkul)));
        items.add(new Item(getString(R.string.monument_title_aytmatov),
                getString(R.string.monument_desc_aytmatov), R.drawable.aitmatov,
                getString(R.string.monument_location_aytmatov),
                getString(R.string.monument_about_aytmatov)));
        items.add(new Item(getString(R.string.monument_title_kurmanzhan),
                getString(R.string.monument_desc_kurmanzhan), R.drawable.kurmanzhan,
                getString(R.string.monument_location_kurmanzhan),
                getString(R.string.monument_about_datka)));
        items.add(new Item(getString(R.string.monument_title_erkindik),
                getString(R.string.monument_desc_erkindik), R.drawable.erkindik,
                getString(R.string.monument_location_erkindik),
                getString(R.string.monument_about_erkindik)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}