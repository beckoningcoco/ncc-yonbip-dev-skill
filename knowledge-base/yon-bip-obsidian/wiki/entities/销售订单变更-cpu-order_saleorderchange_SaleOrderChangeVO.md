---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorderchange.SaleOrderChangeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单变更 (`cpu-order.saleorderchange.SaleOrderChangeVO`)

> ycSaleCoor | 物理表：`cpu_sale_order_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单变更 |
| 物理表 | `cpu_sale_order_change` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:38.3260` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `orderno` | String | 销售订单号 |

---

## 直接属性（104个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `purEnterpriseName` | 采购企业 | `pur_enterprise_name` | String |
| 2 | `changeReason` | 变更原因 | `change_reason` | String |
| 3 | `orgName` | 采购组织 | `org_name` | String |
| 4 | `status` | 变更状态 | `status` | String |
| 5 | `deptName` | 采购部门 | `dept_name` | String |
| 6 | `purOrderChangeId` | 采购订单变更单主键 | `pur_order_change_id` | Long |
| 7 | `orderOtherId` | ERP采购订单号 | `order_other_id` | String |
| 8 | `modifyNumber` | 变更版本号 | `modifyNumber` | Integer |
| 9 | `saleOrderId` | 销售订单主键 | `sale_order_id` | Long |
| 10 | `purOrderCode` | 采购订单编码 | `pur_order_code` | String |
| 11 | `saleFileId` | 供应方附件 | `sale_file_id` | String |
| 12 | `pubts` | 时间戳 | `ts` | DateTime |
| 13 | `processType` | 订单流程 | `process_type` | Integer |
| 14 | `targetBillId` | 目标单据id | `target_bill_Id` | String |
| 15 | `targettype` | 目标单据 | `target_type` | Integer |
| 16 | `payStatus` | 付款状态 | `pay_status` | Integer |
| 17 | `mallOrderId` | 超市订单id | `mall_order_id` | a5e54491-d54a-45d6-9800-4557b5d7b306 |
| 18 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 19 | `orderno` | 销售订单号 | `orderno` | String |
| 20 | `supplyPersionName` | 供方联系人 | `supply_persion_name` | String |
| 21 | `refReaStatus` | 拒绝理由状态枚举 | `ref_rea_status` | String |
| 22 | `agentConfirmDate` | 代确认时间 | `agent_confirm_date` | DateTime |
| 23 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 24 | `buyerConfirOpinion` | 买方确认意见 | `buyer_confir_opinion` | String |
| 25 | `invalidateTime` | 作废时间 | `invalidate_time` | DateTime |
| 26 | `invalidateMemo` | 作废备注 | `invalidate_memo` | String |
| 27 | `agentConfirmUser` | 代确认人Id | `agent_confirm_user` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 28 | `confirmUser` | 确认人 | `confirm_user` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 29 | `buyerConfirId` | 买方确认人id | `buyer_confir_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 30 | `buyerConfirName` | 买方确认人 | `buyer_confir_name` | String |
| 31 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 32 | `purContentTypeId` | 采购内容(head)档案Id | `pur_content_type_id` | Long |
| 33 | `agentConfirmUserName` | 代确认人姓名 | `agent_confirm_user_name` | String |
| 34 | `vreason` | 供应商拒绝/变更理由 | `vreason` | String |
| 35 | `ytenant` | 租户编码 | `ytenant_id` | String |
| 36 | `confirmUserName` | 确认人名 | `confirm_user_name` | String |
| 37 | `gmtCreate` | 创建时间 | `gmt_create` | DateTime |
| 38 | `invalidatePer` | 作废人 | `invalidate_per` | String |
| 39 | `confirmDate` | 确认时间 | `confirm_date` | DateTime |
| 40 | `buyerConfirTime` | 买方确认时间 | `buyer_confir_time` | DateTime |
| 41 | `ts` | 时间戳 | `ts` | DateTime |
| 42 | `supplyPhone` | 供方联系电话 | `supply_phone` | String |
| 43 | `purchaseName` | 采购员/电话 | `purchase_name` | String |
| 44 | `purchasePhone` | 采购员联系方式 | `purchase_phone` | String |
| 45 | `sourceType` | 订单来源 | `source_type` | String |
| 46 | `totalMoney` | 含税总金额 | `total_money` | Decimal |
| 47 | `priceType` | 价格类型 | `price_type` | String |
| 48 | `notaxMoney` | 无税总金额 | `notax_money` | Decimal |
| 49 | `vBuyOfferBillCode` | 询价单号 | `vbuyoffer_billcode` | String |
| 50 | `currencyName` | 币种 | `currency_name` | String |
| 51 | `transactionTypeName` | 订单分类 | `transaction_type_name` | String |
| 52 | `memo` | 发货备注 | `memo` | String |
| 53 | `transportName` | 运输方式 | `transport_name` | String |
| 54 | `saleOrderDefineCharacter` | 自定义项特征组 | `defineHeader` | ded13dc8-7245-4ad8-b4e2-7a5a29b4b4cb |
| 55 | `supEnterpriseName` | 供应商 | `sup_enterprise_name` | String |
| 56 | `enterpriseName` | 供应商企业名称 | `enterprise_name` | String |
| 57 | `businessType` | 业务类型 | `business_type` | Integer |
| 58 | `enterpriseId` | 供应商租户 | `enterpriseid` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 59 | `id` | ID | `id` | Long |
| 60 | `gmtModified` | 修改时间 | `gmt_modified` | DateTime |
| 61 | `transportType` | 运输方式 | `transport_type` | String |
| 62 | `stockFileId` | 采购方附件 | `stock_file_id` | String |
| 63 | `purOrderId` | 附件 | `pur_order_id` | Long |
| 64 | `sellerMemberId` | 卖家ID | `seller_member_id` | String |
| 65 | `orderTime` | 订单日期 | `order_time` | DateTime |
| 66 | `supplierid` | 供应商 | `supplierid` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 67 | `processor` | 处理人 | `processor` | String |
| 68 | `processTime` | 处理时间 | `process_time` | DateTime |
| 69 | `currencyId` | 币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 70 | `creator` | 创建人 | `creator` | String |
| 71 | `buyofferid` | 询价单id | `buyofferid` | Long |
| 72 | `pricedecisionid` | 定价单id | `pricedecisionid` | Long |
| 73 | `subject` | 订单标题 | `subject` | String |
| 74 | `supplierName` | 供应商 | `supplier_name` | String |
| 75 | `purchaseId` | 采购用户 | `purchaseid` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 76 | `currencyCode` | 币种编号 | `currency_code` | String |
| 77 | `supplyPersionId` | 供应商联系人id | `supply_persion_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 78 | `orderSource` | 订单来源标识 云采 1688 | `order_source` | String |
| 79 | `supEnterpriseId` | 供应商租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 80 | `ticketOrgId` | 收票组织ID | `ticket_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 81 | `invSupEnterpriseId` | 开票供应商租户 | `inv_sup_enterprise_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 82 | `rate` | 汇率 | `rate` | Decimal |
| 83 | `rateType` | 汇率类型 | `rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 84 | `isArrivePlan` | 是否到货计划 | `is_arrive_plan` | Boolean |
| 85 | `orgId` | 采购组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 86 | `purContentType` | 采购内容 | `pur_content_type` | String |
| 87 | `changeRefuseReason` | 变更拒绝理由 | `change_refuse_reason` | String |
| 88 | `isConQuantity` | 是否允许确认数量 | `is_con_quantity` | String |
| 89 | `isConPrice` | 是否允许确认单价 | `is_con_price` | String |
| 90 | `buyerConfirMobile` | 买方确认电话 | `buyer_confir_mobile` | String |
| 91 | `industryTag` | 行业标签 | `industry_tag` | Integer |
| 92 | `urgency` | 紧急程度 | `urgency` | Integer |
| 93 | `transactionTypeId` | 交易类型 | `transaction_type_id` | String |
| 94 | `transactionTypeCode` | 交易类型code | `transaction_type_code` | String |
| 95 | `busitype` |  | `busitype` | String |
| 96 | `supOperatorId` | 供应商操作人id | `sup_operator_id` | Long |
| 97 | `supOperatorName` | 供应商操作人名称 | `sup_operator_name` | String |
| 98 | `supOperationDate` | 操作时间 | `sup_operation_date` | DateTime |
| 99 | `supOperationContent` | 操作内容 | `sup_operation_content` | String |
| 100 | `deptId` | 采购部门ID | `dept_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 101 | `printCount` | 打印次数 | `printCount` | Integer |
| 102 | `defines` | 销售订单变更自定义项 | `` | 0d30c250-c53d-4370-9714-53680ec5dad6 |
| 103 | `detailEntityList` | 销售订单变更表体 | `` | 3e4ed587-ba2b-4f00-9f28-d1b58c972250 |
| 104 | `saleOrderPayTermList` | 销售订单变更付款协议 | `` | 03906bae-0c23-4bd8-82a5-a7c66812754b |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mallOrderId` | 超市订单id | `mall.mallofficeorder.MallOrder` | Service |  |
| 2 | `supplierid` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 3 | `detailEntityList` | 销售订单变更表体 | `cpu-order.saleorderchange.SaleOrderDetailChangeVO` | None | true |
| 4 | `purchaseId` | 采购用户 | `cpu-privilege.user.MgrUser` | Service |  |
| 5 | `deptId` | 采购部门ID | `org.func.BaseOrg` | Service |  |
| 6 | `saleOrderPayTermList` | 销售订单变更付款协议 | `cpu-order.saleorderchange.SaleOrderPayTermChangeVO` | None | true |
| 7 | `saleOrderDefineCharacter` | 自定义项特征组 | `cpu-order.saleorderchange.SaleOrderChangeHeaderDefine` | None |  |
| 8 | `agentConfirmUser` | 代确认人Id | `cpu-privilege.user.MgrUser` | Service |  |
| 9 | `confirmUser` | 确认人 | `cpu-privilege.user.MgrUser` | Service |  |
| 10 | `orgId` | 采购组织ID | `org.func.BaseOrg` | Service |  |
| 11 | `invSupEnterpriseId` | 开票供应商租户 | `aa.vendor.Vendor` | Service |  |
| 12 | `defines` | 销售订单变更自定义项 | `cpu-order.saleorderchange.SaleOrderChangeVODefine` | None | true |
| 13 | `buyerConfirId` | 买方确认人id | `cpu-privilege.user.MgrUser` | Service |  |
| 14 | `rateType` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 15 | `ticketOrgId` | 收票组织ID | `org.func.BaseOrg` | Service |  |
| 16 | `supEnterpriseId` | 供应商租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 17 | `enterpriseId` | 供应商租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 18 | `currencyId` | 币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 19 | `supplyPersionId` | 供应商联系人id | `bd.staff.Staff` | Service |  |
