---
tags: [BIP, 元数据, 数据字典, base.user.User]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 身份信息 (`base.user.User`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`user` | domain：`u8c-auth` | 应用：`GZTACT` | 业务对象ID：`e4dacd42-2b7c-4ab9-af56-06d8a5a94d8e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 身份信息 |
| 物理表 | `user` |
| domain/服务域 | `u8c-auth` |
| schema | `iuap_apcom_auth` |
| 所属应用 | `GZTACT` |
| 直连字段 | 64 个 |
| 子表 | 1 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `base.user.UserDefine` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `defaultorg` | `` |
| `yht_tenant_id` | `` |
| `ytenant_id` | `` |
| `json_str` | `` |
| `yht_user_id` | `` |
| `department_id` | `ucf-org-center.org_admin_dept_tree_ref` |
| `user_type` | `` |
| `tenant_id` | `` |
| `` | `` |

## 继承接口 (7个, 13字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **客户接口** (`aa.itf.ICust`)
  - `iCustID` → `iCustID`
- **客户接口** (`aa.itf.ICustAll`)
- **商家相关** (`base.itf.IShop`)
  - `iShopID` → `iShopID`
- **商家相关** (`base.itf.IShopAll`)

## 字段列表（按类型分组）

> 共 64 个直连字段

### 文本字段 (35个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 用户账号 |
| `name` | `name` | `name` | 用户名称 |
| `mobile` | `mobile` | `mobile` | 手机账号 |
| `email` | `email` | `email` | 邮箱账号 |
| `doc_ids` | `doc_ids` | `docId` | 档案ID |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `avatar` | `avatar` | `avatar` | 头像 |
| `nick_name` | `nick_name` | `nickName` | 昵称 |
| `gender` | `gender` | `gender` | 性别 |
| `password` | `password` | `password` | 密码 |
| `tel` | `tel` | `tel` | 座机 |
| `qq` | `qq` | `qq` | qq |
| `wechat` | `wechat` | `wechat` | 微信 |
| `position` | `position` | `position` | 职位 |
| `doc_ids` | `doc_ids` | `cust` | 客户ID |
| `status` | `status` | `status` | 账号状态 |
| `registersource` | `registersource` | `registersource` | 注册来源 |
| `openid` | `openid` | `openId` | 开通Id |
| `code` | `code` | `userCode` | 日志用编码 |
| `name` | `name` | `userName` | 日志用名称 |
| `res_code` | `res_code` | `rescode` | 应用编码 |
| `yxyuserid` | `yxyuserid` | `yxyUserId` | 应用关联用户guid |
| `erpcode` | `erpcode` | `erpcode` | ERP编码 |
| `ext1` | `ext1` | `ext1` | 扩展1 |
| `ext2` | `ext2` | `ext2` | 扩展2 |
| `ext3` | `ext3` | `ext3` | 扩展3 |
| `ext4` | `ext4` | `ext4` | 扩展4 |
| `ext5` | `ext5` | `ext5` | 扩展5 |
| `ext6` | `ext6` | `ext6` | 扩展6 |
| `ext7` | `ext7` | `ext7` | 扩展7 |
| `ext8` | `ext8` | `ext8` | 扩展8 |
| `ext9` | `ext9` | `ext9` | 扩展9 |
| `ext10` | `ext10` | `ext10` | 扩展10 |
| `salt` | `salt` | `salt` | 盐 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `defaultorg` | `defaultorg` | `defaultorg` | 所属组织 |
| `department_id` | `department_id` | `department` | 所属部门 |
| `yht_user_id` | `yht_user_id` | `yhtUserId` | 用户ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `json_str` | `json_str` | `hstaff` | 员工参照 |
| `yht_user_id` | `yht_user_id` | `staff` | 员工 |
| `yht_tenant_id` | `yht_tenant_id` | `yhtTenantId` | 商家 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `user_type` | `user_type` | `userManageType` | 身份类型 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `birthday` | `birthday` | `birthday` | 出生日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isOpenUdh` | `isOpenUdh` | `isOpenUdh` | 是否开通订货 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_type` | `user_type` | `userType` | 身份类型 |

### 长整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deleted` | `deleted` | `deleted` | 删除状态 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `id` | `id` | `id` | ID |
| `foreign_id` | `foreign_id` | `foreignId` | 用户雪花ID |
| `mobilepreno` | `mobilepreno` | `mobilepreno` | 国家地区 |
| `corpration_id` | `corpration_id` | `corpration` | 公司 |
| `doc_ids` | `doc_ids` | `customer` | 客户 |
| `doc_ids` | `doc_ids` | `shop` | 商家 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 操作员自定义项 |
