---
tags: [BIP, 元数据, 数据字典, 销售出库单, ST, st.salesout.SalesOut]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售出库单主表 (`st.salesout.SalesOut`)

> **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 库存（ST）模块销售出库单的完整元数据字典。
> 来源：元数据API返回的 `st.salesout.SalesOut` 实体完整定义。
> 物理表：`st_salesout` | 业务对象ID：`cbe2abc1-6152-44d9-9404-e46ee92290df`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售出库单主表 |
| 描述 | 销售出库单主表 |
| 物理表 | `st_salesout` |
| 数据库 schema | `ustock` |
| 所属应用 | `ST` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 数据权限场景 | `bill_maintain` |
| 构建时间戳 | `1780450771571` |

## 部署信息

- **部署时间**: 2026-05-23 01:50:07:000
- **安装人**: mongoTools
- **安装来源**: `/app/newustock/src/yonbip-scm-scmf/scripts/db/patch/mongodb/V5_R0_2507/0002_stock/0010_iuap_common/DML/0270_iuap_metadata/202603/202602030921_metadata_st-salesout_delta.zip`

## 业务场景

- `econtract`
- `workflow`
- `DataAuth`
- `transtype`
- `cprk`
- `dataPrivacy`
- `userdefine`
- `classified`
- `FieldAuth`
- `print`
- `ShareServiceCenter`
- `UITemplate`
- `imextmp`
- `report`
- `billcode`
- `ruleengine`
- `msgtemplate`
- `api`
- `barcode`
- `bpm`

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 唯一标识 |

## 子表 (6个)

| 字段名 | URI | 关系 |
|--------|-----|------|
| `headDefine` | `st.salesout.SalesOutDefine` | composition (id) |
| `logisticsBills` | `st.salesout.SalesOutLogisticsBills` | composition (mainid) |
| `salesOutExtend` | `st.salesout.SalesOutExtend` | composition (id) |
| `barcodeRecord` | `st.salesout.SalesoutBarcodeRecord` | composition (vouchId) |
| `details` | `st.salesout.SalesOuts` | composition (mainid) |
| `headItem` | `st.salesout.SalesOutCustomItem` | composition (id) |

## 服务引用（关联引用，40个）

| 字段名 | 引用类型 |
|--------|---------|
| `invoice_org` | `aa_orgtree` |
| `contact_id` | `` |
| `` | `` |
| `salesOutDefineCharacter` | `` |
| `bizFlowId` | `ucf-staff-center.bf_businessFlow_ref` |
| `isalesorg` | `ucf-org-center.bd_salesorg` |
| `iOperatorId` | `ucf-staff-center.bd_staff_outer_ref` |
| `write_off_reason` | `productcenter.aa_reasonref` |
| `iNatCurrencyID` | `ucfbasedoc.bd_currencytenantref` |
| `iCustID` | `` |
| `iCurrencyID` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |
| `bdInvoiceTypeId` | `ucfbasedoc.bd_invoiceref` |
| `voucherType` | `` |
| `iOrgid` | `aa_orgstock` |
| `ytenant_id` | `` |
| `imerchant` | `productcenter.merchantRef` |
| `account_org` | `aa_orgtree` |
| `stock_mgr` | `ucf-staff-center.bd_staff_outer_ref` |
| `iStoreID` | `aa_store` |
| `iwarehouse` | `aa_warehouse` |
| `ibustypeid` | `transtype.bd_billtyperef` |
| `delivery_shop` | `` |
| `cExchangeRateTypeId` | `` |
| `invoice_cust` | `productcenter.merchantRef` |
| `logistics_network` | `dst.aa_expressref` |
| `iprewarehouse` | `` |
| `iLogisticId` | `productcenter.aa_deliverycorpcode` |

## 继承接口 (28个, 56个字段)

- **汇率信息** (`voucher.base.IExchangeRate`)
  - `iCurrencyID` → `iCurrencyID` (02b45339-eb4a-4a31-a8b5-d32f494f4e8e)
  - `` → `` (Real)
  - `exchRateOps` → `exchRateOps` (15bbb418-7aa7-420b-88d6-c03c89c05f39)
  - `iNatCurrencyID` → `iNatCurrencyID` (02b45339-eb4a-4a31-a8b5-d32f494f4e8e)
