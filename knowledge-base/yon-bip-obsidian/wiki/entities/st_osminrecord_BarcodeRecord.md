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

# 扫描 (st.osminrecord.BarcodeRecord)

> Platform: BIP V5 | Module: st | Table: st_barcode_detail_back | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 扫描 |
| uri | st.osminrecord.BarcodeRecord |
| tableName | st_barcode_detail_back |
| domain | ustock |
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
| 1 | id | id | id | long | Long |  |  | nullable,REF.ID |
| 2 | vouchDetailId | 单据行id | vouch_detail_id | quote | st.osminrecord.OsmInRecords |  |  | nullable |
| 3 | code | 单据编码 | code | text | String |  |  | nullable |
| 4 | vouchId | 单据id | vouch_id | quote | st.osminrecord.OsmInRecord |  |  | nullable |
| 5 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 6 | vouchdate | 单据日期 | vouchdate | date | Date |  |  | nullable |
| 7 | batchnoId | 批次 | batchno_id | quote | st.batchno.Batchno |  |  | data_auth,nullable |
| 8 | warehouse | 仓库 | warehouse | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 9 | org | 组织 | org | quote | aa.baseorg.OrgMV |  |  | data_auth,nullable |
| 10 | scanTime | 扫描时间 | scan_time | timestamp | Timestamp |  |  | nullable |
| 11 | scanUserId | 扫描用户 | scan_user_id | quote | base.user.User |  |  | data_auth,nullable |
| 12 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 13 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 14 | source | 上游单据类型 | source | text | String |  |  | nullable |
| 15 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 16 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable |
| 17 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | data_auth,nullable |
| 18 | productskun | SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | data_auth,nullable |
| 19 | boxCode | 箱码 | box_code | text | String |  |  | nullable |
| 20 | vouchType | 单据  | vouch_type | text | String |  |  | nullable |
| 21 | scanUser | 扫描用户 | scan_user | text | String |  |  | nullable |
| 22 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 23 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 24 | invaliddate | 失效日期 | dInvalidDate | date | Date |  |  | nullable |
| 25 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  |  |
| 26 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 27 | product | 物料 | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable |
| 28 | barcode | 条码 | barcode | text | String |  |  | nullable |
| 29 | snCode | 序列号 | sn_code | text | String |  |  | nullable |
| 30 | scanType | 扫描类型 | scan_type | - | st.barcode.ScanTypeEnum |  |  | data_auth,nullable |
| 31 | productsku | SKU | iProductSkuid | quote | pc.aa.ProductSKU |  |  | data_auth,nullable |
| 32 | qty | 数量 | qty | number | Decimal |  |  |  |
| 33 | unit | 主计量 | unit | quote | pc.unit.Unit |  |  | data_auth,nullable |
| 34 | subQty | 件数 | subQty | number | Decimal |  |  |  |
| 35 | stockUnit | 库存单位 | stock_unit | quote | pc.unit.Unit |  |  | data_auth,nullable |
| 36 | batchno | 批次号 | batchno | text | String |  |  | nullable |
| 37 | barcodeItem | 条码自定义项 | - | - | st.osminrecord.BarcodeRecordDefine |  |  |  |

---

## Reference Fields (14)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | vouchDetailId | 单据行id | vouch_detail_id | st.osminrecord.OsmInRecords |
| 2 | vouchId | 单据id | vouch_id | st.osminrecord.OsmInRecord |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 4 | batchnoId | 批次 | batchno_id | st.batchno.Batchno |
| 5 | warehouse | 仓库 | warehouse | aa.warehouse.Warehouse |
| 6 | org | 组织 | org | aa.baseorg.OrgMV |
| 7 | scanUserId | 扫描用户 | scan_user_id | base.user.User |
| 8 | productn | 物料 | iProductid | pc.product.Product |
| 9 | productskun | SKUID | iProductSkuid | pc.product.ProductSKU |
| 10 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 11 | product | 物料 | iProductid | pc.aa.Product |
| 12 | productsku | SKU | iProductSkuid | pc.aa.ProductSKU |
| 13 | unit | 主计量 | unit | pc.unit.Unit |
| 14 | stockUnit | 库存单位 | stock_unit | pc.unit.Unit |

---

## Number Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | invExchRate | 换算率 | invExchRate | number |
| 2 | qty | 数量 | qty | number |
| 3 | subQty | 件数 | subQty | number |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | vouchdate | 单据日期 | vouchdate | date |
| 2 | producedate | 生产日期 | dProduceDate | date |
| 3 | invaliddate | 失效日期 | dInvalidDate | date |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | barcodeItem | 条码自定义项 | st.osminrecord.BarcodeRecordDefine |
