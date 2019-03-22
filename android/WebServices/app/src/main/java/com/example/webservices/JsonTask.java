package com.example.webservices;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class JsonTask extends AsyncTask<String, String, List<Model>> {

    @Override
    protected List<Model> doInBackground(String... urls) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        URL url;
        List<Model> modelList = null;
        try {
            url = new URL(urls[0]);
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream stream = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(stream));
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }

            // Final JSON String
            String finaljson = buffer.toString();

            // Parsing of JSON Starts Here
            JSONObject parantObject = new JSONObject(finaljson);
            JSONArray parantArray = parantObject.getJSONArray("posts");
            modelList = new ArrayList<>();

            for (int i = 0; i < parantArray.length(); i++) {
                Model model = new Model();
                JSONObject finalobject = parantArray.getJSONObject(i);
                model.setName(finalobject.getString("name"));
                model.setMessage(finalobject.getString("message"));
                model.setProfileImage(finalobject.getString("profileImage"));
                modelList.add(model);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Log.v("vinay", "finally run");
            if (connection != null)
                connection.disconnect();
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return modelList;
        }
    }


}