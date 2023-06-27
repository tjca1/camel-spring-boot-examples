/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.camel.Handler;

public class AvailableCars {
    private List<String> cars =  Arrays.asList(
            "Toyota Corolla",
            "Honda Civic",
            "Mazda 3",
            "Hyundai Elantra",
            "Subaru Impreza",
            "Volkswagen Jetta",
            "Volkswagen Golf",
            "Ford Fiesta",
            "Ford Focus",
            "Chevrolet Cruze",
            "Kia Ceed",
            "Skoda Octavia",
            "Citroen C4",
            "Peugeot 308"
        ); 
    
    @Handler
    public String getAvailableCar(){
        int index = (new Random()).nextInt(cars.size());
        String jsonResult= "{"+
                " \"bookingId\": "+(new Random()).nextInt(1000)+"," +
                " \"car\": \""+cars.get(index)+"\"," +
                " \"startDate\": \"12-11-2018\"," +
                " \"endDate\": \"15-11-2018\"," +
                " \"price\": "+((new Random()).nextInt(25) + 140) +
               " }";
        return jsonResult;
    }  
}
