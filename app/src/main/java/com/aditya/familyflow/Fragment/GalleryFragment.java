package com.aditya.familyflow.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.aditya.familyflow.AddPhoto;
import com.aditya.familyflow.R;

public class GalleryFragment extends Fragment {

    public View rootView;
    private ImageButton add_photo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_gallery, container, false);

        add_photo=rootView.findViewById(R.id.add_photo);
        add_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), AddPhoto.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);

            }
        });

        return rootView;
    }
}