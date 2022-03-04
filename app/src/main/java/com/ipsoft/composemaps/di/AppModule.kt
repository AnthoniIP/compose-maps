package com.ipsoft.composemaps.di

import android.app.Application
import androidx.room.Room
import com.ipsoft.composemaps.data.ParkingSpotRepositoryImpl
import com.ipsoft.composemaps.data.ParkingStopDatabase
import com.ipsoft.composemaps.domain.repository.ParkingStopRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app: Application): ParkingStopDatabase {
        return Room.databaseBuilder(
            app,
            ParkingStopDatabase::class.java,
            "parking_spots.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideParkingSpotRepository(db: ParkingStopDatabase): ParkingStopRepository {
        return ParkingSpotRepositoryImpl(db.dao)
    }
}