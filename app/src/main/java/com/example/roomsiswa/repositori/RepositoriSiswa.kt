package com.example.roomsiswa.repositori

import com.example.roomsiswa.room.Siswa
import com.example.roomsiswa.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa
{
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

class OfllineRepositoriSiswa(
    private val siswaDao: SiswaDao
) : RepositoriSiswa {

    
}