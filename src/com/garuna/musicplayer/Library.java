package com.garuna.musicplayer;

import java.util.List;

public class Library {
    private static List<Album> albums;


    public static boolean findAlbum(Album album){
        return this.albums.contains(album);
    }

    public static boolean removeAlbum(Album album){
        if(findAlbum(album)){
            return this.albums.remove(album);
        }
        else{
            System.out.println("Error removing album. Album not found");
            return false;
        }

    }

    public static boolean addAlbum(Album album){
        if(findAlbum(album)) {
            System.out.println("Album already exists in the library");
            return false;
        }
        else{
            return this.albums.add(album);
        }
    }

    public static boolean searchSongInLibrary(Song song){
        for(Album album: albums){
            if(album.getSongs().contains(song))
                return true;
        }
        return false;
    }

    public Library(List<Album> albums) {
        this.albums = albums;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
