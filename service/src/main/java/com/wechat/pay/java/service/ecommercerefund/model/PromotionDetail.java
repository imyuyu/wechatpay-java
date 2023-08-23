// Copyright 2021 Tencent Inc. All rights reserved.
//
// 电商退款API
//
// 境内电商退款功能相关API文档
//
// API version: 1.1.8

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.ecommercerefund.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** PromotionDetail */
public class PromotionDetail {
  /** 券ID 说明：券或者立减优惠id */
  @SerializedName("promotion_id")
  private String promotionId;
  /** 优惠范围 说明：GLOBAL- 全场代金券 SINGLE- 单品优惠 */
  @SerializedName("scope")
  private String scope;
  /** 优惠类型 说明：COUPON- 代金券，需要走结算资金的充值型代金券 DISCOUNT- 优惠券，不走结算资金的免充值型优惠券 */
  @SerializedName("type")
  private String type;
  /** 优惠券面额 说明：用户享受优惠的金额（优惠券面额=微信出资金额+商家出资金额+其他出资方金额 ） */
  @SerializedName("amount")
  private Long amount;
  /** 优惠退款金额 说明：代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金，说明详见代金券或立减优惠 */
  @SerializedName("refund_amount")
  private Long refundAmount;

  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionDetail {\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
