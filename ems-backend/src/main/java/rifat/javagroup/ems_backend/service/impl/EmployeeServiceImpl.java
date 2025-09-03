package rifat.javagroup.ems_backend.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rifat.javagroup.ems_backend.dto.EmployeeDTO;
import rifat.javagroup.ems_backend.entity.Employee;
import rifat.javagroup.ems_backend.mapper.EmployeeMapper;
import rifat.javagroup.ems_backend.repository.EmployeeRepository;
import rifat.javagroup.ems_backend.service.EmployeeService;

@Service
@AllArgsConstructor

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeReposistory;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeReposistory.save(employee);
        return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
    }
}
