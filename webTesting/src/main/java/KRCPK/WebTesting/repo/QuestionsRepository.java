package KRCPK.WebTesting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import KRCPK.WebTesting.model.Questions;


public interface QuestionsRepository extends JpaRepository<Questions, Long> {

}
