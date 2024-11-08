package com.example.medecalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

class Info {
    String pass = "123";
    String userName = "123";
}


public class MainActivity extends AppCompatActivity {
    private Button btnLogIn;
    private EditText txtName;
    private EditText txtPass;

    Info info = new Info();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnLogIn = findViewById(R.id.btnLogIn);
        txtName = findViewById(R.id.txtName);
        txtPass = findViewById(R.id.txtPass);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = txtName.getText().toString();
                String pass = txtPass.getText().toString();

                if (user.equals(info.userName) && pass.equals(info.pass)) {
                    Toast.makeText(MainActivity.this, "Correct, welcome!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, activity1.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Wrong , try again.", Toast.LENGTH_SHORT).show();
                }



            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.imageView), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}












//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        ArrayAdapter<Pase> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pase33.pase);
//        ListView listView = findViewById(R.id.mylistView);
//        listView.setAdapter(adapter);
//
//
//        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                if (position == 0) {
//
//                    Intent intent = new Intent(MainActivity.this, activity1.class);
//                    startActivity(intent);
//                }
//
//                else if (position == 1) {
//                    Intent intent = new Intent(MainActivity.this, activity3.class);
//                    startActivity(intent);
//                }
//
//                else if (position == 2) {
//                    Intent intent = new Intent(MainActivity.this, activity4.class);
//                    startActivity(intent);
//                }
//            }
//        };
//        listView.setOnItemClickListener(itemClickListener);
//    }
//}
