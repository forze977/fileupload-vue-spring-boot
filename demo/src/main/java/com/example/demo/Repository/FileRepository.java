package com.example.demo.Repository;

import com.example.demo.Model.FileModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FileRepository extends JpaRepository<FileModel, Long>{

}