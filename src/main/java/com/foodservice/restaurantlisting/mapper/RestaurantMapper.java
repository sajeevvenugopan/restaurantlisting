package com.foodservice.restaurantlisting.mapper;

import com.foodservice.restaurantlisting.dto.RestaurantDTO;
import com.foodservice.restaurantlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant mapRestaurantDTOtoRestaurant(RestaurantDTO restaurantDTO);
    RestaurantDTO mapRestauranttoRestaurantDTO(Restaurant restaurant);
}
