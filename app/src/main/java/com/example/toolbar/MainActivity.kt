package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater. inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.tbAddcontact -> Toast.makeText(this,"kamu menekan AddContact", Toast.LENGTH_LONG). show()
            R.id.tbFavorit -> Toast.makeText(this,"kamu menekan Favorite", Toast.LENGTH_LONG). show()
            R.id.tbSetting -> Toast.makeText(this,"kamu menekan Setting", Toast.LENGTH_LONG). show()
            R.id.tbFeedback -> Toast.makeText(this,"kamu menekan AddFeedback", Toast.LENGTH_LONG). show()
            R.id.tbClose -> finish()
        }
        return true
    }
}
