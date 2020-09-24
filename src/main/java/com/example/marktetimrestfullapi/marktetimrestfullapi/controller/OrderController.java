package com.example.marktetimrestfullapi.marktetimrestfullapi.controller;

import com.example.marktetimrestfullapi.marktetimrestfullapi.model.ProductDetailModel;
import com.example.marktetimrestfullapi.marktetimrestfullapi.model.ProductModel;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    private static List<ProductModel> products = new ArrayList<>();

    static {

        products.add(new ProductModel("13",
                "09",
                "Market 1 Market 1 Market 1 Market 1 ",
                " Sabun  Sabun Sabun  Sabun Sabun  Sabun Sabun  Sabun Sabun  Sabun Sabun  Sabun",
                14.5,
                " Yolda Yolda Yolda Yolda Yolda",
                new ProductDetailModel("  250 ml sıvı sabun 250 ml sıvı sabun 250 ml sıvı sabun 250 ml sıvı sabun", 16.8)
        ));

        products.add(new ProductModel("13",
                "01",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "02",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "03",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "04",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "05",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "06",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));

        products.add(new ProductModel("13",
                "07",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "08",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "09",
                " Market 1 Market 1 Market 1 Market 1",
                " Sabun  Sabun Sabun  Sabun Sabun  Sabun",
                14.5,
                " Yolda Yolda Yolda Yolda Yolda",
                new ProductDetailModel("  250 ml sıvı sabun 250 ml sıvı sabun 250 ml sıvı sabun 250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "010",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "011",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "012",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));

        products.add(new ProductModel("13",
                "09",
                "Market 1 Market 1 Market 1 Market 1 ",
                " Sabun  Sabun Sabun  Sabun Sabun  Sabun Sabun  Sabun Sabun  Sabun Sabun  Sabun",
                14.5,
                " Yolda Yolda Yolda Yolda Yolda",
                new ProductDetailModel("  250 ml sıvı sabun 250 ml sıvı sabun 250 ml sıvı sabun 250 ml sıvı sabun", 16.8)
        ));

        products.add(new ProductModel("13",
                "01",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "02",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "03",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "04",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "05",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "06",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));

        products.add(new ProductModel("13",
                "07",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "08",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "09",
                " Market 1 Market 1 Market 1 Market 1",
                " Sabun  Sabun Sabun  Sabun Sabun  Sabun",
                14.5,
                " Yolda Yolda Yolda Yolda Yolda",
                new ProductDetailModel("  250 ml sıvı sabun 250 ml sıvı sabun 250 ml sıvı sabun 250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "010",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "011",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
        products.add(new ProductModel("13",
                "012",
                "Market 1",
                "Sabun",
                14.5,
                "Yolda",
                new ProductDetailModel("250 ml sıvı sabun", 16.8)
        ));
    }


    @GetMapping(path = "/orders", produces = MediaType.APPLICATION_XML_VALUE)
    List<ProductModel> getProducts() {
        return products;
    }




}


