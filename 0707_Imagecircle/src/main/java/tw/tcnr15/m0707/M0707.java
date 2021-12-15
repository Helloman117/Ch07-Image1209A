package tw.tcnr15.m0707;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class M0707 extends AppCompatActivity implements View.OnClickListener {

    private ImageView img01;
    private ImageButton imb02;
    private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0707);
        setupViewComponent();
    }

    private void setupViewComponent() {
        img01=(ImageView)findViewById(R.id.m0707_imgView);
        imb02=(ImageButton)findViewById(R.id.m0707_imgbutton);
        ans=(TextView)findViewById(R.id.m0707_t001);
        img01.setOnClickListener(this);
        imb02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.m0707_imgView:
                ans.setText(getString(R.string.m0707_t001)+getString(R.string.m0707_imgView));
                break;
            case R.id.m0707_imgbutton:
                ans.setText(getString(R.string.m0707_t001)+getString(R.string.m0707_imgbutton));

        }

    }
}