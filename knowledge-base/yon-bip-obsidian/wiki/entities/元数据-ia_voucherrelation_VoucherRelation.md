---
tags: [BIP, 元数据, 数据字典, ia.voucherrelation.VoucherRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务对象关系 (`ia.voucherrelation.VoucherRelation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ssc_ia_voucher_relation` | domain：`yonbip-mid-sscia` | 应用：`ZNSH` | 业务对象ID：`9b28506c-b965-45c7-ad1e-a777392389c4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务对象关系 |
| 物理表 | `ssc_ia_voucher_relation` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `ZNSH` |
| 直连字段 | 28 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `voucherConstraints` | `ia.voucherrelation.VoucherConstraint` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `target_bill_type` | `bd_billtyperef` |
| `target_trans_type_id` | `bd_transtyperef` |
| `ytenant_id` | `` |
| `` | `` |
| `source_trans_type_id` | `bd_transtyperef` |
| `source_bill_type` | `bd_billtyperef` |

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 关系编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `source_business_obj` | `source_business_obj` | `sourceBusinessObj` | 源业务对象 |
| `source_business_obj_displayName` | `source_business_obj_displayName` | `sourceBusinessObjDisplayName` | 源业务对象名称 |
| `target_business_obj` | `target_business_obj` | `targetBusinessObj` | 目标单据业务对象编码 |
| `target_business_obj_displayName` | `target_business_obj_displayName` | `targetBusinessObjDisplayName` | 目标单据业务对象名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_bill_type` | `source_bill_type` | `sourceBillType` | 源单单据类型id |
| `source_trans_type_id` | `source_trans_type_id` | `sourceTransType` | 源单交易类型id |
| `target_bill_type` | `target_bill_type` | `targetBillType` | 关联单据类型id |
| `target_trans_type_id` | `target_trans_type_id` | `targetTransType` | 关联交易类型id |
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
| `pubts` | `pubts` | `pubts` | 最后更新时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `preset_tag` | `preset_tag` | `presetTag` | 是否预置 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `relation_type` | `relation_type` | `relationType` | 关系类型 |
| `status` | `status` | `status` | 状态 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 关系名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `voucherConstraints` | 单据约束 |
