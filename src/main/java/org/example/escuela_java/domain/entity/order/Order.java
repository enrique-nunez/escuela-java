package org.example.escuela_java.domain.entity.order;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.escuela_java.domain.entity.customer.Customer;

import java.time.LocalDate;

@Table(name="orders")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id¿")
    private Integer orderId;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "total_order_amount")
    private Integer totalOrderAmount;

    @Column(name = "total_order_price")
    private Double totalOrderPrice;

    @Column(name = "order_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate orderDate;

    @Column(name = "service_order_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate serviceOrderDate;

    @Column(name = "\"status\"")
    private Integer orderStatus;
}
