package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.user.dto.objectType.User;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class OrderUserRelation implements Meta {
  @Id
  private String id;

  private String orderRef;

  private Order order;

  private Integer userRef;

  private User user;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "OrderUserRelation";

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer orderRefCount;

  private String orderRefMax;

  private String orderRefMin;

  private Integer userRefCount;

  private Integer userRefSum;

  private Integer userRefAvg;

  private Integer userRefMax;

  private Integer userRefMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOrderRef() {
    return this.orderRef;
  }

  public void setOrderRef(String orderRef) {
    this.orderRef = orderRef;
  }

  public Order getOrder() {
    return this.order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Integer getUserRef() {
    return this.userRef;
  }

  public void setUserRef(Integer userRef) {
    this.userRef = userRef;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
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

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public Integer getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Integer idMax) {
    this.idMax = idMax;
  }

  public Integer getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Integer idMin) {
    this.idMin = idMin;
  }

  public Integer getOrderRefCount() {
    return this.orderRefCount;
  }

  public void setOrderRefCount(Integer orderRefCount) {
    this.orderRefCount = orderRefCount;
  }

  public String getOrderRefMax() {
    return this.orderRefMax;
  }

  public void setOrderRefMax(String orderRefMax) {
    this.orderRefMax = orderRefMax;
  }

  public String getOrderRefMin() {
    return this.orderRefMin;
  }

  public void setOrderRefMin(String orderRefMin) {
    this.orderRefMin = orderRefMin;
  }

  public Integer getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Integer userRefCount) {
    this.userRefCount = userRefCount;
  }

  public Integer getUserRefSum() {
    return this.userRefSum;
  }

  public void setUserRefSum(Integer userRefSum) {
    this.userRefSum = userRefSum;
  }

  public Integer getUserRefAvg() {
    return this.userRefAvg;
  }

  public void setUserRefAvg(Integer userRefAvg) {
    this.userRefAvg = userRefAvg;
  }

  public Integer getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(Integer userRefMax) {
    this.userRefMax = userRefMax;
  }

  public Integer getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(Integer userRefMin) {
    this.userRefMin = userRefMin;
  }
}
