---
tags: [BIP, 元数据, 数据字典, uhybase.labeldoc.labeldoc]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 标签档案 (`uhybase.labeldoc.labeldoc`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_labeldoc` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`8fe8278a-9725-49f3-be95-c77237452269`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标签档案 |
| 物理表 | `mp_labeldoc` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 57 个 |
| 子表 | 6 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `labelAutoCondition` | `uhybase.labeldoc.LabelAutoCondition` | composition |
| `labelOrg` | `uhybase.labeldoc.LabelOrg` | composition |
| `labelValue` | `uhybase.labeldoc.LabelValue` | composition |
| `labelExclusion` | `uhybase.labeldoc.LabelExclusion` | composition |
| `labelRefObjectType` | `uhybase.labeldoc.LabelRefObjectType` | composition |
| `labelRole` | `uhybase.labeldoc.LabelRole` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `iLabelClassID` | `mm_labeldocclasstree` |
| `cAppID` | `` |
| `iProcessID` | `` |
| `` | `` |
| `ytenant_id` | `` |

## 继承接口 (5个, 6字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **创建时间** (`uhy.itf.CreateTime`)
  - `dCreateTime` → `dCreateTime`
- **创建操作员ID** (`uhy.itf.yhtUserId`)
  - `cYhtUserId` → `cYhtUserId`
  - `cYhtUserName` → `cYhtUserName`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 57 个直连字段

### 文本字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 标签编码 |
| `cName` | `cName` | `name` | 标签名称 |
| `cDesc` | `cDesc` | `desc` | 标签描述 |
| `cValueUnit` | `cValueUnit` | `cValueUnit` | 单位 |
| `cCreatorName` | `cCreatorName` | `cCreatorName` | 创建人名称 |
| `cFullPath` | `cFullPath` | `path` | 路径 |
| `cYhtUserId` | `cYhtUserId` | `yhtUserId` | 友互通用户ID |
| `cArchiveRefDomain` | `cArchiveRefDomain` | `cArchiveRefDomain` | 参照domain |
| `cArchiveName` | `cArchiveName` | `cArchiveName` | 参照中文名 |
| `cUpdateName` | `cUpdateName` | `cUpdateName` | 修改人名称 |
| `cValue1` | `cValue1` | `cValue1` | 值1 |
| `cRefObjectType` | `cRefObjectType` | `cRefObjectType` | 引用对象类型 |
| `cArchiveRefType` | `cArchiveRefType` | `cArchiveRefType` | 参照fullname |
| `cArchiveRefCode` | `cArchiveRefCode` | `cArchiveRefCode` | 参照refCode |
| `cConditionRelation` | `cConditionRelation` | `cConditionRelation` | 条件关系使用or|and |
| `cValue2` | `cValue2` | `cValue2` | 值2 |
| `cCondition` | `cCondition` | `cCondition` | 条件(gt;lt;eq) |
| `cYhtUserName` | `cYhtUserName` | `yhtUserName` | 操作员Name |
| `iLabelType` | `iLabelType` | `labelType` | 标签类型 |
| `cBgColor` | `cBgColor` | `bgColor` | 背景颜色 |
| `cFgColor` | `cFgColor` | `fgColor` | 字体颜色 |
| `cImageUrl` | `cImageUrl` | `imageUrl` | 图片 |
| `cWXBizID` | `cWXBizID` | `cWXBizID` | 企微标签ID |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `iProcessID` | `iProcessID` | `iProcessID` | 流程ID |
| `iLabelClassID` | `iLabelClassID` | `labelClassID` | 标签分组ID |

### 布尔字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bUnlimitOrg` | `bUnlimitOrg` | `bUnlimitOrg` | 是否适用所有组织(1:是 0:否) |
| `bSaveMoney` | `bSaveMoney` | `bSaveMoney` | 是否储值 |
| `bConsume` | `bConsume` | `bConsume` | 是否消费 |
| `bUnlimitRole` | `bUnlimitRole` | `bUnlimitRole` | 是否适用所有角色(1:是 0:否) |
| `iPreset` | `iPreset` | `preset` | 系统标签 |
| `bValid` | `bValid` | `bValid` | 启用状态 |
| `bInner` | `bInner` | `bInner` | 是否内部标签 |
| `bWXBizSync` | `bWXBizSync` | `bWXBizSync` | 是否同步企微 |

### 整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCrowdType` | `iCrowdType` | `iCrowdType` | 人群属性(0:标签,1:人群) |
| `iValueType` | `iValueType` | `iValueType` | 取值方式 |
| `iOrder` | `iOrder` | `iOrder` | 顺序 |
| `iConsumeOrderType` | `iConsumeOrderType` | `iConsumeOrderType` | 移除标签的消费时机(1:订单支付时,2:订单完成时) |
| `iAddLabelType` | `iAddLabelType` | `iAddLabelType` | 打标签方式(0:手动打标,1:自动打标) |
| `iMemberCount` | `iMemberCount` | `memberCount` | 会员数量 |
| `iAddLabelCondition` | `iAddLabelCondition` | `iAddLabelCondition` | 打标签条件(0:注册会员) |
| `iLabelSource` | `iLabelSource` | `iLabelSource` | 标签来源(1:自定义标签,0:系统标签) |
| `dCreateTime` | `dCreateTime` | `createTime` | 生成日期 |
| `dUpdateTime` | `dUpdateTime` | `dUpdateTime` | 修改时间 |
| `iStyle` | `iStyle` | `style` | 标签样式 |
| `iSourceType` | `iSourceType` | `iSourceType` | 来源系统标志 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `iStoreEmpID` | `iStoreEmpID` | `storeEmpID` | 创建店员id |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `labelAutoCondition` | 标签自动设置条件 |
| `` | `` | `labelExclusion` | 标签互斥关系 |
| `` | `` | `labelOrg` | 标签组织关系表 |
| `` | `` | `labelRefObjectType` | 标签适用对象类型关系表 |
| `` | `` | `labelRole` | 标签角色关系表 |
| `` | `` | `labelValue` | 标签值 |
