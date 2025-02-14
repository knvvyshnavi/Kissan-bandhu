package com.example.kissanbandhu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class rentcart extends AppCompatActivity {

    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentcart);
        getSupportActionBar().setTitle("CART");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#23863B")));
        nav = findViewById(R.id.nav);
        nav.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener(){
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.homenav:
                        startActivity(new Intent(rentcart.this,buyerhomepage.class));
                        break;
                    case R.id.cartnav:
                        startActivity(new Intent(rentcart.this,rentcart.class));
                        break;
                    case R.id.ordersnav:
                        startActivity(new Intent(rentcart.this,orders.class));
                        break;
                }
            }
        });
    }

}