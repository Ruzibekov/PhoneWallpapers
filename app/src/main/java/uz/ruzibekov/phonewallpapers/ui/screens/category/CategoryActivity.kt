package uz.ruzibekov.phonewallpapers.ui.screens.category

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import uz.ruzibekov.phonewallpapers.ui.theme.PhoneWallpapersTheme

class CategoryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhoneWallpapersTheme {

            }
        }
    }
}