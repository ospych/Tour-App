package com.example.tourguide;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    public ItemAdapter(Activity context, ArrayList<Item> items) {
        super(context, 0, items);
    }
    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }

        Item currentItem = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);
        assert currentItem != null;
        if (currentItem.hasImage()) {
            imageView.setImageResource(currentItem.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView titleTextView = listItemView.findViewById(R.id.title);
        titleTextView.setText(currentItem.getTitle());

        TextView descTextView = listItemView.findViewById(R.id.desc);
        descTextView.setText(currentItem.getDesc());
        descTextView.setTextColor(R.color.desc_color);

        TextView aboutTextView = listItemView.findViewById(R.id.about);
        aboutTextView.setText(currentItem.getAbout());



        TextView phoneTextView = listItemView.findViewById(R.id.phone);


        ImageView icPhone = listItemView.findViewById(R.id.ic_phone);
        if (currentItem.hasNumber()){
            SpannableString content = new SpannableString(currentItem.getPhone());
            content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
            phoneTextView.setText(content);
        } else {
            phoneTextView.setVisibility(View.GONE);
            icPhone.setVisibility(View.GONE);
        }

        TextView locationTextView = listItemView.findViewById(R.id.location);

        SpannableString content = new SpannableString(currentItem.getLocation());
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);

        locationTextView.setText(content);

        final LinearLayout additional = listItemView.findViewById(R.id.additional);

        @SuppressLint("CutPasteId") final TextView desc = listItemView.findViewById(R.id.desc);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (additional.getVisibility() == View.VISIBLE) {
                    additional.setVisibility(View.GONE);
                } else {
                    additional.setVisibility(View.VISIBLE);
                }

                if (desc.getVisibility() == View.VISIBLE) {
                    desc.setVisibility(View.GONE);
                } else {
                    desc.setVisibility(View.VISIBLE);
                }
            }
        });

        @SuppressLint("CutPasteId") final TextView phone = listItemView.findViewById(R.id.phone);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneN = phone.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneN));
                getContext().startActivity(intent);
            }
        });

        @SuppressLint("CutPasteId") final TextView location = listItemView.findViewById(R.id.location);

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentGeo = location.getText().toString();
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + currentGeo);
                Intent map = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                map.setPackage("com.google.android.apps.maps");
                getContext().startActivity(map);
            }
        });

        return listItemView;
    }
}

