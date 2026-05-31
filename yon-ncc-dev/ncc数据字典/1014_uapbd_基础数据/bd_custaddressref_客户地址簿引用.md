# |<<

**客户地址簿引用 (bd_custaddressref / nc.vo.bd.cust.custaddress.CustaddressrefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/432.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_address | 地址簿主键 | pk_address | varchar(20) | √ | 地址簿 (address) |
| 2 | reftablename | 引用表名 | reftablename | varchar(50) | √ | 字符串 (String) |
| 3 | reffieldname | 引用字段名 | reffieldname | varchar(20) | √ | 主键 (UFID) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_customer | 客户主键 | pk_customer | varchar(20) | √ | 客户基本信息 (customer) |
| 7 | pk_custaddress | 客户收货地址主键 | pk_custaddress | varchar(20) |  | 客户收货地址 (custaddress) |
| 8 | isupdated | 是否更新引用 | isupdated | char(1) |  | 布尔类型 (UFBoolean) |