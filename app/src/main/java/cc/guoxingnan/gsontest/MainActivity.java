package cc.guoxingnan.gsontest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private List<Result> data;
    private MyAdapter adapter;
    private RequestQueue queue;
    private static final String URL = "http://gank.io/api/data/Android/10/1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        adapter = new MyAdapter(this,data);
        lv.setAdapter(adapter);

        initListener();
    }

    private void initData() {
        data = new ArrayList<Result>();
        queue = Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                Android result = gson.fromJson(response, Android.class);

                data.addAll(result.getResults());
            }
        }, new ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this,"获取数据失败",Toast.LENGTH_SHORT).show();
            }
        });

        request.setTag("test");
        queue.add(request);
    }

    private void initView() {
        lv = (ListView) findViewById(R.id.lv);
    }

    private void initListener() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data.get(position).getUrl()));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        queue.cancelAll("test");
    }
}
