package uz.boxodir.alomalar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.alomalar.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.white2));


        CardView cardView1 = findViewById(R.id.navoiy);
        CardView cardView2 = findViewById(R.id.bobur);
        CardView cardView3 = findViewById(R.id.beruniy);
        CardView cardView4 = findViewById(R.id.ulugbek);
        CardView cardView5 = findViewById(R.id.ibn_sino);
        CardView cardView6 = findViewById(R.id.xorazimiy);
        CardView cardView7 = findViewById(R.id.ahmad);
        CardView cardView8 = findViewById(R.id.buxoriy);
        CardView cardView9 = findViewById(R.id.ali_qushchi);
        CardView cardView10 = findViewById(R.id.naqishbandi);
        CardView cardView11 = findViewById(R.id.farobiy);
        CardView cardView12 = findViewById(R.id.muin_nasafiy);
        ImageView info = findViewById(R.id.imageView2);



        cardView1.setOnClickListener(view -> openInfo(1));
        cardView2.setOnClickListener(view -> openInfo(2));
        cardView3.setOnClickListener(view -> openInfo(3));
        cardView4.setOnClickListener(view -> openInfo(4));
        cardView5.setOnClickListener(view -> openInfo(5));
        cardView6.setOnClickListener(view -> openInfo(6));
        cardView7.setOnClickListener(view -> openInfo(7));
        cardView8.setOnClickListener(view -> openInfo(8));
        cardView9.setOnClickListener(view -> openInfo(9));
        cardView10.setOnClickListener(view -> openInfo(10));
        cardView11.setOnClickListener(view -> openInfo(11));
        cardView12.setOnClickListener(view -> openInfo(12));

        info.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SetingActivity2.class);
            startActivity(intent);
        });



    }
    private void openInfo(int i){
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("Number",i);
        startActivity(intent);
    }

}