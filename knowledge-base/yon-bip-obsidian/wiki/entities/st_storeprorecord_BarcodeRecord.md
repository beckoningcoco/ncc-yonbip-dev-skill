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

# 扫描 (st.storeprorecord.BarcodeRecord)

> Platform: BIP V5 | Module: st | Table: st_barcode_detail_back | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 扫描 |
| uri | st.storeprorecord.BarcodeRecord |
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

## All Fields (36)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | barcode | 条码 | barcode | text | String |  |  | nullable |
| 2 | batchno | 批次号 | batchno | text | String |  |  | nullable |
| 3 | batchnoId | 批次 | batchno_id | quote | st.batchno.Batchno |  |  | data_auth,nullable |
| 4 | boxCode | 箱码 | box_code | text | String |  |  | nullable |
| 5 | code | 单号 | code | text | String |  |  | nullable |
| 6 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 7 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  |  |
| 8 | invaliddate | 失效日期 | dInvalidDate | date | Date |  |  | nullable |
| 9 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable |
| 10 | org | 组织 | org | quote | aa.baseorg.OrgMV |  |  | data_auth,nullable |
| 11 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 12 | product | 物料 | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable |
| 13 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | data_auth,nullable |
| 14 | productsku | 物料SKU | iProductSkuid | quote | pc.aa.ProductSKU |  |  | data_auth,nullable |
| 15 | productskun | SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | data_auth,nullable |
| 16 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 17 | qty | 主计量数量 | qty | number | Decimal |  |  |  |
| 18 | scanTime | 扫描时间 | scan_time | timestamp | Timestamp |  |  | nullable |
| 19 | scanType | 扫描类型 | scan_type | - | st.barcode.ScanTypeEnum |  |  | data_auth,nullable |
| 20 | scanUser | 扫描用户 | scan_user | text | String |  |  | nullable |
| 21 | scanUserId | 扫描用户 | scan_user_id | quote | base.user.User |  |  | data_auth,nullable |
| 22 | snCode | 序列号 | sn_code | text | String |  |  | nullable |
| 23 | source | 上游单据类型 | source | text | String |  |  | nullable |
| 24 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 25 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 26 | stockUnit | 库存单位 | stock_unit | quote | pc.unit.Unit |  |  | data_auth,nullable |
| 27 | subQty | 副计量数量 | subQty | number | Decimal |  |  |  |
| 28 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 29 | unit | 主计量 | unit | quote | pc.unit.Unit |  |  | data_auth,nullable |
| 30 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 31 | vouchDetailId | 单据行id | vouch_detail_id | quote | st.storeprorecord.StoreProRecords |  |  | nullable |
| 32 | vouchId | 单据id | vouch_id | quote | st.storeprorecord.StoreProRecord |  |  | nullable |
| 33 | vouchType | 单据  | vouch_type | text | String |  |  | nullable |
| 34 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | nullable |
| 35 | warehouse | 仓库 | warehouse | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 36 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (14)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | batchnoId | 批次 | batchno_id | st.batchno.Batchno |
| 2 | org | 组织 | org | aa.baseorg.OrgMV |
| 3 | product | 物料 | iProductid | pc.aa.Product |
| 4 | productn | 物料 | iProductid | pc.product.Product |
| 5 | productsku | 物料SKU | iProductSkuid | pc.aa.ProductSKU |
| 6 | productskun | SKUID | iProductSkuid | pc.product.ProductSKU |
| 7 | scanUserId | 扫描用户 | scan_user_id | base.user.User |
| 8 | stockUnit | 库存单位 | stock_unit | pc.unit.Unit |
| 9 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 10 | unit | 主计量 | unit | pc.unit.Unit |
| 11 | vouchDetailId | 单据行id | vouch_detail_id | st.storeprorecord.StoreProRecords |
| 12 | vouchId | 单据id | vouch_id | st.storeprorecord.StoreProRecord |
| 13 | warehouse | 仓库 | warehouse | aa.warehouse.Warehouse |
| 14 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | invExchRate | 换算率 | invExchRate | number |
| 2 | qty | 主计量数量 | qty | number |
| 3 | subQty | 副计量数量 | subQty | number |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | invaliddate | 失效日期 | dInvalidDate | date |
| 2 | producedate | 生产日期 | dProduceDate | date |
| 3 | vouchdate | 单据日期 | vouchdate | date |
