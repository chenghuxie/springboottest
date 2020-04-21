package com.sun3d.why.model;


import java.util.Date;
public class Activity {
    /**
     * 
     */
    private String activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动封面
     */
    private String activityCoverImg;

    /**
     * 时间描述
     */
    private String dateDesc;

    /**
     * 时间段： 结束时间
     */
    private String timeEndStr;

    /**
     * 时间段：开始时间
     */
    private String timeStartStr;

    /**
     * 活动开始日期: yyyy-MM-dd
     */
    private Date activityStartDate;

    /**
     * 活动结束日期 ： yyyy-MM-dd
     */
    private Date activityEndDate;

    /**
     * 开始时间 yyyy-MM-dd:hh:mm:ss  用于检索
     */
    private Date activityStartTime;

    /**
     * 结束时间  yyyy-MM-dd:hh:mm:ss 用于检索
     */
    private Date activityEndTime;

    /**
     *  活动类型id activity_type(activity_type_id)
     */
    private String activityTypeId;

    /**
     * 
     */
    private String addressId;

    /**
     * 活动地址
     */
    private String activityAddress;

    /**
     * 活动地点
     */
    private String activitySite;

    /**
     * 补充详细地址
     */
    private String addressDetail;

    /**
     * 交通路线
     */
    private String trafficRoutes;

    /**
     * 发布方
     */
    private String publisher;

    /**
     * 报名方式： 0 在线预约
     */
    private Integer registrationMethods;

    /**
     * 总票量
     */
    private Integer totalTicket;

    /**
     * 剩余票
     */
    private Integer remainTicket;

    /**
     * 收费方式： 0 免费， 1 收费
     */
    private Integer chargingMode;

    /**
     * 票价
     */
    private Long ticketPrice;

    /**
     * 收费说明
     */
    private String chargingDesc;

    /**
     * 预定限制， 0 默认， 1  自定义
     */
    private Integer bookLimits;

    /**
     * 单个活动预定次数限制
     */
    private Integer bookTimesLimit;

    /**
     * 单个活动最多预定票数
     */
    private Integer bookTotalTicketLimit;

    /**
     * 单位描述
     */
    private String unitDesc;

    /**
     * 信息填写是否完整： 0 不完整 1 完整
     */
    private Boolean completed;

    /**
     * 活动状态：  0: 未上架 ， 1:  上架  ，2:  下架
     */
    private Integer activityStatus;

    /**
     * 
     */
    private Long createUser;

    /**
     * 
     */
    private Date createTime;

    /**
     * 版本控制
     */
    private Integer version;

    /**
     * 
     */
    private Long updateUser;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 上架时间
     */
    private Date publishTime;

    /**
     * 
     */
    private Boolean deleted;

    /**
     * 场次设定： 0 单场次    1 多场次
     */
    private Integer eventsSetting;

    /**
     * 用于控制活动进入 mq_offset%维度(如 100)   消息队列,代码控制每次自增1
     */
    private Long mqOffset;

    /**
     * 活动内容
     */
    private String activityContent;


    /**
     * 联系电话（咨询电话）
     */
    private  String contactPhone;


    /**
     * 
     * @return activity_id 
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * 
     * @param activityId 
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * 活动名称
     * @return activity_name 活动名称
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * 活动名称
     * @param activityName 活动名称
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * 活动封面
     * @return activity_cover_img 活动封面
     */
    public String getActivityCoverImg() {
        return activityCoverImg;
    }

    /**
     * 活动封面
     * @param activityCoverImg 活动封面
     */
    public void setActivityCoverImg(String activityCoverImg) {
        this.activityCoverImg = activityCoverImg;
    }

    /**
     * 时间描述
     * @return date_desc 时间描述
     */
    public String getDateDesc() {
        return dateDesc;
    }

    /**
     * 时间描述
     * @param dateDesc 时间描述
     */
    public void setDateDesc(String dateDesc) {
        this.dateDesc = dateDesc;
    }

    /**
     * 时间段： 结束时间
     * @return time_end_str 时间段： 结束时间
     */
    public String getTimeEndStr() {
        return timeEndStr;
    }

