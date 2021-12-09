package tw.tcnr15.m0702;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class M0702 extends AppCompatActivity implements

        ViewSwitcher.ViewFactory,
        AdapterView.OnItemClickListener {

    // 圖庫的圖片資源索引
    private Integer[] imgArr = {
            R.drawable.img01, R.drawable.img02,
            R.drawable.img03, R.drawable.img04,
            R.drawable.img05, R.drawable.img06,
            R.drawable.img07, R.drawable.img08,
            R.drawable.img09, R.drawable.img10,
            R.drawable.img11, R.drawable.img12,
            R.drawable.img13, R.drawable.img14,
            R.drawable.img15, R.drawable.img16,
    };
    // 圖庫的圖片資源索引
    private Integer[] thumbImgArr = {
            R.drawable.img01, R.drawable.img02,
            R.drawable.img03, R.drawable.img04,
            R.drawable.img05, R.drawable.img06,
            R.drawable.img07, R.drawable.img08,
            R.drawable.img09, R.drawable.img10,
            R.drawable.img11, R.drawable.img12,
            R.drawable.img13, R.drawable.img14,
            R.drawable.img15, R.drawable.img16,
    };
    private GridView gridview;
    private ImageSwitcher imgSwi;
    private int ss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0702);
        setupComponent();
    }

    private void setupComponent() {
        // 從資源類別R中取得介面元件
        gridview = (GridView) findViewById(R.id.m0702_g001);
        imgSwi = (ImageSwitcher) findViewById(R.id.m0702_im01);

        //將縮圖填入 GridView
//        gridview.setAdapter(new GridAdapter(this, thumbImgArr));
        // GridView元件的事件處理
        gridview.setOnItemClickListener((AdapterView.OnItemClickListener) this);

        // 取得GridView元件
        imgSwi.setFactory((ViewSwitcher.ViewFactory) this); // 必須implements ViewSwitcher.ViewFactory


        gridview.setAdapter((new GridAdapter(this, thumbImgArr)));


    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.item1:
                 ss = 1;
                break;
            case R.id.item2:
                ss = 2;
                break;
            case R.id.item3:
                ss = 3;
                break;
            case R.id.item4:
                ss = 4;
                break;
            case R.id.item5:
                ss = 5;
                break;



            case R.id.action_settings:
                this.finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.m0702, menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //------------------------------------------------------------------------------------------
//        imgSwi.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_alpha_out));
//        imgSwi.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_alpha_in));
//        Toast.makeText(getApplication(), "漸變透明度動畫效果",Toast.LENGTH_SHORT ).show();
//------------------------       透明------------------------------------
//        imgSwi.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_scale_rotate_out));
//        imgSwi.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_scale_rotate_in));
//        Toast.makeText(getApplication(), "翻轉動畫效果",Toast.LENGTH_SHORT ).show();
//        ------------------------------------滑落動畫---------------------------
//        imgSwi.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_trans_out));
//        imgSwi.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_trans_in));
//        Toast.makeText(getApplication(), "滑落動畫效果",Toast.LENGTH_SHORT ).show();

//        -----------------------彈跳效果----------------
//        Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_trans_bounce);
//        anim.setInterpolator(new BounceInterpolator());
//        imgSwi.setAnimation(anim);
//        Toast.makeText(getApplicationContext(), getString(R.string.m0702_bounce), Toast.LENGTH_SHORT).show();


        switch (ss){
            case 1:
                imgSwi.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_alpha_out));
        imgSwi.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_alpha_in));
        Toast.makeText(getApplication(), getString(R.string.m0702_alpha),Toast.LENGTH_SHORT ).show();
        break;

            case 2:
                imgSwi.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_scale_rotate_out));
                imgSwi.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_scale_rotate_in));
                Toast.makeText(getApplication(), getString(R.string.m0702_rotate),Toast.LENGTH_SHORT ).show();
                break;

            case 3:
                imgSwi.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_trans_out));
                imgSwi.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_trans_in));
                Toast.makeText(getApplication(), getString(R.string.m0702_trans),Toast.LENGTH_SHORT ).show();
                break;

            case 4:
                Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_trans_bounce);
                anim.setInterpolator(new BounceInterpolator());
                imgSwi.setAnimation(anim);
                Toast.makeText(getApplicationContext(), getString(R.string.m0702_bounce), Toast.LENGTH_SHORT).show();
                break;

            case 5:
                Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.anim_trans_bounce2);
                anim1.setInterpolator(new BounceInterpolator());
                imgSwi.setAnimation(anim1);
                Toast.makeText(getApplicationContext(), getString(R.string.m0702_effects), Toast.LENGTH_SHORT).show();
                break;

        }
        imgSwi.setImageResource(imgArr[position]);




    }

    @Override
    public View makeView() {
        ImageView v = new ImageView(this);
        v.setBackgroundColor(0xFF000000);
        v.setLayoutParams(new ImageSwitcher.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        return v;
    }


    @Override
    protected void onStart() {

        super.onStart();
    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    protected void onPause() {

        super.onPause();
    }

    @Override
    protected void onStop() {

        super.onStop();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }


    //*******************************************************************************************
    @Override
    public void onBackPressed() {
//super.onBackPressed();//不執行這行
        Toast.makeText(getApplication(), "禁用返回鍵", Toast.LENGTH_SHORT).show();
    }


    //*******************************************************************************************
//    ---------------------------------------------------------------------
//*******************************************************************************************
//@Override
//public void onBackPressed() {
////super.onBackPressed();//不執行這行
//    Toast.makeText(getApplication(), "禁用返回鍵", Toast.LENGTH_SHORT).show();
//}
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.m0700, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        switch (item.getItemId()) {
//            case R.id.action_settings:
//                this.finish();
//                break;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
    //*******************************************************************************************
}
