package com.delivery.apidelivery.controller;

import com.delivery.apidelivery.entities.Plate;
import com.delivery.apidelivery.services.DeliveryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class DeliveryController {
    private final DeliveryService deliveryService;
    private DeliveryController(DeliveryService deliveryService){
        this.deliveryService=deliveryService;
    }
    //GET: http//dominio/order/plates
    @GetMapping("/plates")
    public ResponseEntity<List<Plate>> getAllPlates(){
        return ResponseEntity.ok(deliveryService.getAllPlates());
    }
    //POST: http//dominio/order/plates
    @PostMapping("/plates")
    public ResponseEntity<Plate> addPlate(Plate plate){
        this.deliveryService.addPlate(plate);
        return new ResponseEntity<>(plate, HttpStatus.CREATED);
    }
}
