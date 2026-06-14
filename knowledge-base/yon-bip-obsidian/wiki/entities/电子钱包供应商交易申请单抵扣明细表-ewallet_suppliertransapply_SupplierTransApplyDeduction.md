---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "ewallet.suppliertransapply.SupplierTransApplyDeduction"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包供应商交易申请单抵扣明细表 (`ewallet.suppliertransapply.SupplierTransApplyDeduction`)

> ycBusinessCenter | 物理表：`cpu_ew_supplier_trans_apply_deduction`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包供应商交易申请单抵扣明细表 |
| 物理表 | `cpu_ew_supplier_trans_apply_deduction` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:44:38.5390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `detailId` | 缴费申请明细 | `detail_id` | a8440690-f179-4a0b-80cb-8353524eb941 |
| 3 | `deductionType` | 抵扣方式 | `deduction_type` | String |
| 4 | `consumeAmount` | 消耗金额 | `consume_amount` | Decimal |
| 5 | `deductionAmount` | 抵扣金额 | `deduction_amount` | Decimal |
| 6 | `applyId` | 交易申请单 | `apply_id` | 4e17edaa-83d2-44c6-bb42-7e2c52098b9e |
| 7 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `creator` | 创建人名称 | `creator` | String |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `applyId` | 交易申请单 | `ewallet.suppliertransapply.SupplierTransApply` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `detailId` | 缴费申请明细 | `ewallet.suppliertransapply.SupplierTransApplyDetail` | None | true |
