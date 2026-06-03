---
tags: [BIP, 元数据, 数据字典, um.logisticssetting.Deliverytype]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物流设置 (`um.logisticssetting.Deliverytype`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`deliverytype` | domain：`umall` | 应用：`SDMA` | 业务对象ID：`d951903a-44e7-497a-aad8-e98ec1eb5c8a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物流设置 |
| 物理表 | `deliverytype` |
| 数据库 schema | `umall` |
| 所属应用 | `SDMA` |
| 直连字段 | 48 个 |
| 子表 | 3 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `deliveryarea` | `um.logisticssetting.Deliveryarea` | composition |
| `nonmailarea` | `um.logisticssetting.Nonmailarea` | composition |
| `distancefreight` | `um.logisticssetting.DistanceFreight` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (2个, 2字段)

- **商城租户相关** (`base.itf.IMallcorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 48 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dt_name` | `dt_name` | `dt_name` | 运费模板名称 |
| `postDescription` | `postDescription` | `postDescription` | 包邮描述 |
| `area_fee_conf` | `area_fee_conf` | `area_fee_conf` | 指定地区配置的一系列参数 |
| `corp_id` | `corp_id` | `corp_id` | 物流公司ID |
| `def_area_fee` | `def_area_fee` | `def_area_fee` | 按地区设置配送费用 |
| `detail` | `detail` | `detail` | 详细描述 |
| `dt_expressions` | `dt_expressions` | `dt_expressions` | 配送费用计算表达式 |
| `freightDescription` | `freightDescription` | `freightDescription` | 运费说明 |
| `templateDisplayName` | `templateDisplayName` | `templateDisplayName` | 运费模板显示名称 |
| `threshold` | `threshold` | `threshold` | 临界值配置参数 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `startTime` | `startTime` | `startTime` | 有效期间 |
| `endTime` | `endTime` | `endTime` | 至 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDefault` | `isDefault` | `isDefault` | 是否默认 |
| `protect` | `protect` | `protect` | 物流保价 |
| `disabled` | `disabled` | `disabled` | 是否失效 |
| `dt_useexp` | `dt_useexp` | `dt_useexp` | 是否使用公式 |
| `has_cod` | `has_cod` | `has_cod` | 货到付款 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `feestyle` | `feestyle` | `feestyle` | 运费计算方式 |
| `firstunit` | `firstunit` | `firstunit` | 重量设置 |
| `continueunit` | `continueunit` | `continueunit` | 续重单位 |
| `setting` | `setting` | `setting` | 默认配送地区 |
| `dt_status` | `dt_status` | `dt_status` | 是否开启 |
| `freight_markup_style` | `freight_markup_style` | `freightMarkupStyle` | 运费加价方式 |
| `iDeleted` | `iDeleted` | `iDeleted` | 删除标记 |
| `is_threshold` | `is_threshold` | `is_threshold` | 临界值 0:不启用;1:启用; |

### 短整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isPost` | `isPost` | `isPost` | 条件包邮 |
| `terminalType` | `terminalType` | `terminalType` | 线上终端 |
| `preferentialWay` | `preferentialWay` | `preferentialWay` | 包邮的优惠方式 |
| `packetMailRangeType` | `packetMailRangeType` | `packetMailRangeType` | 包邮范围 |
| `ordernum` | `ordernum` | `ordernum` | 排序 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `iCorpId` | `iCorpId` | `mallcorp` | mallcorp |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `unifiedPrice` | `unifiedPrice` | `unifiedPrice` | 统一计价 |
| `firstprice` | `firstprice` | `firstprice` | 默认配送费用 |
| `continueprice` | `continueprice` | `continueprice` | 续重费用 |
| `iConsumerSpending` | `iConsumerSpending` | `iConsumerSpending` | 优惠方式 |
| `distanceUnit` | `distanceUnit` | `distanceUnit` | 距离每增加(Km) |
| `dt_discount` | `dt_discount` | `dt_discount` | 折扣值 |
| `fixedamount` | `fixedamount` | `fixedAmount` | 固定金额 |
| `freightUnit` | `freightUnit` | `freightUnit` | 运费加 |
| `minprice` | `minprice` | `minprice` | 保价费最低值 |
| `proportional` | `proportional` | `proportional` | 比例 |
| `protect_rate` | `protect_rate` | `protect_rate` | 报价费率 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `deliveryarea` | 物流设置 |
| `` | `` | `distancefreight` | 距离运费 |
| `` | `` | `nonmailarea` | 物流设置 |
