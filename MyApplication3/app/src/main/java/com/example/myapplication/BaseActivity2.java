package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.toolbox.Volley;
import com.android.volley.RequestQueue;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

public class BaseActivity2 extends BaseActivity{

    @Override
    public int myView(){

        return (R.layout.basectivity2);

    }

    @Override
    public void GoToBaseActivity(View view){

        Log.e("DEVE0304", "Go Back");

        Intent intent = new Intent(view.getContext(), BaseActivity2.class);
        view.getContext().startActivity(intent);

    }

    @Override
    public void GoToBaseActivity2(View view) {

    };

}
