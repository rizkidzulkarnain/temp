package id.co.telkom.volunteer.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.co.telkom.volunteer.GITSApplication

/**
 * Created by Rizki Dzulkarnain on 12/31/2019.
 */
abstract class BaseAppCompatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as? GITSApplication)?.appComponent?.inject(this)
    }
}