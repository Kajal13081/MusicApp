package com.example.musicplayer_ui.model;

import android.net.Uri;

public class Songs {

    // Media store member variables
    long id;
    Uri uri;
    String name;
    int duration;
    long albumId;
    Uri albumArtUri;
    String path;

    // constructor
    public Songs(long id, Uri uri, String name, int duration, long albumId, Uri albumArtUri,String path) {
        this.id = id;
        this.uri = uri;
        this.name = name;
        this.duration = duration;
        this.albumId = albumId;
        this.path=path;
        this.albumArtUri = albumArtUri;
    }

    // getters to get the values


    public long getId() {
        return id;
    }

    public Uri getUri() {
        return uri;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAlbumId() {
        return albumId;
    }

    public Uri getAlbumArtUri() {
        return albumArtUri;
    }
    public String getPath(){
        return path;
    }
}
