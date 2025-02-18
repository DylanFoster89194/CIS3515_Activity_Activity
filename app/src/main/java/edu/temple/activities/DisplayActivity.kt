package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Step 3: Extract transferred value and use it for lyricsDisplayTextView text size
        val textSize = intent.getIntExtra("TEXT_SIZE", 16) // Default size is 16

        with(findViewById<TextView>(R.id.lyricsDisplayTextView)) {
            textSize = textSize.toFloat()
        }
    }
}
