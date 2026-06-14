---
tags: ["BIP", "元数据", "数据字典", "PO", "po.scheduleplan.SchedulePlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 排产方案 (`po.scheduleplan.SchedulePlan`)

> PO | 物理表：`po_scheduleplan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 排产方案 |
| 物理表 | `po_scheduleplan` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:50.1100` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 5 | `schPlanDay` | 排产天数 | `schplan_day` | Integer |
| 6 | `schPlanStartWith` | 排产起始日 | `schplan_startwith` | Short |
| 7 | `schPlanType` | 排产方式 | `schplan_type` | Short |
| 8 | `schPlanStrategy` | 排产策略 | `schplan_strategy` | Short |
| 9 | `enable` | 启用 | `enable` | Short |
| 10 | `code` | 编码 | `code` | String |
| 11 | `name` | 名称 | `name` | String |
| 12 | `auditor` | 审批人名称 | `auditor` | String |
| 13 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 15 | `auditDate` | 审批日期 | `audit_date` | Date |
| 16 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 17 | `verifystate` | 审批状态 | `verifystate` | Short |
| 18 | `returncount` | 退回次数 | `returncount` | Short |
| 19 | `stopstatus` | 停用状态 | `stopstatus` | Boolean |
| 20 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime |
| 22 | `createDate` | 创建日期 | `create_date` | Date |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 24 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 25 | `creator` | 创建人名称 | `creator` | String |
| 26 | `modifier` | 修改人名称 | `modifier` | String |
| 27 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 28 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
