package com.example.dr_sounds.network;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NetworkService {

    // Create Profile
    @Headers({"Content-Type: application/json",
            "Ocp-Apim-Subscription-Key: 7f42c853e26744588483b36f10a4abc4"})
    @POST("identificationProfiles")
    Call<IdentificationProfile> createProfile(@Body IdProfileData data);


    @Headers({
            "Content-Type: multipart/form-data",
            "Ocp-Apim-Subscription-Key: 7f42c853e26744588483b36f10a4abc4"
    })
    @POST("identificationProfiles/{identificationProfileId}/enroll")
    Call<ResponseBody> enroll(@Path("identificationProfileId") String id,
                              @Query("shortAudio") boolean shortAudio,
                              @Body RequestBody body);





}
