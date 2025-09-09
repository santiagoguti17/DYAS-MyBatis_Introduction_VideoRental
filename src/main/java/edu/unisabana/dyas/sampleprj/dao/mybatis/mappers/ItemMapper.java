package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;


import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.unisabana.dyas.samples.entities.Item;

/**
 *
 * @author cesarvefe
 */
public interface ItemMapper {


    List<Item> consultarItems();

    Item consultarItem(@Param("id") int id);

    void insertarItem(@Param("item") Item item);

        
}
