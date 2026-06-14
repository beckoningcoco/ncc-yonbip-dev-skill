---
tags: [BIP, 元数据, 数据字典, RCP.ctp_rcp_riskindicator.ctp_rcp_riskindicator]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 风险指标 (`RCP.ctp_rcp_riskindicator.ctp_rcp_riskindicator`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcp_riskindicator` | domain：`yonbip-mid-sscia` | 应用：`RCP` | 业务对象ID：`cbfecded-5884-408e-89d2-65bc9859c673`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 风险指标 |
| 物理表 | `rcp_riskindicator` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `RCP` |
| 直连字段 | 37 个 |
| 子表 | 3 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ctp_rcp_riskindicatoritemsList` | `RCP.ctp_rcp_riskindicator.ctp_rcp_riskindicatoritems` | composition |
| `ctp_rcp_riskindicatorconditionsList` | `RCP.ctp_rcp_riskindicator.ctp_rcp_riskindicatorconditions` | composition |
| `ctp_rcp_riskindicatordetailList` | `RCP.ctp_rcp_riskindicator.ctp_rcp_riskindicatordetail` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `indicator_type` | `yonbip-ec-contract.RefTable_deba013a13` |
| `ytenant_id` | `` |
| `character_define` | `` |

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 原子服务编码 |
| `code` | `code` | `code` | 编码 |
| `indicator_desc` | `indicator_desc` | `indicatorDesc` | 指标描述 |
| `semanticmodel_id` | `semanticmodel_id` | `semanticmodelId` | 语义模型 |
| `indicatorlib_id` | `indicatorlib_id` | `indicatorlibId` | 指标库指标 |
| `taxextindicator_id` | `taxextindicator_id` | `taxextindicatorId` | 税务扩展指标 |
| `data_field` | `data_field` | `dataField` | 取数项 |
| `data_item_name` | `data_item_name` | `dataItemName` | 取数项名称 |
| `indicator_def_formula` | `indicator_def_formula` | `indicatorDefFormula` | 组合指标展示公式 |
| `project_code` | `project_code` | `projectCode` | 项目编码 |
| `dws_id` | `dws_id` | `dwsId` | 汇总模型ID |
| `id` | `id` | `id` | 主键 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `indicator_type` | `indicator_type` | `indicatorType` | 指标类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `indicator_properties` | `indicator_properties` | `indicatorProperties` | 指标性质 |
| `sys_flag` | `sys_flag` | `sysFlag` | 是否预置 |
| `data_source_type` | `data_source_type` | `dataSourceType` | 数据源类型 |
| `aggregation_method` | `aggregation_method` | `aggregationMethod` | 聚合方式 |
| `op` | `op` | `op` | 取数条件组合条件 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `indicator_cal_formula` | `indicator_cal_formula` | `indicatorCalFormula` | 组合指标计算公式 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `character_define` | `character_define` | `characterDefine` | 特征 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ctp_rcp_riskindicatorconditionsList` | 指标取数条件 |
| `` | `` | `ctp_rcp_riskindicatordetailList` | 风险组合指标明细 |
| `` | `` | `ctp_rcp_riskindicatoritemsList` | 指标明细列表项 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
