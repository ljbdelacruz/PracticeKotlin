package ljbdelacruz.com.practiceapplication.Services.Rest
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*


object Model {
    data class Result(val query: Query)
}

interface APIWebService {
    @GET("api.php")
    fun getCategoryByParent(@Query("parent") action: Int):
            Observable<Model.Result>
}