- **贸易路径Id接口** (`sccs.multitrade.ITradeRouteID`)
  - `` → `` (Short)
  - `throw_status` → `throw_status` (Integer)
  - `` → `` (c69f1d6a-783c-4f79-b446-b4da14cb7fff)
  - `` → `` (Real)
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date` (Date)
  - `` → `` (String)
  - `` → `` (54800425-15da-4742-ae89-059d05e77c9b)
  - `audit_time` → `audit_time` (Timestamp)
- **商家相关** (`base.itf.IShop`)
  - `iShopID` → `iShopID` (Long)
- **门店** (`retail.voucher.IRetailStore`)
  - `iStoreID` → `iStoreID` (16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3)
- **门店相关** (`retail.voucher.IRetailStoreAll`)
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount` (Integer)
- **表头整单合计信息** (`st.voucher.IHeadTotalData`)
  - `fTotalQuantity` → `fTotalQuantity` (Real)
- **事项交换** (`st.matterinfo.IMatterInfoAble`)
- **库存表头抽取** (`voucher.st.IHeadInfo`)
  - `account_org` → `account_org` (4ec9e266-1eae-4f78-b5e3-26c220a15d70)
  - `` → `` (8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5)
  - `iOperatorId` → `iOperatorId` (4effed83-35f5-4e3b-9be1-092b5ae602e8)
  - `iOrgid` → `iOrgid` (c1135e08-c4bf-4499-90bf-67030d1f2654)
  - `stock_mgr` → `stock_mgr` (4effed83-35f5-4e3b-9be1-092b5ae602e8)
  - `total_pieces` → `total_pieces` (Real)
  - `fTotalQuantity` → `fTotalQuantity` (Real)
- **库存接口_标识** (`st.internaltransaction.IInventorySign`)
  - `iInternalSign` → `iInternalSign` (Boolean)
- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId` (58dd3dad-7eb7-47ea-a5b1-1f89d1709528)
  - `isFlowCoreBill` → `isFlowCoreBill` (Boolean)
- **奇门相关字段** (`voucher.st.QiMen`)
  - `wmsbillno` → `wmsbillno` (String)
  - `wmscancelstatus` → `wmscancelstatus` (Short)
  - `wmsinstatus` → `wmsinstatus` (Short)
- **奇门多次回传** (`voucher.st.QiMenMultiplePostback`)
  - `wmsUnique` → `wmsUnique` (String)
- **条形码** (`ucfbase.ucfbaseItf.IBarCode`)
  - `bar_code` → `bar_code` (String)
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → `` (Boolean)
  - `` → `` (Short)
  - `` → `` (Short)
- **货主对象** (`st.inventoryowner.IInventoryOwner`)
  - `` → `` (af1b583d-f5e4-4f7c-bba5-66d570ef7e3e)
- **货权归属** (`st.inventoryowner.IOwnerType`)
  - `` → `` (Integer)
- **外部系统** (`st.externalsystem.ExternalSystem`)
  - `externalSystem` → `externalSystem` (String)
- **过账信息** (`gscm.itf.IPostAccountInfo`)
  - `postAccountStatus` → `postAccountStatus` (Short)
  - `postAccountVersion` → `postAccountVersion` (Long)
- **会计事务过账信息-存货** (`gscm.interf.FiEventAccInfo`)
  - `fiEventAccountingDate` → `fiEventAccountingDate` (String)
  - `fiEventCode` → `fiEventCode` (String)
  - `fiEventDataId` → `fiEventDataId` (String)
  - `fiEventId` → `fiEventId` (String)
- **会计事务过账信息-应收** (`gscm.interf.FiEventAccInfoAr`)
  - `fiEventAccountingDateAr` → `fiEventAccountingDateAr` (String)
  - `fiEventCodeAr` → `fiEventCodeAr` (String)
  - `fiEventDataIdAr` → `fiEventDataIdAr` (String)
  - `fiEventIdAr` → `fiEventIdAr` (String)
- **库存移动记录版本** (`st.billstate.ICertificateVersion`)
  - `certificate_version` → `certificate_version` (Long)
- **出入库类型** (`st.billstate.IStockInOutType`)
  - `stock_in_out_type` → `stock_in_out_type` (Integer)
- **财务过账相关信息记录** (`gscm.interf.FiInfoRecord`)
  - `noPostReasonMsg` → `noPostReasonMsg` (String)
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id` (e4933a03-9dea-472b-a644-cdd654222f45)
- **外部来源线索** (`base.itf.IOutSysObjClue`)
  - `out_sys_code` → `out_sys_code` (String)
  - `out_sys_id` → `out_sys_id` (String)
  - `out_sys_type` → `out_sys_type` (String)
  - `out_sys_version` → `out_sys_version` (String)
