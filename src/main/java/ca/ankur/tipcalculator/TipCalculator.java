package ca.ankur.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TipCalculator extends AppCompatActivity {

    private RadioGroup buttonGroup;
    private Button calculateButton;
    private double amount;
    private int percentage;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_tip_calculator);
        //buttonGroup = (RadioGroup) findViewById(R.id.buttonGroup);
        //calculateButton = (Button) findViewById(R.id.calculate);
    }

    public void buttonClicked(View view){

        EditText amountEdit = (EditText) findViewById(R.id.amountEdit);
        double amount = Double.valueOf(amountEdit.getText().toString());

        EditText numberEdit = (EditText) findViewById(R.id.numberEdit);
        int number = Integer.valueOf(numberEdit.getText().toString());

        RadioGroup buttonGroup = (RadioGroup)findViewById(R.id.buttonGroup);
        int selected = buttonGroup.getCheckedRadioButtonId();
        View radioButton = buttonGroup.findViewById(selected);

        int i = buttonGroup.indexOfChild(radioButton);
        if (i == 2) {percentage = 20;}
        if (i==1) {percentage = 15;}
        if (i==0) {percentage = 10;}




        CalculatorModel model = new CalculatorModel(amount, percentage, number);

        TextView total = (TextView)findViewById(R.id.totalView);
        total.setText("Total = " + model.getTotal());

        TextView perPerson = (TextView) findViewById(R.id.personView);
        perPerson.setText("Per Person = " + model.getPerPerson());

    }

}