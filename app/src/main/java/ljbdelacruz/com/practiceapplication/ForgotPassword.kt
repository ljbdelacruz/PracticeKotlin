package ljbdelacruz.com.practiceapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        fp_resetPasswordBtn.setOnClickListener{
            this.resetPassword(email=fp_emailTF.text.toString());
        }
    }

    fun resetPassword(email:String){
        Log.i("Reset", "Reset password of email: "+email);
    }
}
