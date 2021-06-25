package com.example.EmployeePayrollapp.Service;

import java.util.List;

import com.example.EmployeePayrollapp.Model.EPAData;
import com.example.EmployeePayrollappDTO.EPADTO;

public interface IEPAService {
		List<EPAData> getEPAData();
		EPAData getEPADataById(int empId);

		EPAData createEPAData(EPADTO EPADTO);
		EPAData updateEPAData(EPADTO EPADTO);
		void deleteEPAData(int empId);
}
