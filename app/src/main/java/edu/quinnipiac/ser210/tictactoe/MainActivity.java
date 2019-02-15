package edu.quinnipiac.ser210.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this,TicTacToe.class);
        EditText edittext = (EditText) findViewById(R.id.name);
        String name = edittext.getText().toString();
        intent.putExtra("name", name);
        startActivityForResult(intent, 0);
    }
}
