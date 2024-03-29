package app.scrollfrom.roomdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Contact_Details")
public class Contacts {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name="Name")
    private String name;
    @ColumnInfo(name="Contact Number")
    private String number;


    Contacts(int id,String name,String number){
        this.id=id;
        this.name=name;
        this.number=number;
    }
    @Ignore
    Contacts(String name,String number){
        this.name=name;
        this.number=number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
