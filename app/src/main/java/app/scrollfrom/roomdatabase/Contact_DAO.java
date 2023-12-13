package app.scrollfrom.roomdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface Contact_DAO {

    @Query("select * from Contact_Details")
    List<Contacts> getAllContact();
    @Insert
    void addTx(Contacts contacts);
    @Update
    void updateTx(Contacts contacts);
    @Delete
    void deleteTx(Contacts contacts);

}
