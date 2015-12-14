package mobile.bt.app;

/**
 * Created by brandon on 12/13/2015.
 */
public class Movie {
    private String name;
    private String direc;

    public Movie(String name, String director){
        this.name = name;
        this.direc = director;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDirect() {
        return direc;
    }
    public void setDirec(String direc){
        this.direc = direc;
    }
}
