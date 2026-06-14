---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.routing.RouteTemplate"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工艺路线模板 (`ed.routing.RouteTemplate`)

> ED | 物理表：`ed_routetemplate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工艺路线模板 |
| 物理表 | `ed_routetemplate` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:25:12.6260` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（35个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `orgId` | 组织id | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 3 | `code` | 编号 | `code` | String |
| 4 | `name` | 名称 | `name` | String |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 7 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `creator` | 创建人 | `creator` | String |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `modifierId` | 最后修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifier` | 最后修改人 | `modifier` | String |
| 13 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 14 | `modifyDate` | 最后修改日期 | `modify_date` | Date |
| 15 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 16 | `auditDate` | 审批日期 | `audit_date` | Date |
| 17 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 18 | `auditor` | 审批人名称 | `auditor` | String |
| 19 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 21 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 22 | `closer` | 关闭人名称 | `closer` | String |
| 23 | `closerId` | 关闭人 | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `defines` | 工艺路线模板(固定自定义项)表 | `` | 22416e09-2d9d-44cf-8760-bf6f54548db5 |
| 25 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 26 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 27 | `locker` | 锁定人 | `locker` | String |
| 28 | `routeTemplateDefineCharacter` | 自定义项特征属性组 | `route_template_define_ct` | 63e22bd5-956e-4481-8633-bb552cede8b4 |
| 29 | `routeTemplateDetail` | 工艺路线模板工序(子表) | `` | a81fdd64-aea0-4389-89a7-2ecab81f005b |
| 30 | `status` | 单据状态 | `status` | Short |
| 31 | `stopstatus` | 停用状态 | `stopstatus` | Boolean |
| 32 | `stoptime` | 停用时间 | `stop_time` | DateTime |
| 33 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 34 | `tplid` | 模板id | `tplid` | Long |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `routeTemplateDefineCharacter` | 自定义项特征属性组 | `ed.routing.RouteTemplateDefineCharacter` | None |  |
| 2 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `closerId` | 关闭人 | `base.user.User` | Service |  |
| 5 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 6 | `modifierId` | 最后修改人id | `base.user.User` | Service |  |
| 7 | `routeTemplateDetail` | 工艺路线模板工序(子表) | `ed.routing.RouteTemplateDetail` | None | true |
| 8 | `orgId` | 组织id | `aa.baseorg.OrgMV` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 10 | `defines` | 工艺路线模板(固定自定义项)表 | `ed.routing.RouteTemplateUserDefine` | None | true |
