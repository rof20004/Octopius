package br.com.octopus.apioctopusdashboard.domains.question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
	
	List<Question> findByIsNotified(boolean isNotified);

}
