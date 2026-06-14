---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "lawbid.cpuexpert.CpuExpertRecord"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家履历 (`lawbid.cpuexpert.CpuExpertRecord`)

> **平台版本：BIP 旗舰版 V5**

> ycSouring 模块 | 物理表：`cpu_expert_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家履历 |
| 物理表 | `cpu_expert_record` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 20:14:43.1870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键id |

## 部署信息

- 部署时间: 2026-01-23 23:56:20:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `companyId` | 工作单位 | `company_id` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 5 | `expertId` | 专家 | `expert_id` | ddf859b7-981f-4c8a-b2b9-9d760e5d2bc7 |
| 6 | `onObject` | 是否在职 | `on_object` | String |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `id` | 主键id | `id` | Long |
| 10 | `companyName` | 工作单位 | `company_name` | String |
| 11 | `startTime` | 入职日期 | `start_time` | DateTime |
| 12 | `endTime` | 离职日期 | `end_time` | DateTime |
| 13 | `expertStation` | 工作岗位 | `expert_station` | String |
| 14 | `position` | 职位 | `position` | String |
| 15 | `cpuExpertRecordDefineCharacter` | 专家工作履历特征 | `define_character_id` | 382cf382-0bb3-4788-b01a-981f613d337a |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expertId` | 专家 | `lawbid.cpuexpert.CpuExpert` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `cpuExpertRecordDefineCharacter` | 专家工作履历特征 | `lawbid.cpuexpert.CpuExpertRecordDefineCharacter` | None |  |
