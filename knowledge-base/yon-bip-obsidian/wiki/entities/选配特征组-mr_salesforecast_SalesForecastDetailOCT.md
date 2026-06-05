---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.salesforecast.SalesForecastDetailOCT"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 选配特征组 (`mr.salesforecast.SalesForecastDetailOCT`)

> MR | 物理表：`mr_sales_forecast_detail_oct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 选配特征组 |
| 物理表 | `mr_sales_forecast_detail_oct` |
| 数据库 schema | `requirementsplanning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:18:16.4740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（58个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `BT001` | 指定酒店 | `vcol1` | 84627554-e8bc-4478-9d19-977740142320 |
| 2 | `CJYHHL` | CJ氧化含量 | `ncol1` | Decimal |
| 3 | `DYDJ` | 电压等级 | `vcol21` | ab0bede2-ca43-4035-b585-eb5d217dae72 |
| 4 | `FK001` | 报销类型 | `vcol2` | ffea7636-0747-408b-9a03-1150609532f1 |
| 5 | `FK013` | 餐费标准 | `vcol3` | 8a7e5ce1-8289-421e-b4bb-eb59cd7249f2 |
| 6 | `FZ_SZ` | 服装尺码 | `vcol18` | 0817ed47-bfad-4a24-a634-4e75e01c03cf |
| 7 | `KS001` | 面料颜色_主色面料 | `vcol22` | 11901331-c73e-4199-97b7-7e7a5fee40a8 |
| 8 | `KS002` | 面料颜色_配色面料 | `vcol23` | 03d475a1-b1c8-470c-9d94-1bb231efb64a |
| 9 | `KS003` | 沙发脚款式 | `lcol1` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 10 | `KS03` | 无扶双 | `bcol50` | Boolean |
| 11 | `KS05` | 左扶双 | `bcol49` | Boolean |
| 12 | `KS06` | 右扶双 | `bcol48` | Boolean |
| 13 | `KS07` | 左贵妃 | `bcol47` | Boolean |
| 14 | `KS08` | 右贵妃 | `bcol46` | Boolean |
| 15 | `KS09` | 无扶单 | `bcol45` | Boolean |
| 16 | `KS10` | 左扶单 | `bcol44` | Boolean |
| 17 | `KS11` | 右扶单 | `bcol43` | Boolean |
| 18 | `KS12` | 双扶单 | `bcol42` | Boolean |
| 19 | `KS201` | 无扶单数量 | `lcol50` | Long |
| 20 | `KS202` | 无扶双数量 | `lcol49` | Long |
| 21 | `KS203` | 双扶单数量 | `lcol48` | Long |
| 22 | `KS204` | 右贵妃数量 | `lcol47` | Long |
| 23 | `KS205` | 左扶双数量 | `lcol46` | Long |
| 24 | `KS206` | 右扶双数量 | `lcol45` | Long |
| 25 | `KS207` | 左贵妃数量 | `lcol44` | Long |
| 26 | `KS208` | 右扶单数量 | `lcol43` | Long |
| 27 | `KS209` | 左扶单数量 | `lcol42` | Long |
| 28 | `LT8221_001` | 车型 | `vcol6` | 42c6abed-96d9-464a-b12e-30c94740d7d8 |
| 29 | `LT8221_002` | 包装 | `vcol7` | dafde104-23c0-4ac2-bd8a-f61e9ac8cad7 |
| 30 | `LT8221_003` | 配置 | `vcol8` | 10249430-3fac-4bd0-9f5b-c3ab550dc1fc |
| 31 | `LT8221_004` | 转向 | `vcol9` | eec41338-80a2-4997-ad5f-f8b0afb29ec5 |
| 32 | `LT8221_005` | 轮胎 | `vcol10` | 6ea5aa99-f554-4583-af22-39fada456de5 |
| 33 | `LT8221_006` | 减震 | `vcol11` | 15082790-25c9-4946-89a0-2b126b218e89 |
| 34 | `LT8221_007` | 尾翼 | `vcol16` | 5c7e9209-a738-4958-a7ac-8900f86648c6 |
| 35 | `LT8221_009` | 车壳材质 | `vcol12` | 5de0c4ea-6bd2-46fa-b71d-dda90d479bf0 |
| 36 | `LT8221_01` | LT8221特征1 | `vcol4` | 458c7bc9-18f2-46a3-9942-59e918b4a114 |
| 37 | `LT8221_010` | 车壳颜色 | `vcol13` | 7fb43099-e067-4f65-9642-932a906ea7d0 |
| 38 | `LT8221_011` | 车窗配色 | `vcol14` | 453edc73-a5bb-4ed7-981b-c5166b8916f9 |
| 39 | `LT8221_012` | 内饰颜色 | `vcol15` | 2f5fc7bd-acf3-4ad4-ab4a-b4c172283dee |
| 40 | `LT8221_05` | LT8221特征5 | `vcol5` | 6b7c9b4f-e3e0-4ae0-bb48-b3746d3089a6 |
| 41 | `M001` | tyr门产品系列 | `vcol25` | db14d82c-2c14-4e0e-ad4e-01b066d12d12 |
| 42 | `M002` | tyr门内填充物 | `vcol26` | 85043a87-19ed-4312-b704-1561363231e8 |
| 43 | `M003` | 门框的材质 | `vcol27` | 0eb0d3e7-e776-48be-abb9-d5dc22212288 |
| 44 | `M004` | 门玻璃材质 | `vcol28` | d8fdf38d-50d4-4506-b7d6-c0d9f83ecfe0 |
| 45 | `M005` | 门宽 | `ncol47` | Decimal |
| 46 | `M006` | 门高 | `ncol46` | Decimal |
| 47 | `SG01` | 书柜层数 | `ncol50` | Decimal |
| 48 | `SG02` | 书柜材质 | `vcol24` | 92a9ff0a-b270-487d-9ff1-d2b2099e6d7f |
| 49 | `SG03` | 有无轮子 | `bcol41` | Boolean |
| 50 | `SG04` | 书柜宽度 | `ncol49` | Decimal |
| 51 | `SG05` | 书柜长度 | `ncol48` | Decimal |
| 52 | `TZ_001` | 外观颜色 | `vcol20` | 1425ea9c-ebd3-4cce-9da7-e0f16ab8d5fe |
| 53 | `id` | ID | `id` | String |
| 54 | `pubts` | 时间戳 | `pubts` | DateTime |
| 55 | `sz` | 四组 | `vcol19` | c7c49ab8-8e41-49bc-9a1e-895f1be973bd |
| 56 | `sz04` | 四组布尔 | `bcol1` | Boolean |
| 57 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 58 | `zxftz01` | zxf颜色 | `vcol17` | 0091e929-53f6-4f63-b14c-1d0f36a6bd17 |

