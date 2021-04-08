package com.gadgetbadget.restapi.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Researcher {
    @Id
    @GeneratedValue
    private int Id;
    private String FirstName;
    private String LastName;
    private String Address;
    private String PhoneNo;
    private String Email;
    private String LinkedIn;
    private String University;
}
