---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.decisionsupplement.CpuSupplementSupplier"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 补录供应商表 (`lawbid.decisionsupplement.CpuSupplementSupplier`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_supplement_supplier`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 补录供应商表 |
| 物理表 | `cpu_supplement_supplier` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:22.4470` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 23:55:28:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 补录供应商表接口 | `lawdecision.itf.ICpuSupplementSupplier` | 585 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（115个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `enterpriseId` | 租户ID | `enterprise_id` | Long |
| 3 | `ranking` | 候选排名 | `ranking` | Integer |
| 4 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 5 | `bidScore` | 分数 | `bid_score` | Decimal |
| 6 | `supplementRate` | 税率(%) | `supplement_rate` | Decimal |
| 7 | `bidProjectId` | 项目ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 8 | `taxBidPrice` | 投标含税总价 | `tax_bid_price` | Decimal |
| 9 | `bidProjectCode` | 项目编码 | `bid_project_code` | String |
| 10 | `bidPrice` | 投标无税总价 | `bid_price` | Decimal |
| 11 | `rmbTotal` | 人民币总价 | `rmb_total` | Decimal |
| 12 | `bidProjectName` | 项目名 | `bid_project_name` | String |
| 13 | `taxFictitiousPrice` | 拟中标含税总价 | `tax_fictitious_price` | Decimal |
| 14 | `bidSectionId` | 标段（包）编号id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 15 | `fictitiousPrice` | 拟中标无税总价 | `fictitious_price` | Decimal |
| 16 | `bidSectionCode` | 标段（包）编号 | `bid_section_code` | String |
| 17 | `taxWinPrice` | 中标含税总价 | `tax_win_price` | Decimal |
| 18 | `bidSectionName` | 标段（包）名称 | `bid_section_name` | String |
| 19 | `winPrice` | 中标无税总价 | `win_price` | Decimal |
| 20 | `state` | 预留状态 | `state` | Integer |
| 21 | `approveNotes` | 定标意见 | `approve_notes` | String |
| 22 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 23 | `priceUnit` | 货币单位 中标价格 | `price_unit` | String |
| 24 | `winNum` | 中标数量 | `win_num` | Decimal |
| 25 | `noticeNotes` | 中标结果公告时说明 | `notice_notes` | String |
| 26 | `adviceNotes` | 中标通知书时说明 | `advice_notes` | String |
| 27 | `serciePrice` | 服务费 | `sercie_price` | Decimal |
| 28 | `serciePriceUnit` | 货币单位 服务费 | `sercie_price_unit` | String |
| 29 | `deratePrice` | 服务费减免额度 | `derate_price` | Decimal |
| 30 | `picketageId` | 主表主键 | `picketage_id` | Long |
| 31 | `supplydocId` | 投标人ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 32 | `supplementId` | 定标单主键 | `supplement_id` | 3250792b-8e4a-4a96-9e17-f3200c52ddf3 |
| 33 | `ispay` | 是否交费 | `isPay` | Integer |
| 34 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 35 | `payDate` | 交费日期 | `pay_date` | DateTime |
| 36 | `deadlineDate` | deadlineDate | `deadline_date` | DateTime |
| 37 | `bidType` | 招标方式 | `bid_type` | String |
| 38 | `decisionCount` | 中标条目数 | `decision_count` | Integer |
| 39 | `editPath` | word文件名 | `edit_path` | String |
| 40 | `editPreview` | pdf文件名 | `edit_preview` | String |
| 41 | `sealStatus` | 盖章状态 | `seal_status` | Integer |
| 42 | `templateId` | 模板ID | `template_id` | Long |
| 43 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 44 | `payMode` | 付款方式 | `pay_mode` | String |
| 45 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 46 | `technical` | 技术指标 | `technical` | String |
| 47 | `other` | 其他 | `other` | String |
| 48 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 49 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 50 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 51 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 52 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 53 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 54 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 55 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 56 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 57 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 58 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 59 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 60 | `manager` | 项目经理 | `manager` | String |
| 61 | `techleader` | 技术负责人 | `techleader` | String |
| 62 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 63 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 64 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 65 | `supOther` | 供应商其他 | `sup_other` | String |
| 66 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 67 | `singleFlag` | 单重 | `single_flag` | Integer |
| 68 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 69 | `manufacturerFlag` | 制造商 | `manufacturer_flag` | Integer |
| 70 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 71 | `dollarTotal` | 美元总价 | `dollar_total` | Decimal |
| 72 | `yenTotal` | 日元总价 | `yen_total` | Decimal |
| 73 | `euroTotal` | 欧元总价 | `euro_total` | Decimal |
| 74 | `poundTotal` | 英镑总价 | `pound_total` | Decimal |
| 75 | `isunite` | 是否是联合体投标 | `isUnite` | Integer |
| 76 | `mainBidderId` | 主投人租户id | `main_bidder_id` | Long |
| 77 | `mainId` | 主投人id | `main_id` | Long |
| 78 | `earnestType` | 保证金缴纳状态 | `earnest_type` | Integer |
| 79 | `earnestReturn` | 退保证金状态 | `earnest_return` | Integer |
| 80 | `supplyCode` | 供应商编码 | `supply_code` | String |
| 81 | `internationalBid` | 是否国际标 | `international_bid` | Integer |
| 82 | `detailSealStatus` | 中标明细盖章状态 | `detail_seal_status` | Integer |
| 83 | `detailSealDate` | 明细签章日期 | `detail_seal_date` | DateTime |
| 84 | `sealDate` | 中标通知书签章日期 | `seal_date` | DateTime |
| 85 | `invitation` | 邀请标识 | `invitation` | Integer |
| 86 | `supStatus` | 供应商调整状态 | `sup_status` | Integer |
| 87 | `sendDate` | 发送时间 | `send_date` | DateTime |
| 88 | `supSubmitDate` | 供应商提交时间 | `sup_submit_date` | DateTime |
| 89 | `noticeDownloadTime` | 中标通知书下载时间 | `notice_download_time` | DateTime |
| 90 | `sealId` | 章id | `seal_id` | String |
| 91 | `amountServiceFee` | 服务费金额 | `amount_service_fee` | Decimal |
| 92 | `paymentReason` | 缴费原因 | `payment_reason` | String |
| 93 | `paymentNotice` | 缴费通知单 | `payment_notice` | String |
| 94 | `needPayServiceFee` | 是否缴纳中标服务费 | `need_pay_service_fee` | Boolean |
| 95 | `processingStatus` | 处理状态 | `processing_status` | Boolean |
| 96 | `processingTime` | 处理时间 | `processing_time` | DateTime |
| 97 | `purchasingPerson` | 采购负责人 | `purchasing_person` | String |
| 98 | `feeType` | 服务费类型 | `fee_type` | String |
| 99 | `code` | 订单号 | `code` | String |
| 100 | `isBid` | 是否中标 | `isBid` | Boolean |
| 101 | `supplementSupplierDefineCharacter` | 补录单确定中标人子表自定义项特征 | `define_character_id` | 92b3ee80-b467-427a-89d7-e835c3fe59b0 |
| 102 | `upstreamSupplierId` | 上游供应商主键 | `upstream_supplier_id` | ee9fac8a-c357-421d-9722-4bf581e3b089 |
| 103 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 104 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 105 | `editStatus` | 编辑状态 | `edit_status` | Integer |
| 106 | `fictitiousNum` | 拟中标数量 | `fictitious_num` | Decimal |
| 107 | `fictitiousScore` | 拟中标分数 | `fictitious_score` | Decimal |
| 108 | `noticeContent` | 内容 | `notice_content` | String |
| 109 | `pubts` | 时间戳 | `pubts` | DateTime |
| 110 | `supEnterpriseId` | 供应商企业 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 111 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 112 | `supplierReview` | 供应商查看情况 | `supplier_review` | String |
| 113 | `supplydocName` | 投标人名称 | `supplydoc_name` | String |
| 114 | `ts` | 时间戳 | `ts` | DateTime |
| 115 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplydocId` | 投标人ID | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `supplementId` | 定标单主键 | `lawbid.decisionsupplement.CpuSupplement` | None | true |
| 4 | `supplementSupplierDefineCharacter` | 补录单确定中标人子表自定义项特征 | `lawbid.decisionsupplement.CpuSupplementSupplierDefineCharacter` | None |  |
| 5 | `supEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidProjectId` | 项目ID | `lawbid.project.LawbidProject` | None |  |
| 7 | `upstreamSupplierId` | 上游供应商主键 | `lawbid.section.LawbidSectionSupplier` | None |  |
| 8 | `bidSectionId` | 标段（包）编号id | `lawbid.section.LawbidSection` | None |  |
