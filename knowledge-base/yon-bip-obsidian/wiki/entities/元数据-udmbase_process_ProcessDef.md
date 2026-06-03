---
tags: [BIP, 元数据, 数据字典, udmbase.process.ProcessDef]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 流程定义 (`udmbase.process.ProcessDef`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`process_def` | domain：`udm` | 应用：`SDDM` | 业务对象ID：`48ebfe4f-7dd0-4d53-a2ba-c4bc2be3ccc9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 流程定义 |
| 物理表 | `process_def` |
| 数据库 schema | `udm` |
| 所属应用 | `SDDM` |
| 直连字段 | 39 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 39 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppName` | `cAppName` | `cAppName` | 会籍名称 |
| `cBizObjectType` | `cBizObjectType` | `cBizObjectType` | 业务对象类型(custm:客户 member:会员 fans:粉丝) |
| `litimg` | `litimg` | `litimg` | 图片路径 |
| `oneTimeProcessStatus` | `oneTimeProcessStatus` | `oneTimeProcessStatus` | oneTimeProcessStatus |
| `processDes` | `processDes` | `processDes` | 流程说明 |
| `processGroupName` | `processGroupName` | `processGroupName` | 流程分组 |
| `processLabelName` | `processLabelName` | `processLabelName` | 流程标签 |
| `processName` | `processName` | `processName` | 流程名称 |
| `processStatus` | `processStatus` | `processStatus` | 流程状态(def|waiting|runing|pause|over) |
| `roundType` | `roundType` | `roundType` | roundType |
| `round_type` | `round_type` | `round_type` | 轮次类型（年，月，天，时） |
| `version` | `version` | `version` | 版本 |
| `ytenant_id` | `ytenant_id` | `ytenant_id` | 租户ID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍APPId |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `createTime` | `createTime` | `createTime` | 创建时间 |
| `end_time` | `end_time` | `end_time` | 结束时间 |
| `lastUpdateTime` | `lastUpdateTime` | `lastUpdateTime` | 最近修改时间 |
| `real_end_time` | `real_end_time` | `real_end_time` | real_end_time |
| `real_start_time` | `real_start_time` | `real_start_time` | real_start_time |
| `start_time` | `start_time` | `start_time` | 开始时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `limitReenter` | `limitReenter` | `limitReenter` | 是否限制重复进入次数 |
| `reenter` | `reenter` | `reenter` | 是否允许重复进入(不允许0|允许1) |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iBizObjectType` | `iBizObjectType` | `iBizObjectType` | 业务对象类型(1:客户 2:会员 3:粉丝 4:粉丝+会员) |
| `reenterCount` | `reenterCount` | `reenterCount` | 单人重复进入总次数 |
| `roundNum` | `roundNum` | `roundNum` | roundNum |
| `round_day` | `round_day` | `round_day` | round_day |
| `round_hour` | `round_hour` | `round_hour` | round_hour |
| `round_minute` | `round_minute` | `round_minute` | round_minute |
| `round_month` | `round_month` | `round_month` | round_month |
| `round_sec` | `round_sec` | `round_sec` | round_sec |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `issys` | `issys` | `issys` | 是否系统定义(0否；1是) |
| `processType` | `processType` | `processType` | 流程类型(多波次0|单次1) |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `processGroupId` | `processGroupId` | `processGroupId` | 流程分组 |
| `processLabelId` | `processLabelId` | `processLabelId` | 流程标签 |
| `process_class` | `process_class` | `process_class` | 分类id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
