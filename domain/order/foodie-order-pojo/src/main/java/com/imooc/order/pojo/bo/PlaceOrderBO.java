package com.imooc.order.pojo.bo;

import com.imooc.pojo.ShopcartBO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaceOrderBO {
    private SubmitOrderBO orderBO;
    private List<ShopcartBO> shopcartBOList;
}
