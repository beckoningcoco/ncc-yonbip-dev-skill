---
tags: [BIP, 元数据, 数据字典, sfa.process.Process]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商机流程 (`sfa.process.Process`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_process` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`dc9e74fb-d94f-4887-9155-1ce8221f5da3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商机流程 |
| 物理表 | `sfa_process` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 41 个 |
| 子表 | 2 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `stageList` | `sfa.process.ProcessStage` | composition |
| `stageRelationList` | `sfa.process.ProcessStageRelation` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `contract_trans_type` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `sorder_trans_type` | `yycrm.sfa_oppttranstyperef` |
| `root_process_id` | `` |
| `oppt_trans_type` | `` |
| `tender_trans_type` | `` |
| `tenant_id` | `` |
| `revise_persion` | `bip-usercenter.aa_user` |

## 继承接口 (6个, 18字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 41 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 流程编码 |
| `name` | `name` | `name` | 流程名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `description` | `description` | `description` | 描述 |
| `revise_reason` | `revise_reason` | `reviseReason` | 变更原因 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `oppt_trans_type` | `oppt_trans_type` | `opptTransType` | 商机业务类型ID |
| `tender_trans_type` | `tender_trans_type` | `tenderTransType` | 投标业务类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `sorder_trans_type` | `sorder_trans_type` | `sorderTransType` | 工单业务类型ID |
| `contract_trans_type` | `contract_trans_type` | `contractTransType` | 合同业务类型ID |
| `revise_persion` | `revise_persion` | `revisePersion` | 变更人id |
| `root_process_id` | `root_process_id` | `rootProcessId` | 根流程id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stage_progress_manage` | `stage_progress_manage` | `stageProgressManage` | 阶段进度管理 |
| `end_stage_edit` | `end_stage_edit` | `endStageEdit` | 阶段结束时间可编辑 |
| `start_stage_edit` | `start_stage_edit` | `startStageEdit` | 阶段开始时间可编辑 |
| `is_skip_stage` | `is_skip_stage` | `isSkipStage` | 跨阶段升迁 |
| `is_preset` | `is_preset` | `isPreset` | 是否预置 |
| `` | `isEnd` | `isEnd` | 是否末级 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_object` | `business_object` | `businessObject` | 业务对象 |
| `start_stage_by` | `start_stage_by` | `startStageBy` | 阶段开始依据 |
| `win_rate_gain_type` | `win_rate_gain_type` | `winRateGainType` | 赢单率获取方式 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `parent_id` | `parent_id` | `parent` | 上级分类 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version_code` | `version_code` | `versionCode` | 版本号 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `revise_time` | `revise_time` | `reviseTime` | 变更时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `stageList` | 流程阶段 |
| `` | `` | `stageRelationList` | 流程阶段关系 |
