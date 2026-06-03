---
tags: [BIP, metadata, usp, PlanTransportRoute]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计划运输路线 (usp.plantransportroute.PlanTransportRoute)

> Platform: BIP V5 | Module: usp | Table: usp_plantransportroute | Schema: uscmpub

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 计划运输路线 |
| uri | usp.plantransportroute.PlanTransportRoute |
| tableName | usp_plantransportroute |
| domain | uscmpub |
| applicationCode | SCCS |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 自动编号 (IAutoCode) | voucher.base.IAutoCode |
| 2 | 审计信息 (IAuditInfo) | base.itf.IAuditInfo |
| 3 | 租户相关 (ITenant) | base.itf.ITenant |
| 4 | 停用信息 (IStopping) | base.itf.IStopping |
| 5 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (28)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 2 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 3 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 4 | stoptime | 停用时间 | stop_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 5 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 6 | id | 主表id | id | long | Long |  |  | nullable,REF.ID |
| 7 | code | 计划路线编码 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 8 | name | 计划路线名称 | name | multiLanguage | String |  |  | nullable |
| 9 | startPoint | 起点 | startPoint | text | String |  |  | nullable |
| 10 | endPoint | 终点 | endPoint | text | String |  |  | nullable |
| 11 | sendTransWay | 发运方式ID | sendTransWay | quote | aa.sendtrans.SendTransWay |  |  | nullable |
| 12 | defaultCarrier | 默认承运商ID | defaultCarrier | quote | les.carrier.carrier |  |  | nullable |
| 13 | specifyCarrier | 是否指定承运商 | specifyCarrier | switch | Boolean |  |  | nullable |
| 14 | routeDistance | 整条路线总距离(公里) | routeDistance | number | Decimal |  |  | nullable |
| 15 | routeDuration | 整条路线在途时长(天) | routeDuration | number | Decimal |  |  | nullable |
| 16 | isConsiderPlan | 是否考虑运输计划 | isConsiderPlan | switch | Boolean |  |  | nullable |
| 17 | planLeadTime | 运输计划提前期(天) | planLeadTime | number | Decimal |  |  | nullable |
| 18 | isSegmentedTransport | 是否有分段运输 | isSegmentedTransport | switch | Boolean |  |  | nullable |
| 19 | memo | 备注 | memo | multiLanguage | String |  |  | nullable |
| 20 | stopstatus | 启用状态 | stopstatus | switch | Boolean |  |  | nullable,reportHide |
| 21 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 22 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 23 | creatorId | 创建人id | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 24 | modifierId | 修改人id | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 25 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 26 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 27 | childs | 计划运输路线子表 | - | - | usp.plantransportroute.PlanTransportRouteDetail |  |  |  |
| 28 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 2 | sendTransWay | 发运方式ID | sendTransWay | aa.sendtrans.SendTransWay |
| 3 | defaultCarrier | 默认承运商ID | defaultCarrier | les.carrier.carrier |
| 4 | creatorId | 创建人id | creatorId | base.user.User |
| 5 | modifierId | 修改人id | modifierId | base.user.User |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | childs | 计划运输路线子表 | usp.plantransportroute.PlanTransportRouteDetail |
