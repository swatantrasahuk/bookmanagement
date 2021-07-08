package com.booktest.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Books
{
    @Id
    @Column(name = "ISBN")
    private int ISBN;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "tags")
    private int tags;

    @Override
    public String toString() {
        return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", tags="
                + tags + "]";
    }

    public Books(int iSBN, String title, String author,int tags) {
        super();
        ISBN = iSBN;
        this.title = title;
        this.author = author;
        this.tags = tags;
    }


    public int getISBN() { return ISBN; }

    public void setISBN(int ISBN) { this.ISBN = ISBN; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public int getTags() { return tags; }

    public void setTags(int tags) { this.tags = tags; }


    public Books() {
        super();
    }


}