    /**
     * 时间段： 结束时间
     * @param timeEndStr 时间段： 结束时间
     */
    public void setTimeEndStr(String timeEndStr) {
        this.timeEndStr = timeEndStr;
    }

    /**
     * 时间段：开始时间
     * @return time_start_str 时间段：开始时间
     */
    public String getTimeStartStr() {
        return timeStartStr;
    }

    /**
     * 时间段：开始时间
     * @param timeStartStr 时间段：开始时间
     */
    public void setTimeStartStr(String timeStartStr) {
        this.timeStartStr = timeStartStr;
    }

    /**
     * 活动开始日期: yyyy-MM-dd
     * @return activity_start_date 活动开始日期: yyyy-MM-dd
     */
    public Date getActivityStartDate() {
        return activityStartDate;
    }

    /**
     * 活动开始日期: yyyy-MM-dd
     * @param activityStartDate 活动开始日期: yyyy-MM-dd
     */
    public void setActivityStartDate(Date activityStartDate) {
        this.activityStartDate = activityStartDate;
    }

    /**
     * 活动结束日期 ： yyyy-MM-dd
     * @return activity_end_date 活动结束日期 ： yyyy-MM-dd
     */
    public Date getActivityEndDate() {
        return activityEndDate;
    }

    /**
     * 活动结束日期 ： yyyy-MM-dd
     * @param activityEndDate 活动结束日期 ： yyyy-MM-dd
     */
    public void setActivityEndDate(Date activityEndDate) {
        this.activityEndDate = activityEndDate;
    }

    /**
     * 开始时间 yyyy-MM-dd:hh:mm:ss  用于检索
     * @return activity_start_time 开始时间 yyyy-MM-dd:hh:mm:ss  用于检索
     */
    public Date getActivityStartTime() {
        return activityStartTime;
    }

    /**
     * 开始时间 yyyy-MM-dd:hh:mm:ss  用于检索
     * @param activityStartTime 开始时间 yyyy-MM-dd:hh:mm:ss  用于检索
     */
    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    /**
     * 结束时间  yyyy-MM-dd:hh:mm:ss 用于检索
     * @return activity_end_time 结束时间  yyyy-MM-dd:hh:mm:ss 用于检索
     */
    public Date getActivityEndTime() {
        return activityEndTime;
    }

    /**
     * 结束时间  yyyy-MM-dd:hh:mm:ss 用于检索
     * @param activityEndTime 结束时间  yyyy-MM-dd:hh:mm:ss 用于检索
     */
    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    /**
     *  活动类型id activity_type(activity_type_id)
     * @return activity_type_id  活动类型id activity_type(activity_type_id)
     */
    public String getActivityTypeId() {
        return activityTypeId;
    }

    /**
     *  活动类型id activity_type(activity_type_id)
     * @param activityTypeId  活动类型id activity_type(activity_type_id)
     */
    public void setActivityTypeId(String activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    /**
     * 
     * @return address_id 
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * 
     * @param addressId 
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * 活动地址
     * @return activity_address 活动地址
     */
    public String getActivityAddress() {
        return activityAddress;
    }

    /**
     * 活动地址
     * @param activityAddress 活动地址
     */
    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress;
    }

    /**
     * 活动地点
     * @return activity_site 活动地点
     */
    public String getActivitySite() {
        return activitySite;
    }

    /**
     * 活动地点
     * @param activitySite 活动地点
     */
    public void setActivitySite(String activitySite) {
        this.activitySite = activitySite;
    }

    /**
     * 补充详细地址
     * @return address_detail 补充详细地址
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * 补充详细地址
     * @param addressDetail 补充详细地址
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    /**
     * 交通路线
     * @return traffic_routes 交通路线
     */
    public String getTrafficRoutes() {
        return trafficRoutes;
    }

    /**
     * 交通路线
     * @param trafficRoutes 交通路线
     */
    public void setTrafficRoutes(String trafficRoutes) {
        this.trafficRoutes = trafficRoutes;
    }

