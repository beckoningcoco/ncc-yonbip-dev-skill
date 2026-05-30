# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initaccbook_b | pk_initaccbook_b | pk_initaccbook_b | char(20) | √ |
| 2 | accudep | accudep | accudep | number(28, 8) |
| 3 | accuworkloan | accuworkloan | accuworkloan | number(28, 8) |
| 4 | allworkloan | allworkloan | allworkloan | number(28, 8) |
| 5 | dep_end_date | dep_end_date | dep_end_date | char(19) |
| 6 | dep_start_date | dep_start_date | dep_start_date | char(19) |
| 7 | isimported | isimported | isimported | char(1) |
| 8 | ismodified | ismodified | ismodified | char(1) |
| 9 | laststate_flag | laststate_flag | laststate_flag | char(1) |
| 10 | localoriginvalue | localoriginvalue | localoriginvalue | number(28, 8) |
| 11 | naturemonth | naturemonth | naturemonth | number(38, 0) |
| 12 | netrating | netrating | netrating | number(28, 8) |
| 13 | netvalue | netvalue | netvalue | number(28, 8) |
| 14 | pk_card | pk_card | pk_card | varchar2(20) |  |  | '~' |
| 15 | pk_cardhistory | pk_cardhistory | pk_cardhistory | varchar2(20) |  |  | '~' |
| 16 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 17 | pk_depmethod | pk_depmethod | pk_depmethod | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_initaccbook | pk_initaccbook | pk_initaccbook | char(20) | √ |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | predevaluate | predevaluate | predevaluate | number(28, 8) |
| 23 | salvage | salvage | salvage | number(28, 8) |
| 24 | salvagerate | salvagerate | salvagerate | number(28, 8) |
| 25 | servicemonth | servicemonth | servicemonth | number(38, 0) |
| 26 | taxinput_flag | taxinput_flag | taxinput_flag | char(1) |
| 27 | usedmonth | usedmonth | usedmonth | number(38, 0) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |