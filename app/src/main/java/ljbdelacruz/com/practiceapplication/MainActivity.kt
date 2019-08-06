package ljbdelacruz.com.practiceapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usernameTF=findViewById<EditText>(R.id.login_usernameTF);
        val passwordTF=findViewById<EditText>(R.id.login_passwordTF);
        val loginButton=findViewById<Button>(R.id.login_loginBtn);
        val forgotPasswordButton=findViewById<Button>(R.id.login_forgotPasswordBtn)
        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }
        loginButton.setOnClickListener{
            this.processLogin(username = usernameTF.text.toString(), password = passwordTF.text.toString())
        }
        forgotPasswordButton.setOnClickListener{
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
