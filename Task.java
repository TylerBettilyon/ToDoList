public class Task {

    //Instance Variables
    String title;
    String description;
    CustomDate dateDue;
    boolean urgent = false;

    //Constructors
    public Task () {}

    public Task (String title, String description, CustomDate dateDue, boolean urgent) {
        this.title = title;
        this.description = description;
        this.dateDue = dateDue;
        this.urgent = urgent;
    }

    //Methods


    //Getters and Setters
    public String getTitle () {return title;}

    public void setTitle (String title) {this.title = title;}

    public String getDescription () {return description;}

    public void setDescription (String description) {this.description = description;}

    public CustomDate getDateDue () {return dateDue;}

    public void setDateDue (CustomDate dateDue) {this.dateDue = dateDue;}

    public boolean isUrgent () {return urgent;}

    public void setUrgent (boolean urgent) {this.urgent = urgent;}

}
