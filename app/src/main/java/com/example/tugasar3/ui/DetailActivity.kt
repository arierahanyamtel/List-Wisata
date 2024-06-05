package com.example.tugasar3.ui
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasar3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val strTitle = intent.getStringExtra(KEY_TITLE)
        val strDescription = intent.getStringExtra(KEY_DESCRIPTION)
        val intImage = intent.getIntExtra(KEY_IMAGE, 0)

        binding.tvTitle.text = strTitle
        binding.tvDescription.text = strDescription
        binding.imagePlace.setImageResource(intImage)
    }

    companion object {

        const val KEY_TITLE = "title"
        const val KEY_DESCRIPTION = "description"
        const val KEY_IMAGE = "image"
    }
}