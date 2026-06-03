---
tags: [BIP, 元数据, 数据字典, st.reservation.Reservation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 跟踪线索 (`st.reservation.Reservation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`st_reservation` | domain：`ustock` | 应用：`ST` | 业务对象ID：`6d042718-24f8-4851-8a13-b144a5c03369`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 跟踪线索 |
| 物理表 | `st_reservation` |
| 数据库 schema | `ustock` |
| 所属应用 | `ST` |
| 直连字段 | 34 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `project` | `` |
| `reservecust` | `productcenter.merchantRef` |
| `wbs` | `` |
| `reservebillid` | `` |
| `operator` | `` |
| `reservebillautoid` | `` |
| `typeid` | `ustock.st_reservationtype` |
| `department` | `` |
| `reservationDefineCharacter` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **需求跟踪方式相关** (`st.reservation.IDemandType`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reservebilltype` | `reservebilltype` | `reservebilltype` | 跟踪线索单据类型 |
| `coSourceType` | `coSourceType` | `coSourceType` | 协同源头单据类型 |
| `coSourceCode` | `coSourceCode` | `coSourceCode` | 协同源头单据号 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `code` | `code` | `code` | 跟踪线索编码 |
| `name` | `name` | `name` | 跟踪线索名称 |
| `reservebillcode` | `reservebillcode` | `reservebillcode` | 销售订单编号 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `typeid` | `typeid` | `typeid` | 跟踪线索类型Id |
| `reservebillautoid` | `reservebillautoid` | `reservebillautoid` | 跟踪线索单据子表id |
| `project` | `project` | `project` | 项目 |
| `department` | `department` | `department` | 部门 |
| `operator` | `operator` | `operator` | 业务员 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `reservecust` | `reservecust` | `reservecust` | 客户 |
| `reservebillid` | `reservebillid` | `reservebillid` | 销售订单 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `demandtype` | `demandtype` | 需求跟踪方式编码 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clueType` | `clueType` | `clueType` | 线索类型 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `coSourceId` | `coSourceId` | `coSourceId` | 协同源头单据主表id |
| `coSourceAutoId` | `coSourceAutoId` | `coSourceAutoId` | 协同源头单据子表id |
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reserverowno` | `reserverowno` | `reserverowno` | 跟踪线索单据行号 |
| `coSourceLineNo` | `coSourceLineNo` | `coSourceLineNo` | 协同源头单据行号 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reservationDefineCharacter` | `reservationDefineCharacter` | `reservationDefineCharacter` | 自定义项特征属性组 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
