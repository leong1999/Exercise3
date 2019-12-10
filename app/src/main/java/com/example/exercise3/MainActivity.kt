package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener{
            val ins:Int;
            val spinner = findViewById<Spinner>(R.id.spinnerAge)
            val radio1:RadioButton = findViewById(R.id.radioButtonMale);
            val check:CheckBox = findViewById(R.id.checkBoxSmoker);

            if(spinner.selectedItemPosition == 0)
            {
                ins = 60;
                textViewPremium.text = "Insuren Premium = RM %d".format(ins);
            }

            else if (spinner.selectedItemPosition == 1)
            {

                if(radio1.isChecked && check.isChecked)
                {
                  ins = 220;
                }

                else if (radio1.isChecked)
                {
                    ins = 120;
                }

                else if (check.isChecked)
                {
                    ins = 170;
                }

                else
                {
                    ins = 70;
                }
                textViewPremium.text = "Insuren Premium = RM %d".format(ins);
            }

            else if (spinner.selectedItemPosition == 2)
            {
                if(radio1.isChecked && check.isChecked)
                {
                    ins = 340;
                }

                else if (radio1.isChecked)
                {
                    ins = 190;
                }

                else if (check.isChecked)
                {
                    ins = 240;
                }

                else
                {
                    ins = 90;
                }
                textViewPremium.text = "Insuren Premium = RM %d".format(ins);
            }

            else if (spinner.selectedItemPosition == 3)
            {
                if(radio1.isChecked && check.isChecked)
                {
                    ins = 470;
                }

                else if (radio1.isChecked)
                {
                    ins = 270;
                }

                else if (check.isChecked)
                {
                    ins = 220;
                }

                else
                {
                    ins = 120;
                }
                textViewPremium.text = "Insuren Premium = RM %d".format(ins);
            }

            else if (spinner.selectedItemPosition == 4)
            {
                if(radio1.isChecked && check.isChecked)
                {
                    ins = 600;
                }

                else if (radio1.isChecked)
                {
                    ins = 350;
                }

                else if (check.isChecked)
                {
                    ins = 400;
                }

                else
                {
                    ins = 150;
                }
                textViewPremium.text = "Insuren Premium = RM %d".format(ins);
            }

            else if (spinner.selectedItemPosition == 5)
            {
                if(radio1.isChecked && check.isChecked)
                {
                    ins = 650;
                }

                else if (radio1.isChecked)
                {
                    ins = 350;
                }

                else if (check.isChecked)
                {
                    ins = 450;
                }

                else
                {
                    ins = 150;
                }
                textViewPremium.text = "Insuren Premium = RM %d".format(ins);
            }



        }


    }
}

