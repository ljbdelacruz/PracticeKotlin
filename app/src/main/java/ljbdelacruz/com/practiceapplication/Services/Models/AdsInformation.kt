package ljbdelacruz.com.practiceapplication.Services.Models
import com.google.gson.annotations.SerializedName

class AdsInformation {
    @SerializedName("id")
    var id: Int? = null
    @SerializedName("title")
    var title: String? = null
    @SerializedName("description")
    var description: String? = null
}