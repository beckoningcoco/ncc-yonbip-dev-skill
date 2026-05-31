# |<<

**价格调整单明细 (prm_adjustprice_b / nc.vo.price.adjustprice.entity.AdjustPriceBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4652.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustprice_b | 价格调整单明细 | pk_adjustprice_b | char(20) | √ | 主键 (UFID) |
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
| 17 | noriginprice1 | 原价格1 | noriginprice1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | npricefactor1 | 价格指数1 | npricefactor1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | npriceadd1 | 价格加成1 | npriceadd1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nnewprice1 | 新价格1 | nnewprice1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | noriginprice2 | 原价格2 | noriginprice2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | npricefactor2 | 价格指数2 | npricefactor2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | npriceadd2 | 价格加成2 | npriceadd2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nnewprice2 | 新价格2 | nnewprice2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | noriginprice3 | 原价格3 | noriginprice3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | npricefactor3 | 价格指数3 | npricefactor3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | npriceadd3 | 价格加成3 | npriceadd3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nnewprice3 | 新价格3 | nnewprice3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | noriginprice4 | 原价格4 | noriginprice4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | npricefactor4 | 价格指数4 | npricefactor4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | npriceadd4 | 价格加成4 | npriceadd4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nnewprice4 | 新价格4 | nnewprice4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | noriginprice5 | 原价格5 | noriginprice5 | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | npricefactor5 | 价格指数5 | npricefactor5 | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | npriceadd5 | 价格加成5 | npriceadd5 | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nnewprice5 | 新价格5 | nnewprice5 | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | noriginprice6 | 原价格6 | noriginprice6 | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | npricefactor6 | 价格指数6 | npricefactor6 | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | npriceadd6 | 价格加成6 | npriceadd6 | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | nnewprice6 | 新价格6 | nnewprice6 | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | noriginprice7 | 原价格7 | noriginprice7 | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | npricefactor7 | 价格指数7 | npricefactor7 | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | npriceadd7 | 价格加成7 | npriceadd7 | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | nnewprice7 | 新价格7 | nnewprice7 | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | noriginprice8 | 原价格8 | noriginprice8 | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | npricefactor8 | 价格指数8 | npricefactor8 | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | npriceadd8 | 价格加成8 | npriceadd8 | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | nnewprice8 | 新价格8 | nnewprice8 | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | noriginprice9 | 原价格9 | noriginprice9 | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | npricefactor9 | 价格指数9 | npricefactor9 | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | npriceadd9 | 价格加成9 | npriceadd9 | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | nnewprice9 | 新价格9 | nnewprice9 | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | noriginprice10 | 原价格10 | noriginprice10 | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | npricefactor10 | 价格指数10 | npricefactor10 | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | npriceadd10 | 价格加成10 | npriceadd10 | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | nnewprice10 | 新价格10 | nnewprice10 | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | vbnote | 行备注 | vbnote | varchar(1024) |  | 备注 (Memo) |
| 58 | pk_sendtype | 运输方式 | pk_sendtype | varchar(20) |  | 运输方式 (transporttype) |
| 59 | vsaleorgtype | 销售订单类型 | vsaleorgtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 60 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
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
| 81 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 82 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 83 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 84 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 85 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 86 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 87 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 88 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 89 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 90 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |