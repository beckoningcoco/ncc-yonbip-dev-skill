# |<<

**促销价格调整单明细 (prm_adjpromote_b / nc.vo.price.adjustpromote.entity.AdjustPromoteItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4650.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjpromote_b | 促销价格调整单明细 | pk_adjpromote_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 5 | pk_marsaleclass | 物料销售分类 | pk_marsaleclass | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 6 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_custsaleclass | 客户销售分类 | pk_custsaleclass | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 9 | pk_custclass | 客户分类 | pk_custclass | varchar(20) |  | 客户基本分类 (custclass) |
| 10 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 11 | pk_channeltype | 渠道类型 | pk_channeltype | varchar(20) |  | 渠道类型 (channeltype) |
| 12 | pk_unit | 计量单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 13 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 14 | pk_qualitylevel | 质量等级 | pk_qualitylevel | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 15 | pk_areacl | 收货地区 | pk_areacl | varchar(20) |  | 地区分类 (areaclass) |
| 16 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 17 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 18 | pk_prodline | 产品线 | pk_prodline | varchar(20) |  | 产品线 (prodline) |
| 19 | nbaseprice | 基价 | nbaseprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nbasepricefactor | 基准折扣指数 | nbasepricefactor | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nbasepriceadd | 基准折扣加成 | nbasepriceadd | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | npricefactor | 价格指数 | npricefactor | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | npriceadd | 价格加成 | npriceadd | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nprice | 新价格 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | pk_pricetype | 价格项 | pk_pricetype | varchar(20) |  | 价格项 (prm_pricetype) |
| 26 | brelatebaseflag | 是否与基价相关 | brelatebaseflag | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | bclosedflag | 是否关闭 | bclosedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | tclosedtime | 关闭时间 | tclosedtime | char(19) |  | 日期时间 (UFDateTime) |
| 29 | vbnote | 行备注 | vbnote | varchar(181) |  | 字符串 (String) |
| 30 | pk_sendtype | 运输方式 | pk_sendtype | varchar(20) |  | 运输方式 (transporttype) |
| 31 | vsaleorgtype | 销售订单类型 | vsaleorgtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 32 | nsinglelimitnum | 单客户限量 | nsinglelimitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | ngarblimitnum | 抢占限量 | ngarblimitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
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