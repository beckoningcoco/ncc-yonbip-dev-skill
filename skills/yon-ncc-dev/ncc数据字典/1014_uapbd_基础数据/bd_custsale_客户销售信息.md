# |<<

**客户销售信息 (bd_custsale / nc.vo.bd.cust.saleinfo.CustsaleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/448.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custsale | 客户销售信息主键 | pk_custsale | char(20) | √ | 主键 (UFID) |
| 2 | pk_customer | 客户基本信息 | pk_customer | char(0) | √ | 客户基本信息 (customer) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属销售组织 | pk_org | char(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 5 | pk_financeorg | 结算财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_receiveorg | 应收组织 | pk_receiveorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_liabilitycenter | 责任组织 | pk_liabilitycenter | varchar(20) |  | 利润中心 (profitcenter) |
| 8 | respdept | 专管部门 | respdept | varchar(20) |  | 组织_部门 (dept) |
| 9 | respperson | 专管业务员 | respperson | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | pk_custsaleclass | 客户销售分类 | pk_custsaleclass | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 11 | ordertypedefault | 默认订单类型 | ordertypedefault | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | pk_tradeterm | 贸易术语 | pk_tradeterm | varchar(20) |  | 贸易术语 (incoterm) |
| 13 | billingcust | 开票客户 | billingcust | varchar(20) |  | 客户基本信息 (customer) |
| 14 | pk_paycust | 付款客户 | pk_paycust | varchar(20) |  | 客户基本信息 (customer) |
| 15 | issuecust | 收货客户 | issuecust | varchar(20) |  | 客户基本信息 (customer) |
| 16 | shippingtype | 运输方式 | shippingtype | varchar(20) |  | 运输方式 (transporttype) |
| 17 | currencydefault | 默认交易币种 | currencydefault | varchar(20) |  | 币种 (currtype) |
| 18 | paytermdefault | 默认收款协议 | paytermdefault | varchar(20) |  | 收款协议 (income) |
| 19 | discountrate | 扣率 | discountrate | decimal(20, 8) |  | 数值 (UFDouble) |
| 20 | prepaidratio | 预收款比例 | prepaidratio | smallint |  | 整数 (Integer) |  | [0 , 100] |
| 21 | channel | 渠道类型 | channel | varchar(20) |  | 渠道类型 (channeltype) |
| 22 | stockpriceratio | 物料最低售价比例 | stockpriceratio | smallint |  | 整数 (Integer) | 100 | [0 , 100] |
| 23 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |