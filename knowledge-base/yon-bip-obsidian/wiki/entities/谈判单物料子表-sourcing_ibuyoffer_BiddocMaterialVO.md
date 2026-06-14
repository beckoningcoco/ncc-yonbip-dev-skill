---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.BiddocMaterialVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判单物料子表 (`sourcing.ibuyoffer.BiddocMaterialVO`)

> ycSouringInquiry | 物理表：`cpu_biddoc_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判单物料子表 |
| 物理表 | `cpu_biddoc_material` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:08.5800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 谈判物料子表ID |

---

## 直接属性（69个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `materialClassCode` | 物料分类编码 | `material_class_code` | String |
| 2 | `talkId` | 谈判单主表ID | `talk_id` | f948c8ae-1c2d-4dc3-8290-38c81d361f90 |
| 3 | `rowNo` | 行号 | `row_no` | Long |
| 4 | `id` | 谈判物料子表ID | `id` | Long |
| 5 | `materialClassId` | 物料分类ID | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 6 | `category` | 物料分类名称 | `category` | String |
| 7 | `materialId` | 物料ID | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `materialCode` | 物料编码 | `material_code` | String |
| 9 | `biddocMaterialVODefineCharacter` | 谈判表体自定义项特征 | `define_character_id` | 6d193b08-61c0-4f58-b22c-3e989d98699a |
| 10 | `name` | 物料名称 | `name` | String |
| 11 | `description` | 需求描述 | `description` | String |
| 12 | `spec` | 规格 | `spec` | String |
| 13 | `model` | 型号 | `model` | String |
| 14 | `purchasenum` | 采购数量 | `purchaseNum` | Decimal |
| 15 | `purchaseunitname` | 采购单位 | `purchaseUnitName` | String |
| 16 | `invpurexchrate` | 采购换算率 | `invPurExchRate` | Decimal |
| 17 | `purchaseamount` | 计价数量 | `purchaseAmount` | Decimal |
| 18 | `unit` | 计价单位 | `unit` | String |
| 19 | `invpriceexchrate` | 计价换算率 | `invPriceExchRate` | Decimal |
| 20 | `mainnum` | 主数量 | `mainNum` | Decimal |
| 21 | `mainunitname` | 主单位 | `mainUnitName` | String |
| 22 | `requiredTime` | 需求时间 | `required_time` | DateTime |
| 23 | `adviseTalkTotalPrice` | 参考含税单价(现金) | `advise_talk_total_price` | Decimal |
| 24 | `adviseTalkAccepPrice` | 参考含税单价(承兑) | `advise_talk_accep_price` | Decimal |
| 25 | `adviseTalkPaymPrice` | 参考含税单价(账期) | `advise_talk_paym_price` | Decimal |
| 26 | `ceilingPrice` | 最高限价 | `ceiling_price` | Decimal |
| 27 | `reqOrgId` | 需求组织id | `req_org_id` | String |
| 28 | `reqdeptCode` | 需求部门编码 | `reqdept_code` | String |
| 29 | `reqdeptId` | 需求部门id | `reqdept_id` | String |
| 30 | `biddocMaterialVOFreeCharacteristics` | 谈判单自由项特征组 | `free_characters_id` | 0615f251-0327-464b-aeba-9805f915a78d |
| 31 | `reqdeptName` | 需求部门 | `reqdept_name` | String |
| 32 | `reqContactId` | 需求人id | `req_contact_id` | String |
| 33 | `reqContact` | 需求人 | `req_contact` | String |
| 34 | `address` | 收货地址 | `address` | String |
| 35 | `talkMemo` | 谈判备注 | `talk_memo` | String |
| 36 | `buyofferFile` | 附件 | `buyoffer_file` | String |
| 37 | `purchaseunitid` | 采购单位ID | `purchaseUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 38 | `mainunitid` | 主单位ID | `mainUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 39 | `unitId` | 计价单位ID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 40 | `buyofferBid` | 询价单子表id | `buyoffer_bid` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 41 | `pureqId` | 采购需求id | `pureq_id` | Long |
| 42 | `allowTalkPrice` | 允许谈判报价(true:允许(默认值);false:不允许) | `allow_talk_price` | Boolean |
| 43 | `benchmarkType` | 基准价参考枚举值 | `benchmark_type` | String |
| 44 | `biddocId` | 招标文件 | `biddoc_id` | Long |
| 45 | `brand` | 品牌厂家 | `brand` | String |
| 46 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 47 | `cityId` | 报价参考市ID | `city_id` | Long |
| 48 | `demander` | 需方 | `demander` | String |
| 49 | `districtId` | 报价参考地区ID | `district_id` | Long |
| 50 | `dr` | 删除标识 | `dr` | Boolean |
| 51 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 52 | `productDesc` | 物料描述(旧) | `product_desc` | String |
| 53 | `projectMaterialId` | 项目——物料 | `project_material_id` | Long |
| 54 | `provinceId` | 报价参考省份ID | `province_id` | Long |
| 55 | `pubts` | 时间戳 | `pubts` | DateTime |
| 56 | `quality` | 质量要求 | `quality` | String |
| 57 | `referencePrice` | 参照价格 | `reference_price` | Decimal |
| 58 | `reqEndTime` | 需求截止时间 | `req_end_time` | DateTime |
| 59 | `settlementType` | 结算日枚举值 | `settlement_type` | String |
| 60 | `taxRate` | 税率 | `tax_rate` | Decimal |
| 61 | `unpdReleased` | 未定标释放行标示 | `unpd_released` | Boolean |
| 62 | `ytenant` | 租户ID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 63 | `amount` | 采购数量(旧) | `amount` | Decimal |
| 64 | `addressName` | 地址 | `address_name` | String |
| 65 | `bodyTalksFreeDefines` | 谈判单物料子表自由自定义项 | `` | a476201a-70d5-4838-9954-851435406bad |
| 66 | `invpriceexchrateDen` | 计价换算率分母 | `invPriceExchRateden` | Decimal |
| 67 | `invpriceexchrateNum` | 计价换算率分子 | `invPriceExchRatenum` | Decimal |
| 68 | `invpurexchrateDen` | 采购换算率分母 | `invPurExchRateden` | Decimal |
| 69 | `invpurexchrateNum` | 采购换算率分子 | `invPurExchRatenum` | Decimal |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `buyofferBid` | 询价单子表id | `sourcing.ibuyoffer.BuyOfferBodyVO` | None |  |
| 2 | `materialClassId` | 物料分类ID | `pc.cls.ManagementClass` | Service |  |
| 3 | `biddocMaterialVOFreeCharacteristics` | 谈判单自由项特征组 | `sourcing.ibuyoffer.CpuBiddocCharacteristicsDefine` | None |  |
| 4 | `ytenant` | 租户ID | `yht.tenant.YhtTenant` | Service |  |
| 5 | `bodyTalksFreeDefines` | 谈判单物料子表自由自定义项 | `sourcing.ibuyoffer.BiddocMaterialVOFreeDefine` | None | true |
| 6 | `biddocMaterialVODefineCharacter` | 谈判表体自定义项特征 | `sourcing.ibuyoffer.BiddocMaterialDefineCharacter` | None |  |
| 7 | `unitId` | 计价单位ID | `pc.unit.Unit` | Service |  |
| 8 | `mainunitid` | 主单位ID | `pc.unit.Unit` | Service |  |
| 9 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 10 | `materialId` | 物料ID | `pc.product.Product` | Service |  |
| 11 | `talkId` | 谈判单主表ID | `sourcing.ibuyoffer.BiddocTalksVO` | None | true |
| 12 | `purchaseunitid` | 采购单位ID | `pc.unit.Unit` | Service |  |
