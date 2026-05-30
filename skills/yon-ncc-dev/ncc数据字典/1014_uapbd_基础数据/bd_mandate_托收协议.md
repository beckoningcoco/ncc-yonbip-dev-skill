# |<<

**托收协议 (bd_mandate / nc.vo.bd.mandate.MandateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/875.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mandate | 托收协议主键 | pk_mandate | char(20) | √ | 主键 (UFID) |
| 2 | pk_reference | 引用托收协议 | pk_reference | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 5 | id | 托收协议ID | id | varchar(50) | √ | 字符串 (String) |
| 6 | version | 版本 | version | varchar(50) |  | 字符串 (String) |
| 7 | signplace | 签字地点 | signplace | varchar(200) | √ | 字符串 (String) |
| 8 | signdate | 签字日期 | signdate | char(19) | √ | 日期 (UFDate) |
| 9 | tradetype | 交易分类 | tradetype | int | √ | 交易分类 (tradetype) | 0 | 0=一次性; |