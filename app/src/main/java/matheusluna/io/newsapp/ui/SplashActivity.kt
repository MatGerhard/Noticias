package matheusluna.io.newsapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import matheusluna.io.newsapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar!!.hide()

        setupSplash()
    }

    private fun setupSplash() = with(binding) {

        imageviewSearchGif.alpha = 0f
        imageviewSearchGif.animate().setDuration(2500).alpha(1f)

        textviewLaunchText.alpha = 0f
        textviewLaunchText.animate().setDuration(2600).alpha(1f)

        textviewAutor.alpha = 0f
        textviewAutor.animate().setDuration(2600).alpha(1f)

        imageviewAndroidGif.alpha = 0f
        imageviewAndroidGif.animate().setDuration(2600).alpha(1f).withEndAction {
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}