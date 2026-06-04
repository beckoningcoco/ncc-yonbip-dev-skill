---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "lawbid.cpuexpert.CpuExpertDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 专家详情 (`lawbid.cpuexpert.CpuExpertDetail`)

> **平台版本：BIP 旗舰版 V5**

> ycSouring 模块 | 物理表：`cpu_expert_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 专家详情 |
| 物理表 | `cpu_expert_detail` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 20:14:39.1920` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

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
| 2 | `creteTime` | 创建时间 | `crete_time` | DateTime |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 5 | `expertId` | 专家 | `expert_id` | ddf859b7-981f-4c8a-b2b9-9d760e5d2bc7 |
| 6 | `isMainpro` | 是否为主专业 | `is_mainPro` | String |
| 7 | `majorClassCode` | 专业编码 | `major_class_code` | String |
| 8 | `majorName` | 专业名称 | `major_name` | String |
| 9 | `other01` | 备用字段 | `other_01` | String |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 12 | `id` | 主键 | `id` | Long |
| 13 | `majorId` | 专业 | `major_code` | e98c5d1f-7cd4-49b6-b0e1-522395c2b3dd |
| 14 | `superName` | 上级分类名称 | `super_name` | String |
| 15 | `cpuExpertDetailDefineCharacter` | 专家专业特征 | `define_character_id` | 193219bf-1102-4d05-a499-6c2ff2d83364 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `cpuExpertDetailDefineCharacter` | 专家专业特征 | `lawbid.cpuexpert.CpuExpertDetailDefineCharacter` | None |  |
| 2 | `expertId` | 专家 | `lawbid.cpuexpert.CpuExpert` | None | true |
| 3 | `majorId` | 专业 | `lawbid.expertmajors.CpuExpertMajors` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
