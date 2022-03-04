package com.ipsoft.composemaps.data

import com.ipsoft.composemaps.domain.model.ParkingSpot

fun ParkingSpotEntity.toParkingSpot(): ParkingSpot = ParkingSpot(lat, lng, id)

fun ParkingSpot.toParkingSpotEntity(): ParkingSpotEntity = ParkingSpotEntity(lat, lng, id)