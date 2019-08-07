package ljbdelacruz.com.practiceapplication.Services.Models

import com.google.gson.annotations.SerializedName

class RMCategory {
    @SerializedName("id")
    var id: Int? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("parent")
    var parent: String? = null
}