---
tags: [BIP, 元数据, 数据字典, znbzbx.memoapply.MemoApplyPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行程规划子表 (`znbzbx.memoapply.MemoApplyPlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_memoapply_plan` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 行程规划子表 |
| 物理表 | `znbz_memoapply_plan` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `fromcity` | `` |
| `ytenant_id` | `` |
| `pk_memoapply` | `` |
| `checkincity` | `` |
| `tocity` | `` |
| `trainlevel` | `` |
| `travelers` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `airlinecompany` | `airlinecompany` | `airlinecompany` | 航空公司 |
| `departure` | `departure` | `departure` | 出发地 |
| `destination` | `destination` | `destination` | 目的地 |
| `flightclass` | `flightclass` | `flightclass` | 舱位等级 |
| `flightnumber` | `flightnumber` | `flightnumber` | 航班号 |
| `hotelname` | `hotelname` | `hotelname` | 酒店名称 |
| `nightnum` | `nightnum` | `nightnum` | 间夜 |
| `roomtype` | `roomtype` | `roomtype` | 房型 |
| `sittime` | `sittime` | `sittime` | 时长 |
| `trainnumber` | `trainnumber` | `trainnumber` | 车次 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `checkincity` | `checkincity` | `checkincity` | 入住城市 |
| `fromcity` | `fromcity` | `fromcity` | 出发城市 |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 申请单主表id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `tocity` | `tocity` | `tocity` | 到达城市 |
| `trainlevel` | `trainlevel` | `trainlevel` | 座位等级 |
| `travelers` | `travelers` | `travelers` | 乘坐人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arrivaltime` | `arrivaltime` | `arrivaltime` | 到达时间 |
| `checkindate` | `checkindate` | `checkindate` | 计划入住日期 |
| `checkoutdate` | `checkoutdate` | `checkoutdate` | 计划离店日期 |
| `departuretime` | `departuretime` | `departuretime` | 出发时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `biztype` | `biztype` | `biztype` | 订单类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `estimatedamount` | `estimatedamount` | `estimatedamount` | 预计金额 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
