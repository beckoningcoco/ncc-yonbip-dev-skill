---
tags: ["BIP", "元数据", "数据字典", "CLM", "CLM.clmContract.ClmContractChangeCenterFeature"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合同变更中心_自定义特征 (`CLM.clmContract.ClmContractChangeCenterFeature`)

> CLM | 物理表：`clm_contract_change_center_ct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同变更中心_自定义特征 |
| 物理表 | `clm_contract_change_center_ct` |
| domain/服务域 | `yonbip-ec-contract` |
| schema | `yonbip_clm_contract` |
| 所属应用 | `CLM` |
| 构建时间 | `2026-06-04 23:45:08.0490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |

---

## 直接属性（4个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除 | `dr` | Short |
| 2 | `id` | 主键 | `id` | String |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
