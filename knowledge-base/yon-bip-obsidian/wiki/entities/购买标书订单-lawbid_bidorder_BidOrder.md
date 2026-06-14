---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bidorder.BidOrder"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 购买标书订单 (`lawbid.bidorder.BidOrder`)

> ycBusinessCenter | 物理表：`cpu_bid_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 购买标书订单 |
| 物理表 | `cpu_bid_order` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:42:31.0360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（53个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidNoticeId` | 公告id | `bid_notice_id` | 9856b255-b5b6-4b2e-a8b9-a2c4ae9962b5 |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `payment` | 缴纳方式id | `payment` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 6 | `ewalletId` | 缴费单主表id | `ewallet_id` | Long |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `feeType` | 费用类型 | `fee_type` | String |
| 9 | `invoiceNo` | 发票流水号 | `invoice_no` | String |
| 10 | `invoiceRedNo` | 发票红冲流水号 | `invoice_red_no` | String |
| 11 | `invoiceStatus` | 发票状态 | `invoice_status` | String |
| 12 | `invoiceTime` | 开票时间 | `invoice_time` | DateTime |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `payStatus` | 支付状态 | `pay_status` | String |
| 16 | `payTime` | 支付时间 | `pay_time` | DateTime |
| 17 | `payType` | 支付方式 | `pay_type` | String |
| 18 | `payer` | 支付方名称 | `payer` | String |
| 19 | `paymentAmount` | 缴纳金额 | `payment_amount` | Decimal |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `purPersonName` | 采购负责人 | `pur_person_name` | String |
| 22 | `purchaseCode` | 采购项目编码 | `purchase_code` | String |
| 23 | `purchaseId` | 采购项目ID | `purchase_id` | Long |
| 24 | `supplierName` | 供应商名称 | `supplier_name` | String |
| 25 | `purchaseName` | 采购项目名称 | `purchase_name` | String |
| 26 | `tenantId` | tenantId | `tenant_id` | String |
| 27 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 28 | `ytenant` | 租户ID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 29 | `orderCode` | 订单号 | `order_code` | String |
| 30 | `invoiceIssuanceMethod` | 发票开具方式 | `invoice_issuance_method` | String |
| 31 | `contactPerson` | 联系人 | `contact_person` | String |
| 32 | `id` | ID | `id` | Long |
| 33 | `purOrgId` | 采购组织ID | `pur_org_id` | String |
| 34 | `supplierIshidden` | 是否隐藏供应商 | `supplier_is_hidden` | Integer |
| 35 | `merchantId` | 商户号 | `merchant_id` | String |
| 36 | `outTradeNo` | 订单号 | `out_trade_no` | String |
| 37 | `chanpayTradeNo` | 畅捷订单号 | `chanpay_trade_no` | String |
| 38 | `orderStatus` | 订单状态 | `order_status` | String |
| 39 | `purEnterpriseId` | 租户ID | `pur_enterprise_id` | Long |
| 40 | `invoiceAmount` | 开票金额 | `invoice_amount` | Decimal |
| 41 | `contactNumber` | 联系电话 | `contact_number` | String |
| 42 | `orderAmount` | 订单金额 | `order_amount` | Decimal |
| 43 | `bidDocSaleEnd` | 发售截止时间 | `bid_doc_sale_end` | DateTime |
| 44 | `invoiceType` | 发票类型 | `invoice_type` | String |
| 45 | `contactEmail` | 电子邮箱 | `contact_email` | String |
| 46 | `invoice` | 发票抬头 | `invoice` | String |
| 47 | `contactFax` | 传真 | `contact_fax` | String |
| 48 | `taxpayerIdentificationNumber` | 纳税人识别号 | `taxpayer_identification_number` | String |
| 49 | `invoiceDownloadAddress` | 发票下载地址 | `invoice_download_address` | String |
| 50 | `bidOrderList` | 畅捷支付订单明细子表 | `` | 5e63d364-3129-4ad6-a5da-22f750700bf6 |
| 51 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 52 | `invitationList` | 标段包子表 | `` | 91dec160-595b-4de2-bdd7-f21987ce0408 |
| 53 | `isSupport` | 是否支持电子钱包 | `is_support` | Integer |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户ID | `yht.tenant.YhtTenant` | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 4 | `bidOrderList` | 畅捷支付订单明细子表 | `lawbid.bidorder.BidOrderDetail` | None | true |
| 5 | `payment` | 缴纳方式id | `ewallet.config.PayType` | Service |  |
| 6 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `invitationList` | 标段包子表 | `lawbid.bidorder.BidInvitation` | None | true |
| 8 | `bidNoticeId` | 公告id | `lawbid.bidnotice.NoticeVO` | None |  |
