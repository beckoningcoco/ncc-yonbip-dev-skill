---
tags: [BIP, 元数据, 数据字典, voucher.order.Order]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售订单 (`voucher.order.Order`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`orders` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：`04295ca8-a959-4017-b1f8-cd9c8cc238f3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单 |
| 物理表 | `orders` |
| 数据库 schema | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 212 个 |
| 关联引用 | 52 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `orderBpmCurAuditors` | `voucher.order.IBpmCurrentAuditorOrder` | composition |
| `rebateSum` | `voucher.order.RebateSum` | composition |
| `orderAttachments` | `voucher.order.OrderAttachment` | composition |
| `productRebateRecords` | `voucher.order.ProductRebateRecord` | composition |
| `paymentStatusRecords` | `voucher.order.OrderPaymentStatus` | composition |
| `paymentSchedules` | `voucher.order.PaymentSchedules` | composition |
| `paymentExeDetail` | `voucher.order.PaymentExeDetail` | composition |
| `rebateDetails` | `voucher.order.RebateDetail` | composition |
| `headFreeItem` | `voucher.order.OrderFreeDefine` | composition |
| `statusRecords` | `voucher.order.OrderStatus` | composition |
| `orderPrices` | `voucher.order.OrderPrice` | composition |
| `clueParticipantList` | `voucher.order.ClueParticipant` | composition |
| `headItem` | `voucher.order.OrderDefine` | composition |
| `signSubjects` | `voucher.order.SignSubject` | composition |
| `orderDetails` | `voucher.order.OrderDetail` | composition |
| `orderBpmSteps` | `voucher.order.OrderIBpmStep` | composition |
| `rebateRecords` | `voucher.order.RebateRecord` | composition |
| `paymentVerifications` | `voucher.order.PaymentVerification` | composition |
| `orderDetailGroups` | `voucher.order.OrderDetailGroup` | composition |

## 关联引用 (52个)

| 字段名 | 引用类型 |
|--------|---------|
| `cShippingChoiceId` | `productcenter.aa_sendtranswayref` |
| `` | `` |
| `iModifierId` | `` |
| `iOrderShippingAddressId` | `` |
| `iReceiveAgreementId` | `ucfbasedoc.bd_receiveagreementref` |
| `iSaleAreaId` | `productcenter.aa_salearearef` |
| `iCloserId` | `` |
| `iOrderInvoiceId` | `` |
| `iCorpContactId` | `ucf-staff-center.bd_staff_ref` |
| `iOrderErpId` | `` |
| `bdInvoiceTypeId` | `ucfbasedoc.bd_invoiceref` |
| `iAgentRelationId` | `` |
| `iInvoiceAgentId` | `productcenter.merchantRef` |
| `iReceiveContacterId` | `` |
| `iAuditorId` | `` |
| `iSaleDepartmentId` | `ucf-org-center.bd_adminorgsharetreeref` |
| `iSettlementOrgId` | `udinghuo.financeOrgref` |
| `iAgentId` | `productcenter.merchantRef` |
| `deliveryMethod` | `uscmpub.usp_deliverymethodref` |
| `orderDefineCharacter` | `` |
| `iSubmiterId` | `bip-usercenter.aa_user` |
| `bizFlowId` | `u8c-baseservice.bf_businessFlow_ref` |
| `iSynSourceOrg` | `upu.aa_orgpur` |
| `iSettlementId` | `productcenter.aa_settlemethodref` |
| `endAreaId` | `productcenter.base_shipregionref` |
| `iCustomerId` | `productcenter.merchantRef` |
| `cProjectId` | `ucfbasedoc.bd_outer_projectcardMCref` |
| `iTransactionTypeId` | `transtype.bd_billtyperef` |
| `ytenant_id` | `` |
| `iReceiveStore` | `yxybase.aa_storeterminal` |
| `iReceiverCust` | `productcenter.merchantRef` |
| `iSalesOrgId` | `udinghuo.saleOrgref` |

## 继承接口 (15个, 30字段)

- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **关闭信息** (`base.itf.IClosing`)
  - `close_Date` → `close_Date`
  - `closer` → `closer`
  - `` → ``
  - `close_time` → `close_time`
- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId`
  - `isFlowCoreBill` → `isFlowCoreBill`
- **商家相关** (`base.itf.IShop`)
  - `iShopID` → `iShopID`
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`
- **条形码** (`ucfbase.ucfbaseItf.IBarCode`)
  - `bar_code` → `bar_code`
- **客户Id** (`uorder.voucher.IAgentId`)
  - `iAgentId` → `iAgentId`
- **交换信息** (`gscm.itf.IExchangeInfo`)
  - `exchangeStatus` → `exchangeStatus`
  - `failedInfo` → `failedInfo`
- **伙伴表头接口** (`uorder.voucher.ICust`)
  - `iCustomerId` → `iCustomerId`
  - `iReceiverCust` → `iReceiverCust`
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
- **贸易路径Id接口** (`sccs.multitrade.ITradeRouteID`)
  - `` → ``
  - `throw_status` → `throw_status`
  - `` → ``
  - `` → ``

## 字段列表（按类型分组）

> 共 212 个直连字段

### 文本字段 (69个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `cOrderNo` | `cOrderNo` | String | 单据编号 |
| `transactionTypeId_name` | `transactionTypeId_name` | String | 交易类型 |
| `cReceiveContacter` | `cReceiveContacter` | String | 客户联系人 |
| `cReceiveContacterPhone` | `cReceiveContacterPhone` | String | 客户联系电话 |
| `cCorpContactUserName` | `cCorpContactUserName` | String | 销售业务员 |
| `receievinvoicemobile` | `receievinvoicemobile` | String | 收票手机号 |
| `receievinvoiceemail` | `receievinvoiceemail` | String | 收票邮箱 |
| `cRetailAgentName` | `cRetailAgentName` | String | 散户名称 |
| `cReceiveCode` | `cReceiveCode` | String | 收货地址编码 |
| `cChangeStatus` | `cChangeStatus` | String | 变更状态 |
| `closeReason` | `closeReason` | String | 订单关闭原因 |
| `out_sys_code` | `out_sys_code` | String | 外部来源编码 |
| `out_sys_id` | `out_sys_id` | String | 外部来源线索 |
| `out_sys_version` | `out_sys_version` | String | 外部来源版本 |
| `out_sys_type` | `out_sys_type` | String | 外部来源类型 |
| `cBizName` | `cBizName` | String | 商家名称 |
| `cPurchaseNo` | `cPurchaseNo` | String | 客户采购订单号 |
| `dHopeReceiveDate` | `dHopeReceiveDate` | String | 希望到货日期 |
| `cSettlementCode` | `cSettlementCode` | String | 结算方式编码 |
| `cOrderPayType` | `cOrderPayType` | String | 支付方式 |
| `cShippingChoiceCode` | `cShippingChoiceCode` | String | 发运方式编码 |
| `memo` | `memo` | String | 备注 |
| `cCorpContactUserErpCode` | `cCorpContactUserErpCode` | String | 业务员erp编码 |
| `cNextStatus` | `cNextStatus` | String | 订单状态编码 |
| `cNextStatusName` | `cNextStatusName` | String | 订单状态 |
| `cPayStatusCode` | `cPayStatusCode` | String | 支付状态 |
| `cOpposeMemo` | `cOpposeMemo` | String | 订单取消原因 |
| `cOccupyInventory` | `cOccupyInventory` | String | 库存占用时机 |
| `bar_code` | `bar_code` | String | 单据条码 |
| `lowCodeFlowId` | `lowCodeFlowId` | String | 低代码流程ID |
| `cReceiver` | `cReceiver` | String | 收货人 |
| `cReceiveMobile` | `cReceiveMobile` | String | 收货电话 |
| `cReceiveTelePhone` | `cReceiveTelePhone` | String | 收货人固定电话 |
| `cReceiveAddress` | `cReceiveAddress` | String | 收货地址 |
| `cReceiveZipCode` | `cReceiveZipCode` | String | 收货人邮编 |
| `cAddress` | `cAddress` | String | 发票信息注册地址 |
| `cTelephone` | `cTelephone` | String | 发票信息注册电话 |
| `cUserBankName` | `cUserBankName` | String | 发票信息开户名 |
| `cBankCode` | `cBankCode` | String | 发票信息开户行编码 |
| `cInvoiceType` | `cInvoiceType` | String | 发票类型 |
| `cInvoiceTitle` | `cInvoiceTitle` | String | 发票抬头 |
| `cTaxNum` | `cTaxNum` | String | 纳税识别号 |
| `cBankName` | `cBankName` | String | 开户银行 |
| `cSubBankName` | `cSubBankName` | String | 开户支行 |
| `cBankAccount` | `cBankAccount` | String | 银行账号 |
| `cInvoiceTelephone` | `cInvoiceTelephone` | String | 营业电话 |
| `cInvoiceAddress` | `cInvoiceAddress` | String | 营业地址 |
| `cCreator` | `cCreator` | String | 制单人 |
| `` | `auditor` | String | 审批人 |
| `cCloser` | `cCloser` | String | 关闭人 |
| `cModifier` | `cModifier` | String | 修改人 |
| `cSourceType` | `cSourceType` | String | 来源单据类型 |
| `cSrcBillNO` | `cSrcBillNO` | String | 来源单据号 |
| `failedInfo` | `failedInfo` | String | 交换失败原因 |
| `iErpSynStatusCode` | `iErpSynStatusCode` | String | ERP同步状态编码 |
| `iErpSynStatus` | `iErpSynStatus` | String | ERP同步状态 |
| `iErpSynFailInfo` | `iErpSynFailInfo` | String | ERP同步失败原因 |
| `cStatusCode` | `cStatusCode` | String | 订单当前状态码 |
| `dOrderDate` | `dOrderDate` | String | 订单日期 |
| `cParentOrderNo` | `cParentOrderNo` | String | 拆单来源订单号 |
| `cSeparatePromotionType` | `cSeparatePromotionType` | String | 拆单规则标识 |
| `dConfirmDate` | `dConfirmDate` | String | 订单确认时间 |
| `dPayDate` | `dPayDate` | String | 订单付款时间 |
| `cSettVoucherType` | `cSettVoucherType` | String | 结算类型 |
| `cInvoiceContent` | `cInvoiceContent` | String | 发票内容 |
| `dDeliveryDate` | `dDeliveryDate` | String | 交货日期 |
| `cOutSysKey` | `cOutSysKey` | String | 来源系统 |
| `cErpTS` | `cErpTS` | String | 上传订单时间戳 |
| `cDownloadMsg` | `cDownloadMsg` | String | 下载返回消息 |

### 引用字段 (32个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `iAgentId` | `iAgentId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 客户 |
| `iSalesOrgId` | `iSalesOrgId` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 | 销售组织 |
| `iSaleDepartmentId` | `iSaleDepartmentId` | ca871996-b447-42f9-8dac-dd7c21ee0662 | 销售部门id |
| `iCorpContactId` | `iCorpContactId` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | 销售业务员 |
| `iTransactionTypeId` | `iTransactionTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 交易类型id |
| `iReceiveContacterId` | `iReceiveContacterId` | 7733d1db-8871-437a-ba65-dbcad95bf0bc | 客户联系人id |
| `cProjectId` | `cProjectId` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | 项目Id |
| `` | `tradeRouteID` | c69f1d6a-783c-4f79-b446-b4da14cb7fff | 贸易路径Id |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `iSaleAreaId` | `iSaleAreaId` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | 销售区域 |
| `iCustomerId` | `iCustomerId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 伙伴 |
| `iAgentRelationId` | `iAgentRelationId` | c6b2ce53-9c17-45ca-b313-c775c94bc001 | 客户交易关系id |
| `iSettlementOrgId` | `iSettlementOrgId` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | 开票组织id |
| `iReceiveAgreementId` | `iReceiveAgreementId` | e336f779-f1e5-4530-b6d5-fa2e5ed1c302 | 收款协议id |
| `iSettlementId` | `iSettlementId` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | 结算方式id |
| `cShippingChoiceId` | `cShippingChoiceId` | aa2f6845-347d-499f-a5b2-964b84747d99 | 发运方式id |
| `endAreaId` | `endAreaId` | 373171f0-f497-4bab-bda7-ff4b6489c13e | 目的地运输区域id |
| `deliveryMethod` | `deliveryMethod` | 19cfc516-55f8-446a-9c3e-1ca20d8bd941 | 交付方式 |
| `bizFlowId` | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | 流程ID |
| `iReceiverCust` | `iReceiverCust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 收货客户 |
| `iReceiveStore` | `iReceiveStore` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | 客户收货门店Id |
| `iInvoiceAgentId` | `iInvoiceAgentId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 开票客户id |
| `bdInvoiceTypeId` | `bdInvoiceTypeId` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b | 发票类型id |
| `iSubmiterId` | `iSubmiterId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人ID |
| `iAuditorId` | `iAuditorId` | 54800425-15da-4742-ae89-059d05e77c9b | 审核人ID |
| `iCloserId` | `iCloserId` | 54800425-15da-4742-ae89-059d05e77c9b | 关闭人ID |
| `iModifierId` | `iModifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人id |
| `iSynSourceOrg` | `iSynSourceOrg` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | 协同来源组织id |
| `iAgentId` | `iAgentId` | 7cc86f92-b244-4581-8dcf-a6b7cb76516f | 客户权限 |
| `iOrderInvoiceId` | `iOrderInvoiceId` | f061453c-0437-4ef6-bbf1-1dfb7e7e4fa5 | 发票信息 |
| `iOrderShippingAddressId` | `iOrderShippingAddressId` | 3064b876-dda8-4088-a560-3087a271e28f | 收货地址信息 |
| `iOrderErpId` | `iOrderErpId` | 39c1347a-d8a3-4271-abbe-4c5a351ba40d | 订单erp |

### 日期字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `vouchdate` | `vouchdate` | Date | 单据日期 |
| `exchRateDate` | `exchRateDate` | Date | 汇率日期 |
| `dSendDate` | `dSendDate` | Date | 计划发货日期 |
| `dCreated` | `dCreated` | Date | 创建日期 |
| `audit_date` | `audit_date` | Date | 审批日期 |
| `dClose_Date` | `dClose_Date` | Date | 关闭日期 |
| `dModifiedDate` | `dModifiedDate` | Date | 修改日期 |

### 布尔字段 (17个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bSynSettlement` | `bSynSettlement` | Boolean | 是否同步待结算 |
| `isDownPayment` | `isDownPayment` | Boolean | 必有定金 |
| `bIsAccDeliveryPlan` | `bIsAccDeliveryPlan` | Boolean | 按发货计划发货 |
| `isDespatch` | `isDespatch` | Boolean | 启用发运管理 |
| `` | `isWfControlled` | Boolean | 是否审批流控制 |
| `isSalePriceModify` | `isSalePriceModify` | Boolean | 报价支持手工录入 |
| `bEffectStock` | `bEffectStock` | Boolean | 影响可用量参数 |
| `isAllowOrginReplenish` | `isAllowOrginReplenish` | Boolean | 是否允许原单补货 |
| `isLowestPrice` | `isLowestPrice` | Boolean | 是否超最低售价 |
| `bIsChangeShipmentPlan` | `bIsChangeShipmentPlan` | Boolean | 变更发货计划 |
| `isFlowCoreBill` | `isFlowCoreBill` | Boolean | 是否流程核心单据 |
| `bModifyInvoiceType` | `bModifyInvoiceType` | Boolean | 发票类型可改 |
| `bLockIn` | `bLockIn` | Boolean | 标记锁 |
| `isHaveDelivery` | `isHaveDelivery` | Boolean | 是否存在发货单 |
| `bFinishDelivery` | `bFinishDelivery` | Boolean | 订单是否发完货 |
| `bDownloadU8` | `bDownloadU8` | Boolean | erp是否下载 |
| `isDownSuccess` | `isDownSuccess` | Boolean | 是否下载成功 |

### 整数 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `settlementVersion` | `settlementVersion` | Integer | 销售结算单版本 |
| `throw_status` | `throw_status` | Integer | 抛单状态 |
| `ichangeVersion` | `ichangeVersion` | Integer | 变更版本号 |
| `printCount` | `printCount` | Integer | 打印次数 |
| `iCurrentStatus` | `iCurrentStatus` | Integer | 当前状态位置 |
| `iPoints` | `iPoints` | Integer | 积分 |

### 短整数 (17个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `trade_throw_version` | `trade_throw_version` | Short | 抛单版本号 |
| `billBusinessType` | `billBusinessType` | Short | 业务类型 |
| `` | `isEndTrade` | Short | 是否末级 |
| `taxSettingType` | `taxSettingType` | Short | 计税方式 |
| `` | `status` | Short | 单据状态 |
| `` | `verifystate` | Short | 审批状态 |
| `expiredayConfirmType` | `expiredayConfirmType` | Short | 到期日确定方式 |
| `oadayConfirmType` | `oadayConfirmType` | Short | 出账日确定方式 |
| `version` | `version` | Short | 版本号 |
| `iSubmitSource` | `iSubmitSource` | Short | 制单人来源 |
| `` | `returncount` | Short | 退回次数 |
| `cCreateSource` | `cCreateSource` | Short | 来源系统 |
| `iSrcbillType` | `iSrcbillType` | Short | 来源单据类型 |
| `exchangeStatus` | `exchangeStatus` | Short | 交换状态 |
| `iInvoiceUpcType` | `iInvoiceUpcType` | Short | 发票类型 |
| `cDownloadSource` | `cDownloadSource` | Short | 下载去向 |
| `iDeleted` | `iDeleted` | Short | 是否删除 |

### 长整数 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | 主表关联标识 |
| `iBizId` | `iBizId` | Long | 商家id |
| `iShopID` | `iShopID` | Long | 商家 |
| `iCorpId` | `iCorpId` | Long | 租户 |
| `` | `tplid` | Long | 模板id |
| `iReceiveId` | `iReceiveId` | Long | 客户收货地址id |
| `iSynSourceTenant` | `iSynSourceTenant` | Long | 协同来源租户 |
| `cSrcBillId` | `cSrcBillId` | Long | 来源单据ID |
| `iConfirmerId` | `iConfirmerId` | Long | 确认人 |

### 数值字段 (25个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `fDownPayment` | `fDownPayment` | Decimal | 定金金额 |
| `` | `tradeRouteLineno` | Decimal | 站点 |
| `wholePreGProfitRate` | `wholePreGProfitRate` | Decimal | 预估毛利率% |
| `wholeNatPayEMoney` | `wholeNatPayEMoney` | Decimal | 应付费用本币无税金额 |
| `wholePreGProfit` | `wholePreGProfit` | Decimal | 预估毛利 |
| `wholeNatReceiEMoney` | `wholeNatReceiEMoney` | Decimal | 应收费用本币无税金额 |
| `wholeNatTaxPayEMoney` | `wholeNatTaxPayEMoney` | Decimal | 应付费用本币含税金额 |
| `fDownPaymentRatio` | `fDownPaymentRatio` | Decimal | 定金比例 |
| `wholeNatTaxReceiEMoney` | `wholeNatTaxReceiEMoney` | Decimal | 应收费用本币含税金额 |
| `fTotalMoney` | `fTotalMoney` | Decimal | 总金额 |
| `fPayMoney` | `fPayMoney` | Decimal | 合计含税金额 |
| `fRealMoney` | `fRealMoney` | Decimal | 应收金额 |
| `fPromotionMoney` | `fPromotionMoney` | Decimal | 总优惠金额 |
| `fParticularlyMoney` | `fParticularlyMoney` | Decimal | 特殊优惠 |
| `fRebateMoney` | `fRebateMoney` | Decimal | 折扣返利金额 |
| `fRebateCashMoney` | `fRebateCashMoney` | Decimal | 抵现返利金额 |
| `fPointsMoney` | `fPointsMoney` | Decimal | 积分抵扣金额 |
| `fUnConfirmPrice` | `fUnConfirmPrice` | Decimal | 收款待确认金额 |
| `fConfirmPrice` | `fConfirmPrice` | Decimal | 收款已确认金额 |
| `fMoneyInvWriteOff` | `fMoneyInvWriteOff` | Decimal | 应收冲销金额 |
| `fReight` | `fReight` | Decimal | 运费 |
| `fCouponsMoney` | `fCouponsMoney` | Decimal | 优惠劵 |
| `iInvoiceMoney` | `iInvoiceMoney` | Decimal | 发票金额 |
| `fOrderPayMoney` | `fOrderPayMoney` | Decimal | 商品实付金额 |
| `fOrderRealMoney` | `fOrderRealMoney` | Decimal | 商品应付金额 |

### timestamp (8个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `priceDate` | DateTime | 定价日期 |
| `dCreatedTime` | `dCreatedTime` | DateTime | 创建时间 |
| `audit_time` | `audit_time` | DateTime | 审批时间 |
| `dClose_time` | `dClose_time` | DateTime | 关闭时间 |
| `dModifyTime` | `dModifyTime` | DateTime | 修改时间 |
| `pubuts` | `pubuts` | DateTime | 时间戳 |
| `dOrderCreateDate` | `dOrderCreateDate` | DateTime | 单据日期(订货端生成单号使用) |
| `cDownloadU8Date` | `cDownloadU8Date` | DateTime | 下载时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `orderDefineCharacter` | `orderDefineCharacter` | 2c1b4ebc-ed4d-4625-a114-d5c465af955f | 表头自定义项特征组 |

### other (21个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `iInvoiceTitleType` | `iInvoiceTitleType` | EnterpriseNature | 抬头类型 |
| `cSource` | `cSource` | OrderRequestTypeEnum | 单据来源 |
| `` | `` | a70d90a5-ff18-4e2d-adb0-8c848d32816a | 参与人 |
| `` | `` | 48b2affa-fd20-4768-b776-fc1631cbb0ca | 销售订单表头自由自定义项 |
| `` | `` | db1206db-69eb-4330-9657-a1d7e1df5c9c | 销售订单表头自定义项 |
| `` | `` | 50ee58cc-3338-4970-94ee-09906dbc1d18 | 订单附件 |
| `` | `` | fa3bcc7a-621d-47cb-906b-7873586dd51d | 当前审批人 |
| `` | `` | 0f93d398-d158-4523-ad8c-31451f469f50 | 业务阶段 |
| `` | `` | a8ea0db2-1889-4f32-86bf-9d79e9fe9c10 | 订单分组 |
| `` | `` | 3722d563-08aa-453d-ac82-6b8cf906b1ab | 订单详情 |
| `` | `` | 1548e4ce-ab40-489d-b471-cb7adc2ee600 | 订单金额 |
| `` | `` | c0f2f9bb-3068-444b-b952-04d80a0d9dca | 收款执行明细 |
| `` | `` | ba5a59f6-51e2-4155-af7e-4ada5c4e3251 | 收款协议子表 |
| `` | `` | c62d2a20-bf4d-4563-8130-2ed3857c04b8 | 订单支付状态 |
| `` | `` | b7e304b7-b213-4dba-90b8-f49b69ec6303 | 支付核销表 |
| `` | `` | 1e87fc9c-75e1-42df-a93a-b639c2d56153 | 商品返利单记录 |
| `` | `` | 621fbeeb-cba3-4437-aebc-abe37beac8f9 | 返利明细 |
| `` | `` | 1cf71047-9876-4e34-be78-b7483c24682f | 返利单记录 |
| `` | `` | 5ad7362e-f4f7-4a5b-b0b3-c98a5c06aedb | 返利汇总 |
| `` | `` | eef03ba3-9a2a-4e14-bcd8-055774334e8f | 合同签署主体 |
| `` | `` | e5756ebe-a6f4-4d20-bcb7-4ec2ddedfc80 | 订单状态 |
