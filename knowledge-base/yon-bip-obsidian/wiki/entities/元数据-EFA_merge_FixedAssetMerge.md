---
tags: [BIP, 元数据, 数据字典, EFA.merge.FixedAssetMerge]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产合并 (`EFA.merge.FixedAssetMerge`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_merge` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`afefa915-7e8e-4281-b822-4de51cd16ddc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产合并 |
| 物理表 | `fa_bill_merge` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 50 个 |
| 子表 | 2 个 |
| 关联引用 | 14 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FixedAssetMergeDtlAssetList` | `EFA.merge.FixedAssetMergeDtlAsset` | composition |
| `FixedAssetMergeDtlAccbookList` | `EFA.merge.FixedAssetMergeDtlAccbook` | composition |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `bill_trade_type_id` | `transtype.bd_billtyperef` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `add_way_id` | `yonbip-fi-efa.at_addwayref` |
| `reduce_way_id` | `finbd.bd_reducewayref` |
| `addition_id` | `yonbip-fi-efa.fa_add_bill_cal_ref` |
| `merge_asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `bill_type_id` | `transtype.bd_billtypetreeref` |

## 继承接口 (5个, 20字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
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

## 字段列表（按类型分组）

> 共 50 个直连字段

### 文本字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `busi_post_failure_reason` | `busi_post_failure_reason` | `busiPostFailureReason` | 业务过账失败原因 |
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
| `addition_id` | `addition_id` | `additionId` | 新增单id |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `bill_trade_type_id` | `bill_trade_type_id` | `billTradeTypeId` | 交易类型 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `merge_asset_id` | `merge_asset_id` | `mergeAssetId` | 合并生成固定资产 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `reduce_way_id` | `reduce_way_id` | `reduceWayId` | 减少方式 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_status` | `busi_post_status` | `busiPostStatus` | 业务过账过账状态 |
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merge_asset_num` | `merge_asset_num` | `mergeAssetNum` | 合并卡片数 |
| `merge_quantity` | `merge_quantity` | `mergeQuantity` | 合并后资产数量 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_post_version` | `busi_post_version` | `busiPostVersion` | 业务过账版本 |
| `tpl_id` | `tpl_id` | `tplId` | 模板ID |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FixedAssetMergeDtlAccbookList` | 固定资产合并账簿明细表 |
| `` | `` | `FixedAssetMergeDtlAssetList` | 固定资产合并卡片明细表 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |
