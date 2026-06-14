---
tags: [BIP, 元数据, 数据字典, znbzbx.tallydata.TallydataAmountBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 个人账单金额子表 (`znbzbx.tallydata.TallydataAmountBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_tallydata_amount_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 个人账单金额子表 |
| 物理表 | `znbz_tallydata_amount_b` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 81 个 |
| 子表 | 0 个 |
| 关联引用 | 12 个 |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `tallydataamountDcs` | `` |
| `pk_carrier` | `` |
| `pk_invoicecheck_b` | `` |
| `ytenant_id` | `` |
| `pk_consumekind` | `` |
| `pk_start_address` | `` |
| `pk_end_address` | `` |
| `` | `` |
| `pk_tallydata` | `` |
| `pk_seatgrade` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 81 个直连字段

### 文本字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batchno` | `batchno` | `batchno` | 批次号 |
| `carbin_class` | `carbin_class` | `carbin_class` | 舱位等级名称 |
| `carrier` | `carrier` | `carrier` | 承运人 |
| `city` | `city` | `city` | 城市 |
| `` | `creator` | `creator` | 创建人名称 |
| `end_address_name` | `end_address_name` | `end_address_name` | 到达地名称 |
| `free_baggage` | `free_baggage` | `free_baggage` | 免费行李 |
| `materialno` | `materialno` | `materialno` | 物料号 |
| `mileage` | `mileage` | `mileage` | 里程 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `ocr_or_tax_parse` | `ocr_or_tax_parse` | `ocr_or_tax_parse` | ocr/税票识别 |
| `original_voucher_no` | `original_voucher_no` | `original_voucher_no` | 原凭证号 |
| `passenger` | `passenger` | `passenger` | 乘坐人 |
| `period_of_tax` | `period_of_tax` | `period_of_tax` | 税款所属时期 |
| `project_name` | `project_name` | `project_name` | 项目名称 |
| `projectno` | `projectno` | `projectno` | 项目编码 |
| `quantity_unit` | `quantity_unit` | `quantity_unit` | 数量/单位 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `specification_model` | `specification_model` | `specification_model` | 规格型号 |
| `standard` | `standard` | `standard` | 标准 |
| `start_address_name` | `start_address_name` | `start_address_name` | 出发地名称 |
| `tax_identification` | `tax_identification` | `tax_identification` | 税号 |
| `tax_item_name` | `tax_item_name` | `tax_item_name` | 品目名称 |
| `tax_list` | `tax_list` | `tax_list` | 税额列表 |
| `ticket_class` | `ticket_class` | `ticket_class` | 客票级别/客票类别 |
| `time_geton` | `time_geton` | `time_geton` | 上车时间 |
| `type_tax` | `type_tax` | `type_tax` | 税种 |
| `unit` | `unit` | `unit` | 单位 |
| `vflighttrainnum` | `vflighttrainnum` | `vflighttrainnum` | 航班/车次 |
| `vlicenseplate` | `vlicenseplate` | `vlicenseplate` | 车牌号 |
| `vseatlevel` | `vseatlevel` | `vseatlevel` | 座位等级名称 |
| `vvehicletype` | `vvehicletype` | `vvehicletype` | 车辆类型 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_carrier` | `pk_carrier` | `pk_carrier` | 承运人主键 |
| `pk_consumekind` | `pk_consumekind` | `pk_consumekind` | 消费类型 |
| `pk_end_address` | `pk_end_address` | `pk_end_address` | 达到地 |
| `pk_invoicecheck_b` | `pk_invoicecheck_b` | `pk_invoicecheck_b` | 增值税票查验结果子表 |
| `pk_seatgrade` | `pk_seatgrade` | `pk_seatgrade` | 座位等级 |
| `pk_start_address` | `pk_start_address` | `pk_start_address` | 出发地 |
| `pk_tallydata` | `pk_tallydata` | `pk_tallydata` | 主表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `costdate` | `costdate` | `costdate` | 发生日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `deposit_date` | `deposit_date` | `deposit_date` | 入(退)库日期 |
| `end_date` | `end_date` | `end_date` | 到达日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `start_date` | `start_date` | `start_date` | 出发日期 |
| `ticket_effective_date` | `ticket_effective_date` | `ticket_effective_date` | 客票生效日期 |
| `ticket_expiry_date` | `ticket_expiry_date` | `ticket_expiry_date` | 有效截至日期 |
| `toll_end_date` | `toll_end_date` | `toll_end_date` | 通行结束日期 |
| `toll_start_date` | `toll_start_date` | `toll_start_date` | 通行起始日期 |
| `travel_date` | `travel_date` | `travel_date` | 乘坐日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iscandeduct` | `iscandeduct` | `iscandeduct` | 货物是否可抵扣 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `virtureRow` | `virtureRow` | `virtureRow` | 虚拟行号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `pk_deducttax` | `pk_deducttax` | `pk_deducttax` | 可抵扣税表主键 |

### 数值字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actual_amount` | `actual_amount` | `actual_amount` | 实缴(退)金额 |
| `amount` | `amount` | `amount` | 金额 |
| `dutiable_amount` | `dutiable_amount` | `dutiable_amount` | 完税价格 |
| `ndeducttaxmny` | `ndeducttaxmny` | `ndeducttaxmny` | 可抵扣金额 |
| `ndeducttaxrate` | `ndeducttaxrate` | `ndeducttaxrate` | 可抵扣税率 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nmny` | `nmny` | `nmny` | 含税金额 |
| `nservicetaxmny` | `nservicetaxmny` | `nservicetaxmny` | 服务费可抵扣税额 |
| `nservicetaxrate` | `nservicetaxrate` | `nservicetaxrate` | 服务费可抵扣税率 |
| `nuntaxmny` | `nuntaxmny` | `nuntaxmny` | 不含税金额 |
| `paid_amount` | `paid_amount` | `paid_amount` | 已缴或扣除额 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `tax_amount` | `tax_amount` | `tax_amount` | 税额 |
| `tax_rate` | `tax_rate` | `tax_rate` | 税率 |
| `unit_price` | `unit_price` | `unit_price` | 单价 |
| `vdiscount` | `vdiscount` | `vdiscount` | 折扣金额 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `end_time` | `end_time` | `end_time` | 到达时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `start_time` | `start_time` | `start_time` | 出发时间 |
| `travel_time` | `travel_time` | `travel_time` | 乘坐时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tallydataamountDcs` | `tallydataamountDcs` | `tallydataamountDcs` | 账单金额自定义项 |
