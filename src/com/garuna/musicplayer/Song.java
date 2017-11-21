package com.garuna.musicplayer;

import java.util.Objects;

public class Song {
    private String title;
    private int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public boolean addSongToPlaylist(Playlist playlist){
        return playlist.addSong(this);
    }

    public boolean removeSongFromPlaylist(Playlist playlist){
        return playlist.removeSong(this);
    }

    @Override
    public int hashCode() {
        return this.title.hashCode() + 57;
    }

    @Override
    public boolean equals(Object obj) {
        if(Objects.isNull(obj))
            return false;
        else if(((Song)obj).getTitle()==this.title)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
