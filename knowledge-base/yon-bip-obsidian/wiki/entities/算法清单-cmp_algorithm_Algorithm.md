---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.algorithm.Algorithm"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 算法清单 (`cmp.algorithm.Algorithm`)

> DCRP | 物理表：`cmp_algorithm`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 算法清单 |
| 物理表 | `cmp_algorithm` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:23.6410` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `domain` | 领域 | `domain` | String |
| 4 | `application` | 应用 | `application` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `code` | 编码 | `code` | String |
| 7 | `description` | 描述 | `description` | String |
| 8 | `isSystem` | 是否系统预制 | `is_system` | Short |
| 9 | `appScene` | 应用场景 | `app_scene` | String |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `creator` | 创建人名称 | `creator` | String |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `enable` | 启用 | `enable` | sys_intboolean |
| 19 | `enablets` | 启用时间 | `enablets` | DateTime |
| 20 | `disablets` | 停用时间 | `disablets` | DateTime |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `algorithmImplList` | 算法实现清单 | `` | 22781602-f94d-455a-84d5-de48d4ad9a1f |
| 23 | `algorithmImplParameterList` | 算法清单参数 | `` | 3c64789f-1cc8-4025-beee-d99b9339e36f |
| 24 | `proxyInterface` | 服务代理接口 | `proxy_interface` | String |
| 25 | `serviceInterface` | 算法接口 | `service_interface` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `algorithmImplParameterList` | 算法清单参数 | `cmp.algorithm.AlgParameter` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `algorithmImplList` | 算法实现清单 | `cmp.algorithm.AlgorithmImpl` | None | true |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
