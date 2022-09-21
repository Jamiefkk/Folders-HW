package com.codeclan.example.folders;

import com.codeclan.example.folders.models.Person;
import com.codeclan.example.folders.repositories.FileRepository;
import com.codeclan.example.folders.repositories.FolderRepository;
import com.codeclan.example.folders.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoldersApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
		fileRepository.deleteAll();
		folderRepository.deleteAll();
		personRepository.deleteAll();
	}
	@Test
	public void createPerson() {
		Person person = new Person("Bob");
		personRepository.save(person);
	}
}
