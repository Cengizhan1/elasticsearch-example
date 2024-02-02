package com.cengizhanyavuz.elasticsearchexample.entity;

import com.cengizhanyavuz.elasticsearchexample.helper.Indices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Setting;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = Indices.PRODUCT_INDEX)
@Setting(settingPath = "static/es-settings.json")
public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
}
