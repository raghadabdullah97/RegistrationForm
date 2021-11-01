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
        val name = binding.nameInput.text
        val emile = binding.emailAddress.text
        val pass = binding.password.text.toString()
        val pass2=binding.reEnterPass.text.toString()
        val date = binding.birthdayDate.text.toString()
        val maleIs = binding.male.isChecked
        val femals = binding.bottomFemal.isChecked
        val textmasseg = binding.textMassege



    if (binding.nameInput.text.toString().isEmpty() && emile.toString().isEmpty() && binding.password.text.toString().isEmpty() && binding.reEnterPass.text.toString().isEmpty() && date.isEmpty())
        {
           textmasseg.text = "You shold complate your input"
        }else if (pass==pass2){
            binding.textMassege.text="your name is $name your mail is $emile you last number of password is ${pass.last()}"
        }else textmasseg.text="password faild match"






    }




}