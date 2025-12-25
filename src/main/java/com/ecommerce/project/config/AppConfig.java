package com.ecommerce.project.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper(){
//        ModelMapper modelMapper = new ModelMapper();
//
//        //Order -> OrderDTO: map Payment to PaymentDTO
//        TypeMap<Order, OrderDTO> orderTypeMap = modelMapper.createTypeMap(Order.class, OrderDTO.class);
//        orderTypeMap.addMappings(mapper -> mapper.map(Order::getPayment, OrderDTO::setPayment));
//
//        // OrderItem -> OrderItemDTO: map Product to ProductDTO
//        TypeMap<OrderItem, OrderItemDTO> itemTypeMap = modelMapper.createTypeMap(OrderItem.class, OrderItemDTO.class);
//        itemTypeMap.addMappings(mapper -> mapper.map(OrderItem::getProduct, OrderItemDTO::setProductDTO));
//
//        return modelMapper;
    return new ModelMapper();
    }
}
