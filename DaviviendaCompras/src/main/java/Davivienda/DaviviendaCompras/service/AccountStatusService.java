package Davivienda.DaviviendaCompras.service;
import Davivienda.DaviviendaCompras.entity.Cliente;
import Davivienda.DaviviendaCompras.entity.Cuenta;

public interface AccountStatusService {
    Cliente obtenerClient(Long cedula);

    Cuenta obtenerCuenta(Long n_cuenta);
}
