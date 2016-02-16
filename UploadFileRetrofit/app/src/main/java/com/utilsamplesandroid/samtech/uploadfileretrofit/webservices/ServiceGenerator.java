package com.utilsamplesandroid.samtech.uploadfileretrofit.webservices;

import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by Miguel on 2/5/16.
 */
public class ServiceGenerator {
    public static final String API_BASE_URL = "https://intermexwebapiqa.lennken.com/";
//    public static final String API_BASE_URL = "http://sispror.comyr.com/";

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }
}
