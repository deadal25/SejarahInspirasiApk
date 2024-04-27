package com.example.sejarahinspirasi.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.sejarahinspirasi.Adapter.RecyclerViewAdapter;
import com.example.sejarahinspirasi.DataSource.Data;
import com.example.sejarahinspirasi.R;

public class AllSejarahFragment extends Fragment {

    public static RecyclerViewAdapter myAdapter;
    Context context;

    public AllSejarahFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_all_sejarah, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView myrecyclerView = view.findViewById(R.id.recyclerView_id);
        FragmentManager fragmentManager = getParentFragmentManager();
        myAdapter = new RecyclerViewAdapter(context, Data.sejarah1, fragmentManager);
        myrecyclerView.setLayoutManager(new GridLayoutManager(context, 1));
        myrecyclerView.setAdapter(myAdapter);
    }
}