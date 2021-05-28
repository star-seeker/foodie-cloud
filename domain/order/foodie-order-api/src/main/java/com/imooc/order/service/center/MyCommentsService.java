package com.imooc.order.service.center;


import com.imooc.order.pojo.OrderItems;
import com.imooc.order.pojo.bo.center.OrderItemsCommentBO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("foodie-order-service")
@RequestMapping("my-comments-api")
public interface MyCommentsService {

    /**
     * 根据订单id查询关联的商品
     * @param orderId
     * @return
     */
    @GetMapping("myComments")
    public List<OrderItems> queryPendingComment(@RequestParam("orderId") String orderId);

    /**
     * 保存用户的评论
     * @param orderId
     * @param userId
     * @param commentList
     */
    @PostMapping("comments")
    public void saveComments(@RequestParam("orderId") String orderId,
                             @RequestParam("userId") String userId,
                             @RequestParam(value = "commentList", required = false) List<OrderItemsCommentBO> commentList);

}
