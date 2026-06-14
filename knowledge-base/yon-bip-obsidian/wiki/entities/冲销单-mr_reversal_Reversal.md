---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.reversal.Reversal"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 冲销单 (`mr.reversal.Reversal`)

> MR | 物理表：`mr_reversal`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 冲销单 |
| 物理表 | `mr_reversal` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:51.2630` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auditDate` | 审批日期 | `audit_date` | Date |
| 2 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 3 | `auditor` | 审批人名称 | `auditor` | String |
| 4 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `code` | 编码 | `code` | String |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `id` | ID | `id` | Long |
| 11 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `remark` | 备注 | `remark` | String |
| 19 | `returncount` | 退回次数 | `returncount` | Short |
| 20 | `reversalLine` | 冲销单子表 | `` | d5035f8d-63f9-414b-b0fd-73e64f10527b |
| 21 | `status` | 状态 | `status` | Integer |
| 22 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 23 | `tplid` | 模板id | `tplid` | Long |
| 24 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 25 | `verifystate` | 审批状态 | `verifystate` | Short |
| 26 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `reversalLine` | 冲销单子表 | `mr.reversal.ReversalLine` | None | true |
| 7 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 8 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
