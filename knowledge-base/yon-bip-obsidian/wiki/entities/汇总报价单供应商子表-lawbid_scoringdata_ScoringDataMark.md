---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringdata.ScoringDataMark"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 汇总报价单供应商子表 (`lawbid.scoringdata.ScoringDataMark`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_mark_materiel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇总报价单供应商子表 |
| 物理表 | `cpu_mark_materiel` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:02:48.8640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-01-23 23:56:24:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（91个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `scoringDataMarkDefineCharacter` | 汇总报价单供应商自定义项 | `define_character_id` | d902654d-09a4-47cb-8a6a-add724da8214 |
| 2 | `bidPrice` | 评标总价 | `bid_price` | Decimal |
| 3 | `bidderStatus` | 供应商移除/恢复 | `bidder_status` | Integer |
| 4 | `biddingId` | 投标单 | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `markId` | 汇总报价单主键 | `mark_id` | 0d8c335a-8f53-4e4c-86f3-6a93455e5d20 |
| 11 | `billVersionId` | 版本id | `bill_version_id` | a3a5ef89-acd9-4d26-bfa0-f2828d18ef6b |
| 12 | `stepSeq` | 当前分步开标阶段 | `step_seq` | Integer |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `eliminateStatus` | 供应商淘汰状态 | `eliminate_status` | Integer |
| 15 | `ifHighest` | 是否最高价 | `if_highest` | Integer |
| 16 | `ifLowest` | 是否最低价 | `if_lowest` | Integer |
| 17 | `modifier` | 修改人名称 | `modifier` | String |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 22 | `pricePoints` | 价格分% | `price_points` | Decimal |
| 23 | `priceWeighted` | 价格加权分 | `price_weighted` | Decimal |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `scoreSegmentId` | 环节 | `score_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 26 | `singlePrice` | 无税单价 | `single_price` | Decimal |
| 27 | `taxQuotation` | 参考含税报价 | `tax_quotation` | Decimal |
| 28 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 29 | `totalScore` | 总分 | `total_score` | Decimal |
| 30 | `twoTaxQuotation` | 二次投标含税总价 | `two_tax_quotation` | Decimal |
| 31 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 32 | `id` | ID | `id` | Long |
| 33 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 34 | `transType` | 交易类型 | `transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 35 | `rank` | 排名 | `rank` | String |
| 36 | `supplydocId` | 供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 37 | `totalPrice` | 投标不含税总价 | `total_price` | Decimal |
| 38 | `taxTotalPrice` | 投标含税总价 | `tax_total_price` | Decimal |
| 39 | `totalMarkPrice` | 最新评标不含税总价 | `total_mark_price` | Decimal |
| 40 | `taxTotalMarkPrice` | 最新评标含税总价 | `tax_total_mark_price` | Decimal |
| 41 | `lastPriceTime` | 最新报价时间 | `last_price_time` | DateTime |
| 42 | `quoteNum` | 报价项目数 | `quote_num` | Integer |
| 43 | `projectId` | 招标项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 44 | `bidSectionId` | 标段(包) | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
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
| 85 | `invitation` | 是否邀请 | `invitation` | Integer |
| 86 | `isrecommend` | 是否推荐 | `isRecommend` | Integer |
| 87 | `eliminate` | 淘汰环节 | `eliminate` | Long |
| 88 | `reason` | 淘汰理由 | `reason` | String |
| 89 | `scoreRound` | 当前评标轮次 | `score_round` | Integer |
| 90 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 91 | `headdefine` | 汇总报价单表头自定义项 | `` | 200d8c4e-28f0-410d-a531-75c3422e0f0d |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `headdefine` | 汇总报价单表头自定义项 | `lawbid.scoringdata.ScoringDataMarkDefine` | None | true |
| 2 | `billVersionId` | 版本id | `lawbid.billversion.BizBillVersion` | None |  |
| 3 | `markId` | 汇总报价单主键 | `lawbid.scoringdata.CpuMark` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `biddingId` | 投标单 | `lawbid.bid.BiddingVO` | None |  |
| 8 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 9 | `scoreSegmentId` | 环节 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 10 | `scoringDataMarkDefineCharacter` | 汇总报价单供应商自定义项 | `lawbid.scoringdata.ScoringDataMarkDefineCharacter` | None |  |
| 11 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 12 | `supplydocId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 13 | `supEnterpriseId` | 投标人企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 14 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 15 | `projectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 16 | `bidSectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
