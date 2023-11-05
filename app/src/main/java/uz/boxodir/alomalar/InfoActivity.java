package uz.boxodir.alomalar;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.alomalar.R;

public class InfoActivity extends AppCompatActivity {

    AppCompatImageView imageView;
    AppCompatTextView textAvtor;
    AppCompatTextView textNumber;
    TextView textInfo;
    AppCompatImageView goBack;





    @SuppressLint({"ResourceAsColor", "AppCompatMethod"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_info);

        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.blue));

        goBack = findViewById(R.id.buttonBack);
        int a =  getIntent().getIntExtra("Number",-1);
        loadData(a);
        goBack.setOnClickListener(v ->{finish();});
    }

    @SuppressLint("ResourceAsColor")
    private void loadData(int index){
        imageView = findViewById(R.id.infoImage);
        textAvtor = findViewById(R.id.avtor);
        textNumber = findViewById(R.id.number);
        textInfo = findViewById(R.id.data);
        switch (index){
            case 1:
                imageView.setImageResource(R.drawable.navoiy);
                textAvtor.setText("Alisher Navoiy");
                textNumber.setText("(1483 - 1530)");
                textInfo.setText(R.string.navoiy);
                break;

                case 2:
                imageView.setImageResource(R.drawable.bobur);
                textAvtor.setText("Zahiriddin \n Muhammad Bobur");
                textNumber.setText("(1441 - 1501)");
                textInfo.setText(R.string.bobur);
                break;

                case 3:
                imageView.setImageResource(R.drawable.beruniy);
                textAvtor.setText("Abu Rayhon \n Beruniy");
                textNumber.setText("(973 - 1048)");
                textInfo.setText(R.string.beruniy);
                break;

            case 4:
                imageView.setImageResource(R.drawable.mirzo);
                textAvtor.setText("Mirzo Ulug'bek");
                textNumber.setText("(1394 - 1449)");
                textInfo.setText(R.string.mirzo);
                break;
            case 5:
                imageView.setImageResource(R.drawable.ibn_sino);
                textAvtor.setText("Abu Ali Ibn Sino");
                textNumber.setText("(980 - 1037)");
                textInfo.setText(R.string.ibn_sino);
                break;
            case 6:
                imageView.setImageResource(R.drawable.al_xorazmiy);
                textAvtor.setText("Muhammad \n al-Xorazmiy");
                textNumber.setText("(783 - 850)");
                textInfo.setText(R.string.al_xorazimiy);
                break;

            case 7:
                imageView.setImageResource(R.drawable.fargoni2);
                textAvtor.setText("Ahmad Farg'oni");
                textNumber.setText("(797 - 865)");
                textInfo.setText(R.string.ahmad_fargoni);
                break;

                case 8:
                imageView.setImageResource(R.drawable.buxoriy);
                textAvtor.setText("Imom Buxoriy");
                textNumber.setText("(810 - 870)");
                textInfo.setText(R.string.buxoriy);
                break;

                case 9:
                imageView.setImageResource(R.drawable.ali_qushchi);
                textAvtor.setText("Ali Qushchi");
                textNumber.setText("(1403 - 1474)");
                textInfo.setText(R.string.ali_qushchi);
                break;


                case 10:
                imageView.setImageResource(R.drawable.bahovuddin);
                textAvtor.setText("Bahouddin \n Naqshband");
                textNumber.setText("(1318 - 1389)");
                textInfo.setText(R.string.naqish_bandi);
                break;




                case 11:
                imageView.setImageResource(R.drawable.farobiy);
                textAvtor.setText("Abu Nasir Farobiy");
                textNumber.setText("(873 - 951)");
                textInfo.setText(R.string.farobiy);
                break;


                case 12:
                imageView.setImageResource(R.drawable.moin_nasafiy);
                textAvtor.setText("Abu Muin Nasafiy");
                textNumber.setText("(1046 - 1115)");
                textInfo.setText(R.string.muin_nasafiy);
                break;


        }
    }
}