---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "ewallet.suppliertransapply.SupplierTransApplyFlow"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包供应商交易申请交易流水表 (`ewallet.suppliertransapply.SupplierTransApplyFlow`)

> ycBusinessCenter | 物理表：`cpu_ew_supplier_trans_apply_flow`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包供应商交易申请交易流水表 |
| 物理表 | `cpu_ew_supplier_trans_apply_flow` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:37.0590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `applyId` | 交易申请单 | `apply_id` | 4e17edaa-83d2-44c6-bb42-7e2c52098b9e |
| 3 | `payTypeId` | 支付方式 | `pay_type_id` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b |
| 4 | `payChannelId` | 支付渠道 | `pay_channel_id` | b393d7d2-4cc7-469d-b5b7-9b06f9b9d5e8 |
| 5 | `payeeAccountSource` | 收款人账号来源 | `payee_account_source` | String |
| 6 | `payeeAccountSourceCode` | 收款人账号来源编码 | `payee_account_source_code` | String |
| 7 | `draweeAccountSource` | 付款人账号来源 | `drawee_account_source` | String |
| 8 | `draweeAccountSourceCode` | 付款人账号来源编码 | `drawee_account_source_code` | String |
| 9 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 10 | `code` | 流水编码 | `code` | String |
| 11 | `paySerialNum` | 支付流水号 | `pay_serial_num` | String |
| 12 | `payeeAccountId` | 收款人账号 | `payee_account_id` | 7d9fd6e6-89a2-4c90-9e03-6290b2f2e1ee |
| 13 | `payeeAccountName` | 收款人账号名称 | `payee_account_name` | String |
| 14 | `payeeAccountNum` | 收款人账号编码 | `payee_account_num` | String |
| 15 | `draweeAccountId` | 付款人账号 | `drawee_account_id` | 7d9fd6e6-89a2-4c90-9e03-6290b2f2e1ee |
| 16 | `draweeAccountName` | 付款人账号名称 | `drawee_account_name` | String |
| 17 | `draweeAccountNum` | 付款人账号编码 | `drawee_account_num` | String |
| 18 | `receivedAmount` | 应交易金额 | `received_amount` | Decimal |
| 19 | `paidAmount` | 实交易金额 | `paid_amount` | Decimal |
| 20 | `flowDesc` | 费用说明 | `flow_desc` | String |
| 21 | `flowStatus` | 状态 | `flow_status` | String |
| 22 | `statusRemark` | 状态说明 | `status_remark` | String |
| 23 | `isFreeze` | 冻结状态 | `is_freeze` | Boolean |
| 24 | `exceptionStatus` | 是否异常 | `exception_status` | String |
| 25 | `exceptionReason` | 异常原因 | `exception_reason` | String |
| 26 | `payeeAvailableBalances` | 交易前收款人可用余额 | `payee_available_balances` | Decimal |
| 27 | `payeeFreezeBalances` | 交易前收款人冻结余额 | `payee_freeze_balances` | Decimal |
| 28 | `draweeAvailableBalances` | 交易前付款人可用余额 | `drawee_available_balances` | Decimal |
| 29 | `draweeFreezeBalances` | 交易前付款人冻结余额 | `drawee_freeze_balances` | Decimal |
| 30 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 31 | `createDate` | 创建日期 | `create_date` | Date |
| 32 | `createTime` | 创建时间 | `create_time` | DateTime |
| 33 | `creator` | 创建人名称 | `creator` | String |
| 34 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 35 | `detailId` | 交易申请单详情 | `detail_id` | a8440690-f179-4a0b-80cb-8353524eb941 |
| 36 | `dr` | 逻辑删除标记 | `dr` | Short |
| 37 | `exemptionAmount` | 免除金额 | `exemption_amount` | Decimal |
| 38 | `modifier` | 修改人名称 | `modifier` | String |
| 39 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 40 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 41 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 42 | `pubts` | 时间戳 | `pubts` | DateTime |
| 43 | `supplierId` | 供应商档案 | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 44 | `transDate` | 交易流水实际发生日期 | `trans_date` | Date |
| 45 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 46 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `applyId` | 交易申请单 | `ewallet.suppliertransapply.SupplierTransApply` | None | true |
| 2 | `supplierId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 3 | `payeeAccountId` | 收款人账号 | `ewallet.account.Account` | None |  |
| 4 | `payTypeId` | 支付方式 | `ewallet.config.PayType` | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `draweeAccountId` | 付款人账号 | `ewallet.account.Account` | None |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `detailId` | 交易申请单详情 | `ewallet.suppliertransapply.SupplierTransApplyDetail` | None |  |
| 10 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 11 | `payChannelId` | 支付渠道 | `ewallet.config.PayChannel` | None |  |
