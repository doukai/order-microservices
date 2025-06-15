package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Mutation
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation")
public class Mutation {
  /**
   * Mutation Field for 产品
   */
  @Description("Mutation Field for 产品")
  private Product product;

  /**
   * Mutation Field for 产品 List
   */
  @Description("Mutation Field for 产品 List")
  private Collection<Product> productList;

  /**
   * Mutation Field for 订单
   */
  @Description("Mutation Field for 订单")
  private Order order;

  /**
   * Mutation Field for 订单 List
   */
  @Description("Mutation Field for 订单 List")
  private Collection<Order> orderList;

  /**
   * Mutation Field for 订单项
   */
  @Description("Mutation Field for 订单项")
  private OrderItem orderItem;

  /**
   * Mutation Field for 订单项 List
   */
  @Description("Mutation Field for 订单项 List")
  private Collection<OrderItem> orderItemList;

  /**
   * Mutation Field for Relationship Object between 订单 and 订单项
   */
  @Description("Mutation Field for Relationship Object between 订单 and 订单项")
  private OrderOrderItemRelation orderOrderItemRelation;

  /**
   * Mutation Field for Relationship Object between 订单 and 订单项 List
   */
  @Description("Mutation Field for Relationship Object between 订单 and 订单项 List")
  private Collection<OrderOrderItemRelation> orderOrderItemRelationList;

  /**
   * Mutation Field for Relationship Object between 订单项 and 产品
   */
  @Description("Mutation Field for Relationship Object between 订单项 and 产品")
  private OrderItemProductRelation orderItemProductRelation;

  /**
   * Mutation Field for Relationship Object between 订单项 and 产品 List
   */
  @Description("Mutation Field for Relationship Object between 订单项 and 产品 List")
  private Collection<OrderItemProductRelation> orderItemProductRelationList;

  /**
   * Mutation Field for Relationship Object between 产品 and 评论
   */
  @Description("Mutation Field for Relationship Object between 产品 and 评论")
  private ProductReviewRelation productReviewRelation;

  /**
   * Mutation Field for Relationship Object between 产品 and 评论 List
   */
  @Description("Mutation Field for Relationship Object between 产品 and 评论 List")
  private Collection<ProductReviewRelation> productReviewRelationList;

  /**
   * Mutation Field for Relationship Object between 订单 and 用户
   */
  @Description("Mutation Field for Relationship Object between 订单 and 用户")
  private OrderUserRelation orderUserRelation;

  /**
   * Mutation Field for Relationship Object between 订单 and 用户 List
   */
  @Description("Mutation Field for Relationship Object between 订单 and 用户 List")
  private Collection<OrderUserRelation> orderUserRelationList;

  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Collection<Product> getProductList() {
    return this.productList;
  }

  public void setProductList(Collection<Product> productList) {
    this.productList = productList;
  }

  public Order getOrder() {
    return this.order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Collection<Order> getOrderList() {
    return this.orderList;
  }

  public void setOrderList(Collection<Order> orderList) {
    this.orderList = orderList;
  }

  public OrderItem getOrderItem() {
    return this.orderItem;
  }

  public void setOrderItem(OrderItem orderItem) {
    this.orderItem = orderItem;
  }

  public Collection<OrderItem> getOrderItemList() {
    return this.orderItemList;
  }

  public void setOrderItemList(Collection<OrderItem> orderItemList) {
    this.orderItemList = orderItemList;
  }

  public OrderOrderItemRelation getOrderOrderItemRelation() {
    return this.orderOrderItemRelation;
  }

  public void setOrderOrderItemRelation(OrderOrderItemRelation orderOrderItemRelation) {
    this.orderOrderItemRelation = orderOrderItemRelation;
  }

  public Collection<OrderOrderItemRelation> getOrderOrderItemRelationList() {
    return this.orderOrderItemRelationList;
  }

  public void setOrderOrderItemRelationList(
      Collection<OrderOrderItemRelation> orderOrderItemRelationList) {
    this.orderOrderItemRelationList = orderOrderItemRelationList;
  }

  public OrderItemProductRelation getOrderItemProductRelation() {
    return this.orderItemProductRelation;
  }

  public void setOrderItemProductRelation(OrderItemProductRelation orderItemProductRelation) {
    this.orderItemProductRelation = orderItemProductRelation;
  }

  public Collection<OrderItemProductRelation> getOrderItemProductRelationList() {
    return this.orderItemProductRelationList;
  }

  public void setOrderItemProductRelationList(
      Collection<OrderItemProductRelation> orderItemProductRelationList) {
    this.orderItemProductRelationList = orderItemProductRelationList;
  }

  public ProductReviewRelation getProductReviewRelation() {
    return this.productReviewRelation;
  }

  public void setProductReviewRelation(ProductReviewRelation productReviewRelation) {
    this.productReviewRelation = productReviewRelation;
  }

  public Collection<ProductReviewRelation> getProductReviewRelationList() {
    return this.productReviewRelationList;
  }

  public void setProductReviewRelationList(
      Collection<ProductReviewRelation> productReviewRelationList) {
    this.productReviewRelationList = productReviewRelationList;
  }

  public OrderUserRelation getOrderUserRelation() {
    return this.orderUserRelation;
  }

  public void setOrderUserRelation(OrderUserRelation orderUserRelation) {
    this.orderUserRelation = orderUserRelation;
  }

  public Collection<OrderUserRelation> getOrderUserRelationList() {
    return this.orderUserRelationList;
  }

  public void setOrderUserRelationList(Collection<OrderUserRelation> orderUserRelationList) {
    this.orderUserRelationList = orderUserRelationList;
  }
}
