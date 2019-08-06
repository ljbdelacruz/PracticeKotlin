package ljbdelacruz.com.practiceapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgotPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        val emailTF=findViewById<EditText>(R.id.fp_emailTF);
        val rButton=findViewById<Button>(R.id.fp_resetPasswordBtn);
        rButton.setOnClickListener{
            this.resetPassword();
        }
    }

    fun resetPassword(){

    }
}
