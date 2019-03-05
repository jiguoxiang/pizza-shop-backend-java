package com.yaleyoo.pizza.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.annotation.Resource;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "[order]")
public class Order {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    @CreatedDate
    private Date createTime;

    @Column(nullable = false)
    @LastModifiedDate
    private Date lastUpdateTime;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Column(nullable = false)
    private String address; //??

    @Column(nullable = false)
    private long phoneNumber;

    @Column(nullable = false)
    private int storeId;

    @Column(nullable = false)
    @Resource
    private int staffId;//???

    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<OrderItem> orderItemList;

    @Transient
    private float total;

    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

//    public List<OrderItem> getOrderItemList() {
//        return orderItemList;
//    }
//
//    public void setOrderItemList(List<OrderItem> orderItemList) {
//        this.orderItemList = orderItemList;
//    }
}
