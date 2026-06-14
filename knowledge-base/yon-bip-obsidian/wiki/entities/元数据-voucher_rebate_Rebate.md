---
tags: [BIP, 元数据, 数据字典, voucher.rebate.Rebate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 返利 (`voucher.rebate.Rebate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rebate` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利 |
| 物理表 | `rebate` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 93 个 |
| 子表 | 0 个 |
| 关联引用 | 18 个 |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `iExpenseItemId` | `finbd.bd_expenseitemref` |
| `iAgentId` | `aa_merchantbill` |
| `ytenant_id` | `` |
| `iSubmiterId` | `` |
| `iModifierId` | `` |
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

## 继承接口 (8个, 14字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **关闭信息** (`base.itf.IClosing`)
  - `close_Date` → `close_Date`
  - `closer` → `closer`
  - `` → ``
  - `close_time` → `close_time`
- **客户Id** (`uorder.voucher.IAgentId`)
  - `iAgentId` → `iAgentId`
- **交换信息** (`gscm.itf.IExchangeInfo`)
  - `exchangeStatus` → `exchangeStatus`
  - `failedInfo` → `failedInfo`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **客户费用单隔离** (`voucher.rebate.iRebateShop`)
  - `iShopID` → `iShopID`

## 字段列表（按类型分组）

> 共 93 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cBizName` | `cBizName` | `bizName` | 供应商名称 |
| `cDomesticCode` | `cDomesticCode` | `domesticCode` | 本币编码 |
| `cDomesticName` | `cDomesticName` | `domesticName` | 本币名称 |
| `cOrderNos` | `cOrderNos` | `orderNos` | 返利订单号集合 |
| `cOriginalCode` | `cOriginalCode` | `originalCode` | 原币编码 |
| `cOriginalName` | `cOriginalName` | `originalName` | 原币名称 |
| `cOutSysKey` | `cOutSysKey` | `outSysKey` | 接口唯一创建标识 |
| `cPaymentFinanceCode` | `cPaymentFinanceCode` | `paymentFinanceCode` | 财务收款单code |
| `cRebateStatus` | `cRebateStatus` | `rebateStatus` | 返利状态 |
| `settlementWayErpCode` | `settlementWayErpCode` | `settlementWayErpCode` | 结算方式编码 |
| `cUseType` | `cUseType` | `useType` | 应用类型(增加,扣减) |
| `useWayName` | `useWayName` | `useWayName` | 应用方式名称 |
| `cVoucherType` | `cVoucherType` | `voucherType` | 单据类型 |
| `voucherTypeName` | `voucherTypeName` | `voucherTypeName` | 单据类型名称 |
| `cRebateCode` | `cRebateCode` | `rebateCode` | 客户费用单类型 |
| `cUseWayCode` | `cUseWayCode` | `useWayCode` | 兑付方式 |
| `cRebateNo` | `cRebateNo` | `code` | 客户费用单号 |
| `cMemo` | `cMemo` | `memo` | 备注 |
| `cSourceNo` | `cSourceNo` | `sourceNo` | 来源单号 |
| `cCreator` | `cCreator` | `creator` | 制单人 |
| `` | `auditor` | `auditor` | 审批人 |
| `cModifier` | `cModifier` | `modifier` | 修改人 |
| `cCloser` | `cCloser` | `closer` | 关闭人 |
| `failedInfo` | `failedInfo` | `failedInfo` | 失败信息 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCloserId` | `iCloserId` | `closerId` | 关闭人Id |
| `cDomesticPk` | `cDomesticPk` | `domesticPk` | 本币pk |
| `rebateRecord` | `rebateRecord` | `rebateRecord` | 返利记录 |
| `iShareSettingId` | `iShareSettingId` | `shareSettingId` | 分摊设置 |
| `iSalesOrgId` | `iSalesOrgId` | `salesOrgId` | 销售组织 |
| `iAgentId` | `iAgentId` | `agentId` | 客户id |
| `iSettlementOrgId` | `iSettlementOrgId` | `settlementOrgId` | 开票组织id |
| `cOriginalPk` | `cOriginalPk` | `originalPk` | 客户费用单币种pk |
| `iCostCenterId` | `iCostCenterId` | `costCenterId` | 成本中心id |
| `iExpenseItemTypeId` | `iExpenseItemTypeId` | `expenseItemTypeId` | 费用项目类别id |
| `iMarketingActiveId` | `iMarketingActiveId` | `marketingActiveId` | 营销活动id |
| `iExpenseItemId` | `iExpenseItemId` | `expenseItemId` | 费用项目id |
| `iSubmiterId` | `iSubmiterId` | `creatorId` | 创建人 |
| `iConfirmUserId` | `iConfirmUserId` | `auditorId` | 审核人ID |
| `iModifierId` | `iModifierId` | `modifierId` | 修改人id |
| `department` | `department` | `department` | 部门 |
| `finalesponsibleOrgId` | `finalesponsibleOrgId` | `finalesponsibleOrgId` | 最终承担组织 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |
| `dValidStartDate` | `dValidStartDate` | `validStartDate` | 有效期开始日期 |
| `dValidEndDate` | `dValidEndDate` | `validEndDate` | 有效期结束日期 |
| `dCreateDate` | `dCreateDate` | `createDate` | 创建日期 |
| `dConfirmDate` | `dConfirmDate` | `auditTime` | 审批时间 |
| `auditDate` | `auditDate` | `auditDate` | 审批日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `dCloseDate` | `dCloseDate` | `closeDate` | 关闭日期 |

### 布尔字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canUsable` | `canUsable` | `canUsable` | 是否可用 |
| `hasUsed` | `hasUsed` | `hasUsed` | 是否使用 |
| `isPastDue` | `isPastDue` | `isPastDue` | 是否过期 |
| `isPlatformLower` | `isPlatformLower` | `platformLower` | 是否是平台下发 |
| `canUsable` | `canUsable` | `valid` | 是否失效 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `isWiteList` | `isWiteList` | `isWiteList` | 使用商品设置 |
| `shareOrgRebate` | `shareOrgRebate` | `shareOrgRebate` | 允许下级组织使用 |
| `shareUseRebate` | `shareUseRebate` | `shareUseRebate` | 允许下级客户使用 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `payType` | `payType` | `payType` | 支付方式 |
| `version` | `version` | `version` | 版本 |
| `sourceBillSettlementType` | `sourceBillSettlementType` | `sourceBillSettlementType` | 来源单据结算类型 |

### 短整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ideleted` | `ideleted` | `iDeleted` | 删除标记 |
| `` | `returncount` | `returncount` | 退回次数 |
| `usmpPayModel` | `usmpPayModel` | `usmpPayModel` | 来源单类型 |
| `iSourceType` | `iSourceType` | `sourceType` | 来源类型 |
| `` | `status` | `status` | 客户费用单状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `exchangeStatus` | `exchangeStatus` | `exchangeStatus` | 交换状态 |
| `messageType` | `messageType` | `messageType` | 消息类型 |
| `paymentType` | `paymentType` | `paymentType` | 收款单类型 |
| `useRule` | `useRule` | `useRule` | 是否使用分摊规则 |

### 长整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iBizId` | `iBizId` | `bizId` | 供应商id |
| `iPaymentFinanceId` | `iPaymentFinanceId` | `paymentFinanceId` | 财务收款单id |
| `` | `tplid` | `tplid` | 模板id |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |
| `id` | `id` | `id` | 单据主表id |
| `iAgentRelationId` | `iAgentRelationId` | `agentRelationId` | 客户交易关系id |
| `iShopID` | `iShopID` | `shop` | 商家Id |
| `iRebateSourceId` | `iRebateSourceId` | `rebateSourceId` | 客户费用单来源id |
| `cSourceDetailId` | `cSourceDetailId` | `sourceDetailId` | 来源单ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fExchangeRate` | `fExchangeRate` | `exchangeRate` | 汇率 |
| `fOrderRebateMoney` | `fOrderRebateMoney` | `orderRebateMoney` | 此次使用金额 |
| `fRebateMoneyDomestic` | `fRebateMoneyDomestic` | `rebateMoneyDomestic` | 本币金额 |
| `fSurplusMoney` | `fSurplusMoney` | `surplusMoney` | 剩余金额 |
| `iSurplusQuantity` | `iSurplusQuantity` | `surplusQuantity` | 返货类型返利剩余数量 |
| `usedMoney` | `usedMoney` | `usedMoney` | 返利使用金额 |
| `fRebateMoney` | `fRebateMoney` | `rebateMoney` | 客户费用单金额 |
| `fRebateQuantity` | `fRebateQuantity` | `rebateQuantity` | 返货数量 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
| `dCreatedTime` | `dCreatedTime` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `dCloseTime` | `dCloseTime` | `closeTime` | 关闭时间 |
