package com.example.tourguide;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class RestarauntFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(getString(R.string.rest_title_arzu), getString(R.string.rest_desc_arzu),
                R.drawable.arzu, getString(R.string.rest_location_arzu),
                getString(R.string.rest_phone_arzu) ,getString(R.string.rest_about_arzu)));
        items.add(new Item(getString(R.string.rest_title_navat), getString(R.string.rest_desc_navat),
                R.drawable.navat, getString(R.string.rest_location_navat),
                getString(R.string.rest_phone_navat),getString(R.string.rest_about_navat)));
        items.add(new Item(getString(R.string.rest_title_faiza), getString(R.string.rest_desc_faiza),
                R.drawable.faiza, getString(R.string.rest_location_faiza),
                getString(R.string.rest_phone_faiza),getString(R.string.rest_about_faiza)));
        items.add(new Item(getString(R.string.rest_title_frunze), getString(R.string.rest_desc_frunze),
                R.drawable.frunze, getString(R.string.rest_location_frunze),
                getString(R.string.rest_phone_frunze),getString(R.string.rest_about_frunze)));
        items.add(new Item(getString(R.string.rest_title_buhara), getString(R.string.rest_desc_buhara),
                R.drawable.buhara, getString(R.string.rest_location_buhara),
                getString(R.string.rest_phone_buhara),getString(R.string.rest_about_buhara)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        final ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}