---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contract.ContractPrepayVo"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同预付付款单表体 (`cpu-contract.contract.ContractPrepayVo`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycContractManagement 模块实体元数据字典。
> 物理表：`cpu_ct_prepay` | 所属应用：`ycContractManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-contract.contract.ContractPrepayVo` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同预付付款单表体 |
| 物理表 | `cpu_ct_prepay` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:19.0440` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2026-01-23 23:41:33:000
- **安装来源**: `/app/data_scripts/cpu-cooperation-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_cpu_cooperation/0010_iuap_common/DML/0270_iuap_metadata/202511/202511061037_metadata_cpu-contract-contract_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `3281b76e-503c-40cf-b771-4999f4066a98`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 40 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 2 | `payPointName` | 付款起点名称 | `pay_point_name` | String | `text` |  | ✓ |
| 3 | `settleTypeId` | 结算方式主键 | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |  | ✓ |
| 4 | `paymentInvoiceMoney` | 累计付款核销无税金额 | `payment_invoice_money` | Decimal | `number` |  | ✓ |
| 5 | `supplydocId` | 供应商档案主键 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 6 | `paymentInvoiceTaxMoney` | 累计付款核销含税金额 | `payment_invoice_tax_money` | Decimal | `number` |  | ✓ |
| 7 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 8 | `paymentInvoiceTax` | 累计付款核销税额 | `payment_invoice_tax` | Decimal | `number` |  | ✓ |
| 9 | `contractMaterialId` | 合同物料表ID | `contract_material_id` | 07141343-35c1-4687-b99c-405bfa7a3096 | `quote` |  | ✓ |
| 10 | `expenseItemId` | 费用项目 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |  | ✓ |
| 11 | `reqUapProjectId` | 项目档案 | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 12 | `serialNumber` | 序号 | `serial_number` | Integer | `int` |  | ✓ |
| 13 | `payPeriod` | 付款阶段(期号) | `pay_period` | Integer | `int` |  | ✓ |
| 14 | `payPointAfterDay` | 账期天数 | `pay_point_after_day` | Integer | `int` |  | ✓ |
| 15 | `takerOrgName` | 收票组织 | `taker_orgname` | String | `text` |  | ✓ |
| 16 | `payRatio` | 付款比例 | `pay_ratio` | Decimal | `number` |  | ✓ |
| 17 | `payTaxMoney` | 付款金额 | `pay_tax_money` | Decimal | `number` |  | ✓ |
| 18 | `intendPaymentmny` | 累计付款金额 | `intend_paymentmny` | Decimal | `number` |  | ✓ |
| 19 | `practicalPaymentmny` | 累计实付金额 | `practical_paymentmny` | Decimal | `number` |  | ✓ |
| 20 | `advancePay` | 是否预付款 | `advance_pay` | Boolean | `switch` |  | ✓ |
| 21 | `settleTypeName` | 结算方式 | `settle_type_name` | String | `text` |  | ✓ |
| 22 | `initialDate` | 起算日 | `initial_date` | DateTime | `timestamp` |  | ✓ |
| 23 | `dueDate` | 到期日 | `due_date` | DateTime | `timestamp` |  | ✓ |
| 24 | `id` | id | `id` | Long | `long` |  | ✓ |
| 25 | `contractPaytermId` | 付款协议主键 | `ct_payterm_id` | e9956481-c2c6-4f0b-a371-960b026a67f6 | `quote` |  | ✓ |
| 26 | `enterpriseId` | 企业主键(采购云) | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 27 | `enterpriseName` | 所属租户名称 | `enterprise_name` | String | `text` |  | ✓ |
| 28 | `payPoint` | 付款起点 | `pay_point` | String | `text` |  | ✓ |
| 29 | `takerOrgId` | 收票组织主键 | `taker_orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 30 | `takerOrgCode` | 收票组织 | `taker_orgcode` | String | `text` |  | ✓ |
| 31 | `settleType` | 结算方式 | `settle_type` | String | `text` |  | ✓ |
| 32 | `changingAction` | 变更动作 | `changing_action` | String | `text` |  | ✓ |
| 33 | `changingInfo` | 变更信息 | `changing_info` | String | `text` |  | ✓ |
| 34 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 35 | `dr` | 删除标识 | `dr` | Integer | `int` |  | ✓ |
| 36 | `contractId` | 合同主表主键 | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 | `quote` |  | ✓ |
| 37 | `accPayApplyMoney` | 累计预付付款申请金额 | `acc_pay_apply_money` | Decimal | `number` |  | ✓ |
| 38 | `paymentInvoiceNatMoney` | 本币收票无税金额 | `payment_invoice_nat_money` | Decimal | `number` |  | ✓ |
| 39 | `paymentInvoiceNatTax` | 本币收票税额 | `payment_invoice_nat_tax` | Decimal | `number` |  | ✓ |
| 40 | `paymentInvoiceNatTaxMoney` | 本币收票含税金额 | `payment_invoice_nat_tax_money` | Decimal | `number` |  | ✓ |

---

## 关联属性（共 10 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `expenseItemId` | 费用项目 | `bd.expenseitem.ExpenseItem` | `expense_item_id` |  →  |  |  | Service |  |
| 2 | `reqUapProjectId` | 项目档案 | `bd.project.ProjectVO` | `req_uap_project_id` |  →  |  |  | Service |  |
| 3 | `supplydocId` | 供应商档案主键 | `aa.vendor.Vendor` | `supplydoc_id` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `contractId` | 合同主表主键 | `cpu-contract.contract.ContractVO` | `contract_id` | contractPrepayList → contractId | 0..n | true | None |  |
| 6 | `contractPaytermId` | 付款协议主键 | `cpu-contract.contract.ContractPayTermVO` | `ct_payterm_id` |  →  |  |  | None |  |
| 7 | `settleTypeId` | 结算方式主键 | `aa.settlemethod.SettleMethod` | `settle_type_id` |  →  |  |  | Service |  |
| 8 | `enterpriseId` | 企业主键(采购云) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |
| 9 | `takerOrgId` | 收票组织主键 | `org.func.BaseOrg` | `taker_orgid` |  →  |  |  | Service |  |
| 10 | `contractMaterialId` | 合同物料表ID | `cpu-contract.contract.ContractBodyVO` | `contract_material_id` |  →  |  |  | None |  |

### Composition（子表）

- **contractId**: `contractPrepayList` → `cpu-contract.contract.ContractVO` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `expenseItemId` (费用项目) | `bd.expenseitem.ExpenseItem` | `expense_item_id` |
| `reqUapProjectId` (项目档案) | `bd.project.ProjectVO` | `req_uap_project_id` |
| `supplydocId` (供应商档案主键) | `aa.vendor.Vendor` | `supplydoc_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `settleTypeId` (结算方式主键) | `aa.settlemethod.SettleMethod` | `settle_type_id` |
| `enterpriseId` (企业主键(采购云)) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
| `takerOrgId` (收票组织主键) | `org.func.BaseOrg` | `taker_orgid` |