- **是否推送库存移动记录标识接口** (`st.pushcertificate.ICertificateUpdate`)
  - `is_push_certificate` → `is_push_certificate` (Boolean)

## 完整字段列表

> 共 163 个直连字段

### 文本字段 (text) (60个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `fiEventAccountingDate` | `fiEventAccountingDate` | String | 会计事务记账日期 | true |  |
| `fiEventAccountingDateAr` | `fiEventAccountingDateAr` | String | 会计事务记账日期_应收 | true |  |
| `fiEventCode` | `fiEventCode` | String | 会计事务类型编码 | true |  |
| `fiEventCodeAr` | `fiEventCodeAr` | String | 会计事务类型编码_应收 | true |  |
| `fiEventDataId` | `fiEventDataId` | String | 会计事务数据ID | true |  |
| `fiEventDataIdAr` | `fiEventDataIdAr` | String | 会计事务数据ID_应收 | true |  |
| `fiEventId` | `fiEventId` | String | 会计事务类型ID | true |  |
| `fiEventIdAr` | `fiEventIdAr` | String | 会计事务类型ID_应收 | true |  |
| `wmsUnique` | `wmsUnique` | String | wms回传唯一标识 | true | 255 |
| `out_sys_code` | `out_sys_code` | String | 外部来源编码 | true | 50 |
| `cost_billno_type` | `cost_billno_type` | String | 结转成本单据 | true | 50 |
| `synergistic_type` | `synergistic_type` | String | 协同单据类型 | true |  |
| `iDirectShipment` | `iDirectShipment` | String | 直运销售 | true | 10 |
| `transfer_method` | `transfer_method` | String | 抛转方式 | true | 20 |
| `write_off_upcode` | `write_off_upcode` | String | 冲销单据号 | true |  |
| `noPostReasonMsg` | `noPostReasonMsg` | String | 不过账原因信息 | true |  |
| `out_sys_id` | `out_sys_id` | String | 外部来源线索 | true | 50 |
| `out_sys_version` | `out_sys_version` | String | 外部来源版本 | true | 50 |
| `cReceiveTelePhone` | `cReceiveTelePhone` | String | 收货人固定电话 | true | 255 |
| `out_sys_type` | `out_sys_type` | String | 外部来源类型 | true | 50 |
| `` | `code` | String | 单据编号 | true | 50 |
| `stock_account` | `stock_account` | String | 入账方式 | true | 100 |
| `contact_name` | `contact_name` | String | 联系人 | true | 255 |
| `receiveContacterTelephone` | `receiveContacterTelephone` | String | 客户联系人固定电话 | true | 255 |
| `receiveContacterPhone` | `receiveContacterPhone` | String | 客户联系人移动电话 | true | 255 |
| `cReceiver` | `cReceiver` | String | 收货人 | true | 255 |
| `cReceiveMobile` | `cReceiveMobile` | String | 收货人手机号 | true | 255 |
| `cReceiveAddress` | `cReceiveAddress` | String | 收货地址 | true | 500 |
| `cReceiveZipCode` | `cReceiveZipCode` | String | 收货人邮编 | true | 50 |
| `diliverstatus` | `diliverstatus` | String | 门户收货状态 | true | 50 |
| `cLogisticsBillNo` | `cLogisticsBillNo` | String | 物流单号 | true | 1000 |
| `cLogisticsCarNum` | `cLogisticsCarNum` | String | 车牌号 | true | 100 |
| `cLogisticsUserName` | `cLogisticsUserName` | String | 司机姓名 | true | 100 |
| `cLogisticsUserPhone` | `cLogisticsUserPhone` | String | 司机电话 | true | 100 |
| `bar_code` | `bar_code` | String | 单据条码 | true | 1024 |
| `cmemo` | `cmemo` | String | 备注 | true | 255 |
| `csrcbillid` | `csrcbillid` | String | 来源单据id | true | 50 |
| `csrcbillno` | `csrcbillno` | String | 来源单据号 | true | 50 |
| `csrcbilltype` | `csrcbilltype` | String | 来源类型 | true | 50 |
| `` | `creator` | String | 创建人 | true | 255 |
| `` | `modifier` | String | 修改人 | true | 255 |
| `` | `auditor` | String | 提交人 | true | 255 |
| `cRetailAgentName` | `cRetailAgentName` | String | 散户名称 | true | 255 |
| `carryOverOfCostMethod` | `carryOverOfCostMethod` | String | 结转成本方式 | true | 50 |
| `modifyInvoiceType` | `modifyInvoiceType` | String | 发票类型可改 | true | 255 |
| `invoiceUpcType` | `invoiceUpcType` | String | 发票类型 | true | 255 |
| `invoiceTitleType` | `invoiceTitleType` | String | 抬头类型 | true | 255 |
| `invoiceTitle` | `invoiceTitle` | String | 发票抬头 | true | 255 |
| `taxNum` | `taxNum` | String | 纳税识别号 | true | 255 |
| `bankName` | `bankName` | String | 开户银行 | true | 255 |
| `subBankName` | `subBankName` | String | 开户支行 | true | 255 |
| `bankAccount` | `bankAccount` | String | 银行账号 | true | 255 |
| `invoiceTelephone` | `invoiceTelephone` | String | 营业电话 | true | 255 |
| `invoiceAddress` | `invoiceAddress` | String | 营业地址 | true | 255 |
| `sourcesys` | `sourcesys` | String | 来源系统 | true | 50 |
| `receiveAccountingBasis` | `receiveAccountingBasis` | String | 立账开票依据 | true | 50 |
| `salesoutAccountingMethod` | `salesoutAccountingMethod` | String | 出库立账方式 | true | 50 |
| `externalSystem` | `externalSystem` | String | 外系统来源标识 | true | 50 |
| `wmsbillno` | `wmsbillno` | String | WMS单号 | true | 255 |
| `salesIntegratedInterface` | `salesIntegratedInterface` | String | 销售出库业务集成奇门接口 | true | 255 |

