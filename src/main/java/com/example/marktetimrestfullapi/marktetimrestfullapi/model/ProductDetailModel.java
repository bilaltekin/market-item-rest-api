package com.example.marktetimrestfullapi.marktetimrestfullapi.model;



public class ProductDetailModel {


    private String orderDetail;
    private double summaryPrice;

    public ProductDetailModel() {
    }

    public ProductDetailModel(String orderDetail, double summaryPrice) {
        this.orderDetail = orderDetail;
        this.summaryPrice = summaryPrice;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public double getSummaryPrice() {
        return summaryPrice;
    }

    public void setSummaryPrice(double summaryPrice) {
        this.summaryPrice = summaryPrice;
    }
}
