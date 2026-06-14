---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "ycSaleCoor.salevmireplenish.SalevmiReplenishVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# VMI补货申请 (`ycSaleCoor.salevmireplenish.SalevmiReplenishVO`)

> ycSaleCoor | 物理表：`cpu_sale_vmi_replenish`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | VMI补货申请 |
| 物理表 | `cpu_sale_vmi_replenish` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:56.9370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据编号 |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `busType` | 交易类型ID | `bus_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `code` | 单据编号 | `code` | String |
| 4 | `details` | VMI补货申请表体 | `` | 46355e2c-2b2c-4e5a-af8f-94a20c8ce03b |
| 5 | `dr` | 删除标志 | `dr` | Integer |
| 6 | `fileId` | 附件 | `fileId` | String |
| 7 | `gmtCreate` | 创建时间 | `gmt_create` | DateTime |
| 8 | `id` | ID | `id` | Long |
| 9 | `memo` | 备注 | `memo` | String |
| 10 | `orderStatus` | 单据状态 | `order_status` | String |
| 11 | `orderTime` | 单据日期 | `order_time` | Date |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `purEnterpriseName` | 采购商名称 | `pur_enterprise_name` | String |
| 14 | `purOrgId` | 采购组织id | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 15 | `pushPuOrderMsg` | 推送采购订单失败原因 | `push_purorder_msg` | String |
| 16 | `salevmiReplenishVODefineCharacter` | 自定义项特征属性组 | `defineHeader` | 9f739e32-bd9d-4316-964c-e0548e882035 |
| 17 | `sourceType` | 来源单据类型 | `source_type` | String |
| 18 | `supplierId` | 供应商id | `supplierid` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 19 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 20 | `ytenant` | 租户编码 | `ytenant_id` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 2 | `supplierId` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 3 | `details` | VMI补货申请表体 | `ycSaleCoor.salevmireplenish.SalevmiReplenishDetailVO` | None | true |
| 4 | `busType` | 交易类型ID | `bd.bill.TransType` | Service |  |
| 5 | `salevmiReplenishVODefineCharacter` | 自定义项特征属性组 | `ycSaleCoor.salevmireplenish.SaleVmiReplenishHeaderDefine` | None |  |
