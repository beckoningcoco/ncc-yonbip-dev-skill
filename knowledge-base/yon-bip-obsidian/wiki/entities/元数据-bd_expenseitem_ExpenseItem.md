---
tags: [BIP, 元数据, 数据字典, bd.expenseitem.ExpenseItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 费用项目 (`bd.expenseitem.ExpenseItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_expenseitem` | domain：`finbd` | 应用：`DPMACCT` | 业务对象ID：`3cb3e7be-94fc-4d99-9bad-e3079a9823c3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 费用项目 |
| 物理表 | `bd_expenseitem` |
| 数据库 schema | `finbd` |
| 所属应用 | `DPMACCT` |
| 直连字段 | 47 个 |
| 子表 | 2 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `applyranges` | `bd.expenseitem.ExpenseItemApplyRange` | composition |
| `products` | `bd.expenseitem.ExpenseItemProduct` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `assetproduct` | `productcenter.pc_productquerytreeref` |
| `parent` | `finbd.bd_expenseitemref` |
| `product` | `productcenter.pc_productquerytreeref` |
| `ytenant_id` | `` |
| `` | `` |
| `accentity` | `ucf-org-center.org_pure_tree_ref` |
| `expenseitem_character` | `` |
| `productsku` | `` |
| `expenseitemtype` | `finbd.bd_expenseitemtypelist` |
| `tenant_id` | `` |

## 继承接口 (6个, 19字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 47 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `assetmanage` | `assetmanage` | `assetmanage` | 资产租出/租入 |
| `picture` | `picture` | `picture` | 图标 |
| `obj_id` | `obj_id` | `objid` | 友企连id |
| `path` | `path` | `path` | 路径 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `del_log` | `del_log` | `delLog` | 删除提示信息 |
| `mnemoniccode` | `mnemoniccode` | `mnemoniccode` | 助记码 |
| `task_id` | `task_id` | `taskId` | 任务id(引用校验检查) |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assetproduct` | `assetproduct` | `assetproduct` | 资产物料 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `parent` | `parent` | `parent` | 上级费用项目 |
| `accentity` | `accentity` | `accentity` | 业务单元id |
| `expenseitemtype` | `expenseitemtype` | `expenseitemtype` | 费用项目类型id |
| `product` | `product` | `product` | 物料Id |
| `productsku` | `productsku` | `productsku` | 产品SKUid |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assetbusiness` | `assetbusiness` | `assetbusiness` | 资产业务 |
| `costcontrolbusiness` | `costcontrolbusiness` | `costcontrolbusiness` | 费控业务 |
| `invoice` | `invoice` | `invoice` | 是否开票 |
| `marketbusiness` | `marketbusiness` | `marketbusiness` | 营销业务 |
| `propertybusiness` | `propertybusiness` | `propertybusiness` | 财资业务 |
| `shared` | `shared` | `shared` | 是否分摊 |
| `supplychainbusiness` | `supplychainbusiness` | `supplychainbusiness` | 供应链业务 |
| `` | `isEnd` | `isEnd` | 是否末级 |
| `taxDeductible` | `taxDeductible` | `taxDeductible` | 是否抵税 |
| `updateCost` | `updateCost` | `updateCost` | 更新成本 |
| `enabled` | `enabled` | `enabled` | 状态 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `del_status` | `del_status` | `delStatus` | 删除操作状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sort` | `sort` | `sort` | 排序号 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `desc` | `desc` | `desc` | 备注 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expenseitem_character` | `expenseitem_character` | `character` | 费用项目特征属性 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `applyranges` | 适用范围 |
| `` | `` | `products` | 物料维护 |
