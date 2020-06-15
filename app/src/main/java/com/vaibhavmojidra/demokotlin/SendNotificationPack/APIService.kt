package com.vaibhavmojidra.demokotlin.SendNotificationPack


import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
public interface APIService {
    @Headers(
            "Content-Type:application/json",
            "Authorization:key=xxxxxxxxxxxxxxxxxxx" // Your server key refer to video for finding your server key
    )
    @POST("fcm/send")
    open fun sendNotifcation(@Body body: NotificationSender?): Call<MyResponse?>?
}