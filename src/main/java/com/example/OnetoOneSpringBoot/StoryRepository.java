package com.example.OnetoOneSpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface StoryRepository extends JpaRepository<Story,String>{

}
