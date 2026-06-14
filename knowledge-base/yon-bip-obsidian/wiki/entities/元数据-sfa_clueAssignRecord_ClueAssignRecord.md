---
tags: [BIP, 元数据, 数据字典, sfa.clueAssignRecord.ClueAssignRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线索分配历史 (`sfa.clueAssignRecord.ClueAssignRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_clueAssignRecord` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`2f3dc925-d8d2-49b4-a227-ed947390044f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线索分配历史 |
| 物理表 | `sfa_clueAssignRecord` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 47 个 |
| 子表 | 0 个 |
| 关联引用 | 19 个 |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `receiver` | `` |
| `retake_high_seas_id` | `` |
| `ytenant_id` | `` |
| `assignor` | `` |
| `original_org` | `` |
| `receiverArea` | `` |
| `` | `` |
| `clueHighSeas_id` | `` |
| `original_ower` | `` |
| `receiverDept` | `` |
| `return_high_seas_id` | `` |
| `original_dept` | `` |
| `return_reason` | `` |
| `clue` | `` |
| `original_area` | `` |
| `receiverOrg` | `` |
| `oldClueHighSeas_id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

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
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 47 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `action` | `action` | `action` | 动作 |
| `` | `creator` | `creator` | 创建人名称 |
| `high_seas_change` | `high_seas_change` | `highSeasChange` | 公海变更 |
| `latestRecord` | `latestRecord` | `latestRecord` | 线索最新记录 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `retake_rule` | `retake_rule` | `retakeRule` | 收回规则 |
| `return_remark` | `return_remark` | `returnRemark` | 退回备注 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assignor` | `assignor` | `assignor` | 操作人 |
| `clue` | `clue` | `clue` | 线索 |
| `clueHighSeas_id` | `clueHighSeas_id` | `clueHighSeasId` | 所属公海 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `oldClueHighSeas_id` | `oldClueHighSeas_id` | `oldClueHighSeasId` | 来源公海 |
| `original_area` | `original_area` | `originalArea` | 原销售区域 |
| `original_dept` | `original_dept` | `originalDept` | 原部门 |
| `original_org` | `original_org` | `originalOrg` | 原销售组织 |
| `original_ower` | `original_ower` | `originalOwer` | 原负责人 |
| `receiverArea` | `receiverArea` | `receiveArea` | 现销售区域 |
| `receiverDept` | `receiverDept` | `receiveDept` | 现部门 |
| `receiverOrg` | `receiverOrg` | `receiveOrg` | 现销售组织 |
| `receiver` | `receiver` | `receiver` | 现负责人 |
| `retake_high_seas_id` | `retake_high_seas_id` | `retakeHighSeasId` | 收回到的公海 |
| `return_high_seas_id` | `return_high_seas_id` | `returnHighSeasId` | 退回到的公海 |
| `return_reason` | `return_reason` | `returnReason` | 退回原因 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `areaRetentionTime` | `areaRetentionTime` | `areaRetentionTime` | 区域停留时间 |
| `deptRetentionTime` | `deptRetentionTime` | `deptRetentionTime` | 部门停留时间 |
| `id` | `id` | `id` | ID |
| `orgRetentionTime` | `orgRetentionTime` | `orgRetentionTime` | 组织停留时间 |
| `staffRetentionTime` | `staffRetentionTime` | `staffRetentionTime` | 人员停留时间 |

### timestamp (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `areaReceiveTime` | `areaReceiveTime` | `areaReceiveTime` | 区域接收时间 |
| `areaTransferTime` | `areaTransferTime` | `areaTransferTime` | 区域转出时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `deptReceiveTime` | `deptReceiveTime` | `deptReceiveTime` | 部门接收时间 |
| `deptTransferTime` | `deptTransferTime` | `deptTransferTime` | 部门转出时间 |
| `historicalActivationTime` | `historicalActivationTime` | `historicalActivationTime` | 历史激活时间 |
| `historicalClosingTime` | `historicalClosingTime` | `historicalClosingTime` | 历史关闭时间 |
| `historicalTransformationTime` | `historicalTransformationTime` | `historicalTransformationTime` | 历史转化时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `orgReceiveTime` | `orgReceiveTime` | `orgReceiveTime` | 组织接收时间 |
| `orgTransferTime` | `orgTransferTime` | `orgTransferTime` | 组织转出时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `staffReceiveTime` | `staffReceiveTime` | `staffReceiveTime` | 人员接收时间 |
| `staffTransferTime` | `staffTransferTime` | `staffTransferTime` | 人员转出时间 |
