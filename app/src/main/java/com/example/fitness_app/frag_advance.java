package com.example.fitness_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapters.main_course_adapter;
import Classes.RecyclerItemClickListener;
import Models.main_course_model;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link frag_advance#newInstance} factory method to
 * create an instance of this fragment.
 */
public class frag_advance extends Fragment {

    RecyclerView recyclerView;
    public int sub_button;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public frag_advance() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment frag_advance.
     */
    // TODO: Rename and change types and number of parameters
    public static frag_advance newInstance(String param1, String param2) {
        frag_advance fragment = new frag_advance();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_frag_advance, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        final ArrayList<main_course_model> list = new ArrayList<>();

        list.add(new main_course_model(R.drawable.arm_advance_bdy));
        list.add(new main_course_model(R.drawable.shoulder_back_advance_bdy));
        list.add(new main_course_model(R.drawable.chest_advance_bdy));
        list.add(new main_course_model(R.drawable.abs_advance_bdy));
        list.add(new main_course_model(R.drawable.lower_bdy));
        list.add(new main_course_model(R.drawable.leg_advance_bdy));
        list.add(new main_course_model(R.drawable.full_bdy));
        list.add(new main_course_model(R.drawable.weight_loss_));

        main_course_adapter adapter = new main_course_adapter(list,getContext());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                main_course_model model = list.get(position);
                sub_button = model.getPic();
                Intent intent = new Intent(getActivity(), sub_courses.class);
                intent.putExtra("sub_button", sub_button);
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

        return view;

    }
}