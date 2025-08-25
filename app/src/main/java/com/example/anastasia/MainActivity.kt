import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private lateinit var countdownText: TextView
    private lateinit var focusButton: Button
    // ... outras variáveis do cronômetro

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView()

        // Vincule os elementos do XML ao código
        countdownText = findViewById(R.id.countdown_text)
        focusButton = findViewById(R.id.focus_button)

        // ... agora você pode adicionar a lógica
    }
}