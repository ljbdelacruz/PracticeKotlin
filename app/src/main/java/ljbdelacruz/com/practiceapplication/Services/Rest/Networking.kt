package ljbdelacruz.com.practiceapplication.Services.Rest

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class Networking {

    companion object {
        val baseURL:String="http://localhost:8080/"
        fun create(): APIWebService {

            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(
                    RxJava2CallAdapterFactory.create())
                .addConverterFactory(
                    GsonConverterFactory.create())
                .baseUrl(baseURL)
                .build()

            return retrofit.create(APIWebService::class.java)
        }
    }
}