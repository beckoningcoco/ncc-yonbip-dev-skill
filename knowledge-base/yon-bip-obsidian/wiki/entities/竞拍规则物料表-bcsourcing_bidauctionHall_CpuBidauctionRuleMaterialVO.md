---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.CpuBidauctionRuleMaterialVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍规则物料表 (`bcsourcing.bidauctionHall.CpuBidauctionRuleMaterialVO`)

> ycSouring | 物理表：`cpu_bidauction_rule_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍规则物料表 |
| 物理表 | `cpu_bidauction_rule_material` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:43:03.9070` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（67个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 3 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 4 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 5 | `materialId` | 物料id | `material_id` | Long |
| 6 | `materialName` | 标的物名称 | `material_name` | String |
| 7 | `materialNo` | 标的物编码 | `material_no` | String |
| 8 | `materialClassId` | 物料分类ID | `material_class_id` | Long |
| 9 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 10 | `reqOrgId` | 需求公司id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 11 | `materialSize` | 规格型号 | `material_size` | String |
| 12 | `reqOrgName` | 需求公司 | `req_org_name` | String |
| 13 | `guidePrice` | 指导价 | `guide_price` | Decimal |
| 14 | `demandNum` | 计价数量 | `demand_num` | Decimal |
| 15 | `mainCount` | 主数量 | `main_count` | Decimal |
| 16 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 17 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 18 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 19 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 20 | `numberUnit` | 单位 | `number_unit` | String |
| 21 | `unitId` | 单位id | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 22 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 23 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 24 | `highPrice` | 最高限价 | `high_price` | Decimal |
| 25 | `lowPrice` | 最低限价 | `low_price` | Decimal |
| 26 | `bidStartPrice` | 起步价 | `bid_start_price` | Decimal |
| 27 | `lowBiddingStep` | 价格调整幅度 | `low_bidding_step` | Decimal |
| 28 | `protectedPrice` | 保护价 | `protected_price` | Decimal |
| 29 | `bidStartTime` | 竞拍开始时间 | `bid_start_time` | DateTime |
| 30 | `biddingTime` | 竞拍时长 | `bidding_time` | Long |
| 31 | `maxinumStepSize` | 幅度最大倍数 | `maxinum_step_size` | Decimal |
| 32 | `bidauctionRuleId` | 竞拍规则表主表 | `bidauction_rule_id` | 6dc4b46c-19d3-4af2-bb73-6684309d3422 |
| 33 | `demandBillId` | 业务单据子表id | `demand_bill_id` | Long |
| 34 | `hasBidauction` | 已经竞拍 | `has_bidauction` | Short |
| 35 | `hallId` | 竞价大厅id | `hall_id` | Long |
| 36 | `materialItemId` | 物料itemId | `material_item_id` | String |
| 37 | `bidInitialPrice` | 起步单价 | `bidInitial_price` | Decimal |
| 38 | `bidRuleMaterialRoundVOList` | 竞拍规则物料轮次价格表 | `` | 823bb556-1d26-44d9-a46a-bbcd8ddcf3ed |
| 39 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 40 | `demandDesc` | 需求详情描述 | `demand_desc` | String |
| 41 | `demandTime` | 需求时间 | `demand_time` | DateTime |
| 42 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String |
| 43 | `dr` | 逻辑删除标记 | `dr` | Short |
| 44 | `guidingTaxRate` | 指导税率 | `guiding_tax_rate` | Decimal |
| 45 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 46 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 47 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 48 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 49 | `num` | 投标数量 | `num` | Decimal |
| 50 | `priceMark` | 价格标识 | `price_mark` | Short |
| 51 | `processesCode` | 工序编码 | `processes_code` | String |
| 52 | `processesId` | 工序id | `processes_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 53 | `processesName` | 工序名称 | `processes_name` | String |
| 54 | `pubts` | 时间戳 | `pubts` | DateTime |
| 55 | `purUnitName` | 采购单位 | `pur_unit_name` | String |
| 56 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 57 | `receiveOrgId` | 收货组织id | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 58 | `receiveOrgName` | 收货组织名称 | `receive_org_name` | String |
| 59 | `receivePersonId` | 收货人id | `receive_person_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 60 | `receivePersonName` | 收货人姓名 | `receive_person_name` | String |
| 61 | `receivePersonTel` | 收货人联系方式 | `receive_person_tel` | String |
| 62 | `reqDeptId` | 需求部门id | `reqdept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 63 | `reqDeptName` | 需求部门名称 | `reqdept_name` | String |
| 64 | `roundsStartPrice` | 多轮起步价选项 | `rounds_start_price` | String |
| 65 | `roundsStep` | 多轮价格调整幅度选项 | `rounds_step` | String |
| 66 | `ts` | 默认值 | `ts` | DateTime |
| 67 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `receivePersonId` | 收货人id | `org.func.BaseOrg` | Service |  |
| 2 | `processesId` | 工序id | `ed.operation.Operation` | Service |  |
| 3 | `receiveOrgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 4 | `reqDeptId` | 需求部门id | `bd.adminOrg.AdminOrgVO` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `bidauctionRuleId` | 竞拍规则表主表 | `bcsourcing.bidauctionHall.CpuBidauctionRuleVO` | None | true |
| 7 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 8 | `bidRuleMaterialRoundVOList` | 竞拍规则物料轮次价格表 | `bcsourcing.bidauctionHall.BidauctionRuleMaterialRoundVO` | None | true |
| 9 | `unitId` | 单位id | `pc.unit.Unit` | Service |  |
| 10 | `reqOrgId` | 需求公司id | `org.func.BaseOrg` | Service |  |
| 11 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
