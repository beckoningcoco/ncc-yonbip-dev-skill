---
tags: ["BIP", "元数据", "数据字典", "ycBase", "ewallet.transapply.TransApplyFlow"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包交易申请交易流水表 (`ewallet.transapply.TransApplyFlow`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_ew_trans_apply_flow` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `ewallet.transapply.TransApplyFlow` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包交易申请交易流水表 |
| 物理表 | `cpu_ew_trans_apply_flow` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:18:48.4780` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:56:20:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202512080917_metadata_ewallet-transapply.zip`
- **安装人**: mongoTools
- **安装排名**: `667deccb-1972-49fd-a267-6085f8c025fe`

## 术语标记

`BusinessData`

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

## 直接属性（共 47 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `applyId` | 交易申请单 | `apply_id` | 3dcfb5cf-9b54-4cf0-9058-b8bb153a3c7d | `quote` |  | ✓ |
| 3 | `payTypeId` | 支付方式 | `pay_type_id` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b | `quote` |  | ✓ |
| 4 | `payChannelId` | 支付渠道 | `pay_channel_id` | b393d7d2-4cc7-469d-b5b7-9b06f9b9d5e8 | `quote` |  | ✓ |
| 5 | `payeeAccountName` | 收款人账号名称 | `payee_account_name` | String | `text` |  | ✓ |
| 6 | `payeeAccountNum` | 收款人账号编码 | `payee_account_num` | String | `text` |  | ✓ |
| 7 | `draweeAccountName` | 付款人账号名称 | `drawee_account_name` | String | `text` |  | ✓ |
| 8 | `draweeAccountNum` | 付款人账号编码 | `drawee_account_num` | String | `text` |  | ✓ |
| 9 | `currencyId` | 币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 10 | `paySerialNum` | 支付流水号 | `pay_serial_num` | String | `text` |  | ✓ |
| 11 | `code` | 流水编码 | `code` | String | `text` |  | ✓ |
| 12 | `payeeAccountSource` | 收款人账号来源 | `payee_account_source` | String | `text` |  | ✓ |
| 13 | `payeeAccountId` | 收款人账号 | `payee_account_id` | 7d9fd6e6-89a2-4c90-9e03-6290b2f2e1ee | `quote` |  | ✓ |
| 14 | `draweeAccountId` | 付款人账号 | `drawee_account_id` | 7d9fd6e6-89a2-4c90-9e03-6290b2f2e1ee | `quote` |  | ✓ |
| 15 | `draweeAccountSource` | 付款人账号来源 | `drawee_account_source` | String | `text` |  | ✓ |
| 16 | `receivedAmount` | 应收金额 | `received_amount` | Decimal | `number` |  | ✓ |
| 17 | `exceptionStatus` | 是否异常 | `exception_status` | String | `text` |  | ✓ |
| 18 | `paidAmount` | 实收金额 | `paid_amount` | Decimal | `number` |  | ✓ |
| 19 | `exceptionReason` | 异常原因 | `exception_reason` | String | `text` |  | ✓ |
| 20 | `flowDesc` | 费用说明 | `flow_desc` | String | `text` |  | ✓ |
| 21 | `payeeAvailableBalances` | 交易前收款人可用余额 | `payee_available_balances` | Decimal | `number` |  | ✓ |
| 22 | `flowStatus` | 状态 | `flow_status` | String | `text` |  | ✓ |
| 23 | `payeeFreezeBalances` | 交易前收款人冻结余额 | `payee_freeze_balances` | Decimal | `number` |  | ✓ |
| 24 | `statusRemark` | 状态说明 | `status_remark` | String | `text` |  | ✓ |
| 25 | `draweeAvailableBalances` | 交易前付款人可用余额 | `drawee_available_balances` | Decimal | `number` |  | ✓ |
| 26 | `isFreeze` | 冻结状态 | `is_freeze` | Boolean | `switch` |  | ✓ |
| 27 | `draweeFreezeBalances` | 交易前付款人冻结余额 | `drawee_freeze_balances` | Decimal | `number` |  | ✓ |
| 28 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 29 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 30 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 31 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 32 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 33 | `detailId` | 交易申请单详情 | `detail_id` | 63cadd3d-d65a-4295-9c09-e1c816b82328 | `quote` |  | ✓ |
| 34 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 35 | `draweeAccountSourceCode` | 付款人账号来源编码 | `drawee_account_source_code` | String | `text` |  | ✓ |
| 36 | `exemptionAmount` | 免除金额 | `exemption_amount` | Decimal | `number` |  | ✓ |
| 37 | `flowLogs` | 电子钱包交易流水日志表 | `` | 6fb8e6ec-dfba-4265-a1f6-16991f98ab4c | `` |  |  |
| 38 | `interestProcess` | 利息处理方式 | `interest_process` | String | `text` |  | ✓ |
| 39 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 40 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 41 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 42 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 43 | `payeeAccountSourceCode` | 收款人账号来源编码 | `payee_account_source_code` | String | `text` |  | ✓ |
| 44 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 45 | `supplierId` | 供应商档案 | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 46 | `transDate` | 交易流水实际发生日期 | `trans_date` | Date | `date` |  | ✓ |
| 47 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 12 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `applyId` | 交易申请单 | `ewallet.transapply.TransApply` | `apply_id` | flows → applyId | 0..n | true | None |  |
| 2 | `supplierId` | 供应商档案 | `aa.vendor.Vendor` | `supplier_id` |  →  |  |  | Service |  |
| 3 | `payeeAccountId` | 收款人账号 | `ewallet.account.Account` | `payee_account_id` |  →  |  |  | None |  |
| 4 | `payTypeId` | 支付方式 | `ewallet.config.PayType` | `pay_type_id` |  →  |  |  | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `draweeAccountId` | 付款人账号 | `ewallet.account.Account` | `drawee_account_id` |  →  |  |  | None |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 9 | `detailId` | 交易申请单详情 | `ewallet.transapply.TransApplyDetail` | `detail_id` |  →  |  |  | None |  |
| 10 | `currencyId` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 11 | `payChannelId` | 支付渠道 | `ewallet.config.PayChannel` | `pay_channel_id` |  →  |  |  | None |  |
| 12 | `flowLogs` | 电子钱包交易流水日志表 | `ewallet.transapply.TransApplyFlowLog` | `` | flowLogs → flowId | 0..n | true | None |  |

### Composition（子表）

- **applyId**: `flows` → `ewallet.transapply.TransApply` | 0..n
- **flowLogs**: `flowLogs` → `ewallet.transapply.TransApplyFlowLog` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `supplierId` (供应商档案) | `aa.vendor.Vendor` | `supplier_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `currencyId` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
