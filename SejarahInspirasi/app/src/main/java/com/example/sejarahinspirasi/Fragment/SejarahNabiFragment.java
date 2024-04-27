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
import com.example.sejarahinspirasi.Model.Sejarah;
import com.example.sejarahinspirasi.R;
import java.util.ArrayList;

public class SejarahNabiFragment extends Fragment {

    public static RecyclerViewAdapter myAdapter;
    Context context;
    int categoryId;
    ArrayList<Sejarah> sejarahArray = new ArrayList<>();

    public SejarahNabiFragment(Context context, int categoryId){
        this.context = context;
        this.categoryId = categoryId;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sejarah_nabi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        for (Sejarah sejarah : Data.sejarah1) {
            if (sejarah.getCategoryId() == categoryId){
                sejarahArray.add(sejarah);
            }
        }
        RecyclerView myrecyclerView = view.findViewById(R.id.recyclerView_id);
        FragmentManager fragmentManager = getParentFragmentManager();
        myAdapter = new RecyclerViewAdapter(context, sejarahArray, fragmentManager);
        myrecyclerView.setLayoutManager(new GridLayoutManager(context, 1));
        myrecyclerView.setAdapter(myAdapter);
    }
}