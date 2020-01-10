package com.example.aarjugoyal.master_class_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;

public class ScheduleActivity extends AppCompatActivity {

    private Button B2;
    String URL_download = "https://www.dropbox.com/s/8tawrg02puklxp3/Resume_Aarju_Goyal_December.pdf?dl=0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        B2 = (Button) findViewById(R.id.B_download);
        B2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new DownloadTask(ScheduleActivity.this, URL_download);
            }
        });

        //LoadData();
    }
    java.util.List<java.util.List<Object>> schedule;

    protected void LoadData()
    {
        HttpTransport transport = AndroidHttp.newCompatibleTransport();
        JacksonFactory factory = JacksonFactory.getDefaultInstance();
        final Sheets sheetsService = new Sheets.Builder(transport, factory, null)
                .setApplicationName("My Awesome App")
                .build();
        final String spreadsheetId = "1SKSm4eMZ9cgaGHxeInAudiGSOXX_1tEoUbNrXSknZKU";

        new Thread() {
            @Override
            public void run() {
                try {
                    String range = "Sheet1";
                    ValueRange result = sheetsService.spreadsheets().values()
                            .get(spreadsheetId, range)
                            .setKey("AIzaSyAZHMm-jCpLXIQRg4uWkabEBsIDDneJ2lY")
                            .execute();
                    int numRows = result.getValues() != null ? result.getValues().size() : 0;
                    Log.d("SUCCESS.", "rows retrived " + numRows);

                    System.out.println((result.getValues()));
                    schedule = result.getValues();
                    for (int i=0; i<numRows; i++)
                    {
                        System.out.println(schedule.get(i));

                    }
                }
                catch (IOException e) {
                    Log.e("Sheets failed", e.getLocalizedMessage());
                }
            }
        }.start();
    }


}
