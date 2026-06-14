---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.BoardPriceVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标谈判页 (`sourcing.ibuyoffer.BoardPriceVO`)

> ycSouringInquiry | 物理表：`ipu_quotation`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标谈判页 |
| 物理表 | `ipu_quotation` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:16.7230` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 | 采购单ID(询价单ID) |
| 编码 | `vbuyoffer_billcode` | String | 单据号 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 采购单ID(询价单ID) | `id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 2 | `code` | 单据号 | `vbuyoffer_billcode` | String |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 8 | `status` | 单据状态 | `status` | Short |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 12 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 13 | `tenant` | 租户ID | `tenant_id` | String |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `priceMain` | 开标谈判页报价单子表 | `` | f99e1d50-a840-46e6-808b-de8fe1b72196 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 4 | `priceMain` | 开标谈判页报价单子表 | `sourcing.ibuyoffer.BoardPriceQuotationOffer` | None | true |
| 5 | `id` | 采购单ID(询价单ID) | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 6 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
