package ljbdelacruz.com.practiceapplication.Services.Rest

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import ljbdelacruz.com.practiceapplication.Services.Models.RMCategory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


const val baseURL = "http://localhost:8080/"

interface IRentMeWebService {
    //#region Get Category
    @GET("/category/list/all")
    fun getCategoryByParentID(@Query("id") id : Int):Deferred<RMCategory>

    //#endregion
    //#region Post Category
//    @POST("/category/new")
//    fun newCategory(@Body("data") data: )

    //#endregion

    companion object {
        operator fun invoke():IRentMeWebService{
            val interceptor=Interceptor{chain ->
                //put additional parameters here
//                val url = chain.request().url().newBuilder().build()
                val request=chain.request().newBuilder().build();
                return@Interceptor chain.proceed(request);
            }
            val okHttpClient=OkHttpClient.Builder().addInterceptor(interceptor).build()
            return Retrofit.Builder().client(okHttpClient).baseUrl(baseURL).addCallAdapterFactory(
                CoroutineCallAdapterFactory()).addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(IRentMeWebService::class.java);
        }
    }



}