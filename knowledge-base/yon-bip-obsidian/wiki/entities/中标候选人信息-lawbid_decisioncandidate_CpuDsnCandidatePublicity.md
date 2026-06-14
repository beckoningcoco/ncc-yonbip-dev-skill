---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisioncandidate.CpuDsnCandidatePublicity"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 中标候选人信息 (`lawbid.decisioncandidate.CpuDsnCandidatePublicity`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_candidate_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 中标候选人信息 |
| 物理表 | `cpu_candidate_result` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:11.8130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 23:55:28:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 中标候选人公示子表接口 | `lawdecision.itf.ICpuDsnCandidatePublicity` | 593 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（119个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `decisionResultDefineCharacter` | 中标结果子表自定义项特征属性 | `decision_result_define_character` | b0bf7c6b-361d-4347-bdf8-4350bce46b89 |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `dr` | dr | `dr` | Integer |
| 4 | `upstreamSupplierId` | 汇总报价单表头主键 | `upstream_supplier_id` | d7ba184f-30df-4eb9-a0d9-91c375b93db8 |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `id` | id | `id` | Long |
| 8 | `bidProjectId` | 项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 9 | `ranking` | 候选排名 | `ranking` | Integer |
| 10 | `bidSectionId` | 标段(包)编号id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 11 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 12 | `bidScore` | 分数 | `bid_score` | Decimal |
| 13 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 14 | `taxBidPrice` | 投标含税总价 | `tax_bid_price` | Decimal |
| 15 | `supplementRate` | 税率 | `supplement_rate` | Decimal |
| 16 | `editStatus` | 编辑状态 | `edit_status` | Integer |
| 17 | `supplierReview` | 供应商查看情况 | `supplier_review` | String |
| 18 | `notselectSuppliericeContent` | 内容 | `notice_content` | String |
| 19 | `fictitiousNum` | 拟中标数量 | `fictitious_num` | Decimal |
| 20 | `fictitiousScore` | 拟中标分数 | `fictitious_score` | Decimal |
| 21 | `supplydocName` | 拟中标供应商 | `supplydoc_name` | String |
| 22 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 23 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 24 | `ts` | 时间戳 | `ts` | DateTime |
| 25 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 26 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 27 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 28 | `bidPrice` | 投标无税总价 | `bid_price` | Decimal |
| 29 | `rmbTotal` | 人民币总价 | `rmb_total` | Decimal |
| 30 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 31 | `taxFictitiousPrice` | 拟中标含税总价 | `tax_fictitious_price` | Decimal |
| 32 | `fictitiousPrice` | 拟中标无税总价 | `fictitious_price` | Decimal |
| 33 | `taxWinPrice` | 中标含税总价 | `tax_win_price` | Decimal |
| 34 | `bidSectionCode` | 标段(包)编号 | `bid_section_code` | String |
| 35 | `bidSectionName` | 标段(包)名称 | `bid_section_name` | String |
| 36 | `winPrice` | 中标无税总价 | `win_price` | Decimal |
| 37 | `state` | 预留状态 | `state` | Integer |
| 38 | `approveNotes` | 定标意见 | `approve_notes` | String |
| 39 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 40 | `priceUnit` | 货币单位 中标价格 | `price_unit` | String |
| 41 | `winNum` | 中标数量 | `win_num` | Decimal |
| 42 | `noticeNotes` | 中标结果公告时说明 | `notice_notes` | String |
| 43 | `adviceNotes` | 中标通知书时说明 | `advice_notes` | String |
| 44 | `serciePrice` | 服务费 | `sercie_price` | Decimal |
| 45 | `serciePriceUnit` | 货币单位服务费 | `sercie_price_unit` | String |
| 46 | `deratePrice` | 服务费减免额度 | `derate_price` | Decimal |
| 47 | `picketageId` | 主表主键 | `picketage_id` | Long |
| 48 | `supplydocId` | 投标人ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 49 | `supEnterpriseId` | 租户 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 50 | `decisionId` | 定标单主键 | `decision_id` | 585541ea-ad90-4a33-a108-ebac173a8032 |
| 51 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 52 | `ispay` | 是否交费 | `isPay` | Integer |
| 53 | `payDate` | 交费日期 | `pay_date` | DateTime |
| 54 | `deadlineDate` | deadlineDate | `deadline_date` | DateTime |
| 55 | `bidType` | 招标方式 | `bid_type` | String |
| 56 | `decisionCount` | 中标条目数 | `decision_count` | Integer |
| 57 | `editPath` | word文件名 | `edit_path` | String |
| 58 | `editPreview` | pdf文件名 | `edit_preview` | String |
| 59 | `sealStatus` | 盖章状态 | `seal_status` | Integer |
| 60 | `templateId` | 模板ID | `template_id` | Long |
| 61 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 62 | `payMode` | 付款方式 | `pay_mode` | String |
| 63 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 64 | `technical` | 技术指标 | `technical` | String |
| 65 | `other` | 其他 | `other` | String |
| 66 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 67 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 68 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 69 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 70 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 71 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 72 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 73 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 74 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 75 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 76 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 77 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 78 | `manager` | 项目经理 | `manager` | String |
| 79 | `techleader` | 技术负责人 | `techleader` | String |
| 80 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 81 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 82 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 83 | `supOther` | 供应商其他 | `sup_other` | String |
| 84 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 85 | `singleFlag` | 单重 | `single_flag` | Integer |
| 86 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 87 | `manufacturerFlag` | 制造商 | `manufacturer_flag` | Integer |
| 88 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 89 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 90 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 91 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 92 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 93 | `isunite` | 是否是联合体投标 | `isUnite` | Integer |
| 94 | `mainBidderId` | 主投人租户id | `main_bidder_id` | Long |
| 95 | `mainId` | 主投人id | `main_id` | Long |
| 96 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer |
| 97 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer |
| 98 | `supplyCode` | 供应商编码 | `supply_code` | String |
| 99 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 100 | `detailSealStatus` | 中标明细盖章状态 | `detail_seal_status` | Integer |
| 101 | `detailSealDate` | 明细签章日期 | `detail_seal_date` | DateTime |
| 102 | `sealDate` | 中标通知书签章日期 | `seal_date` | DateTime |
| 103 | `invitation` | 邀请标识 | `invitation` | Integer |
| 104 | `supStatus` | 供应商调整状态 | `sup_status` | Integer |
| 105 | `sendDate` | 发送时间 | `send_date` | DateTime |
| 106 | `supSubmitDate` | 供应商提交时间 | `sup_submit_date` | DateTime |
| 107 | `noticeDownloadTime` | 中标通知书下载时间 | `notice_download_time` | DateTime |
| 108 | `sealId` | 章id | `seal_id` | String |
| 109 | `amountServiceFee` | 服务费金额 | `amount_service_fee` | Decimal |
| 110 | `paymentReason` | 缴费原因 | `payment_reason` | String |
| 111 | `paymentNotice` | 缴费通知单 | `payment_notice` | String |
| 112 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean |
| 113 | `processingStatus` | 处理状态 | `processing_status` | Boolean |
| 114 | `processingTime` | 处理时间 | `processing_time` | DateTime |
| 115 | `purchasingPerson` | 采购负责人 | `purchasing_person` | String |
| 116 | `feeType` | 服务费类型 | `fee_type` | String |
| 117 | `code` | 订单号 | `code` | String |
| 118 | `isBid` | 是否中标 | `isBid` | Boolean |
| 119 | `freeDefine` | 中标候选人信息自定义项表 | `` | d070708e-3940-45d6-9e65-a6aff006b3a9 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `supplydocId` | 投标人ID | `aa.vendor.Vendor` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `freeDefine` | 中标候选人信息自定义项表 | `lawbid.decisioncandidate.CpuDsnCandidatePublicityFreeDefine` | None | true |
| 5 | `supEnterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `decisionResultDefineCharacter` | 中标结果子表自定义项特征属性 | `lawbid.decisioncandidate.DecisionResultDefineCharacter` | None |  |
| 7 | `decisionId` | 定标单主键 | `lawbid.decisioncandidate.CpuCandidatePublicity` | None | true |
| 8 | `bidProjectId` | 项目ID | `lawbid.project.LawbidProject` | None |  |
| 9 | `upstreamSupplierId` | 汇总报价单表头主键 | `lawbid.scoringdata.ScoringDataMark` | None |  |
| 10 | `bidSectionId` | 标段(包)编号id | `lawbid.section.LawbidSection` | None |  |
