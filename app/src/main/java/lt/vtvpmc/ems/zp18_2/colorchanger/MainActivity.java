package lt.vtvpmc.ems.zp18_2.colorchanger;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private TextView TextForUser;
    private Button btnRed;
    private Button btnGreen;
    private Button btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        TextForUser = (TextView) findViewById(R.id.textForUser);
        btnRed = (Button) findViewById(R.id.buttonRed);
        btnGreen = (Button) findViewById(R.id.buttonGreen);
        btnBlue = (Button) findViewById(R.id.buttonBlue);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorRed));
                TextForUser.setText("Color: Red");
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                TextForUser.setText("Color: Green");
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                TextForUser.setText("Color: Blue");
            }
        });

    }

    protected void changeColor(RelativeLayout rLayout, Color color) {

    }


}
