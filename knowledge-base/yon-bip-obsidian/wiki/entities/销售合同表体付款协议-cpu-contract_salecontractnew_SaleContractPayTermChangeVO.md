---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "cpu-contract.salecontractnew.SaleContractPayTermChangeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售合同表体付款协议 (`cpu-contract.salecontractnew.SaleContractPayTermChangeVO`)

> ycBusinessCenter | 物理表：`cpu_sale_ct_payterm_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同表体付款协议 |
| 物理表 | `cpu_sale_ct_payterm_history` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:30.4520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 所属租户id | `enterprise_id` | Long |
| 3 | `payName` | 付款名称 | `pay_name` | String |
| 4 | `settleTypeId` | 结算方式 自定义项ID | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 5 | `pubts` | 时间戳 | `ts` | DateTime |
| 6 | `saleContractHistoryId` | 合同历史主表id | `sale_contract_history_id` | 0916e926-2a68-41cc-8d23-29075405e8de |
| 7 | `dr` | dr | `dr` | Integer |
| 8 | `saleContractId` | 主表id | `sale_contract_id` | fc6e46f3-a338-4c53-b55a-2c3336f30dd0 |
| 9 | `payPointId` | 付款起点id | `pay_point_id` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `ts` | 时间戳 | `ts` | DateTime |
| 12 | `enterpriseName` | 所属租户名称 | `enterprise_name` | String |
| 13 | `payPeriod` | 付款阶段 | `pay_period` | Integer |
| 14 | `payPoint` | 付款起点 | `pay_point` | String |
| 15 | `payPointName` | 付款起点名称 | `pay_point_name` | String |
| 16 | `payPointAfterDay` | 付款起点延期天数 | `pay_point_after_day` | Integer |
| 17 | `payRatio` | 付款比例 | `pay_ratio` | Decimal |
| 18 | `advancePay` | 是否预付款 | `advance_pay` | Boolean |
| 19 | `shelf` | 是否质保金 | `shelf` | Boolean |
| 20 | `settleType` | 结算方式 | `settle_type` | String |
| 21 | `settleTypeName` | 结算方式 | `settle_type_name` | String |
| 22 | `memo` | 备注 | `memo` | String |
| 23 | `payTaxMoney` | 付款金额 | `pay_tax_money` | Decimal |
| 24 | `purContractPayTermId` | 采购合同付款协议id | `pur_contract_payterm_id` | Long |
| 25 | `purContractPayTermHistoryId` | 采购合同付款协议id | `pur_contract_payterm_history_id` | Long |
| 26 | `changingAction` | 变更动作 | `changing_action` | String |
| 27 | `changingInfo` | 变更信息 | `changing_info` | String |
| 28 | `prePayType` | 预付折算方式 | `pre_pay_type` | String |
| 29 | `SaleCtHistoryPayTermHistoryCharacterDefine` | 销售合同变更自定义项特征属性组 | `defineCharacter` | 9cc0407b-4fb4-4895-a670-fcc3eaf11396 |
| 30 | `SaleCtPayTermCharacterDefine` | 销售合同自定义项特征属性组 | `defineCharacter` | cfe381e2-8d02-4e93-a68e-ca701773d0db |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `payPointId` | 付款起点id | `bd.payments.PayStartBase` | Service |  |
| 3 | `SaleCtPayTermCharacterDefine` | 销售合同自定义项特征属性组 | `cpu-contract.salecontract.SaleCtPayTermCharacterDefine` | None |  |
| 4 | `saleContractHistoryId` | 合同历史主表id | `cpu-contract.salecontractnew.SaleContractChangeVO` | None | true |
| 5 | `settleTypeId` | 结算方式 自定义项ID | `aa.settlemethod.SettleMethod` | Service |  |
| 6 | `SaleCtHistoryPayTermHistoryCharacterDefine` | 销售合同变更自定义项特征属性组 | `cpu-contract.salecontractnew.SaleCtHistoryPayTermHistoryCharacterDefine` | None |  |
| 7 | `saleContractId` | 主表id | `cpu-contract.salecontract.SaleContractVO` | None |  |
