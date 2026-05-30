# |<<

**基准折扣表明细 (prm_basediscount / nc.vo.price.discount.entity.BaseDiscountDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4653.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_basediscount | 基准折扣表主键 | pk_basediscount | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_basediscountdef | 基准折扣表定义主键 | pk_basediscountdef | varchar(20) | √ | 主键 (UFID) |
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
| 17 | pk_prodline | 生产线 | pk_prodline | varchar(20) |  | 产品线 (prodline) |
| 18 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 19 | pk_adjdiscount | 基准折扣调整单主键 | pk_adjdiscount | varchar(20) |  | 主键 (UFID) |
| 20 | pk_adjdiscount_b | 基准折扣调整单字表主键 | pk_adjdiscount_b | varchar(20) |  | 主键 (UFID) |
| 21 | dmodifydate | 修改日期 | dmodifydate | char(19) | √ | 日期 (UFDate) |
| 22 | nbasepricefactor | 基准折扣指数 | nbasepricefactor | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nbasepriceadd | 基准折扣加成 | nbasepriceadd | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | caskunicode | 询价优先码 | caskunicode | char(15) |  | 字符串 (String) |
| 25 | pk_tariffdef | 价目表 | pk_tariffdef | varchar(20) | √ | 价目表定义 (TariffDefHVO) |
| 26 | materialinnercode | 物料内部码 | materialinnercode | varchar(230) |  | 字符串 (String) |
| 27 | customerinnercode | 客户内部码 | customerinnercode | varchar(230) |  | 字符串 (String) |
| 28 | areaclinnercode | 地区分类内部码 | areaclinnercode | varchar(230) |  | 字符串 (String) |
| 29 | pk_sendtype | 运输方式 | pk_sendtype | varchar(20) |  | 运输方式 (transporttype) |
| 30 | vsaleorgtype | 销售订单类型 | vsaleorgtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 31 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 32 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 33 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 34 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 35 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 36 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 37 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 38 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 39 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 41 | modifier | 修改人 | modifier | varchar(20) | √ | 用户 (user) |