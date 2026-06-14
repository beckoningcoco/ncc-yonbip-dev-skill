---
tags: [BIP, 元数据, 数据字典, RVN.RVN.RclProjectCostScheduleCalculBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本进度信息子表 (`RVN.RVN.RclProjectCostScheduleCalculBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_projectcostschedule_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`7b46aff8-655f-47f6-8ff2-59a9e8421367`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本进度信息子表 |
| 物理表 | `rcl_projectcostschedule_b` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `RclProjectCostScheduleCalcHeader_id` | `` |

## 继承接口 (2个, 5字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 履约义务信息名称 |
| `project_scheduleInfo_body_id` | `project_scheduleInfo_body_id` | `projectScheduleInfoBodyId` | 项目进度单子表ID |
| `rcl_revenue_contract_base_info_id` | `rcl_revenue_contract_base_info_id` | `rclRevenueContractBaseInfoId` | 履约义务行ID |
| `rcl_revenue_contract_code` | `rcl_revenue_contract_code` | `rclRevenueContractCode` | 履约义务单据编号 |
| `rcl_revenue_contract_id` | `rcl_revenue_contract_id` | `rclRevenueContractId` | 履约义务信息ID |
| `row_no` | `row_no` | `rowNo` | 履约义务行号 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `RclProjectCostScheduleCalcHeader_id` | `RclProjectCostScheduleCalcHeader_id` | `RclProjectCostScheduleCalcHeader_id` | 成本进度信息主表 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `project_id` | `project_id` | `projectId` | 项目ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `local_mny` | `local_mny` | `localmny` | 履约义务金额 |
| `version` | `version` | `version` | 版本号 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `error_msg` | `error_msg` | `errorMsg` | 异常信息 |
