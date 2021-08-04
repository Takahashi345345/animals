package jp.wings.nikkeibp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //変数宣言【idの取得(TextViex/Button)】
        val textMessage = findViewById<TextView>(R.id.textMessage)
        val buttonCat = findViewById<Button>(R.id.buttonCat)
        val buttonDog = findViewById<Button>(R.id.buttonDog)
        val buttonMonkey = findViewById<Button>(R.id.buttonMonkey)
        val buttonMouse = findViewById<Button>(R.id.buttonMouse)
        val buttonCow = findViewById<Button>(R.id.buttonCow)
        val buttonPig = findViewById<Button>(R.id.buttonPig)
        val buttonHorse = findViewById<Button>(R.id.buttonHorse)
        val buttonElephant = findViewById<Button>(R.id.buttonElephant)
        val buttonGorilla = findViewById<Button>(R.id.buttonGorilla)
        val buttonChick = findViewById<Button>(R.id.buttonChick)
        val buttonSheep = findViewById<Button>(R.id.buttonSheep)
        val buttonFox = findViewById<Button>(R.id.buttonFox)
        val buttonMoai = findViewById<Button>(R.id.buttonMoai)
        val buttonGiraffe = findViewById<Button>(R.id.buttonGiraffe)

        //ボタン押下時の処理【猫のボタン】
        buttonCat.setOnClickListener{

            //テキストの変更【猫の鳴き声】
            textMessage.setText(R.string.text_message_cat)
        }

        //ボタン押下時の処理【犬のボタン】
        buttonDog.setOnClickListener {

            //テキストの変更【犬の鳴き声】
            textMessage.setText(R.string.text_message_dog)
        }

        //ボタン押下時の処理【猿のボタン】
        buttonMonkey.setOnClickListener {

            //テキストの変更【猿の鳴き声】
            textMessage.setText(R.string.text_message_monkey)
        }

        //ボタン押下時の処理【鼠のボタン】
        buttonMouse.setOnClickListener {

            //テキストの変更【鼠の鳴き声】
            textMessage.setText(R.string.text_message_mouse)
        }

        //ボタン押下時の処理【牛のボタン】
        buttonCow.setOnClickListener {

            //テキストの変更【牛の鳴き声】
            textMessage.setText(R.string.text_message_cow)
        }

        //ボタン押下時の処理【豚のボタン】
        buttonPig.setOnClickListener {

            //テキストの変更【豚の鳴き声】
            textMessage.setText(R.string.text_message_pig)
        }

        //ボタン押下時の処理【馬のボタン】
        buttonHorse.setOnClickListener {

            //テキストの変更【馬の鳴き声】
            textMessage.setText(R.string.text_message_horse)
        }

        //ボタン押下時の処理【象のボタン】
        buttonElephant.setOnClickListener {

            //テキストの変更【象の鳴き声】
            textMessage.setText(R.string.text_message_elephant)
        }

        //ボタン押下時の処理【ゴリラのボタン】
        buttonGorilla.setOnClickListener {

            //テキストの変更【ゴリラの鳴き声】
            textMessage.setText(R.string.text_message_gorilla)
        }

        //ボタン押下時の処理【雛のボタン】
        buttonChick.setOnClickListener {

            //テキストの変更【雛の鳴き声】
            textMessage.setText(R.string.text_message_chick)
        }

        //ボタン押下時の処理【羊のボタン】
        buttonSheep.setOnClickListener {

            //テキストの変更【羊の鳴き声】
            textMessage.setText(R.string.text_message_sheep)
        }

        //ボタン押下時の処理【狐のボタン】
        buttonFox.setOnClickListener {

            //テキストの変更【狐の鳴き声】
            textMessage.setText(R.string.text_message_fox)
        }

        //ボタン押下時の処理【モアイのボタン】
        buttonMoai.setOnClickListener {

            //テキストの変更【モアイの鳴き声】
            textMessage.setText(R.string.text_message_moai)
        }

        //ボタン押下時の処理【キリンのボタン】
        buttonGiraffe.setOnClickListener {

            //テキストの変更【キリンの鳴き声】
            textMessage.setText(R.string.text_message_giraffe)
        }
    }
}