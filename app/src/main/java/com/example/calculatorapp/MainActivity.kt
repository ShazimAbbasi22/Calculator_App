package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button0.setOnClickListener {
            binding.InputText.append("0")
        }
        binding.button1.setOnClickListener {
            binding.InputText.append("1")
        }
        binding.button2.setOnClickListener {
            binding.InputText.append("2")
        }
        binding.button3.setOnClickListener {
            binding.InputText.append("3")
        }
        binding.button4.setOnClickListener {
            binding.InputText.append("4")
        }
        binding.button5.setOnClickListener {
            binding.InputText.append("5")
        }
        binding.button6.setOnClickListener {
            binding.InputText.append("6")
        }
        binding.button7.setOnClickListener {
            binding.InputText.append("7")
        }
        binding.button8.setOnClickListener {
            binding.InputText.append("8")
        }
        binding.button9.setOnClickListener {
            binding.InputText.append("9")
        }
        binding.buttonPlus.setOnClickListener {
            binding.InputText.append("+")
        }
        binding.buttonMinus.setOnClickListener {
            binding.InputText.append("-")
        }
        binding.buttonX.setOnClickListener {
            binding.InputText.append("*")
        }
        binding.buttonDivide.setOnClickListener {
            binding.InputText.append("/")
        }
        binding.buttonDot.setOnClickListener {
            binding.InputText.append(".")
        }
        binding.buttonOpenBracket.setOnClickListener {
            binding.InputText.append("(")
        }
        binding.buttonCloseBracket.setOnClickListener {
            binding.InputText.append(")")
        }
        binding.buttonAllClear.setOnClickListener {
            binding.InputText.text = ""
            binding.OutputText.text = ""
        }
        binding.buttonEquals.setOnClickListener {
            val expression = ExpressionBuilder(binding.InputText.text.toString()).build()

            val result = expression.evaluate()
            val longresult = result.toLong()

            if (result==longresult.toDouble()) {
                binding.OutputText.text = longresult.toString()
            } else {
                binding.OutputText.text = result.toString()
            }
        }

    }
}