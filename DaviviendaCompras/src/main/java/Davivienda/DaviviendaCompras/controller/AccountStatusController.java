package Davivienda.DaviviendaCompras.controller;

import Davivienda.DaviviendaCompras.service.AccountStatus;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AccountStatus")
@RequiredArgsConstructor
public class AccountStatusController {

    private final AccountStatus accountStatus;

    @GetMapping("/{id}")
    public ResponseEntity  obtenerClient(@PathVariable("id") Long cedula){
        return new ResponseEntity(accountStatus.obtenerClient(cedula), HttpStatus.MULTI_STATUS.OK);

    }

}
