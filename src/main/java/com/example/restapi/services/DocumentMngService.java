package com.example.restapi.services;



import java.util.List;
import java.util.Optional;


import com.example.restapi.bo.Document;

public interface DocumentMngService {

    public Document saveDoc(Document doc);

    public void updateDoc(Document doc);

    public void deleteDoc(Long idDoc);

    public Optional<Document> findDocById(Long idDoc);

    public List<Document> findDocByTitlre(String title);

    public List<Document> getAllDocs();

}
