---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "ewallet.suppliertransapply.SupplierTransApplyDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包采购商交易申请交易明细表 (`ewallet.suppliertransapply.SupplierTransApplyDetail`)

> ycBusinessCenter | 物理表：`cpu_ew_supplier_trans_apply_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包采购商交易申请交易明细表 |
| 物理表 | `cpu_ew_supplier_trans_apply_detail` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:35.6990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（34个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `applyId` | 交易申请单 | `apply_id` | 4e17edaa-83d2-44c6-bb42-7e2c52098b9e |
| 3 | `walletId` | 电子钱包 | `wallet_id` | a9a8b3c1-bae2-4f21-ba1d-02628dc747d1 |
| 4 | `bizSourceDetailCode` | 来源单据明细编码 | `biz_source_detail_code` | String |
| 5 | `code` | 单据编码 | `code` | String |
| 6 | `bizSourceDetailId` | 来源单据明细 | `biz_source_detail_id` | String |
| 7 | `sourceDetailId` | 来源单据明细标识 | `source_detail_id` | String |
| 8 | `bizSourceDetailTitle` | 来源单据明细名称 | `biz_source_detail_title` | String |
| 9 | `estimatedAmount` | 应缴金额 | `estimated_amount` | Decimal |
| 10 | `actualAmount` | 实缴金额 | `actual_amount` | Decimal |
| 11 | `bizSourceDetailType` | 来源单据明细类型 | `biz_source_detail_type` | String |
| 12 | `exemptionAmount` | 免除金额 | `exemption_amount` | Decimal |
| 13 | `remark` | 说明 | `remark` | String |
| 14 | `interestProcess` | 利息处理方式 | `interest_process` | String |
| 15 | `supplierTransApplyDetailDefineCharacter` | 账单管理表体自定义项特征 | `define_character_id` | 620e2f0f-7147-41e0-8b45-952290d4d01e |
| 16 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 17 | `createDate` | 创建日期 | `create_date` | Date |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime |
| 19 | `creator` | 创建人名称 | `creator` | String |
| 20 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `deductions` | 电子钱包供应商交易申请单抵扣明细表 | `` | 2d651c2f-7152-4f4a-b41a-b0087c90de75 |
| 22 | `define` | 账单管理明细自由自定义项 | `` | da0ddd68-aa3d-41f4-8b3a-f2d111d06ebd |
| 23 | `dr` | 逻辑删除标记 | `dr` | Short |
| 24 | `fileId` | 费用附件 | `file_id` | String |
| 25 | `modifier` | 修改人名称 | `modifier` | String |
| 26 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |
| 30 | `sourceDetailCode` | 来源单据明细编码 | `source_detail_code` | String |
| 31 | `sourceDetailTitle` | 来源单据明细名称 | `source_detail_title` | String |
| 32 | `sourceDetailType` | 来源单据明细类型 | `source_detail_type` | String |
| 33 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 34 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `applyId` | 交易申请单 | `ewallet.suppliertransapply.SupplierTransApply` | None | true |
| 2 | `walletId` | 电子钱包 | `ewallet.wallet.Wallet` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `define` | 账单管理明细自由自定义项 | `ewallet.suppliertransapply.SupplierTransApplyDetailFreeDefine` | None | true |
| 7 | `supplierTransApplyDetailDefineCharacter` | 账单管理表体自定义项特征 | `ewallet.suppliertransapply.SupplierTransApplyDetailDefineCharacter` | None |  |
| 8 | `deductions` | 电子钱包供应商交易申请单抵扣明细表 | `ewallet.suppliertransapply.SupplierTransApplyDeduction` | None | true |
