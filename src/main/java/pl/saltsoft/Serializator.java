package pl.saltsoft;

import com.google.gson.Gson;

public class Serializator {
    public void swhisky(Whisky bestwhisky) {
        Gson gson = new Gson();
        String json = gson.toJson(bestwhisky);
        System.out.println(json);
    }

    public Whisky odczarojMojeWhyski(String zaczarowanaWhisky){
        Gson gson = new Gson();
        Whisky odczarowanaWhisky = gson.fromJson(zaczarowanaWhisky,Whisky.class);
        return odczarowanaWhisky;
    }
}

