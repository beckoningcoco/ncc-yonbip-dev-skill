---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.alconfig.AlgorithmConfiguration"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 算法配置 (`cmp.alconfig.AlgorithmConfiguration`)

> DCRP | 物理表：`cmp_alconfig`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 算法配置 |
| 物理表 | `cmp_alconfig` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:25.0370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `srcDataId` | 来源数据id | `src_data_id` | Long |
| 4 | `srcDataType` | 来源类型 | `src_data_type` | String |
| 5 | `srcDataCode` | 来源数据编码 | `src_data_code` | String |
| 6 | `algorithmCode` | 算法清单编码 | `algorithm_code` | String |
| 7 | `algorithmImplId` | 算法实现 | `algorithm_impl_id` | 22781602-f94d-455a-84d5-de48d4ad9a1f |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `algorithmParameterList` | 算法参数配置 | `` | c625cca9-68b5-4335-ada0-3c46f96e731c |
| 18 | `srcDataTag` | 来源数据标记 | `src_data_tag` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `algorithmParameterList` | 算法参数配置 | `cmp.alconfig.AlgorithmParameterConfiguration` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `algorithmImplId` | 算法实现 | `cmp.algorithm.AlgorithmImpl` | None |  |
