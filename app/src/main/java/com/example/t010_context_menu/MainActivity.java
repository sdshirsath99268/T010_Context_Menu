package com.example.t010_context_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.context_txt);
        registerForContextMenu(textView);
    }

    // Menu will be shown when long clicked on Text
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextmenufile,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.fax:
                Toast.makeText(getApplicationContext(), "Clicked on Fax", Toast.LENGTH_SHORT).show();
                break;
            case R.id.call:
                Toast.makeText(getApplicationContext(), "Clicked on Call", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sms:
                Toast.makeText(getApplicationContext(), "Clicked on SMS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.email:
                Toast.makeText(getApplicationContext(), "Clicked on Email", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }

}