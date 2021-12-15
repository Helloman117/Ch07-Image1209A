package tw.tcnr15.m0708;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class M0708 extends ListActivity {

    private TextView mTxtResult;
    private String[] listFromResource,listFromResource2;
    private ArrayList<Map<String,Object>> mList;
    private TextView mTxtResult2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0708);
        setViewComponent();
    }

    private void setViewComponent() {
        mTxtResult = (TextView) findViewById(R.id.m0708_t001);
        mTxtResult2 = (TextView) findViewById(R.id.m0708_t002);
        listFromResource = getResources().getStringArray(R.array.teacname);
        listFromResource2 = getResources().getStringArray(R.array.descr);

//---------------------------------------------------------------
        mList = new ArrayList<>();

        for (int i = 0; i < listFromResource.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            String idNme = "t" + String.format("%02d" , i + 1);
            int resID = getResources().getIdentifier(idNme, "drawable",getPackageName() );

            item.put("CicleImageView", resID);                              //從img01抓資料
            item.put("textView", listFromResource[i]);                               //從陣列裡面抓資料
            item.put("textView2", listFromResource2[i]);
            mList.add(item);
            SimpleAdapter adapter = new SimpleAdapter(
                    this,
                    mList,
                    R.layout.list_item,
                    new String[]{"CicleImageView", "textView","textView2"},
                    new int[]{R.id.imgeView, R.id.m0708_t001a});

            //----------------------------------------------------------------
            setListAdapter(adapter);
            ListView listview = getListView();
            listview.setTextFilterEnabled(true);

            listview.setOnItemClickListener(listviewOnItemClkLis);


        }




    }
    AdapterView.OnItemClickListener listviewOnItemClkLis=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            mTxtResult.setText(getText(R.string.m0708_t002)+listFromResource[position]);
            mTxtResult2.setText(getText(R.string.m0708_t001)+listFromResource2[position]);
        }


//                mTxtResult.setText(getText(R.string.m0708_t001)+listFromResource[position]);


    };

}