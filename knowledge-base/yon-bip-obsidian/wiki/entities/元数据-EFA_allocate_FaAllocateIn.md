---
tags: [BIP, 元数据, 数据字典, EFA.allocate.FaAllocateIn]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产调入 (`EFA.allocate.FaAllocateIn`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_allocate_in` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`f110b003-9df9-45e8-b3ed-621aad532394`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产调入 |
| 物理表 | `fa_bill_allocate_in` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 52 个 |
| 子表 | 2 个 |
| 关联引用 | 14 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FaAllocateInDtlList` | `EFA.allocate.FaAllocateInDtl` | composition |
| `FaBillAllocateInAssetList` | `EFA.allocate.FaBillAllocateInAsset` | composition |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `allocate_out_asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `in_accentity_id` | `finbd.bd_allaccbodyref` |
| `` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `add_way_id` | `yonbip-fi-efa.at_addwayref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |
| `out_accentity_id` | `finbd.bd_allaccbodyref` |

## 继承接口 (7个, 25字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
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

> 共 52 个直连字段

### 文本字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocate_in_addition_id` | `allocate_in_addition_id` | `allocateInAdditionId` | 调入生单新增单id |
| `allocate_in_asset_id` | `allocate_in_asset_id` | `allocateInAssetId` | 调入生单卡片ID |
| `allocate_out_id` | `allocate_out_id` | `allocateOutId` | 调出单ID |
| `allocate_price_type` | `allocate_price_type` | `allocatePriceType` | 调拨价格 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `code` | `code` | `code` | 编码 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `ori_app_id` | `ori_app_id` | `oriAppId` | 源头应用ID |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_trade_type_id` | `ori_bill_trade_type_id` | `oriBillTradeTypeId` | 源头交易类型 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillTypeId` | 源头单据类型ID |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `remarks` | `remarks` | `remarks` | 备注 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `bill_date` | `bill_date` | `vouchdate` | 单据日期 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `add_way_id` | `add_way_id` | `addWayId` | 增加方式 |
| `allocate_out_asset_id` | `allocate_out_asset_id` | `allocateOutAssetId` | 原固定资产ID |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bill_trade_type_id` | `bill_trade_type_id` | `billTradeTypeId` | 交易类型 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `in_accentity_id` | `in_accentity_id` | `inAccentityId` | 调入会计主体ID |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `out_accentity_id` | `out_accentity_id` | `outAccentityId` | 调出会计主体ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_allocate_in` | `bln_allocate_in` | `blnAllocateIn` | 固定资产调入生成方式 |
| `bln_confirm_allocate` | `bln_confirm_allocate` | `blnConfirmAllocate` | 是否确认调入 |
| `bln_enable` | `bln_enable` | `blnEnable` | 调入单是否生效 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tpl_id` | `tpl_id` | `tplId` | 模板ID |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FaAllocateInDtlList` | 固定资产调入单明细 |
| `` | `` | `FaBillAllocateInAssetList` | 调入固定资产信息 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征id |