---

## 关联属性（30个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `LT8221_01` | LT8221特征1 | `bd.customerdoc_LT8221_01.LT8221_01` | Service |  |
| 2 | `KS003` | 沙发脚款式 | `pc.product.Product` | Service |  |
| 3 | `KS002` | 面料颜色_配色面料 | `bd.customerdoc_KS002.KS002` | Service |  |
| 4 | `KS001` | 面料颜色_主色面料 | `bd.customerdoc_KS001.KS001` | Service |  |
| 5 | `TZ_001` | 外观颜色 | `bd.customerdoc_CEE_001.CEE_001` | Service |  |
| 6 | `FK013` | 餐费标准 | `bd.customerdoc_FK005.FK005` | Service |  |
| 7 | `LT8221_006` | 减震 | `bd.customerdoc_LT8221_006.LT8221_006` | Service |  |
| 8 | `LT8221_007` | 尾翼 | `bd.customerdoc_LT8221_007.LT8221_007` | Service |  |
| 9 | `BT001` | 指定酒店 | `bd.customerdoc_BBB05_yql.BBB05_yql` | Service |  |
| 10 | `LT8221_009` | 车壳材质 | `bd.customerdoc_LT8221_009.LT8221_009` | Service |  |
| 11 | `LT8221_002` | 包装 | `bd.customerdoc_LT8221_002.LT8221_002` | Service |  |
| 12 | `LT8221_003` | 配置 | `bd.customerdoc_LT8221_003.LT8221_003` | Service |  |
| 13 | `LT8221_004` | 转向 | `bd.customerdoc_LT8221_004.LT8221_004` | Service |  |
| 14 | `LT8221_005` | 轮胎 | `bd.customerdoc_LT8221_005.LT8221_005` | Service |  |
| 15 | `LT8221_001` | 车型 | `bd.customerdoc_LT8221_001.LT8221_001` | Service |  |
| 16 | `M004` | 门玻璃材质 | `bd.customerdoc_M004.M004` | Service |  |
| 17 | `M003` | 门框的材质 | `bd.customerdoc_M003.M003` | Service |  |
| 18 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 19 | `M002` | tyr门内填充物 | `bd.customerdoc_M002.M002` | Service |  |
| 20 | `M001` | tyr门产品系列 | `bd.customerdoc_M001.M001` | Service |  |
| 21 | `sz` | 四组 | `bd.customerdoc_sz.sz` | Service |  |
| 22 | `SG02` | 书柜材质 | `bd.customerdoc_SG01.SG01` | Service |  |
| 23 | `FK001` | 报销类型 | `bd.customerdoc_FK001_yql.FK001_yql` | Service |  |
| 24 | `FZ_SZ` | 服装尺码 | `bd.customerdoc_FZ_SZ.FZ_SZ` | Service |  |
| 25 | `LT8221_05` | LT8221特征5 | `bd.customerdoc_LT8221_02.LT8221_02` | Service |  |
| 26 | `DYDJ` | 电压等级 | `bd.customerdoc_DYDJ.DYDJ` | Service |  |
| 27 | `LT8221_010` | 车壳颜色 | `bd.customerdoc_LT8221_010.LT8221_010` | Service |  |
| 28 | `LT8221_011` | 车窗配色 | `bd.customerdoc_LT8221_011.LT8221_011` | Service |  |
| 29 | `zxftz01` | zxf颜色 | `bd.customerdoc_zxfys.zxfys` | Service |  |
| 30 | `LT8221_012` | 内饰颜色 | `bd.customerdoc_LT8221_012.LT8221_012` | Service |  |
