---
tags: ["BIP", "元数据", "数据字典", "pes.serviceplanrule.ServicePlanRuleVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务计划规则 (`pes.serviceplanrule.ServicePlanRuleVO`)

>  | 物理表：`imp_pes_sp_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务计划规则 |
| 物理表 | `imp_pes_sp_rule` |
| 数据库 schema | `imppes` |
| 所属应用 | `` |
| 构建时间 | `2026-06-05 17:20:05.7120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `name` | 名称 | `name` | String |
| 3 | `ruleType` | 规则类型 | `rule_type` | String |
| 4 | `execPeriod` | 执行周期 | `exec_period` | Integer |
| 5 | `periodUnit` | 周期单位 | `period_unit` | String |
| 6 | `notifyBeforePeriod` | 提前通知天数 | `notify_before_period` | Integer |
| 7 | `validityPeriod` | 有效期天数 | `validity_period` | Integer |
| 8 | `enable` | 启用状态 | `enable` | sys_intboolean |
| 9 | `memo` | 描述 | `memo` | String |
| 10 | `orgId` | 组织ID | `org_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `creator` | 创建人 | `creator` | String |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `createDate` | 创建日期 | `create_date` | Date |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `id` | ID | `id` | String |
| 20 | `enablets` | 启用时间 | `enablets` | DateTime |
| 21 | `disablets` | 停用时间 | `disablets` | DateTime |
| 22 | `tenant` | 租户ID | `tenant_id` | String |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `orgId` | 组织ID | `bd.adminOrg.AdminOrgVO` | Service |  |
