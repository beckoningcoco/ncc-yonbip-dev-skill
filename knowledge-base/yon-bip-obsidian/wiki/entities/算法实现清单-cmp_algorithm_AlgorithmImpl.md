---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.algorithm.AlgorithmImpl"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 算法实现清单 (`cmp.algorithm.AlgorithmImpl`)

> DCRP | 物理表：`cmp_algorithm_impl_list`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 算法实现清单 |
| 物理表 | `cmp_algorithm_impl_list` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:51.3360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（34个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `domain` | 领域 | `domain` | String |
| 4 | `application` | 应用 | `application` | String |
| 5 | `algorithmId` | 算法清单ID | `algorithm_id` | f8c02056-da8c-4899-b2be-1222b00fc2a5 |
| 6 | `algorithmCode` | 算法清单编码 | `algorithm_code` | String |
| 7 | `name` | 名称 | `name` | String |
| 8 | `code` | 编码 | `code` | String |
| 9 | `serialNo` | 顺序号 | `serial_no` | Decimal |
| 10 | `type` | 类型 | `type` | String |
| 11 | `description` | 描述 | `description` | String |
| 12 | `isSystem` | 是否系统预制(1:是,0:否) | `is_system` | Short |
| 13 | `path` | 路径 | `path` | String |
| 14 | `isYS` | 是否支持YS | `is_ys` | Short |
| 15 | `isYB` | 是否支持YB | `is_yb` | Short |
| 16 | `appScene` | 算法应用场景 | `app_scene` | String |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime |
| 18 | `createDate` | 创建日期 | `create_date` | Date |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 21 | `creator` | 创建人名称 | `creator` | String |
| 22 | `modifier` | 修改人名称 | `modifier` | String |
| 23 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `enable` | 启用 | `enable` | sys_intboolean |
| 26 | `enablets` | 启用时间 | `enablets` | DateTime |
| 27 | `disablets` | 停用时间 | `disablets` | DateTime |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `AlgorithmImplParameterList` | 算法实现清单参数 | `` | ba271585-3431-4505-8c40-8a652d3113c4 |
| 30 | `invokeType` | 调用类型 | `invoke_type` | String |
| 31 | `isConstrainable` | 是否可约束 | `is_constrainable` | Boolean |
| 32 | `isOptimizable` | 是否可优化 | `is_optimizable` | Boolean |
| 33 | `profileEntity` | 业务参数实体 | `profile_entity` | String |
| 34 | `serverUrl` | 服务地址 | `server_url` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `AlgorithmImplParameterList` | 算法实现清单参数 | `cmp.algorithm.AlgImplParameter` | None | true |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `algorithmId` | 算法清单ID | `cmp.algorithm.Algorithm` | None | true |
