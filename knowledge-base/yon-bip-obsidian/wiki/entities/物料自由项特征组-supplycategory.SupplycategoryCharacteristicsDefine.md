---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.supplycategory.SupplycategoryCharacteristicsDefine"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 物料自由项特征组 (`cpubase.supplycategory.SupplycategoryCharacteristicsDefine`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_supplycategory_characteristicsdefine` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.supplycategory.SupplycategoryCharacteristicsDefine` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料自由项特征组 |
| 物理表 | `cpu_supplycategory_characteristicsdefine` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `df164346-388f-4bae-90d5-801be061326b` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:19:01.0350` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | String | ID |

## 部署信息

- **部署时间**: 2025-01-17 23:16:30:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202501132101_metadata_cpubase-supplycategory.zip`
- **安装人**: mongoTools
- **安装排名**: `ee59f0ee-c95f-4bf7-8dfc-09c9d3262ed3`

## 术语标记

`isAssigned`, `isExtend`, `MasterData`, `CG::ctxType::pc.product.Product`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 220 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `A1001` | 助剂340水分含量 | `ncol50` | Decimal | `number` |  |  |
| 2 | `A5001` | 5A颜色特征 | `vcol34` | 14345742-dfb7-47e7-a543-0ac5a0382261 | `quote` |  |  |
| 3 | `BIP10001` | 采购单价 | `ncol26` | Decimal | `number` |  |  |
| 4 | `BIP10002` | 存量供应商 | `lcol4` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  |  |
| 5 | `BM0101` | BM-钛白粉-包装规格 | `vcol5` | fc43e0b1-40ff-4f2c-843b-90e6e1e01e30 | `quote` |  |  |
| 6 | `BM0102` | BM-钛白粉-产线 | `vcol6` | 593fca26-9982-4fb5-b94a-267eb5b86594 | `quote` |  |  |
| 7 | `BM03` | 产品线 | `vcol8` | String | `text` |  |  |
| 8 | `BM0401` | 包装特征 | `vcol4` | String | `text` |  |  |
| 9 | `BM040701` | 包装特征1新 | `vcol9` | 549e1b9b-46f2-4fd8-923a-f13089fd7dfa | `quote` |  |  |
| 10 | `BM040703` | 产品特征1新 | `vcol10` | 313f0225-dcd4-497c-a859-9cc0be2d26ce | `quote` |  |  |
| 11 | `BM_S_001` | BM-S-钛白粉-包装规格 | `vcol14` | fc43e0b1-40ff-4f2c-843b-90e6e1e01e30 | `quote` |  |  |
| 12 | `BM_S_002` | BM-S-钛白粉-产线 | `vcol15` | 593fca26-9982-4fb5-b94a-267eb5b86594 | `quote` |  |  |
| 13 | `CAC01` | 台账流水号 | `vcol37` | 20143726-14af-4bf5-9348-e4534f24c892 | `quote` |  |  |
| 14 | `CC001` | 尺寸 | `vcol44` | 123351af-0d8b-4715-9726-fae8c6d76ac2 | `quote` |  |  |
| 15 | `CC02` | 颜色1 | `vcol45` | aded01bd-bc11-49a4-bf1a-c1ce3d2c2a3d | `quote` |  |  |
| 16 | `CL003` | CL自由项特征2 | `vcol30` | 199e36f7-f125-4a1f-9a43-297571e17fb9 | `quote` |  |  |
| 17 | `CL02` | CL自由项特征1 | `vcol29` | String | `text` |  |  |
| 18 | `CM_ml` | 尺码-毛蕾 | `vcol7` | 9b36b5c7-2ef2-4ec0-8b19-90f6bc1a1f81 | `quote` |  |  |
| 19 | `CSL01` | 数量质量检查 | `ncol17` | Decimal | `number` |  |  |
| 20 | `CTcolour` | 颜色-陈韬 | `vcol10` | da13b59a-d5d7-4abf-a6ef-fc35eb9d6eac | `quote` |  |  |
| 21 | `CXQ01` | CXQ颜色 | `vcol19` | 05df08d5-df20-4b1f-b003-06866e22094b | `quote` |  |  |
| 22 | `CYF99` | 填充物 | `vcol49` | String | `text` |  |  |
| 23 | `DD01` | D形状 | `vcol26` | e983ca01-020a-4c86-9484-d48cfedba7f3 | `quote` |  |  |
| 24 | `DD02` | D大小 | `vcol27` | 93ef4174-5afa-4672-a3ce-3b3c5b51ccd5 | `quote` |  |  |
| 25 | `DLN001` | DLN颜色 | `vcol28` | ffe9960b-6792-436d-b01b-89c079816617 | `quote` |  |  |
| 26 | `DLN002` | DLN型号 | `vcol29` | 5661114e-153c-4f96-93b7-9f0caa6dde26 | `quote` |  |  |
| 27 | `DS01` | DS颜色 | `vcol2` | 411ac286-9474-466a-9ba0-c1875dc8b4c2 | `quote` |  |  |
| 28 | `DS02` | DS尺码 | `vcol3` | 9fa9692d-c29d-4bbf-822f-24b95a2e5367 | `quote` |  |  |
| 29 | `DY01` | 颜色特征 | `vcol33` | String | `text` |  |  |
| 30 | `DY02` | DY颜色特征 | `vcol35` | dcad6258-4c5b-4ed0-9e77-0202e797e0d9 | `quote` |  |  |
| 31 | `Eleven_Asset_Class_Code` | Eleven资产类别编码 | `vcol27` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 | `quote` |  |  |
| 32 | `Eleven_Product_Color_Attribute` | Eleven物料颜色属性 | `vcol28` | cf0d67fa-8cdb-448d-b794-7339f1689411 | `quote` |  |  |
| 33 | `GQQ` | 管群群-颜色 | `vcol33` | cbf21359-2e4f-4193-aa3b-954a283264ea | `quote` |  |  |
| 34 | `GX01` | GX特征 | `vcol22` | 481f4b9e-1f7f-4d0b-9a4a-b99d2da15154 | `quote` |  |  |
| 35 | `HK_TZ_001` | HK颜色 | `vcol5` | 89021368-6751-4086-9753-646c6eb261a4 | `quote` |  |  |
| 36 | `JC0A01` | 类型 | `vcol7` | String | `text` |  |  |
| 37 | `JH_1001` | 水分 (M)‌ | `ncol37` | Decimal | `number` |  |  |
| 38 | `JH_1003` | 灰分 | `ncol36` | Decimal | `number` |  |  |
| 39 | `JM0001` | 特征JM | `vcol20` | 6ca3c350-90b3-4a0a-8889-b85fe916bf00 | `quote` |  |  |
| 40 | `JM01` | 焦煤含水量 | `ncol44` | Decimal | `number` |  |  |
| 41 | `JM02` | 热值 | `ncol39` | Decimal | `number` |  |  |
| 42 | `JSYT001` | YT原产地 | `vcol25` | 1b329b30-cfdf-48c9-8af7-5c6e62c182b4 | `quote` |  |  |
| 43 | `KTTZ001` | KT颜色 | `vcol7` | 6b31b4ce-34c8-414a-81cb-af5057b6d524 | `quote` |  |  |
| 44 | `L001` | L颜色 | `vcol35` | 7e201663-6408-4ad1-a791-a04b76421874 | `quote` |  |  |
| 45 | `L01` | 供应商YG | `lcol6` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  |  |
| 46 | `LC001` | LC颜色 | `vcol20` | b1d9c54e-df53-4dc7-bbc7-a0a8702e3180 | `quote` |  |  |
| 47 | `LJ00001` | 李佳-测试-颜色 | `vcol21` | d12a34d8-83fd-44b7-8794-2e96722d8cba | `quote` |  |  |
| 48 | `LJ00101` | 李佳-测试-品牌 | `vcol22` | ce45784e-d891-4e61-af8b-c2a1310f697d | `quote` |  |  |
| 49 | `LKF0001` | 质量-001 | `vcol44` | String | `text` |  |  |
| 50 | `LL0001` | 李磊材质 | `vcol41` | String | `text` |  |  |
| 51 | `LMM001` | 李明敏-特征品牌 | `vcol46` | a72e4585-12ec-430e-8835-d312f894179a | `quote` |  |  |
| 52 | `LT8221_03` | LT8221特征3 | `ncol24` | Decimal | `number` |  |  |
| 53 | `LT8221_04` | LT8221特征4 | `ncol25` | Decimal | `number` |  |  |
| 54 | `LZH0329` | 0329CS | `vcol28` | 65a01ea8-53d0-4cf2-b65e-68aa6d359c84 | `quote` |  |  |
| 55 | `Luo22` | 罗昊的特征1 | `ncol41` | Decimal | `number` |  |  |
| 56 | `M78ZY` | 是否存在项目 | `bcol4` | Boolean | `switch` |  |  |
| 57 | `MKD` | 膜宽度 | `ncol23` | Decimal | `number` |  |  |
| 58 | `MTMD` | 膜透明度 | `vcol54` | String | `text` |  |  |
| 59 | `NJCJ` | NJCJ颜色特征 | `vcol21` | cd7e84c8-85ab-4c70-92c8-14dd6e55247b | `quote` |  |  |
| 60 | `NJCS001` | 尺码 | `vcol10` | String | `text` |  |  |
| 61 | `NJCS002` | NJCS002尺码 | `vcol11` | 1bc404ad-4f7d-4e0b-b6ca-aef5bc251434 | `quote` |  |  |
| 62 | `NJXYL` | 薛益林颜色 | `vcol31` | String | `text` |  |  |
| 63 | `SCCJ` | 生产厂家 | `lcol5` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  |  |
| 64 | `SJM01` | 苏俊萌的特征 | `vcol47` | 14345742-dfb7-47e7-a543-0ac5a0382261 | `quote` |  |  |
| 65 | `SY0001` | SY特征测试 | `vcol20` | String | `text` |  |  |
| 66 | `TG003` | 标准 | `vcol25` | 7aa20b17-fc44-4ad4-92f7-cbc5e2283c9e | `quote` |  |  |
| 67 | `TG004` | 材质牌号 | `vcol26` | f279f603-d928-408e-bdc4-7a17f3239006 | `quote` |  |  |
| 68 | `TTL2001` | 米数 | `ncol49` | Decimal | `number` |  |  |
| 69 | `TTL2002` | 轴数 | `ncol48` | Decimal | `number` |  |  |
| 70 | `W0510` | 颜色特征王希磊 | `vcol52` | d74e89f2-e24e-493f-952c-2ff316fac783 | `quote` |  |  |
| 71 | `WJ01` | WJ颜色 | `vcol35` | ef9bb52c-a1df-4f08-b5e5-6258cf5216e5 | `quote` |  |  |
| 72 | `WXPJP` | 无锡潘俊鹏 | `vcol50` | 662f12bf-c66b-41e9-9b09-d78e464933ac | `quote` |  |  |
| 73 | `XF001` | 密度 | `vcol1` | 411ac286-9474-466a-9ba0-c1875dc8b4c2 | `quote` |  |  |
| 74 | `XFP01` | 颜色XFP | `vcol29` | 951cb71b-5c96-4d94-92c7-c48919e967a9 | `quote` |  |  |
| 75 | `XFP03` | 容量 | `vcol30` | 98b40f10-61fb-4517-baba-c203ec765722 | `quote` |  |  |
| 76 | `XL01` | 部门简码 | `vcol2` | String | `text` |  |  |
| 77 | `XL02` | 当前年份 | `vcol3` | String | `text` |  |  |
| 78 | `XL03` | 全年第几周 | `vcol4` | String | `text` |  |  |
| 79 | `XL04` | 本周第几天(A-G) | `vcol5` | String | `text` |  |  |
| 80 | `XMTZ001` | 西米特征-灰分 | `ncol16` | Decimal | `number` |  |  |
| 81 | `XWW001` | 颜色XWW | `vcol8` | 0fde9686-e980-4955-abf6-0ab3bab4393c | `quote` |  |  |
| 82 | `XYL001` | XYL的特征 | `vcol32` | 85ccfcbf-be7c-483c-8e0d-af55c9dabd2b | `quote` |  |  |
| 83 | `Xia` | 氧含量 | `vcol30` | String | `text` |  |  |
| 84 | `Xia02` | 碳含量 | `vcol31` | String | `text` |  |  |
| 85 | `Xia03` | 氧含量01 | `vcol42` | d792c90e-c07e-45a6-9d7e-fd67f6968c67 | `quote` |  |  |
| 86 | `Xia04` | 碳含量01 | `vcol43` | d792c90e-c07e-45a6-9d7e-fd67f6968c67 | `quote` |  |  |
| 87 | `YJN0` | YJN材质 | `vcol50` | 0f1e2ab0-9bcb-4421-9df7-a677991abbfd | `quote` |  |  |
| 88 | `YS` | 王继朋颜色 | `vcol21` | 411ac286-9474-466a-9ba0-c1875dc8b4c2 | `quote` |  |  |
| 89 | `YS_ml` | 颜色-毛蕾 | `vcol6` | 38834394-ca74-41f3-b985-d2e3b550d92a | `quote` |  |  |
| 90 | `YY` | 特征 | `vcol11` | String | `text` |  |  |
| 91 | `YY01` | YY_存货颜色 | `vcol19` | 40311400-4426-4697-8f09-6c1aff444d64 | `quote` |  |  |
| 92 | `ZP_01` | ZP颜色 | `vcol34` | aafcda72-f43e-43ff-ba0b-f861a544870a | `quote` |  |  |
| 93 | `ZW001` | 志威特征1 | `vcol32` | String | `text` |  |  |
| 94 | `ZW002` | 志威特征2 | `vcol33` | String | `text` |  |  |
| 95 | `ZW003` | 志威特征3 | `vcol34` | String | `text` |  |  |
| 96 | `ZZW_TZ01` | ZZW_TZ01 | `vcol37` | 266bfb0f-f2b8-4363-b578-7a52229078f9 | `quote` |  |  |
| 97 | `batch_date` | 生产日期 | `dcol50` | Date | `date` |  |  |
| 98 | `bqy001` | 包秋莹颜色 | `vcol23` | 279f12f2-2cb8-4fe0-b9bb-76879845c6ca | `quote` |  |  |
| 99 | `cpq001` | 颜色成沛琦 | `vcol16` | 08469985-f3f3-4458-ad73-2401d40f67a3 | `quote` |  |  |
| 100 | `cyw01` | 昌亚伟-颜色 | `vcol39` | String | `text` |  |  |
| 101 | `cyw02` | 昌亚伟-颜色2 | `vcol40` | cbf21359-2e4f-4193-aa3b-954a283264ea | `quote` |  |  |
| 102 | `ddy01` | 色号-p | `vcol40` | String | `text` |  |  |
| 103 | `ddy02` | 质量等级-cao | `vcol41` | String | `text` |  |  |
| 104 | `ddy04` | 石灰石-水 | `ncol38` | Decimal | `number` |  |  |
| 105 | `ddy3` | ddy-C | `ncol40` | Decimal | `number` |  |  |
| 106 | `ding2` | d特征名称2 | `vcol53` | String | `text` |  |  |
| 107 | `gjh001` | gjh颜色 | `vcol17` | 95e0e489-251a-4bac-b4e8-9103a3687b5b | `quote` |  |  |
| 108 | `hl01` | 韩磊特征（颜色） | `vcol43` | String | `text` |  |  |
| 109 | `hl02` | 韩磊特征（材质） | `vcol44` | String | `text` |  |  |
| 110 | `hl03` | 韩磊特征客户 | `lcol1` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  |  |
| 111 | `hl888` | hl测试01 | `lcol2` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  |  |
| 112 | `hl99` | hl测试02 | `vcol1` | String | `text` |  |  |
| 113 | `hncs15` | 预付款比例 | `ncol47` | Decimal | `number` |  |  |
| 114 | `hncs21` | 质保金比例 | `ncol45` | Decimal | `number` |  |  |
| 115 | `hncs25` | 履约保证金（保函） | `ncol46` | Decimal | `number` |  |  |
| 116 | `hq` | 韩琦2 | `vcol38` | 821ea9e7-d7ee-4a8f-af1c-89faadf18e5f | `quote` |  |  |
| 117 | `hw01` | hw颜色 | `vcol27` | 2a526d09-2ee7-4def-830f-a8671754c449 | `quote` |  |  |
| 118 | `id` | ID | `id` | String | `text` |  | ✓ |
| 119 | `jewellery04` | 珠宝尺寸 | `vcol53` | 9361525d-3def-44d1-8e27-7407f8c6aace | `quote` |  |  |
| 120 | `jhh111` | 1111 | `vcol48` | cbf21359-2e4f-4193-aa3b-954a283264ea | `quote` |  |  |
| 121 | `jhhtz` | 江欢欢颜色 | `vcol45` | String | `text` |  |  |
| 122 | `lang_C` | lang_C——数值 | `ncol1` | Decimal | `number` |  |  |
| 123 | `lang_Cr` | Cr——数值范围 | `bcol1,ncol2,ncol3` | Composite | `decimalRange` |  |  |
| 124 | `lang_S` | S——文本 | `vcol25` | String | `text` |  |  |
| 125 | `lang_Si` | Si——基础档案 | `vcol26` | 0807260c-f881-4419-9dab-a412fad4e530 | `quote` |  |  |
| 126 | `lang_xingtai` | lang_形态 | `vcol42` | 3f217f17-98bb-428b-8a02-baa3bc2a7358 | `quote` |  |  |
| 127 | `ld001` | ld颜色 | `vcol23` | 9cc7f067-79f2-4fb7-8856-393de5f27c43 | `quote` |  |  |
| 128 | `ld001_ps` | 配送方式 | `vcol39` | 7d54cadd-7029-43cf-88f7-bc7215c06fb3 | `quote` |  |  |
| 129 | `ld002` | ld容积 | `vcol24` | bc04edae-28ab-4021-b5bd-2efa001a5995 | `quote` |  |  |
| 130 | `ld002_ys` | 中转 | `vcol36` | String | `text` |  |  |
| 131 | `ld003_ys` | 车号 | `vcol37` | String | `text` |  |  |
| 132 | `ld004_sl` | 供方重量（吨） | `ncol4` | Decimal | `number` |  |  |
| 133 | `ld005_sl` | 到厂重量（吨） | `ncol5` | Decimal | `number` |  |  |
| 134 | `ld006_sl` | 袋数（件） | `ncol6` | Decimal | `number` |  |  |
| 135 | `ld007_sl` | 扣袋重 | `ncol7` | Decimal | `number` |  |  |
| 136 | `ld008_sl` | 供方扣后（吨） | `ncol8` | Decimal | `number` |  |  |
| 137 | `ld009_sl` | 到厂扣后（吨） | `ncol9` | Decimal | `number` |  |  |
| 138 | `ld010_zl` | 厂家Cr | `ncol14` | Decimal | `number` |  |  |
| 139 | `ld011_zl` | 厂家水分 | `ncol15` | Decimal | `number` |  |  |
| 140 | `ld012_zl` | 厂检Cr | `ncol10` | Decimal | `number` |  |  |
| 141 | `ld013_zl` | 厂检Si | `ncol12` | Decimal | `number` |  |  |
| 142 | `ld014_zl` | 厂检水分 | `ncol11` | Decimal | `number` |  |  |
| 143 | `ld015_zl` | 厂检杂质 | `ncol13` | Decimal | `number` |  |  |
| 144 | `ld016_js` | 基价基准 | `vcol38` | ld001_mj | `singleOption` |  |  |
| 145 | `ld019` | Cr含量允差 | `ncol18` | Decimal | `number` |  |  |
| 146 | `ld020` | Cr含量上限 | `ncol19` | Decimal | `number` |  |  |
| 147 | `ld021` | Cr含量下限 | `ncol20` | Decimal | `number` |  |  |
| 148 | `ld022` | 小粒度尺寸 | `vcol45` | 5c76fdab-5726-4d1a-8875-361e54ce35ca | `quote` |  |  |
| 149 | `ld031` | 折算铬含量 | `lcol3` | Long | `long` |  |  |
| 150 | `ld032` | 厂检C | `ncol21` | Decimal | `number` |  |  |
| 151 | `ld033` | 生产粒度 | `vcol46` | 5c76fdab-5726-4d1a-8875-361e54ce35ca | `quote` |  |  |
| 152 | `ld034` | 结算铬含量（作废） | `ncol22` | Decimal | `number` |  |  |
| 153 | `ld040` | 铬含量 | `vcol47` | String | `text` |  |  |
| 154 | `ld041` | 炉号 | `vcol55` | 550a2b87-31d9-4047-b751-4d6965f09b2f | `quote` |  |  |
| 155 | `lh` | lh | `vcol23` | String | `text` |  |  |
| 156 | `lh1` | lh1 | `vcol24` | ba0099c0-4280-47f5-b846-47bc44fd30d4 | `quote` |  |  |
| 157 | `liuyut001` | liuyut颜色 | `vcol36` | f82aa598-cb1c-48b5-bb91-bf9334692c09 | `quote` |  |  |
| 158 | `ljn` | ljn颜色 | `vcol9` | f21507b6-9191-4d2d-aa27-a2b23d0e046d | `quote` |  |  |
| 159 | `lrj001` | lrj颜色 | `vcol11` | c2b547f5-e622-4d56-a053-c5c4533f69ee | `quote` |  |  |
| 160 | `lrj002` | lrj尺码 | `vcol12` | 4460118a-94af-4d65-83c2-c984da504432 | `quote` |  |  |
| 161 | `lzxqfl001` | 绿洲需求分类 | `vcol43` | f48843cb-7ad2-47c8-a0f4-bb451e90022d | `quote` |  |  |
| 162 | `miao` | 喵 | `vcol52` | String | `text` |  |  |
| 163 | `msn01` | msn颜色 | `vcol48` | e3617ad3-89ae-44b9-b305-2491b6a2d01e | `quote` |  |  |
| 164 | `myt01` | myt尺寸 | `vcol15` | a0df3b99-226a-42fc-b70c-cfff49f70e19 | `quote` |  |  |
| 165 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 166 | `qjq01` | qjq-颜色 | `vcol13` | bc531bc3-ceb1-4c7e-8e07-c570782db2ad | `quote` |  |  |
| 167 | `qjqys01` | 秦俊琪特征-颜色 | `vcol9` | 26913d22-b122-4da0-8c29-46871318e603 | `quote` |  |  |
| 168 | `shin` | 史楠特征 | `vcol55` | bc531bc3-ceb1-4c7e-8e07-c570782db2ad | `quote` |  |  |
| 169 | `smx003` | 颜色smx | `vcol38` | 411ac286-9474-466a-9ba0-c1875dc8b4c2 | `quote` |  |  |
| 170 | `swedrftg` | 李文梁-颜色 | `vcol52` | 4fe1a778-ebb6-479d-986b-eb7c6a7c1693 | `quote` |  |  |
| 171 | `sww01` | 师文文衣服尺码 | `vcol4` | 32545b61-2088-4066-b12a-a28f6c5240a7 | `quote` |  |  |
| 172 | `sxdtzys` | 施学达颜色 | `vcol49` | d42794f5-f5ae-46df-bce3-aba95312866b | `quote` |  |  |
| 173 | `sz03` | 四组03 | `bcol2,ncol28,ncol29` | Composite | `decimalRange` |  |  |
| 174 | `szzlj` | szlj | `vcol48` | String | `text` |  |  |
| 175 | `szzlj01` | szzlj01 | `vcol49` | fe86cb03-0d41-43ad-9c7f-4aca1a1298b0 | `quote` |  |  |
| 176 | `test04` | 车身颜色 | `vcol18` | e46a9525-c982-40bd-870d-1dfceb4609b2 | `quote` |  |  |
| 177 | `tz76` | 76C含量作废 | `vcol16` | String | `text` |  |  |
| 178 | `tz7601` | 76Cr含量作废 | `vcol17` | String | `text` |  |  |
| 179 | `tz7603` | 76C含量 | `vcol18` | b852ade3-74e0-4406-b424-1f0870327bce | `quote` |  |  |
| 180 | `tz7604` | 76Cr含量 | `vcol19` | 1f8f4f1c-11d9-427c-ad88-fbd49105cdd9 | `quote` |  |  |
| 181 | `water` | 水分（bailh） | `ncol35` | Decimal | `number` |  |  |
| 182 | `wh002` | 硝石含铁量1 | `ncol27` | Decimal | `number` |  |  |
| 183 | `wh101` | 吴贺-颜色 | `vcol14` | 08469985-f3f3-4458-ad73-2401d40f67a3 | `quote` |  |  |
| 184 | `wjp001` | 吴洁鹏颜色 | `vcol36` | 7470aafb-ef5b-4e18-97de-f56e2ae2103e | `quote` |  |  |
| 185 | `wjp002` | 吴洁鹏特征2 | `vcol50` | 950c3760-f399-4e96-a1e4-a58e587295f7 | `quote` |  |  |
| 186 | `wtt` | 颜色wtt | `vcol42` | d0b34ccf-7821-489e-924f-dd32f0f44c23 | `quote` |  |  |
| 187 | `ww` | ww颜色 | `vcol18` | String | `text` |  |  |
| 188 | `wwh` | 王伟恒-颜色 | `vcol22` | e3133654-88ee-4c3c-89fe-ca0a0e19966e | `quote` |  |  |
| 189 | `wxc01` | 衣服尺码特征-位雪纯 | `vcol54` | 9fa9692d-c29d-4bbf-822f-24b95a2e5367 | `quote` |  |  |
| 190 | `wxptz` | wxpt颜色特征 | `vcol6` | 84991e7f-8fcf-4c8f-ac7c-b98cd9e80fa4 | `quote` |  |  |
| 191 | `wxwdc01` | wxwdc颜色 | `vcol51` | 821ea9e7-d7ee-4a8f-af1c-89faadf18e5f | `quote` |  |  |
| 192 | `wxwdc02` | 颜色2 | `vcol53` | 3ace5926-d270-41e6-963d-72ecc30a6225 | `quote` |  |  |
| 193 | `xb` | 性别1111 | `vcol31` | 042eb375-2f1e-4721-b473-a14fd2749c49 | `quote` |  |  |
| 194 | `xwl01` | xwl_尺码 | `vcol47` | 4255ccda-3cab-44d6-98ac-7c941ca5d329 | `quote` |  |  |
| 195 | `yd01` | 烨铎颜色 | `vcol17` | b22e8c35-c529-4ca7-8e63-2fc30615f4d0 | `quote` |  |  |
| 196 | `yjxys` | 袁杰西颜色 | `vcol2` | ed507093-1f07-4fdb-99cf-f816565b149f | `quote` |  |  |
| 197 | `yjy001` | yjy特征1 | `vcol54` | String | `text` |  |  |
| 198 | `yjy002` | yjy特征2 | `vcol55` | String | `text` |  |  |
| 199 | `yjy003` | yjy颜色 | `vcol1` | 8b6f59cd-6fb8-4eeb-8ecb-af1c923ff01f | `quote` |  |  |
| 200 | `yswxgqg` | 颜色wxgqg | `vcol24` | 81acc8cf-5200-456a-bba6-c46786d99184 | `quote` |  |  |
| 201 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 202 | `yxh00001` | 余量宽度 | `ncol43` | Decimal | `number` |  |  |
| 203 | `yxh00002` | 余料长度 | `ncol42` | Decimal | `number` |  |  |
| 204 | `zfj` | 颜色zfj | `vcol3` | e80a9509-a699-40e2-b6e4-d5e87294db5e | `quote` |  |  |
| 205 | `zjj01` | zjj档案 | `vcol14` | cf891e2e-0b7a-49aa-acf7-6bd8fed2f3d9 | `quote` |  |  |
| 206 | `zlj01` | 周丽娇特征颜色 | `vcol12` | String | `text` |  |  |
| 207 | `zlj02` | zlj02 | `vcol13` | fe86cb03-0d41-43ad-9c7f-4aca1a1298b0 | `quote` |  |  |
| 208 | `zouj01` | A特征 | `vcol39` | String | `text` |  |  |
| 209 | `zouj02` | B特征 | `vcol40` | String | `text` |  |  |
| 210 | `zoujj` | zouj自定义档案 | `vcol41` | cb7846d8-c684-4a2f-8411-4e7a3798a05c | `quote` |  |  |
| 211 | `zqdyanse` | zqd颜色 | `vcol32` | 12949f86-a911-456b-b6a1-0acc521cc3c7 | `quote` |  |  |
| 212 | `zrt01` | zrt颜色 | `vcol46` | 96b2bb54-11c6-4fed-aa4b-e2f72c6c1d96 | `quote` |  |  |
| 213 | `zx001` | 赵鑫颜色特征 | `vcol51` | String | `text` |  |  |
| 214 | `zxftz01` | zxf颜色 | `vcol51` | 0091e929-53f6-4f63-b14c-1d0f36a6bd17 | `quote` |  |  |
| 215 | `zxw0001` | zxw0001 | `vcol15` | String | `text` |  |  |
| 216 | `zxw0002` | zxw0002 | `vcol16` | bc531bc3-ceb1-4c7e-8e07-c570782db2ad | `quote` |  |  |
| 217 | `zy001` | 朱阳-是否 | `bcol3` | Boolean | `switch` |  |  |
| 218 | `zzx` | 周正旭-颜色 | `vcol12` | String | `text` |  |  |
| 219 | `zzxtz` | 周正旭-颜色1 | `vcol13` | 16050e70-0b6d-473b-aa1c-6f06110bf239 | `quote` |  |  |
| 220 | `zzy` | zzy特征 | `vcol8` | 082aa70f-4ea5-48fa-9654-a5a73d98d2bf | `quote` |  |  |

