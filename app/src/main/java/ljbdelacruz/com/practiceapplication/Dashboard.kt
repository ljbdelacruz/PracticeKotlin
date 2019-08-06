package ljbdelacruz.com.practiceapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        dashboard_searchBtn.setOnClickListener{
            this.searchButtonOnClick(search = dashboard_searchItem.text.toString());
        }
    }
    fun searchButtonOnClick(search:String){
        Log.i("SearchButton", "Searching Item...."+search)
    }

}
