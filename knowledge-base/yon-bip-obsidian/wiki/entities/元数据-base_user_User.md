---
tags: [BIP, 元数据, 数据字典, base, base.user.User]
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

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `user` | 应用: `GZTACT` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 身份信息 |
| 物理表 | `user` |
| 应用 | `GZTACT` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-01-23 23:10:38:000
- 安装来源: `/app/auth/iuap-auth-bootstrap/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap_apcom_auth/0010_iuap_common/DML/0270_iuap_metadata/202512151534_metadata_base-user_delta.zip`

## 术语标记

`bill_add`, `bill_query`, `data_auth`, `doc`, `isMain`, `MasterData`

## 依赖接口（7 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| ICust (`ICust`) | `aa.itf.ICust` | 52 | 1 |
| ICustAll (`ICustAll`) | `aa.itf.ICustAll` | 22 | 0 |
| IShop (`IShop`) | `base.itf.IShop` | 65 | 1 |
| IShopAll (`IShopAll`) | `base.itf.IShopAll` | 32 | 0 |

---

## 全部属性（64 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `defaultorg` | efaultorg(日期) | `defaultorg` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 2 | `department` | epartment(日期) | `department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 3 | `yhtUserId` | yhtUserId | `yht_user_id` | 3991fd81-191b-4fb2-bd23-f484e057e116 | `quote` |  | true |
| 4 | `code` | 编码 | `code` | String | `text` |  | true |
| 5 | `name` | 名称 | `name` | String | `text` |  | true |
| 6 | `mobile` | 手机号 | `mobile` | String | `text` |  | true |
| 7 | `email` | 邮箱 | `email` | String | `text` |  | true |
| 8 | `userType` | 用户类型 | `user_type` | Short | `short` |  | true |
| 9 | `docId` | docId | `doc_ids` | String | `text` |  | true |
| 10 | `stopstatus` | stopstatus | `stopstatus` | Integer | `int` |  | true |
| 11 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 12 | `deleted` | eleted(日期) | `deleted` | Long | `long` |  | true |
| 13 | `creatorId` | 创建人ID | `creatorId` | Long | `long` |  | true |
| 14 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 16 | `modifierId` | 修改人ID | `modifierId` | Long | `long` |  | true |
| 17 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 19 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 21 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 22 | `foreignId` | foreignId | `foreign_id` | Long | `long` |  | true |
| 23 | `mobilepreno` | mobilepreno | `mobilepreno` | Long | `long` |  | true |
| 24 | `avatar` | 头像 | `avatar` | String | `text` |  | true |
| 25 | `nickName` | 昵称 | `nick_name` | String | `text` |  | true |
| 26 | `gender` | 性别 | `gender` | String | `text` |  | true |
| 27 | `birthday` | birthday | `birthday` | Date | `date` |  | true |
| 28 | `password` | 密码 | `password` | String | `text` |  | true |
| 29 | `tel` | tel | `tel` | String | `text` |  | true |
| 30 | `qq` | qq | `qq` | String | `text` |  | true |
| 31 | `wechat` | wechat | `wechat` | String | `text` |  | true |
| 32 | `corpration` | orpration | `corpration_id` | Long | `long` |  | true |
| 33 | `position` | position | `position` | String | `text` |  | true |
| 34 | `cust` | ust | `doc_ids` | String | `text` |  | true |
| 35 | `customer` | ustomer | `doc_ids` | Long | `long` |  | true |
| 36 | `hstaff` | hstaff | `json_str` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 37 | `staff` | staff | `yht_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 38 | `yhtTenantId` | yhtTenantId | `yht_tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |
| 39 | `shop` | shop | `doc_ids` | Long | `long` |  | true |
| 40 | `isOpenUdh` | 是否OpenUdh | `isOpenUdh` | Boolean | `switch` |  | true |
| 41 | `status` | 状态 | `status` | String | `text` |  | true |
| 42 | `registersource` | registersource | `registersource` | String | `text` |  | true |
| 43 | `openId` | openId | `openid` | String | `text` |  | true |
| 44 | `userCode` | 用户编码 | `code` | String | `text` |  | true |
| 45 | `userName` | 用户名 | `name` | String | `text` |  | true |
| 46 | `rescode` | rescode | `res_code` | String | `text` |  | true |
| 47 | `yxyUserId` | yxyUserId | `yxyuserid` | String | `text` |  | true |
| 48 | `erpcode` | erpcode | `erpcode` | String | `text` |  | true |
| 49 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 50 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 51 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 52 | `ext1` | ext1 | `ext1` | String | `text` |  | true |
| 53 | `ext2` | ext2 | `ext2` | String | `text` |  | true |
| 54 | `ext3` | ext3 | `ext3` | String | `text` |  | true |
| 55 | `ext4` | ext4 | `ext4` | String | `text` |  | true |
| 56 | `ext5` | ext5 | `ext5` | String | `text` |  | true |
| 57 | `ext6` | ext6 | `ext6` | String | `text` |  | true |
| 58 | `ext7` | ext7 | `ext7` | String | `text` |  | true |
| 59 | `ext8` | ext8 | `ext8` | String | `text` |  | true |
| 60 | `ext9` | ext9 | `ext9` | String | `text` |  | true |
| 61 | `ext10` | ext10 | `ext10` | String | `text` |  | true |
| 62 | `defines` | efines(日期) | `` | 0cf7b751-2ebb-47f4-9115-f38deae09b29 | `` |  |  |
| 63 | `userManageType` | userManageType(类型) | `user_type` | f94d0a86-10db-46a6-b5f5-f8d5bf7634c0 | `quote` |  | true |
| 64 | `salt` | salt | `salt` | String | `text` |  | true |

## 关联属性（10 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `defaultorg` | efaultorg(日期) | `org.func.BaseOrg` | `defaultorg` | 外键 |  |  | Service |  |
| 2 | `yhtTenantId` | yhtTenantId | `yht.tenant.YhtTenant` | `yht_tenant_id` | 外键 |  |  | Service |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 4 | `hstaff` | hstaff | `bd.staff.Staff` | `json_str` | 外键 |  |  | Service |  |
| 5 | `staff` | staff | `bd.staff.Staff` | `yht_user_id` | 外键 |  |  | Service |  |
| 6 | `department` | epartment(日期) | `bd.adminOrg.AdminOrgVO` | `department_id` | 外键 |  |  | Service |  |
| 7 | `userManageType` | userManageType(类型) | `usermanager.usertype.UserType` | `user_type` | 外键 |  |  | Service |  |
| 8 | `yhtUserId` | yhtUserId | `ucfbase.yht.PubUserTenant` | `yht_user_id` | 外键 |  |  | Service |  |
| 9 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |
| 10 | `defines` | efines(日期) | `base.user.UserDefine` | `` | defines → id | 1 | Y | None |  |

---

## SQL 示例

```sql
SELECT defaultorg, department_id, yht_user_id, code, name, mobile, email, user_type
FROM user
```