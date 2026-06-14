---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.alconfig.AlgorithmParameterConfiguration"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 算法参数配置 (`cmp.alconfig.AlgorithmParameterConfiguration`)

> DCRP | 物理表：`cmp_alconfig_parameter`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 算法参数配置 |
| 物理表 | `cmp_alconfig_parameter` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:48.4680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `algorithmConfigurationId` | 算法配置ID | `algorithm_configuration_id` | e0cc2683-9758-484f-8a7b-81a49003db27 |
| 4 | `code` | 编码 | `code` | String |
| 5 | `value` | 值 | `value` | String |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime |
| 7 | `createDate` | 创建日期 | `create_date` | Date |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 9 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 10 | `creator` | 创建人名称 | `creator` | String |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `algorithmConfigurationId` | 算法配置ID | `cmp.alconfig.AlgorithmConfiguration` | None | true |
