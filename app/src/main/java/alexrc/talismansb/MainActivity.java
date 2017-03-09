package alexrc.talismansb;

import android.media.Image;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    //ImageButton Initializer
    public ImageButton CreateNewBtn (int id)
    {
     ImageButton button = (ImageButton) findViewById(id);
        return button;
    }

    // Init Variables
    ImageButton btnKarpada, btnTilt, btnRekt, btnSnow, btnDragon, btnBattle, btnCash, btnDead, btnWaWa, btnMerchant;

    //Init Program for all ImageButtons
    public void imgBtnInit()
    {
        btnKarpada =  CreateNewBtn(R.id.btnKarpada);
        btnTilt = CreateNewBtn(R.id.btnTilt);
        btnRekt = CreateNewBtn(R.id.btnRekt);
        btnSnow = CreateNewBtn(R.id.btnSnow);
        btnDragon = CreateNewBtn(R.id.btnDragon);
        btnBattle = CreateNewBtn(R.id.btnBattle);
        btnCash = CreateNewBtn(R.id.btnCash);
        btnDead = CreateNewBtn(R.id.btnDead);
        btnWaWa = CreateNewBtn(R.id.btnWaWa);
        btnMerchant = CreateNewBtn(R.id.btnMerchant);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBtnInit();

    }
}
