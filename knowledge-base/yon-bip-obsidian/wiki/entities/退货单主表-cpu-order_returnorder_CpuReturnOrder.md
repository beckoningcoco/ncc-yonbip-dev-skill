---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.returnorder.CpuReturnOrder"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 退货单主表 (`cpu-order.returnorder.CpuReturnOrder`)

> ycSaleCoor | 物理表：`cpu_return_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 退货单主表 |
| 物理表 | `cpu_return_order` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:43.1320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（55个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `agentConfirmDate` | 代确认时间 | `agent_confirm_date` | DateTime |
| 2 | `agentConfirmUser` | 代确认人Id | `agent_confirm_user` | Long |
| 3 | `agentConfirmUserName` | 代确认人姓名 | `agent_confirm_user_name` | String |
| 4 | `buyerPersonId` | 买方联系人ID | `buyer_person_id` | Long |
| 5 | `buyerPersonName` | 买方联系人 | `buyer_person_name` | String |
| 6 | `buyerPhone` | 买方联系电话 | `buyer_phone` | String |
| 7 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 8 | `currencyCode` | 币种编号 | `currency_code` | String |
| 9 | `currencyId` | 币种Id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 10 | `currencyName` | 币种 | `currency_name` | String |
| 11 | `currencySymbol` |  | `currency_symbol` | String |
| 12 | `defines` | 退换货主表自由自定义项 | `` | cccc796d-60d2-48ed-9dc1-466ef9dec0ca |
| 13 | `deptId` | 采购部门ID | `dept_id` | String |
| 14 | `deptName` | 采购部门名称 | `dept_name` | String |
| 15 | `dr` | 删除标志 | `dr` | Integer |
| 16 | `enterpriseId` | 供应商租户id{cpu_auth.cpu_enterprise} | `enterprise_id` | Long |
| 17 | `enterpriseName` | 供应商租户的名字 | `enterprise_name` | String |
| 18 | `gmtCreate` | 创建时间 | `gmt_create` | DateTime |
| 19 | `gmtModified` | 修改时间 | `gmt_modified` | DateTime |
| 20 | `id` | ID | `id` | Long |
| 21 | `memo` | 备注 | `memo` | String |
| 22 | `orderCode` | 退换货单号 | `order_code` | String |
| 23 | `orderOtherId` | 退货订单id(来源于其他系统) | `order_other_id` | Long |
| 24 | `orderSource` | 退换货订单来源 | `order_source` | String |
| 25 | `orderStatus` | 退货订单状态 | `order_status` | String |
| 26 | `orgId` | 采购组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 27 | `orgName` | 采购组织名称 | `org_name` | String |
| 28 | `processTime` | 处理时间 | `process_time` | DateTime |
| 29 | `processor` | 处理人 | `processor` | String |
| 30 | `pubts` | 时间戳 | `ts` | DateTime |
| 31 | `purEnterpriceName` | 采购商的租户name | `pur_enterprice_name` | String |
| 32 | `purEnterpriseId` | 采购商租户id{cpu_auth.cpu_enterprise} | `pur_enterprise_id` | Long |
| 33 | `purOrderCode` | 采购订单号 | `pur_order_code` | String |
| 34 | `purOrderId` | 采购订单id | `pur_order_id` | Long |
| 35 | `purchaseId` | 采购用户id | `purchase_id` | Long |
| 36 | `purchaseName` | 采购员姓名 | `purchase_name` | String |
| 37 | `purchasePhone` | 采购员联系电话 | `purchase_phone` | String |
| 38 | `refuseReturnReason` | 拒绝退货理由 | `refuse_return_reason` | String |
| 39 | `returnNotifierTime` | 退货通知日期 | `return_notifier_time` | DateTime |
| 40 | `returnOrderDefineCharacter` | 自定义项特征属性组 | `define_header` | 455dd43d-a865-4742-b934-6735cf1231aa |
| 41 | `returnOrderDetailList` | 退换货子表 | `` | 4523f4cc-4083-42ba-a1e3-f6b788c6ebeb |
| 42 | `returnReason` | 退货理由 | `return_reason` | String |
| 43 | `returnStatus` | 退货状态 | `return_status` | String |
| 44 | `returnType` | 退货类型 | `return_type` | Integer |
| 45 | `saleOrderCode` | 销售订单号 | `sale_order_code` | String |
| 46 | `saleOrderId` | 销售订单id | `sale_order_id` | Long |
| 47 | `supplyAddress` | 供应商地址 | `supply_address` | String |
| 48 | `supplyPersonId` | 供应商联系人id | `supply_person_id` | Long |
| 49 | `supplyPersonName` | 供应商联系人 | `supply_person_name` | String |
| 50 | `supplyPhone` | 供应商联系电话 | `supply_phone` | String |
| 51 | `tplid` | tplid | `tplid` | Long |
| 52 | `transTypeId` | 交易类型ID | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 53 | `transTypeName` | 交易类型 | `transtype_name` | String |
| 54 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 55 | `ytenant` | 租户编码 | `ytenant_id` | String |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `returnOrderDetailList` | 退换货子表 | `cpu-order.returnorder.CpuReturnOrderDetail` | None | true |
| 2 | `returnOrderDefineCharacter` | 自定义项特征属性组 | `cpu-order.returnorder.CpuReturnOrderHeaderDefine` | None |  |
| 3 | `transTypeId` | 交易类型ID | `bd.bill.TransType` | Service |  |
| 4 | `currencyId` | 币种Id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 5 | `orgId` | 采购组织ID | `org.func.BaseOrg` | Service |  |
| 6 | `defines` | 退换货主表自由自定义项 | `cpu-order.returnorder.CpuReturnOrderFreeDefine` | None | true |