---

## 关联属性（共 122 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `jewellery04` | 珠宝尺寸 | `bd.customerdoc_jewellery04.jewellery04` | `vcol53` |  →  |  |  | Service |  |
| 2 | `NJCJ` | NJCJ颜色特征 | `bd.customerdoc_NJCJ.NJCJ` | `vcol21` |  →  |  |  | Service |  |
| 3 | `YY01` | YY_存货颜色 | `bd.customerdoc_YY01.YY01` | `vcol19` |  →  |  |  | Service |  |
| 4 | `hq` | 韩琦2 | `bd.customerdoc_wxwdc01.wxwdc01` | `vcol38` |  →  |  |  | Service |  |
| 5 | `wjp001` | 吴洁鹏颜色 | `bd.customerdoc_wjp001.wjp001` | `vcol36` |  →  |  |  | Service |  |
| 6 | `shin` | 史楠特征 | `bd.customerdoc_0999.0999` | `vcol55` |  →  |  |  | Service |  |
| 7 | `wjp002` | 吴洁鹏特征2 | `bd.customerdoc_wjp002.wjp002` | `vcol50` |  →  |  |  | Service |  |
| 8 | `qjq01` | qjq-颜色 | `bd.customerdoc_0999.0999` | `vcol13` |  →  |  |  | Service |  |
| 9 | `LC001` | LC颜色 | `bd.customerdoc_LC001.LC001` | `vcol20` |  →  |  |  | Service |  |
| 10 | `ld041` | 炉号 | `bd.customerdoc_ld006.ld006` | `vcol55` |  →  |  |  | Service |  |
| 11 | `swedrftg` | 李文梁-颜色 | `bd.customerdoc_lwlys.lwlys` | `vcol52` |  →  |  |  | Service |  |
| 12 | `YS` | 王继朋颜色 | `bd.customerdoc_XF001.XF001` | `vcol21` |  →  |  |  | Service |  |
| 13 | `CC001` | 尺寸 | `bd.customerdoc_CC01.CC01` | `vcol44` |  →  |  |  | Service |  |
| 14 | `TG003` | 标准 | `bd.customerdoc_tg001.tg001` | `vcol25` |  →  |  |  | Service |  |
| 15 | `zqdyanse` | zqd颜色 | `bd.customerdoc_zqdyanse.zqdyanse` | `vcol32` |  →  |  |  | Service |  |
| 16 | `TG004` | 材质牌号 | `bd.customerdoc_TG002.TG002` | `vcol26` |  →  |  |  | Service |  |
| 17 | `cyw02` | 昌亚伟-颜色2 | `bd.customerdoc_250330.250330` | `vcol40` |  →  |  |  | Service |  |
| 18 | `LJ00001` | 李佳-测试-颜色 | `bd.customerdoc_LJ002.LJ002` | `vcol21` |  →  |  |  | Service |  |
| 19 | `jhh111` | 1111 | `bd.customerdoc_250330.250330` | `vcol48` |  →  |  |  | Service |  |
| 20 | `yjy003` | yjy颜色 | `bd.customerdoc_yjy001.yjy001` | `vcol1` |  →  |  |  | Service |  |
| 21 | `A5001` | 5A颜色特征 | `bd.customerdoc_5A001.5A001` | `vcol34` |  →  |  |  | Service |  |
| 22 | `lh1` | lh1 | `bd.customerdoc_XF01.XF01` | `vcol24` |  →  |  |  | Service |  |
| 23 | `lang_xingtai` | lang_形态 | `bd.customerdoc_lang_xingtai.lang_xingtai` | `vcol42` |  →  |  |  | Service |  |
| 24 | `wtt` | 颜色wtt | `bd.customerdoc_wtt.wtt` | `vcol42` |  →  |  |  | Service |  |
| 25 | `hl03` | 韩磊特征客户 | `aa.merchant.Merchant` | `lcol1` |  →  |  |  | Service |  |
| 26 | `ld033` | 生产粒度 | `bd.customerdoc_ld004.ld004` | `vcol46` |  →  |  |  | Service |  |
| 27 | `zzy` | zzy特征 | `bd.customerdoc_zzy.zzy` | `vcol8` |  →  |  |  | Service |  |
| 28 | `yjxys` | 袁杰西颜色 | `bd.customerdoc_yjxys.yjxys` | `vcol2` |  →  |  |  | Service |  |
| 29 | `WJ01` | WJ颜色 | `bd.customerdoc_WJ01.WJ01` | `vcol35` |  →  |  |  | Service |  |
| 30 | `wh101` | 吴贺-颜色 | `bd.customerdoc_cpq001.cpq001` | `vcol14` |  →  |  |  | Service |  |
| 31 | `CM_ml` | 尺码-毛蕾 | `bd.customerdoc_CM.CM` | `vcol7` |  →  |  |  | Service |  |
| 32 | `cpq001` | 颜色成沛琦 | `bd.customerdoc_cpq001.cpq001` | `vcol16` |  →  |  |  | Service |  |
| 33 | `L001` | L颜色 | `bd.customerdoc_L001.L001` | `vcol35` |  →  |  |  | Service |  |
| 34 | `bqy001` | 包秋莹颜色 | `bd.customerdoc_bqy001.bqy001` | `vcol23` |  →  |  |  | Service |  |
| 35 | `L01` | 供应商YG | `aa.vendor.Vendor` | `lcol6` |  →  |  |  | Service |  |
| 36 | `zzxtz` | 周正旭-颜色1 | `bd.customerdoc_zzx.zzx` | `vcol13` |  →  |  |  | Service |  |
| 37 | `zjj01` | zjj档案 | `bd.customerdoc_zjj.zjj` | `vcol14` |  →  |  |  | Service |  |
| 38 | `sww01` | 师文文衣服尺码 | `bd.customerdoc_sww01.sww01` | `vcol4` |  →  |  |  | Service |  |
| 39 | `XFP01` | 颜色XFP | `bd.customerdoc_XFP01.XFP01` | `vcol29` |  →  |  |  | Service |  |
| 40 | `YJN0` | YJN材质 | `bd.customerdoc_YJN.YJN` | `vcol50` |  →  |  |  | Service |  |
| 41 | `zxw0002` | zxw0002 | `bd.customerdoc_0999.0999` | `vcol16` |  →  |  |  | Service |  |
| 42 | `W0510` | 颜色特征王希磊 | `bd.customerdoc_0510.0510` | `vcol52` |  →  |  |  | Service |  |
| 43 | `XFP03` | 容量 | `bd.customerdoc_XFP03.XFP03` | `vcol30` |  →  |  |  | Service |  |
| 44 | `JM0001` | 特征JM | `bd.customerdoc_JM0001.JM0001` | `vcol20` |  →  |  |  | Service |  |
| 45 | `hl888` | hl测试01 | `aa.merchant.Merchant` | `lcol2` |  →  |  |  | Service |  |
| 46 | `hw01` | hw颜色 | `bd.customerdoc_hw01.hw01` | `vcol27` |  →  |  |  | Service |  |
| 47 | `smx003` | 颜色smx | `bd.customerdoc_XF001.XF001` | `vcol38` |  →  |  |  | Service |  |
| 48 | `liuyut001` | liuyut颜色 | `bd.customerdoc_liuyut001.liuyut001` | `vcol36` |  →  |  |  | Service |  |
| 49 | `Eleven_Product_Color_Attribute` | Eleven物料颜色属性 | `bd.customerdoc_Eleven_Product_Color_Attribute.Eleven_Product_Color_Attribute` | `vcol28` |  →  |  |  | Service |  |
| 50 | `tz7604` | 76Cr含量 | `bd.customerdoc_7602.7602` | `vcol19` |  →  |  |  | Service |  |
| 51 | `BIP10002` | 存量供应商 | `aa.vendor.Vendor` | `lcol4` |  →  |  |  | Service |  |
| 52 | `tz7603` | 76C含量 | `bd.customerdoc_7601.7601` | `vcol18` |  →  |  |  | Service |  |
| 53 | `LJ00101` | 李佳-测试-品牌 | `bd.customerdoc_10001.10001` | `vcol22` |  →  |  |  | Service |  |
| 54 | `BM040703` | 产品特征1新 | `bd.customerdoc_040702.040702` | `vcol10` |  →  |  |  | Service |  |
| 55 | `myt01` | myt尺寸 | `bd.customerdoc_myt01.myt01` | `vcol15` |  →  |  |  | Service |  |
| 56 | `yd01` | 烨铎颜色 | `bd.customerdoc_yd01.yd01` | `vcol17` |  →  |  |  | Service |  |
| 57 | `BM_S_002` | BM-S-钛白粉-产线 | `bd.customerdoc_BM02.BM02` | `vcol15` |  →  |  |  | Service |  |
| 58 | `BM_S_001` | BM-S-钛白粉-包装规格 | `bd.customerdoc_BM01.BM01` | `vcol14` |  →  |  |  | Service |  |
| 59 | `DY02` | DY颜色特征 | `bd.customerdoc_Color.Color` | `vcol35` |  →  |  |  | Service |  |
| 60 | `Xia03` | 氧含量01 | `bd.customerdoc_Xia01.Xia01` | `vcol42` |  →  |  |  | Service |  |
| 61 | `XF001` | 密度 | `bd.customerdoc_XF001.XF001` | `vcol1` |  →  |  |  | Service |  |
| 62 | `BM0102` | BM-钛白粉-产线 | `bd.customerdoc_BM02.BM02` | `vcol6` |  →  |  |  | Service |  |
| 63 | `CC02` | 颜色1 | `bd.customerdoc_CC02.CC02` | `vcol45` |  →  |  |  | Service |  |
| 64 | `Xia04` | 碳含量01 | `bd.customerdoc_Xia01.Xia01` | `vcol43` |  →  |  |  | Service |  |
| 65 | `BM0101` | BM-钛白粉-包装规格 | `bd.customerdoc_BM01.BM01` | `vcol5` |  →  |  |  | Service |  |
| 66 | `BM040701` | 包装特征1新 | `bd.customerdoc_040701.040701` | `vcol9` |  →  |  |  | Service |  |
| 67 | `lang_Si` | Si——基础档案 | `QMSDFM.qualityGrade.qualityGradeBody` | `vcol26` |  →  |  |  | Service |  |
| 68 | `wwh` | 王伟恒-颜色 | `bd.customerdoc_wwh.wwh` | `vcol22` |  →  |  |  | Service |  |
| 69 | `SCCJ` | 生产厂家 | `aa.vendor.Vendor` | `lcol5` |  →  |  |  | Service |  |
| 70 | `GX01` | GX特征 | `bd.customerdoc_GX01.GX01` | `vcol22` |  →  |  |  | Service |  |
| 71 | `zlj02` | zlj02 | `bd.customerdoc_zlj.zlj` | `vcol13` |  →  |  |  | Service |  |
| 72 | `ld001` | ld颜色 | `bd.customerdoc_ld001.ld001` | `vcol23` |  →  |  |  | Service |  |
| 73 | `ld002` | ld容积 | `bd.customerdoc_ld002.ld002` | `vcol24` |  →  |  |  | Service |  |
| 74 | `DD02` | D大小 | `bd.customerdoc_DD02.DD02` | `vcol27` |  →  |  |  | Service |  |
| 75 | `DD01` | D形状 | `bd.customerdoc_DD01.DD01` | `vcol26` |  →  |  |  | Service |  |
| 76 | `test04` | 车身颜色 | `bd.customerdoc_test03.test03` | `vcol18` |  →  |  |  | Service |  |
| 77 | `CXQ01` | CXQ颜色 | `bd.customerdoc_CXQ01.CXQ01` | `vcol19` |  →  |  |  | Service |  |
| 78 | `GQQ` | 管群群-颜色 | `bd.customerdoc_250330.250330` | `vcol33` |  →  |  |  | Service |  |
| 79 | `CAC01` | 台账流水号 | `bd.customerdoc_CAC01.CAC01` | `vcol37` |  →  |  |  | Service |  |
| 80 | `HK_TZ_001` | HK颜色 | `bd.customerdoc_HK_COLOR.HK_COLOR` | `vcol5` |  →  |  |  | Service |  |
| 81 | `wxptz` | wxpt颜色特征 | `bd.customerdoc_wxpys.wxpys` | `vcol6` |  →  |  |  | Service |  |
| 82 | `ZP_01` | ZP颜色 | `bd.customerdoc_ZP01.ZP01` | `vcol34` |  →  |  |  | Service |  |
| 83 | `JSYT001` | YT原产地 | `bd.customerdoc_JSYT001.JSYT001` | `vcol25` |  →  |  |  | Service |  |
| 84 | `KTTZ001` | KT颜色 | `bd.customerdoc_KT01.KT01` | `vcol7` |  →  |  |  | Service |  |
| 85 | `ljn` | ljn颜色 | `bd.customerdoc_ljn001.ljn001` | `vcol9` |  →  |  |  | Service |  |
| 86 | `yswxgqg` | 颜色wxgqg | `bd.customerdoc_ysgqg.ysgqg` | `vcol24` |  →  |  |  | Service |  |
| 87 | `lzxqfl001` | 绿洲需求分类 | `bd.customerdoc_XQFL.XQFL` | `vcol43` |  →  |  |  | Service |  |
| 88 | `msn01` | msn颜色 | `bd.customerdoc_msn01.msn01` | `vcol48` |  →  |  |  | Service |  |
| 89 | `zxftz01` | zxf颜色 | `bd.customerdoc_zxfys.zxfys` | `vcol51` |  →  |  |  | Service |  |
| 90 | `zfj` | 颜色zfj | `bd.customerdoc_zfj91.zfj91` | `vcol3` |  →  |  |  | Service |  |
| 91 | `CTcolour` | 颜色-陈韬 | `bd.customerdoc_CT001.CT001` | `vcol10` |  →  |  |  | Service |  |
| 92 | `NJCS002` | NJCS002尺码 | `bd.customerdoc_NJCS001.NJCS001` | `vcol11` |  →  |  |  | Service |  |
| 93 | `zoujj` | zouj自定义档案 | `bd.customerdoc_001.001` | `vcol41` |  →  |  |  | Service |  |
| 94 | `lrj002` | lrj尺码 | `bd.customerdoc_lrj002.lrj002` | `vcol12` |  →  |  |  | Service |  |
| 95 | `lrj001` | lrj颜色 | `bd.customerdoc_lrj001.lrj001` | `vcol11` |  →  |  |  | Service |  |
| 96 | `zrt01` | zrt颜色 | `bd.customerdoc_zrt01.zrt01` | `vcol46` |  →  |  |  | Service |  |
| 97 | `LMM001` | 李明敏-特征品牌 | `bd.customerdoc_lmm001.lmm001` | `vcol46` |  →  |  |  | Service |  |
| 98 | `XYL001` | XYL的特征 | `bd.customerdoc_XYL001.XYL001` | `vcol32` |  →  |  |  | Service |  |
| 99 | `sxdtzys` | 施学达颜色 | `bd.customerdoc_sxdzdy.sxdzdy` | `vcol49` |  →  |  |  | Service |  |
| 100 | `ld022` | 小粒度尺寸 | `bd.customerdoc_ld004.ld004` | `vcol45` |  →  |  |  | Service |  |
| 101 | `ld001_ps` | 配送方式 | `bd.customerdoc_ld111.ld111` | `vcol39` |  →  |  |  | Service |  |
| 102 | `xwl01` | xwl_尺码 | `bd.customerdoc_xwl01.xwl01` | `vcol47` |  →  |  |  | Service |  |
| 103 | `ZZW_TZ01` | ZZW_TZ01 | `bd.customerdoc_ZZW_YS.ZZW_YS` | `vcol37` |  →  |  |  | Service |  |
| 104 | `qjqys01` | 秦俊琪特征-颜色 | `bd.customerdoc_qjq0001.qjq0001` | `vcol9` |  →  |  |  | Service |  |
| 105 | `SJM01` | 苏俊萌的特征 | `bd.customerdoc_5A001.5A001` | `vcol47` |  →  |  |  | Service |  |
| 106 | `gjh001` | gjh颜色 | `bd.customerdoc_gjh001.gjh001` | `vcol17` |  →  |  |  | Service |  |
| 107 | `Eleven_Asset_Class_Code` | Eleven资产类别编码 | `ampub.ambase.CategoryVO` | `vcol27` |  →  |  |  | Service |  |
| 108 | `XWW001` | 颜色XWW | `bd.customerdoc_XWW001.XWW001` | `vcol8` |  →  |  |  | Service |  |
| 109 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 110 | `WXPJP` | 无锡潘俊鹏 | `bd.customerdoc_CPX.CPX` | `vcol50` |  →  |  |  | Service |  |
| 111 | `wxc01` | 衣服尺码特征-位雪纯 | `bd.customerdoc_25033101.25033101` | `vcol54` |  →  |  |  | Service |  |
| 112 | `YS_ml` | 颜色-毛蕾 | `bd.customerdoc_YS.YS` | `vcol6` |  →  |  |  | Service |  |
| 113 | `xb` | 性别1111 | `bd.customerdoc_123.123` | `vcol31` |  →  |  |  | Service |  |
| 114 | `DLN002` | DLN型号 | `bd.customerdoc_DLN_002.DLN_002` | `vcol29` |  →  |  |  | Service |  |
| 115 | `DS01` | DS颜色 | `bd.customerdoc_XF001.XF001` | `vcol2` |  →  |  |  | Service |  |
| 116 | `wxwdc01` | wxwdc颜色 | `bd.customerdoc_wxwdc01.wxwdc01` | `vcol51` |  →  |  |  | Service |  |
| 117 | `DS02` | DS尺码 | `bd.customerdoc_25033101.25033101` | `vcol3` |  →  |  |  | Service |  |
| 118 | `wxwdc02` | 颜色2 | `bd.customerdoc_wxwdc02.wxwdc02` | `vcol53` |  →  |  |  | Service |  |
| 119 | `DLN001` | DLN颜色 | `bd.customerdoc_DLN_001.DLN_001` | `vcol28` |  →  |  |  | Service |  |
| 120 | `szzlj01` | szzlj01 | `bd.customerdoc_zlj.zlj` | `vcol49` |  →  |  |  | Service |  |
| 121 | `CL003` | CL自由项特征2 | `bd.customerdoc_CL01.CL01` | `vcol30` |  →  |  |  | Service |  |
| 122 | `LZH0329` | 0329CS | `bd.customerdoc_LZH0329.LZH0329` | `vcol28` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `jewellery04` (珠宝尺寸) | `bd.customerdoc_jewellery04.jewellery04` | `vcol53` |
| `NJCJ` (NJCJ颜色特征) | `bd.customerdoc_NJCJ.NJCJ` | `vcol21` |
| `YY01` (YY_存货颜色) | `bd.customerdoc_YY01.YY01` | `vcol19` |
| `hq` (韩琦2) | `bd.customerdoc_wxwdc01.wxwdc01` | `vcol38` |
| `wjp001` (吴洁鹏颜色) | `bd.customerdoc_wjp001.wjp001` | `vcol36` |
| `shin` (史楠特征) | `bd.customerdoc_0999.0999` | `vcol55` |
| `wjp002` (吴洁鹏特征2) | `bd.customerdoc_wjp002.wjp002` | `vcol50` |
| `qjq01` (qjq-颜色) | `bd.customerdoc_0999.0999` | `vcol13` |
| `LC001` (LC颜色) | `bd.customerdoc_LC001.LC001` | `vcol20` |
| `ld041` (炉号) | `bd.customerdoc_ld006.ld006` | `vcol55` |
| `swedrftg` (李文梁-颜色) | `bd.customerdoc_lwlys.lwlys` | `vcol52` |
| `YS` (王继朋颜色) | `bd.customerdoc_XF001.XF001` | `vcol21` |
| `CC001` (尺寸) | `bd.customerdoc_CC01.CC01` | `vcol44` |
| `TG003` (标准) | `bd.customerdoc_tg001.tg001` | `vcol25` |
| `zqdyanse` (zqd颜色) | `bd.customerdoc_zqdyanse.zqdyanse` | `vcol32` |
| `TG004` (材质牌号) | `bd.customerdoc_TG002.TG002` | `vcol26` |
| `cyw02` (昌亚伟-颜色2) | `bd.customerdoc_250330.250330` | `vcol40` |
| `LJ00001` (李佳-测试-颜色) | `bd.customerdoc_LJ002.LJ002` | `vcol21` |
| `jhh111` (1111) | `bd.customerdoc_250330.250330` | `vcol48` |
| `yjy003` (yjy颜色) | `bd.customerdoc_yjy001.yjy001` | `vcol1` |
| `A5001` (5A颜色特征) | `bd.customerdoc_5A001.5A001` | `vcol34` |
| `lh1` (lh1) | `bd.customerdoc_XF01.XF01` | `vcol24` |
| `lang_xingtai` (lang_形态) | `bd.customerdoc_lang_xingtai.lang_xingtai` | `vcol42` |
| `wtt` (颜色wtt) | `bd.customerdoc_wtt.wtt` | `vcol42` |
| `hl03` (韩磊特征客户) | `aa.merchant.Merchant` | `lcol1` |
| `ld033` (生产粒度) | `bd.customerdoc_ld004.ld004` | `vcol46` |
| `zzy` (zzy特征) | `bd.customerdoc_zzy.zzy` | `vcol8` |
| `yjxys` (袁杰西颜色) | `bd.customerdoc_yjxys.yjxys` | `vcol2` |
| `WJ01` (WJ颜色) | `bd.customerdoc_WJ01.WJ01` | `vcol35` |
| `wh101` (吴贺-颜色) | `bd.customerdoc_cpq001.cpq001` | `vcol14` |
| `CM_ml` (尺码-毛蕾) | `bd.customerdoc_CM.CM` | `vcol7` |
| `cpq001` (颜色成沛琦) | `bd.customerdoc_cpq001.cpq001` | `vcol16` |
| `L001` (L颜色) | `bd.customerdoc_L001.L001` | `vcol35` |
| `bqy001` (包秋莹颜色) | `bd.customerdoc_bqy001.bqy001` | `vcol23` |
| `L01` (供应商YG) | `aa.vendor.Vendor` | `lcol6` |
| `zzxtz` (周正旭-颜色1) | `bd.customerdoc_zzx.zzx` | `vcol13` |
| `zjj01` (zjj档案) | `bd.customerdoc_zjj.zjj` | `vcol14` |
| `sww01` (师文文衣服尺码) | `bd.customerdoc_sww01.sww01` | `vcol4` |
| `XFP01` (颜色XFP) | `bd.customerdoc_XFP01.XFP01` | `vcol29` |
| `YJN0` (YJN材质) | `bd.customerdoc_YJN.YJN` | `vcol50` |
| `zxw0002` (zxw0002) | `bd.customerdoc_0999.0999` | `vcol16` |
| `W0510` (颜色特征王希磊) | `bd.customerdoc_0510.0510` | `vcol52` |
| `XFP03` (容量) | `bd.customerdoc_XFP03.XFP03` | `vcol30` |
| `JM0001` (特征JM) | `bd.customerdoc_JM0001.JM0001` | `vcol20` |
| `hl888` (hl测试01) | `aa.merchant.Merchant` | `lcol2` |
| `hw01` (hw颜色) | `bd.customerdoc_hw01.hw01` | `vcol27` |
| `smx003` (颜色smx) | `bd.customerdoc_XF001.XF001` | `vcol38` |
| `liuyut001` (liuyut颜色) | `bd.customerdoc_liuyut001.liuyut001` | `vcol36` |
| `Eleven_Product_Color_Attribute` (Eleven物料颜色属性) | `bd.customerdoc_Eleven_Product_Color_Attribute.Eleven_Product_Color_Attribute` | `vcol28` |
| `tz7604` (76Cr含量) | `bd.customerdoc_7602.7602` | `vcol19` |
| `BIP10002` (存量供应商) | `aa.vendor.Vendor` | `lcol4` |
| `tz7603` (76C含量) | `bd.customerdoc_7601.7601` | `vcol18` |
| `LJ00101` (李佳-测试-品牌) | `bd.customerdoc_10001.10001` | `vcol22` |
| `BM040703` (产品特征1新) | `bd.customerdoc_040702.040702` | `vcol10` |
| `myt01` (myt尺寸) | `bd.customerdoc_myt01.myt01` | `vcol15` |
| `yd01` (烨铎颜色) | `bd.customerdoc_yd01.yd01` | `vcol17` |
| `BM_S_002` (BM-S-钛白粉-产线) | `bd.customerdoc_BM02.BM02` | `vcol15` |
| `BM_S_001` (BM-S-钛白粉-包装规格) | `bd.customerdoc_BM01.BM01` | `vcol14` |
| `DY02` (DY颜色特征) | `bd.customerdoc_Color.Color` | `vcol35` |
| `Xia03` (氧含量01) | `bd.customerdoc_Xia01.Xia01` | `vcol42` |
| `XF001` (密度) | `bd.customerdoc_XF001.XF001` | `vcol1` |
| `BM0102` (BM-钛白粉-产线) | `bd.customerdoc_BM02.BM02` | `vcol6` |
| `CC02` (颜色1) | `bd.customerdoc_CC02.CC02` | `vcol45` |
| `Xia04` (碳含量01) | `bd.customerdoc_Xia01.Xia01` | `vcol43` |
| `BM0101` (BM-钛白粉-包装规格) | `bd.customerdoc_BM01.BM01` | `vcol5` |
| `BM040701` (包装特征1新) | `bd.customerdoc_040701.040701` | `vcol9` |
| `lang_Si` (Si——基础档案) | `QMSDFM.qualityGrade.qualityGradeBody` | `vcol26` |
| `wwh` (王伟恒-颜色) | `bd.customerdoc_wwh.wwh` | `vcol22` |
| `SCCJ` (生产厂家) | `aa.vendor.Vendor` | `lcol5` |
| `GX01` (GX特征) | `bd.customerdoc_GX01.GX01` | `vcol22` |
| `zlj02` (zlj02) | `bd.customerdoc_zlj.zlj` | `vcol13` |
| `ld001` (ld颜色) | `bd.customerdoc_ld001.ld001` | `vcol23` |
| `ld002` (ld容积) | `bd.customerdoc_ld002.ld002` | `vcol24` |
| `DD02` (D大小) | `bd.customerdoc_DD02.DD02` | `vcol27` |
| `DD01` (D形状) | `bd.customerdoc_DD01.DD01` | `vcol26` |
| `test04` (车身颜色) | `bd.customerdoc_test03.test03` | `vcol18` |
| `CXQ01` (CXQ颜色) | `bd.customerdoc_CXQ01.CXQ01` | `vcol19` |
| `GQQ` (管群群-颜色) | `bd.customerdoc_250330.250330` | `vcol33` |
| `CAC01` (台账流水号) | `bd.customerdoc_CAC01.CAC01` | `vcol37` |
| `HK_TZ_001` (HK颜色) | `bd.customerdoc_HK_COLOR.HK_COLOR` | `vcol5` |
| `wxptz` (wxpt颜色特征) | `bd.customerdoc_wxpys.wxpys` | `vcol6` |
| `ZP_01` (ZP颜色) | `bd.customerdoc_ZP01.ZP01` | `vcol34` |
| `JSYT001` (YT原产地) | `bd.customerdoc_JSYT001.JSYT001` | `vcol25` |
| `KTTZ001` (KT颜色) | `bd.customerdoc_KT01.KT01` | `vcol7` |
| `ljn` (ljn颜色) | `bd.customerdoc_ljn001.ljn001` | `vcol9` |
| `yswxgqg` (颜色wxgqg) | `bd.customerdoc_ysgqg.ysgqg` | `vcol24` |
| `lzxqfl001` (绿洲需求分类) | `bd.customerdoc_XQFL.XQFL` | `vcol43` |
| `msn01` (msn颜色) | `bd.customerdoc_msn01.msn01` | `vcol48` |
| `zxftz01` (zxf颜色) | `bd.customerdoc_zxfys.zxfys` | `vcol51` |
| `zfj` (颜色zfj) | `bd.customerdoc_zfj91.zfj91` | `vcol3` |
| `CTcolour` (颜色-陈韬) | `bd.customerdoc_CT001.CT001` | `vcol10` |
| `NJCS002` (NJCS002尺码) | `bd.customerdoc_NJCS001.NJCS001` | `vcol11` |
| `zoujj` (zouj自定义档案) | `bd.customerdoc_001.001` | `vcol41` |
| `lrj002` (lrj尺码) | `bd.customerdoc_lrj002.lrj002` | `vcol12` |
| `lrj001` (lrj颜色) | `bd.customerdoc_lrj001.lrj001` | `vcol11` |
| `zrt01` (zrt颜色) | `bd.customerdoc_zrt01.zrt01` | `vcol46` |
| `LMM001` (李明敏-特征品牌) | `bd.customerdoc_lmm001.lmm001` | `vcol46` |
| `XYL001` (XYL的特征) | `bd.customerdoc_XYL001.XYL001` | `vcol32` |
| `sxdtzys` (施学达颜色) | `bd.customerdoc_sxdzdy.sxdzdy` | `vcol49` |
| `ld022` (小粒度尺寸) | `bd.customerdoc_ld004.ld004` | `vcol45` |
| `ld001_ps` (配送方式) | `bd.customerdoc_ld111.ld111` | `vcol39` |
| `xwl01` (xwl_尺码) | `bd.customerdoc_xwl01.xwl01` | `vcol47` |
| `ZZW_TZ01` (ZZW_TZ01) | `bd.customerdoc_ZZW_YS.ZZW_YS` | `vcol37` |
| `qjqys01` (秦俊琪特征-颜色) | `bd.customerdoc_qjq0001.qjq0001` | `vcol9` |
| `SJM01` (苏俊萌的特征) | `bd.customerdoc_5A001.5A001` | `vcol47` |
| `gjh001` (gjh颜色) | `bd.customerdoc_gjh001.gjh001` | `vcol17` |
| `Eleven_Asset_Class_Code` (Eleven资产类别编码) | `ampub.ambase.CategoryVO` | `vcol27` |
| `XWW001` (颜色XWW) | `bd.customerdoc_XWW001.XWW001` | `vcol8` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `WXPJP` (无锡潘俊鹏) | `bd.customerdoc_CPX.CPX` | `vcol50` |
| `wxc01` (衣服尺码特征-位雪纯) | `bd.customerdoc_25033101.25033101` | `vcol54` |
| `YS_ml` (颜色-毛蕾) | `bd.customerdoc_YS.YS` | `vcol6` |
| `xb` (性别1111) | `bd.customerdoc_123.123` | `vcol31` |
| `DLN002` (DLN型号) | `bd.customerdoc_DLN_002.DLN_002` | `vcol29` |
| `DS01` (DS颜色) | `bd.customerdoc_XF001.XF001` | `vcol2` |
| `wxwdc01` (wxwdc颜色) | `bd.customerdoc_wxwdc01.wxwdc01` | `vcol51` |
| `DS02` (DS尺码) | `bd.customerdoc_25033101.25033101` | `vcol3` |
| `wxwdc02` (颜色2) | `bd.customerdoc_wxwdc02.wxwdc02` | `vcol53` |
| `DLN001` (DLN颜色) | `bd.customerdoc_DLN_001.DLN_001` | `vcol28` |
| `szzlj01` (szzlj01) | `bd.customerdoc_zlj.zlj` | `vcol49` |
| `CL003` (CL自由项特征2) | `bd.customerdoc_CL01.CL01` | `vcol30` |
| `LZH0329` (0329CS) | `bd.customerdoc_LZH0329.LZH0329` | `vcol28` |
