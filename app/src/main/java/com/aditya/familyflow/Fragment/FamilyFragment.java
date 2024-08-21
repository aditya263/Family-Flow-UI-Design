package com.aditya.familyflow.Fragment;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.aditya.familyflow.AddPerson;
import com.aditya.familyflow.FamilyInfo;
import com.aditya.familyflow.R;


public class FamilyFragment extends Fragment {

    public View rootView;
    Button btnFamilyInfo,btnAddPerson;
    Intent intent;
    LinearLayout add_father,add_mother,add_child,add_brother,add_sister,view_info,edit_info,remove_info,show_relation;
    BottomSheetDialog dialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_family, container, false);

        btnFamilyInfo=rootView.findViewById(R.id.btnFamilyInfo);
        btnAddPerson=rootView.findViewById(R.id.btnAddPerson);


        btnFamilyInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getActivity(), FamilyInfo.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);
            }
        });

        btnAddPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addDialog();
            }
        });


        return rootView;
    }

    private void addDialog() {
        dialog=new BottomSheetDialog(getContext());
        dialog.setContentView(R.layout.bottom_dialogbox);

        add_father=dialog.findViewById(R.id.add_father);
        add_mother=dialog.findViewById(R.id.add_mother);
        add_child=dialog.findViewById(R.id.add_child);
        add_brother=dialog.findViewById(R.id.add_brother);
        add_sister=dialog.findViewById(R.id.add_sister);
        view_info=dialog.findViewById(R.id.view_info);
        /*edit_info=dialog.findViewById(R.id.edit_info);
        remove_info=dialog.findViewById(R.id.remove_info);
        show_relation=dialog.findViewById(R.id.show_relation);*/

        add_father.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getActivity(), AddPerson.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);
                dialog.cancel();
            }
        });

        add_mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getActivity(), AddPerson.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);
                dialog.cancel();
            }
        });

        add_child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getActivity(), AddPerson.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);
                dialog.cancel();
            }
        });

        add_brother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getActivity(), AddPerson.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);
                dialog.cancel();
            }
        });

        add_sister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getActivity(), AddPerson.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);
                dialog.cancel();
            }
        });

        view_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getActivity(), AddPerson.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);
                dialog.cancel();
            }
        });

        /*edit_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getActivity(), ProfileSummary.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);
                dialog.cancel();
            }
        });

        show_relation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(getActivity(), ProfileSummary.class);
                startActivity(intent);
                ((Activity) requireActivity()).overridePendingTransition(0, 0);
                dialog.cancel();
            }
        });

        remove_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertbox();
                dialog.cancel();
            }
        });*/


        dialog.show();
    }

    public void alertbox(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        //Setting message manually and performing action on button click
        builder.setMessage("Are you sure you want to delete this?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                       Toast.makeText(getContext(),"Deleted Successfully",
                                Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        dialog.cancel();
                    }
                });

        AlertDialog alert = builder.create();
        alert.show();
    }

}