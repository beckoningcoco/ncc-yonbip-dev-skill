---
tags: [BIP, 元数据, 数据字典, bd.bill.BillItemExt]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 表单属性拓展 (`bd.bill.BillItemExt`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`billitem_base_extend_transtype` | domain：`transtype` | 应用：`BMMMM` | 业务对象ID：`9fdd7673-1279-4a0c-a0aa-c4ed47e6f4d3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 表单属性拓展 |
| 物理表 | `billitem_base_extend_transtype` |
| 数据库 schema | `transtype` |
| 所属应用 | `BMMMM` |
| 直连字段 | 62 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 字段列表（按类型分组）

> 共 62 个直连字段

### 文本字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `cName` | 字段属性 |
| `cCaption` | `cCaption` | `cCaption` | 字段名称 |
| `cCaption_resid` | `cCaption_resid` | `cCaption_resid` | 字段名称多语词条 |
| `cControlType` | `cControlType` | `cControlType` | 控件类型 |
| `cRefType` | `cRefType` | `cRefType` | 参照编码 |
| `cEnumType` | `cEnumType` | `cEnumType` | 枚举类型 |
| `cDefaultValue` | `cDefaultValue` | `cDefaultValue` | 默认值 |
| `cRefRetId` | `cRefRetId` | `cRefRetId` | 参照映射关系 |
| `refReturn` | `refReturn` | `refReturn` | 参照返回值 |
| `billTypeId` | `billTypeId` | `billTypeId` | 单据类型ID |
| `cStyle` | `cStyle` | `cStyle` | 样式 |
| `cDataRule` | `cDataRule` | `cDataRule` | 规则信息 |
| `cDataSourceName` | `cDataSourceName` | `cDataSourceName` | 数据源名称 |
| `cEnumString` | `cEnumString` | `cEnumString` | 枚举信息 |
| `cFieldName` | `cFieldName` | `cFieldName` | 带关联关系的字段名 |
| `cFormatData` | `cFormatData` | `cFormatData` | 格式化串设置 |
| `cMemo` | `cMemo` | `cMemo` | 备注 |
| `cOrder` | `cOrder` | `cOrder` | 排序信息 |
| `cRefId` | `cRefId` | `cRefId` | 参照Id |
| `cShowCaption` | `cShowCaption` | `cShowCaption` | 显示名称 |
| `cShowCaption_resid` | `cShowCaption_resid` | `cShowCaption_resid` | 字段名称多语词条 |
| `cSourceType` | `cSourceType` | `cSourceType` | 数据来源类型 |
| `cSubId` | `cSubId` | `cSubId` | 子产品号 |
| `cSumType` | `cSumType` | `cSumType` | 汇总类型 |
| `cUserId` | `cUserId` | `cUserId` | 用户信息 |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 微服务编码 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenantId` | 租户ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 布尔字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `multiple` | `multiple` | `multiple` | 是否多选 |
| `bIsNull` | `bIsNull` | `bIsNull` | 是否可以为空 |
| `bHidden` | `bHidden` | `bHidden` | 是否隐藏 |
| `bCanModify` | `bCanModify` | `bCanModify` | 是否可修改 |
| `bCheck` | `bCheck` | `bCheck` | 是否向后端发送校验请求 |
| `bEnum` | `bEnum` | `bEnum` | 是否枚举 |
| `bExtend` | `bExtend` | `bExtend` | 是否扩展字段 |
| `bFilter` | `bFilter` | `bFilter` | 是否过滤字段 |
| `bFixed` | `bFixed` | `bFixed` | 是否是固定列 |
| `bJointQuery` | `bJointQuery` | `bJointQuery` | 是否支持关联查询 |
| `bMustSelect` | `bMustSelect` | `bMustSelect` | 是否必选 |
| `bNeedSum` | `bNeedSum` | `bNeedSum` | 是否支持合计 |
| `bPrintCaption` | `bPrintCaption` | `bPrintCaption` | 是否打印栏目标题 |
| `bPrintUpCase` | `bPrintUpCase` | `bPrintUpCase` | 是否打印金额大写 |
| `bSelfDefine` | `bSelfDefine` | `bSelfDefine` | 是否自定义项目 |
| `bShowIt` | `bShowIt` | `bShowIt` | 是否是显示字段 |
| `bSplit` | `bSplit` | `bSplit` | 是否支持行拆分 |
| `iAlign` | `iAlign` | `iAlign` | 对齐方式 |
| `isDeleted` | `isDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iMaxLength` | `iMaxLength` | `iMaxLength` | 最大长度 |
| `iColWidth` | `iColWidth` | `iColWidth` | 列宽 |
| `iFieldType` | `iFieldType` | `iFieldType` | 字段类型 |
| `iFunctionType` | `iFunctionType` | `iFunctionType` | 功能标识 |
| `iMaxShowLen` | `iMaxShowLen` | `iMaxShowLen` | 最大显示长度 |
| `iNumPoint` | `iNumPoint` | `iNumPoint` | 小数点 |
| `iTabIndex` | `iTabIndex` | `iTabIndex` | Tab键的index |
| `upgrade_data_type` | `upgrade_data_type` | `upgradeDataType` | upgradeDataType |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `iBillTplGroupId` | `iBillTplGroupId` | `billtplgroup` | 所属分组 |
| `iBillId` | `iBillId` | `bill` | 所属表单 |
| `iBillEntityId` | `iBillEntityId` | `billentity` | billentityid |
| `iTplId` | `iTplId` | `billtemplate` | 模版id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `iOrder` | 排序 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
