---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "PES.slc.SlcVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质保期计算规则 (`PES.slc.SlcVO`)

> IMP_PES | 物理表：`sms_slc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质保期计算规则 |
| 物理表 | `sms_slc` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:54.3300` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
| 3 | `startType` | 三包确认方式 | `start_type` | String |
| 4 | `memo` | 描述 | `memo` | String |
| 5 | `date1Field` | 起算日期类型 | `date1_field` | String |
| 6 | `date1Value` | 保修月 | `date1_value` | Integer |
| 7 | `date2Value` | 保修月 | `date2_value` | Integer |
| 8 | `date2Field` | 起算日期类型 | `date2_field` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `creator` | 创建人名称 | `creator` | String |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `orgId` | 组织 | `org_id` | String |
| 18 | `isEffective` | 是否启用 | `is_effective` | Boolean |
| 19 | `id` | ID | `id` | String |
| 20 | `tenant` | 租户ID | `tenant_id` | String |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
