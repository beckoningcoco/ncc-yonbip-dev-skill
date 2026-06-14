---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "ewallet.supplieraccount.SupplierAccount"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包供应商账户信息表 (`ewallet.supplieraccount.SupplierAccount`)

> ycBusinessCenter | 物理表：`cpu_ew_supplier_account`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包供应商账户信息表 |
| 物理表 | `cpu_ew_supplier_account` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:42:35.3990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 账户编码 |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `walletId` | walletId | `wallet_id` | a9a8b3c1-bae2-4f21-ba1d-02628dc747d1 |
| 3 | `supplierId` | 供应商档案 | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 4 | `creatorId` | 创建人账户 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `createDate` | 创建日期 | `create_date` | Date |
| 6 | `modifierId` | 修改人账户 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 10 | `dr` | 逻辑删除标记 | `dr` | Short |
| 11 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 12 | `buyerId` | 采购商租户 | `buyer_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 13 | `buyerName` | 采购商档案名称 | `buyer_name` | String |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `accountStatus` | 状态 | `account_status` | String |
| 16 | `mainOrgId` | 主组织 | `main_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 17 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 18 | `verifystate` | 审批状态 | `verifystate` | Short |
| 19 | `isProxy` | 是否代开账户 | `is_proxy` | Boolean |
| 20 | `returncount` | 退回次数 | `returncount` | Short |
| 21 | `code` | 账户编码 | `code` | String |
| 22 | `creator` | 创建人 | `creator` | String |
| 23 | `modifier` | 修改人 | `modifier` | String |
| 24 | `name` | 账户名称 | `name` | String |
| 25 | `walletName` | 电子钱包 | `wallet_name` | String |
| 26 | `openReason` | 申请原因 | `open_reason` | String |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 29 | `rejectReason` | 驳回原因 | `reject_reason` | String |
| 30 | `accountBalances` | 电子钱包供应商账户余额信息表 | `` | 28c13970-c9cc-47e2-b2bf-131b047e2096 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainOrgId` | 主组织 | `org.func.BaseOrg` | Service |  |
| 2 | `walletId` | walletId | `ewallet.wallet.Wallet` | None |  |
| 3 | `supplierId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 4 | `accountBalances` | 电子钱包供应商账户余额信息表 | `ewallet.supplieraccount.SupplierAccountBalances` | None | true |
| 5 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 6 | `creatorId` | 创建人账户 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人账户 | `base.user.User` | Service |  |
| 8 | `buyerId` | 采购商租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
