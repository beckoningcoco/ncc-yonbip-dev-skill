# |<<

**供应商采购信息 (bd_supstock / nc.vo.bd.supplier.stock.SupStockVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/988.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supstock | 供应商采购信息主键 | pk_supstock | char(20) | √ | 主键 (UFID) |
| 2 | pk_supplier | 供应商基本信息 | pk_supplier | char(0) | √ | 供应商基本信息 (supplier) |
| 3 | pk_org | 所属采购组织 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | respdept | 专管部门 | respdept | varchar(20) |  | 组织_部门 (dept) |
| 6 | respperson | 专管业务员 | respperson | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | ordertypedefault | 默认订单类型 | ordertypedefault | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | startdate | 合作期限从 | startdate | char(19) |  | 日期 (UFDate) |
| 9 | enddate | 合作期限到 | enddate | char(19) |  | 日期 (UFDate) |
| 10 | currencydefault | 默认交易币种 | currencydefault | varchar(20) |  | 币种 (currtype) |
| 11 | paytermdefault | 默认付款协议 | paytermdefault | varchar(20) |  | 付款协议 (payment) |
| 12 | pk_tradeterm | 贸易术语 | pk_tradeterm | varchar(20) |  | 贸易术语 (incoterm) |
| 13 | billingsup | 开票供应商 | billingsup | varchar(20) |  | 供应商基本信息 (supplier) |
| 14 | pk_gathering | 收款供应商 | pk_gathering | varchar(20) |  | 供应商基本信息 (supplier) |
| 15 | issuesup | 发货供应商 | issuesup | varchar(20) |  | 供应商基本信息 (supplier) |
| 16 | shippingtype | 运输方式 | shippingtype | varchar(20) |  | 运输方式 (transporttype) |
| 17 | orderfreezeflag | 订单冻结 | orderfreezeflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 18 | validatedate | 合格有效期至 | validatedate | char(19) |  | 日期时间 (UFDateTime) |
| 19 | supgrade | 供应商等级 | supgrade | varchar(20) |  | 等级信息 (supplier_grade) |
| 20 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 50 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 51 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 52 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 53 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |