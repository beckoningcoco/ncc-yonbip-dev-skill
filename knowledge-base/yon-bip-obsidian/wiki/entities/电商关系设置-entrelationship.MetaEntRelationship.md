---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.entrelationship.MetaEntRelationship"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电商关系设置 (`mall.entrelationship.MetaEntRelationship`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_ent_relationship` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.entrelationship.MetaEntRelationship` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电商关系设置 |
| 物理表 | `cpu_ent_relationship` |
| 数据库 schema | `yonbip-cpu-mall` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `8d7ebec4-0a4f-45e5-8038-fc7bd04bdf51` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:55.4240` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:40:41:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202512261740_metadata_mall-entrelationship_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `b7696460-0feb-4881-886f-2b7808df6a09`

## 业务场景

- `UITemplate`

## 术语标记

`ConfigData`, `isMain`

## 约束

- **entrelationship_PK** (transformKey): 结算关系主键翻译规则 — 唯一字段: `['supply_doc_id', 'from_org_id']`
- **id** (Unique): id — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 36 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `from_org_id` | 采购组织ID | `from_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 3 | `from_org_name` | 组织 | `from_org_name` | String | `text` |  | ✓ |
| 4 | `to_biz_g_identity` | groupcode | `to_biz_g_identity` | String | `text` |  | ✓ |
| 5 | `to_biz_g_name` | groupName | `to_biz_g_name` | String | `text` |  | ✓ |
| 6 | `to_biz_identity` | custmerCode | `to_biz_identity` | String | `text` |  | ✓ |
| 7 | `to_biz_name` | custormerName | `to_biz_name` | String | `text` |  | ✓ |
| 8 | `indmall_type` | 工业超市类型 | `indmall_type` | String | `text` |  | ✓ |
| 9 | `mall_type` | 办公超市类型 | `mall_type` | String | `text` |  | ✓ |
| 10 | `pay_way` | 付款方式 | `pay_way` | String | `text` |  | ✓ |
| 11 | `settle_way` | 结算方式 | `settle_way` | String | `text` |  | ✓ |
| 12 | `is_pay_agreement` | 是否按协议付款 | `is_pay_agreement` | Boolean | `switch` |  | ✓ |
| 13 | `is_protocol_sup` | 是否线下供应商 | `is_protocol_sup` | Boolean | `switch` |  | ✓ |
| 14 | `auto_on_shelf` | 是否自动上架 | `auto_on_shelf` | Boolean | `switch` |  | ✓ |
| 15 | `channel_closed` | 关闭电商通道 | `channel_closed` | Integer | `int` |  | ✓ |
| 16 | `amount_limit` | 订单最低金额 | `amount_limit` | Decimal | `number` |  | ✓ |
| 17 | `biz_role_relationship_id` | 商业角色 | `biz_role_relationship_id` | Integer | `int` |  | ✓ |
| 18 | `create_time` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 19 | `creator` | 创建者 | `creator` | String | `text` |  | ✓ |
| 20 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 21 | `ec_invoices` | 是否电商对账开票:0.否,1.是 | `ec_invoices` | Boolean | `switch` |  | ✓ |
| 22 | `from_biz_identity` | 采购商分配给供应单位的识别码 | `from_biz_identity` | String | `text` |  | ✓ |
| 23 | `from_biz_name` | 来源方业务标识名称 | `from_biz_name` | String | `text` |  | ✓ |
| 24 | `from_tenant_id` | 采购商租户ID | `from_tenant_id` | String | `text` |  | ✓ |
| 25 | `hide_in_head` | 是否隐藏:1.是,2.否 | `hide_in_head` | Boolean | `switch` |  | ✓ |
| 26 | `modified_time` | 修改时间 | `modified_time` | DateTime | `timestamp` |  | ✓ |
| 27 | `modifier` | 修改者 | `modifier` | String | `text` |  | ✓ |
| 28 | `pay_way_default` | 默认支付方式 | `pay_way_default` | String | `text` |  | ✓ |
| 29 | `pay_way_head` | 支付方式 | `pay_way_head` | String | `text` |  | ✓ |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 31 | `srcsearch_type` | 搜索数据源类型 | `srcsearch_type` | String | `text` |  | ✓ |
| 32 | `supply_doc_id` | 供应商档案ID | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 33 | `to_org_id` | 供应商组织ID | `to_org_id` | String | `text` |  | ✓ |
| 34 | `to_tenant_id` | 供应商租户ID | `to_tenant_id` | String | `text` |  | ✓ |
| 35 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 36 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `supply_doc_id` | 供应商档案ID | `aa.vendor.Vendor` | `supply_doc_id` |  →  |  |  | Service |  |
| 3 | `from_org_id` | 采购组织ID | `org.func.BaseOrg` | `from_org_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `supply_doc_id` (供应商档案ID) | `aa.vendor.Vendor` | `supply_doc_id` |
| `from_org_id` (采购组织ID) | `org.func.BaseOrg` | `from_org_id` |
