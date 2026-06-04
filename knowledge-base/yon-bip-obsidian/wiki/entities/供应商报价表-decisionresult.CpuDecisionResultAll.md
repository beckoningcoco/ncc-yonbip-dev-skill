---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionresult.CpuDecisionResultAll"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商报价表 (`lawbid.decisionresult.CpuDecisionResultAll`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSouringBid 模块实体元数据字典。
> 物理表：`cpu_dsn_result` | 所属应用：`ycSouringBid`
> 来源：元数据API `queryByUri` 返回的 `lawbid.decisionresult.CpuDecisionResultAll` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商报价表 |
| 物理表 | `cpu_dsn_result` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:28.4790` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2025-10-24 23:58:15:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202509111122_metadata_lawbid-decisionresult.zip`
- **安装人**: mongoTools
- **安装排名**: `a06d6dbc-c18a-4775-a70d-44e3b94130f5`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 直接属性（共 118 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `adviceNotes` | 中标通知书时说明 | `advice_notes` | String | `text` |  | ✓ |
| 2 | `amountServiceFee` | 服务费金额 | `amount_service_fee` | Decimal | `number` |  | ✓ |
| 3 | `approveNotes` | 定标意见 | `approve_notes` | String | `text` |  | ✓ |
| 4 | `bidNoticeFile` | 附件 | `bid_notice_file` | String | `text` |  | ✓ |
| 5 | `bidNum` | 投标数量 | `bid_num` | Decimal | `number` |  | ✓ |
| 6 | `bidPrice` | 投标无税金额 | `bid_price` | Decimal | `number` |  | ✓ |
| 7 | `bidProjectCode` | 项目编码 | `bid_project_code` | String | `text` |  | ✓ |
| 8 | `bidProjectId` | 项目主键 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 | `quote` |  | ✓ |
| 9 | `bidProjectName` | 项目名称 | `bid_project_name` | String | `text` |  | ✓ |
| 10 | `bidScore` | 分数 | `bid_score` | Decimal | `number` |  | ✓ |
| 11 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String | `text` |  | ✓ |
| 12 | `bidSectionId` | 标段(包)编号主键 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 | `quote` |  | ✓ |
| 13 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String | `text` |  | ✓ |
| 14 | `bidType` | 采购方式 | `bid_type` | String | `text` |  | ✓ |
| 15 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 16 | `code` | 订单号 | `code` | String | `text` |  | ✓ |
| 17 | `deadlineDate` | 最后期限 | `deadline_date` | DateTime | `timestamp` |  | ✓ |
| 18 | `decisionCount` | 中标条目数 | `decision_count` | Integer | `int` |  | ✓ |
| 19 | `decisionId` | 定标单主键 | `decision_id` | 1fc86047-2eea-424c-b46f-8fd24fdcc970 | `quote` |  | ✓ |
| 20 | `decisionResultDefineCharacter` | 供应商报价情况表自定义项 | `decision_result_define_character` | 9a65eb18-cd34-4267-a4ae-ee9a22df3388 | `UserDefine` |  | ✓ |
| 21 | `deliveryDate` | 交货期 | `delivery_date` | String | `text` |  | ✓ |
| 22 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer | `int` |  | ✓ |
| 23 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer | `int` |  | ✓ |
| 24 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer | `int` |  | ✓ |
| 25 | `deratePrice` | 服务费减免额度 | `derate_price` | Decimal | `number` |  | ✓ |
| 26 | `detailSealDate` | 明细签章日期 | `detail_seal_date` | DateTime | `timestamp` |  | ✓ |
| 27 | `detailSealStatus` | 中标明细盖章状态 | `detail_seal_status` | Integer | `int` |  | ✓ |
| 28 | `dollarTotal` | 美元金额 | `dollar_total` | Decimal | `number` |  | ✓ |
| 29 | `dr` | 逻辑删除标记 | `dr` | Integer | `int` |  | ✓ |
| 30 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer | `int` |  | ✓ |
| 31 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer | `int` |  | ✓ |
| 32 | `editPath` | word文件名 | `edit_path` | String | `text` |  | ✓ |
| 33 | `editPreview` | pdf文件名 | `edit_preview` | String | `text` |  | ✓ |
| 34 | `editStatus` | 编辑状态 | `edit_status` | Integer | `int` |  | ✓ |
| 35 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer | `int` |  | ✓ |
| 36 | `enterpriseId` | 企业 | `enterprise_id` | Long | `long` |  | ✓ |
| 37 | `enterpriseName` | 企业名称 | `enterprise_name` | String | `text` |  | ✓ |
| 38 | `euroTotal` | 欧元金额 | `euro_total` | Decimal | `number` |  | ✓ |
| 39 | `feeType` | 服务费类型 | `fee_type` | String | `text` |  | ✓ |
| 40 | `fictitiousNum` | 拟中标数量 | `fictitious_num` | Decimal | `number` |  | ✓ |
| 41 | `fictitiousPrice` | 拟中标无税金额 | `fictitious_price` | Decimal | `number` |  | ✓ |
| 42 | `fictitiousScore` | 拟中标分数 | `fictitious_score` | Decimal | `number` |  | ✓ |
| 43 | `id` | id | `id` | Long | `long` |  | ✓ |
| 44 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer | `int` |  | ✓ |
| 45 | `internationalBid` | 是否国际标 | `international_bid` | Integer | `int` |  | ✓ |
| 46 | `invitation` | 邀请标识 | `invitation` | Integer | `int` |  | ✓ |
| 47 | `isBid` | 是否中标 | `isBid` | Boolean | `switch` |  | ✓ |
| 48 | `ispay` | 是否交费 | `isPay` | Integer | `int` |  | ✓ |
| 49 | `isunite` | 是否是联合体投标 | `isUnite` | Integer | `int` |  | ✓ |
| 50 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer | `int` |  | ✓ |
| 51 | `mainBidderId` | 主投人租户主键 | `main_bidder_id` | Long | `long` |  | ✓ |
| 52 | `mainId` | 主投人主键 | `main_id` | Long | `long` |  | ✓ |
| 53 | `manager` | 项目经理 | `manager` | String | `text` |  | ✓ |
| 54 | `manufacturerFlag` | 制造商 | `manufacturer_flag` | Integer | `int` |  | ✓ |
| 55 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean | `switch` |  | ✓ |
| 56 | `noticeDownloadTime` | 中标通知书下载时间 | `notice_download_time` | DateTime | `timestamp` |  | ✓ |
| 57 | `noticeNotes` | 中标结果公告时说明 | `notice_notes` | String | `text` |  | ✓ |
| 58 | `notselectSuppliericeContent` | 内容 | `notice_content` | String | `text` |  | ✓ |
| 59 | `other` | 其他 | `other` | String | `text` |  | ✓ |
| 60 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer | `int` |  | ✓ |
| 61 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer | `int` |  | ✓ |
| 62 | `otherShow` | 是否显示其他 | `other_show` | Integer | `int` |  | ✓ |
| 63 | `payDate` | 交费日期 | `pay_date` | DateTime | `timestamp` |  | ✓ |
| 64 | `payMode` | 付款方式 | `pay_mode` | String | `text` |  | ✓ |
| 65 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer | `int` |  | ✓ |
| 66 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer | `int` |  | ✓ |
| 67 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer | `int` |  | ✓ |
| 68 | `paymentNotice` | 缴费通知单 | `payment_notice` | String | `text` |  | ✓ |
| 69 | `paymentReason` | 缴费原因 | `payment_reason` | String | `text` |  | ✓ |
| 70 | `picketageId` | 主表主键 | `picketage_id` | Long | `long` |  | ✓ |
| 71 | `poundTotal` | 英镑金额 | `pound_total` | Decimal | `number` |  | ✓ |
| 72 | `priceUnit` | 货币单位中标价格 | `price_unit` | String | `text` |  | ✓ |
| 73 | `processingStatus` | 处理状态 | `processing_status` | Boolean | `switch` |  | ✓ |
| 74 | `processingTime` | 处理时间 | `processing_time` | DateTime | `timestamp` |  | ✓ |
| 75 | `producerFlag` | 产地 | `producer_flag` | Integer | `int` |  | ✓ |
| 76 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 77 | `purchasingPerson` | 采购负责人 | `purchasing_person` | String | `text` |  | ✓ |
| 78 | `ranking` | 候选排名 | `ranking` | Integer | `int` |  | ✓ |
| 79 | `rmbTotal` | 人民币金额 | `rmb_total` | Decimal | `number` |  | ✓ |
| 80 | `sealDate` | 中标通知书签章日期 | `seal_date` | DateTime | `timestamp` |  | ✓ |
| 81 | `sealId` | 章主键 | `seal_id` | String | `text` |  | ✓ |
| 82 | `sealStatus` | 盖章状态 | `seal_status` | Integer | `int` |  | ✓ |
| 83 | `sendDate` | 发送时间 | `send_date` | DateTime | `timestamp` |  | ✓ |
| 84 | `serciePrice` | 服务费 | `sercie_price` | Decimal | `number` |  | ✓ |
| 85 | `serciePriceUnit` | 货币单位服务费 | `sercie_price_unit` | String | `text` |  | ✓ |
| 86 | `singleFlag` | 单重 | `single_flag` | Integer | `int` |  | ✓ |
| 87 | `state` | 预留状态 | `state` | Integer | `int` |  | ✓ |
| 88 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String | `text` |  | ✓ |
| 89 | `supEnterpriseId` | 供应商企业 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 90 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String | `text` |  | ✓ |
| 91 | `supOther` | 供应商其他 | `sup_other` | String | `text` |  | ✓ |
| 92 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String | `text` |  | ✓ |
| 93 | `supStatus` | 供应商调整状态 | `sup_status` | Integer | `int` |  | ✓ |
| 94 | `supSubmitDate` | 供应商提交时间 | `sup_submit_date` | DateTime | `timestamp` |  | ✓ |
| 95 | `supTechnical` | 供应商技术指标 | `sup_technical` | String | `text` |  | ✓ |
| 96 | `supplementRate` | 税率 | `supplement_rate` | Decimal | `number` |  | ✓ |
| 97 | `supplierReview` | 供应商查看情况 | `supplier_review` | String | `text` |  | ✓ |
| 98 | `supplyCode` | 供应商编码 | `supply_code` | String | `text` |  | ✓ |
| 99 | `supplydocId` | 拟中标供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 100 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String | `text` |  | ✓ |
| 101 | `taxBidPrice` | 投标含税金额 | `tax_bid_price` | Decimal | `number` |  | ✓ |
| 102 | `taxFictitiousPrice` | 拟中标含税金额 | `tax_fictitious_price` | Decimal | `number` |  | ✓ |
| 103 | `taxWinPrice` | 中标含税金额 | `tax_win_price` | Decimal | `number` |  | ✓ |
| 104 | `techleader` | 技术负责人 | `techleader` | String | `text` |  | ✓ |
| 105 | `technical` | 技术指标 | `technical` | String | `text` |  | ✓ |
| 106 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer | `int` |  | ✓ |
| 107 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer | `int` |  | ✓ |
| 108 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer | `int` |  | ✓ |
| 109 | `templateId` | 模板主键 | `template_id` | Long | `long` |  | ✓ |
| 110 | `totalDiscountPrice` | 折算报价金额 | `total_discount_price` | Decimal | `number` |  | ✓ |
| 111 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 112 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 113 | `upstreamSupplierId` | 汇总报价单表头主键 | `upstream_supplier_id` | d7ba184f-30df-4eb9-a0d9-91c375b93db8 | `quote` |  | ✓ |
| 114 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String | `text` |  | ✓ |
| 115 | `winNum` | 中标数量 | `win_num` | Decimal | `number` |  | ✓ |
| 116 | `winPrice` | 中标无税金额 | `win_price` | Decimal | `number` |  | ✓ |
| 117 | `yenTotal` | 日元金额 | `yen_total` | Decimal | `number` |  | ✓ |
| 118 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 9 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `transType` | 交易类型 | `bd.bill.TransType` | `trans_type` |  →  |  |  | Service |  |
| 2 | `supplydocId` | 拟中标供应商 | `aa.vendor.Vendor` | `supplydoc_id` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `supEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | `sup_enterprise_id` |  →  |  |  | Service |  |
| 5 | `decisionResultDefineCharacter` | 供应商报价情况表自定义项 | `lawbid.decisionresult.DecisionResultDefineCharacter` | `decision_result_define_character` |  →  |  |  | None |  |
| 6 | `decisionId` | 定标单主键 | `lawbid.decisionresult.CpuDecision` | `decision_id` | resultAllList → decisionId | 0..n | true | None |  |
| 7 | `bidProjectId` | 项目主键 | `lawbid.project.LawbidProject` | `bid_project_id` |  →  |  |  | None |  |
| 8 | `upstreamSupplierId` | 汇总报价单表头主键 | `lawbid.scoringdata.ScoringDataMark` | `upstream_supplier_id` |  →  |  |  | None |  |
| 9 | `bidSectionId` | 标段(包)编号主键 | `lawbid.section.LawbidSection` | `bid_section_id` |  →  |  |  | None |  |

### Composition（子表）

- **decisionId**: `resultAllList` → `lawbid.decisionresult.CpuDecision` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `transType` (交易类型) | `bd.bill.TransType` | `trans_type` |
| `supplydocId` (拟中标供应商) | `aa.vendor.Vendor` | `supplydoc_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `supEnterpriseId` (供应商企业) | `cpu-privilege.enterprise.EnterprisePOJO` | `sup_enterprise_id` |
