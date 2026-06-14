---
tags: ["BIP", "元数据", "数据字典", "PO", "po.keyproductsbind.KeyProductSn"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 关键件序列号 (`po.keyproductsbind.KeyProductSn`)

> PO | 物理表：`po_key_prds_sn`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 关键件序列号 |
| 物理表 | `po_key_prds_sn` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:35:07.7770` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `csnCode` | 序列号 | `csn_code` | String |
| 2 | `csnId` | 序列号ID | `csn_id` | b77de1a0-2e36-47ba-9bd9-3cda94fd9680 |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `id` | ID | `id` | Long |
| 5 | `keyProductsBindId` | 关键件绑定主表Id | `key_products_bind_id` | Long |
| 6 | `keyProductsId` | 关键件 | `key_prds_id` | 375b21c5-c650-4451-a397-9f82e3c5e693 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `csnId` | 序列号ID | `sn.serialnumber.SNstateReport` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `keyProductsId` | 关键件 | `po.keyproductsbind.KeyProducts` | None | true |
