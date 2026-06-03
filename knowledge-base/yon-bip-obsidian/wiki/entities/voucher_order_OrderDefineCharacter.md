---
tags: [BIP, metadata, voucher, OrderDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售订单自定义项特征实体 (voucher.order.OrderDefineCharacter)

> Platform: BIP V5 | Module: voucher | Table: orders_character_define | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 销售订单自定义项特征实体 |
| uri | voucher.order.OrderDefineCharacter |
| tableName | orders_character_define |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | voucher.order.OrderDefineCharacterBase |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (47)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | A001 | 连锁系统（测试） | vcol8 | quote | AT1F7B78623F300025.AT1F7B78623F300025.L0001 |  |  |  |
| 2 | A002 | 连锁系统分类 | vcol9 | quote | AT1F7B78623F300025.AT1F7B78623F300025.L0001 |  |  |  |
| 3 | A0099 | 客户分类测试 | vcol10 | quote | AT1F7B78623F300025.AT1F7B78623F300025.L0001 |  |  |  |
| 4 | B2Bzzcd | B2B按组织拆单 | vcol20 | quote | bd.bill.TransType |  |  |  |
| 5 | DM00001 | 自定义业财分析维度-渠道 | DM00001 | referenceList | bd.customerdoc_DM0000.DM0000 |  |  |  |
| 6 | Debitkh | Debit客户 | lcol3 | quote | aa.merchant.Merchant |  |  |  |
| 7 | FJCS | 附件传递测试 | vcol53 | attachment | String |  |  |  |
| 8 | HZW005 | 黄志威最终客户 | lcol1 | quote | aa.merchant.Merchant |  |  |  |
| 9 | L0001 | 连锁系统分类1 | vcol11 | quote | AT1F7B78623F300025.AT1F7B78623F300025.A000022 |  |  |  |
| 10 | LT8221_01 | LT8221特征1 | vcol13 | quote | bd.customerdoc_LT8221_01.LT8221_01 |  |  |  |
| 11 | LT8221_02 | LT8221特征2 | vcol14 | singleOption | unitfyEnum.GZTSYS.LT8221_02 |  |  |  |
| 12 | LUJIN001 | 大文本1 | vcol47 | text | String |  |  |  |
| 13 | LUJIN002 | 大文本2 | vcol50 | text | String |  |  |  |
| 14 | LUJIN003 | 大文本3 | vcol49 | text | String |  |  |  |
| 15 | LUJIN004 | 大文本4 | vcol46 | text | String |  |  |  |
| 16 | LUJIN005 | 大文本5 | vcol48 | text | String |  |  |  |
| 17 | ND001 | 南斗特征产地 | vcol16 | text | String |  |  |  |
| 18 | ND002 | 南斗特征区域 | vcol17 | quote | AT1EAFDFE83EF80003.AT1EAFDFE83EF80003.i92076_xs01 |  |  |  |
| 19 | SO001 | 销售地址 | lcol2 | quote | aa.merchant.AddressInfo |  |  |  |
| 20 | SZ001 | 资金池所属部门 | SZ001 | referenceList | bd.customerdoc_SZ001.SZ001 |  |  |  |
| 21 | TTL0001 | 业务板块 | vcol19 | quote | bd.customerdoc_TTL001.TTL001 |  |  |  |
| 22 | WJY | WJY | vcol45 | text | String |  |  |  |
| 23 | WSSTZ | 吴姗姗特征字段 | lcol4 | quote | voucher.order.OrderDetail |  |  | uiHide |
| 24 | XSDDLX | 销售订单类型(必输) | vcol18 | quote | bd.customerdoc_00XSDDLS.00XSDDLS |  |  |  |
| 25 | YWXSHTH01 | 销售合同号 | vcol54 | text | String |  |  |  |
| 26 | YWY | 业务员(多选) | YWY | referenceList | bd.staff.StaffNew |  |  | data_auth |
| 27 | ZC001 | 船号 | vcol4 | text | String |  |  |  |
| 28 | ZJCDX | 所属资金池部门（单选） | vcol21 | quote | bd.customerdoc_SZ001.SZ001 |  |  |  |
| 29 | ceshitz | 测试特征1111 | ceshitz | referenceList | bd.customerdoc_ceshixb.ceshixb |  |  |  |
| 30 | ckrlch251125001 | 订单出库人 | vcol22 | quote | base.user.BipUser |  |  |  |
| 31 | dingdanckd | 订单出库单号 | vcol52 | text | String |  |  |  |
| 32 | gwq11111 | gwqMRP专用特征 | vcol55 | text | String |  |  |  |
| 33 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 34 | jjk | 销售渠道客户 | jjk | referenceList | aa.merchant.Merchant |  |  |  |
| 35 | jylx_memo | 交易类型备注 | vcol2 | text | String |  |  |  |
| 36 | ld001_ys | 运输方式 | vcol7 | quote | bd.customerdoc_ld003.ld003 |  |  |  |
| 37 | ld004_ys | 到货地点 | vcol6 | text | String |  |  |  |
| 38 | lzxqfl001 | 绿洲需求分类 | vcol5 | quote | bd.customerdoc_XQFL.XQFL |  |  |  |
| 39 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 40 | qy085 | 区域 | vcol1 | quote | bd.customerdoc_0101.0101 |  |  |  |
| 41 | sfjtjd_C | 是否集团订单 | vcol51 | singleOption | unitfyEnum.BMMMM.sfjtjd_C |  |  |  |
| 42 | tengzheng1 | 采购必填1 | vcol23 | quote | bd.customerdoc_0000001.0000001 |  |  |  |
| 43 | wererwe234 | 膜等级 | vcol15 | text | String |  |  |  |
| 44 | xsqd | 销售渠道 | vcol3 | text | String |  |  |  |
| 45 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 46 | zwtest001 | 张雯特征演示_体检项目 | vcol12 | quote | bd.customerdoc_Z_01_01.Z_01_01 |  |  |  |
| 47 | zzyh | 最终用户 | zzyh | referenceList | aa.merchant.Merchant |  |  |  |

---

## Reference Fields (21)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | A001 | 连锁系统（测试） | vcol8 | AT1F7B78623F300025.AT1F7B78623F300025.L0001 |
| 2 | A002 | 连锁系统分类 | vcol9 | AT1F7B78623F300025.AT1F7B78623F300025.L0001 |
| 3 | A0099 | 客户分类测试 | vcol10 | AT1F7B78623F300025.AT1F7B78623F300025.L0001 |
| 4 | B2Bzzcd | B2B按组织拆单 | vcol20 | bd.bill.TransType |
| 5 | Debitkh | Debit客户 | lcol3 | aa.merchant.Merchant |
| 6 | HZW005 | 黄志威最终客户 | lcol1 | aa.merchant.Merchant |
| 7 | L0001 | 连锁系统分类1 | vcol11 | AT1F7B78623F300025.AT1F7B78623F300025.A000022 |
| 8 | LT8221_01 | LT8221特征1 | vcol13 | bd.customerdoc_LT8221_01.LT8221_01 |
| 9 | ND002 | 南斗特征区域 | vcol17 | AT1EAFDFE83EF80003.AT1EAFDFE83EF80003.i92076_xs01 |
| 10 | SO001 | 销售地址 | lcol2 | aa.merchant.AddressInfo |
| 11 | TTL0001 | 业务板块 | vcol19 | bd.customerdoc_TTL001.TTL001 |
| 12 | WSSTZ | 吴姗姗特征字段 | lcol4 | voucher.order.OrderDetail |
| 13 | XSDDLX | 销售订单类型(必输) | vcol18 | bd.customerdoc_00XSDDLS.00XSDDLS |
| 14 | ZJCDX | 所属资金池部门（单选） | vcol21 | bd.customerdoc_SZ001.SZ001 |
| 15 | ckrlch251125001 | 订单出库人 | vcol22 | base.user.BipUser |
| 16 | ld001_ys | 运输方式 | vcol7 | bd.customerdoc_ld003.ld003 |
| 17 | lzxqfl001 | 绿洲需求分类 | vcol5 | bd.customerdoc_XQFL.XQFL |
| 18 | qy085 | 区域 | vcol1 | bd.customerdoc_0101.0101 |
| 19 | tengzheng1 | 采购必填1 | vcol23 | bd.customerdoc_0000001.0000001 |
| 20 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 21 | zwtest001 | 张雯特征演示_体检项目 | vcol12 | bd.customerdoc_Z_01_01.Z_01_01 |

---

## Enum Fields (2)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | LT8221_02 | LT8221特征2 | vcol14 | LT8221_02 |
| 2 | sfjtjd_C | 是否集团订单 | vcol51 | sfjtjd_C |

---

## Enum Value Details

### LT8221特征2 (LT8221_02) -> vcol14
> Enum: unitfyEnum.GZTSYS.LT8221_02

| code | value | name |
|------|-------|------|
| 01 | 01 | 深黑 |
| 02 | 02 | 蓝黑 |
| 03 | 03 | 灰黑 |

### 是否集团订单 (sfjtjd_C) -> vcol51
> Enum: unitfyEnum.BMMMM.sfjtjd_C

| code | value | name |
|------|-------|------|
| 0 | 0 | 否 |
| 1 | 1 | 是 |
