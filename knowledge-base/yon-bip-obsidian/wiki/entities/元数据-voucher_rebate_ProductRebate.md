---
tags: [BIP, 元数据, 数据字典, voucher.rebate.ProductRebate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商品返利 (`voucher.rebate.ProductRebate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rebate` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：`66749095-27d5-4a12-8f72-ed77a01bb644`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商品返利 |
| 物理表 | `rebate` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 98 个 |
| 子表 | 4 个 |
| 关联引用 | 23 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `WhiteProduct` | `voucher.rebate.RebateWhiteProduct` | composition |
| `rebateReturnProductRecords` | `voucher.rebate.RebateReturnProductRecord` | composition |
| `headItem` | `voucher.rebate.ProductRebateDefine` | composition |
| `rebateReturnProducts` | `voucher.rebate.RebateReturnProduct` | composition |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `iExpenseItemId` | `finbd.bd_expenseitemref` |
| `iAgentId` | `aa_merchantbill` |
| `ytenant_id` | `` |
| `iSubmiterId` | `` |
| `iModifierId` | `` |
| `rebateDefineCharacter` | `` |
| `finalesponsibleOrgId` | `` |
| `iShareSettingId` | `rebate_sharesettingref` |
| `iConfirmUserId` | `` |
| `iCostCenterId` | `finbd.bd_costcenterref` |
| `iCloserId` | `` |
| `iSettlementOrgId` | `financeOrgref` |
| `cDomesticPk` | `` |
| `iMarketingActiveId` | `yycrm.mka_activityref` |
| `cOriginalPk` | `ucfbasedoc.bd_currencytenantref` |
| `department` | `` |
| `iExpenseItemTypeId` | `finbd.bd_expenseitemtyperef` |
| `rebateRecord` | `` |
| `iSalesOrgId` | `market_salesorgref` |

## 字段列表（按类型分组）

> 共 98 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `cBizName` | `cBizName` | `bizName` | 供应商名称 |
| `failedInfo` | `failedInfo` | `failedInfo` | 失败信息 |
| `cCloser` | `cCloser` | `closer` | 关闭人 |
| `cRebateNo` | `cRebateNo` | `code` | 返利单号 |
| `cCreator` | `cCreator` | `creator` | 创建人 |
| `cDomesticCode` | `cDomesticCode` | `domesticCode` | 本币编码 |
| `cDomesticName` | `cDomesticName` | `domesticName` | 本币名称 |
| `cMemo` | `cMemo` | `memo` | 备注 |
| `cModifier` | `cModifier` | `modifier` | 修改人 |
| `cOrderNos` | `cOrderNos` | `orderNos` | 返利订单号集合 |
| `cOriginalCode` | `cOriginalCode` | `originalCode` | 原币编码 |
| `cOriginalName` | `cOriginalName` | `originalName` | 原币名称 |
| `cOutSysKey` | `cOutSysKey` | `outSysKey` | 接口唯一创建标识 |
| `cPaymentFinanceCode` | `cPaymentFinanceCode` | `paymentFinanceCode` | 财务收款单code |
| `cRebateCode` | `cRebateCode` | `rebateCode` | 返利单类型 |
| `cRebateStatus` | `cRebateStatus` | `rebateStatus` | 返利状态 |
| `settlementWayErpCode` | `settlementWayErpCode` | `settlementWayErpCode` | 结算方式编码 |
| `cSourceNo` | `cSourceNo` | `sourceNo` | 来源单号 |
| `cUseType` | `cUseType` | `useType` | 应用类型(增加,扣减) |
| `cUseWayCode` | `cUseWayCode` | `useWayCode` | 兑付方式 |
| `useWayName` | `useWayName` | `useWayName` | 应用方式名称 |
| `cVoucherType` | `cVoucherType` | `voucherType` | 单据类型 |
| `voucherTypeName` | `voucherTypeName` | `voucherTypeName` | 单据类型名称 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iAgentId` | `iAgentId` | `agentId` | 客户名称 |
| `iConfirmUserId` | `iConfirmUserId` | `auditorId` | 审核人ID |
| `finalesponsibleOrgId` | `finalesponsibleOrgId` | `finalesponsibleOrgId` | 最终承担组织 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `iCloserId` | `iCloserId` | `closerId` | 关闭人Id |
| `iCostCenterId` | `iCostCenterId` | `costCenterId` | 成本中心 |
| `iSubmiterId` | `iSubmiterId` | `creatorId` | 创建人ID |
| `cDomesticPk` | `cDomesticPk` | `domesticPk` | 本币pk |
| `iExpenseItemId` | `iExpenseItemId` | `expenseItemId` | 费用项目 |
| `iExpenseItemTypeId` | `iExpenseItemTypeId` | `expenseItemTypeId` | 费用项目类别 |
| `iMarketingActiveId` | `iMarketingActiveId` | `marketingActiveId` | 营销活动 |
| `iModifierId` | `iModifierId` | `modifierId` | 修改人id |
| `cOriginalPk` | `cOriginalPk` | `originalPk` | 币种 |
| `rebateRecord` | `rebateRecord` | `rebateRecord` | 返利记录 |
| `iSalesOrgId` | `iSalesOrgId` | `salesOrgId` | 销售组织 |
| `iSettlementOrgId` | `iSettlementOrgId` | `settlementOrgId` | 开票组织 |
| `iShareSettingId` | `iShareSettingId` | `shareSettingId` | 账户使用规则 |
| `department` | `department` | `department` | 部门 |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditDate` | `auditDate` | `auditDate` | 审核日期 |
| `dConfirmDate` | `dConfirmDate` | `auditTime` | 审核日期 |
| `dCloseDate` | `dCloseDate` | `closeDate` | 关闭日期 |
| `dCreateDate` | `dCreateDate` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `dValidEndDate` | `dValidEndDate` | `validEndDate` | 有效期结束日期 |
| `dValidStartDate` | `dValidStartDate` | `validStartDate` | 有效期开始日期 |
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canUsable` | `canUsable` | `canUsable` | 是否可用 |
| `hasUsed` | `hasUsed` | `hasUsed` | 是否使用 |
| `isPastDue` | `isPastDue` | `isPastDue` | 是否过期 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `isWiteList` | `isWiteList` | `isWiteList` | 是否是白名单  ture白名单  false 黑名单 |
| `isPlatformLower` | `isPlatformLower` | `platformLower` | 是否是平台下发 |
| `shareUseRebate` | `shareUseRebate` | `shareUseRebate` | 允许下级客户使用 |
| `shareOrgRebate` | `shareOrgRebate` | `shareOrgRebate` | 允许下级组织使用 |
| `canUsable` | `canUsable` | `valid` | 是否失效 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceBillSettlementType` | `sourceBillSettlementType` | `sourceBillSettlementType` | 来源单据结算类型 |
| `payType` | `payType` | `payType` | 支付方式 |
| `version` | `version` | `version` | 版本 |

### 短整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `paymentType` | `paymentType` | `paymentType` | 收款单类型 |
| `messageType` | `messageType` | `messageType` | 消息类型 |
| `useRule` | `useRule` | `useRule` | 是否使用分摊规则 |
| `exchangeStatus` | `exchangeStatus` | `exchangeStatus` | 交换状态 |
| `ideleted` | `ideleted` | `iDeleted` | 删除标记 |
| `` | `returncount` | `returncount` | 退回次数 |
| `iSourceType` | `iSourceType` | `sourceType` | 返利来源类型 |
| `` | `status` | `status` | 单据状态 |
| `usmpPayModel` | `usmpPayModel` | `usmpPayModel` | 上游单据类型 |
| `` | `verifystate` | `verifystate` | 审批状态 |

### 长整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iAgentRelationId` | `iAgentRelationId` | `agentRelationId` | 客户交易关系id |
| `iBizId` | `iBizId` | `bizId` | 供应商id |
| `cSourceDetailId` | `cSourceDetailId` | `sourceDetailId` | 来源单ID |
| `iPaymentFinanceId` | `iPaymentFinanceId` | `paymentFinanceId` | 财务收款单id |
| `iRebateSourceId` | `iRebateSourceId` | `rebateSourceId` | 返利来源id |
| `iShopID` | `iShopID` | `shop` | 商家 |
| `` | `tplid` | `tplid` | 模板id |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |
| `id` | `id` | `id` | 商品返利商品行Id |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fExchangeRate` | `fExchangeRate` | `exchangeRate` | 汇率 |
| `fRebateQuantity` | `fRebateQuantity` | `rebateQuantity` | 返货数量 |
| `fOrderRebateMoney` | `fOrderRebateMoney` | `orderRebateMoney` | 此次使用金额 |
| `fRebateMoney` | `fRebateMoney` | `rebateMoney` | 返货金额 |
| `fRebateMoneyDomestic` | `fRebateMoneyDomestic` | `rebateMoneyDomestic` | 本币金额 |
| `fSurplusMoney` | `fSurplusMoney` | `surplusMoney` | 可用金额 |
| `usedMoney` | `usedMoney` | `usedMoney` | 返利使用金额 |
| `iSurplusQuantity` | `iSurplusQuantity` | `surplusQuantity` | 可用数量 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCloseTime` | `dCloseTime` | `closeTime` | 关闭时间 |
| `dCreatedTime` | `dCreatedTime` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rebateDefineCharacter` | `rebateDefineCharacter` | `rebateDefineCharacter` | 自定义项特征属性组 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `WhiteProduct` | 例外商品 |
| `` | `` | `headItem` | 营销费用自由自定义项 |
| `` | `` | `rebateReturnProductRecords` | 返利回退商品记录 |
| `` | `` | `rebateReturnProducts` | 返利回退商品 |
