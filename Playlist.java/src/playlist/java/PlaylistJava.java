/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playlist.java;


import java.util.ArrayList;

/**
 *
 * @author pedri
 */
public class PlaylistJava {

    

    /**
     * creating a little exercise to practice with arrays
     * @param args
     */
    public static void main(String[] args) {
        ArrayList <String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Moonlight Sonata");
        desertIslandPlaylist.add("Caprice  24");
        desertIslandPlaylist.add(" Symphony of the new world");
        desertIslandPlaylist.add("Scheherazade");
        desertIslandPlaylist.add("Requiem in D minor");
        desertIslandPlaylist.add("The four seasons");
        desertIslandPlaylist.add("Nocturne 2");
        desertIslandPlaylist.add("Lacrimosa");
        desertIslandPlaylist.add("Danse macabre");
        desertIslandPlaylist.add("Dies irae ");
        desertIslandPlaylist.add("Toccaata and fugue in D minor");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        desertIslandPlaylist.remove(6);
        desertIslandPlaylist.remove(8);
         System.out.println(desertIslandPlaylist.size());
         desertIslandPlaylist.remove(5);
         desertIslandPlaylist.remove(7);
         desertIslandPlaylist.remove(1);
         System.out.println(desertIslandPlaylist.size());
         desertIslandPlaylist.remove(5);
         System.out.println(desertIslandPlaylist.size());
         System.out.println(desertIslandPlaylist);
         int indexA = desertIslandPlaylist.indexOf("Moonlight Sonata");
         int indexB = desertIslandPlaylist.indexOf("Requiem in D minor");
         String tempA = "Moonlight Sonata";
         desertIslandPlaylist.set(indexA, "C.R.E.A.M");
         System.out.println(desertIslandPlaylist);
         desertIslandPlaylist.set(indexB, tempA);
         System.out.println(desertIslandPlaylist);
         
         
                 
               
        
        
        
    }
    
}
