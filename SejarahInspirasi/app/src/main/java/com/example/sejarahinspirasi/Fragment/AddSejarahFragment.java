package com.example.sejarahinspirasi.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.example.sejarahinspirasi.DataSource.Data;
import com.example.sejarahinspirasi.MainActivity;
import com.example.sejarahinspirasi.Model.Sejarah;
import com.example.sejarahinspirasi.R;

public class AddSejarahFragment extends Fragment {

    TextView name, latarbelakang, pencapaian;
    ImageButton imgBtn;
    Button btn_post;
    RadioGroup category;
    RadioButton sejarahnabi, sejarahahlifisika, sejarahpahlawan;
    Uri imagePost;

    String nametv, ingredientstv, methodtv;
    int categoryId;

    private ActivityResultLauncher<Intent> galleryLauncher;
    Intent galleryIntent;
    Context context;

    public AddSejarahFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_sejarah, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        name = view.findViewById(R.id.sejarahname);
        latarbelakang = view.findViewById(R.id.latarbelakang);
        pencapaian = view.findViewById(R.id.pencapaian);
        imgBtn = view.findViewById(R.id.imageButton);
        btn_post = view.findViewById(R.id.btn_post);
        category = view.findViewById(R.id.category);
        sejarahnabi = view.findViewById(R.id.sejarahnabi);
        sejarahahlifisika = view.findViewById(R.id.sejarahahlifisika);
        sejarahpahlawan = view.findViewById(R.id.sejarahpahlawan);

        sejarahnabi.setOnClickListener(v -> {
            if (sejarahnabi.isChecked()) {
                categoryId = 1;
            }
        });
        sejarahahlifisika.setOnClickListener(v -> {
            if (sejarahahlifisika.isChecked()) {
                categoryId = 2;
            }
        });
        sejarahpahlawan.setOnClickListener(v -> {
            if (sejarahpahlawan.isChecked()) {
                categoryId = 3;
            }
        });

        imgBtn.setOnClickListener(v -> {
            galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            galleryLauncher.launch(galleryIntent);
        });

        galleryLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK && result.getData() != null){
                        imagePost = result.getData().getData();
                        Glide.with(this).load(imagePost).into(imgBtn);
                    }
                });

        btn_post.setOnClickListener( v -> {
            nametv = name.getText().toString().trim();
            ingredientstv = latarbelakang.getText().toString().trim();
            methodtv = pencapaian.getText().toString().trim();

            Sejarah recipe = new Sejarah(Data.idCount, nametv, ingredientstv, "Pencapaian", methodtv, imagePost, categoryId);
            Data.idCount += 1;
            if (nametv.isEmpty()){
                Toast.makeText(context, "Anda belum mengisi nama makanan!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (categoryId == 0) {
                Toast.makeText(context, "Anda belum mengisi category!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (ingredientstv.isEmpty()){
                Toast.makeText(context, "Anda belum mengisi latarbelakang!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (methodtv.isEmpty()) {
                Toast.makeText(context, "Anda belum mengisi metode!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (recipe.getThumnail_post() == null){
                Toast.makeText(context, "Anda belum mengupload gambar!", Toast.LENGTH_SHORT).show();
                return;
            }
            Data.sejarah1.add(0, recipe);
            Toast.makeText(context, "Post Berhasil Ditambahkan!", Toast.LENGTH_SHORT).show();
            MainActivity.title.setText("All Sejarah");
            AllSejarahFragment allSejarahFragment = new AllSejarahFragment(context);
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_layout, allSejarahFragment, AllSejarahFragment.class.getSimpleName())
                    .commit();
        });
    }
}