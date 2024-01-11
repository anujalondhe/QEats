
/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* 
@Getter
@Setter
public class Restaurant {
    @JsonIgnore
    private  int id;
 private String restaurantId;
 private String name;
 private String city;
 private String imageUrl;
 private Double latitude;
 private Double longitude;
 private String opensAt;
 private String closesAt;
 private ArrayList<String> attributes;
 */
import lombok.NoArgsConstructor;


@Getter
@Setter
public class Restaurant {
    @JsonIgnore
    private  int id;
 private String restaurantId;
 private String name;
 private String city;
 private String imageUrl;
 private Double latitude;
 private Double longitude;
 private String opensAt;
 private String closesAt;
 private ArrayList<String> attributes;
}

