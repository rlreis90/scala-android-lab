package android.lab

import android.app.Activity
import android.os.Bundle

class LabActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    override def onCreate(savedInstanceState : Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    }
}