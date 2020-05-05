package br.com.octopus.apioctopusdashboard.domains.question;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonInclude(value = Include.NON_NULL)
public class QuestionDTO {

	private Long id;
	private String text;
	private Long productId;
	private boolean isNotified;
	private boolean isRelevant;
	
}
