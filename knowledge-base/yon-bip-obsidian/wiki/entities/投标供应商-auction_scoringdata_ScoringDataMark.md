---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.scoringdata.ScoringDataMark"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 投标供应商 (`auction.scoringdata.ScoringDataMark`)

> ycSouringAuction | 物理表：`cpu_mark_materiel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标供应商 |
| 物理表 | `cpu_mark_materiel` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:26:10.1800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（87个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 3 | `transType` | 交易类型 | `transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 4 | `rank` | 排名 | `rank` | String |
| 5 | `supplydocId` | 供应商 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 6 | `totalPrice` | 投标不含税总价 | `total_price` | Decimal |
| 7 | `bidderStatus` | 供应商移除/恢复 | `bidder_status` | Integer |
| 8 | `biddingId` | 投标单 | `bidding_id` | b1e45acc-57ae-4a37-a971-a848cddafaf1 |
| 9 | `bidPrice` | 评标总价 | `bid_price` | Decimal |
| 10 | `eliminateStatus` | 供应商淘汰状态 | `eliminate_status` | Integer |
| 11 | `ifHighest` | 是否最高价 | `if_highest` | Integer |
| 12 | `ifLowest` | 是否最低价 | `if_lowest` | Integer |
| 13 | `markId` | 汇总报价单主键 | `mark_id` | b9b3866d-2cbe-45c9-9f62-3833b717d711 |
| 14 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 15 | `pricePoints` | 价格分% | `price_points` | Decimal |
| 16 | `priceWeighted` | 价格加权分 | `price_weighted` | Decimal |
| 17 | `singlePrice` | 无税单价 | `single_price` | Decimal |
| 18 | `taxQuotation` | 参考含税报价 | `tax_quotation` | Decimal |
| 19 | `totalDiscountPrice` | 折算报价总价 | `total_discount_price` | Decimal |
| 20 | `totalScore` | 总分 | `total_score` | Decimal |
| 21 | `twoTaxQuotation` | 二次投标含税总价 | `two_tax_quotation` | Decimal |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 23 | `dr` | 逻辑删除标记 | `dr` | Short |
| 24 | `createTime` | 创建时间 | `create_time` | DateTime |
| 25 | `createDate` | 创建日期 | `create_date` | Date |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 27 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 28 | `creator` | 创建人名称 | `creator` | String |
| 29 | `modifier` | 修改人名称 | `modifier` | String |
| 30 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 31 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 32 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime |
| 34 | `taxTotalPrice` | 投标含税总价 | `tax_total_price` | Decimal |
| 35 | `totalMarkPrice` | 最新评标不含税总价 | `total_mark_price` | Decimal |
| 36 | `taxTotalMarkPrice` | 最新评标含税总价 | `tax_total_mark_price` | Decimal |
| 37 | `lastPriceTime` | 最新报价时间 | `last_price_time` | DateTime |
| 38 | `quoteNum` | 报价项目数 | `quote_num` | Integer |
| 39 | `projectId` | 招标项目 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 40 | `bidSectionId` | 标段(包) | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 41 | `bidType` | 采购方式 | `bid_type` | String |
| 42 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 43 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 44 | `supEnterpriseId` | 投标人企业 | `bidder_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 45 | `bidderName` | 投标人名称 | `bidder_name` | String |
| 46 | `payMode` | 付款方式 | `pay_mode` | String |
| 47 | `deliveryDate` | 交货期 | `delivery_date` | String |
| 48 | `technical` | 技术指标 | `technical` | String |
| 49 | `other` | 其他 | `other` | String |
| 50 | `payTypeShow` | 是否显示付款条件 | `pay_type_show` | Integer |
| 51 | `payTypeFlag` | 是否允许偏离付款条件 | `pay_type_flag` | Integer |
| 52 | `payTypeResponse` | 是否允许供应商响应付款条件 | `pay_type_response` | Integer |
| 53 | `deliveryDateShow` | 是否显示工期 | `delivery_date_show` | Integer |
| 54 | `deliveryDateFlag` | 是否允许偏离工期 | `delivery_date_flag` | Integer |
| 55 | `deliveryDateResponse` | 是否允许供应商响应工期 | `delivery_date_response` | Integer |
| 56 | `technicalShow` | 是否显示技术指标 | `technical_show` | Integer |
| 57 | `technicalFlag` | 是否允许偏离技术指标 | `technical_flag` | Integer |
| 58 | `technicalResponse` | 是否允许供应商响应技术指标 | `technical_response` | Integer |
| 59 | `otherShow` | 是否显示其他 | `other_show` | Integer |
| 60 | `otherFlag` | 是否允许偏离其他 | `other_flag` | Integer |
| 61 | `otherResponse` | 是否允许供应商响应其他 | `other_response` | Integer |
| 62 | `manager` | 项目经理 | `manager` | String |
| 63 | `techleader` | 技术负责人 | `techleader` | String |
| 64 | `supPayMode` | 供应商付款方式 | `sup_pay_mode` | String |
| 65 | `supDeliveryDate` | 供应商交货期 | `sup_delivery_date` | String |
| 66 | `supTechnical` | 供应商技术指标 | `sup_technical` | String |
| 67 | `supOther` | 供应商其他 | `sup_other` | String |
| 68 | `ingredientFlag` | 材质 | `ingredient_flag` | Integer |
| 69 | `singleFlag` | 单重 | `single_flag` | Integer |
| 70 | `producerFlag` | 产地 | `producer_flag` | Integer |
| 71 | `manufacturerFlag` | 制造商 | `manufacturer_flag` | Integer |
| 72 | `lifetimeFlag` | 寿命 | `lifetime_flag` | Integer |
| 73 | `buyerName` | 采购员姓名 | `buyer_name` | String |
| 74 | `buyerEmail` | 采购员邮箱 | `buyer_email` | String |
| 75 | `buyerFax` | 采购员传真 | `buyer_fax` | String |
| 76 | `linkman` | 联系人 | `linkman` | String |
| 77 | `linkmanTel` | 联系方式 | `linkman_tel` | String |
| 78 | `linkmanMail` | 联系人邮箱 | `linkman_mail` | String |
| 79 | `linkmanFax` | 联系人传真 | `linkman_fax` | String |
| 80 | `iswin` | 是否中标 | `isWin` | Integer |
| 81 | `invitation` | 是否邀请 | `invitation` | Integer |
| 82 | `isrecommend` | 是否推荐 | `isRecommend` | Integer |
| 83 | `eliminate` | 淘汰环节 | `eliminate` | Long |
| 84 | `reason` | 淘汰理由 | `reason` | String |
| 85 | `scoreRound` | 当前评标轮次 | `score_round` | Integer |
| 86 | `scoringDataMarkDefineCharacter` | 汇总报价单供应商自定义项 | `define_character_id` | b634c209-88c3-43fb-8089-958d76cfd4ea |
| 87 | `headdefine` | 投标供应商自定义项 | `` | 2bf43000-4163-4db2-9fd9-ef57505e431c |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `headdefine` | 投标供应商自定义项 | `auction.scoringdata.ScoringDataMarkDefine` | None | true |
| 2 | `markId` | 汇总报价单主键 | `auction.scoringdata.CpuMark` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `biddingId` | 投标单 | `auction.bid.BiddingVO` | None |  |
| 7 | `scoringDataMarkDefineCharacter` | 汇总报价单供应商自定义项 | `auction.scoringdata.ScoringDataMarkDefineCharacter` | None |  |
| 8 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 9 | `supplydocId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 10 | `supEnterpriseId` | 投标人企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 11 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 12 | `projectId` | 招标项目 | `auction.project.AuctionProject` | None |  |
| 13 | `bidSectionId` | 标段(包) | `auction.project.AuctionSection` | None |  |
