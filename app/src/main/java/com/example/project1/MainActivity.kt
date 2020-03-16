package com.example.project1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity : AppCompatActivity() {
    var b = 0
    var a = arrayOf("Пусетинх", "Пжетчухншс", "Фуиупуттнп", "Эеёёрут", "Цфухч", "Хеёуче")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        shifr.setText("${a[b]}")
    }

    fun btn(view: View) {
        var otv = otvet.text.toString()

        if (b == 0) {
            if (otv == "Командир" || otv == "командир") {
                b=b+1
                shifr.setText("${a[b]}")
                back1.setBackgroundColor(Color.GREEN)
            } else {
                shifr.setText("Неправильно")
                back1.setBackgroundColor(Color.RED)
            }
        } else if (b == 1) {
            if (otv == "кванториум" || otv == "Кванториум") {
                b=b+1
                shifr.setText("${a[b]}")
                back1.setBackgroundColor(Color.GREEN)
            } else {
                shifr.setText("Неправильно")
                back1.setBackgroundColor(Color.RED)
            }
        } else if (b == 2) {
            if (otv == "Подоконник" || otv == "подоконник") {
                b=b+1
                shifr.setText("${a[b]}")
                back1.setBackgroundColor(Color.GREEN)
            } else {
                shifr.setText("Неправильно")
                back1.setBackgroundColor(Color.RED)
            }
        } else if (b == 3) {
            if (otv == "Шаблон" || otv == "шаблон") {
                b=b+1
                shifr.setText("${a[b]}")
                back1.setBackgroundColor(Color.GREEN)
            } else {
                shifr.setText("Неправильно")
                back1.setBackgroundColor(Color.RED)
            }
        } else if (b == 4) {
            if (otv == "Спорт" || otv == "спорт") {
                b=b+1
                shifr.setText("${a[b]}")
                back1.setBackgroundColor(Color.GREEN)
            } else {
                shifr.setText("Неправильно")
                back1.setBackgroundColor(Color.RED)
            }
        } else if (b == 5) {
            if (otv == "Работа" || otv == "работа") {
                b=b+1
                shifr.setText("${a[b]}")
                back1.setBackgroundColor(Color.GREEN)
            } else {
                shifr.setText("Неправильно")
                back1.setBackgroundColor(Color.RED)
            }
        }


    }
}