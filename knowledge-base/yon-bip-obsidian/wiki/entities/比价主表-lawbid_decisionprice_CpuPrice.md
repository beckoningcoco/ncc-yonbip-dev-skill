---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionprice.CpuPrice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 比价主表 (`lawbid.decisionprice.CpuPrice`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_price`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 比价主表 |
| 物理表 | `cpu_price` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:53.0480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:27:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 比价单接口 | `lawdecision.itf.ICpuPrice` | 305 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 采购模板-领域扩展字段 | `tpl.itf.TplId` | 53 |
| 6 | 企业ID | `cpu.itf.IEnterprise` | 6 |

---

## 直接属性（53个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `assessFileId` | 评审附件 | `assess_file_id` | String |
| 2 | `failSource` | 流标来源 | `fail_source` | Integer |
| 3 | `billstate` | 单据状态 | `billstate` | Integer |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 6 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 7 | `rateRange` | 汇率取值 | `rate_range` | Short |
| 8 | `cpuPriceDefineCharacter` | 比价单主表表头自定义项 | `cpu_price_define_character` | f52613b8-3083-46f8-8d3f-ddf28674ddfb |
| 9 | `bidType` | 采购方式 | `bid_type` | String |
| 10 | `purchaseType` | 采购类别 | `purchase_type` | String |
| 11 | `purOrgId` | 采购组织主键 | `pur_org_id` | String |
| 12 | `bidProjectType` | 采购内容 | `bid_project_type` | String |
| 13 | `linkDepartmentId` | 联系人部门主键 | `link_department_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `ts` | 时间戳 | `ts` | DateTime |
| 16 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 17 | `id` | id | `id` | Long |
| 18 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 19 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 20 | `bidProjectId` | 项目主键 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 21 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 22 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 23 | `qualifyCheckType` | 资格审核当前流程阶段 | `qualify_check_type` | Integer |
| 24 | `bidMethodType` | 招标组织形式 | `bid_method_type` | String |
| 25 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 26 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 27 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 28 | `combination` | 是否是组合标 | `combination` | Integer |
| 29 | `quotationRate` | 报价响应率 | `quotation_rate` | Decimal |
| 30 | `evaluationMethod` | 评标办法 | `evaluation_method` | String |
| 31 | `qualifyCheckStep` | 预审或者后审代表流程阶段 | `qualify_check_step` | Integer |
| 32 | `agencyorgId` | 代理机构组织主键 | `agencyOrg_id` | String |
| 33 | `agencyorgName` | 代理机构组织 | `agencyOrg_name` | String |
| 34 | `agencyPersonId` | 代理机构组织人员主键 | `agency_person_id` | String |
| 35 | `agencyPersonName` | 代理机构人员姓名 | `agency_person_name` | String |
| 36 | `payMode` | 付款方式 | `pay_mode` | String |
| 37 | `other` | 其他 | `other` | String |
| 38 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 39 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 40 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 41 | `calibrationQuoteType` | 中标单价依据 | `calibration_quote_type` | Short |
| 42 | `bidUnitPriceWay` | 中标单价取值 | `bid_unit_price_way` | Short |
| 43 | `templateId` | 主模板表实例主键 | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 |
| 44 | `supEnterpriseId` | 供应商企业 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 45 | `billTemplateId` | 单据级模板实例主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 46 | `approveRecord` | 是否有审批记录 | `approve_record` | Short |
| 47 | `purOrgName` | 采购组织 | `pur_org_name` | String |
| 48 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 49 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 50 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 51 | `priceCandidate` | 候选供应商表 | `` | 84865df5-c553-4d21-b059-289978f0954e |
| 52 | `priceCompareBase` | 中标比价依据 | `price_compare_base` | Integer |
| 53 | `priceMaterialDetail` | 比价物料子表 | `` | 07b3c3b1-0a54-4928-bda2-87800dbbe6f1 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billTemplateId` | 单据级模板实例主键 | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 2 | `priceMaterialDetail` | 比价物料子表 | `lawbid.decisionprice.CpuPriceMaterialDetail` | None | true |
| 3 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 5 | `priceCandidate` | 候选供应商表 | `lawbid.decisionprice.CpuPriceCandidate` | None | true |
| 6 | `cpuPriceDefineCharacter` | 比价单主表表头自定义项 | `lawbid.decisionprice.CpuPriceDefineCharacter` | None |  |
| 7 | `linkDepartmentId` | 联系人部门主键 | `org.func.BaseOrg` | Service |  |
| 8 | `supEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `templateId` | 主模板表实例主键 | `tpl.templateorginst.TplTemplateInst` | Service |  |
| 10 | `bidProjectId` | 项目主键 | `lawbid.project.LawbidProject` | None |  |
| 11 | `bidSectionId` | 标段(包)编号主键 | `lawbid.section.LawbidSection` | None |  |
