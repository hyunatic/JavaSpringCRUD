package com.example.MongoDBApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MongoDbApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApiApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate){
//		return args -> {
//			String email = "john@hotmail.com";
//			Address address = new Address(
//					"Singapore",
//					"Singapore",
//					"NE9"
//			);
//			Student student = new Student(
//					"John",
//					"Tan",
//					email,
//					Gender.MALE,
//					address,
//					List.of("Computer Science", "Maths"),
//					BigDecimal.TEN,
//					LocalDateTime.now()
//			);
//			//usingMongoTemplateAndQuery(repository,mongoTemplate,email,student);
//			repository.findStudentByEmail(email).ifPresentOrElse(record -> {
//				System.out.println(record + " already exists");
//			}, ()-> {
//				System.out.println("Inserting student " + student);
//				repository.insert(student);
//			});
//		};
//	}

//	private void usingMongoTemplateAndQuery(StudentRepository repository, MongoTemplate mongoTemplate, String email, Student student) {
//		//Using Query Template
//		Query query = new Query();
//		query.addCriteria(Criteria.where("email").is(email));
//		List<Student> students = mongoTemplate.find(query, Student.class);
//
//		if (students.size() > 1) {
//			throw new IllegalStateException("Found many student with email" + email);
//		}
//		if (students.isEmpty()) {
//			System.out.println("Inserting student " + student);
//			repository.insert(student);
//		} else {
//			System.out.println(student + " already exists");
//		}
//	}
}
