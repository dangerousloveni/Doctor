package dc.example.xx.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class listActivity extends AppCompatActivity {

    private List<Xx> xxList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initXx();
        XxAdapter adapter = new XxAdapter(listActivity.this, R.layout.xx_item, xxList);
        ListView listView = (ListView) findViewById(R.id.List_View);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Xx xx=xxList.get(position);
                Intent intent = new Intent(listActivity.this, X1.class);
                intent.putExtra("Xx",xx);
                startActivity(intent);
            }
        });


    }

    private void initXx() {
        Xx x1 = new Xx("9-304-10", "250", "20","10","100","99",1);
        xxList.add(x1);
        Xx x2 = new Xx("9-304-11", "250", "130","1","1","1",1);
        xxList.add(x2);
        Xx x3 = new Xx("9-304-12", "250", "150","1","1","1",1);
        xxList.add(x3);
        Xx x4 = new Xx("9-304-13", "250", "70","1","1","1",1);
        xxList.add(x4);
        Xx x5 = new Xx("9-304-14", "250", "170","1","1","1",1);
        xxList.add(x5);
        Xx x6 = new Xx("9-304-15", "250", "200","1","1","1",1);
        xxList.add(x6);
        Xx x7 = new Xx("9-304-16", "250", "67","1","1","1",1);
        xxList.add(x7);
        Xx x8 = new Xx("9-304-17", "250", "90","1","1","1",1);
        xxList.add(x8);
        Xx x9 = new Xx("9-304-18", "250", "40","1","1","1",1);
        xxList.add(x9);
        Xx x10 = new Xx("9-304-19", "250", "150","1","1","1",1);
        xxList.add(x10);
    }
}

