---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricedecision.PriceDecisionProgress"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定标单处理进度 (`sourcing.pricedecision.PriceDecisionProgress`)

> ycSouringInquiry | 物理表：`cpu_pricedecision_progress`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定标单处理进度 |
| 物理表 | `cpu_pricedecision_progress` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:10:55.2790` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createTime` | 创建时间 | `create_time` | DateTime |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `creator` | 创建人 | `creator` | String |
| 4 | `enterpriseId` | 采购商企业id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `enterpriseName` | 采购商企业名称 | `enterprise_name` | String |
| 6 | `errorMsg` | 错误信息 | `error_msg` | String |
| 7 | `id` | 主键 | `id` | Long |
| 8 | `modifiedtime` | 更新时间 | `modifiedtime` | DateTime |
| 9 | `modifier` | 更新人 | `modifier` | String |
| 10 | `pricedecisionDetailId` | 定标单子表id | `pricedecision_detail_id` | 5ad37a5c-0251-495d-8791-6c08a9d69254 |
| 11 | `pricedecisionId` | 定标单id | `pricedecisionid` | 4c65ba32-f884-44bd-ad0d-21414f32c012 |
| 12 | `processStatus` | 处理状态 | `process_status` | String |
| 13 | `processType` | 处理类型 | `process_type` | String |
| 14 | `pubts` | 时间戳 | `ts` | DateTime |
| 15 | `sysVersion` | 系统版本 | `sys_version` | Long |
| 16 | `targetId` | 处理类型来源ID | `target_id` | String |
| 17 | `ts` | 业务时间戳 | `ts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `pricedecisionDetailId` | 定标单子表id | `sourcing.pricedecision.PriceDecisionDetail` | None |  |
| 3 | `pricedecisionId` | 定标单id | `sourcing.pricedecision.PriceDecision` | None | true |
| 4 | `enterpriseId` | 采购商企业id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
