package Davivienda.DaviviendaCompras.service;

import Davivienda.DaviviendaCompras.entity.Cliente;
import Davivienda.DaviviendaCompras.repository.AccountRepository;
import Davivienda.DaviviendaCompras.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountStatusImplement implements AccountStatus{

    private final ClientRepository clientRepository;
    private final AccountRepository accountRepository;
    @Override
    public Cliente obtenerClient(Long cedula) {
        return clientRepository.findById(cedula).orElseThrow(() -> {throw new RuntimeException();});
    }

//    @Override
//    public long obtenerCuentaCliente(Long cedula) {
//        return clientRepository.findById(cedula).get().getN_cuenta();
//    }

//    @Override
//    public Optional<Cuenta> obtenerCuenta(Long n_cuenta) {
//        return accountRepository.findById(n_cuenta);
//    }
}
