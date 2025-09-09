package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;

import edu.unisabana.dyas.samples.entities.ItemRentado;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.sql.Date;

public interface ItemRentadoMapper {



    /**
     * Consultar ítems rentados de un cliente específico
     * @param documento Documento del cliente
     * @return Lista de ItemRentado del cliente
     */
    List<ItemRentado> consultarItemsRentadosPorCliente(@Param("documento") int documento);

    public void agregarItemRentadoACliente(
            @Param("id") int id,
            @Param("idcli") int idCliente,
            @Param("iditem") int idItem,
            @Param("fechaInicio") String fechaInicio,
            @Param("fechaFin") String fechaFin
    );
}
