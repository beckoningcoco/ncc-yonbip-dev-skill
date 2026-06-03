---
tags: [BIP, 元数据, 数据字典, st.batchno.Batchno]
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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`batchno` | domain：`yonbip-scm-scmbd` | 应用：`DPMBTSN` | 业务对象ID：`35e94e7f-031c-4fa5-9ecf-da496e096350`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 批次档案表 |
| 物理表 | `batchno` |
| 数据库 schema | `yonbip-scm-scmbd` |
| 所属应用 | `DPMBTSN` |
| 直连字段 | 72 个 |
| 子表 | 0 个 |
| 关联引用 | 17 个 |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `iProductid` | `` |
| `iOrgid` | `` |
| `iProductSkuid` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `account_org` | `` |
| `iWarehouseId` | `` |
| `in_invoice_org` | `` |
| `iVendorId` | `` |
| `factory_org` | `` |
| `batchno_characteristic` | `` |
| `purchase_org` | `` |
| `tenant_id` | `` |

## 继承接口 (8个, 18字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **商品相关** (`scmbd.voucher.IProduct`)
  - `iProductid` → `iProductid`
  - `iProductid` → `iProductid`
- **商品sku相关** (`scmbd.voucher.IProductSku`)
  - `iProductSkuid` → `iProductSkuid`
- **批次相关** (`scmbd.voucher.IBatch`)
  - `sBatchNo` → `sBatchNo`
- **效期相关** (`scmbd.voucher.IExp`)
  - `dInvalidDate` → `dInvalidDate`
  - `dProduceDate` → `dProduceDate`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 72 个直连字段

### 文本字段 (41个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cbillNo` | `cbillNo` | `cbillNo` | 单据编号 |
| `sBatchNo` | `sBatchNo` | `batchno` | 批次号 |
| `` | `define1` | `define1` | q111 |
| `` | `define2` | `define2` | 批次属性2 |
| `` | `define3` | `define3` | 批次属性3 |
| `` | `define4` | `define4` | 批次属性4 |
| `` | `define5` | `define5` | 批次属性5 |
| `` | `define6` | `define6` | 批次属性6 |
| `` | `define7` | `define7` | 批次属性7 |
| `` | `define8` | `define8` | 批次属性8 |
| `` | `define9` | `define9` | 批次属性9 |
| `` | `define10` | `define10` | 批次属性10 |
| `` | `define11` | `define11` | 批次属性11 |
| `` | `define12` | `define12` | 批次属性12 |
| `` | `define13` | `define13` | 批次属性13 |
| `` | `define14` | `define14` | 批次属性14 |
| `` | `define15` | `define15` | 批次属性15 |
| `` | `define16` | `define16` | 批次属性16 |
| `` | `define17` | `define17` | 批次属性17 |
| `` | `define18` | `define18` | 批次属性18 |
| `` | `define19` | `define19` | 批次属性19 |
| `` | `define20` | `define20` | 批次属性20 |
| `` | `define21` | `define21` | 批次属性21 |
| `` | `define22` | `define22` | 批次属性22 |
| `` | `define23` | `define23` | 批次属性23 |
| `` | `define24` | `define24` | 批次属性24 |
| `` | `define25` | `define25` | 批次属性25 |
| `` | `define26` | `define26` | 批次属性26 |
| `` | `define27` | `define27` | 批次属性27 |
| `` | `define28` | `define28` | 批次属性28 |
| `` | `define29` | `define29` | 批次属性29 |
| `` | `define30` | `define30` | 批次属性30 |
| `cBillnum` | `cBillnum` | `cBillnum` | 来源单据编码 |
| `cbillName` | `cbillName` | `cbillName` | 来源单据类型 |
| `cnewBillNo` | `cnewBillNo` | `cnewBillNo` | 单据编号 |
| `coldBillName` | `coldBillName` | `coldBillName` | 首次单据类型 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `oldBillnum` | `oldBillnum` | `oldBillnum` | 首次单据编码 |
| `oldServiceCode` | `oldServiceCode` | `oldServiceCode` | 首次服务编码 |
| `serviceCode` | `serviceCode` | `serviceCode` | 来源服务编码 |

### 引用字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iWarehouseId` | `iWarehouseId` | `warehouse` | 仓库 |
| `account_org` | `account_org` | `accountOrg` | 会计主体 |
| `in_invoice_org` | `in_invoice_org` | `inInvoiceOrg` | 收票组织 |
| `iOrgid` | `iOrgid` | `org` | 库存组织 |
| `iVendorId` | `iVendorId` | `vendor` | 供应商 |
| `factory_org` | `factory_org` | `factoryOrg` | 完工组织 |
| `purchase_org` | `purchase_org` | `purchaseOrg` | 采购组织 |
| `iProductid` | `iProductid` | `product` | 商品id |
| `iProductSkuid` | `iProductSkuid` | `productsku` | skuid |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `iProductid` | `iProductid` | `productAuth` | 物料权限 |
| `iProductid` | `iProductid` | `productn` | 物料 |
| `iProductSkuid` | `iProductSkuid` | `productskun` | SKUID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |
| `dProduceDate` | `dProduceDate` | `producedate` | 生产日期 |
| `dInvalidDate` | `dInvalidDate` | `invaliddate` | 有效期至 |
| `dfirststoreddate` | `dfirststoreddate` | `firstStoredDate` | 首次入库日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `cbillid` | `cbillid` | `cbillid` | 来源单据id |
| `oldBillid` | `oldBillid` | `oldBillid` | 首次来源单据id |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `createTime` | `createTime` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batchno_characteristic` | `batchno_characteristic` | `batchnoCharacteristic` | 批次敏感域自定义项实体 |
