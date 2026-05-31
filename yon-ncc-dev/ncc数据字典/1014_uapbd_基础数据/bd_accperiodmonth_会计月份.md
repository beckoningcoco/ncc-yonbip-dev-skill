# |<<

**会计月份 (bd_accperiodmonth / nc.vo.bd.period2.AccperiodmonthVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/315.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accperiodmonth | 会计月份主键 | pk_accperiodmonth | char(20) | √ | 主键 (UFID) |
| 2 | pk_accperiod | 所属会计期间 | pk_accperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 3 | pk_accperiodscheme | 会计期间方案 | pk_accperiodscheme | char(20) | √ | 会计期间方案 (accperiodscheme) |
| 4 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 5 | accperiodmth | 会计月份 | accperiodmth | varchar(3) |  | 主键 (UFID) |
| 6 | begindate | 开始日期 | begindate | char(19) |  | 日期 (UFDate) |
| 7 | enddate | 结束日期 | enddate | char(19) |  | 日期 (UFDate) |
| 8 | beginmonth | 开始月 | beginmonth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 9 | endmonth | 结束月 | endmonth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 10 | isadj | 是否为调整 | isadj | char(1) |  | 布尔类型 (UFBoolean) | N |
| 11 | yearmth | 年月组合信息 | yearmth | varchar(10) |  | 字符串 (String) |
| 12 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |