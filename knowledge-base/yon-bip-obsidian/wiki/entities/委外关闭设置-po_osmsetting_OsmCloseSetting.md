---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.osmsetting.OsmCloseSetting"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外关闭设置 (`po.osmsetting.OsmCloseSetting`)

> OSM | 物理表：`osm_close_setting`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外关闭设置 |
| 物理表 | `osm_close_setting` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:19.5750` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `bizObject` | 业务单据 | `biz_obj` | BizObjectTypeEnum |
| 3 | `returncount` | 退回次数 | `returncount` | Short |
| 4 | `verifystate` | 审批状态 | `verifystate` | Short |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 7 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `closeType` | 关闭类型 | `close_type` | CloseTypeEnum |
| 18 | `orgId` | 组织id | `org_id` | String |
| 19 | `transType` | 交易类型id | `trans_type` | Long |
| 20 | `condition` | 关闭条件 | `condition` | String |
| 21 | `remark` | 关闭条件描述 | `remark` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
