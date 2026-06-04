---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.quotationrecord.QuotationRecordVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商子表 (`lawbid.quotationrecord.QuotationRecordVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_quotation_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商子表 |
| 物理表 | `cpu_quotation_record` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:51.4820` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:01:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（95个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 3 | `transType` | 交易类型 | `transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 4 | `rank` | 排名 | `rank` | String |
| 5 | `supplydocId` | 供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 6 | `totalPrice` | 投标不含税总价 | `total_price` | Decimal |
| 7 | `taxTotalPrice` | 投标含税总价 | `tax_total_price` | Decimal |
| 8 | `ifHighest` | 是否最高价 | `if_highest` | Integer |
| 9 | `ifLowest` | 是否最低价 | `if_lowest` | Integer |
| 10 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 11 | `taxQuotation` | 参考含税报价 | `tax_quotation` | Decimal |
| 12 | `twoTaxQuotation` | 二次投标含税总价 | `two_tax_quotation` | Decimal |
| 13 | `pricePoints` | 价格分% | `price_points` | Decimal |
| 14 | `priceWeighted` | 价格加权分 | `price_weighted` | Decimal |
| 15 | `bidPrice` | 评标总价 | `bid_price` | Decimal |
| 16 | `singlePrice` | 无税单价 | `single_price` | Decimal |
| 17 | `eliminateStatus` | 供应商淘汰状态 | `eliminate_status` | Integer |
| 18 | `scoreSegmentId` | 环节 | `score_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 19 | `bidderStatus` | 供应商移除/恢复 | `bidder_status` | Integer |
| 20 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 21 | `billVersionId` | 版本id | `bill_version_id` | a3a5ef89-acd9-4d26-bfa0-f2828d18ef6b |
| 22 | `stepSeq` | 当前分步开标阶段 | `step_seq` | Integer |
| 23 | `sourceId` | 来源单据id | `source_id` | Long |
| 24 | `sourceType` | 来源单据类型 | `source_type` | String |
| 25 | `sourceBatchNo` | 来源单据批次号 | `source_batch_no` | String |
| 26 | `sourceQuotationStatus` | 当前来源批次是否报价,1是,0否 | `source_quotation_status` | Integer |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime |
| 28 | `createDate` | 创建日期 | `create_date` | Date |
| 29 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 31 | `creator` | 创建人名称 | `creator` | String |
| 32 | `modifier` | 修改人名称 | `modifier` | String |
| 33 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 34 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 36 | `dr` | 逻辑删除标记 | `dr` | Short |
| 37 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 38 | `pubts` | 时间戳 | `pubts` | DateTime |
| 39 | `totalMarkPrice` | 最新评标不含税总价 | `total_mark_price` | Decimal |
| 40 | `taxTotalMarkPrice` | 最新评标含税总价 | `tax_total_mark_price` | Decimal |
| 41 | `lastPriceTime` | 最新报价时间 | `last_price_time` | DateTime |
| 42 | `quoteNum` | 报价项目数 | `quote_num` | Integer |
| 43 | `projectId` | 招标项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 44 | `bidSectionId` | 标段(包)id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 45 | `bidType` | 采购方式 | `bid_type` | String |
| 46 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 47 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 48 | `supEnterpriseId` | 投标人企业 | `bidder_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 49 | `bidderName` | 投标人名称 | `bidder_name` | String |
| 50 | `payMode` | 付款方式 | `pay_mode` | String |
| 51 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 52 | `technical` | 技术指标 | `technical` | String |
| 53 | `other` | 其他 | `other` | String |
| 54 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 55 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 56 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 57 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 58 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 59 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 60 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 61 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 62 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 63 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 64 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 65 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 66 | `manager` | 项目经理 | `manager` | String |
| 67 | `techleader` | 技术负责人 | `techleader` | String |
| 68 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 69 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 70 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 71 | `supOther` | 供应商其他 | `sup_other` | String |
| 72 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 73 | `singleFlag` | 单重 | `single_flag` | Integer |
| 74 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 75 | `manufacturerFlag` | 制造商 | `manufacturer_flag` | Integer |
| 76 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 77 | `buyerName` | 采购员姓名 | `buyer_name` | String |
| 78 | `buyerEmail` | 采购员邮箱 | `buyer_email` | String |
| 79 | `buyerFax` | 采购员传真 | `buyer_fax` | String |
| 80 | `linkman` | 联系人 | `linkman` | String |
| 81 | `linkmanTel` | 联系方式 | `linkman_tel` | String |
| 82 | `linkmanMail` | 联系人邮箱 | `linkman_mail` | String |
| 83 | `linkmanFax` | 联系人传真 | `linkman_fax` | String |
| 84 | `iswin` | 是否中标 | `isWin` | Integer |
| 85 | `biddingId` | 投标供应商 | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 86 | `totalScore` | 总分 | `total_score` | Decimal |
| 87 | `invitation` | 是否邀请 | `invitation` | Integer |
| 88 | `isrecommend` | 是否推荐 | `isRecommend` | Integer |
| 89 | `eliminate` | 淘汰环节 | `eliminate` | Long |
| 90 | `reason` | 淘汰理由 | `reason` | String |
| 91 | `scoreRound` | 当前评标轮次 | `score_round` | Integer |
| 92 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 93 | `quotationRecordDefineCharacter` | 报价历史表头自定义项 | `define_character_id` | 0ce9a1fc-f9d9-4610-ab5a-44d17903665f |
| 94 | `detailList` | 报价历史物料表体 | `` | c4231859-aa3f-4a94-ba39-d707b60f5f83 |
| 95 | `headdefine` | 报价历史表头自定义项 | `` | f180b039-9b22-4aa5-91a2-df62e10edc61 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `headdefine` | 报价历史表头自定义项 | `lawbid.quotationrecord.QuotationRecordVODefine` | None | true |
| 2 | `billVersionId` | 版本id | `lawbid.billversion.BizBillVersion` | None |  |
| 3 | `quotationRecordDefineCharacter` | 报价历史表头自定义项 | `lawbid.quotationrecord.QuotationRecordVODefineCharacter` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `biddingId` | 投标供应商 | `lawbid.bid.BiddingVO` | None |  |
| 8 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 9 | `scoreSegmentId` | 环节 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 10 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 11 | `supplydocId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 12 | `detailList` | 报价历史物料表体 | `lawbid.quotationrecord.QuotationRecordMaterielVO` | None | true |
| 13 | `supEnterpriseId` | 投标人企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 14 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 15 | `projectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 16 | `bidSectionId` | 标段(包)id | `lawbid.section.LawbidSection` | None |  |
