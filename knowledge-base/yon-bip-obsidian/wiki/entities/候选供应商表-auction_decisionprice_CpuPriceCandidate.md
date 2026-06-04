---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.decisionprice.CpuPriceCandidate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 候选供应商表 (`auction.decisionprice.CpuPriceCandidate`)

> ycSouringAuction | 物理表：`cpu_price_candidate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 候选供应商表 |
| 物理表 | `cpu_price_candidate` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:08.4190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（39个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 3 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 4 | `cpuPriceCandidateDefineCharacter` | 候选供应商子表自定义项 | `cpu_price_candidate_define_character` | 50010873-24df-4f78-b565-d0f325e92de8 |
| 5 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 6 | `ts` | 时间戳 | `ts` | DateTime |
| 7 | `singleFlag` | 单重 | `single_flag` | Integer |
| 8 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 9 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `bidProjectId` | 项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 14 | `bidSectionId` | 标段(包)编号 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 15 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 16 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 17 | `approveNotes` | 审核时中标结果说明 | `approve_notes` | String |
| 18 | `supplydocId` | 中标竞拍方主键 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 19 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 20 | `priceId` | 比价单主键 | `price_id` | e3af2b56-0a6e-4569-ba63-281df1c9be1b |
| 21 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 22 | `ranking` | 候选排名 | `ranking` | Integer |
| 23 | `bidScore` | 分数 | `bid_score` | Decimal |
| 24 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 25 | `fictitiousScore` | 拟中标分数 | `fictitious_score` | Decimal |
| 26 | `fictitiousNum` | 中标品类数量 | `fictitious_num` | Decimal |
| 27 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 28 | `taxBidPrice` | 出价含税总价 | `tax_bid_price` | Decimal |
| 29 | `upstreamSupplierId` | 汇总报价单表头主键 | `upstream_supplier_id` | b1392faa-f850-4468-b4b3-d7f1f85fc4b4 |
| 30 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 31 | `supOther` | 供应商其他 | `sup_other` | String |
| 32 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 33 | `bidPrice` | 出价无税总价 | `bid_price` | Decimal |
| 34 | `rmbTotal` | 人民币总价 | `rmb_total` | Decimal |
| 35 | `taxFictitiousPrice` | 拟中标含税总价 | `tax_fictitious_price` | Decimal |
| 36 | `fictitiousPrice` | 拟中标无税总价 | `fictitious_price` | Decimal |
| 37 | `state` | 是否中标 | `state` | Integer |
| 38 | `invitation` | 邀请标识 | `invitation` | Integer |
| 39 | `freeDefine` | 候选供应商表自定义项表 | `` | a48344b9-806f-444a-ae2f-87fdd9825595 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplydocId` | 中标竞拍方主键 | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `freeDefine` | 候选供应商表自定义项表 | `auction.decisionprice.CpuPriceCandidateFreeDefine` | None | true |
| 4 | `cpuPriceCandidateDefineCharacter` | 候选供应商子表自定义项 | `auction.decisionprice.CpuPriceCandidateDefineCharacter` | None |  |
| 5 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `priceId` | 比价单主键 | `auction.decisionprice.CpuPrice` | None | true |
| 7 | `bidProjectId` | 项目ID | `lawbid.project.LawbidProject` | None |  |
| 8 | `upstreamSupplierId` | 汇总报价单表头主键 | `auction.scoringdata.ScoringDataMark` | None |  |
| 9 | `bidSectionId` | 标段(包)编号 | `auction.project.AuctionSection` | None |  |
