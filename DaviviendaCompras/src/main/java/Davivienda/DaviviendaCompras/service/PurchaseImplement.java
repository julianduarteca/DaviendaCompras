package Davivienda.DaviviendaCompras.service;

import Davivienda.DaviviendaCompras.entity.Productos;
import Davivienda.DaviviendaCompras.repository.PurchaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class PurchaseImplement  implements PurchaseService {

    @Autowired
    PurchaseRepository purchaseRepository;

    @Override
    public ArrayList<Productos> obtenerProductos() {
        return  (ArrayList<Productos>) purchaseRepository.findAll();
    }
}
