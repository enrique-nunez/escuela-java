package org.example.escuela_java.domain.entity.customer;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="customers")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Customer implements Serializable {

    private static final long serialVersionUID = -6142206671500721879L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CUSTOMER_ID")
    private Integer customerId;

    @NotBlank
    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "CUSTOMER_ADDRESS")
    private String customerAddress;

    @Column(name = "DOCUMENT_TYPE")
    private Integer documentType;

    @NotBlank
    @Column(name = "DOCUMENT_NUMBER")
    private String documentNumber;

    @Email
    @Column(name = "CUSTOMER_EMAIL")
    private String customerEmail;


}
