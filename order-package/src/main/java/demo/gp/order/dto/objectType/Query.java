package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Query {
  private Product product;

  private Collection<Product> productList;

  private ProductConnection productConnection;

  private Order order;

  private Collection<Order> orderList;

  private OrderConnection orderConnection;

  private OrderItem orderItem;

  private Collection<OrderItem> orderItemList;

  private OrderItemConnection orderItemConnection;

  private OrderOrderItemRelation orderOrderItemRelation;

  private Collection<OrderOrderItemRelation> orderOrderItemRelationList;

  private OrderOrderItemRelationConnection orderOrderItemRelationConnection;

  private OrderItemProductRelation orderItemProductRelation;

  private Collection<OrderItemProductRelation> orderItemProductRelationList;

  private OrderItemProductRelationConnection orderItemProductRelationConnection;

  private ProductReviewRelation productReviewRelation;

  private Collection<ProductReviewRelation> productReviewRelationList;

  private ProductReviewRelationConnection productReviewRelationConnection;

  private OrderUserRelation orderUserRelation;

  private Collection<OrderUserRelation> orderUserRelationList;

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
