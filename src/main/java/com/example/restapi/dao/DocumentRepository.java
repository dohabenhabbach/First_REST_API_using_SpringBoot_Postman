package com.example.restapi.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.bo.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    public List<Document> getDocumentByTitle(String title);

}
