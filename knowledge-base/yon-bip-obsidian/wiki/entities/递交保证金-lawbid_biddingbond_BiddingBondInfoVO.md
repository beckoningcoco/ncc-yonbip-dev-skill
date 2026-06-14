---
tags: ["BIP", "元数据", "数据字典", "lawbid.biddingbond.BiddingBondInfoVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 递交保证金 (`lawbid.biddingbond.BiddingBondInfoVO`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_bidding_bond_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 递交保证金 |
| 物理表 | `cpu_bidding_bond_info` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 20:14:21.1760` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:19:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |
| 5 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 2 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 3 | `bidSectionCode` | 标包编号 | `bid_section_code` | String |
| 4 | `bidSectionId` | 标段id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 5 | `bondCode` | 编码 | `code` | String |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `supplierIshidden` | 是否隐藏供应商 | `supplier_is_hidden` | Integer |
| 9 | `hasDownloadAttach` | 是否已下载附件 | `has_download_attach` | Boolean |
| 10 | `paymentTypeId` | 缴纳方式id | `payment_type_id` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b |
| 11 | `paymentTime` | 保函购买时间 | `payment_time` | DateTime |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `purEnterpriseId` | 供应商企业 | `pur_enterprise_id` | Long |
| 14 | `purEnterpriseName` | 采购组织 | `pur_enterprise_name` | String |
| 15 | `subEnterpriseName` | 供应商名称 | `sub_enterprise_name` | String |
| 16 | `supUserId` | 投保供应商用户id | `sup_user_id` | String |
| 17 | `ts` | 默认值 | `ts` | DateTime |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 19 | `status` | 投保状态 | `status` | String |
| 20 | `linkman` | 联系人 | `linkman` | String |
| 21 | `insuranceMonery` | 供应商保额 | `insurance_monery` | Decimal |
| 22 | `ewalletSupTransApplyId` | 缴费单主表 | `ewalletsup_transapply_id` | Long |
| 23 | `insurancePayMonery` | 供应商保额花费 | `insurance_pay_monery` | Decimal |
| 24 | `biddingId` | 投标记录id | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 25 | `ewalletSupTransApplyDetailId` | 缴费单子表 | `ewalletsup_transapply_detail_id` | Long |
| 26 | `id` | id | `id` | Long |
| 27 | `linkmanTel` | 联系电话 | `linkman_tel` | String |
| 28 | `policyNo` | 投保单号 | `policy_no` | String |
| 29 | `hasInvoiced` | 是否开过发票 | `has_invoiced` | Boolean |
| 30 | `tenantId` | tenantId | `tenant_id` | String |
| 31 | `isSupport` | 是否电子钱包接管 | `is_support` | Boolean |
| 32 | `linkmanEmail` | 电子邮箱 | `linkman_email` | String |
| 33 | `linkmanFax` | 传真 | `linkman_fax` | String |
| 34 | `paymentType` | 缴纳方式 | `payment_type` | String |
| 35 | `paymentAmount` | 缴纳金额 | `payment_amount` | Decimal |
| 36 | `companyName` | 缴纳单位名称 | `company_name` | String |
| 37 | `guaranteeFile` | 电子保函 | `guarantee_file` | String |
| 38 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 39 | `earnestEndTime` | 缴纳截止时间 | `earnest_end_time` | DateTime |
| 40 | `purchaseName` | 联系人 | `purchase_name` | String |
| 41 | `purchaseTel` | 联系电话 | `purchase_tel` | String |
| 42 | `purchaseEmail` | 邮箱 | `purchase_email` | String |
| 43 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 44 | `earnestStartTime` | 距离开标截止还有 | `earnest_start_time` | DateTime |
| 45 | `marginAmount` | 保证金金额 | `margin_amount` | Decimal |
| 46 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `paymentTypeId` | 缴纳方式id | `ewallet.config.PayType` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标记录id | `lawbid.bid.BiddingVO` | None |  |
| 4 | `bidSectionId` | 标段id | `lawbid.section.LawbidSection` | None |  |
