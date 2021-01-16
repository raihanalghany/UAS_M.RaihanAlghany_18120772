package id.raihan.uas_pcs.api

import id.raihan.uas_pcs.data.model.DetailUserResponse
import id.raihan.uas_pcs.data.model.User
import id.raihan.uas_pcs.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token f8dafe5221e11046dbbc29fdd0addba0b64cdd3f")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token f8dafe5221e11046dbbc29fdd0addba0b64cdd3f")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token f8dafe5221e11046dbbc29fdd0addba0b64cdd3f")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token f8dafe5221e11046dbbc29fdd0addba0b64cdd3f")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}