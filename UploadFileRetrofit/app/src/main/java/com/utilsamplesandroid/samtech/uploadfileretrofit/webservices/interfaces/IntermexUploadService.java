package com.utilsamplesandroid.samtech.uploadfileretrofit.webservices.interfaces;


import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Miguel on 2/5/16.
 */
public interface IntermexUploadService {
    @Multipart

//    @POST("processuploads.php")
    @POST("api/recepcion/fotos")
    Call<String> upload(
            @Part("myfile\"; filename=\"image.png\" ") RequestBody file,
            @Part("description") RequestBody description);
}


