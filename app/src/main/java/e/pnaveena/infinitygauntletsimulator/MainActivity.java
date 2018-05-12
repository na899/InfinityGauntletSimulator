package e.pnaveena.infinitygauntletsimulator;

import android.annotation.SuppressLint;
import android.preference.PreferenceScreen;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.White);
    }

int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0;

    public void cis(View view){

        Random r = new Random();
        int i = r.nextInt( 7- 1) + 1;//maximum=6 and minimum=1
        if(i==1){
            TextView A = findViewById(R.id.stoneOb);
            A.setText("You have got the Power stone!");
            View B = this.getWindow().getDecorView();
            B.setBackgroundResource(R.color.purple);
            a1++;}
        else if(i==2){ TextView A = findViewById(R.id.stoneOb);
            A.setText("You have got the Space stone!");
            View B = this.getWindow().getDecorView();
            B.setBackgroundResource(R.color.blue);
            a2++;}
        else if(i==3){ TextView A = findViewById(R.id.stoneOb);
            A.setText("You have got the Time stone!");
            View B = this.getWindow().getDecorView();
            B.setBackgroundResource(R.color.green);
            a3++;}
        else if(i==4){
            TextView A = findViewById(R.id.stoneOb);
            A.setText("You have got the Reality stone!");
            View B = this.getWindow().getDecorView();
            B.setBackgroundResource(R.color.red);
            a4++;}
        else if(i==5){
            TextView A = findViewById(R.id.stoneOb);
            A.setText("You have got the Soul stone!");
            View B= this.getWindow().getDecorView();
            B.setBackgroundResource(R.color.orange);
             a5++;}
        else if(i==6){ TextView A = findViewById(R.id.stoneOb);
            A.setText("You have got the Mind stone!");
            View B = this.getWindow().getDecorView();
            B.setBackgroundResource(R.color.yellow);
            a6++;}
        display();

    }


    private void success()
    {
        View view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.Grassgreen);
        TextView A = findViewById(R.id.sm);
        A.setVisibility(View.VISIBLE);

    }

    public void reset(View view)
    {

        TextView B = findViewById(R.id.stoneOb);
        B.setText("-------------------------------------------");
        View A = this.getWindow().getDecorView();
        A.setBackgroundResource(R.color.White);

        a1=0;
        a2=0;
        a3=0;
        a4=0;
        a5=0;
        a6=0;
        display();





    }

    private void display()
    {  TextView A = findViewById(R.id.sm);
        A.setVisibility(View.INVISIBLE);

        TextView A1 = findViewById(R.id.PSc);
        A1.setText(""+a1);
        TextView A2 = findViewById(R.id.SpSc);
        A2.setText(""+a2);
        TextView A3 = findViewById(R.id.tsc);
        A3.setText(""+a3);
        TextView A4 = findViewById(R.id.rsc);
        A4.setText(""+a4);
        TextView A5 = findViewById(R.id.ssc);
        A5.setText(""+a5);
        TextView A6 = findViewById(R.id.msc);
        A6.setText(""+a6);
        if(!(A1.getText().toString().equals("0")||A2.getText().toString().equals("0")||A3.getText().toString().equals("0")||A4.getText().toString().equals("0")||A5.getText().toString().equals("0")||A6.getText().toString().equals("0"))){
            success();}
    }
}
