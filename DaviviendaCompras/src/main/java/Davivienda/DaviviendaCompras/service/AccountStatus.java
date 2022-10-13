package Davivienda.DaviviendaCompras.service;
import Davivienda.DaviviendaCompras.entity.Cliente;

import java.util.Optional;

public interface AccountStatus {
    Optional<Cliente> obtenerClient(Long cedula);

    long obtenerCuentaCliente(Long cedula);

//  #  Optional<Cuenta> obtenerCuenta(Long n_cuenta);
}
