package ljbdelacruz.com.practiceapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }
        login_loginBtn.setOnClickListener{
            this.processLogin(username = login_usernameTF.text.toString(), password = login_passwordTF.text.toString())
        }
        login_forgotPasswordBtn.setOnClickListener{
            this.forgotPassword();
        }
    }


    fun processLogin(username:String, password:String){
        //do oauth here
        val intent = Intent(this, Dashboard::class.java)
        // start your next activity
        startActivity(intent)
    }
    fun forgotPassword(){
        val intent = Intent(this, ForgotPassword::class.java)
        // start your next activity
        startActivity(intent)
    }




}
