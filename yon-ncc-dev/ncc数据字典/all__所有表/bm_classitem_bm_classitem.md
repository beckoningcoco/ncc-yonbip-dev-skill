# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7346.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_classitem | pk_classitem | pk_classitem | char(20) | √ |
| 2 | category_id | category_id | category_id | varchar2(20) |
| 3 | clearflag | clearflag | clearflag | char(1) | √ |
| 4 | cperiod | cperiod | cperiod | char(2) |
| 5 | cyear | cyear | cyear | char(4) |
| 6 | destitemcol | destitemcol | destitemcol | varchar2(20) |
| 7 | destitempk | destitempk | destitempk | varchar2(20) |
| 8 | hrssdisplay | hrssdisplay | hrssdisplay | char(1) | √ |
| 9 | icomputeseq | icomputeseq | icomputeseq | number(38, 0) | √ |
| 10 | idisplayseq | idisplayseq | idisplayseq | number(38, 0) | √ |
| 11 | iflddecimal | iflddecimal | iflddecimal | number(38, 0) |
| 12 | ifldwidth | ifldwidth | ifldwidth | number(38, 0) |
| 13 | ifromflag | ifromflag | ifromflag | number(38, 0) |
| 14 | isassigned | isassigned | isassigned | char(1) |
| 15 | issysformula | issysformula | issysformula | char(1) | √ |
| 16 | istransfer | istransfer | istransfer | char(1) | √ |
| 17 | itemkey | itemkey | itemkey | varchar2(20) | √ |
| 18 | modifyflag | modifyflag | modifyflag | char(1) |
| 19 | name | name | name | varchar2(128) |
| 20 | name2 | name2 | name2 | varchar2(128) |
| 21 | name3 | name3 | name3 | varchar2(128) |
| 22 | name4 | name4 | name4 | varchar2(128) |
| 23 | name5 | name5 | name5 | varchar2(128) |
| 24 | name6 | name6 | name6 | varchar2(128) |
| 25 | pk_bm_class | pk_bm_class | pk_bm_class | char(20) | √ |
| 26 | pk_bm_item | pk_bm_item | pk_bm_item | char(20) | √ |
| 27 | pk_group | pk_group | pk_group | char(20) | √ |
| 28 | pk_org | pk_org | pk_org | char(20) | √ |
| 29 | round_type | round_type | round_type | number(38, 0) |
| 30 | showflag | showflag | showflag | char(1) |
| 31 | vformula | vformula | vformula | varchar2(4000) |
| 32 | vformulastr | vformulastr | vformulastr | varchar2(4000) |
| 33 | creationtime | creationtime | creationtime | char(19) |
| 34 | creator | creator | creator | varchar2(20) |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |