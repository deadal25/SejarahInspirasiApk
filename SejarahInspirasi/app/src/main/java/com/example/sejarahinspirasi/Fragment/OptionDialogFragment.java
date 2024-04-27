package com.example.sejarahinspirasi.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.example.sejarahinspirasi.DataSource.Data;
import com.example.sejarahinspirasi.MainActivity;
import com.example.sejarahinspirasi.R;

public class OptionDialogFragment extends DialogFragment {

    private Button btnCancel, btnDelete;
    private int id;
    Context context;

    public OptionDialogFragment(int id, Context context){
        this.id = id;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_option_dialog, container, false);
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnCancel = view.findViewById(R.id.btn_cancel);
        btnDelete = view.findViewById(R.id.btn_delete);
        btnCancel.setOnClickListener( v -> {
            getDialog().cancel();
        });
        btnDelete.setOnClickListener( v -> {
            Data.sejarah1.removeIf(recipe -> recipe.getId() == id);
            System.out.println(id);
            Toast.makeText(context, "Data berhasil dihapus", Toast.LENGTH_SHORT).show();
            FragmentManager fragmentManager = getParentFragmentManager();
            AllSejarahFragment allSejarahFragment = new AllSejarahFragment(context);
            SejarahNabiFragment sejarahNabiFragment = new SejarahNabiFragment(context, MainActivity.getCategoryId());
            SejarahAhliFisikaFragment sejarahAhliFisikaFragment = new SejarahAhliFisikaFragment(context, MainActivity.getCategoryId());
            SejarahPahlawanFragment sejarahPahlawanFragment = new SejarahPahlawanFragment(context, MainActivity.getCategoryId());
            Fragment fragmentSejarahNabi = fragmentManager.findFragmentByTag(SejarahNabiFragment.class.getSimpleName());
            Fragment fragmentSejarahAhliFisika = fragmentManager.findFragmentByTag(SejarahAhliFisikaFragment.class.getSimpleName());
            Fragment fragmentSejarahPahlawan = fragmentManager.findFragmentByTag(SejarahPahlawanFragment.class.getSimpleName());
            if (fragmentSejarahNabi instanceof SejarahNabiFragment){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, sejarahNabiFragment, SejarahNabiFragment.class.getSimpleName())
                        .commit();
            } else if (fragmentSejarahAhliFisika instanceof SejarahAhliFisikaFragment){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, sejarahAhliFisikaFragment, SejarahAhliFisikaFragment.class.getSimpleName())
                        .commit();
            } else if (fragmentSejarahPahlawan instanceof SejarahPahlawanFragment){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, sejarahPahlawanFragment, SejarahPahlawanFragment.class.getSimpleName())
                        .commit();
            } else {
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, allSejarahFragment, AllSejarahFragment.class.getSimpleName())
                        .commit();
            }
            getDialog().dismiss();
        });
    }
}