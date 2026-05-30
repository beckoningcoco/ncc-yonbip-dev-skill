# |<<

**舍位条件 (iufo_balcond / nc.vo.iufo.balance.BalanceCondVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3397.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancecond | 舍位条件PK | pk_balancecond | char(20) | √ | 主键 (UFID) |
| 2 | condname | 条件名称 | condname | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | unitname | 计量单位 | unitname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | swbit | 舍位位数 | swbit | int |  | 整数 (Integer) |
| 5 | databit | 小数位位数 | databit | int |  | 整数 (Integer) |
| 6 | version | 数版本号 | version | int |  | 整数 (Integer) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |