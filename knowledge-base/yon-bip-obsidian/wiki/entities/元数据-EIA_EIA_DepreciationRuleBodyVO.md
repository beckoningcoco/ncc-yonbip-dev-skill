---
tags: [BIP, 元数据, 数据字典, EIA.EIA.DepreciationRuleBodyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计提方案子表 (`EIA.EIA.DepreciationRuleBodyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_depreciation_rule_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`47f78086-1309-4f81-bda6-94a32b36886d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计提方案子表 |
| 物理表 | `ia_depreciation_rule_b` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `depreciation_vo_id` | `yonbip-fi-eia.RefTable_fdbb785d33` |

## 继承接口 (5个, 19字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bizflow_instance_id` | `bizflow_instance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflow_name` | `bizflow_name` | `bizflowName` | 流程名称 |
| `drawing_ratio_name` | `drawing_ratio_name` | `drawingRatioName` | 计提比例列名称 |
| `drawing_section_name` | `drawing_section_name` | `drawingSectionName` | 计提范围列名称 |
| `first_biz_obj` | `first_biz_obj` | `firstBusiObj` | 来源业务对象 |
| `first_b_id` | `first_b_id` | `firstChildId` | 来源单据子表id |
| `first_code` | `first_code` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `src_biz_obj` | `src_biz_obj` | `sourceBusiObj` | 上游业务对象 |
| `src_b_id` | `src_b_id` | `sourceChildId` | 上游单据子表id |
| `src_code` | `src_code` | `sourceCode` | 上游单据号 |
| `src_g_id` | `src_g_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `depreciation_vo_id` | `depreciation_vo_id` | `DepreciationRuleVO_id` | 计提方案 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `drawing_order_no` | `drawing_order_no` | `drawingOrderNo` | 计提比例顺序 |
| `drawing_ratio` | `drawing_ratio` | `drawingRatio` | 计提比例 |
| `drawing_section_from` | `drawing_section_from` | `drawingSectionFrom` | 计提区间起始 |
| `drawing_section_to` | `drawing_section_to` | `drawingSectionTo` | 计提区间结束 |
| `drawing_type` | `drawing_type` | `drawingType` | 计提类型 |
