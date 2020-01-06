package com.example.syn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class Investment extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button btn1, btn2;
    EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11;
    int[] colorCLassArray = new int[]{Color.BLUE, Color.GRAY, Color.MAGENTA};
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    double amount, amount1, time, rate, terms, a, deposits, interest;
    private BarChart stackedChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investment);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText) findViewById(R.id.e3);
        e4 = (EditText) findViewById(R.id.e4);
        e5 = (EditText) findViewById(R.id.e5);
        e6 = (EditText) findViewById(R.id.e6);
        e7 = (EditText) findViewById(R.id.e7);
        e8 = (EditText) findViewById(R.id.e8);
        e9 = (EditText) findViewById(R.id.e9);
        e10 = (EditText) findViewById(R.id.e10);
        e11 = (EditText) findViewById(R.id.e11);
        stackedChart = (BarChart) findViewById(R.id.chart1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (e1.getText().toString().length() == 0) {
                    e1.setText("0");
                }
                if (e2.getText().toString().length() == 0) {
                    e2.setText("0");
                }
                if (e3.getText().toString().length() == 0) {
                    e3.setText("0");
                }
                if (e4.getText().toString().length() == 0) {
                    e4.setText("0");
                }
                if (e5.getText().toString().length() == 0) {
                    e5.setText("0");
                }
                amount = Double.parseDouble(e1.getText().toString());
                rate = Double.parseDouble(e2.getText().toString());
                time = Double.parseDouble(e3.getText().toString());
                amount1 = Double.parseDouble(e4.getText().toString());
                terms = Double.parseDouble(e5.getText().toString());
                double R = rate / (double) 100;
                double T = time / 12;
                double n = terms;

                BarDataSet barDataSet = new BarDataSet(dataValues1(amount, amount1, terms, rate, time), "Investment");
                barDataSet.setColors(colorCLassArray);
                BarData bardata = new BarData(barDataSet);
                barDataSet.setDrawIcons(false);
                barDataSet.setStackLabels(new String[]{"Amount", "Interest", "Total monthly added amount"});
                stackedChart.getDescription().setEnabled(false);
                stackedChart.setData(bardata);
            }

            private ArrayList<BarEntry> dataValues1(double amount, double amount1, double term, double rate, double time) {
                ArrayList<BarEntry> dataVals = new ArrayList<BarEntry>();


                double T = time / (double) 12;
                double R = rate / (double) 100;

                float[] array1 = new float[10];
                float[] array2 = new float[10];
                float[] array3 = new float[10];


                for (int i = 1; i <= T; i++) {
                    a = (double) (amount * (Math.pow((1 + (R / term)), (term * i))) + amount1 * ((Math.pow((1 + (R / term)), (term * i)) - 1) / (R / term)));
                    array1[i] = (float) amount;
                    array2[i] = (float) (a - amount - array2[i]);
                    array3[i] = (float) (term * amount1 * i);

                    dataVals.add(new BarEntry(i, new float[]{array1[i], array2[i], array3[i]}));
                }
                a = (double) (amount * (Math.pow((1 + (R / term)), (term * T))) + amount1 * ((Math.pow((1 + (R / term)), (term * T)) - 1) / (R / term)));


                e7.setText(String.format("%.2f", a));
                deposits = term * T * amount1;

                e9.setText(String.format("%.2f", deposits));
                interest = a - deposits;
                e11.setText(String.format("%.2f", interest));


                return dataVals;
            }

        });

    }

    public void select(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.policy_menu);
        popup.show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.policy1: {
                Toast.makeText(this, "Item is clicked", Toast.LENGTH_SHORT).show();
                e2.setText("6.35");
                e3.setText("60");
                e5.setText("4");
                break;
            }
            case R.id.policy2: {
                Toast.makeText(this, "Item is clicked", Toast.LENGTH_SHORT).show();
                e2.setText("6.00");
                e3.setText("48");
                e5.setText("12");
                break;
            }
            case R.id.policy3: {
                Toast.makeText(this, "Item is clicked", Toast.LENGTH_SHORT).show();
                e2.setText("5.35");
                e3.setText("84");
                e5.setText("6");
                break;
            }
            case R.id.policy4: {
                Toast.makeText(this, "Item is clicked", Toast.LENGTH_SHORT).show();
                e2.setText("5.75");
                e3.setText("60");
                e5.setText("6");
                break;
            }
            case R.id.policy5: {
                Toast.makeText(this, "Item is clicked", Toast.LENGTH_SHORT).show();
                e2.setText("7.00");
                e3.setText("24");
                e5.setText("3");
                break;
            }
            default:
                return false;
        }
        return false;
    }
}
