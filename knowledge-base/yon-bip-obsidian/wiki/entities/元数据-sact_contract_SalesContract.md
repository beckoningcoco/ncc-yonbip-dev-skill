---
tags: [BIP, 元数据, 数据字典, sact.contract.SalesContract]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售合同 (`sact.contract.SalesContract`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sact_salescontract` | domain：`sact` | 应用：`SACT` | 业务对象ID：`a89c4c12-4abf-47d2-8e1d-f142229a2d1b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同 |
| 物理表 | `sact_salescontract` |
| domain/服务域 | `sact` |
| schema | `scmmp` |
| 所属应用 | `SACT` |
| 直连字段 | 153 个 |
| 子表 | 11 个 |
| 关联引用 | 50 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `frees` | `sact.contract.SalesContractFreeDefine` | composition |
| `orderExecutes` | `sact.contract.OrderExecute` | composition |
| `shareMerchants` | `sact.contract.ShareMerchant` | composition |
| `clueParticipantList` | `sact.contract.ClueParticipant` | composition |
| `iBpmCurrentAuditor` | `sact.contract.IBpmCurrentAuditor` | composition |
| `childs` | `sact.contract.ContractObject` | composition |
| `signSubjects` | `sact.contract.SignSubject` | composition |
| `executeOrganizations` | `sact.contract.ExecuteOrganization` | composition |
| `iBpmStep` | `sact.contract.IBpmStep` | composition |
| `receiveAgreement` | `sact.contract.ReceiveAgreement` | composition |
| `defines` | `sact.contract.SalesContractDefine` | composition |

## 关联引用 (50个)

| 字段名 | 引用类型 |
|--------|---------|
| `shippingChoiceId` | `productcenter.aa_sendtranswayref` |
| `invoiceTypeId` | `ucfbasedoc.bd_invoiceref` |
| `contractLegalClassId` | `iuap-apcom-contract.contractLegalTypeRef_new` |
| `modifierid` | `bip-usercenter.aa_user` |
| `` | `` |
| `iSaleAreaId` | `productcenter.aa_salearearef` |
| `main_sact_id` | `` |
| `iNatCurrencyID` | `ucfbasedoc.bd_currencytenantref` |
| `iReceiver` | `productcenter.aa_merchantaddressref` |
| `closerid` | `bip-usercenter.aa_user` |
| `tenant_id` | `` |
| `salesmanid` | `ucf-staff-center.bd_staff_outer_ref` |
| `agreement` | `ucfbasedoc.bd_receiveagreementref` |
| `work_transfer_owner` | `ucf-staff-center.bd_staff_outer_ref` |
| `iinvoiceagentid` | `productcenter.aa_invoicemerchantref` |
| `receive_contacter_id` | `productcenter.aa_merchantcontactref` |
| `auditorid` | `bip-usercenter.aa_user` |
| `deliaddr` | `productcenter.aa_merchantaddressref` |
| `saleidepartmentid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `iprojectid` | `ucfbasedoc.bd_outer_projectcardMCref` |
| `contractledgerId` | `` |
| `frozenoperatorid` | `bip-usercenter.aa_user` |
| `validoperatorid` | `bip-usercenter.aa_user` |
| `submitter` | `` |
| `agentId` | `productcenter.merchantRef` |
| `creatorid` | `bip-usercenter.aa_user` |
| `bizFlowId` | `u8c-baseservice.bf_businessFlow_ref` |
| `settlementId` | `productcenter.aa_settlemethodref` |
| `withdrawpp` | `` |
| `iCustomerId` | `productcenter.merchantRef` |
| `iCurrencyID` | `ucfbasedoc.bd_currencytenantref` |
| `salesContractDefineCharacter` | `` |
| `signtory` | `bip-usercenter.aa_user` |
| `ctransactiontypeid` | `transtype.bd_billtyperef` |
| `ytenant_id` | `` |
| `contractCategoryId` | `iuap-apcom-contract.contractTypeTreeRef` |
| `cexchangeratetypeid` | `ucfbasedoc.bd_exchangeratetyperef` |
| `iReceiverCust` | `productcenter.merchantRef` |
| `salesorgid` | `saleOrgref_sact` |

## 继承接口 (14个, 44字段)

- **汇率信息** (`voucher.base.IExchangeRate`)
  - `iCurrencyID` → `iCurrencyID`
  - `` → ``
  - `exchRateOps` → `exchRateOps`
  - `iNatCurrencyID` → `iNatCurrencyID`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId`
  - `isFlowCoreBill` → `isFlowCoreBill`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **关闭信息** (`base.itf.IClosing`)
  - `close_Date` → `close_Date`
  - `closer` → `closer`
  - `` → ``
  - `close_time` → `close_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **合同条款接口** (`pub.itf.IContractTerms`)
  - `ct_sign_id` → `ct_sign_id`
  - `` → ``
  - `ct_tpl_code` → `ct_tpl_code`
  - `ct_tpl_id` → `ct_tpl_id`
  - `ct_tpl_name` → `ct_tpl_name`
  - `ct_tpl_version` → `ct_tpl_version`
  - `id` → `id`
  - `sign_status` → `sign_status`
- **支持商家客户查询接口** (`pub.itf.IQueryByAgentMode`)
  - `agentId` → `agentId`
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`
- **伙伴表头接口** (`sact.pub.ICust`)
  - `iCustomerId` → `iCustomerId`
  - `iReceiveMobile` → `iReceiveMobile`
  - `cReceiver` → `cReceiver`
  - `iReceiverCust` → `iReceiverCust`
  - `iReceiver` → `iReceiver`
  - `iSaleAreaId` → `iSaleAreaId`
- **计税方式接口** (`sale.aa.ITaxSettingType`)
  - `taxSettingType` → `taxSettingType`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **外部来源线索** (`base.itf.IOutSysObjClue`)
  - `out_sys_code` → `out_sys_code`
  - `out_sys_id` → `out_sys_id`
  - `out_sys_type` → `out_sys_type`
  - `out_sys_version` → `out_sys_version`
- **审批提交信息** (`ucfbase.ucfbaseItf.ISubmitInfo`)
  - `submitter` → `submitter`
  - `submit_time` → `submit_time`
  - `withdrawpp` → `withdrawpp`
  - `withdraw_time` → `withdraw_time`

## 字段列表（按类型分组）

> 共 153 个直连字段

### 文本字段 (37个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cReceiver` | `cReceiver` | `receiver` | 收货人 |
| `auditor` | `auditor` | `auditor` | 审核人 |
| `closer` | `closer` | `closer` | 关闭人名称 |
| `iInvoiceUpcType` | `iInvoiceUpcType` | `invoiceUpcType` | 发票类型 |
| `cInvoiceTitle` | `cInvoiceTitle` | `invoiceTitle` | 发票抬头 |
| `cTaxNum` | `cTaxNum` | `taxNum` | 纳税识别号 |
| `cBankName` | `cBankName` | `bankName` | 开户行 |
| `cSubBankName` | `cSubBankName` | `subBankName` | 开户支行 |
| `cBankAccount` | `cBankAccount` | `bankAccount` | 开户账号 |
| `cInvoiceTelephone` | `cInvoiceTelephone` | `invoiceTelephone` | 营业电话 |
| `cInvoiceAddress` | `cInvoiceAddress` | `invoiceAddress` | 营业地址 |
| `cReceievInvoiceMobile` | `cReceievInvoiceMobile` | `receievInvoiceMobile` | 收票手机号 |
| `cReceievInvoiceEmail` | `cReceievInvoiceEmail` | `receievInvoiceEmail` | 收票邮箱 |
| `out_sys_code` | `out_sys_code` | `out_sys_code` | 外部来源编码 |
| `out_sys_id` | `out_sys_id` | `out_sys_id` | 外部来源线索 |
| `out_sys_version` | `out_sys_version` | `out_sys_version` | 外部来源版本 |
| `out_sys_type` | `out_sys_type` | `out_sys_type` | 外部来源类型 |
| `orderPayType` | `orderPayType` | `orderPayType` | 支付方式 |
| `` | `creator` | `creator` | 创建人名称 |
| `freezereason` | `freezereason` | `freezeReason` | 冻结原因 |
| `main_sact_code` | `main_sact_code` | `mainSactcode` | 主合同编码 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `iReceiveMobile` | `iReceiveMobile` | `receiveMobile` | 收货电话 |
| `terminatereason` | `terminatereason` | `terminateReason` | 终止原因 |
| `ctname` | `ctname` | `name` | 合同名称 |
| `code` | `code` | `code` | 合同编号 |
| `ct_sign_id` | `ct_sign_id` | `ctSignId` | 签署流程ID |
| `ct_tpl_id` | `ct_tpl_id` | `ctTplId` | 合同模板 |
| `ct_tpl_version` | `ct_tpl_version` | `ctTplVersion` | 合同模板版本 |
| `ct_tpl_name` | `ct_tpl_name` | `ctTplName` | 合同模板 |
| `` | `ctTermsData` | `ctTermsData` | 合同条款数据 |
| `ct_tpl_code` | `ct_tpl_code` | `ctTplCode` | 合同模板编码 |
| `receivecontacter` | `receivecontacter` | `receiveContacter` | 客户联系人 |
| `cReceiveContacterPhone` | `cReceiveContacterPhone` | `receiveContacterPhone` | 客户联系电话 |
| `bussinesstelephone` | `bussinesstelephone` | `bussinessTelephone` | 营业电话 |
| `bussinessaddress` | `bussinessaddress` | `bussinessAddress` | 营业地址 |
| `memo` | `memo` | `memo` | 备注 |

### 引用字段 (38个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `shippingChoiceId` | `shippingChoiceId` | `shippingChoiceId` | 发运方式id |
| `contractLegalClassId` | `contractLegalClassId` | `contractLegalClassId` | 合同法律类别ID |
| `work_transfer_owner` | `work_transfer_owner` | `workTransferOwner` | 工作移交负责人 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `receive_contacter_id` | `receive_contacter_id` | `receiveContacterId` | 客户联系人ID |
| `invoiceTypeId` | `invoiceTypeId` | `invoiceTypeId` | 发票类型ID |
| `contractCategoryId` | `contractCategoryId` | `contractCategoryId` | 合同类型ID |
| `contractledgerId` | `contractledgerId` | `contractledgerId` | 合同台账ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `settlementId` | `settlementId` | `settlementId` | 结算方式id |
| `iCustomerId` | `iCustomerId` | `custId` | 伙伴 |
| `main_sact_id` | `main_sact_id` | `mainSactid` | 主合同id |
| `agentId` | `agentId` | `merchantAuth` | 客户权限 |
| `iReceiverCust` | `iReceiverCust` | `receiverCustId` | 收货客户 |
| `iReceiver` | `iReceiver` | `receiverId` | 收货人 |
| `iSaleAreaId` | `iSaleAreaId` | `saleAreaId` | 销售区域 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `salesorgid` | `salesorgid` | `salesOrgId` | 销售组织 |
| `ctransactiontypeid` | `ctransactiontypeid` | `transactionTypeId` | 交易类型 |
| `agentId` | `agentId` | `agentId` | 客户 |
| `deliaddr` | `deliaddr` | `deliAddr` | 交货地点 |
| `iinvoiceagentid` | `iinvoiceagentid` | `invoiceAgentId` | 开票客户 |
| `iCurrencyID` | `iCurrencyID` | `currency` | 原币pk |
| `iNatCurrencyID` | `iNatCurrencyID` | `natCurrency` | 本币pk |
| `cexchangeratetypeid` | `cexchangeratetypeid` | `exchangeRateType` | 汇率类型 |
| `saleidepartmentid` | `saleidepartmentid` | `saleDepartmentId` | 销售部门 |
| `salesmanid` | `salesmanid` | `salesmanId` | 销售业务员 |
| `agreement` | `agreement` | `agreement` | 收款协议 |
| `bizFlowId` | `bizFlowId` | `bizFlow` | 流程 |
| `iprojectid` | `iprojectid` | `projectId` | 项目id |
| `creatorid` | `creatorid` | `creatorId` | 制单人 |
| `modifierid` | `modifierid` | `modifierId` | 修改人 |
| `auditorid` | `auditorid` | `auditorId` | 审核人 |
| `signtory` | `signtory` | `signtoryId` | 签署人 |
| `validoperatorid` | `validoperatorid` | `validOperatorId` | 生效人 |
| `frozenoperatorid` | `frozenoperatorid` | `frozenOperatorId` | 冻结人 |
| `closerid` | `closerid` | `closerId` | 关闭人 |

### 日期字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchRateDate` | `exchRateDate` | `exchRateDate` | 汇率日期 |
| `audit_date` | `audit_date` | `auditDate` | 审核日期 |
| `create_date` | `create_date` | `createDate` | 制单日期 |
| `modify_date` | `modify_date` | `modifyDate` | 最后修改日期 |
| `sign_date` | `sign_date` | `signDate` | 签署日期 |
| `subscribedate` | `subscribedate` | `subscribeDate` | 合同签订日期 |
| `vouchdate` | `vouchdate` | `vouchdate` | 合同日期 |
| `planEffectiveDate` | `planEffectiveDate` | `planEffectiveDate` | 计划生效日期 |
| `planExpirationDate` | `planExpirationDate` | `planExpirationDate` | 计划失效日期 |
| `validdate` | `validdate` | `validDate` | 生效日期 |
| `frozen_date` | `frozen_date` | `frozenDate` | 冻结日期 |
| `close_date` | `close_date` | `closeDate` | 终止日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_transfer_taxsact` | `is_transfer_taxsact` | `isTransferTaxsact` | 是否同步税务合同 |
| `ishasclmfile` | `ishasclmfile` | `ishasclmfile` | 是否有合同文件 |
| `isclmdraft` | `isclmdraft` | `isclmdraft` | 是否已定稿 |
| `ishasclmsignflow` | `ishasclmsignflow` | `ishasclmsignflow` | 是否有签署流程 |
| `bModifyInvoiceType` | `bModifyInvoiceType` | `modifyInvoiceType` | 发票类型可改 |
| `isSalePriceModify` | `isSalePriceModify` | `isSalePriceModify` | 报价允许手工录入 |
| `is_execute` | `is_execute` | `isExecute` | 是否参与执行 |
| `is_sub_sact` | `is_sub_sact` | `isSubSact` | 是否子合同 |
| `isWfControlled` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `isFlowCoreBill` | `isFlowCoreBill` | `isFlowCoreBill` | 是否流程核心单据 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iprintcount` | `iprintcount` | `printCount` | 打印次数 |
| `changestatus` | `changestatus` | `changestatus` | 变更状态 |
| `comp_match_expand` | `comp_match_expand` | `compMatchExpand` | 选配物料生成子件行 |

### 短整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expiredayConfirmType` | `expiredayConfirmType` | `expiredayConfirmType` | 到期日确定方式 |
| `oadayConfirmType` | `oadayConfirmType` | `oadayConfirmType` | 出账日确定方式 |
| `taxSettingType` | `taxSettingType` | `taxSettingType` | 计税方式 |
| `contractstatus` | `contractstatus` | `contractStatus` | 合同状态 |
| `sign_status` | `sign_status` | `signStatus` | 电子签署状态 |
| `` | `status` | `status` | 单据状态 |
| `verifystate` | `verifystate` | `verifystate` | 审批状态 |
| `returncount` | `returncount` | `returncount` | 退回次数 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tplid` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 表头 |
| `reviseidlastid` | `reviseidlastid` | `reviselastid` | 变更单最新版本 |

### 数值字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fWholeOriExpenseSum` | `fWholeOriExpenseSum` | `wholeOriExpenseSum` | 费用含税金额 |
| `fWholeFavorableRate` | `fWholeFavorableRate` | `wholeFavorableRate` | 整单倒扣 |
| `wholePreGProfitRate` | `wholePreGProfitRate` | `wholePreGProfitRate` | 预估毛利率 |
| `wholeNatPayEMoney` | `wholeNatPayEMoney` | `wholeNatPayEMoney` | 应付费用本币无税金额 |
| `wholePreGProfit` | `wholePreGProfit` | `wholePreGProfit` | 预估毛利 |
| `wholeNatReceiEMoney` | `wholeNatReceiEMoney` | `wholeNatReceiEMoney` | 应收费用本币无税金额 |
| `wholeNatTaxPayEMoney` | `wholeNatTaxPayEMoney` | `wholeNatTaxPayEMoney` | 应付费用本币含税金额 |
| `wholeNatTaxReceiEMoney` | `wholeNatTaxReceiEMoney` | `wholeNatTaxReceiEMoney` | 应收费用本币含税金额 |
| `fTotalDiscMoney` | `fTotalDiscMoney` | `totalDiscMoney` | 折扣总金额 |
| `fTotalSaleMoney` | `fTotalSaleMoney` | `totalSaleMoney` | 报价含税总金额 |
| `fWholeDiscRate` | `fWholeDiscRate` | `wholeDiscRate` | 整单扣率% |
| `exerate` | `exerate` | `exchRate` | 汇率 |
| `totalpricetax` | `totalpricetax` | `totalPriceTax` | 合计含税金额 |
| `fpaymoney_orig_taxfree` | `fpaymoney_orig_taxfree` | `payMoneyOrigTaxfree` | 合计无税金额 |
| `totaltax` | `totaltax` | `totalTax` | 合计税额 |
| `totalorirceipts` | `totalorirceipts` | `totalOriReceipts` | 累计已收款金额 |

### other (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchRateOps` | `exchRateOps` | `exchRateOps` | 汇率折算方式 |
| `iInvoiceTitleType` | `iInvoiceTitleType` | `invoiceTitleType` | 发票抬头类型 |
| `contractctrltype` | `contractctrltype` | `contractCtrlType` | 合同控制类型 |
| `` | `` | `childs` | 合同标的 |
| `` | `` | `clueParticipantList` | 参与人 |
| `` | `` | `defines` | 销售合同自定义项 |
| `` | `` | `executeOrganizations` | 合同执行组织 |
| `` | `` | `frees` | 销售合同自由自定义项 |
| `` | `` | `iBpmCurrentAuditor` | 当前审批人 |
| `` | `` | `iBpmStep` | 当前业务阶段 |
| `` | `` | `orderExecutes` | 合同执行情况 |
| `` | `` | `receiveAgreement` | 收款协议 |
| `` | `` | `shareMerchants` | 合同共享客户 |
| `` | `` | `signSubjects` | 合同签署主体 |

### attachment (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sign_file_id` | `sign_file_id` | `signFileId` | 待签署合同文件 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `salesContractDefineCharacter` | `salesContractDefineCharacter` | `salesContractDefineCharacter` | 销售合同自定义项特征属性组 |

### timestamp (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 制单时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `sign_time` | `sign_time` | `signTime` | 签署时间 |
| `validtime` | `validtime` | `validTime` | 生效时间 |
| `frozen_time` | `frozen_time` | `frozenTime` | 冻结时间 |
| `close_time` | `close_time` | `closeTime` | 关闭时间 |
