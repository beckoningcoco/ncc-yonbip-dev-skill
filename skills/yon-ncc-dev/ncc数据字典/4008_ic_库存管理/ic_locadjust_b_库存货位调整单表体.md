# |<<

**库存货位调整单表体 (ic_locadjust_b / nc.vo.ic.m4q.entity.LocAdjustBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2919.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 货位调整单表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 6 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 11 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 12 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 13 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 14 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期(结束) (UFDateEnd) |
| 15 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期(结束) (UFDateEnd) |
| 16 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | dbizdate | 调整日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 19 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 20 | clocationid | 转出货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 21 | clocationinid | 转入货位 | clocationinid | varchar(20) |  | 货位 (rack) |
| 22 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 23 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 24 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 25 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 26 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 27 | cprojectstatusid | 项目阶段 | cprojectstatusid | varchar(50) |  | 字符串 (String) |
| 28 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 29 | ngrossnum | 毛重主数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 31 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 32 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 33 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 34 | ctplcustomerid | 货主客户 | ctplcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 35 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 36 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 37 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 38 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 39 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 45 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |