package com.syntaxcbpgec.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipPercent, tipTotal, totalBill;
    ImageButton bad,average,best;
    EditText billAmount;

    float percentage = 0;

    float finalBillAmount = 0;
    float totalBillAmount = 0;

    float REGULAR_TIP_PERCENTAGE = 10;
    float DEFAULT_TIP_PERCENTAGE = 15;
    float EXCELLENT_TIP_PERCENTAGE = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipPercent = findViewById(R.id.tipPercent);
        tipTotal = findViewById(R.id.tipTotal);
        totalBill = findViewById(R.id.totalBill);

        bad = findViewById(R.id.bad);
        average = findViewById(R.id.average);
        best = findViewById(R.id.best);

        billAmount = findViewById(R.id.billAmount);

        bad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int bill= Integer.parseInt(billAmount.getText().toString());
                tipPercent.setText("10%");
                int tipTotalana = 10/100*bill;
                tipTotal.setText(tipTotalana);
                int totalBillana = tipTotalana + bill;
                totalBill.setText(totalBillana);


            }
        });




        average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int bill= Integer.parseInt(billAmount.getText().toString());
                tipPercent.setText("15%");
                int tipTotalana = 15/100*bill;
                tipTotal.setText(tipTotalana);
                int totalBillana = tipTotalana + bill;
                totalBill.setText(totalBillana);


            }
        });


        best.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int bill= Integer.parseInt(billAmount.getText().toString());
                tipPercent.setText("20%");
                int tipTotalana = 20/100*bill;
                tipTotal.setText(tipTotalana);
                int totalBillana = tipTotalana + bill;
                totalBill.setText(totalBillana);


            }
        });


    }
}
