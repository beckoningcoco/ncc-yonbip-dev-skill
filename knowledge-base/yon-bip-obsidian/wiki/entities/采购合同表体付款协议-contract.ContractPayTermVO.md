---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contract.ContractPayTermVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同表体付款协议 (`cpu-contract.contract.ContractPayTermVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycContractManagement 模块实体元数据字典。
> 物理表：`cpu_ct_payterm` | 所属应用：`ycContractManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-contract.contract.ContractPayTermVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同表体付款协议 |
| 物理表 | `cpu_ct_payterm` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:17.6630` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:41:33:000
- **安装来源**: `/app/data_scripts/cpu-cooperation-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_cpu_cooperation/0010_iuap_common/DML/0270_iuap_metadata/202511/202511061037_metadata_cpu-contract-contract_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `3281b76e-503c-40cf-b771-4999f4066a98`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 60 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `CtPayTermCharacterDefine` | 自定义项特征属性组 | `defineCharacter` | 1eced9c7-16a7-43c7-a4fd-10da89cba2e3 | `UserDefine` |  | ✓ |
| 2 | `totalPayContractMoney` | 累计合同申请预付款金额 | `total_pay_contract_money` | Decimal | `number` |  | ✓ |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 4 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 5 | `enterpriseId` | 企业主键(采购云) | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 6 | `payName` | 付款名称 | `pay_name` | String | `text` |  | ✓ |
| 7 | `supplydocId` | 供应商档案主键 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 8 | `enterpriseName` | 所属租户名称 | `enterprise_name` | String | `text` |  | ✓ |
| 9 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 10 | `payPoint` | 付款起点编码 | `pay_point` | String | `text` |  | ✓ |
| 11 | `payRatio` | 付款比例% | `pay_ratio` | Decimal | `number` |  | ✓ |
| 12 | `payTaxMoney` | 付款金额 | `pay_tax_money` | Decimal | `number` |  | ✓ |
| 13 | `advancePay` | 是否预付款 | `advance_pay` | Boolean | `switch` |  | ✓ |
| 14 | `shelf` | 是否质保金 | `shelf` | Boolean | `switch` |  | ✓ |
| 15 | `settleType` | 所属租户id | `settle_type` | String | `text` |  | ✓ |
| 16 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 17 | `defaultValueEditable` | 默认是否可编辑 | `default_value_editable` | Boolean | `switch` |  | ✓ |
| 18 | `isProgressConfirm` | 需进度确认 | `is_progress_confirm` | String | `text` |  | ✓ |
| 19 | `changingAction` | 变更动作:删除原协议、变更协议、新增协议 | `changing_action` | String | `text` |  | ✓ |
| 20 | `prePayType` | 预付折算方式 | `pre_pay_type` | String | `text` |  | ✓ |
| 21 | `changingInfo` | 变更信息 | `changing_info` | String | `text` |  | ✓ |
| 22 | `settleTypeName` | 结算方式 | `settle_type_name` | String | `text` |  | ✓ |
| 23 | `payPointName` | 付款起点 | `pay_point_name` | String | `text` |  | ✓ |
| 24 | `payPeriod` | 付款阶段 | `pay_period` | Integer | `int` |  | ✓ |
| 25 | `payPointAfterDay` | 账期天数 | `pay_point_after_day` | Integer | `int` |  | ✓ |
| 26 | `payPointAfterDayNew` | 账期 | `pay_point_after_day_new` | Integer | `int` |  | ✓ |
| 27 | `accountingUnit` | 账期单位 | `accounting_unit` | String | `text` |  | ✓ |
| 28 | `settleTypeId` | 结算方式主键 | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |  | ✓ |
| 29 | `payPointId` | 付款起点主键 | `pay_point_id` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 | `quote` |  | ✓ |
| 30 | `delayDay` | 延迟天数 | `delay_day` | Integer | `int` |  | ✓ |
| 31 | `initialDate` | 起算日 | `initial_date` | DateTime | `timestamp` |  | ✓ |
| 32 | `dueDate` | 到期日 | `due_date` | DateTime | `timestamp` |  | ✓ |
| 33 | `delayMonth` | 延迟月份 | `delay_month` | Integer | `int` |  | ✓ |
| 34 | `intendPaymentmny` | 累计预付金额 | `intend_paymentmny` | Decimal | `number` |  | ✓ |
| 35 | `practicalPaymentmny` | 累计预付实付金额 | `practical_paymentmny` | Decimal | `number` |  | ✓ |
| 36 | `accPayApplyMoney` | 累计预付付款申请金额 | `acc_pay_apply_money` | Decimal | `number` |  | ✓ |
| 37 | `dr` | dr | `dr` | Integer | `int` |  | ✓ |
| 38 | `outDayType` | 出账日确定方式 | `out_day_type` | String | `text` |  | ✓ |
| 39 | `contractId` | 合同主表主键 | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 | `quote` |  | ✓ |
| 40 | `fixedoutDay` | 固定出账日 | `fixedout_day` | Integer | `int` |  | ✓ |
| 41 | `fixedoutDay1` | 固定出账日1 | `fixedout_day1` | Integer | `int` |  | ✓ |
| 42 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 43 | `fixedoutDay2` | 固定出账日2 | `fixedout_day2` | Integer | `int` |  | ✓ |
| 44 | `fixedoutDay3` | 固定出账日3 | `fixedout_day3` | Integer | `int` |  | ✓ |
| 45 | `fixedoutDay4` | 固定出账日4 | `fixedout_day4` | Integer | `int` |  | ✓ |
| 46 | `outDay` | 出账日 | `out_day` | DateTime | `timestamp` |  | ✓ |
| 47 | `dueDateType` | 到期日确定方式 | `due_date_type` | String | `text` |  | ✓ |
| 48 | `fixedexpireDay` | 固定到期日 | `fixedexpire_day` | Integer | `int` |  | ✓ |
| 49 | `fixedexpireDay1` | 固定到期日1 | `fixedexpire_day1` | Integer | `int` |  | ✓ |
| 50 | `fixedexpireDay2` | 固定到期日2 | `fixedexpire_day2` | Integer | `int` |  | ✓ |
| 51 | `fixedexpireDay3` | 固定到期日3 | `fixedexpire_day3` | Integer | `int` |  | ✓ |
| 52 | `fixedexpireDay4` | 固定到期日4 | `fixedexpire_day4` | Integer | `int` |  | ✓ |
| 53 | `prServiceConfirmMoney` | 累计服务确认金额 | `pr_service_confirm_money` | Decimal | `number` |  | ✓ |
| 54 | `defines` | 表体付款协议自定义项 | `` | b0ad2faf-22a8-42ca-8de5-f2c2dc1a71a4 | `` |  |  |
| 55 | `paymentInvoiceMoney` | 收票无税金额 | `payment_invoice_money` | Decimal | `number` |  | ✓ |
| 56 | `paymentInvoiceNatMoney` | 本币收票无税金额 | `payment_invoice_nat_money` | Decimal | `number` |  | ✓ |
| 57 | `paymentInvoiceNatTax` | 本币收票税额 | `payment_invoice_nat_tax` | Decimal | `number` |  | ✓ |
| 58 | `paymentInvoiceNatTaxMoney` | 本币收票含税金额 | `payment_invoice_nat_tax_money` | Decimal | `number` |  | ✓ |
| 59 | `paymentInvoiceTax` | 收票税额 | `payment_invoice_tax` | Decimal | `number` |  | ✓ |
| 60 | `paymentInvoiceTaxMoney` | 收票含税金额 | `payment_invoice_tax_money` | Decimal | `number` |  | ✓ |

---

## 关联属性（共 8 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `CtPayTermCharacterDefine` | 自定义项特征属性组 | `cpu-contract.contract.CtPayTermCharacterDefine` | `defineCharacter` |  →  |  |  | None |  |
| 2 | `supplydocId` | 供应商档案主键 | `aa.vendor.Vendor` | `supplydoc_id` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `payPointId` | 付款起点主键 | `bd.payments.PayStartBase` | `pay_point_id` |  →  |  |  | Service |  |
| 5 | `contractId` | 合同主表主键 | `cpu-contract.contract.ContractVO` | `contract_id` | contractPayTermList → contractId | 0..n | true | None |  |
| 6 | `settleTypeId` | 结算方式主键 | `aa.settlemethod.SettleMethod` | `settle_type_id` |  →  |  |  | Service |  |
| 7 | `enterpriseId` | 企业主键(采购云) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |
| 8 | `defines` | 表体付款协议自定义项 | `cpu-contract.contract.ContractPayTermVODefine` | `` | defines → id | 1 | true | None | ⚠️ |

### Composition（子表）

- **contractId**: `contractPayTermList` → `cpu-contract.contract.ContractVO` | 0..n
- **defines**: `defines` → `cpu-contract.contract.ContractPayTermVODefine` | 1 ⚠️ 已废弃

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `supplydocId` (供应商档案主键) | `aa.vendor.Vendor` | `supplydoc_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `payPointId` (付款起点主键) | `bd.payments.PayStartBase` | `pay_point_id` |
| `settleTypeId` (结算方式主键) | `aa.settlemethod.SettleMethod` | `settle_type_id` |
| `enterpriseId` (企业主键(采购云)) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
