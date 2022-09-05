package com.example.Project_Ecommerce.Repository;
import com.example.Project_Ecommerce.entity.DTO.*;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface MyBatisRepository {

    @Select("SELECT * FROM PRODUCT WHERE PRICE <#{price}")
    @Results(value={@Result(property = "product_id",column = "PRODUCT_ID"),@Result(property = "product_name",column = "PRODUCT_NAME"),@Result(property = "type",column = "TYPE"),@Result(property = "size",column = "SIZE"),@Result(property = "price",column = "PRICE")})
    List< ProductDTO> getAllProductLessThen(BigDecimal price);
    @Select("SELECT * FROM PRODUCT WHERE PRICE >#{price}")
    @Results(value={@Result(property = "product_id",column = "PRODUCT_ID"),@Result(property = "product_name",column = "PRODUCT_NAME"),@Result(property = "type",column = "TYPE"),@Result(property = "size",column = "SIZE"),@Result(property = "price",column = "PRICE")})
    List< ProductDTO> getAllProductGreaterThen(BigDecimal price);
    @Select("SELECT * FROM PRODUCT WHERE PRICE =#{price}")
    @Results(value={@Result(property = "product_id",column = "PRODUCT_ID"),@Result(property = "product_name",column = "PRODUCT_NAME"),@Result(property = "type",column = "TYPE"),@Result(property = "size",column = "SIZE"),@Result(property = "price",column = "PRICE")})
    List< ProductDTO> getAllProductEqual(BigDecimal price);
    @Select("SELECT P.*, CI.*  FROM PRODUCT  P JOIN CART_ITEM CI ON P.PRODUCT_ID=CI.PRODUCT_ID, CUSTOMER C WHERE C.CUSTOMER_ID=#{customer_id} AND P.PRODUCT_NAME = #{name_product}   ORDER BY P.PRODUCT_NAME LIMIT #{limit} OFFSET #{Offset}")
    @Results(value = {@Result(property ="product_id" ,column ="PRODUCT_ID" ),
            @Result(property ="type" ,column ="TYPE" ),
            @Result(property ="product_name" ,column ="PRODUCT_NAME" ),
            @Result(property ="size" ,column ="SIZE" ),
            @Result(property ="price" ,column ="PRICE" ),
            @Result(property ="quantity_wished" ,column ="QUANTITY_WISHED" ),
            @Result(property ="date_added" ,column ="DATE_ADDED" ),
            @Result(property ="total_amount" ,column ="TOTAL_AMOUNT" ),
            @Result(property ="card_id" ,column ="CART_ID" )

    })
    List<CartItemProductDTO> getCartItemProduct(long customer_id, String name_product, int Offset, int limit);





}
