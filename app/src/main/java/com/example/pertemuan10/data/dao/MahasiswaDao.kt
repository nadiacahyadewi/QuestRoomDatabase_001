package com.example.pertemuan10.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.pertemuan10.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insetMahasiswa(mahasiswa: Mahasiswa)

}