    /**
     * 发布方
     * @return publisher 发布方
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 发布方
     * @param publisher 发布方
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * 报名方式： 0 在线预约
     * @return registration_methods 报名方式： 0 在线预约
     */
    public Integer getRegistrationMethods() {
        return registrationMethods;
    }

    /**
     * 报名方式： 0 在线预约
     * @param registrationMethods 报名方式： 0 在线预约
     */
    public void setRegistrationMethods(Integer registrationMethods) {
        this.registrationMethods = registrationMethods;
    }

    /**
     * 总票量
     * @return total_ticket 总票量
     */
    public Integer getTotalTicket() {
        return totalTicket;
    }

    /**
     * 总票量
     * @param totalTicket 总票量
     */
    public void setTotalTicket(Integer totalTicket) {
        this.totalTicket = totalTicket;
    }

    /**
     * 剩余票
     * @return remain_ticket 剩余票
     */
    public Integer getRemainTicket() {
        return remainTicket;
    }

    /**
     * 剩余票
     * @param remainTicket 剩余票
     */
    public void setRemainTicket(Integer remainTicket) {
        this.remainTicket = remainTicket;
    }

    /**
     * 收费方式： 0 免费， 1 收费
     * @return charging_mode 收费方式： 0 免费， 1 收费
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    /**
     * 收费方式： 0 免费， 1 收费
     * @param chargingMode 收费方式： 0 免费， 1 收费
     */
    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    /**
     * 票价
     * @return ticket_price 票价
     */
    public Long getTicketPrice() {
        return ticketPrice;
    }

    /**
     * 票价
     * @param ticketPrice 票价
     */
    public void setTicketPrice(Long ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * 收费说明
     * @return charging_desc 收费说明
     */
    public String getChargingDesc() {
        return chargingDesc;
    }

    /**
     * 收费说明
     * @param chargingDesc 收费说明
     */
    public void setChargingDesc(String chargingDesc) {
        this.chargingDesc = chargingDesc;
    }

    /**
     * 预定限制， 0 默认， 1  自定义
     * @return book_limits 预定限制， 0 默认， 1  自定义
     */
    public Integer getBookLimits() {
        return bookLimits;
    }

    /**
     * 预定限制， 0 默认， 1  自定义
     * @param bookLimits 预定限制， 0 默认， 1  自定义
     */
    public void setBookLimits(Integer bookLimits) {
        this.bookLimits = bookLimits;
    }

    /**
     * 单个活动预定次数限制
     * @return book_times_limit 单个活动预定次数限制
     */
    public Integer getBookTimesLimit() {
        return bookTimesLimit;
    }

    /**
     * 单个活动预定次数限制
     * @param bookTimesLimit 单个活动预定次数限制
     */
    public void setBookTimesLimit(Integer bookTimesLimit) {
        this.bookTimesLimit = bookTimesLimit;
    }

    /**
     * 单个活动最多预定票数
     * @return book_total_ticket_limit 单个活动最多预定票数
     */
    public Integer getBookTotalTicketLimit() {
        return bookTotalTicketLimit;
    }

    /**
     * 单个活动最多预定票数
     * @param bookTotalTicketLimit 单个活动最多预定票数
     */
    public void setBookTotalTicketLimit(Integer bookTotalTicketLimit) {
        this.bookTotalTicketLimit = bookTotalTicketLimit;
    }

    /**
     * 单位描述
     * @return unit_desc 单位描述
     */
    public String getUnitDesc() {
        return unitDesc;
    }

    /**
     * 单位描述
     * @param unitDesc 单位描述
     */
    public void setUnitDesc(String unitDesc) {
        this.unitDesc = unitDesc;
    }

    /**
     * 信息填写是否完整： 0 不完整 1 完整
     * @return completed 信息填写是否完整： 0 不完整 1 完整
     */
    public Boolean getCompleted() {
        return completed;
    }

    /**
     * 信息填写是否完整： 0 不完整 1 完整
     * @param completed 信息填写是否完整： 0 不完整 1 完整
     */
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    /**
     * 活动状态：  0: 未上架 ， 1:  上架  ，2:  下架
     * @return activity_status 活动状态：  0: 未上架 ， 1:  上架  ，2:  下架
     */
    public Integer getActivityStatus() {
        return activityStatus;
    }

    /**
     * 活动状态：  0: 未上架 ， 1:  上架  ，2:  下架
     * @param activityStatus 活动状态：  0: 未上架 ， 1:  上架  ，2:  下架
     */
    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    /**
     * 
     * @return create_user 
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 
     * @param createUser 
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 版本控制
     * @return version 版本控制
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 版本控制
     * @param version 版本控制
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 
     * @return update_user 
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * 
     * @param updateUser 
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 上架时间
     * @return publish_time 上架时间
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * 上架时间
     * @param publishTime 上架时间
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * 
     * @return deleted 
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 
     * @param deleted 
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 场次设定： 0 单场次    1 多场次
     * @return events_setting 场次设定： 0 单场次    1 多场次
     */
    public Integer getEventsSetting() {
        return eventsSetting;
    }

    /**
     * 场次设定： 0 单场次    1 多场次
     * @param eventsSetting 场次设定： 0 单场次    1 多场次
     */
    public void setEventsSetting(Integer eventsSetting) {
        this.eventsSetting = eventsSetting;
    }

    /**
     * 用于控制活动进入 mq_offset%维度(如 100)   消息队列,代码控制每次自增1
     * @return mq_offset 用于控制活动进入 mq_offset%维度(如 100)   消息队列,代码控制每次自增1
     */
    public Long getMqOffset() {
        return mqOffset;
    }

    /**
     * 用于控制活动进入 mq_offset%维度(如 100)   消息队列,代码控制每次自增1
     * @param mqOffset 用于控制活动进入 mq_offset%维度(如 100)   消息队列,代码控制每次自增1
     */
    public void setMqOffset(Long mqOffset) {
        this.mqOffset = mqOffset;
    }

    /**
     * 活动内容
     * @return activity_content 活动内容
     */
    public String getActivityContent() {
        return activityContent;
    }

    /**
     * 活动内容
     * @param activityContent 活动内容
     */
    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }


