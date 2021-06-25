package com.example.EmployeePayrollapp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EmployeePayrollapp.Model.EPAData;
import com.example.EmployeePayrollappDTO.EPADTO;



@Service
public class EPAService implements IEPAService{
	private List<EPAData> employeePayrollList = new ArrayList<>();
	
	@Override
	public List<EPAData> getEPAData() {
		List<EPAData> payrollDatas = new ArrayList<>();
		payrollDatas.add(new EPAData(1, new EPADTO("Abhishek", 800000)));
		return payrollDatas;
	}
	@Override
	public EPAData getEPADataById(int empId) {
		EPAData payrollDatas = null;
		payrollDatas = new EPAData(2, new EPADTO("Ankit", 400000));
		return payrollDatas;
	}
	@Override
	public EPAData createEPAData(EPADTO EPADTO) {
		EPAData payrollData = null;
		payrollData = new EPAData(3, EPADTO);
		return payrollData;
	}
	@Override
	public EPAData updateEPAData(EPADTO EPADTO) {
		EPAData payrollData = null;
		payrollData = new EPAData(3, EPADTO);
		return payrollData;
	}
	@Override
	public void deleteEPAData(int empId) {
	
		employeePayrollList.remove(empId - 1);
	}
}
