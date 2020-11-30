package com.example.myapplication;

import android.content.Intent;
import android.util.Log;
import android.view.View;

public class BaseActivity1 extends BaseActivity{

    @Override
    public int myView(){

        return (R.layout.baseactivity1);

    }

    @Override
    public void GoToBaseActivity(View view){

        Log.e("DEVE0304", "Next Page");

        Intent intent = new Intent(view.getContext(), BaseActivity2.class);
        view.getContext().startActivity(intent);

    }

    @Override
    public void GoToBaseActivity2(View view) {

    };


}
