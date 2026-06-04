---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "order.paymentprogressack.PaymentProgressAckCooperate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 进度确认单协同主表 (`order.paymentprogressack.PaymentProgressAckCooperate`)

> ycSaleCoor | 物理表：`cpu_paymentprogressack_cooperate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 进度确认单协同主表 |
| 物理表 | `cpu_paymentprogressack_cooperate` |
| 数据库 schema | `cpu-cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:40.8460` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 75d5ef8d-3cf8-4e94-bd0f-33b51f76efe1 | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 2 | `purFile` | 供应商档案名称 | `pur_file` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `isVendorConfirm` | 是否需供应商确认 | `is_vendor_confirm` | Integer |
| 6 | `source` | 上游单据类型 | `source` | String |
| 7 | `vendorName` | 供应商档案名称 | `vendor_name` | String |
| 8 | `cooperFullname` | 对方单据表头元数据实体 | `cooper_fullname` | String |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 10 | `cooperGroup` | 关联单据服务域 | `cooper_group` | String |
| 11 | `vendor` | 供应商档案 | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 12 | `initiateType` | 发起方 | `initiate_type` | String |
| 13 | `upcode` | 上游单据号 | `upcode` | String |
| 14 | `cooperStatus` | 协同状态 | `cooper_status` | String |
| 15 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 16 | `id` | ID | `id` | 75d5ef8d-3cf8-4e94-bd0f-33b51f76efe1 |
| 17 | `saleFile` | 供应商档案名称 | `sale_file` | String |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `refuseReason` | 拒绝理由 | `refuse_reason` | String |
| 20 | `cooperId` | 关联单据主表id | `cooper_id` | Long |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `vendor` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 3 | `id` | ID | `order.paymentprogressack.SalePaymentProgressAck` | None | true |
