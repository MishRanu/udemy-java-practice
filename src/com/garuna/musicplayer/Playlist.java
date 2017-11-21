package com.garuna.musicplayer;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Playlist {
    private String name;
    private List<Song> songs;
    private ListIterator<Song> songIterator;
    private boolean isForward = true;

    public Playlist(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public Song toggleForward(){
        if(!isForward){
            if(songIterator.hasNext())
                songIterator.next();
        }
        if(songIterator.hasNext())
            return songIterator.next();
        return null;
    }

    public Song toggleBackward(){
        if(isForward){
            if(songIterator.hasPrevious())
                songIterator.previous();
        }
        if(songIterator.hasPrevious())
            return songIterator.previous();
    }

    public Song replay(){
        if(isForward){
            if(songIterator.hasPrevious())
                return songIterator.previous();
        }
        else {
            if(songIterator.hasPrevious())
                return songIterator.previous();
        }
        return null;
    }


    public boolean findSong(Song song){
        return this.songs.contains(song);
    }
    public boolean addSong(Song song){
        if(findSong(song)){
            System.out.println("Song already in the playlist");
            return false;
        }
        else{
            if(Library.searchSongInLibrary(song)){
                this.songs.add(song);
                return true;
            }
        }
        System.out.println("Error adding song to the playlist");
        return false;

    }

    public boolean removeSong(Song song){
        if(findSong(song))
            return this.songs.remove(song);
        else{
            System.out.println("Error removing song from the playlist");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}