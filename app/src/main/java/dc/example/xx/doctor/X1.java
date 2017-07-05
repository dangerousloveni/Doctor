package dc.example.xx.doctor;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class X1 extends AppCompatActivity {
    private Xx xx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x1);
        Intent intent=getIntent();
        xx=(Xx)intent.getSerializableExtra("Xx");

        TextView rest=(TextView)findViewById(R.id.restnum);
        rest.setText(xx.getRest());
        TextView speed=(TextView)findViewById(R.id.speednum);
        speed.setText(xx.getSpeed());
        TextView lou=(TextView)findViewById(R.id.lounum);
        lou.setText(xx.getBuilding_num());
        TextView room=(TextView)findViewById(R.id.roomnum);
        room.setText(xx.getNum());
        TextView bed=(TextView)findViewById(R.id.bednum);
        bed.setText(xx.getBed_num());
        Button back=(Button)findViewById(R.id.back);
        Button refresh=(Button)findViewById(R.id.refresh);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
        refresh.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                xx.Reset("10","50");
                TextView rest=(TextView)findViewById(R.id.restnum);
                rest.setText(xx.getRest());
                TextView speed=(TextView)findViewById(R.id.speednum);
                speed.setText(xx.getSpeed());
            }
        });
    }
}

