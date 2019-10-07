package com.miracle.Motion.FourCornersOfHealth.Repos;

import java.util.List;
import java.util.Map;

import com.miracle.Motion.FourCornersOfHealth.Entity.AverageBloodPressureEntity;
import com.miracle.Motion.FourCornersOfHealth.Entity.AverageCholestrolEntity;
import com.miracle.Motion.FourCornersOfHealth.Entity.AverageEntity;
import com.miracle.Motion.FourCornersOfHealth.Entity.AverageGlucoseEntity;

public interface CustomFCHRepository {

	long findRecentValueByPid(long patientId, String query);
	
	List<AverageEntity> findAverageValues(long patientId, String query, int year) throws Exception;
	List<AverageCholestrolEntity> findCholestrolAverageValues(long patientId, String query, int year) throws Exception;
	List<AverageGlucoseEntity> findGlucoseAverageValues(long patientId, String query, int year) throws Exception;
	List<AverageBloodPressureEntity> findAverageBPValues(long patientId, String query, int year) throws Exception;
}
