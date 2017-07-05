package dc.example.xx.doctor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Loading extends AppCompatActivity {
    private Button load_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        load_button=(Button)findViewById(R.id.button);
        load_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Loading.this,listActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
