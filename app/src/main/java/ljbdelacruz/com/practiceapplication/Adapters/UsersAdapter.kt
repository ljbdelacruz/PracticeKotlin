package ljbdelacruz.com.practiceapplication.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import ljbdelacruz.com.practiceapplication.R

class UsersAdapter(val users:ArrayList<String>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersAdapter.ViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.ads_row, parent, false)
        return ViewHolder(view)
    }
    //returns the list count how many items will be generated
    override fun getItemCount() = users.size


    override fun onBindViewHolder(holder: UsersAdapter.ViewHolder, position: Int) {
        holder.title.text=users[position];
    }

    class ViewHolder(item: View):RecyclerView.ViewHolder(item){
        val title:TextView=itemView.findViewById<TextView>(R.id.adsrow_title)
    }
}