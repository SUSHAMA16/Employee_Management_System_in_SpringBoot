package SpringBoot.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBoot.Project.entity.Employee;


public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
