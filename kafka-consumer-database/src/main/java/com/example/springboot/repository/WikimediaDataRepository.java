package com.example.springboot.repository;

import com.example.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
