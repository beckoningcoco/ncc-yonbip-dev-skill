---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionprice.CpuPriceCandidate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 候选供应商表 (`lawbid.decisionprice.CpuPriceCandidate`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_price_candidate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 候选供应商表 |
| 物理表 | `cpu_price_candidate` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:17.7780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:27:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 候选供应商表接口 | `lawdecision.itf.ICpuPriceCandidate` | 277 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 企业ID | `cpu.itf.IEnterprise` | 6 |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `upstreamSupplierId` | 汇总报价单表头主键 | `upstream_supplier_id` | d7ba184f-30df-4eb9-a0d9-91c375b93db8 |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 4 | `cpuPriceCandidateDefineCharacter` | 候选供应商子表自定义项 | `cpu_price_candidate_define_character` | 8a3c8774-65e4-446b-ab01-ecd745ba7bb4 |
| 5 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 6 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `singleFlag` | 单重 | `single_flag` | Integer |
| 9 | `ts` | 时间戳 | `ts` | DateTime |
| 10 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `id` | id | `id` | Long |
| 12 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 13 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 14 | `bidProjectId` | 项目主键 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 15 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 16 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 17 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 18 | `approveNotes` | 审核时中标结果说明 | `approve_notes` | String |
| 19 | `supplydocId` | 拟中标供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 20 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 21 | `priceId` | 比价单主键 | `price_id` | 43d481da-1475-4536-be5f-09ce6d40dce3 |
| 22 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 23 | `ranking` | 排名 | `ranking` | Integer |
| 24 | `bidScore` | 分数 | `bid_score` | Decimal |
| 25 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 26 | `fictitiousScore` | 拟中标分数 | `fictitious_score` | Decimal |
| 27 | `fictitiousNum` | 中标品类数量 | `fictitious_num` | Decimal |
| 28 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 29 | `taxBidPrice` | 投标含税总价 | `tax_bid_price` | Decimal |
| 30 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 31 | `supOther` | 供应商其他 | `sup_other` | String |
| 32 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 33 | `bidPrice` | 投标无税总价 | `bid_price` | Decimal |
| 34 | `rmbTotal` | 人民币总价 | `rmb_total` | Decimal |
| 35 | `taxFictitiousPrice` | 拟中标含税总价 | `tax_fictitious_price` | Decimal |
| 36 | `fictitiousPrice` | 拟中标无税总价 | `fictitious_price` | Decimal |
| 37 | `state` | 是否中标 | `state` | Integer |
| 38 | `invitation` | 邀请标识 | `invitation` | Integer |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplydocId` | 拟中标供应商 | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 3 | `cpuPriceCandidateDefineCharacter` | 候选供应商子表自定义项 | `lawbid.decisionprice.CpuPriceCandidateDefineCharacter` | None |  |
| 4 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `priceId` | 比价单主键 | `lawbid.decisionprice.CpuPrice` | None | true |
| 6 | `bidProjectId` | 项目主键 | `lawbid.project.LawbidProject` | None |  |
| 7 | `upstreamSupplierId` | 汇总报价单表头主键 | `lawbid.scoringdata.ScoringDataMark` | None |  |
| 8 | `bidSectionId` | 标段(包)编号主键 | `lawbid.section.LawbidSection` | None |  |
