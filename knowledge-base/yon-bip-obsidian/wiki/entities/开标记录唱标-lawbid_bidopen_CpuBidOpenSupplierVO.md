---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidopen.CpuBidOpenSupplierVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标记录唱标 (`lawbid.bidopen.CpuBidOpenSupplierVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bidopen_supplier`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标记录唱标 |
| 物理表 | `cpu_bidopen_supplier` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:40.1680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:22:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（48个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | id | `id` | Long |
| 4 | `bidopenId` | 开标记录主表 | `bidopen_id` | d9b08ed7-bb49-4184-bf86-23970f6dcb80 |
| 5 | `biddingId` | 投标主表 | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 6 | `projectId` | 招标项目ID | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 7 | `projectCode` | 招标项目编码 | `project_code` | String |
| 8 | `projectName` | 招标项目名称 | `project_name` | String |
| 9 | `sectionId` | 标段(包)ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 10 | `sectionCode` | 标段(包)编码 | `bid_section_code` | String |
| 11 | `sectionName` | 标段(包)名称 | `bid_section_name` | String |
| 12 | `bidType` | 采购方式 | `bid_type` | String |
| 13 | `qualifyCheckType` | 资格审核方式 0预审 1后审 | `qualify_check_type` | Integer |
| 14 | `qualifyCheckStep` | 资格审核当前流程阶段 0代表预审阶段 1代表后审阶段 | `qualify_check_step` | Integer |
| 15 | `bidderId` | 投标人主键 | `bidder_id` | Long |
| 16 | `bidderCode` | 投标人编码 | `bidder_code` | String |
| 17 | `bidderName` | 投标人名称 | `bidder_name` | String |
| 18 | `bidderStatus` | 评标阶段的投标人状态,1默认,2否决(不可评标) | `bidder_status` | String |
| 19 | `totalQuotationItems` | 总报价项数 | `total_quotation_items` | Integer |
| 20 | `conversionTaxBidTotalLow` | 换算后含税总价 | `conversion_tax_bid_total_low` | Decimal |
| 21 | `totalQuotationNum` | 总报价数量 | `total_quotation_num` | Decimal |
| 22 | `totalQuotation` | 总报价 | `total_quotation` | Decimal |
| 23 | `conversionBidTotalLow` | 换算后无税总价 | `conversion_bid_total_low` | Decimal |
| 24 | `period` | 工期 | `period` | String |
| 25 | `earnestMoneyStatus` | 保证金缴纳状态:1、未缴纳 2、已缴纳 | `earnest_money_status` | Integer |
| 26 | `bidopenStatus` | 开标状态:1、未开标 2、已开标 | `bidopen_status` | Integer |
| 27 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 28 | `enterpriseName` | 供应商名称 | `enterprise_name` | String |
| 29 | `bidStatus` | 0:来源供应商报名,1:邀请未报名 | `bid_status` | Integer |
| 30 | `invitation` | 邀请标识1邀请 默认0 | `invitation` | Integer |
| 31 | `openRound` | 当前开标轮次 | `open_round` | Integer |
| 32 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 33 | `secretStatus` | 文件加密状态 | `secret_status` | Integer |
| 34 | `decryptTime` | 文件解密时间 | `decrypt_time` | DateTime |
| 35 | `deliveryTime` | 文件递交时间 | `delivery_time` | DateTime |
| 36 | `signerName` | 签到人姓名 | `signer_name` | String |
| 37 | `linkmanTel` | 联系方式 | `linkman_tel` | String |
| 38 | `signStatus` | 签到状态 | `sign_status` | Integer |
| 39 | `signTime` | 签到时间 | `sign_time` | DateTime |
| 40 | `deliveryDate` | 交货日期 | `delivery_date` | DateTime |
| 41 | `fileSubmitTime` | 文件递交时间 | `file_submit_time` | DateTime |
| 42 | `taxTotalQuotation` | 含税总报价 | `tax_total_quotation` | Decimal |
| 43 | `workDuration` | 工期 | `work_duration` | String |
| 44 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 45 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 46 | `eliminateReason` | 淘汰原因 | `eliminate_reason` | String |
| 47 | `isEliminated` | 是否被淘汰 | `is_eliminated` | Integer |
| 48 | `stepSeq` | 当前分步开标阶段 | `step_seq` | Integer |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidopenId` | 开标记录主表 | `lawbid.bidopen.CpuBidOpenVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标主表 | `lawbid.bid.BiddingVO` | None |  |
| 4 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `sectionId` | 标段(包)ID | `lawbid.section.LawbidSection` | None |  |
| 6 | `projectId` | 招标项目ID | `lawbid.project.LawbidProject` | None |  |
