---
tags: ["BIP", "元数据", "数据字典", "ycBase", "ewallet.transapply.TransApplyDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包采购商交易申请交易明细表 (`ewallet.transapply.TransApplyDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_ew_trans_apply_detail` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `ewallet.transapply.TransApplyDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包采购商交易申请交易明细表 |
| 物理表 | `cpu_ew_trans_apply_detail` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:18:45.7110` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:55:28:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202604031356_metadata_ewallet-transapply_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `dd521a30-22a8-43e2-9b9d-561bc88ea570`

## 术语标记

`BusinessData`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 4 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |

---

## 直接属性（共 48 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `sourceDetailId` | 来源单据明细标识 | `source_detail_id` | String | `text` |  | ✓ |
| 2 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 3 | `applyId` | 交易申请单 | `apply_id` | 3dcfb5cf-9b54-4cf0-9058-b8bb153a3c7d | `quote` |  | ✓ |
| 4 | `payTypeId` | 支付方式 | `pay_type_id` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b | `quote` |  | ✓ |
| 5 | `bizSourceDetailCode` | 来源业务单据明细编号 | `biz_source_detail_code` | String | `text` |  | ✓ |
| 6 | `bizSourceDetailId` | 来源业务单据明细标识 | `biz_source_detail_id` | String | `text` |  | ✓ |
| 7 | `bizSourceDetailTitle` | 来源业务单据明细名称 | `biz_source_detail_title` | String | `text` |  | ✓ |
| 8 | `bizSourceDetailType` | 来源业务单据明细类型 | `biz_source_detail_type` | String | `text` |  | ✓ |
| 9 | `code` | 单据编码 | `code` | String | `text` |  | ✓ |
| 10 | `draweeOpeningBankOutlets` | 付款人开户行网点 | `drawee_opening_bank_outlets` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |  | ✓ |
| 11 | `fileId` | 费用附件 | `file_id` | String | `text` |  | ✓ |
| 12 | `payeeOpeningBankOutlets` | 收款人开户行网点 | `payee_opening_bank_outlets` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |  | ✓ |
| 13 | `sourceDetailCode` | 来源单据明细编码 | `source_detail_code` | String | `text` |  | ✓ |
| 14 | `sourceDetailTitle` | 来源单据明细名称 | `source_detail_title` | String | `text` |  | ✓ |
| 15 | `sourceDetailType` | 来源单据明细类型 | `source_detail_type` | String | `text` |  | ✓ |
| 16 | `supTransApplyCode` | 账单编码 | `sup_trans_apply_code` | String | `text` |  | ✓ |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 18 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 19 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 21 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 23 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 24 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 25 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 26 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 27 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 29 | `payChannelId` | 支付渠道 | `pay_channel_id` | b393d7d2-4cc7-469d-b5b7-9b06f9b9d5e8 | `quote` |  | ✓ |
| 30 | `payeeAccountId` | 收款人钱包账号 | `payee_account_id` | 7d9fd6e6-89a2-4c90-9e03-6290b2f2e1ee | `quote` |  | ✓ |
| 31 | `draweeAccountId` | 付款人钱包账户 | `drawee_account_id` | 7d9fd6e6-89a2-4c90-9e03-6290b2f2e1ee | `quote` |  | ✓ |
| 32 | `supplierId` | 供应商企业 | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 33 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 34 | `payeeAccount` | 收款人账号 | `payee_account` | String | `text` |  | ✓ |
| 35 | `payeeAccountName` | 收款人账号名称 | `payee_account_name` | String | `text` |  | ✓ |
| 36 | `payeeOpeningBank` | 收款人开户行 | `payee_opening_bank` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |  | ✓ |
| 37 | `draweeAccount` | 付款人账号 | `drawee_account` | String | `text` |  | ✓ |
| 38 | `draweeAccountName` | 付款人账号名称 | `drawee_account_name` | String | `text` |  | ✓ |
| 39 | `draweeOpeningBank` | 付款人开户行 | `drawee_opening_bank` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |  | ✓ |
| 40 | `payUrl` | 支付链接 | `pay_url` | String | `text` |  | ✓ |
| 41 | `estimatedAmount` | 应收金额 | `estimated_amount` | Decimal | `number` |  | ✓ |
| 42 | `actualAmount` | 实收金额 | `actual_amount` | Decimal | `number` |  | ✓ |
| 43 | `exemptionAmount` | 免除金额 | `exemption_amount` | Decimal | `number` |  | ✓ |
| 44 | `interestProcess` | 利息处理方式 | `interest_process` | String | `text` |  | ✓ |
| 45 | `remark` | 说明 | `remark` | String | `text` |  | ✓ |
| 46 | `transApplyDetailDefineCharacter` | 交易单管理表体自定义项特征 | `define_character_id` | 47317e38-f965-495c-af18-824ae713bac0 | `UserDefine` |  | ✓ |
| 47 | `deductions` | 电子钱包交易申请单抵扣明细表 | `` | 23392eb3-7a19-4ef4-bde6-71c55ffb7bc2 | `` |  |  |
| 48 | `define` | 交易单管理明细自由自定义项 | `` | cc43bbb4-4ac0-416f-9618-83a54b6335d1 | `` |  |  |

---

## 关联属性（共 17 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `supplierId` | 供应商企业 | `aa.vendor.Vendor` | `supplier_id` |  →  |  |  | Service |  |
| 2 | `payeeAccountId` | 收款人钱包账号 | `ewallet.account.Account` | `payee_account_id` |  →  |  |  | None |  |
| 3 | `transApplyDetailDefineCharacter` | 交易单管理表体自定义项特征 | `ewallet.transapply.TransApplyDetailDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `draweeOpeningBank` | 付款人开户行 | `bd.bank.BankVO` | `drawee_opening_bank` |  →  |  |  | Service |  |
| 6 | `payeeOpeningBankOutlets` | 收款人开户行网点 | `bd.bank.BankDotVO` | `payee_opening_bank_outlets` |  →  |  |  | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 9 | `deductions` | 电子钱包交易申请单抵扣明细表 | `ewallet.transapply.TransApplyDeduction` | `` | deductions → detailId | 0..n | true | None |  |
| 10 | `applyId` | 交易申请单 | `ewallet.transapply.TransApply` | `apply_id` | details → applyId | 0..n | true | None |  |
| 11 | `payTypeId` | 支付方式 | `ewallet.config.PayType` | `pay_type_id` |  →  |  |  | None |  |
| 12 | `draweeAccountId` | 付款人钱包账户 | `ewallet.account.Account` | `drawee_account_id` |  →  |  |  | None |  |
| 13 | `payeeOpeningBank` | 收款人开户行 | `bd.bank.BankVO` | `payee_opening_bank` |  →  |  |  | Service |  |
| 14 | `define` | 交易单管理明细自由自定义项 | `ewallet.transapply.TransApplyDetailFreeDefine` | `` | define → id | 1 | true | None | ⚠️ |
| 15 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 16 | `draweeOpeningBankOutlets` | 付款人开户行网点 | `bd.bank.BankDotVO` | `drawee_opening_bank_outlets` |  →  |  |  | Service |  |
| 17 | `payChannelId` | 支付渠道 | `ewallet.config.PayChannel` | `pay_channel_id` |  →  |  |  | None |  |

### Composition（子表）

- **deductions**: `deductions` → `ewallet.transapply.TransApplyDeduction` | 0..n
- **applyId**: `details` → `ewallet.transapply.TransApply` | 0..n
- **define**: `define` → `ewallet.transapply.TransApplyDetailFreeDefine` | 1 ⚠️ 已废弃

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `supplierId` (供应商企业) | `aa.vendor.Vendor` | `supplier_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `draweeOpeningBank` (付款人开户行) | `bd.bank.BankVO` | `drawee_opening_bank` |
| `payeeOpeningBankOutlets` (收款人开户行网点) | `bd.bank.BankDotVO` | `payee_opening_bank_outlets` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `payeeOpeningBank` (收款人开户行) | `bd.bank.BankVO` | `payee_opening_bank` |
| `currencyId` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `draweeOpeningBankOutlets` (付款人开户行网点) | `bd.bank.BankDotVO` | `drawee_opening_bank_outlets` |
