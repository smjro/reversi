package com.example.smjro.reversi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    ReversiView mReversiView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Utils.d("MainActivity.onCreate");

         mReversiView = new ReversiView(this);

        //setContentView(R.layout.main);
        setContentView(mReversiView);
    }

    // オプションの生成
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        Utils.d("OptionsMenu.onCreate");
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // オプション選択時の動作設定
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuPref:
                openPref();
                break;
            case R.id.menuInit:
                finish();
                break;
            case R.id.menuExit:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    // 設定画面を開く
    private void openPref() {
        Intent intent = new Intent(this, Pref.class);
        startActivity(intent);
    }
}
