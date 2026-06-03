---
tags: [BIP, 元数据, 数据字典, act.visitroute.VisitRoute]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 拜访路线 (`act.visitroute.VisitRoute`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`dsfa_visit_route` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：`10caabdc-74c7-46d5-8e83-5107c04e8458`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 拜访路线 |
| 物理表 | `dsfa_visit_route` |
| 数据库 schema | `yycrm` |
| 所属应用 | `ACT` |
| 直连字段 | 41 个 |
| 子表 | 3 个 |
| 关联引用 | 16 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `headDef` | `act.visitroute.VisitRouteDef` | composition |
| `visitRouteParticipantList` | `act.visitroute.VisitRouteParticipant` | composition |
| `routeInfoList` | `act.visitroute.VisitRouteInfo` | composition |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `` | `` |
| `org` | `ucf-org-center.bd_salesorg` |
| `ytenant_id` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `partner_person` | `ucf-staff-center.bd_staff_ref` |
| `visitRouteDefineCharacter` | `` |
| `iCustID` | `yycrm.cust_customerref` |
| `tenant_id` | `` |

## 继承接口 (8个, 24字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 41 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 名称 |
| `` | `creator` | `creator` | 制单人 |
| `comment` | `comment` | `comment` | 备注 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `dept` | `dept` | `dept` | 部门 |
| `iCustID` | `iCustID` | `cust` | 伙伴 |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `org` | `org` | `org` | 销售组织ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `ower` | `ower` | `ower` | 负责人ID |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `visitingobject` | `visitingobject` | `visitingobject` | 拜访对象是否可重复 |
| `carsales_route` | `carsales_route` | `carSalesRoute` | 车销路线 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `otherouteremove` | `otherouteremove` | `otherouteremove` | 其他路线中移除本路线的客户/终端 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `visit_type` | `visit_type` | `visitType` | 拜访对象 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `customerandterminalnum` | `customerandterminalnum` | `customerandterminalnum` | 终端客户数 |
| `routetakes_time` | `routetakes_time` | `routeTakesTime` | 路线耗时 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `visitRouteDefineCharacter` | `visitRouteDefineCharacter` | `visitRouteDefineCharacter` | 拜访路线自定义项特征属性组 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `headDef` | 拜访路线自定义项 |
| `` | `` | `routeInfoList` | 拜访路线明细表 |
| `` | `` | `visitRouteParticipantList` | 拜访路线参与人 |
