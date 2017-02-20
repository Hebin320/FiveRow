package com.hebin.fiverow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnRestart;
    ChessView custonChessMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRestart = (Button) findViewById(R.id.btn_restart);
        custonChessMain = (ChessView) findViewById(R.id.custon_chess_main);
        btnRestart.setOnClickListener(this);
        custonChessMain.myreStart();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_restart:
                custonChessMain.myreStart();
                break;
        }
    }
}
