package com.example.basic_calc;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    public void addUser(User user);
    @Query("select * from user")
    public List<User> getUsers();
}
