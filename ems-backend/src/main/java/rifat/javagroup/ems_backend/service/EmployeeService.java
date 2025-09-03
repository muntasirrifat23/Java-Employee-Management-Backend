package rifat.javagroup.ems_backend.service;

import rifat.javagroup.ems_backend.dto.EmployeeDTO;
import rifat.javagroup.ems_backend.entity.Employee;

public interface EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployee(Long employeeId);

    EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO employeeDTO);

    void deleteEmployee(Long employeeId);
}
