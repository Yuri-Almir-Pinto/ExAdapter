package com.example.exadapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exadapter.databinding.FragmentBinding;

import java.util.List;

public class Fragment extends androidx.fragment.app.Fragment {

    private FragmentBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        List<Planeta> planetas = Planeta.getPlanetas();
        recyclerView.setAdapter(new PlanetaAdapter(planetas));

        DividerItemDecoration did = new DividerItemDecoration(
                getActivity().getApplicationContext(),
                DividerItemDecoration.VERTICAL
        );
        recyclerView.addItemDecoration(did);

        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}