---
tags: [BIP, 元数据, 数据字典, fa.famain.FixedAssetsInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产卡片 (`fa.famain.FixedAssetsInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_asset` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`f54930fa-f5c7-4f3a-9e76-823c78ba4871`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产卡片 |
| 物理表 | `fa_asset` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 51 个 |
| 关联引用 | 26 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `leases` | `fa.famain.FixedAssetLease` | composition |
| `costrecords` | `fa.famain.CostRecords` | composition |
| `assignments` | `fa.famain.FixedAssetAssignment` | composition |
| `sources` | `fa.famain.FixedAssetSource` | composition |
| `devices` | `fa.famain.Accessorydevice` | composition |
| `bodies` | `fa.famain.CalculateInfo` | composition |

## 关联引用 (26个)

| 字段名 | 引用类型 |
|--------|---------|
| `mgt_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `asset_sub_cat_id` | `yonbip-fi-efa.fa_subcategoryref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `place_id` | `ucf-amc-ambd.ampub_location_ref` |
| `vendor_id` | `yssupplier.aa_vendor` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `add_way_id` | `yonbip-fi-efa.at_addwayref` |
| `tag_print_latest_user` | `bip-usercenter.bip_user_ref` |
| `unit_id` | `productcenter.pc_unitref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `custodian_id` | `iuap-ptc-yoncmm.sattUuser` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `user_id` | `iuap-ptc-yoncmm.sattUuser` |
| `mgt_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `usage_state_id` | `yonbip-fi-efa.fa_usagestateref` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorytree_ref` |
| `impairment_unit_id` | `yonbip-fi-efa.fa_impairmentunit_ref` |
| `ori_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `mgt_cost_center_id` | `finbd.bd_costcenterref` |

## 继承接口 (2个, 2字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`

## 字段列表（按类型分组）

> 共 51 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `tag_rfid` | `tag_rfid` | String | 射频电子标签RFID |
| `tag_rule` | `tag_rule` | String | 标签条码规则 |
| `begin_date` | `begin_date` | String | 固定资产开始使用日期 |
| `code` | `code` | String | 编码 |
| `id` | `id` | String | 主键 |
| `src_bill_no_combine` | `src_bill_no_combine` | String | 来源单据号 |
| `src_create_type` | `src_create_type` | String | 来源建卡方式 |
| `src_project_id_combine` | `src_project_id_combine` | String | 来源项目 |
| `tag_no` | `tag_no` | String | 标签号 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `tag_print_latest_user` | `tag_print_latest_user` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 标签上次打印人 |
| `accentity_id` | `accentity_id` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | 会计主体 |
| `add_way_id` | `add_way_id` | 90b23222-89e6-49ad-8107-be12c999ca3d | 固定资产增加方式 |
| `asset_category_id` | `asset_category_id` | e3a3baa9-5255-43e2-8378-505c497511fc | 固定资产类别 |
| `asset_sub_cat_id` | `asset_sub_cat_id` | f66d1948-cc5f-49e2-9cc2-731adf89792f | 固定资产子类别 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `custodian_id` | `custodian_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | 保管人 |
| `impairment_unit_id` | `impairment_unit_id` | 1b6e5282-2c87-4941-82bc-6a333b9a7cab | 减值单元 |
| `mgt_cost_center_id` | `mgt_cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | 管理成本中心 |
| `mgt_dept_id` | `mgt_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | 管理部门 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ori_currtype_id` | `ori_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 原币币种 |
| `place_id` | `place_id` | 169a916d-6125-4f85-b67a-ba82a4cb6008 | 位置 |
| `mgt_profit_center_id` | `mgt_profit_center_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | 管理利润中心 |
| `unit_id` | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 计量单位 |
| `usage_state_id` | `usage_state_id` | 01a5dc9d-3f44-4543-a7fa-c7046979f819 | 固定资产使用状态 |
| `user_id` | `user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | 使用人 |
| `vendor_id` | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | 供应商 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `tag_print_latest_time` | `tag_print_latest_time` | Date | 标签上次打印时间 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bln_lease` | `bln_lease` | Boolean | 使用权资产 |
| `bln_pre_add` | `bln_pre_add` | Boolean | 是否预建 |
| `bln_tax_accelerated_depr` | `bln_tax_accelerated_depr` | Boolean | 税收加速折旧标识 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `mortgage_status` | `mortgage_status` | efa_mortgageStatus | 抵押状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `tag_print_count` | `tag_print_count` | Integer | 标签已打印次数 |
| `quantity` | `quantity` | Integer | 数量 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `ori_currtype_ori_amount` | `ori_currtype_ori_amount` | Decimal | 原币原值 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `free_ch_id` | `free_ch_id` | c7ea5aff-139c-4945-9043-6933591c9e53 | 自定义项 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `asset_model` | `asset_model` | String | 固定资产型号 |
| `location` | `location` | String | 固定资产存放地点 |
| `name` | `name` | String | 名称 |
| `specification` | `specification` | String | 固定资产规格 |

### other (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 93b72b41-bf56-4bd1-8282-cff8ecf45bea | 核算信息 |
| `` | `` | 42209628-1170-4230-9c91-2cfc65d78d50 | 来源信息 |
| `` | `` | 4e795235-579c-4f95-878d-e10d84b1f365 | 分配信息 |
| `` | `` | 4ad001cf-9547-4f02-a410-437555b3c76e | 卡片租赁信息 |
| `` | `` | f561d2ac-5744-4f98-87f8-41e1ca2ec2b2 | 费用记录 |
| `` | `` | 9ebe97c0-c1b5-41ad-89d3-112a5b719dde | 附属设备 |
