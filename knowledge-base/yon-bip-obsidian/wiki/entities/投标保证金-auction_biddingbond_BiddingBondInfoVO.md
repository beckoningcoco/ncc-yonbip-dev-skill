---
tags: ["BIP", "元数据", "数据字典", "auction.biddingbond.BiddingBondInfoVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 投标保证金 (`auction.biddingbond.BiddingBondInfoVO`)

>  | 物理表：`cpu_bidding_bond_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标保证金 |
| 物理表 | `cpu_bidding_bond_info` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 23:26:38.3720` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `status` | 投保状态 | `status` | String |
| 2 | `linkman` | 联系人 | `linkman` | String |
| 3 | `insuranceMonery` | 供应商保额 | `insurance_monery` | Decimal |
| 4 | `insurancePayMonery` | 供应商保额花费 | `insurance_pay_monery` | Decimal |
| 5 | `earnestStartTime` | 投保开始时间 | `earnest_start_time` | DateTime |
| 6 | `biddingId` | 投标记录id | `bidding_id` | b1e45acc-57ae-4a37-a971-a848cddafaf1 |
| 7 | `id` | id | `id` | Long |
| 8 | `linkmanTel` | 联系电话 | `linkman_tel` | String |
| 9 | `policyNo` | 投保单号 | `policy_no` | String |
| 10 | `hasInvoiced` | 是否开过发票 | `has_invoiced` | Boolean |
| 11 | `vendorTenant` | vendorTenant | `vendor_tenant_id` | String |
| 12 | `bidSectionCode` | 标段包编码 | `bid_section_code` | String |
| 13 | `bidSectionId` |  标段 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 14 | `tenantId` | tenantId | `tenant_id` | String |
| 15 | `linkmanEmail` | 电子邮箱 | `linkman_email` | String |
| 16 | `linkmanFax` | 传真 | `linkman_fax` | String |
| 17 | `paymentTypeId` | 保证金缴纳方式 | `payment_type_id` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b |
| 18 | `isSupport` | 是否电子钱包支持 | `is_support` | Boolean |
| 19 | `ewalletSupTransApplyId` | 缴费单主表 | `ewalletsup_transapply_id` | Long |
| 20 | `ewalletSupTransApplyDetailId` | 缴费单子表 | `ewalletsup_transapply_detail_id` | Long |
| 21 | `paymentType` | 缴纳方式 | `payment_type` | String |
| 22 | `paymentAmount` | 缴纳金额 | `payment_amount` | Decimal |
| 23 | `companyName` | 缴纳单位名称 | `company_name` | String |
| 24 | `supplierIshidden` | 是否隐藏供应商 | `supplier_is_hidden` | Integer |
| 25 | `guaranteeFile` | 附件 | `guarantee_file` | String |
| 26 | `bidSectionName` | 标段（包）名称 | `bid_section_name` | String |
| 27 | `earnestEndTime` | 缴纳截止时间 | `earnest_end_time` | DateTime |
| 28 | `purchaseName` | 联系人 | `purchase_name` | String |
| 29 | `purchaseTel` | 联系电话 | `purchase_tel` | String |
| 30 | `purchaseEmail` | 邮箱 | `purchase_email` | String |
| 31 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 32 | `bidProjectCode` | 采购项目编号 | `bid_project_code` | String |
| 33 | `bidProjectName` | 采购项目名称 | `bid_project_name` | String |
| 34 | `bondCode` | 编码 | `code` | String |
| 35 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 36 | `dr` | 逻辑删除标记 | `dr` | Short |
| 37 | `hasDownloadAttach` | 是否已下载附件 | `has_download_attach` | Boolean |
| 38 | `marginAmount` | 保证金金额 | `margin_amount` | Decimal |
| 39 | `paymentTime` | 保函购买时间 | `payment_time` | DateTime |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime |
| 41 | `purEnterpriseId` | 采购商租户 | `pur_enterprise_id` | Long |
| 42 | `purEnterpriseName` | 采购组织 | `pur_enterprise_name` | String |
| 43 | `subEnterpriseName` | 供应商名称 | `sub_enterprise_name` | String |
| 44 | `supUserId` | 投保供应商用户 | `sup_user_id` | String |
| 45 | `ts` | 默认值 | `ts` | DateTime |
| 46 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `paymentTypeId` | 保证金缴纳方式 | `ewallet.config.PayType` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标记录id | `auction.bid.BiddingVO` | None |  |
| 4 | `bidSectionId` |  标段 | `auction.project.AuctionSection` | None |  |
