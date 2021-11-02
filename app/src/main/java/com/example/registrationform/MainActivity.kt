package com.example.registrationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registrationform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            inputUser()

        }
    }

    fun inputUser() {
        val name = binding.nameInput.editText?.text.toString()
        val emile = binding.emailAddress.editText?.text.toString()
        val pass = binding.password.editText?.text.toString()
        val pass2=binding.reEnterPass.editText?.text.toString()
        val date = binding.birthdayDate.editText?.text.toString()
        val maleIs = binding.male.isChecked
        val femals = binding.bottomFemal.isChecked
        val textmasseg = binding.textMassege



    if (name.isNotEmpty() && emile.isNotEmpty() && pass.isNotEmpty() && pass2.isNotEmpty() && date.isNotEmpty())
        {

        if (pass==pass2){
            binding.textMassege.text="your name is $name \n" +
                    " your mail is $emile \n" +
                    " your password is $pass \n" +
                    "your re-password $pass2 \n" +
                    "your birthday $date"
        }else textmasseg.text="password faild match"

    }else{
        textmasseg.text = "You shold complate your input"
    }
    }



}