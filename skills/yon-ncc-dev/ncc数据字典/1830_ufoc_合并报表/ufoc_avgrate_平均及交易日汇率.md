# |<<

**平均及交易日汇率 (ufoc_avgrate / nc.vo.ufoc.avgrateinfo.AvgRateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5862.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_avgrate | 主键 | pk_avgrate | char(20) | √ | 主键 (UFID) |
| 2 | pk_accperiodscheme | 会计期间方案 | pk_accperiodscheme | varchar(20) |  | 会计期间方案 (accperiodscheme) |
| 3 | pk_accperiodmonth | 会计月份主键 | pk_accperiodmonth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 4 | pk_accperiod | 会计期间主键 | pk_accperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 5 | finalrate | 期末汇率 | finalrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | periodrate | 期间汇率 | periodrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | monthrate | 会计月平均汇率 | monthrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | quarterrate | 会计季平均汇率 | quarterrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | halfyearrate | 会计半年平均汇率 | halfyearrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | yearrate | 会计年平均汇率 | yearrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | rate1 | 日汇率项目1 | rate1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | rate2 | 日汇率项目2 | rate2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | rate3 | 日汇率项目3 | rate3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | rate4 | 日汇率项目4 | rate4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | rate5 | 日汇率项目5 | rate5 | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | rate6 | 日汇率项目6 | rate6 | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | rate7 | 日汇率项目7 | rate7 | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | rate8 | 日汇率项目8 | rate8 | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | rate9 | 日汇率项目9 | rate9 | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | rate10 | 日汇率项目10 | rate10 | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | rate11 | 日汇率项目11 | rate11 | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | rate12 | 日汇率项目12 | rate12 | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | rate13 | 日汇率项目13 | rate13 | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | rate14 | 日汇率项目14 | rate14 | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | rate15 | 日汇率项目15 | rate15 | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | rate16 | 日汇率项目16 | rate16 | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | rate17 | 日汇率项目17 | rate17 | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | rate18 | 日汇率项目18 | rate18 | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | rate19 | 日汇率项目19 | rate19 | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | rate20 | 日汇率项目20 | rate20 | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 32 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 33 | pk_currinfo | 外币汇率 | pk_currinfo | varchar(20) |  | 外币汇率 (currinfo) |
| 34 | ratemonth | 会计月份 | ratemonth | char(2) |  | 字符串 (String) |
| 35 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |