# |<<

**交易代码 (bd_transactioncode / nc.vo.bd.transactioncode.TransactioncodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1013.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transactioncode | 交易代码主键 | pk_transactioncode | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_country | 国家编码 | pk_country | varchar(20) | √ | 国家地区 (countryzone) |
| 5 | code | 交易代码 | code | varchar(50) |  | 字符串 (String) |
| 6 | description | 描述 | description | varchar(200) |  | 字符串 (String) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |