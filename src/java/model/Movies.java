
package model;


public class Movies {
    
    private int movieID;
    private String Name;
    private int Year;
    private String moviecategory;

      public Movies() {
        this.movieID = 0;
        this.Name = "";
        this.Year = 0;
        this.moviecategory = "";
      }
    
    
    public Movies(int movieID, String Name, int Year, String category) {
        this.movieID = movieID;
        this.Name = Name;
        this.Year = Year;
        this.moviecategory = category;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getmoviecategory() {
        return moviecategory;
    }

    public void setmoviecategory(String category) {
        this.moviecategory = category;
    }

    @Override
    public String toString() {
        return "Movies{" + "movieID=" + movieID + ", Name=" + Name + ", Year=" + Year + ", moviecategory=" + moviecategory + '}';
    }
    
    
    
    
    
}
