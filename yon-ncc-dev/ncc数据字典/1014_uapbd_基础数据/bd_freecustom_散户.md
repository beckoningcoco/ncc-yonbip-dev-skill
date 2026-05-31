# |<<

**散户 (bd_freecustom / nc.vo.bd.freecustom.FreeCustomVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/848.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freecustom | 散户的主键 | pk_freecustom | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | simplename | 简称 | simplename | varchar(200) |  | 字符串 (String) |
| 7 | foreignname | 外文名称 | foreignname | varchar(200) |  | 字符串 (String) |
| 8 | bank | 开户银行 | bank | varchar(20) |  | 银行档案 (bankdoc) |
| 9 | bankaddress | 银行地址 | bankaddress | varchar(200) |  | 字符串 (String) |
| 10 | bankaccount | 银行帐号 | bankaccount | varchar(200) |  | 字符串 (String) |
| 11 | personcode | 纳税人登记号 | personcode | varchar(200) |  | 字符串 (String) |
| 12 | address | 地址 | address | varchar(200) |  | 字符串 (String) |
| 13 | plinkman | 联系人 | plinkman | varchar(200) |  | 字符串 (String) |
| 14 | linkphone | 联系电话 | linkphone | varchar(200) |  | 字符串 (String) |
| 15 | dataoriginflag | 分布式字段 | dataoriginflag | int |  | 整数 (Integer) |
| 16 | pk_customsupplier | 客商 | pk_customsupplier | varchar(20) |  | 客商 (custsupplier) |
| 17 | accountproperty | 账户性质 | accountproperty | int |  | 账户性质 (accountproperty) |  | 0=公司; |