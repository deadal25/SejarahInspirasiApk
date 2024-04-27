package com.example.sejarahinspirasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.sejarahinspirasi.Fragment.AddSejarahFragment;
import com.example.sejarahinspirasi.Fragment.AllSejarahFragment;
import com.example.sejarahinspirasi.Fragment.SejarahPahlawanFragment;
import com.example.sejarahinspirasi.Fragment.SejarahNabiFragment;
import com.example.sejarahinspirasi.Fragment.SejarahAhliFisikaFragment;

public class MainActivity extends AppCompatActivity {

    public static int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        MainActivity.categoryId = categoryId;
    }

    private static int categoryId;


    DrawerLayout drawerLayout;
    ImageView menu;
    public static TextView allsejarah, addsejarah, sejarahnabi, sejarahahlifisika, sejarahpahlawan, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title =  findViewById(R.id.title);
        drawerLayout = findViewById(R.id.drawerlayout);
        menu = findViewById(R.id.menu);
        allsejarah = findViewById(R.id.all_sejarah);
        addsejarah = findViewById(R.id.addsejarah);
        sejarahnabi = findViewById(R.id.sejarahnabi);
        sejarahahlifisika = findViewById(R.id.sejarahahlifisika);
        sejarahpahlawan = findViewById(R.id.sejarahpahlawan);
//        TextView title = findViewById(R.id.title_textview);


        FragmentManager fragmentManager = getSupportFragmentManager();
        AllSejarahFragment allSejarahFragment = new AllSejarahFragment(this);
        Fragment fragmentAllSejarah = fragmentManager.findFragmentByTag(AllSejarahFragment.class.getSimpleName());

        if (!(fragmentAllSejarah instanceof AllSejarahFragment)){
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_layout, allSejarahFragment, AllSejarahFragment.class.getSimpleName())
                    .commit();
        }

        menu.setOnClickListener( v -> {
            openDrawer(drawerLayout);
        });

        allsejarah.setOnClickListener(v -> {
            title.setText("All Sejarah");
            closeDrawer(drawerLayout);
            if (!(fragmentAllSejarah instanceof AllSejarahFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, allSejarahFragment, AllSejarahFragment.class.getSimpleName())
                        .commit();
            }
        });

        addsejarah.setOnClickListener(v -> {
            title.setText("Add Sejarah");
            closeDrawer(drawerLayout);
            AddSejarahFragment addSejarahFragment = new AddSejarahFragment(this);
            Fragment fragmentAddFood = fragmentManager.findFragmentByTag(AddSejarahFragment.class.getSimpleName());
            if (!(fragmentAddFood instanceof AddSejarahFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, addSejarahFragment, AddSejarahFragment.class.getSimpleName())
                        .commit();
            }
        });

        sejarahnabi.setOnClickListener(v -> {
            setCategoryId(1);
            title.setText("Sejarah Nabi");
            closeDrawer(drawerLayout);
            SejarahNabiFragment sejarahNabiFragment = new SejarahNabiFragment(this, getCategoryId());
            Fragment fragmentSejarahNabi = fragmentManager.findFragmentByTag(SejarahNabiFragment.class.getSimpleName());
            if (!(fragmentSejarahNabi instanceof SejarahNabiFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, sejarahNabiFragment, SejarahNabiFragment.class.getSimpleName())
                        .commit();
            }
        });

        sejarahahlifisika.setOnClickListener(v -> {
            setCategoryId(2);
            title.setText("Sejarah Ahli Fisika");
            closeDrawer(drawerLayout);
            SejarahAhliFisikaFragment sejarahAhliFisikaFragment = new SejarahAhliFisikaFragment(this, getCategoryId());
            Fragment fragmentSejarahAhliFisika = fragmentManager.findFragmentByTag(SejarahAhliFisikaFragment.class.getSimpleName());
            if (!(fragmentSejarahAhliFisika instanceof SejarahAhliFisikaFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, sejarahAhliFisikaFragment, SejarahAhliFisikaFragment.class.getSimpleName())
                        .commit();
            }
        });

        sejarahpahlawan.setOnClickListener(v -> {
            setCategoryId(3);
            title.setText("Sejarah Pahlawan");
            closeDrawer(drawerLayout);
            SejarahPahlawanFragment sejarahPahlawanFragment = new SejarahPahlawanFragment(this, getCategoryId());
            Fragment fragmentSejarahPahlawan = fragmentManager.findFragmentByTag(SejarahPahlawanFragment.class.getSimpleName());
            if (!(fragmentSejarahPahlawan instanceof SejarahPahlawanFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, sejarahPahlawanFragment, SejarahPahlawanFragment.class.getSimpleName())
                        .commit();
            }
        });
    }

    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public static void closeDrawer(DrawerLayout drawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
}