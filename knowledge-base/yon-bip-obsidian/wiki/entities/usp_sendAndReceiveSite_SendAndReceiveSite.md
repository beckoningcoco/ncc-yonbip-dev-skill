---
tags: [BIP, metadata, usp, SendAndReceiveSite]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收发货点 (usp.sendAndReceiveSite.SendAndReceiveSite)

> Platform: BIP V5 | Module: usp | Table: usp_sendandreceivesite | Schema: uscmpub

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 收发货点 |
| uri | usp.sendAndReceiveSite.SendAndReceiveSite |
| tableName | usp_sendandreceivesite |
| domain | uscmpub |
| schema | `usp_plantransportroute` |
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
| 1 | 停用信息 (IStopping) | base.itf.IStopping |
| 2 | 租户相关 (ITenant) | base.itf.ITenant |
| 3 | 审计信息 (IAuditInfo) | base.itf.IAuditInfo |
| 4 | 自动编号 (IAutoCode) | voucher.base.IAutoCode |
| 5 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (23)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createDate | 创建日期 | create_date | date | Date |  |  | isBusinessLog,nullable |
| 2 | creatorId | 创建人 | creatorId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 3 | modifierId | 修改人 | modifierId | quote | base.user.User |  |  | BUSINESSMESSAGE,isBusinessLog,nullable |
| 4 | modifyDate | 修改日期 | modify_date | date | Date |  |  | isBusinessLog,nullable |
| 5 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 6 | stoptime | 停用时间 | stop_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 7 | code | 收发货点编码 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 8 | siteName | 收发货点名称 | site_name | multiLanguage | String |  |  | nullable |
| 9 | transportAreaId | 所属运输区域id | transport_area_id | quote | base.shipregion.ShipRegion |  |  | nullable |
| 10 | detailedAddress | 收发货点地址 | detailed_address | multiLanguage | String |  |  | nullable |
| 11 | stopstatus | 启用状态 | stopstatus | switch | Boolean |  |  | nullable,reportHide |
| 12 | remake | 备注 | remake | multiLanguage | String |  |  | nullable |
| 13 | creator | 创建人 | creator | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 14 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 15 | modifier | 修改人 | modifier | text | String |  |  | isBusinessLog,isGlobalization,nullable |
| 16 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | isBusinessLog,nullable |
| 17 | id | id | id | long | Long |  |  | nullable,REF.ID |
| 18 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 19 | latitude | 纬度 | latitude | number | Decimal |  |  | nullable,REF.ID |
| 20 | linkman | 联系人 | linkman | text | String |  |  | nullable,REF.ID |
| 21 | longitude | 经度 | longitude | number | Decimal |  |  | nullable,REF.ID |
| 22 | phone | 联系电话 | phone | text | String |  |  | nullable,REF.ID |
| 23 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creatorId | 创建人 | creatorId | base.user.User |
| 2 | modifierId | 修改人 | modifierId | base.user.User |
| 3 | transportAreaId | 所属运输区域id | transport_area_id | base.shipregion.ShipRegion |
| 4 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
