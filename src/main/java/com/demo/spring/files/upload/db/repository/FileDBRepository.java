package com.demo.spring.files.upload.db.repository;

import com.demo.spring.files.upload.db.model.FileDB;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}