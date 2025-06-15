package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.inputObjectType.UserInput;
import io.graphoenix.core.dto.inputObjectType.MetaInput;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

/**
 * Mutation Arguments for Relationship Object between 订单 and 用户 List
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("Mutation Arguments for Relationship Object between 订单 and 用户 List")
public class OrderUserRelationListMutationArguments implements MetaInput, OrderUserRelationInputBase {
  /**
   * ID
   */
  @Description("ID")
  private String id;

  /**
   * 订单 Reference
   */
  @Description("订单 Reference")
  private String orderRef;

  /**
   * 订单
   */
  @Description("订单")
  private OrderInput order;

  /**
   * 用户 Reference
   */
  @Description("用户 Reference")
  private Integer userRef;

  /**
   * 用户
   */
  @Description("用户")
  private UserInput user;

  /**
   * Is Deprecated
   */
  @DefaultValue("false")
  @Description("Is Deprecated")
  private Boolean isDeprecated = false;

  /**
   * Version
   */
  @Description("Version")
  private Integer version;

  /**
   * Realm ID
   */
  @Description("Realm ID")
  private Integer realmId;

  /**
   * Create User ID
   */
  @Description("Create User ID")
  private String createUserId;

  /**
   * Create Time
   */
  @Description("Create Time")
  private LocalDateTime createTime;

  /**
   * Update User ID
   */
  @Description("Update User ID")
  private String updateUserId;

  /**
   * Update Time
   */
  @Description("Update Time")
  private LocalDateTime updateTime;

  /**
   * Create Group ID
   */
  @Description("Create Group ID")
  private String createGroupId;

  /**
   * Type Name
   */
  @DefaultValue("OrderUserRelation")
  @Description("Type Name")
  private String __typename = "OrderUserRelation";

  /**
   * Input List
   */
  @Description("Input List")
  private Collection<OrderUserRelationInput> list;

  /**
   * Where
   */
  @Description("Where")
  private OrderUserRelationExpression where;

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public void setId(String id) {
    this.id = (String)id;
  }

  @Override
  public String getOrderRef() {
    return this.orderRef;
  }

  @Override
  public void setOrderRef(String orderRef) {
    this.orderRef = (String)orderRef;
  }

  @Override
  public OrderInput getOrder() {
    return this.order;
  }

  @Override
  public void setOrder(OrderInput order) {
    this.order = (OrderInput)order;
  }

  @Override
  public Integer getUserRef() {
    return this.userRef;
  }

  @Override
  public void setUserRef(Integer userRef) {
    this.userRef = (Integer)userRef;
  }

  @Override
  public UserInput getUser() {
    return this.user;
  }

  @Override
  public void setUser(UserInput user) {
    this.user = (UserInput)user;
  }

  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = (Boolean)isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = (Integer)version;
  }

  @Override
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
    this.realmId = (Integer)realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = (String)createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = (LocalDateTime)createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = (String)updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = (LocalDateTime)updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = (String)createGroupId;
  }

  @Override
  public String get__typename() {
    return this.__typename;
  }

  @Override
  public void set__typename(String __typename) {
    this.__typename = (String)__typename;
  }

  public Collection<OrderUserRelationInput> getList() {
    return this.list;
  }

  public void setList(Collection<OrderUserRelationInput> list) {
    this.list = list;
  }

  @Override
  public OrderUserRelationExpression getWhere() {
    return this.where;
  }

  @Override
  public void setWhere(OrderUserRelationExpression where) {
    this.where = (OrderUserRelationExpression)where;
  }
}
