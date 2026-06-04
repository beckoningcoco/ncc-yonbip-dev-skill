---
tags: ["BIP", "元数据", "数据字典", "ycBase", "privateadver.adver.PrivateAdver"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 门户广告管理 (`privateadver.adver.PrivateAdver`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_private_adver` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `privateadver.adver.PrivateAdver` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 门户广告管理 |
| 物理表 | `cpu_private_adver` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 业务对象ID | `e75a68ec-82b3-4e46-83d4-04e106cbadc9` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:31.4400` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:30:33:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202511281048_metadata_privateadver-adver.zip`
- **安装人**: mongoTools
- **安装排名**: `6088754e-c105-4016-9fdd-1bb759c8e0d9`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 4 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 27 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 2 | `createTime` | 创建时间 | `createtime` | DateTime | `dateTime` |  | ✓ |
| 3 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 4 | `creatorId` | 创建人 | `creat_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 5 | `desc` | 描述 | `descr` | String | `text` |  | ✓ |
| 6 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `enable` | 启用停用 | `is_enable` | Short | `short` |  | ✓ |
| 9 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 10 | `fileId` | 图片文件标识 | `file_id` | String | `text` |  | ✓ |
| 11 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 12 | `imageUrl` | 图片链接 | `url` | String | `text` |  | ✓ |
| 13 | `langCode` | 语言编码 | `mul_code` | String | `text` |  | ✓ |
| 14 | `langName` | 语言名称 | `mul_name` | String | `text` |  | ✓ |
| 15 | `linkUrl` | 跳转地址 | `linkurl` | String | `text` |  | ✓ |
| 16 | `modifier` | 修改人姓名 | `modifier` | String | `text` |  | ✓ |
| 17 | `modifierId` | 修改人标识 | `update_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 19 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `dateTime` |  | ✓ |
| 20 | `objectId` | 图片业务标识 | `object_id` | String | `text` |  | ✓ |
| 21 | `project` | 适用类型 | `project` | Short | `short` |  | ✓ |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 23 | `refCode` | 参照编码 | `ref_code` | String | `text` |  | ✓ |
| 24 | `refId` | 参照标识 | `ref_id` | Long | `long` |  | ✓ |
| 25 | `serial` | 序号 | `serial` | Integer | `int` |  | ✓ |
| 26 | `tenantId` | 租户标识 | `tenant_id` | String | `text` |  | ✓ |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | `creat_id` |  →  |  |  | Service |  |
| 3 | `modifierId` | 修改人标识 | `base.user.User` | `update_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creat_id` |
| `modifierId` (修改人标识) | `base.user.User` | `update_id` |
