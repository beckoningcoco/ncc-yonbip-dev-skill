---
tags: [BIP, 元数据, 数据字典, voucher, voucher.upaymentvoucher.PaymentVoucherDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 收款单行表 (`voucher.upaymentvoucher.PaymentVoucherDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `paymentvoucherdetail` | 应用: `` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款单行表 |
| 物理表 | `paymentvoucherdetail` |
| 应用 | `` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |

## 部署信息

- 部署时间: 2026-05-22 23:41:59:000
- 安装来源: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202604/202603131007_metadata_voucher-upaymentvoucher_delta.zip`

## 术语标记

`BusinessData`

## 依赖接口（3 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（33 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `payNo` | payNo | `cPayNo` | String | `text` |  | true |
| 2 | `notUsedMoney` | notUsedMoney | `iNotUsedMoney` | Decimal | `number` |  | true |
| 3 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 4 | `agentId` | agentId | `iAgentId` | Long | `long` |  | true |
| 5 | `agentRelationId` | agentRelationId | `iAgentRelationId` | Long | `long` |  | true |
| 6 | `amount` | amount | `iAmount` | Decimal | `number` |  | true |
| 7 | `amountDomestic` | amountDomestic | `iAmountDomestic` | Decimal | `number` |  | true |
| 8 | `bizId` | bizId | `iBizId` | Long | `long` |  | true |
| 9 | `customerBankAccount` | ustomerBankAccount | `iCustomerBankAccount` | Long | `long` |  | true |
| 10 | `enterpriseBankAccount` | enterpriseBankAccount | `iEnterpriseBankAccount` | String | `text` |  | true |
| 11 | `enterpriseCashAccount` | enterpriseCashAccount | `iEnterpriseCashAccount` | String | `text` |  | true |
| 12 | `exchRate` | exchRate | `iExchangeRate` | Decimal | `number` |  | true |
| 13 | `exchRateDate` | exchRateDate(日期) | `exchRateDate` | Date | `date` |  | true |
| 14 | `exchangeRateType` | 汇率类型 | `iExchangeRateType` | String | `text` |  | true |
| 15 | `financeDetailId` | financeDetailId | `iFinanceDetailId` | String | `text` |  | true |
| 16 | `financeId` | financeId | `iFinancePaymentId` | String | `text` |  | true |
| 17 | `iSsueNo` | SsueNo(ID) | `iSsueNo` | Integer | `int` |  | true |
| 18 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |  | true |
| 19 | `natCurrency` | natCurrency | `cDomesticPk` | String | `text` |  | true |
| 20 | `notUsedMoneyDomestic` | notUsedMoneyDomestic | `iNotUsedMoneyDomestic` | Decimal | `number` |  | true |
| 21 | `originalPk` | originalPk | `cOriginalPk` | String | `text` |  | true |
| 22 | `paymentVoucher` | paymentVoucher | `iPaymentId` | c74e56b1-57e1-4d21-b8d5-e31fdcaf803e | `quote` |  | true |
| 23 | `projectId` | projectId | `cProjectId` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | true |
| 24 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true |
| 25 | `remark` | 备注 | `remark` | String | `text` |  | true |
| 26 | `salesOrgId` | salesOrgId | `iSalesOrgId` | Long | `long` |  | true |
| 27 | `settlement` | settlement | `iSettlementId` | Long | `long` |  | true |
| 28 | `settlementName` | settlement名称 | `cSettlementWayName` | String | `text` |  | true |
| 29 | `settlementOrgId` | settlementOrgId | `iSettlementOrgId` | Long | `long` |  | true |
| 30 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |  | true |
| 31 | `usedMoney` | usedMoney | `iUsedMoney` | Decimal | `number` |  | true |
| 32 | `usedMoneyDomestic` | usedMoneyDomestic | `iUsedMoneyDomestic` | Decimal | `number` |  | true |
| 33 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（3 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 2 | `paymentVoucher` | paymentVoucher | `voucher.upaymentvoucher.PaymentVoucher` | `iPaymentId` | 外键 |  |  | None |  |
| 3 | `projectId` | projectId | `bd.project.ProjectVO` | `cProjectId` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT cPayNo, iNotUsedMoney, id, iAgentId, iAgentRelationId, iAmount, iAmountDomestic, iBizId
FROM paymentvoucherdetail
```