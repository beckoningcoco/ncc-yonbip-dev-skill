---
tags: [BIP, 元数据, 数据字典, st, st.batchno.Batchno]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 批次档案表 (`st.batchno.Batchno`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `batchno` | 应用: `DPMBTSN` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 批次档案表 |
| 物理表 | `batchno` |
| 应用 | `DPMBTSN` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `batchno` | `sBatchNo` | |

## 部署信息

- 部署时间: 2026-01-23 23:04:30:000
- 安装来源: `/app/scmbd/scmbd/scmbd-service/scripts/db/patch/mongodb/V5_R0_2507/0001_scmbd/0010_iuap_common/DML/0270_iuap_metadata/202511/202512111746_metadata_st-batchno_delta.zip`

## 术语标记

`isAssigned`, `isExtend`, `data_auth`, `isMultiCodeRule`, `MasterData`, `doc`, `billBatchUserdef`, `isHiddenHandChange`, `skipReferenceCheck`, `isUseCondition`

## 依赖接口（8 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IProduct (`IProduct`) | `scmbd.voucher.IProduct` | 6 | 2 |
| IProductSku (`IProductSku`) | `scmbd.voucher.IProductSku` | 6 | 1 |
| IBatch (`IBatch`) | `scmbd.voucher.IBatch` | 6 | 1 |
| IExp (`IExp`) | `scmbd.voucher.IExp` | 6 | 2 |
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

---

## 全部属性（72 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `warehouse` | warehouse | `iWarehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |  | true |
| 2 | `accountOrg` | accountOrg | `account_org` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | `quote` |  | true |
| 3 | `inInvoiceOrg` | nInvoiceOrg(ID) | `in_invoice_org` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | `quote` |  | true |
| 4 | `org` | org | `iOrgid` | c1135e08-c4bf-4499-90bf-67030d1f2654 | `quote` |  | true |
| 5 | `cbillNo` | billNo | `cbillNo` | String | `text` |  | true |
| 6 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | true |
| 7 | `factoryOrg` | actoryOrg(金额) | `factory_org` | c1135e08-c4bf-4499-90bf-67030d1f2654 | `quote` |  | true |
| 8 | `purchaseOrg` | purchaseOrg | `purchase_org` | 528ae807-a9d3-4f2a-9ee7-1db3e5eddc01 | `quote` |  | true |
| 9 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |  | true |
| 10 | `product` | product | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 | `quote` |  | true |
| 11 | `productsku` | productsku | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f | `quote` |  | true |
| 12 | `batchno` | batchno | `sBatchNo` | String | `text` |  | true |
| 13 | `producedate` | producedate | `dProduceDate` | Date | `date` |  | true |
| 14 | `invaliddate` | nvaliddate(ID) | `dInvalidDate` | Date | `date` |  | true |
| 15 | `stopstatus` | stopstatus | `stopstatus` | Integer | `int` |  | true |
| 16 | `define1` | efine1(日期) | `define1` | String | `text` | false | true |
| 17 | `define2` | efine2(日期) | `define2` | String | `text` | false | true |
| 18 | `define3` | efine3(日期) | `define3` | String | `text` | false | true |
| 19 | `define4` | efine4(日期) | `define4` | String | `text` | false | true |
| 20 | `define5` | efine5(日期) | `define5` | String | `text` | false | true |
| 21 | `define6` | efine6(日期) | `define6` | String | `text` | false | true |
| 22 | `define7` | efine7(日期) | `define7` | String | `text` | false | true |
| 23 | `define8` | efine8(日期) | `define8` | String | `text` | false | true |
| 24 | `define9` | efine9(日期) | `define9` | String | `text` | false | true |
| 25 | `define10` | efine10(日期) | `define10` | String | `text` | false | true |
| 26 | `define11` | efine11(日期) | `define11` | String | `text` | false | true |
| 27 | `define12` | efine12(日期) | `define12` | String | `text` | false | true |
| 28 | `define13` | efine13(日期) | `define13` | String | `text` | false | true |
| 29 | `define14` | efine14(日期) | `define14` | String | `text` | false | true |
| 30 | `define15` | efine15(日期) | `define15` | String | `text` | false | true |
| 31 | `define16` | efine16(日期) | `define16` | String | `text` | false | true |
| 32 | `define17` | efine17(日期) | `define17` | String | `text` | false | true |
| 33 | `define18` | efine18(日期) | `define18` | String | `text` | false | true |
| 34 | `define19` | efine19(日期) | `define19` | String | `text` | false | true |
| 35 | `define20` | efine20(日期) | `define20` | String | `text` | false | true |
| 36 | `define21` | efine21(日期) | `define21` | String | `text` | false | true |
| 37 | `define22` | efine22(日期) | `define22` | String | `text` | false | true |
| 38 | `define23` | efine23(日期) | `define23` | String | `text` | false | true |
| 39 | `define24` | efine24(日期) | `define24` | String | `text` | false | true |
| 40 | `define25` | efine25(日期) | `define25` | String | `text` | false | true |
| 41 | `define26` | efine26(日期) | `define26` | String | `text` | false | true |
| 42 | `define27` | efine27(日期) | `define27` | String | `text` | false | true |
| 43 | `define28` | efine28(日期) | `define28` | String | `text` | false | true |
| 44 | `define29` | efine29(日期) | `define29` | String | `text` | false | true |
| 45 | `define30` | efine30(日期) | `define30` | String | `text` | false | true |
| 46 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 47 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 48 | `createTime` | 创建时间 | `createTime` | DateTime | `timestamp` |  | true |
| 49 | `firstStoredDate` | firstStoredDate(日期) | `dfirststoreddate` | Date | `date` |  | true |
| 50 | `batchnoCharacteristic` | batchnoCharacteristic | `batchno_characteristic` | 7dc80f23-4436-45a1-af01-903c55a983d0 | `FreeCT` |  | true |
| 51 | `cBillnum` | Billnum | `cBillnum` | String | `text` |  | true |
| 52 | `cbillName` | cbill名称 | `cbillName` | String | `text` |  | true |
| 53 | `cbillid` | billid | `cbillid` | Long | `long` |  | true |
| 54 | `cnewBillNo` | newBillNo | `cnewBillNo` | String | `text` |  | true |
| 55 | `coldBillName` | coldBill名称 | `coldBillName` | String | `text` |  | true |
| 56 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 57 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 58 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 59 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 60 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 61 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 62 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 63 | `oldBillid` | oldBillid | `oldBillid` | Long | `long` |  | true |
| 64 | `oldBillnum` | oldBillnum | `oldBillnum` | String | `text` |  | true |
| 65 | `oldServiceCode` | oldService编码 | `oldServiceCode` | String | `text` |  | true |
| 66 | `productAuth` | 产品权限 | `iProductid` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | `quote` |  | true |
| 67 | `productn` | productn | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true |
| 68 | `productskun` | productskun | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | true |
| 69 | `serviceCode` | service编码 | `serviceCode` | String | `text` |  | true |
| 70 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 71 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 72 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（17 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `product` | product | `pc.aa.Product` | `iProductid` | 外键 |  |  | Service | true |
| 2 | `org` | org | `aa.baseorg.InventoryOrgMV` | `iOrgid` | 外键 |  |  | Service |  |
| 3 | `productskun` | productskun | `pc.product.ProductSKU` | `iProductSkuid` | 外键 |  |  | Service |  |
| 4 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 5 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 6 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 7 | `accountOrg` | accountOrg | `aa.baseorg.FinanceOrgMV` | `account_org` | 外键 |  |  | Service |  |
| 8 | `warehouse` | warehouse | `aa.warehouse.Warehouse` | `iWarehouseId` | 外键 |  |  | Service |  |
| 9 | `productsku` | productsku | `pc.aa.ProductSKU` | `iProductSkuid` | 外键 |  |  | Service | true |
| 10 | `inInvoiceOrg` | nInvoiceOrg(ID) | `aa.baseorg.FinanceOrgMV` | `in_invoice_org` | 外键 |  |  | Service |  |
| 11 | `productn` | productn | `pc.product.Product` | `iProductid` | 外键 |  |  | Service |  |
| 12 | `vendor` | vendor | `aa.vendor.Vendor` | `iVendorId` | 外键 |  |  | Service |  |
| 13 | `productAuth` | 产品权限 | `pb.dataauth.ProductDataAuth` | `iProductid` | 外键 |  |  | None |  |
| 14 | `factoryOrg` | actoryOrg(金额) | `aa.baseorg.InventoryOrgMV` | `factory_org` | 外键 |  |  | Service |  |
| 15 | `batchnoCharacteristic` | batchnoCharacteristic | `st.batchno.BatchnoCharacteristics` | `batchno_characteristic` | 外键 |  |  | None |  |
| 16 | `purchaseOrg` | purchaseOrg | `aa.baseorg.PurchaseOrgMV` | `purchase_org` | 外键 |  |  | Service |  |
| 17 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT iWarehouseId, account_org, in_invoice_org, iOrgid, cbillNo, iVendorId, factory_org, purchase_org
FROM batchno
```