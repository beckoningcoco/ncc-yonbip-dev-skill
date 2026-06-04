---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "ewallet.supplieraccount.SupplierAccountBalances"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包供应商账户余额信息表 (`ewallet.supplieraccount.SupplierAccountBalances`)

> ycBusinessCenter | 物理表：`cpu_ew_supplier_account_balances`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包供应商账户余额信息表 |
| 物理表 | `cpu_ew_supplier_account_balances` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:34.3870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `walletId` | 电子钱包 | `wallet_id` | Long |
| 3 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 4 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 8 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 9 | `creator` | 创建人名称 | `creator` | String |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `accountId` | 账户 | `account_id` | 4e7bdf13-adca-471b-aab2-69b8e3d619dd |
| 13 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 14 | `supplierDocBankId` | 供应商档案银行信息 | `supplier_doc_bank_id` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c |
| 15 | `bankType` | 银行类别 | `bank_type` | b7ee7189-ed97-48d5-91e4-808228664429 |
| 16 | `bankOutlets` | 银行网点 | `bank_outlets` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 19 | `bankAccount` | 银行账户 | `bank_account` | String |
| 20 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 21 | `currencyName` | 币种 | `currency_name` | String |
| 22 | `bankAccountName` | 银行账户名称 | `bank_account_name` | String |
| 23 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 24 | `bankTypeName` | 银行类别 | `bank_type_name` | String |
| 25 | `bankCode` | 联行号 | `bank_code` | String |
| 26 | `totalBalances` | 账户余额 | `total_balances` | Decimal |
| 27 | `availableBalances` | 可用余额 | `available_balances` | Decimal |
| 28 | `freezeBalances` | 冻结余额 | `freeze_balances` | Decimal |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `accountId` | 账户 | `ewallet.supplieraccount.SupplierAccount` | None | true |
| 2 | `bankOutlets` | 银行网点 | `bd.bank.BankDotVO` | Service |  |
| 3 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 4 | `bankType` | 银行类别 | `bd.bank.BankVO` | Service |  |
| 5 | `supplierDocBankId` | 供应商档案银行信息 | `aa.vendor.VendorBank` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
