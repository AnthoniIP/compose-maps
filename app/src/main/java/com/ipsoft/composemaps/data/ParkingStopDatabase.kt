package com.ipsoft.composemaps.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ParkingSpotEntity::class],
    version = 1
)
abstract class ParkingStopDatabase: RoomDatabase() {

    abstract val dao: ParkingSpotDao


}