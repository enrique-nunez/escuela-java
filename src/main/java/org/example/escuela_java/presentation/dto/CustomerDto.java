package org.example.escuela_java.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CustomerDto {
    private String name;
    private String address;
    private Integer documentType;
    private String documentNumber;
    @Builder.Default
    private String email = "";
}
