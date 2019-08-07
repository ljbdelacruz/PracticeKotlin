package ljbdelacruz.com.practiceapplication.Services.Rest

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface IRentMeWebService {
    //#region Get Category
    @GET("/category/list/all")
    fun getCategoryByParentID(@Query("id") id : Int)

    //#endregion
    //#region Post Category
//    @POST("/category/new")
//    fun newCategory(@Body("data") data: )

    //#endregion
}