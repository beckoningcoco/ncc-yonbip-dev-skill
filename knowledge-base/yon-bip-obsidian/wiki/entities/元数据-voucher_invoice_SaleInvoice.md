---
tags: [BIP, 元数据, 数据字典, voucher.invoice.SaleInvoice]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售发票主表 (`voucher.invoice.SaleInvoice`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`voucher_saleinvoice` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：`31bee118-0ff2-4f1b-9e16-01efbe8a46c5`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售发票主表 |
| 物理表 | `voucher_saleinvoice` |
| 数据库 schema | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 182 个 |
| 子表 | 7 个 |
| 关联引用 | 38 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rebateSum` | `voucher.invoice.RebateSum` | composition |
| `saleInvoiceTaxCtlDetails` | `voucher.invoice.SaleInvoiceTaxCtlDetail` | composition |
| `rebateDetails` | `voucher.invoice.RebateDetail` | composition |
| `headFreeItem` | `voucher.invoice.SaleInvoiceFreeItem` | composition |
| `rebateRecords` | `voucher.invoice.RebateRecord` | composition |
| `saleInvoiceDetails` | `voucher.invoice.SaleInvoiceDetail` | composition |
| `headItem` | `voucher.invoice.SaleInvoiceCustomItem` | composition |

## 关联引用 (38个)

| 字段名 | 引用类型 |
|--------|---------|
| `iSaleOrgId` | `` |
| `submitter` | `` |
| `iAgentId` | `productcenter.merchantRef` |
| `iInvAgentId` | `productcenter.merchantRef` |
| `` | `` |
| `iCreatorId` | `` |
| `iModifierId` | `` |
| `bizFlowId` | `u8c-baseservice.bf_businessFlow_ref` |
| `iSettlementId` | `productcenter.aa_settlemethodref` |
| `iBlueInvId` | `` |
| `iOrgid` | `financeOrgref` |
| `iSaleAreaId` | `productcenter.aa_salearearef` |
| `iNatCurrentId` | `ucfbasedoc.bd_currencytenantref` |
| `withdrawpp` | `` |
| `iCloserId` | `` |
| `iCustomerId` | `productcenter.merchantRef` |
| `cCurrencyId` | `ucfbasedoc.bd_currencytenantref` |
| `redFlushId` | `` |
| `iTransactionType` | `transtype.bd_billtyperef` |
| `bdInvoiceTypeId` | `ucfbasedoc.bd_invoiceref` |
| `ytenant_id` | `` |
| `invalidorId` | `` |
| `iAgentRelationId` | `` |
| `iSaleDeptId` | `ucf-org-center.bd_adminorgsharetreeref` |
| `ireceivecontacterid` | `` |
| `cExchangeRateTypeId` | `ucfbasedoc.bd_exchangeratetyperef` |
| `iAuditorId` | `` |
| `iReceiverCust` | `productcenter.merchantRef` |
| `saleInvoiceDefineCharacter` | `` |
| `iSaleUserId` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (15个, 38字段)

- **原币金额信息** (`voucher.base.IOriMoneyInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **商家相关** (`base.itf.IShop`)
  - `iShopID` → `iShopID`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId`
  - `isFlowCoreBill` → `isFlowCoreBill`
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`
- **过账信息** (`gscm.itf.IPostAccountInfo`)
  - `postAccountStatus` → `postAccountStatus`
  - `postAccountVersion` → `postAccountVersion`
- **伙伴表头接口** (`uorder.voucher.ICust`)
  - `iCustomerId` → `iCustomerId`
  - `iReceiverCust` → `iReceiverCust`
  - `iSaleAreaId` → `iSaleAreaId`
- **会计事务过账信息-应收** (`gscm.interf.FiEventAccInfoAr`)
  - `fiEventAccountingDateAr` → `fiEventAccountingDateAr`
  - `fiEventCodeAr` → `fiEventCodeAr`
  - `fiEventDataIdAr` → `fiEventDataIdAr`
  - `fiEventIdAr` → `fiEventIdAr`
- **计税方式接口** (`sale.aa.ITaxSettingType`)
  - `taxSettingType` → `taxSettingType`
- **财务过账相关信息记录** (`gscm.interf.FiInfoRecord`)
  - `noPostReasonMsg` → `noPostReasonMsg`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **外部来源线索** (`base.itf.IOutSysObjClue`)
  - `out_sys_code` → `out_sys_code`
  - `out_sys_id` → `out_sys_id`
  - `out_sys_type` → `out_sys_type`
  - `out_sys_version` → `out_sys_version`
- **客户Id** (`uorder.voucher.IAgentId`)
  - `iAgentId` → `iAgentId`
- **贸易路径Id接口** (`sccs.multitrade.ITradeRouteID`)
  - `` → ``
  - `throw_status` → `throw_status`
  - `` → ``
  - `` → ``
- **审批提交信息** (`ucfbase.ucfbaseItf.ISubmitInfo`)
  - `submitter` → `submitter`
  - `submit_time` → `submit_time`
  - `withdrawpp` → `withdrawpp`
  - `withdraw_time` → `withdraw_time`

## 字段列表（按类型分组）

> 共 182 个直连字段

### 文本字段 (64个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `transfer_method` | `transfer_method` | `transferMethod` | 抛转方式 |
| `cEinvoiceKprq` | `cEinvoiceKprq` | `einvoiceKprq` | 开税票日期 |
| `out_sys_code` | `out_sys_code` | `out_sys_code` | 外部来源编码 |
| `out_sys_id` | `out_sys_id` | `out_sys_id` | 外部来源线索 |
| `out_sys_version` | `out_sys_version` | `out_sys_version` | 外部来源版本 |
| `out_sys_type` | `out_sys_type` | `out_sys_type` | 外部来源类型 |
| `fiEventAccountingDateAr` | `fiEventAccountingDateAr` | `fiEventAccountingDateAr` | 会计事务记账日期_应收 |
| `fiEventCodeAr` | `fiEventCodeAr` | `fiEventCodeAr` | 会计事务类型编码_应收 |
| `fiEventDataIdAr` | `fiEventDataIdAr` | `fiEventDataIdAr` | 会计事务数据ID_应收 |
| `fiEventIdAr` | `fiEventIdAr` | `fiEventIdAr` | 会计事务类型ID_应收 |
| `noPostReasonMsg` | `noPostReasonMsg` | `noPostReasonMsg` | 不过账原因信息 |
| `receievinvoiceemail` | `receievinvoiceemail` | `receievInvoiceEmail` | 收票邮箱 |
| `receievinvoicemobile` | `receievinvoicemobile` | `receievInvoiceMobile` | 收票手机号 |
| `cAgentName` | `cAgentName` | `agentName` | 客户名称 |
| `cInvAgentName` | `cInvAgentName` | `invAgentName` | 开票客户名称 |
| `cOrgName` | `cOrgName` | `orgName` | 开票组织名称 |
| `cSaleUserName` | `cSaleUserName` | `saleUserName` | 销售业务员名称 |
| `transactionTypeId_name` | `transactionTypeId_name` | `transactionTypeId_name` | 交易类型 |
| `voucherType` | `voucherType` | `voucherType` | 单据类型 |
| `cBlueInvNo` | `cBlueInvNo` | `blueInvNo` | 蓝字发票号 |
| `cInvoiceTitle` | `cInvoiceTitle` | `invoiceTitle` | 发票抬头 |
| `cCode` | `cCode` | `code` | 单据编号 |
| `cRetailAgentName` | `cRetailAgentName` | `retailAgentName` | 散户名称 |
| `cAgentContacts` | `cAgentContacts` | `agentContacts` | 客户联系人 |
| `cAgentContactsTel` | `cAgentContactsTel` | `agentContactsTel` | 联系电话 |
| `cInvAgentTaxNo` | `cInvAgentTaxNo` | `invAgentTaxNo` | 纳税人识别号 |
| `cInvAgentAdress` | `cInvAgentAdress` | `invAgentAdress` | 营业地址 |
| `cInvAgentTel` | `cInvAgentTel` | `invAgentTel` | 营业电话 |
| `cInvAgentBank` | `cInvAgentBank` | `invAgentBank` | 开户银行 |
| `cInvAgentSubBank` | `cInvAgentSubBank` | `invAgentSubBank` | 开户支行 |
| `cInvAgentBankNo` | `cInvAgentBankNo` | `invAgentBankNo` | 银行账号 |
| `cBillStationName` | `cBillStationName` | `billStationName` | 开票点 |
| `cBillStationCode` | `cBillStationCode` | `billStationCode` | 开票点编码 |
| `cEinvoiceDownUrl` | `cEinvoiceDownUrl` | `einvoiceDownUrl` | 税票下载地址 |
| `cEinvoiceHm` | `cEinvoiceHm` | `einvoiceHm` | 税票号码 |
| `cEinvoiceNo` | `cEinvoiceNo` | `einvoiceNo` | 税票代码 |
| `cEinvoiceRequestNo` | `cEinvoiceRequestNo` | `einvoiceRequestNo` | 税票请求流水号 |
| `cEinvoiceFailMemo` | `cEinvoiceFailMemo` | `einvoiceFailMemo` | 开票失败原因 |
| `cBlueEinvoiceHm` | `cBlueEinvoiceHm` | `blueEinvoiceHm` | 蓝字税票号码 |
| `cBlueEinvoiceNo` | `cBlueEinvoiceNo` | `blueEinvoiceNo` | 蓝字税票代码 |
| `cSource` | `cSource` | `source` | 来源单据 |
| `iStockAccount` | `iStockAccount` | `stockAccount` | 发出商品 |
| `cAgentCode` | `cAgentCode` | `agentCode` | 客户编码 |
| `cSaleOrgCode` | `cSaleOrgCode` | `saleOrgCode` | 销售组织编码 |
| `cTaxControlInvNo` | `cTaxControlInvNo` | `taxControlInvNo` | 税控发票号 |
| `cSaleDeptName` | `cSaleDeptName` | `saleDeptName` | 销售部门名称 |
| `cCurrencyCode` | `cCurrencyCode` | `currencyCode` | 币种编码 |
| `cExchInvoiceMemo` | `cExchInvoiceMemo` | `exchInvoiceMemo` | 换票原因 |
| `cNatCurrencyCode` | `cNatCurrencyCode` | `natCurrencyCode` | 本币编码 |
| `cEinvoiceCiphertext` | `cEinvoiceCiphertext` | `einvoiceCiphertext` | 发票密文 |
| `cEinvoiceCheckCode` | `cEinvoiceCheckCode` | `einvoiceCheckCode` | 校验码 |
| `cExchInvoiceNo` | `cExchInvoiceNo` | `exchInvoiceNo` | 换票票号 |
| `cNatCurrencyName` | `cNatCurrencyName` | `natCurrencyName` | 本币名称 |
| `cEinvoiceExtCode` | `cEinvoiceExtCode` | `einvoiceExtCode` | 发票提取码 |
| `cCurrencyName` | `cCurrencyName` | `currencyName` | 币种名称 |
| `cSaleOrgName` | `cSaleOrgName` | `saleOrgName` | 销售组织名称 |
| `cEinvoiceMachineNo` | `cEinvoiceMachineNo` | `einvoiceMachineNo` | 机器编号 |
| `cLastPrintUserName` | `cLastPrintUserName` | `lastPrintUserName` | 最近打印人 |
| `` | `auditor` | `auditor` | 审核人 |
| `cInvalidor` | `cInvalidor` | `invalidor` | 作废人 |
| `cCreator` | `cCreator` | `creator` | 制单人 |
| `cModifier` | `cModifier` | `modifier` | 修改人 |
| `memo` | `memo` | `memo` | 备注 |
| `cBlueEinvoiceKprq` | `cBlueEinvoiceKprq` | `blueEinvoiceKprq` | 蓝票电子发票日期 |

### 引用字段 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bdInvoiceTypeId` | `bdInvoiceTypeId` | `bdInvoiceTypeId` | 发票类型 |
| `iCustomerId` | `iCustomerId` | `custId` | 伙伴 |
| `iReceiverCust` | `iReceiverCust` | `receiverCustId` | 收货客户 |
| `iSaleAreaId` | `iSaleAreaId` | `saleAreaId` | 销售区域 |
| `iOrgid` | `iOrgid` | `orgId` | 开票组织 |
| `iTransactionType` | `iTransactionType` | `transactionTypeId` | 交易类型 |
| `iSettlementId` | `iSettlementId` | `settlementId` | 结算方式 |
| `iAgentId` | `iAgentId` | `agentId` | 客户 |
| `iInvAgentId` | `iInvAgentId` | `invAgentId` | 开票客户 |
| `iSaleUserId` | `iSaleUserId` | `saleUserId` | 销售业务员 |
| `cCurrencyId` | `cCurrencyId` | `currency` | 原币pk |
| `iNatCurrentId` | `iNatCurrentId` | `natCurrency` | 本币 |
| `iBlueInvId` | `iBlueInvId` | `blueInvId` | 蓝字发票ID |
| `cExchangeRateTypeId` | `cExchangeRateTypeId` | `exchangeRateType` | 汇率类型Id |
| `bizFlowId` | `bizFlowId` | `bizFlow` | 流程ID |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `` | `tradeRouteID` | `tradeRouteID` | 贸易路径Id |
| `ireceivecontacterid` | `ireceivecontacterid` | `receiveContacterId` | 客户联系人id |
| `redFlushId` | `redFlushId` | `redFlushId` | 红冲人id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `iAgentRelationId` | `iAgentRelationId` | `agentRelationId` | 客户交易关系id |
| `iSaleOrgId` | `iSaleOrgId` | `saleOrgId` | 销售组织 |
| `iSaleDeptId` | `iSaleDeptId` | `saleDeptId` | 销售部门ID |
| `iAgentId` | `iAgentId` | `merchantAuth` | 客户权限 |
| `iAuditorId` | `iAuditorId` | `auditorId` | 审核人ID |
| `invalidorId` | `invalidorId` | `invalidorId` | 作废人id |
| `iCloserId` | `iCloserId` | `closerId` | 关闭人ID |
| `iModifierId` | `iModifierId` | `modifierId` | 修改人id |
| `iCreatorId` | `iCreatorId` | `creatorId` | 创建人ID |

### 日期字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchRateDate` | `exchRateDate` | `exchRateDate` | 汇率日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `dSubmitAccountDate` | `dSubmitAccountDate` | `submmitAccountDate` | 立账日 |
| `dMaturityDate` | `dMaturityDate` | `maturityDate` | 到期日 |
| `dInvoiceDate` | `dInvoiceDate` | `invoiceDate` | 开票时间 |
| `dEinvoiceDate` | `dEinvoiceDate` | `einvoiceDate` | 电票开票日期 |
| `dLastPrintDate` | `dLastPrintDate` | `lastPrintDate` | 最近打印日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `dInvalidDate` | `dInvalidDate` | `invaliddate` | 作废日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bIsSelfRebate` | `bIsSelfRebate` | `isSelfRebate` | 是否发票返利 |
| `iTaxAccPost` | `iTaxAccPost` | `taxAccPost` | 开税票后财务过账 |
| `bIsNotSendTax` | `bIsNotSendTax` | `isNotSendTax` | 是否与税务云集成 |
| `bIssueRedInvoice` | `bIssueRedInvoice` | `isIssueRedInvoice` | 已开红票 |
| `bModifyInvoiceType` | `bModifyInvoiceType` | `modifyInvoiceType` | 发票类型可改 |
| `isFlowCoreBill` | `isFlowCoreBill` | `isFlowCoreBill` | 是否流程核心单据 |
| `invoiceAsynTaxMark` | `invoiceAsynTaxMark` | `invoiceAsynTaxMark` | 已同步待开票明细 |
| `bExportTaxControl` | `bExportTaxControl` | `isExportTaxControl` | 输出税控 |
| `bSupportExchInvoice` | `bSupportExchInvoice` | `isSupportExchInvoice` | 支持换票 |
| `bExchInvoice` | `bExchInvoice` | `isExchInvoice` | 换票 |
| `bTaxControlCancel` | `bTaxControlCancel` | `isTaxControlCancel` | 税控作废 |
| `` | `isWfControlled` | `isWfControlled` | 是否受审批流控制 |
| `bisInvalidInvoice` | `bisInvalidInvoice` | `isInvalidInvoice` | 已作废 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchRateOps` | `exchRateOps` | `exchRateOps` | 汇率折算方式 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `throw_status` | `throw_status` | `throwStatus` | 抛单状态 |
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `adjust_amount_bill` | `adjust_amount_bill` | `adjustAmountBill` | 金额调整发票 |

### 短整数 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `redtype` | `redtype` | `redType` | 红冲类型 |
| `` | `isEndTrade` | `isEndTrade` | 是否末级 |
| `iAgentConfirmStatus` | `iAgentConfirmStatus` | `agentConfirmStatus` | 客户确认状态 |
| `iTaxBillingStatus` | `iTaxBillingStatus` | `taxBillingStatus` | 税务开票状态 |
| `taxSettingType` | `taxSettingType` | `taxSettingType` | 计税方式 |
| `postAccountStatus` | `postAccountStatus` | `postAccountStatus` | 过账状态 |
| `iBusinessState` | `iBusinessState` | `businessState` | 发票业务状态 |
| `iEinvoiceStatus` | `iEinvoiceStatus` | `einvoiceStatus` | 电子发票状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批流状态 |

### 长整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主体ID |
| `postAccountVersion` | `postAccountVersion` | `postAccountVersion` | 过账版本 |
| `iBillStationId` | `iBillStationId` | `billStationId` | 开票点ID |
| `` | `tplid` | `tplid` | 模板id |
| `iShopID` | `iShopID` | `shop` | 商家 |
| `iCustomId` | `iCustomId` | `custom` | 所属客户 |
| `iSubmitRuleId` | `iSubmitRuleId` | `submmitRuleId` | 立账规则 |
| `iLastPrintUserId` | `iLastPrintUserId` | `lastPrintUserId` | 最近打印人 |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### 数值字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fWholeFavorableRate` | `fWholeFavorableRate` | `wholeFavorableRate` | 整单倒扣 |
| `` | `tradeRouteLineno` | `tradeRouteLineno` | 站点 |
| `fDiscountMoney` | `fDiscountMoney` | `discountMoney` | 整单扣额 |
| `fWholeDiscountRate` | `fWholeDiscountRate` | `wholeDiscountRate` | 整单扣率% |
| `fWholeSaleCost` | `fWholeSaleCost` | `wholeSaleCost` | 报价含税金额 |
| `iExchangeRate` | `iExchangeRate` | `exchRate` | 汇率 |
| `iTotalTaxMoney` | `iTotalTaxMoney` | `oriSum` | 含税金额 |
| `iTotalTaxFreeMoney` | `iTotalTaxFreeMoney` | `oriMoney` | 无税金额 |
| `iTaxMoney` | `iTaxMoney` | `oriTax` | 税额 |
| `iTotalOrigTaxMoney` | `iTotalOrigTaxMoney` | `natSum` | 本币含税金额 |
| `iTotalOrigTaxFreeMoney` | `iTotalOrigTaxFreeMoney` | `natMoney` | 本币无税金额 |
| `iOrigTaxMoney` | `iOrigTaxMoney` | `natTax` | 本币税额 |
| `issuedTaxMoney` | `issuedTaxMoney` | `issuedTaxMoney` | 已开税票金额 |
| `` | `oriTaxUnitPrice` | `oriTaxUnitPrice` | 原币含税单价 |
| `` | `oriUnitPrice` | `oriUnitPrice` | 原币无税单价 |
| `` | `taxRate` | `taxRate` | 税率 |
| `issuedTaxAmount` | `issuedTaxAmount` | `issuedTaxAmount` | 开税票税额 |
| `issuedTaxQty` | `issuedTaxQty` | `issuedTaxQty` | 开税票数量 |
| `issuedTaxSum` | `issuedTaxSum` | `issuedTaxSum` | 开税票含税金额 |

### other (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iInvoiceType` | `iInvoiceType` | `invoiceType` | 发票类型 |
| `iInvoiceSrcSystem` | `iInvoiceSrcSystem` | `invoiceSrcSystem` | 来源系统 |
| `iErpSystem` | `iErpSystem` | `erpSystem` | 外部系统 |
| `iInvDirection` | `iInvDirection` | `invDirection` | 单据方向 |
| `iInvoiceTitleType` | `iInvoiceTitleType` | `invoiceTitleType` | 发票抬头类型 |
| `iInvoiceMode` | `iInvoiceMode` | `invoiceMode` | 开票方式 |
| `` | `` | `headFreeItem` | 销售发票表头自由自定义项 |
| `` | `` | `headItem` | 销售发票表头自定义项 |
| `` | `` | `rebateDetails` | 返利明细 |
| `` | `` | `rebateRecords` | 返利单记录 |
| `` | `` | `rebateSum` | 返利汇总 |
| `` | `` | `saleInvoiceDetails` | 销售发票子表 |
| `` | `` | `saleInvoiceTaxCtlDetails` | 销售发票税控信息子表 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `saleInvoiceDefineCharacter` | `saleInvoiceDefineCharacter` | `saleInvoiceDefineCharacter` | 自定义项特征属性组 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dInvalidTime` | `dInvalidTime` | `invalidTime` | 作废时间 |
| `dCreatedTime` | `dCreatedTime` | `createTime` | 制单时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `dModifyTime` | `dModifyTime` | `modifyTime` | 修改时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
