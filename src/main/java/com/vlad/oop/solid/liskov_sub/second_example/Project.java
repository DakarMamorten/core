package com.vlad.oop.solid.liskov_sub.second_example;

import java.util.List;

public class Project {
    private List<Document> allDocument;
    private List<WritableDocument> writableDocuments;

    public void openAll(){
        allDocument.forEach(Document::open);
    }

    public void saveAll(){
        writableDocuments.forEach(WritableDocument::save);
    }

}
