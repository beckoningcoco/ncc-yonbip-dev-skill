---
tags: [BIP, 元数据, 数据字典, st.salesout.SalesoutBarcodeRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 出库单扫描 (`st.salesout.SalesoutBarcodeRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`st_barcode_detail_back` | domain：`ustock` | 应用：`ST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 出库单扫描 |
| 物理表 | `st_barcode_detail_back` |
| 数据库 schema | `ustock` |
| 所属应用 | `ST` |
| 直连字段 | 37 个 |
| 关联引用 | 14 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `barcodeItem` | `st.salesout.BarcodeRecordDefine` | composition |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `batchno_id` | `` |
| `iProductid` | `productcenter.productref` |
| `ytenant_id` | `` |
| `org` | `` |
| `iProductSkuid` | `` |
| `scan_user_id` | `` |
| `` | `` |
| `warehouse` | `` |
| `stock_unit` | `` |
| `unit` | `` |
| `vouch_id` | `` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 单据编码 |
| `source` | `source` | String | 上游单据类型 |
| `upcode` | `upcode` | String | 上游单据号 |
| `makerule_code` | `makerule_code` | String | 生单规则编号 |
| `vouch_type` | `vouch_type` | String | 单据  |
| `scan_user` | `scan_user` | String | 扫描用户 |
| `box_code` | `box_code` | String | 箱码 |
| `barcode` | `barcode` | String | 条码 |
| `sn_code` | `sn_code` | String | 序列号 |
| `batchno` | `batchno` | String | 批次号 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `org` | `org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | 组织id |
| `vouch_id` | `vouch_id` | 09b66409-4f08-4dc6-957b-3d5ac15e1ea8 | 单据id |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `batchno_id` | `batchno_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 | 批次 |
| `warehouse` | `warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 仓库 |
| `scan_user_id` | `scan_user_id` | 54800425-15da-4742-ae89-059d05e77c9b | 扫描用户 |
| `iProductid` | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | 物料 |
| `iProductSkuid` | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | SKUID |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `iProductid` | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 | 物料 |
| `iProductSkuid` | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f | SKU |
| `unit` | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 主计量 |
| `stock_unit` | `stock_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 库存单位 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `vouchdate` | `vouchdate` | Date | 单据日期 |
| `dProduceDate` | `dProduceDate` | Date | 生产日期 |
| `dInvalidDate` | `dInvalidDate` | Date | 失效日期 |

### 长整数 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | id |
| `vouch_detail_id` | `vouch_detail_id` | Long | 单据行id |
| `sourceid` | `sourceid` | Long | 上游单据主表id |
| `sourceautoid` | `sourceautoid` | Long | 上游单据子表id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `invExchRate` | Decimal | 换算率 |
| `` | `qty` | Decimal | 数量 |
| `` | `subQty` | Decimal | 件数 |

### timestamp (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `scan_time` | `scan_time` | DateTime | 扫描时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `scan_type` | `scan_type` | ScanTypeEnum | 扫描类型 |
| `` | `` | 4adcdc38-8e97-4178-91d6-aa9b2087bbdc | 条码自定义项 |
