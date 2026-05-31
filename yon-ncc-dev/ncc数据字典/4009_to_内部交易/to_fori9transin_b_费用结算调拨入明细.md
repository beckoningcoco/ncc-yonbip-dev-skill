# |<<

**费用结算调拨入明细 (to_fori9transin_b / nc.vo.to.m4552.entity.ForI9TransInItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5795.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 费用结算调拨入明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cinventoryid | 物料 | cinventoryid | char(20) |  | 主键 (UFID) |
| 4 | cinventoryvid | 物料版本 | cinventoryvid | char(20) |  | 主键 (UFID) |
| 5 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 6 | nmny | 本币金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 8 | nadjustnum | 调整数量 | nadjustnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | cadjustbillitemid | 调整单据分录 | cadjustbillitemid | char(20) |  | 主键 (UFID) |
| 10 | cadjustbillid | 调整单据 | cadjustbillid | char(20) |  | 主键 (UFID) |
| 11 | ncostfactor1 | 成本要素1金额 | ncostfactor1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | ncostfactor2 | 成本要素2金额 | ncostfactor2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ncostfactor3 | 成本要素3金额 | ncostfactor3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ncostfactor4 | 成本要素4金额 | ncostfactor4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | ncostfactor5 | 成本要素5金额 | ncostfactor5 | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ncostfactor6 | 成本要素6金额 | ncostfactor6 | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ncostfactor7 | 成本要素7金额 | ncostfactor7 | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ncostfactor8 | 成本要素8金额 | ncostfactor8 | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ncostfactor9 | 成本要素9金额 | ncostfactor9 | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ncostfactor10 | 成本要素10金额 | ncostfactor10 | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ncostfactor11 | 成本要素11金额 | ncostfactor11 | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | ncostfactor12 | 成本要素12金额 | ncostfactor12 | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ncostfactor13 | 成本要素13金额 | ncostfactor13 | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ncostfactor14 | 成本要素14金额 | ncostfactor14 | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ncostfactor15 | 成本要素15金额 | ncostfactor15 | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | ncostfactor16 | 成本要素16金额 | ncostfactor16 | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ncostfactor17 | 成本要素17金额 | ncostfactor17 | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ncostfactor18 | 成本要素18金额 | ncostfactor18 | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | ncostfactor19 | 成本要素19金额 | ncostfactor19 | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | ncostfactor20 | 成本要素20金额 | ncostfactor20 | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | cprofitcenterid | 利润中心 | cprofitcenterid | char(20) |  | 主键 (UFID) |
| 32 | cprofitcentervid | 利润中心版本 | cprofitcentervid | char(20) |  | 主键 (UFID) |
| 33 | cvendorid | 供应商 | cvendorid | char(20) |  | 主键 (UFID) |
| 34 | cprojectid | 项目 | cprojectid | char(20) |  | 主键 (UFID) |
| 35 | cproductorid | 生产厂商 | cproductorid | char(20) |  | 主键 (UFID) |
| 36 | vfirsttype | 源头单据类型 | vfirsttype | varchar(50) |  | 字符串 (String) |
| 37 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 38 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 39 | cfirstid | 源头单据主键 | cfirstid | varchar(20) |  | 字符串 (String) |
| 40 | cfirstbid | 源头单据分录主键 | cfirstbid | varchar(20) |  | 字符串 (String) |
| 41 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 42 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 43 | pk_org | 成本域 | pk_org | char(20) |  | 主键 (UFID) |
| 44 | cunitid | 主单位 | cunitid | char(20) |  | 主键 (UFID) |
| 45 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 46 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 47 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 48 | norigmny | 无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | nnosubtax | 不可抵扣金额 | nnosubtax | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 51 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 52 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 53 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 54 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 55 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 56 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 57 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 58 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 59 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 60 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 61 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 102 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 103 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 104 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 105 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 106 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 107 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 108 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 109 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 110 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |