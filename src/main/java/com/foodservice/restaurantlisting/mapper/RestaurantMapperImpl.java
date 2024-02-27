package com.foodservice.restaurantlisting.mapper;

import com.foodservice.restaurantlisting.dto.RestaurantDTO;
import com.foodservice.restaurantlisting.entity.Restaurant;

public class RestaurantMapperImpl implements RestaurantMapper{
    @Override
    public Restaurant mapRestaurantDTOtoRestaurant(RestaurantDTO restaurantDTO) {
        if(restaurantDTO == null){
            return null;
        }
        else  {
            Restaurant restaurant = new Restaurant();
            restaurant.setId(restaurantDTO.getId());
            restaurant.setName(restaurantDTO.getName());
            restaurant.setAddress(restaurantDTO.getAddress());
            restaurant.setCity(restaurantDTO.getCity());
            restaurant.setRestaurantDescription(restaurantDTO.getRestaurantDescription());

            return restaurant;
        }
    }

    @Override
    public RestaurantDTO mapRestauranttoRestaurantDTO(Restaurant restaurant) {
        if(restaurant == null){
            return null;
        }
        else {
            RestaurantDTO restaurantDTO = new RestaurantDTO();
            restaurantDTO.setId(restaurant.getId());
            restaurantDTO.setName(restaurant.getName());
            restaurantDTO.setAddress(restaurant.getAddress());
            restaurantDTO.setCity(restaurant.getCity());
            restaurantDTO.setRestaurantDescription(restaurant.getRestaurantDescription());

            return restaurantDTO;
        }
    }
}
