---
tags: [BIP, 元数据, 数据字典, crmc.display.Display]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 陈列规格 (`crmc.display.Display`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_display` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：`c8cf4339-e48c-4117-bb1f-9313ae4f93bd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 陈列规格 |
| 物理表 | `mka_display` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 34 个 |
| 子表 | 6 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `partakeScopeConditionList` | `crmc.display.DisplayScopeCondition` | composition |
| `subList` | `crmc.display.DisplaySub` | composition |
| `headDef` | `crmc.display.DisplayDef` | composition |
| `customerScopeConditionList` | `crmc.display.DisplayCustomerScopeCondition` | composition |
| `materialList` | `crmc.display.DisplayMaterial` | composition |
| `rewardList` | `crmc.display.DisplayReward` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `ower` | `` |
| `` | `` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `ytenant_id` | `` |
| `dept` | `` |
| `displayDefineCharacter` | `` |
| `salearea` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 13字段)

- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `name` | `name` | `name` | 名称 |
| `standard` | `standard` | `standard` | 陈列标准 |
| `comment` | `comment` | `comment` | 备注 |
| `displayimg` | `displayimg` | `displayimg` | 陈列样例 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `dept` | `dept` | `dept` | 部门 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ower` | `ower` | `ower` | 所有者 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `org` | `org` | `org` | 销售组织ID |
| `salearea` | `salearea` | `salearea` | 区域 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pay_method` | `pay_method` | `payMethod` | 兑付方式 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `standard_score` | `standard_score` | `standardScore` | 达标得分 |
| `num` | `num` | `num` | 数量 |
| `reward_money` | `reward_money` | `rewardMoney` | 奖励金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `displayDefineCharacter` | `displayDefineCharacter` | `displayDefineCharacter` | 陈列规格自定义项特征属性组 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `customerScopeConditionList` | 陈列规格客户范围条件设定 |
| `` | `` | `headDef` | 陈列规格主表自定义项 |
| `` | `` | `materialList` | 使用物料表 |
| `` | `` | `partakeScopeConditionList` | 陈列规格适用范围条件设定 |
| `` | `` | `rewardList` | 奖励商品子表 |
| `` | `` | `subList` | 陈列商品子表 |
