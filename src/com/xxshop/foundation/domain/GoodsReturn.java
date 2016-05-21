 package com.xxshop.foundation.domain;
 
 import com.xxshop.core.domain.IdEntity;

 import java.util.ArrayList;
 import java.util.List;
 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.ManyToOne;
 import javax.persistence.OneToMany;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="xxshop_goods_return")
 public class GoodsReturn extends IdEntity
 {
   private String return_id;
 
   @ManyToOne(fetch=FetchType.LAZY)
   private OrderForm of;
 
   @OneToMany(mappedBy="gr", cascade={javax.persistence.CascadeType.REMOVE})
   private List<GoodsReturnItem> items = new ArrayList();
 
   @ManyToOne(fetch=FetchType.LAZY)
   private User user;
 
   @Column(columnDefinition="LongText")
   private String return_info;
 
   public OrderForm getOf() { return this.of; }
 
   public void setOf(OrderForm of)
   {
     this.of = of;
   }
 
   public List<GoodsReturnItem> getItems() {
     return this.items;
   }
 
   public void setItems(List<GoodsReturnItem> items) {
     this.items = items;
   }
 
   public User getUser() {
     return this.user;
   }
 
   public void setUser(User user) {
     this.user = user;
   }
 
   public String getReturn_id() {
     return this.return_id;
   }
 
   public void setReturn_id(String return_id) {
     this.return_id = return_id;
   }
 
   public String getReturn_info() {
     return this.return_info;
   }
 
   public void setReturn_info(String return_info) {
     this.return_info = return_info;
   }
 }