    @Override
    public String toString() {
        return "Activity{" +
                "activityId='" + activityId + '\'' +
                ", activityName='" + activityName + '\'' +
                ", activityCoverImg='" + activityCoverImg + '\'' +
                ", dateDesc='" + dateDesc + '\'' +
                ", timeEndStr='" + timeEndStr + '\'' +
                ", timeStartStr='" + timeStartStr + '\'' +
                ", activityStartDate=" + activityStartDate +
                ", activityEndDate=" + activityEndDate +
                ", activityStartTime=" + activityStartTime +
                ", activityEndTime=" + activityEndTime +
                ", activityTypeId='" + activityTypeId + '\'' +
                ", addressId='" + addressId + '\'' +
                ", activityAddress='" + activityAddress + '\'' +
                ", activitySite='" + activitySite + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", trafficRoutes='" + trafficRoutes + '\'' +
                ", publisher='" + publisher + '\'' +
                ", registrationMethods=" + registrationMethods +
                ", totalTicket=" + totalTicket +
                ", remainTicket=" + remainTicket +
                ", chargingMode=" + chargingMode +
                ", ticketPrice=" + ticketPrice +
                ", chargingDesc='" + chargingDesc + '\'' +
                ", bookLimits=" + bookLimits +
                ", bookTimesLimit=" + bookTimesLimit +
                ", bookTotalTicketLimit=" + bookTotalTicketLimit +
                ", unitDesc='" + unitDesc + '\'' +
                ", completed=" + completed +
                ", activityStatus=" + activityStatus +
                ", createUser=" + createUser +
                ", createTime=" + createTime +
                ", version=" + version +
                ", updateUser=" + updateUser +
                ", updateTime=" + updateTime +
                ", publishTime=" + publishTime +
                ", deleted=" + deleted +
                ", eventsSetting=" + eventsSetting +
                ", mqOffset=" + mqOffset +
                ", activityContent='" + activityContent + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                '}';
    }
}