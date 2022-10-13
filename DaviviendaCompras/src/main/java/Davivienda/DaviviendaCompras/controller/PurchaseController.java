package Davivienda.DaviviendaCompras.controller;

import Davivienda.DaviviendaCompras.service.AccountStatusService;
import Davivienda.DaviviendaCompras.service.PurchaseService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Purchase")
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;

    @GetMapping("/products")
    public ResponseEntity  obtenerProductos(){
        return new ResponseEntity(purchaseService.obtenerProductos(), HttpStatus.MULTI_STATUS.OK);

    }



}
