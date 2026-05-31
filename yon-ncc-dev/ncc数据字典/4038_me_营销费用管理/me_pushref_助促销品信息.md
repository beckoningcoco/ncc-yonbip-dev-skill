# |<<

**助促销品信息 (me_pushref / nc.vo.me.matterapp.entity.PushSaleRef)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3619.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pushsale | 助促销品 | pk_pushsale | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 5 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 8 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | cprojectid | 项目 | cprojectid | varchar(50) |  | 字符串 (String) |
| 10 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 11 | csendstockorgid | 发货库存组织 | csendstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | csendstordocid | 发货库存仓库 | csendstordocid | varchar(20) |  | 仓库 (stordoc) |
| 13 | csendstockorgvid | 发货库存组织版本 | csendstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 14 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 16 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 17 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nprice | 主单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nitemdiscountrate | 单品折扣 | nitemdiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nnetprice | 主净价 | nnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nmny | 金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | creceiveorgid | 收货组织 | creceiveorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 24 | creceiveorgvid | 收货组织版本 | creceiveorgvid | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 25 | creceivedeptid | 收货部门 | creceivedeptid | varchar(20) |  | 组织_部门 (dept) |
| 26 | creceivedeptvid | 收货部门版本 | creceivedeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 27 | cemployeeid | 收货员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 28 | creceivecustid | 收货客户 | creceivecustid | varchar(20) |  | 客户基本信息 (customer) |
| 29 | creceiveaddrid | 收货地址 | creceiveaddrid | varchar(20) |  | 客户收货地址 (custaddress) |
| 30 | dsenddate | 计划发货日期 | dsenddate | char(19) |  | 日期 (UFDate) |
| 31 | ntotaloutnum | 累计出库数量 | ntotaloutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | boutendflag | 是否出库关闭 | boutendflag | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | vbnote | 备注 | vbnote | varchar(50) |  | 字符串 (String) |
| 34 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
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
| 45 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |