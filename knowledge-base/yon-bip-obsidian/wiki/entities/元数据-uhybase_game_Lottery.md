---
tags: [BIP, 元数据, 数据字典, uhybase.game.Lottery]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 游戏 (`uhybase.game.Lottery`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_lottery` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`deb9decb-00f2-4fa8-a9bf-c0fcf7cbabf7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 游戏 |
| 物理表 | `mp_lottery` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `` |
| `ytenant_id` | `` |

## 继承接口 (3个, 3字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **创建时间** (`uhy.itf.CreateTime`)
  - `dCreateTime` → `dCreateTime`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cTitle` | `cTitle` | `name` | 标题 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bMembers` | `bMembers` | `bMembers` | 会员活动 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |
| `dEndTime` | `dEndTime` | `endTime` | 结束时间 |
| `iLimitType` | `iLimitType` | `iLimitType` | 限制状态 |
| `iType` | `iType` | `iType` | 类型 |
| `dStartTime` | `dStartTime` | `startTime` | 开始时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStatus` | `iStatus` | `iStatus` | 状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |
| `iType` | `iType` | `type` | 类型ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
