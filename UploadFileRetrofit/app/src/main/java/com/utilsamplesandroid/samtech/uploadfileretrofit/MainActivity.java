package com.utilsamplesandroid.samtech.uploadfileretrofit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.utilsamplesandroid.samtech.uploadfileretrofit.webservices.ServiceGenerator;
import com.utilsamplesandroid.samtech.uploadfileretrofit.webservices.interfaces.IntermexUploadService;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadFile();
            }
        });
    }

    public void uploadFile(){
        IntermexUploadService client = ServiceGenerator.createService(IntermexUploadService.class);

        String descriptionString = "esta es la descripcion";

        RequestBody description =
                RequestBody.create(MediaType.parse("multipart/form-data"), descriptionString);

//        File file = new File("path/to/your/file");
        File file = new File("/sdcard/pictures/camera.zip");
        RequestBody requestBody =
                RequestBody.create(MediaType.parse("multipart/form-data"), file);

        Call<String> call = client.upload(requestBody, description);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Response<String> response) {
                Log.v("Upload", "success");
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("Upload", t.getMessage());
            }
        });
    }
}
