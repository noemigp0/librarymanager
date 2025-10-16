package com.practice.librarymanager.model;

import com.practice.librarymanager.model.enums.PaymentMethod;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Sale {
    @NotNull
    @NotBlank
    private String id;
    @NotNull
    @NotBlank
    private Customer customer;
    @NotEmpty
    private List<Product> products;
    @NotNull
    private LocalDateTime saleDate;
    @NotNull
    @Size(min = 0, message = "Total amount must be higher that 0")
    private double totalAmount;
    @NotNull
    @NotBlank
    private PaymentMethod paymentMethod;

    public Sale(String id, Customer customer, List<Product> products, LocalDateTime saleDate, double totalAmount, PaymentMethod paymentMethod) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.saleDate = saleDate;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public double gettotalAmount() {
        return totalAmount;
    }

    public void settotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", products=" + products +
                ", saleDate=" + saleDate +
                ", totalAmount=" + totalAmount +
                ", paymentMethod=" + paymentMethod +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Double.compare(sale.totalAmount, totalAmount) == 0 && id.equals(sale.id) && customer.equals(sale.customer) && products.equals(sale.products) && saleDate.equals(sale.saleDate) && paymentMethod == sale.paymentMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, products, saleDate, totalAmount, paymentMethod);
    }
}

