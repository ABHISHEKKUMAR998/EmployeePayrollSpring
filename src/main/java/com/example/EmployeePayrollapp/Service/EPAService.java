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
		return employeePayrollList;
	}
	@Override
	public EPAData getEPADataById(int empId) {
		EPAData empData = null;
		return employeePayrollList.get(empId - 1);
	}
	@Override
	public EPAData createEPAData(EPADTO EPADTO) {
		EPAData empData = null;
		empData = new EPAData(employeePayrollList.size() + 1, EPADTO);
		employeePayrollList.add(empData);
		return empData;
	}
	@Override
	public EPAData updateEPAData(int empId, EPADTO employeePayrollDTO) {
		EPAData empData = this.getEPADataById(empId);
		empData.setName(employeePayrollDTO.name);
		empData.setSalary(employeePayrollDTO.salary);
		employeePayrollList.set(empId - 1, empData);
		return empData;
	}
	@Override
	public void deleteEPAData(int empId) {

		employeePayrollList.remove(empId - 1);
	}
}
