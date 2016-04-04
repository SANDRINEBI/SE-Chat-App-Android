package com.gigster.semessaging;

import com.gigster.semessaging.gigs.GigList;
import com.gigster.semessaging.user.User;

import java.util.List;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GigsterService {

    @FormUrlEncoded
    @POST("api/session")
    Call<User> attemptLogin(@Field("email") String email, @Field("password") String password);

    @Headers({"Content-Type: application/json"})
    @GET("api/users/me")
    Call<User> getMe(@Header("Cookie") String cookie);

    @Headers({"Content-Type: application/json"})
    @GET("api/gigs/se")
    Call<GigList> getSeGigs(@Header("Cookie") String cookie);

    @Headers({"Content-Type: application/json"})
    @GET("api/users/batch")
    Call<User> getBatch(@Header("Cookie") String cookie, @Body List<String> userIDs);

    @FormUrlEncoded
    @POST("api/v1/users/{id}/devices/gcm")
    Call<Object> registerDevice(@Header("Cookie") String cookie, @Path("id") String userID, @Field("token") String token);

    @FormUrlEncoded
    @POST("api/v1/gigs/{gig_id}/messages")
    Call<Object> sendMessage(@Header("Cookie") String cookie, @Path("gig_id") String gigID, @Field("text") String message,
                          @Field("type") String type, @Field("toClient") boolean toClient );


}
