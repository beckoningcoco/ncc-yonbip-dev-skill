---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.cms.Contact"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 客户联系人 (`pes.cms.Contact`)

> IMP_PES | 物理表：`cust_contacts`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户联系人 |
| 物理表 | `cust_contacts` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:24.4720` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `ID` | String | ID |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `customerId` | 客户id | `Customer_ID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 2 | `orgId` | 组织id | `Org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 3 | `name` | 姓名 | `Name` | String |
| 4 | `ymsencPhone` | 联系电话 | `ymsenc_Phone` | String |
| 5 | `departmentId` | 部门 | `Department_ID` | String |
| 6 | `departmentName` | 部门 | `Department_Name` | String |
| 7 | `post` | 职位 | `Post` | String |
| 8 | `QQ` | QQ | `QQ` | String |
| 9 | `email` | 邮箱 | `Email` | String |
| 10 | `remarks` | 描述 | `Remarks` | String |
| 11 | `registerDate` | 注册日期 | `Register_Date` | String |
| 12 | `modifierName` | 操作员 | `modifier_name` | String |
| 13 | `personStatus` | 状态 | `Person_Status` | String |
| 14 | `setDefault` | 设置默认 | `set_default` | Short |
| 15 | `createUser` | 创建者 | `create_user` | String |
| 16 | `createTimeStr` | 创建时间 | `create_time` | String |
| 17 | `modifierId` | 操作人id | `modifier_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 18 | `lastModifyUser` | 操作员 | `last_modify_user` | String |
| 19 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 20 | `code` | 编码 | `Code` | String |
| 21 | `phone` | 电话号码 | `Phone` | String |
| 22 | `wechat` | 微信 | `We_chat` | String |
| 23 | `companyName` | 公司名称 | `Company_Name` | String |
| 24 | `equipmentNumber` | 设备序列号 | `Equipment_Number` | String |
| 25 | `lastlogintime` | 最近登录日期 | `lastlogintime` | DateTime |
| 26 | `id` | ID | `ID` | String |
| 27 | `dr` | 逻辑删除 | `dr` | Integer |
| 28 | `tenant` | 租户ID | `tenant_id` | String |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `customerId` | 客户id | `aa.merchant.Merchant` | Service |  |
| 3 | `modifierId` | 操作人id | `bd.staff.Staff` | Service |  |
| 4 | `orgId` | 组织id | `org.func.BaseOrg` | Service |  |
