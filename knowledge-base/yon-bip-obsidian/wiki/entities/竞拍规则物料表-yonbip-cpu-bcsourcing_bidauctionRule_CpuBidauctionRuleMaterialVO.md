---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleMaterialVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍规则物料表 (`yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleMaterialVO`)

> ycSouring | 物理表：`cpu_bidauction_rule_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍规则物料表 |
| 物理表 | `cpu_bidauction_rule_material` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:26:25.8610` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（61个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 3 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 4 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 5 | `materialId` | 物料id | `material_id` | Long |
| 6 | `materialName` | 物料名称 | `material_name` | String |
| 7 | `dr` | dr | `dr` | Short |
| 8 | `demandDesc` | 需求详情描述 | `demand_desc` | String |
| 9 | `purUnitName` | 采购单位 | `pur_unit_name` | String |
| 10 | `guidingTaxRate` | 指导税率 | `guiding_tax_rate` | Decimal |
| 11 | `bidInitialPrice` | 起步单价 | `bidInitial_price` | Decimal |
| 12 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 13 | `demandTime` | 需求时间 | `demand_time` | DateTime |
| 14 | `processesId` | 工序id | `processes_id` | String |
| 15 | `processesCode` | 工序编码 | `processes_code` | String |
| 16 | `processesName` | 工序名称 | `processes_name` | String |
| 17 | `receiveOrgId` | 收货组织id | `receive_org_id` | String |
| 18 | `receiveOrgName` | 收货组织名称 | `receive_org_name` | String |
| 19 | `receivePersonId` | 收货人id | `receive_person_id` | String |
| 20 | `receivePersonName` | 收货人姓名 | `receive_person_name` | String |
| 21 | `receivePersonTel` | 收货人联系方式 | `receive_person_tel` | String |
| 22 | `reqDeptId` | 需求部门id | `reqdept_id` | String |
| 23 | `reqDeptName` | 需求部门名称 | `reqdept_name` | String |
| 24 | `ts` | 默认值 | `ts` | DateTime |
| 25 | `maxinumStepSize` | 最大步长限制 | `maxinum_step_size` | Decimal |
| 26 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 27 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 28 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 29 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 30 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 31 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime |
| 33 | `materialNo` | 物料编码 | `material_no` | String |
| 34 | `materialClassId` | 物料分类ID | `material_class_id` | Long |
| 35 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 36 | `reqOrgId` | 需求公司id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 37 | `materialSize` | 规格型号 | `material_size` | String |
| 38 | `reqOrgName` | 需求公司 | `req_org_name` | String |
| 39 | `num` | 需求数量 | `num` | Decimal |
| 40 | `demandNum` | 数量 | `demand_num` | Decimal |
| 41 | `numberUnit` | 单位 | `number_unit` | String |
| 42 | `mainCount` | 主数量 | `main_count` | Decimal |
| 43 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 44 | `unitId` | 单位id | `unit_id` | Long |
| 45 | `highPrice` | 最高限价(元) | `high_price` | Decimal |
| 46 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 47 | `lowPrice` | 最低限价(元) | `low_price` | Decimal |
| 48 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 49 | `bidStartPrice` | 起步价(元) | `bid_start_price` | Decimal |
| 50 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 51 | `lowBiddingStep` | 价格调整幅度(元) | `low_bidding_step` | Decimal |
| 52 | `protectedPrice` | 保护价(元) | `protected_price` | Decimal |
| 53 | `bidStartTime` | 竞拍开始时间 | `bid_start_time` | DateTime |
| 54 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 55 | `biddingTime` | 竞拍时长(分钟) | `bidding_time` | Long |
| 56 | `bidauctionRuleId` | 竞拍规则表主表 | `bidauction_rule_id` | 7fc80044-d3dc-45e7-93a2-be1e14558b64 |
| 57 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 58 | `demandBillId` | 业务单据子表id | `demand_bill_id` | Long |
| 59 | `hasBidauction` | 已经竞拍 | `has_bidauction` | Short |
| 60 | `hallId` | 竞价大厅id | `hall_id` | Long |
| 61 | `materialItemId` | 物料itemId | `material_item_id` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidauctionRuleId` | 竞拍规则表主表 | `yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 4 | `reqOrgId` | 需求公司id | `org.func.BaseOrg` | Service |  |
| 5 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
