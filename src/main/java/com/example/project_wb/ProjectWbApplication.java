package com.example.project_wb;

import com.example.project_wb.DTO.DbDtoAddId;
import com.example.project_wb.model.product.ProductModel;
import com.example.project_wb.service.HttpClient;
import com.example.project_wb.service.LogicService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjectWbApplication {

    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        SpringApplication.run(ProjectWbApplication.class, args);
        HttpClient httpClient = new HttpClient();
        LogicService service = new LogicService();
        boolean getTrue = true;
        List<String> urls = new ArrayList<>();
        urls.add("https://catalog.wb.ru/catalog/electronic14/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=9835&curr=rub&dest=123585487&page=1&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic14/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=9468&curr=rub&dest=123585487&page=1&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic19/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=58513&curr=rub&dest=123585487&page=1&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic14/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=59132&curr=rub&dest=123585487&page=1&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic15/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=9497&curr=rub&dest=123585487&page=1&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic14/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=9846&curr=rub&dest=123585487&page=1&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic17/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=9845&curr=rub&dest=123585487&page=1&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic19/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=130772&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic19/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&subject=4030&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic19/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=9509&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic19/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&subject=524&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic19/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=10491&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic15/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&subject=2290&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic15/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=9963&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic15/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=60805&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic15/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&subject=2892&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic15/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=60807&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic16/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=9493&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic15/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=9494&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic17/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=128306&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic17/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=128307&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic17/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&subject=795&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic17/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=63017&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic17/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=15584&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic17/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=60809&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/electronic17/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=60808&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");


        urls.add("https://catalog.wb.ru/catalog/adult1/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=8174&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult1/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=62073&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult1/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=10013&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult1/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=128338&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult1/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=62071&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult1/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=62064&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult2/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=62198&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult2/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=62200&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult2/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&subject=5158&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult2/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=62206&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult2/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=62204&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult2/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=62195&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult2/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=62385&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");
        urls.add("https://catalog.wb.ru/catalog/adult2/catalog?TestGroup=ty_rec_add_cat_compl&TestID=308&appType=1&cat=62201&curr=rub&dest=123585487&regions=80,38,83,4,64,33,68,70,30,40,86,69,1,31,66,110,48,22,114&sort=priceup&spp=32&uclusters=1");


        while (true) {
            for (String url : urls) {
                getTrue = true;
                for (int i = 1; i < 10; i++) {
                    if (getTrue) {
                        String response = httpClient.getResponse(url +
                                "&page=" + i);
                        try {
                            ProductModel productModel = httpClient.getProductModel(response);


                            getTrue = service.productBestPrice(productModel);
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }
            count++;
            System.out.println(count);
            Thread.sleep(1000*60*10);
        }

    }

}
