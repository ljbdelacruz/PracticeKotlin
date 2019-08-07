package ljbdelacruz.com.practiceapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_dashboard.*
import ljbdelacruz.com.practiceapplication.Adapters.UsersAdapter

class Dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val ads:ArrayList<String> = ArrayList();
        for (i in 1..51) {
            ads.add("Lainel Version: #$i");
        }

        dashboard_searchBtn.setOnClickListener{
            this.searchButtonOnClick(search = dashboard_searchItem.text.toString(), list=ads);
        }
        dashboard_adsDisplay.layoutManager= LinearLayoutManager(this);
        dashboard_adsDisplay.adapter=UsersAdapter(ads);

    }
    fun searchButtonOnClick(search:String, list:ArrayList<String>){
        Log.i("SearchButton", "Searching Item...."+search)
    }

}
