# |<<

**盘点单子实体 (ic_invcount_b / nc.vo.ic.m4r.entity.InvCountBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2915.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cspecialbid | 盘点单表体主键 | cspecialbid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 6 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 8 | cbodywarehouseid | 表体仓库 | cbodywarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 9 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 14 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 15 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 16 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 17 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 18 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 19 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 20 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 21 | pk_batchcode | 批次号主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 22 | nonhandastnum | 账面数量 | nonhandastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nbarcodenum | 条码数量 | nbarcodenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nonhandnum | 账面主数量 | nonhandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ngrossnum | 账面毛重 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | ncountastnum | 盘点数量 | ncountastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ncountnum | 实盘主数量 | ncountnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ncountgrossnum | 盘点毛重 | ncountgrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | ndiffastnum | 差异数量 | ndiffastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | ndiffnum | 差异主数量 | ndiffnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | ndiffgrossnum | 差异毛重 | ndiffgrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nadjustastnum | 调整数量 | nadjustastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nadjustnum | 调整主数量 | nadjustnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nadjustgrossnum | 调整毛重 | nadjustgrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | ncostprice | 调整单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | ncostmny | 调整金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nkeeplosrate | 保管损失率 | nkeeplosrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | ndiffrate | 差异率 | ndiffrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | vreason | 原因 | vreason | varchar(100) |  | 字符串 (String) |
| 40 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 41 | iplancyc | 计划盘点周期 | iplancyc | int |  | 整数 (Integer) |
| 42 | ifactcyc | 实际盘点周期 | ifactcyc | int |  | 整数 (Integer) |
| 43 | vnotebody | 行备注 | vnotebody | varchar(50) |  | 字符串 (String) |
| 44 | dproducedate | 生产日期 | dproducedate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 45 | dvalidate | 失效日期 | dvalidate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 46 | pk_onhanddim | 结存纬度主键 | pk_onhanddim | varchar(20) |  | 主键 (UFID) |
| 47 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 48 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 49 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 50 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 51 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 52 | ctplcustomerid | 货主客户 | ctplcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 53 | nretailmny | 零售金额 | nretailmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 55 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 56 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 57 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 58 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 59 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 60 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 61 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 62 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 63 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 64 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 102 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 103 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 104 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 105 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 106 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 107 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 108 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 109 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 110 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 111 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 112 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 113 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |