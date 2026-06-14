---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.algorithm.AlgParameter"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 算法清单参数 (`cmp.algorithm.AlgParameter`)

> DCRP | 物理表：`cmp_algorithm_impl_parameter`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 算法清单参数 |
| 物理表 | `cmp_algorithm_impl_parameter` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:49.8350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `algorithmCode` | 算法清单编码 | `algorithm_code` | String |
| 2 | `algorithmId` | 算法清单ID | `algorithm_id` | f8c02056-da8c-4899-b2be-1222b00fc2a5 |
| 3 | `algorithmImplCode` | 实现清单编码 | `algorithm_impl_code` | String |
| 4 | `algorithmImplId` | 算法实现ID | `algorithm_impl_id` | 22781602-f94d-455a-84d5-de48d4ad9a1f |
| 5 | `code` | 参数编码 | `code` | String |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `defaultValue` | 默认值 | `default_value` | String |
| 11 | `description` | 参数描述 | `description` | String |
| 12 | `id` | ID | `id` | Long |
| 13 | `isEdit` | 可编辑标识 | `is_edit` | Short |
| 14 | `isNotNull` | 是否非空 | `is_not_null` | String |
| 15 | `isShow` | 是否显示 | `is_show` | Short |
| 16 | `maxValue` | 最大值 | `max_value` | String |
| 17 | `minValue` | 最小值 | `min_value` | String |
| 18 | `modifier` | 修改人名称 | `modifier` | String |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 22 | `name` | 参数名称 | `name` | String |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `serialNo` | 顺序号 | `serial_no` | Decimal |
| 25 | `type` | 参数类型 | `type` | String |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `algorithmImplId` | 算法实现ID | `cmp.algorithm.AlgorithmImpl` | None |  |
| 5 | `algorithmId` | 算法清单ID | `cmp.algorithm.Algorithm` | None | true |
