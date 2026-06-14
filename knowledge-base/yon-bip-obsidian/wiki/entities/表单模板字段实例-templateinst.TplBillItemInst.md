---
tags: ["BIP", "元数据", "数据字典", "ycBase", "tpl.templateinst.TplBillItemInst"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 表单模板字段实例 (`tpl.templateinst.TplBillItemInst`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_tpl_bill_item_inst` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `tpl.templateinst.TplBillItemInst` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 表单模板字段实例 |
| 物理表 | `cpu_tpl_bill_item_inst` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 业务对象ID | `8e4ca17f-d207-4b93-a668-347744c6e8ba` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:19:00.8280` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-05-24 00:30:34:000
- **安装来源**: `/app/data_scripts/cpu-lawbid-bootstrap/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202504241008_metadata_tpl-templateinst_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `daa6df4a-75c4-4bb0-a327-7c220bd8290f`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 4 | 跨租户供应商租户接口 (`IVendorTenant`) | `cpu.itf.IVendorTenant` | 14 | 1 |
| 5 | 表单模板字段基础表 (`TplItemBase`) | `tpl.itf.TplItemBase` | 364 | 81 |
| 6 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 90 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `groupTemplateInstId` | 分组模板实例表主键 | `group_template_inst_id` | 9197044f-cd89-42d8-8d9f-50874631504a | `quote` |  | ✓ |
| 3 | `cSubId` | 子产品号 | `cSubId` | String | `text` |  | ✓ |
| 4 | `iBillId` | 所属表单基础表 | `iBillId` | Long | `long` |  | ✓ |
| 5 | `cFieldName` | 带关联关系的字段名 | `cFieldName` | String | `text` |  | ✓ |
| 6 | `cName` | 字段名 | `cName` | String | `text` |  | ✓ |
| 7 | `cCaption` | 名称 | `cCaption` | String | `text` |  | ✓ |
| 8 | `cShowCaption` | 显示名称 | `cShowCaption` | String | `text` |  | ✓ |
| 9 | `iBillEntityId` | 表单实体对象表主键 | `iBillEntityId` | Long | `long` |  | ✓ |
| 10 | `iBillTplGroupId` | 表单模板分组表主键 | `iBillTplGroupId` | Long | `long` |  | ✓ |
| 11 | `iOrder` | 排序号，从高到低排 | `iOrder` | Integer | `int` |  | ✓ |
| 12 | `iTplId` | 表单模板表主键 | `iTplId` | Long | `long` |  | ✓ |
| 13 | `iMaxLength` | 最大长度 | `iMaxLength` | Integer | `int` |  | ✓ |
| 14 | `iFieldType` | 字段类型 | `iFieldType` | Integer | `int` |  | ✓ |
| 15 | `bEnum` | 是否枚举 | `bEnum` | Boolean | `switch` |  | ✓ |
| 16 | `cEnumString` | 枚举信息 | `cEnumString` | String | `text` |  | ✓ |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 18 | `isDeleted` | 逻辑删除标记 | `isDeleted` | Boolean | `switch` |  | ✓ |
| 19 | `bMustSelect` | 是否必选 | `bMustSelect` | Boolean | `switch` |  | ✓ |
| 20 | `bHidden` | 是否隐藏 | `bHidden` | Boolean | `switch` |  | ✓ |
| 21 | `cRefType` | 枚举信息 | `cRefType` | String | `text` |  | ✓ |
| 22 | `cRefRetId` | 参照返回数据杰森结构 | `cRefRetId` | String | `text` |  | ✓ |
| 23 | `cDataRule` | 规则信息 | `cDataRule` | String | `text` |  | ✓ |
| 24 | `iFunctionType` | 一个字段标识可能的功能 | `iFunctionType` | Integer | `int` |  | ✓ |
| 25 | `bSplit` | 是否支持行拆分 | `bSplit` | Boolean | `switch` |  | ✓ |
| 26 | `bExtend` | 是否扩展字段 | `bExtend` | Boolean | `switch` |  | ✓ |
| 27 | `iNumPoint` | 小数点 | `iNumPoint` | Integer | `int` |  | ✓ |
| 28 | `bCanModify` | 是否可修改 | `bCanModify` | Boolean | `switch` |  | ✓ |
| 29 | `cSourceType` | 数据来源类型 | `cSourceType` | String | `text` |  | ✓ |
| 30 | `iMaxShowLen` | 最大显示长度 | `iMaxShowLen` | Integer | `int` |  | ✓ |
| 31 | `cMemo` | 备注 | `cMemo` | String | `text` |  | ✓ |
| 32 | `iColWidth` | 列宽 | `iColWidth` | Integer | `int` |  | ✓ |
| 33 | `cSumType` | 汇总类型 | `cSumType` | String | `text` |  | ✓ |
| 34 | `iAlign` | 对齐方式 | `iAlign` | Integer | `int` |  | ✓ |
| 35 | `bNeedSum` | 是否支持合计 | `bNeedSum` | Boolean | `switch` |  | ✓ |
| 36 | `bShowIt` | 是否是显示字段 | `bShowIt` | Boolean | `switch` |  | ✓ |
| 37 | `bFixed` | 是否是固定列 | `bFixed` | Boolean | `switch` |  | ✓ |
| 38 | `bFilter` | 是否过滤字段 | `bFilter` | Boolean | `switch` |  | ✓ |
| 39 | `cDefaultValue` | 默认值 | `cdefaultvalue` | String | `text` |  | ✓ |
| 40 | `cFormatData` | 格式化的格式 | `cFormatData` | String | `text` |  | ✓ |
| 41 | `cUserId` | 用户信息 | `cUserId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 42 | `iTabIndex` | 切换键的脚标 | `iTabIndex` | Integer | `int` |  | ✓ |
| 43 | `bIsNull` | 是否可以为空 | `bIsNull` | Boolean | `switch` |  | ✓ |
| 44 | `bPrintCaption` | 是否打印栏目标题 | `bPrintCaption` | Boolean | `switch` |  | ✓ |
| 45 | `bJointQuery` | 是否支持关联查询 | `bJointQuery` | Boolean | `switch` |  | ✓ |
| 46 | `bPrintUpCase` | 是否打印金额大写 | `bPrintUpCase` | Boolean | `switch` |  | ✓ |
| 47 | `bSelfDefine` | 是否自定义项目 | `bSelfDefine` | Boolean | `switch` |  | ✓ |
| 48 | `cSelfDefineType` | 自定义项类主键 | `cSelfDefineType` | String | `text` |  | ✓ |
| 49 | `cDataSourceName` | 数据源名称 | `cDataSourceName` | String | `text` |  | ✓ |
| 50 | `cOrder` | 排序信息 | `cOrder` | String | `text` |  | ✓ |
| 51 | `bCheck` | 是否向后端发送校验请求 | `bCheck` | Boolean | `switch` |  | ✓ |
| 52 | `cControlType` | 控件类型 | `cControlType` | String | `text` |  | ✓ |
| 53 | `cEnumType` | 枚举类型 | `cEnumType` | String | `text` |  | ✓ |
| 54 | `refReturn` | 参照返回值 | `refReturn` | String | `text` |  | ✓ |
| 55 | `bShowInRowAuth` | 记录权限分配界面是否显示 | `bShowInRowAuth` | Boolean | `switch` |  | ✓ |
| 56 | `iRowAuthBillId` | 行权限基础表单主键（暂无用） | `iRowAuthBillId` | Integer | `int` |  | ✓ |
| 57 | `cStyle` | 样式描述 | `cStyle` | String | `text` |  | ✓ |
| 58 | `browauthcontrolled` | 是否行数据权限控制 | `browauthcontrolled` | Boolean | `switch` |  | ✓ |
| 59 | `bVmExclude` | 是否是从视图模型中排列 | `bVmExclude` | Integer | `int` |  | ✓ |
| 60 | `bRowAuthDim` | 是否定义行数据权限 | `bRowAuthDim` | Boolean | `switch` |  | ✓ |
| 61 | `sysid` | 非0租户记录0租户对应数据主键 | `sysid` | Long | `long` |  | ✓ |
| 62 | `multiple` | 参照是否可以多选 | `multiple` | Boolean | `switch` |  | ✓ |
| 63 | `iSystem` | 0为非系统定义字段，1代表系统定义 | `iSystem` | Integer | `int` |  | ✓ |
| 64 | `depends` | 模块依赖 | `depends` | String | `text` |  | ✓ |
| 65 | `cDefineName` | 自定义字段公式描述 | `cDefineName` | String | `text` |  | ✓ |
| 66 | `enterDirection` | 单元格录入完毕回车后的焦点方向 | `enterDirection` | Integer | `int` |  | ✓ |
| 67 | `isExport` | 是否输出字段 | `isExport` | Boolean | `switch` |  | ✓ |
| 68 | `isMasterOrg` | 是否表单主组织字段 | `isMasterOrg` | Boolean | `switch` |  | ✓ |
| 69 | `cSensFieldName` | 对应权限字段名 | `cSensFieldName` | String | `text` |  | ✓ |
| 70 | `cExtProps` | 扩展 | `cExtProps` | String | `text` |  | ✓ |
| 71 | `cDesignProps` | 设计 | `cDesignProps` | String | `text` |  | ✓ |
| 72 | `bEnableFormat` | 是否按当前时区转换 | `bEnableFormat` | Boolean | `switch` |  | ✓ |
| 73 | `cReltzField` |  | `cReltzField` | String | `text` |  | ✓ |
| 74 | `makeField` | 生单字段 | `makeField` | String | `text` |  | ✓ |
| 75 | `cExampleValue` |  | `cExampleValue` | String | `text` |  | ✓ |
| 76 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 77 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 78 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 79 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String | `text` |  | ✓ |
| 80 | `enable` | 状态 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 81 | `authLevel` | 权限级别 | `auth_level` | Integer | `int` |  | ✓ |
| 82 | `cCaptionResid` |  | `cCaption_resid` | String | `text` |  | ✓ |
| 83 | `cRefId` | 参照主键 | `crefid` | String | `text` |  | ✓ |
| 84 | `cShowCaptionResid` |  | `cShowCaption_resid` | String | `text` |  | ✓ |
| 85 | `characterKey` | 特征 | `characterKey` | String | `text` |  | ✓ |
| 86 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 87 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 88 | `isPrint` | 是否打印字段 | `isprint` | Boolean | `switch` |  | ✓ |
| 89 | `isShoprelated` | 是否门店相关 | `isshoprelated` | Boolean | `switch` |  | ✓ |
| 90 | `unCopyable` | 是否表单主组织字段 | `uncopyable` | Boolean | `switch` |  | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `groupTemplateInstId` | 分组模板实例表主键 | `tpl.templateinst.TplGroupTemplateInst` | `group_template_inst_id` | BillItemInsts → groupTemplateInstId | 1..n | true | None |  |
| 2 | `cUserId` | 用户信息 | `base.user.User` | `cUserId` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Composition（子表）

- **groupTemplateInstId**: `BillItemInsts` → `tpl.templateinst.TplGroupTemplateInst` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `cUserId` (用户信息) | `base.user.User` | `cUserId` |
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
