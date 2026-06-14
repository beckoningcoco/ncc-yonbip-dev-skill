---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.BiddocTalkssupplierVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判单供应商子表 (`sourcing.ibuyoffer.BiddocTalkssupplierVO`)

> ycSouringInquiry | 物理表：`cpu_biddoc_talkssupplier`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判单供应商子表 |
| 物理表 | `cpu_biddoc_talkssupplier` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:10.0060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 谈判供应商子表ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `talksId` | 谈判单主表ID | `talks_id` | f948c8ae-1c2d-4dc3-8290-38c81d361f90 |
| 2 | `id` | 谈判供应商子表ID | `id` | Long |
| 3 | `supbidId` | 报价单ID | `supbid_id` | Long |
| 4 | `supplierName` | 供应商 | `supplier_name` | String |
| 5 | `lastNotaxMoney` | 上一轮无税报价 | `last_notax_money` | Decimal |
| 6 | `lastTaxMoney` | 上一轮含税报价 | `last_tax_money` | Decimal |
| 7 | `taxMoney` | 含税金额(现金) | `tax_money` | Decimal |
| 8 | `acceptanceTotalMny` | 含税金额(承兑) | `acceptance_total_mny` | Decimal |
| 9 | `paymentTotalMny` | 含税金额(账期) | `payment_total_mny` | Decimal |
| 10 | `notaxMoney` | 无税金额(现金) | `notax_money` | Decimal |
| 11 | `supPersonName` | 报价人 | `sup_person_name` | String |
| 12 | `bidsupplierId` | 招标供应商id | `bidsupplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 13 | `supPersonMobile` | 报价人电话 | `sup_person_mobile` | String |
| 14 | `talkAllowQuote` | 是否需谈判 | `talk_allow_quote` | Boolean |
| 15 | `status` | 状态 | `status` | String |
| 16 | `failReason` | 淘汰理由 | `fail_reason` | String |
| 17 | `ytenant` | 采购商租户ID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 18 | `supenterpriseId` | 供应商租户ID | `supenterprise_id` | Long |
| 19 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime |
| 21 | `creator` | 创建人 | `creator` | String |
| 22 | `dr` | 删除标识 | `dr` | Integer |
| 23 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 24 | `modifiedTime` | 修改时间 | `modified_time` | DateTime |
| 25 | `modifier` | 修改人 | `modifier` | String |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `supPersonId` | 报价人ID | `sup_person_id` | String |
| 28 | `latestQtofferId` | 最新一轮报价单id | `latest_qtoffer_id` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 29 | `supplierDocId` | 供应商档案 | `supplier_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 30 | `supplierDocName` | 供应商档案名称 | `supplier_doc_name` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierDocId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 采购商租户ID | `yht.tenant.YhtTenant` | Service |  |
| 3 | `bidsupplierId` | 招标供应商id | `aa.vendor.Vendor` | Service |  |
| 4 | `latestQtofferId` | 最新一轮报价单id | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None |  |
| 5 | `talksId` | 谈判单主表ID | `sourcing.ibuyoffer.BiddocTalksVO` | None | true |
