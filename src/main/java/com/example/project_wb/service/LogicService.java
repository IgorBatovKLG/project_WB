package com.example.project_wb.service;

import com.example.project_wb.DTO.DbDtoAddId;
import com.example.project_wb.Telegram;
import com.example.project_wb.model.product.Product;
import com.example.project_wb.model.product.ProductModel;

import java.util.List;

public class LogicService {

    public boolean productBestPrice(ProductModel model){
        DbDtoAddId dbDtoAddId = new DbDtoAddId();
        HttpClient httpClient = new HttpClient();
        List<Product> products = model.getData().getProducts();
        for (Product product : products) {
            if(product.getSalePriceU()<10500){
                boolean id = dbDtoAddId.createId(product.getId());
                if (id){
                    String s = httpClient.urlImg(product.getId());

                    Telegram.sentSms(product.getId() + " " + product.getName() + " ЦЕНА!!!! - " + product.getSalePriceU()/100
                           + "!!!!!!!!!!!!! " + product.getRating() + " " + product.getFeedbacks() + " " + s);
                    if(product.getSalePriceU()<70){
                        System.out.println(product);
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }


}
