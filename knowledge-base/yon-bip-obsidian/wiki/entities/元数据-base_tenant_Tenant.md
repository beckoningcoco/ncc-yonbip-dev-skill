---
tags: [BIP, 元数据, 数据字典, base.tenant.Tenant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 租户 (`base.tenant.Tenant`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tenant` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 租户 |
| 物理表 | `tenant` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 36 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |

## 继承接口 (2个, 4字段)

- **可用状态** (`base.itf.IAvailable`)
  - `disable_time` → `disable_time`
  - `enable_time` → `enable_time`
  - `is_available` → `is_available`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 36 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `address` | `address` | `address` | 地址 |
| `alias` | `alias` | `alias` | 别名 |
| `appid` | `appid` | `appId` | 应用ID |
| `comment` | `comment` | `comment` | 备注 |
| `contact` | `contact` | `contact` | 联系人 |
| `email` | `email` | `email` | 联系邮件 |
| `fax` | `fax` | `fax` | 公司传真 |
| `integrateConfigUrl` | `integrateConfigUrl` | `integrateConfigUrl` | 集成配置URL |
| `introduction` | `introduction` | `introduction` | 公司简介 |
| `logo` | `logo` | `logo` | 商标 |
| `name` | `name` | `name` | 名称 |
| `phone` | `phone` | `phone` | 联系电话 |
| `region_code` | `region_code` | `regionCode` | 地区代码 |
| `tax_id` | `tax_id` | `taxId` | 纳税人识别号 |
| `tenantcenter_id` | `tenantcenter_id` | `tenantCenter` | 租户中心ID |
| `theme` | `theme` | `theme` | 主题 |
| `webdomain` | `webdomain` | `webdomain` | 域名 |
| `website` | `website` | `website` | 网站 |
| `yxytenantid` | `yxytenantid` | `yxyTenantId` | 营销云应用关联租户Guid |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_available` | `is_available` | `isAvailable` | 是否可用 |
| `isindustrysuccess` | `isindustrysuccess` | `isIndustrySuccess` | 行业是否成功 |
| `isOpen` | `isOpen` | `isOpen` | 租户是否开通 |
| `isOpenUdh` | `isOpenUdh` | `isOpenUdh` | 是否开通U订货 |
| `isprintsuccess` | `isprintsuccess` | `isPrintSuccess` | 云打印是否成功 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source` | `source` | `source` | 注册来源 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `industry` | `industry` | `industry` | 行业 |
| `region` | `region` | `region` | 区域 |
| `corp_size` | `corp_size` | `size` | 规模 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 注册时间 |
| `disable_time` | `disable_time` | `disableTime` | 禁用时间 |
| `enable_time` | `enable_time` | `enableTime` | 启用时间 |
| `over_time` | `over_time` | `overTime` | 过期时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `start_time` | `start_time` | `startTime` | 开通时间 |
