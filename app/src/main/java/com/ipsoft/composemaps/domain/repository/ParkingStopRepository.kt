package com.ipsoft.composemaps.domain.repository

import com.ipsoft.composemaps.domain.model.ParkingSpot
import kotlinx.coroutines.flow.Flow


interface ParkingStopRepository {

    suspend fun insertParkingSpot(spot: ParkingSpot)

    suspend fun deleteParkingSpot(spot: ParkingSpot)

    fun getParkingSpots(): Flow<List<ParkingSpot>>
}