### 引用字段 (quote) (33个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `` | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | 审批人 | true |  |
| `bdInvoiceTypeId` | `bdInvoiceTypeId` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b | 发票类型 | true |  |
| `write_off_reason` | `write_off_reason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 | 冲销原因 | true |  |
| `` | `tradeRouteID` | c69f1d6a-783c-4f79-b446-b4da14cb7fff | 贸易路径Id | true |  |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id | true | 36 |
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 | true |  |
| `iCustID` | `iCustID` | 7cc86f92-b244-4581-8dcf-a6b7cb76516f | 客户权限 | true |  |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 | true |  |
| `iprewarehouse` | `iprewarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 订单预占仓库 | true |  |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 | true |  |
| `account_org` | `account_org` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | 会计主体 | true |  |
| `iOrgid` | `iOrgid` | c1135e08-c4bf-4499-90bf-67030d1f2654 | 发货组织 | true |  |
| `isalesorg` | `isalesorg` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | 销售组织 | true |  |
| `invoice_org` | `invoice_org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | 开票组织ID | true |  |
| `ibustypeid` | `ibustypeid` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 交易类型 | true |  |
| `iStoreID` | `iStoreID` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | 门店id | true |  |
| `iwarehouse` | `iwarehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 仓库 | true |  |
| `` | `inventoryowner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e | 货主对象 | true |  |
| `stock_mgr` | `stock_mgr` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | 库管员ID | true |  |
| `imerchant` | `imerchant` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 商家 | true |  |
| `invoice_cust` | `invoice_cust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 开票客户ID | true |  |
| `iCustID` | `iCustID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 客户 | true |  |
| `logistics_network` | `logistics_network` | fd2ddacc-f46f-448f-828c-cda55b62df36 | 物流网点id | true |  |
| `delivery_shop` | `delivery_shop` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | 收货终端网点id | true |  |
| `contact_id` | `contact_id` | 7733d1db-8871-437a-ba65-dbcad95bf0bc | 联系人ID | true |  |
| `` | `department` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | 销售部门 | true |  |
| `iOperatorId` | `iOperatorId` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | 销售员 | true |  |
| `iLogisticId` | `iLogisticId` | d0870b3f-7113-45cb-8cc7-c812e9bf6dc2 | 物流公司ID | true |  |
| `voucherType` | `voucherType` | 4a227650-b866-4f4c-a6ca-2433297a1713 | 单据类型 | true |  |
| `iNatCurrencyID` | `iNatCurrencyID` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 本币id | true |  |
| `iCurrencyID` | `iCurrencyID` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 币种id | true |  |
| `cExchangeRateTypeId` | `cExchangeRateTypeId` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | 汇率类型id | true |  |
| `bizFlowId` | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | 流程ID | true |  |

### 日期字段 (date) (5个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `create_date` | `create_date` | Date | 创建日期 | true |  |
| `modify_date` | `modify_date` | Date | 修改日期 | true |  |
| `` | `vouchdate` | Date | 单据日期 | true |  |
| `exch_rate_date` | `exch_rate_date` | Date | 汇率日期 | true |  |
| `audit_date` | `audit_date` | Date | 审核日期 | true |  |

### 布尔字段 (switch) (9个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `isUpdateStock` | `isUpdateStock` | Boolean | 是否更新存量 | true |  |
| `is_push_certificate` | `is_push_certificate` | Boolean | 是否推送库存移动记录 | true |  |
| `iscs` | `iscs` | Boolean | 是否寄售库存 | true |  |
| `iInternalSign` | `iInternalSign` | Boolean | 是否走内部交易的标识 | false |  |
| `isDayEnd` | `isDayEnd` | Boolean | 是否已生成日报 | true |  |
| `` | `isWfControlled` | Boolean | 是否审批流控制 | true |  |
| `isUpdateCost` | `isUpdateCost` | Boolean | 更新存货成本 | true |  |
| `isFlowCoreBill` | `isFlowCoreBill` | Boolean | 是否流程核心单据 | true |  |
| `bSynSettlement` | `bSynSettlement` | Boolean | 是否同步待结算 | true |  |

### 整数字段 (int) (11个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `has_print_waybill` | `has_print_waybill` | Integer | 是否面单打印 | true |  |
| `throw_status` | `throw_status` | Integer | 抛单状态 | true |  |
| `impact_stock_timing` | `impact_stock_timing` | Integer | 更新存量时机 | true |  |
| `already_update_stock` | `already_update_stock` | Integer | 已更新存量 | true |  |
| `impact_financial_timing` | `impact_financial_timing` | Integer | 传财务时机 | true |  |
| `already_update_financial` | `already_update_financial` | Integer | 已传财务 | true |  |
| `printCount` | `printCount` | Integer | 打印次数 | true |  |
| `` | `ownertype` | Integer | 货权归属 | true |  |
| `package_qty` | `package_qty` | Integer | 包裹数 | true |  |
| `stock_in_out_type` | `stock_in_out_type` | Integer | 出入库类型 | true | 6 |
| `settlementVersion` | `settlementVersion` | Integer | 销售结算单版本 | true |  |

### 短整数字段 (short) (9个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `write_off_enable` | `write_off_enable` | Short | 启用冲销 | true |  |
| `write_off_status` | `write_off_status` | Short | 冲销状态 | true |  |
| `` | `isEndTrade` | Short | 是否末级 | true |  |
| `postAccountStatus` | `postAccountStatus` | Short | 过账状态 | true |  |
| `` | `status` | Short | 单据状态 | true |  |
| `` | `verifystate` | Short | 审批状态 | true |  |
| `` | `returncount` | Short | 退回次数 | true |  |
| `wmsinstatus` | `wmsinstatus` | Short | WMS转入状态 | true |  |
| `wmscancelstatus` | `wmscancelstatus` | Short | WMS取消状态 | true |  |

### 长整数字段 (long) (8个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `certificate_version` | `certificate_version` | Long | 库存移动记录版本 | true |  |
| `write_off_sourceid` | `write_off_sourceid` | Long | 冲销线索主表id | true |  |
| `taxSettingType` | `taxSettingType` | Long | 计税方式 | true | 20 |
| `postAccountVersion` | `postAccountVersion` | Long | 过账版本 | true |  |
| `iShopID` | `iShopID` | Long | 商家 | true |  |
| `receive_id` | `receive_id` | Long | 收货人id | true |  |
| `id` | `id` | Long | ID | true |  |
| `` | `tplid` | Long | 模板id | true |  |

### 数值字段 (number) (14个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `expense_orimoney` | `expense_orimoney` | Decimal | 费用无税金额 | true | 28 |
| `` | `tradeRouteLineno` | Decimal | 站点 | true | 28 |
| `expenseNatMoney` | `expenseNatMoney` | Decimal | 费用本币无税金额 | true | 28 |
| `expenseNatSum` | `expenseNatSum` | Decimal | 费用本币含税金额 | true | 28 |
| `payMoney` | `payMoney` | Decimal | 含税金额 | true | 19 |
| `fRealMoney` | `fRealMoney` | Decimal | 应付金额(含运费) | true | 19 |
| `rebateToOrderMoney` | `rebateToOrderMoney` | Decimal | 整单折扣返利 | true | 19 |
| `reight` | `reight` | Decimal | 运费 | true | 19 |
| `shipmentOutMoney` | `shipmentOutMoney` | Decimal | 实际出库金额 | true | 19 |
| `expenseOriSum` | `expenseOriSum` | Decimal | 费用含税金额 | true | 19 |
| `fTotalQuantity` | `fTotalQuantity` | Decimal | 整单数量 | true | 19 |
| `total_pieces` | `total_pieces` | Decimal | 整单件数 | true | 19 |
| `taxRate` | `taxRate` | Decimal | 税率 | true | 19 |
| `` | `exchRate` | Decimal | 汇率 | true | 28 |

### other (8个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `exchRateOps` | `exchRateOps` | ExchangeRateMethod | 汇率折算方式 | true | 1 |
| `istockdirection` | `istockdirection` | stockDirection | 出库方向 | true |  |
| `` | `` | 16755fc2-efe3-4503-a1b0-a3d80efbe870 | 出库单扫描 |  |  |
| `` | `` | 9d6edef7-90a4-419a-b3a6-058b118270e0 | 销售出库单子表 |  |  |
| `` | `` | 83d4ee21-06ce-4d02-a648-fae0d4fc0673 | 销售出库单主表自由自定义项 |  |  |
| `` | `` | fdd78748-ecd6-4656-869a-83da28d1bb00 | 销售出库单主表自定义项 |  |  |
| `` | `` | c269a7fc-45d1-4f5c-a995-d9a34d9b5366 | 物流单子表 |  |  |
| `` | `` | e1933681-7a73-44d1-8728-b0265b09d98f | 销售出库单主表扩展 |  |  |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `salesOutDefineCharacter` | `salesOutDefineCharacter` | 0b23c76b-d9ae-455e-85ae-7968fed8a8c3 | 自定义项特征属性组 | true |  |

### timestamp (5个)

| 字段名 | 数据库列 | 类型 | 显示名 | 可空 | 长度 |
|--------|---------|------|--------|------|------|
| `pubts` | `pubts` | DateTime | 时间戳 | true |  |
| `create_time` | `create_time` | DateTime | 创建时间 | true |  |
| `modify_time` | `modify_time` | DateTime | 修改时间 | true |  |
| `audit_time` | `audit_time` | DateTime | 提交时间 | true |  |
| `receivingTime` | `receivingTime` | DateTime | 收货时间 | true |  |
