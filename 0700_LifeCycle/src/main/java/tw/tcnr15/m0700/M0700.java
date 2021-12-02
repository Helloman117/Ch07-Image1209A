package tw.tcnr15.m0700;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class M0700 extends AppCompatActivity {
    private static final String TAG = "Tcnr15=>";
//private final String TAG="tcnr15陳癸端=>";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0700);
        Log.d(TAG, "執行OnCreate");
        setupComponent();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "執行OnStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "執行OnPause");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "執行OnRestart");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "執行OnStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "執行OnDestroy");
        super.onDestroy();
    }

    private void setupComponent() {
        int a =9999+123;
        Log.d(TAG,"setupViewComponent");
    }
    //*******************************************************************************************
    @Override
    public void onBackPressed() {
//super.onBackPressed();//不執行這行
        Toast.makeText(getApplication(), "禁用返回鍵", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.m0700, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.action_settings:
                this.finish();
                break;
        }

        return super.onOptionsItemSelected(item);
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
