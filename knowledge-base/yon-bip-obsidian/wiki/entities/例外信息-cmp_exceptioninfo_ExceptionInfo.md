---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.exceptioninfo.ExceptionInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 例外信息 (`cmp.exceptioninfo.ExceptionInfo`)

> DCRP | 物理表：`cmp_exception_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 例外信息 |
| 物理表 | `cmp_exception_info` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:36.8520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `domain` | 领域 | `domain` | String |
| 4 | `application` | 应用 | `application` | String |
| 5 | `code` | 编码 | `code` | String |
| 6 | `title` | 标题 | `title` | String |
| 7 | `description` | 处理建议 | `description` | String |
| 8 | `exceptionType` | 异常类型 | `exception_type` | String |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `enable` | 启用 | `enable` | sys_intboolean |
| 18 | `enablets` | 启用时间 | `enablets` | DateTime |
| 19 | `disablets` | 停用时间 | `disablets` | DateTime |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
