package Davivienda.DaviviendaCompras.service;

import Davivienda.DaviviendaCompras.entity.Cliente;
import Davivienda.DaviviendaCompras.entity.Cuenta;
import Davivienda.DaviviendaCompras.repository.AccountRepository;
import Davivienda.DaviviendaCompras.repository.ClientRepository;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountStatusImplement implements AccountStatusService {
    @Autowired
    private final ClientRepository clientRepository;
    @Autowired
    private final AccountRepository accountRepository;

    @Override
    public Cliente obtenerClient(Long cedula) {
        return clientRepository.findById(cedula).orElseThrow(() -> {throw new RuntimeException();});

    }

    @Override
    public Cuenta obtenerCuenta(Long n_cuenta) {
        return accountRepository.findById(n_cuenta).orElseThrow(() -> {throw new RuntimeException();});
    }


}
