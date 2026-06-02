---
tags: [BIP, 元数据, 数据字典, voucher, voucher.upaymentvoucher.PaymentVoucher]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款单 (`voucher.upaymentvoucher.PaymentVoucher`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `paymentvoucher` | 应用: `` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款单 |
| 物理表 | `paymentvoucher` |
| 应用 | `` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |

## 部署信息

- 部署时间: 2024-05-24 23:52:48:000
- 安装来源: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V3_R5_2312/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202405/202404161719_metadata_voucher-upaymentvoucher_delta.zip`

## 术语标记

`BusinessData`

## 依赖接口（3 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（78 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `actorageMoney` | actorageMoney | `fActorageMoney` | Decimal | `number` |  | true |
| 2 | `actorageMoneyDomestic` | actorageMoneyDomestic | `fActorageMoneyDomestic` | Decimal | `number` |  | true |
| 3 | `agentBank` | agentBank | `cAgentBank` | String | `text` |  | true |
| 4 | `agentBankBranch` | agentBankBranch | `cAgentBankBranch` | String | `text` |  | true |
| 5 | `agentBankCartNo` | agentBankCartNo | `cAgentBankCartNo` | String | `text` |  | true |
| 6 | `agentFinancialId` | agentFinancialId | `iAgentFinanId` | Long | `long` |  | true |
| 7 | `agentId` | agentId | `iAgentId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 8 | `agentRelationId` | agentRelationId | `iAgentRelationId` | Long | `long` |  | true |
| 9 | `allUsed` | allUsed | `bAllUsed` | Boolean | `switch` |  | true |
| 10 | `amount` | amount | `iAmount` | Decimal | `number` |  | true |
| 11 | `amountDomestic` | amountDomestic | `iAmountDomestic` | Decimal | `number` |  | true |
| 12 | `bizId` | bizId | `iBizId` | Long | `long` |  | true |
| 13 | `bizName` | biz名称 | `cBizName` | String | `text` |  | true |
| 14 | `buyerAccount` | buyerAccount | `cBuyerAccount` | String | `text` |  | true |
| 15 | `cjtNo` | jtNo | `cCJTNo` | String | `text` |  | true |
| 16 | `confirmUser` | onfirmUser | `iConfirmUserId` | Long | `long` |  | true |
| 17 | `corpBank` | orpBank | `cCorpBank` | String | `text` |  | true |
| 18 | `corpBankBranch` | orpBankBranch | `cCorpBankBranch` | String | `text` |  | true |
| 19 | `corpBankCartNo` | orpBankCartNo | `cCorpBankCartNo` | String | `text` |  | true |
| 20 | `corpFinancialId` | corpFinancialId | `iCorpFinanId` | String | `text` |  | true |
| 21 | `cyberbankId` | cyberbankId | `iCyberbankId` | Long | `long` |  | true |
| 22 | `domesticCode` | domestic编码 | `cDomesticCode` | String | `text` |  | true |
| 23 | `domesticName` | domestic名称 | `cDomesticName` | String | `text` |  | true |
| 24 | `domesticPk` | omesticPk(日期) | `cDomesticPk` | String | `text` |  | true |
| 25 | `downBeforeChange` | ownBeforeChange(日期) | `bDownBeforeChange` | Boolean | `switch` |  | true |
| 26 | `downSuccess` | ownSuccess(日期) | `bDownSuccess` | Boolean | `switch` |  | true |
| 27 | `download` | ownload(日期) | `bDownload` | Boolean | `switch` |  | true |
| 28 | `downloadDate` | downloadDate(日期) | `dDownloadDate` | DateTime | `timestamp` |  | true |
| 29 | `downloadMsg` | ownloadMsg(日期) | `cDownloadMsg` | String | `text` |  | true |
| 30 | `downloadSource` | ownloadSource(日期) | `iDownloadSource` | Short | `short` |  | true |
| 31 | `exchRate` | exchRate | `fExchangeRate` | Decimal | `number` |  | true |
| 32 | `financeId` | financeId | `iFinancePaymentId` | String | `text` |  | true |
| 33 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 34 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |  | true |
| 35 | `lockIn` | lockIn | `bLockIn` | Boolean | `switch` |  | true |
| 36 | `notUsedMoney` | notUsedMoney | `iNotUsedMoney` | Decimal | `number` |  | true |
| 37 | `notUsedMoneyDomestic` | notUsedMoneyDomestic | `iNotUsedMoneyDomestic` | Decimal | `number` |  | true |
| 38 | `orderId` | orderId | `iOrderId` | Long | `long` |  | true |
| 39 | `orderNo` | orderNo | `cOrderNo` | String | `text` |  | true |
| 40 | `originalCode` | original编码 | `cOriginalCode` | String | `text` |  | true |
| 41 | `originalName` | original名称 | `cOriginalName` | String | `text` |  | true |
| 42 | `originalPk` | originalPk | `cOriginalPk` | String | `text` |  | true |
| 43 | `outSysKey` | outSysKey | `cOutSysKey` | String | `text` |  | true |
| 44 | `payBusinessCode` | payBusiness编码 | `cPayBusinessCode` | String | `text` |  | true |
| 45 | `payCompleteDate` | payCompleteDate(日期) | `dPayCompleteDate` | DateTime | `timestamp` |  | true |
| 46 | `payCreateDate` | payCreateDate(日期) | `dPayCreateDate` | DateTime | `timestamp` |  | true |
| 47 | `payFinishDate` | payFinishDate(日期) | `dPayFinishDate` | DateTime | `timestamp` |  | true |
| 48 | `payMentStatusCode` | payMentStatus编码 | `iPayMentStatusCode` | Integer | `int` |  | true |
| 49 | `payNo` | payNo | `cPayNo` | String | `text` |  | true |
| 50 | `payResult` | payResult | `payResult` | String | `text` |  | true |
| 51 | `payType` | payType(类型) | `iPayType` | Integer | `int` |  | true |
| 52 | `payUserId` | payUserId | `iPayUserId` | Long | `long` |  | true |
| 53 | `payVoucherType` | payVoucherType(类型) | `cPayType` | String | `text` |  | true |
| 54 | `paymentVerificationss` | paymentVerificationss | `` | 8f3099f7-95ce-45dc-a18c-d318bb9c0586 | `` |  |  |
| 55 | `prudctDesc` | prudctDesc | `cPrudctDesc` | String | `text` |  | true |
| 56 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true |
| 57 | `realReceiverId` | realReceiverId | `iRealReceiverId` | Long | `long` |  | true |
| 58 | `realReceiverName` | realReceiver名称 | `cRealReceiverName` | String | `text` |  | true |
| 59 | `receiptDate` | receiptDate(日期) | `dReceiptDate` | DateTime | `timestamp` |  | true |
| 60 | `receiveType` | receiveType(类型) | `iReceiveType` | Short | `short` |  | true |
| 61 | `refundPayDirection` | refundPayDirection | `cRefundPayDirection` | String | `text` |  | true |
| 62 | `rejectMemo` | rejectMemo | `cRejectMemo` | String | `text` |  | true |
| 63 | `remark` | 备注 | `remark` | String | `text` |  | true |
| 64 | `salesOrgId` | salesOrgId | `iSalesOrgId` | Long | `long` |  | true |
| 65 | `settlementId` | settlementId | `iSettlementId` | Long | `long` |  | true |
| 66 | `settlementOrgId` | settlementOrgId | `iSettlementOrgId` | Long | `long` |  | true |
| 67 | `settlementWayErpCode` | settlementWayErp编码 | `cSettlementWayErpCode` | String | `text` |  | true |
| 68 | `settlementWayName` | settlementWay名称 | `cSettlementWay` | String | `text` |  | true |
| 69 | `source` | source | `cSource` | Short | `short` |  | true |
| 70 | `sourceType` | sourceType(类型) | `iSourceType` | Integer | `int` |  | true |
| 71 | `totalMoney` | totalMoney | `fTotalMoney` | Decimal | `number` |  | true |
| 72 | `totalMoneyDomestic` | totalMoneyDomestic | `fTotalMoneyDomestic` | Decimal | `number` |  | true |
| 73 | `totalRefundAmount` | totalRefundAmount | `fTotalRefundAmount` | Decimal | `number` |  | true |
| 74 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |  | true |
| 75 | `usedMoney` | usedMoney | `iUsedMoney` | Decimal | `number` |  | true |
| 76 | `usedMoneyDomestic` | usedMoneyDomestic | `iUsedMoneyDomestic` | Decimal | `number` |  | true |
| 77 | `voucherType` | voucherType(类型) | `cVoucherType` | String | `text` |  | true |
| 78 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（3 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `paymentVerificationss` | paymentVerificationss | `voucher.upaymentvoucher.PaymentVerification` | `` | paymentVerificationss → paymentVoucher | 0..n | Y | None |  |
| 2 | `agentId` | agentId | `aa.merchant.Merchant` | `iAgentId` | 外键 |  |  | Service |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT fActorageMoney, fActorageMoneyDomestic, cAgentBank, cAgentBankBranch, cAgentBankCartNo, iAgentFinanId, iAgentId, iAgentRelationId
FROM paymentvoucher
```