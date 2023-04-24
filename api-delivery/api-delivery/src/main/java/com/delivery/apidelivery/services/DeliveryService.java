package com.delivery.apidelivery.services;

import com.delivery.apidelivery.entities.Plate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DeliveryService {
    private List<Plate> plateMenu;

    public DeliveryService(){
        this.plateMenu = new ArrayList<>();
    }
    //TODO: US-01 Como usuario, quiero poder ver un menú de comida para seleccionar lo que
    //quiero pedir.
    public List<Plate> getAllPlates(){
        return this.plateMenu;
    }

    //TODO: US-02 Como usuario, quiero poder hacer un pedido y agregar varios platos.

    public void addPlate(Plate plate){
        this.plateMenu.add(plate);
    }
}
