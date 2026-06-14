---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contract.CtPayTermCharacterDefine"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同表体付款协议自定义项 (`cpu-contract.contract.CtPayTermCharacterDefine`)

> ycContractManagement | 物理表：`cpu_ct_payterm_character_define`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同表体付款协议自定义项 |
| 物理表 | `cpu_ct_payterm_character_define` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:45:14.5170` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `JC0A01` | 类型 | `vcol1` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `id` | ID | `id` | String |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
