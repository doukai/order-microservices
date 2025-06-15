package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * Query
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Query")
public class Query {
  /**
   * Query Field for 产品
   */
  @Description("Query Field for 产品")
  private Product product;

  /**
   * Query Field for 产品 List
   */
  @Description("Query Field for 产品 List")
  private Collection<Product> productList;

  /**
   * Query Field for 产品 Connection
   */
  @Description("Query Field for 产品 Connection")
  private ProductConnection productConnection;

  /**
   * Query Field for 订单
   */
  @Description("Query Field for 订单")
  private Order order;

  /**
   * Query Field for 订单 List
   */
  @Description("Query Field for 订单 List")
  private Collection<Order> orderList;

  /**
   * Query Field for 订单 Connection
   */
  @Description("Query Field for 订单 Connection")
  private OrderConnection orderConnection;

  /**
   * Query Field for 订单项
   */
  @Description("Query Field for 订单项")
  private OrderItem orderItem;

  /**
   * Query Field for 订单项 List
   */
  @Description("Query Field for 订单项 List")
  private Collection<OrderItem> orderItemList;

  /**
   * Query Field for 订单项 Connection
   */
  @Description("Query Field for 订单项 Connection")
  private OrderItemConnection orderItemConnection;

  /**
   * Query Field for Relationship Object between 订单 and 订单项
   */
  @Description("Query Field for Relationship Object between 订单 and 订单项")
  private OrderOrderItemRelation orderOrderItemRelation;

  /**
   * Query Field for Relationship Object between 订单 and 订单项 List
   */
  @Description("Query Field for Relationship Object between 订单 and 订单项 List")
  private Collection<OrderOrderItemRelation> orderOrderItemRelationList;

  /**
   * Query Field for Relationship Object between 订单 and 订单项 Connection
   */
  @Description("Query Field for Relationship Object between 订单 and 订单项 Connection")
  private OrderOrderItemRelationConnection orderOrderItemRelationConnection;

  /**
   * Query Field for Relationship Object between 订单项 and 产品
   */
  @Description("Query Field for Relationship Object between 订单项 and 产品")
  private OrderItemProductRelation orderItemProductRelation;

  /**
   * Query Field for Relationship Object between 订单项 and 产品 List
   */
  @Description("Query Field for Relationship Object between 订单项 and 产品 List")
  private Collection<OrderItemProductRelation> orderItemProductRelationList;

  /**
   * Query Field for Relationship Object between 订单项 and 产品 Connection
   */
  @Description("Query Field for Relationship Object between 订单项 and 产品 Connection")
  private OrderItemProductRelationConnection orderItemProductRelationConnection;

  /**
   * Query Field for Relationship Object between 产品 and 评论
   */
  @Description("Query Field for Relationship Object between 产品 and 评论")
  private ProductReviewRelation productReviewRelation;

  /**
   * Query Field for Relationship Object between 产品 and 评论 List
   */
  @Description("Query Field for Relationship Object between 产品 and 评论 List")
  private Collection<ProductReviewRelation> productReviewRelationList;

  /**
   * Query Field for Relationship Object between 产品 and 评论 Connection
   */
  @Description("Query Field for Relationship Object between 产品 and 评论 Connection")
  private ProductReviewRelationConnection productReviewRelationConnection;

  /**
   * Query Field for Relationship Object between 订单 and 用户
   */
  @Description("Query Field for Relationship Object between 订单 and 用户")
  private OrderUserRelation orderUserRelation;

  /**
   * Query Field for Relationship Object between 订单 and 用户 List
   */
  @Description("Query Field for Relationship Object between 订单 and 用户 List")
  private Collection<OrderUserRelation> orderUserRelationList;

  /**
   * Query Field for Relationship Object between 订单 and 用户 Connection
   */
  @Description("Query Field for Relationship Object between 订单 and 用户 Connection")
  private OrderUserRelationConnection orderUserRelationConnection;

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

  public ProductConnection getProductConnection() {
    return this.productConnection;
  }

  public void setProductConnection(ProductConnection productConnection) {
    this.productConnection = productConnection;
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

  public OrderConnection getOrderConnection() {
    return this.orderConnection;
  }

  public void setOrderConnection(OrderConnection orderConnection) {
    this.orderConnection = orderConnection;
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

  public OrderItemConnection getOrderItemConnection() {
    return this.orderItemConnection;
  }

  public void setOrderItemConnection(OrderItemConnection orderItemConnection) {
    this.orderItemConnection = orderItemConnection;
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

  public OrderOrderItemRelationConnection getOrderOrderItemRelationConnection() {
    return this.orderOrderItemRelationConnection;
  }

  public void setOrderOrderItemRelationConnection(
      OrderOrderItemRelationConnection orderOrderItemRelationConnection) {
    this.orderOrderItemRelationConnection = orderOrderItemRelationConnection;
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

  public OrderItemProductRelationConnection getOrderItemProductRelationConnection() {
    return this.orderItemProductRelationConnection;
  }

  public void setOrderItemProductRelationConnection(
      OrderItemProductRelationConnection orderItemProductRelationConnection) {
    this.orderItemProductRelationConnection = orderItemProductRelationConnection;
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

  public ProductReviewRelationConnection getProductReviewRelationConnection() {
    return this.productReviewRelationConnection;
  }

  public void setProductReviewRelationConnection(
      ProductReviewRelationConnection productReviewRelationConnection) {
    this.productReviewRelationConnection = productReviewRelationConnection;
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

  public OrderUserRelationConnection getOrderUserRelationConnection() {
    return this.orderUserRelationConnection;
  }

  public void setOrderUserRelationConnection(
      OrderUserRelationConnection orderUserRelationConnection) {
    this.orderUserRelationConnection = orderUserRelationConnection;
  }
}
