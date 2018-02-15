package com.appprojects.diseasediagnosis.repo.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.appprojects.diseasediagnosis.models.Doctor;
import com.appprojects.diseasediagnosis.models.History;
import com.appprojects.diseasediagnosis.models.Patient;

/**
 * Created by Lekan Adigun on 1/10/2018.
 */

@Database(entities = {Patient.class, Doctor.class, History.class}, version = 3)
public abstract class AppDatabase extends RoomDatabase {

    public abstract PatientDao getPatientDao();
    public abstract DoctorDao getDoctorDao();
    public abstract HistoryDao getHistoryDao();

}
