
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.roomsiswa.ui.theme.RoomSiswaTheme
import com.example.roomsiswa.uicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RoomSiswaTheme {

                Scaffold { innerPadding ->
                    SiswaApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}