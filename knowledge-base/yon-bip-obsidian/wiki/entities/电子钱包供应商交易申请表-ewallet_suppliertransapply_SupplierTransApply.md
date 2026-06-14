---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "ewallet.suppliertransapply.SupplierTransApply"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包供应商交易申请表 (`ewallet.suppliertransapply.SupplierTransApply`)

> ycBusinessCenter | 物理表：`cpu_ew_supplier_trans_apply`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包供应商交易申请表 |
| 物理表 | `cpu_ew_supplier_trans_apply` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:42:36.7440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据编码 |

---

## 直接属性（73个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `walletId` | 电子钱包 | `wallet_id` | a9a8b3c1-bae2-4f21-ba1d-02628dc747d1 |
| 3 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 4 | `payeeAccountId` | 收款人钱包账户 | `payee_account_id` | 7d9fd6e6-89a2-4c90-9e03-6290b2f2e1ee |
| 5 | `draweeAccountId` | 付款人钱包账户 | `drawee_account_id` | 7d9fd6e6-89a2-4c90-9e03-6290b2f2e1ee |
| 6 | `feeItemDefId` | 费用项 | `fee_item_def_id` | f907bf0d-9962-47cf-8a30-da9a3d007d60 |
| 7 | `currencyName` | 币种名称 | `currency_name` | String |
| 8 | `sourceTitle` | 来源单据编号 | `source_title` | String |
| 9 | `payTypeIdList` | 支付方式列表 | `pay_type_id_list` | String |
| 10 | `taskId` | 定时任务ID | `task_id` | String |
| 11 | `bizStatus` | 业务状态 | `biz_status` | String |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 15 | `createDate` | 创建日期 | `create_date` | Date |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 18 | `verifystate` | 审批状态 | `verifystate` | Short |
| 19 | `returncount` | 退回次数 | `returncount` | Short |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `payTypeId` | 支付方式 | `pay_type_id` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b |
| 22 | `payChannelId` | 支付渠道 | `pay_channel_id` | b393d7d2-4cc7-469d-b5b7-9b06f9b9d5e8 |
| 23 | `purOrgId` | 采购组织 | `pur_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 24 | `buyerId` | 采购商档案 | `buyer_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 25 | `supplierId` | 供应商档案 | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 26 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 27 | `applyStatus` | 交易单状态 | `apply_status` | String |
| 28 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 29 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 31 | `viewRangeCode` | 单据查看范围编码 | `view_range_code` | String |
| 32 | `draweeAccount` | 付款人账号 | `drawee_account` | String |
| 33 | `bizSourceAdminUser` | 来源业务负责人 | `biz_source_admin_user` | String |
| 34 | `payUrl` | 支付链接 | `pay_url` | String |
| 35 | `creator` | 制单人 | `creator` | String |
| 36 | `modifier` | 修改人 | `modifier` | String |
| 37 | `draweeAccountName` | 收款人账号名称 | `drawee_account_name` | String |
| 38 | `creatorEmail` | 邮箱 | `creator_email` | String |
| 39 | `modifierEmail` | 邮箱 | `modifier_email` | String |
| 40 | `draweeOpeningBankOutlets` | 银行网点 | `drawee_opening_bank_outlets` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 |
| 41 | `creatorMobile` | 联系方式 | `creator_mobile` | String |
| 42 | `modifierMobile` | 联系方式 | `modifier_mobile` | String |
| 43 | `draweeOpeningBank` | 付款人开户行 | `drawee_opening_bank` | b7ee7189-ed97-48d5-91e4-808228664429 |
| 44 | `createTime` | 创建时间 | `create_time` | DateTime |
| 45 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 46 | `payeeAccount` | 银行子账号 | `payee_account` | String |
| 47 | `payeeAccountName` | 银行子账号名称 | `payee_account_name` | String |
| 48 | `payeeOpeningBankOutlets` | 银行网点 | `payee_opening_bank_outlets` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 |
| 49 | `payeeOpeningBank` | 收款人开户行 | `payee_opening_bank` | b7ee7189-ed97-48d5-91e4-808228664429 |
| 50 | `code` | 单据编码 | `code` | String |
| 51 | `isProxy` | 代申请 | `is_proxy` | String |
| 52 | `buyerName` | 采购商名称 | `buyer_name` | String |
| 53 | `applyType` | 申请单类型 | `apply_type` | String |
| 54 | `bizSourceCode` | 来源单据编码 | `biz_source_code` | String |
| 55 | `bizSourceId` | 来源单据 | `biz_source_id` | String |
| 56 | `sourceType` | 来源单据类型 | `source_type` | String |
| 57 | `sourceId` | 来源单据标识 | `source_id` | String |
| 58 | `bizSourceTitle` | 来源单据名称 | `biz_source_title` | String |
| 59 | `sourceCode` | 来源单据编号 | `source_code` | String |
| 60 | `bizSourceType` | 来源单据类型 | `biz_source_type` | String |
| 61 | `estimatedAmount` | 应缴金额 | `estimated_amount` | Decimal |
| 62 | `actualAmount` | 实缴金额 | `actual_amount` | Decimal |
| 63 | `exemptionAmount` | 免除金额 | `exemption_amount` | Decimal |
| 64 | `remark` | 说明 | `remark` | String |
| 65 | `fileId` | 订单附件 | `file_id` | String |
| 66 | `rejectReason` | 驳回原因 | `reject_reason` | String |
| 67 | `applyCreator` | 申请人 | `apply_creator` | String |
| 68 | `applyTime` | 申请时间 | `apply_time` | Date |
| 69 | `supplierTransApplyDefineCharacter` | 账单管理表头自定义项特征 | `define_character_id` | b4f07053-324a-4196-833b-562e44529669 |
| 70 | `define` | 账单管理自由自定义项 | `` | 8f914d9a-b075-49f7-b363-55695e1626dc |
| 71 | `details` | 电子钱包采购商交易申请交易明细表 | `` | a8440690-f179-4a0b-80cb-8353524eb941 |
| 72 | `flows` | 电子钱包供应商交易申请交易流水表 | `` | 4cd33eab-1060-4875-b83d-4d2122230302 |
| 73 | `logs` | 电子钱包供应商交易申请日志表 | `` | b4864df0-6dd1-4e9b-bcf7-4bfa050fb21b |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织 | `org.func.BaseOrg` | Service |  |
| 2 | `walletId` | 电子钱包 | `ewallet.wallet.Wallet` | None |  |
| 3 | `supplierId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 4 | `payeeAccountId` | 收款人钱包账户 | `ewallet.account.Account` | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `draweeOpeningBank` | 付款人开户行 | `bd.bank.BankVO` | Service |  |
| 7 | `payeeOpeningBankOutlets` | 银行网点 | `bd.bank.BankDotVO` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `buyerId` | 采购商档案 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 11 | `feeItemDefId` | 费用项 | `ewallet.feeitemdefinition.FeeItemDefinition` | None |  |
| 12 | `payTypeId` | 支付方式 | `ewallet.config.PayType` | None |  |
| 13 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 14 | `flows` | 电子钱包供应商交易申请交易流水表 | `ewallet.suppliertransapply.SupplierTransApplyFlow` | None | true |
| 15 | `draweeAccountId` | 付款人钱包账户 | `ewallet.account.Account` | None |  |
| 16 | `payeeOpeningBank` | 收款人开户行 | `bd.bank.BankVO` | Service |  |
| 17 | `define` | 账单管理自由自定义项 | `ewallet.suppliertransapply.SupplierTransApplyFreeDefine` | None | true |
| 18 | `supplierTransApplyDefineCharacter` | 账单管理表头自定义项特征 | `ewallet.suppliertransapply.SupplierTransApplyDefineCharacter` | None |  |
| 19 | `details` | 电子钱包采购商交易申请交易明细表 | `ewallet.suppliertransapply.SupplierTransApplyDetail` | None | true |
| 20 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 21 | `draweeOpeningBankOutlets` | 银行网点 | `bd.bank.BankDotVO` | Service |  |
| 22 | `logs` | 电子钱包供应商交易申请日志表 | `ewallet.suppliertransapply.SupplierTransApplyLog` | None | true |
| 23 | `payChannelId` | 支付渠道 | `ewallet.config.PayChannel` | None |  |
