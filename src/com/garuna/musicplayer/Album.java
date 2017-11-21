package com.garuna.musicplayer;

import java.util.List;
import java.util.Objects;

public class Album {

    private String name;
    private List<Song> songs;

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public boolean addSong(Song song){
        if(findSong(song)){
            System.out.println("song already in the album");
            return false;
        }
        return this.songs.add(song);
    }

    public boolean findSong(Song song){
        return this.songs.contains(song);
    }

    public boolean removeSong(Song song){
        if(findSong(song)){
            return this.songs.remove(song);
        }
        else{
            System.out.println("Error removing song from the playlist. The song doesn't exist");
            return false;
        }

    }

    public boolean addSongToPlaylist(int index, Playlist playlist){
        return playlist.addSong(getSongs().get(index));
    }

    public boolean removeSongFromPlaylist(int index, Playlist playlist){
        return playlist.removeSong(getSongs().get(index));
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }


    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }

    @Override
    public boolean equals(Object obj) {
        if(Objects.isNull(obj))
            return false;
        else if(((Album)obj).getName()==this.name)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}
