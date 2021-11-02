package com.khitjova.poem

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MAinActivity"
private const val MY_OWN_LOG_TAG = "MyOwnLog"


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MY_OWN_LOG_TAG, "Мне снилось: на утесе стоя,\nЯ в море броситься хотел,")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_OWN_LOG_TAG, "Вдруг ангел света и покоя\nМне песню чудную запел:")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_LOG_TAG, "«Дождись весны! Приду я рано,\nСкажу: будь снова человек!")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_LOG_TAG, "Сниму с главы покров тумана\nИ сон с отяжелелых век;")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_LOG_TAG, "И музе возвращу я голос,\nИ вновь блаженные часы")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MY_OWN_LOG_TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_LOG_TAG, "Ты обретешь, сбирая колос\nС своей несжатой полосы».")

    }


}

