package studentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import capstoneModel.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository <StudentModel, Integer> {

	List <StudentModel> findByName(String name);
	
	
	
	
	
}
