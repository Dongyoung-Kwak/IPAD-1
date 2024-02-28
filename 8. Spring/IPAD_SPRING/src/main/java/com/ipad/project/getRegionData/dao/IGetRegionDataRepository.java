package com.ipad.project.getRegionData.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ipad.project.getRegionData.model.CalSaleVO;
import com.ipad.project.getRegionData.model.GetRegionDataVO;
import com.ipad.project.getRegionData.model.HospitalDetailVO;
import com.ipad.project.getRegionData.model.PatientPointVO;
import com.ipad.project.getRegionData.model.SalePointVO;

@Repository
public interface IGetRegionDataRepository {
	List<HospitalDetailVO> getHospitalData();

	GetRegionDataVO regionInfo(String adm_nm);

	int calEmploymentAvgFee(String adm_cd);

	int calRentFee(String adm_cd);

	ArrayList<Integer> calEmploymentFee(String adm_cd, String seniorEmployeeCount, String juniorEmployeeCount);

	GetRegionDataVO calNetProfit(String adm_cd);

	String getRegionCode(String regionName);

	int calculateSale(String adm_cd);

	SalePointVO getSaleWeight();

	GetRegionDataVO getPatient(String adm_cd);

	int areaSizeCal(int patient);

	int employeeCal(int patient);

	List<Map<String, Object>> patientCal(String adm_cd);

	PatientPointVO getPatientWeight();

	CalSaleVO getVariableSale(String adm_cd);
}
