# |<<

**客户财务信息 (bd_custfinance / nc.vo.bd.cust.finance.CustFinanceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/439.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custfinance | 客户财务信息主键 | pk_custfinance | char(20) | √ | 主键 (UFID) |
| 2 | pk_customer | 客户基本信息 | pk_customer | char(0) | √ | 客户基本信息 (customer) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属财务组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_respdept1 | 专管部门 | pk_respdept1 | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_resppsn1 | 专管业务员 | pk_resppsn1 | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | pk_currtype1 | 默认交易币种 | pk_currtype1 | varchar(20) |  | 币种 (currtype) |
| 8 | pk_payterm | 默认收款协议 | pk_payterm | varchar(20) |  | 收款协议 (income) |
| 9 | ispromtesettlement | 是否催款 | ispromtesettlement | char(1) | √ | 布尔类型 (UFBoolean) | Y |
| 10 | cooperateflag | 是否协同 | cooperateflag | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 11 | innerctldeferdays | 内控账期延期天数 | innerctldeferdays | int |  | 整数 (Integer) |  | [0 , ] |
| 12 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |