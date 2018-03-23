package curesoft.fragmentstart;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
android.app.Fragment fr;
    FragmentTransaction ft;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.buttonPane1);
        b2= (Button) findViewById(R.id.buttonPane2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override

    public void onClick(View v){

        if(v.getId()==R.id.buttonPane1){
            fr=new OneActivity();
            ft=getFragmentManager().beginTransaction();
            ft.replace(R.id.frame1,fr);
            ft.commit();


        }
        else{
        fr=new TwoActivity();
        ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.frame1,fr);
        ft.commit();}

    }
}
