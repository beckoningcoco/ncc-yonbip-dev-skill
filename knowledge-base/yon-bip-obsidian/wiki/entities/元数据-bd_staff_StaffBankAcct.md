---
tags: [BIP, 元数据, 数据字典, bd.staff.StaffBankAcct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工银行账号 (`bd.staff.StaffBankAcct`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_staff_bankacct` | 应用: `DPMSTF` | 类型: `Class`

## 属性（31 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `accountname` | accountname | `accountname` | String | `text` |
| 2 | `bank` | bank | `bank` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 3 | `bankname` | bankname | `bankname` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 4 | `account` | account | `account` | String | `text` |
| 5 | `accttype` | accttype | `accttype` | String | `text` |
| 6 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 7 | `isdefault` | 是否default | `isdefault` | Integer | `int` |
| 8 | `memo` | 备注 | `memo` | String | `text` |
| 9 | `user_define_character` | user_define_character | `user_define_character` | a73e6aef-e60b-4468-a36f-6edc4cd88e80 | `UserDefine` |
| 10 | `enable` | enable | `enable` | Integer | `int` |
| 11 | `recordnum` | recordnum | `recordnum` | Integer | `int` |
| 12 | `id` | ID | `id` | String | `text` |
| 13 | `staff_id` | staff_id | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 14 | `objid` | objid | `objid` | String | `text` |
| 15 | `sysid` | sysid | `sysid` | String | `text` |
| 16 | `businessid` | businessid | `businessid` | String | `text` |
| 17 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 18 | `bu_id` | bu_id | `bu_id` | String | `text` |
| 19 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 20 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 21 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 22 | `lastflag` | lastflag | `modifier` | String | `text` |
| 23 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 24 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 25 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 26 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 28 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 29 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 30 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` |
| 31 | `bankacctdefines` | bankacctdefines | `` | 575152b7-5e14-4612-b779-44b6c3045d2a | `` |

## 关联（10 个）

- `user_define_character` -> `bd.staff.StaffBankAcctDefineCharacter` ()
- `bank` -> `bd.bank.BankVO` ()
- `creator` -> `base.user.BipUser` ()
- `bankacctdefines` -> `bd.staff.StaffBankAcctDefine` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `staff_id` -> `bd.staff.Staff` (0..n)
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `bankname` -> `bd.bank.BankDotVO` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
