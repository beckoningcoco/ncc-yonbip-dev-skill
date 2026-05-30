# |<<

**促销价格实体 (prm_promoteprice / nc.vo.price.promoteprice.PromotePriceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4669.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_promoteprice | 促销价格实体 | pk_promoteprice | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_tariffdef | 价目表 | pk_tariffdef | varchar(20) |  | 价目表定义 (TariffDefHVO) |
| 5 | cbelongsaleorgid | 价目表所属销售组织 | cbelongsaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | pk_prodline | 产品线 | pk_prodline | varchar(20) |  | 产品线 (prodline) |
| 7 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 8 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 10 | pk_marsaleclass | 物料销售分类 | pk_marsaleclass | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 11 | pk_qualitylevel | 质量等级 | pk_qualitylevel | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 12 | pk_channeltype | 渠道类型 | pk_channeltype | varchar(20) |  | 渠道类型 (channeltype) |
| 13 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 14 | pk_custclass | 客户分类 | pk_custclass | varchar(20) |  | 客户基本分类 (custclass) |
| 15 | pk_custsaleclass | 客户销售分类 | pk_custsaleclass | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 16 | pk_areacl | 收货地区 | pk_areacl | varchar(20) |  | 地区分类 (areaclass) |
| 17 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 18 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 19 | pk_unit | 计量单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 20 | pk_pricetype | 价格项 | pk_pricetype | varchar(20) |  | 价格项 (prm_pricetype) |
| 21 | brelatebaseflag | 是否与基价相关 | brelatebaseflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | npricefactor | 价格指数 | npricefactor | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | npriceadd | 价格加成 | npriceadd | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nprice | 新价格 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | dbegindate | 生效日期 | dbegindate | varchar(19) |  | 日期时间 (UFDateTime) |
| 26 | tbegintime | 生效时间 | tbegintime | varchar(19) |  | 日期时间 (UFDateTime) |
| 27 | denddate | 失效日期 | denddate | varchar(19) |  | 日期时间 (UFDateTime) |
| 28 | tendtime | 失效时间 | tendtime | varchar(19) |  | 日期时间 (UFDateTime) |
| 29 | bclosedflag | 是否关闭 | bclosedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | tclosedtime | 关闭时间 | tclosedtime | varchar(19) |  | 日期时间 (UFDateTime) |
| 31 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 32 | pk_adjpromote | 促销价格调整单主表 | pk_adjpromote | varchar(20) |  | 字符串 (String) |
| 33 | pk_adjpromote_b | 促销价格调整单子表 | pk_adjpromote_b | varchar(20) |  | 字符串 (String) |
| 34 | dmodifydate | 修改日期 | dmodifydate | varchar(19) |  | 日期 (UFDate) |
| 35 | caskunicode | 询价优先码 | caskunicode | varchar(27) |  | 字符串 (String) |
| 36 | fbasediscountflag | 基准折扣表所属销售组织 | fbasediscountflag | int |  | 显示方式 (showpattern) |  | 1=本销售组织; |