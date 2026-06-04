---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.decisionprice.CpuPrice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 比价主表 (`auction.decisionprice.CpuPrice`)

> ycSouringAuction | 物理表：`cpu_price`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 比价主表 |
| 物理表 | `cpu_price` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:27.8400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（50个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 3 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 4 | `bidProjectId` | 项目主键 | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 5 | `cpuPriceDefineCharacter` | 比价单主表表头自定义项 | `cpu_price_define_character` | df485b67-7a4a-40b9-84af-0b64c057c662 |
| 6 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 7 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 8 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 9 | `purOrgId` | 采购组织主键 | `pur_org_id` | String |
| 10 | `linkDepartmentId` | 联系人部门主键 | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 11 | `rateRange` | 汇率取值 | `rate_range` | Short |
| 12 | `billstate` | 单据状态 | `billstate` | Integer |
| 13 | `failSource` | 流标来源 | `fail_source` | Integer |
| 14 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 19 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 20 | `bidType` | 竞拍方式 | `bid_type` | String |
| 21 | `qualifyCheckType` | 资格审核当前流程阶段 | `qualify_check_type` | Integer |
| 22 | `bidMethodType` | 招标组织形式 | `bid_method_type` | String |
| 23 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 24 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 25 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 26 | `combination` | 是否是组合标 | `combination` | Integer |
| 27 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 28 | `evaluationMethod` | 评标办法 | `evaluation_method` | String |
| 29 | `qualifyCheckStep` | 预审或者后审代表流程阶段 | `qualify_check_step` | Integer |
| 30 | `agencyorgId` | 代理机构组织主键 | `agencyOrg_id` | String |
| 31 | `agencyorgName` | 代理机构组织 | `agencyOrg_name` | String |
| 32 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 33 | `agencyPersonId` | 代理机构组织人员主键 | `agency_person_id` | String |
| 34 | `agencyPersonName` | 代理机构人员姓名 | `agency_person_name` | String |
| 35 | `payMode` | 付款方式 | `pay_mode` | String |
| 36 | `other` | 其他 | `other` | String |
| 37 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 38 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 39 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 40 | `calibrationQuoteType` | 中标单价依据 | `calibration_quote_type` | Short |
| 41 | `bidUnitPriceWay` | 中标单价取值 | `bid_unit_price_way` | Short |
| 42 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 43 | `assessFileId` | 评审附件 | `assess_file_id` | String |
| 44 | `approveRecord` | 是否有审批记录 | `approve_record` | Short |
| 45 | `purOrgName` | 采购组织 | `pur_org_name` | String |
| 46 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 47 | `bidProjectType` | 采购内容 | `bid_project_type` | String |
| 48 | `define` | 比价主表自定义项表 | `` | b763bb0a-de8b-4d18-b8ab-7a35c634641d |
| 49 | `priceCandidate` | 候选供应商表 | `` | f002a9ec-7389-4ae4-b0d5-e3777f677434 |
| 50 | `priceMaterialDetail` | 比价物料子表 | `` | 429d0e3d-3755-486c-b1e5-9c921886f185 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `priceMaterialDetail` | 比价物料子表 | `auction.decisionprice.CpuPriceMaterialDetail` | None | true |
| 2 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `priceCandidate` | 候选供应商表 | `auction.decisionprice.CpuPriceCandidate` | None | true |
| 5 | `define` | 比价主表自定义项表 | `auction.decisionprice.CpuPriceFreeDefine` | None | true |
| 6 | `cpuPriceDefineCharacter` | 比价单主表表头自定义项 | `auction.decisionprice.CpuPriceDefineCharacter` | None |  |
| 7 | `linkDepartmentId` | 联系人部门主键 | `org.func.BaseOrg` | Service |  |
| 8 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `bidProjectId` | 项目主键 | `auction.project.AuctionProject` | None |  |
| 10 | `bidSectionId` | 标段(包)编号主键 | `auction.project.AuctionSection` | None |  |
