---
tags: [BIP, metadata, st, BarcodeRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调入单扫描 (st.storein.BarcodeRecord)

> Platform: BIP V5 | Module: st | Table: st_barcode_detail_back | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调入单扫描 |
| uri | st.storein.BarcodeRecord |
| tableName | st_barcode_detail_back |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.barcode.BarcodeRecordBase |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (37)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 单据编码 | code | text | String |  |  | nullable |
| 2 | boxCode | 箱码 | box_code | text | String |  |  | nullable |
| 3 | barcode | 条码 | barcode | text | String |  |  | nullable |
| 4 | snCode | 序列号 | sn_code | text | String |  |  | nullable |
| 5 | scanType | 扫描类型 | scan_type | - | st.barcode.ScanTypeEnum |  |  | data_auth,nullable |
| 6 | qty | 数量 | qty | number | Decimal |  |  |  |
| 7 | unit | 主计量 | unit | quote | pc.unit.Unit |  |  | data_auth,nullable |
| 8 | subQty | 件数 | subQty | number | Decimal |  |  |  |
| 9 | stockUnit | 库存单位 | stock_unit | quote | pc.unit.Unit |  |  | data_auth,nullable |
| 10 | batchno | 批次号 | batchno | text | String |  |  | nullable |
| 11 | barcodeItem | 条码自定义项 | - | - | st.storein.BarcodeRecordDefine |  |  |  |
| 12 | batchnoId | 批次 | batchno_id | quote | st.batchno.Batchno |  |  | data_auth,nullable |
| 13 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 14 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  |  |
| 15 | invaliddate | 失效日期 | dInvalidDate | date | Date |  |  | nullable |
| 16 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable |
| 17 | org | 组织 | org | quote | aa.baseorg.OrgMV |  |  | data_auth,nullable |
| 18 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 19 | product | 物料 | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable |
| 20 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | data_auth,nullable |
| 21 | productsku | 物料SKU | iProductSkuid | quote | pc.aa.ProductSKU |  |  | data_auth,nullable |
| 22 | productskun | SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | data_auth,nullable |
| 23 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 24 | scanTime | 扫描时间 | scan_time | timestamp | Timestamp |  |  | nullable |
| 25 | scanUser | 扫描用户 | scan_user | text | String |  |  | nullable |
| 26 | scanUserId | 扫描用户 | scan_user_id | quote | base.user.User |  |  | data_auth,nullable |
| 27 | source | 上游单据类型 | source | text | String |  |  | nullable |
| 28 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 29 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 30 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 31 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 32 | vouchDetailId | 单据行id | vouch_detail_id | quote | st.storein.StoreInDetail |  |  | nullable |
| 33 | vouchId | 单据id | vouch_id | quote | st.storein.StoreIn |  |  | nullable |
| 34 | vouchType | 单据  | vouch_type | text | String |  |  | nullable |
| 35 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | nullable |
| 36 | warehouse | 仓库 | warehouse | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 37 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (14)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | unit | 主计量 | unit | pc.unit.Unit |
| 2 | stockUnit | 库存单位 | stock_unit | pc.unit.Unit |
| 3 | batchnoId | 批次 | batchno_id | st.batchno.Batchno |
| 4 | org | 组织 | org | aa.baseorg.OrgMV |
| 5 | product | 物料 | iProductid | pc.aa.Product |
| 6 | productn | 物料 | iProductid | pc.product.Product |
| 7 | productsku | 物料SKU | iProductSkuid | pc.aa.ProductSKU |
| 8 | productskun | SKUID | iProductSkuid | pc.product.ProductSKU |
| 9 | scanUserId | 扫描用户 | scan_user_id | base.user.User |
| 10 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 11 | vouchDetailId | 单据行id | vouch_detail_id | st.storein.StoreInDetail |
| 12 | vouchId | 单据id | vouch_id | st.storein.StoreIn |
| 13 | warehouse | 仓库 | warehouse | aa.warehouse.Warehouse |
| 14 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | qty | 数量 | qty | number |
| 2 | subQty | 件数 | subQty | number |
| 3 | invExchRate | 换算率 | invExchRate | number |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | invaliddate | 失效日期 | dInvalidDate | date |
| 2 | producedate | 生产日期 | dProduceDate | date |
| 3 | vouchdate | 单据日期 | vouchdate | date |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | barcodeItem | 条码自定义项 | st.storein.BarcodeRecordDefine |
