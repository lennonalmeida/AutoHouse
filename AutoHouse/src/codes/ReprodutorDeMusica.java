/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

/**
 *
 * @author lennon
 */
public class ReprodutorDeMusica {
    private boolean play = true, pause, stop = false;
    private String artista, album, musica;
    private String musicas[][] = {
        {"Interstellar Overdrive", "Comfortably Numb"},
        {"While my guitar gently weeps", "A day in the life"},
        {"Live forever", "Wonderwall"},             
    };
    public void setPlay(boolean atual){
        this.play = atual;
    }
    public boolean getPlay(){
        return this.play;
    }
    public void setPause(boolean atual){
        this.pause = atual;
    }
    public boolean getPause(){
        return this.pause;
    }
    
    public String getArtista(){
        return this.artista;
    }
    public String getMusica(){
        return this.musica;
    }
    public String getAlbum(){
        return this.album;
    }
       
    public void Music (int mus) {       //atualizacao utilizando a string musicas
        
        switch (mus) {
            case 2:
                this.musica = this.musicas [(mus-2)][(mus-1)];
                this.artista = "Pink Floyd";
                this.album = "The Wall";
                break;
            case 3:
                this.musica = this.musicas [(mus-2)][(mus-3)];
                this.artista = "The Beatles";
                this.album = "The Beatles (The White Album)";
                break;
            case 4:
                this.musica = this.musicas [(mus-3)][(mus-3)]; 
                this.artista = "The Beatles";
                this.album = "Sgt peppers lonely hearts club band";
                break;
            case 5:
                this.musica = this.musicas [(mus-3)][(mus-5)];
                this.artista = "Oasis";
                this.album = "Definitely maybe";
                break;
            case 6:
                this.musica = this.musicas [(mus-4)][(mus-5)];
                this.artista = "Oasis";
                this.album = "Whats the story ? (Morning glory)";
                break;
            default: //Por default, a musica 1 sempre eh reproduzida se qualquer numero fora de 2-6
                this.musica = this.musicas [0][0];
                this.artista = "Pink Floyd";
                this.album = "The piper at the gates of dawn";
                mus = 1;
                break;
        }
    }   
}