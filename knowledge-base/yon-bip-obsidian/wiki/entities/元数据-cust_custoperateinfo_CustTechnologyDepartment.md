---
tags: [BIP, 元数据, 数据字典, cust.custoperateinfo.CustTechnologyDepartment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户部门 (`cust.custoperateinfo.CustTechnologyDepartment`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cust_technology_depart` | 应用: `CUST` | 类型: `Class`

## 属性（25 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 3 | `department` | department | `department` | String | `text` |
| 4 | `num` | num | `num` | Decimal | `number` |
| 5 | `parentDepart` | parentDepart | `parent_department` | String | `text` |
| 6 | `org` | org | `org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 7 | `saleArea` | saleArea | `salearea` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |
| 8 | `dept` | dept | `dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `quote` |
| 9 | `ower` | ower | `ower` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 10 | `customer` | customer | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 11 | `bustype` | bustype | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |
| 12 | `code` | 编码 | `code` | String | `text` |
| 13 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 15 | `creator` | 创建人 | `creator` | String | `text` |
| 16 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 17 | `custTechnologyDepartDefineCharacter` | custTechnologyDepartDefineCharacter | `cust_technology_depart_define_character` | cdf7d7ed-4586-4468-a1d0-84a274339c97 | `UserDefine` |
| 18 | `departmentHead` | departmentHead | `department_head` | c7b03b3a-5fdb-472e-8c7e-332cbf23d66e | `quote` |
| 19 | `modifier` | 修改人 | `modifier` | String | `text` |
| 20 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 21 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 23 | `parent` | parent | `iParentId` | b54fc393-1d66-4f6e-806b-c8a50b5e788b | `quote` |
| 24 | `path` | path | `path` | String | `text` |
| 25 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（12 个）

- `ower` -> `bd.staff.Staff` ()
- `parent` -> `cust.custoperateinfo.CustTechnologyDepartment` ()
- `org` -> `org.func.BaseOrg` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `departmentHead` -> `cust.contact.Contact` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `saleArea` -> `aa.salearea.SaleArea` ()
- `dept` -> `bd.adminOrg.DeptOrgVO` ()
- `custTechnologyDepartDefineCharacter` -> `cust.custoperateinfo.CustTechnologyDepartDefineCharacter` ()
- `bustype` -> `bd.bill.TransType` ()
- `customer` -> `aa.merchant.Merchant` ()
