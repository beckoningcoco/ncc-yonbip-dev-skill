---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.CTHistoryCharacterDefine"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同表体物料历史表自定义项实体 (`cpu-contract.contractchangenew.CTHistoryCharacterDefine`)

> ycContractManagement | 物理表：`cpu_ct_history_character_define`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同表体物料历史表自定义项实体 |
| 物理表 | `cpu_ct_history_character_define` |
| 数据库 schema | `cpu-contract` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:45:15.8060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `Eleven_Product_Color_Attribute` | Eleven物料颜色属性 | `vcol1` | cf0d67fa-8cdb-448d-b794-7339f1689411 |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `fyxm` | 费用项目 | `lcol1` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 4 | `id` | ID | `id` | String |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `fyxm` | 费用项目 | `bd.expenseitem.ExpenseItem` | Service |  |
| 3 | `Eleven_Product_Color_Attribute` | Eleven物料颜色属性 | `bd.customerdoc_Eleven_Product_Color_Attribute.Eleven_Product_Color_Attribute` | Service |  |
