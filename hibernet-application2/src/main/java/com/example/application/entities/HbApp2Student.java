package com.example.application.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "hb_app2_student")

public class HbApp2Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    @Column(name = "student_name",length = 100,unique = false)
    private String name;
    @Column(name = "father_name",length = 100,unique = false)
    private String fatherName;
    @Column(name = "collage_name",length = 100,unique = false)
    private  String collageName;
    private boolean isActive = true;
   @Lob
   @Basic(fetch = FetchType.LAZY)
   @Column(name = "student_about")
    private String about;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
