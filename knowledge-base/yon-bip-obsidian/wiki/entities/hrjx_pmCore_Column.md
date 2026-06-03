---
tags: [BIP, metadata, hrjx, Column]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 栏目实体 (hrjx.pmCore.Column)

> Platform: BIP V5 | Table: pm_column | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 栏目实体 |
| uri | hrjx.pmCore.Column |
| tableName | pm_column |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |
| description | 0 停用 1 启用 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (25)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | classname | 栏目分类名称 | classname | text | String |  |  | nullable |
| 2 | columncode | 编码 | columncode | text | String |  |  | isCode,nullable |
| 3 | columnname | 名称 | columnname | text | String |  |  | isName,nullable |
| 4 | bizprop | 业务性质 | bizprop | int | Integer |  |  | nullable |
| 5 | columntype | 类型 | columntype | int | Integer |  |  | nullable |
| 6 | datalen | 数据长度 | datalen | text | String |  |  | nullable |
| 7 | columndatatype | 数据类型 | columndatatype | int | Integer |  |  | nullable |
| 8 | defaultshow | 新增6 | defaultshow | int | Integer |  |  | nullable |
| 9 | iscalculable | 是否可计算 | iscalculable | int | Integer |  |  | nullable |
| 10 | isturn | 按伦次顺序打分 | isturn | switch | Boolean |  |  | nullable |
| 11 | dispSeq | 顺序 | disp_seq | int | Integer |  |  | nullable |
| 12 | issystem | 是否系统预置 | issystem | int | Integer |  |  | nullable |
| 13 | enable | 启用 | enablestate | int | Integer |  |  | nullable,uiDesign |
| 14 | defaultvalue | 默认值 | defaultvalue | text | String |  |  | nullable |
| 15 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 16 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 17 | lowerlimit | 下限 | lowerlimit | text | String |  |  | nullable |
| 18 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 19 | createTime | 新增18 | creationtime | timestamp | Timestamp |  |  | nullable |
| 20 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 21 | modifyTime | 新增19 | modifiedtime | timestamp | Timestamp |  |  | nullable |
| 22 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 23 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 24 | tenant | 租户 | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 25 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | tenant | 租户 | tenantid | yht.tenant.YhtTenant |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
