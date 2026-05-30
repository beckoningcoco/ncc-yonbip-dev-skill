# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11128.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_defdim | pk_defdim | pk_defdim | char(20) | √ |
| 2 | dimcode | dimcode | dimcode | varchar2(50) |
| 3 | dimname | dimname | dimname | varchar2(200) |
| 4 | dimname2 | dimname2 | dimname2 | varchar2(200) |
| 5 | dimname3 | dimname3 | dimname3 | varchar2(200) |
| 6 | dimname4 | dimname4 | dimname4 | varchar2(200) |
| 7 | dimname5 | dimname5 | dimname5 | varchar2(200) |
| 8 | dimname6 | dimname6 | dimname6 | varchar2(200) |
| 9 | dimtype | dimtype | dimtype | number(38, 0) |
| 10 | fathercode | fathercode | fathercode | varchar2(50) |
| 11 | fieldcode | fieldcode | fieldcode | varchar2(500) |
| 12 | format | format | format | number(38, 0) |
| 13 | formula | formula | formula | varchar2(2000) |
| 14 | isshowsub | isshowsub | isshowsub | char(1) |
| 15 | operator | operator | operator | varchar2(50) |
| 16 | pk_doc | pk_doc | pk_doc | varchar2(200) |
| 17 | pk_report | pk_report | pk_report | varchar2(50) |
| 18 | pk_reportdetail | pk_reportdetail | pk_reportdetail | varchar2(50) |
| 19 | sequence | sequence | sequence | varchar2(50) |
| 20 | showname | showname | showname | varchar2(200) |
| 21 | showname2 | showname2 | showname2 | varchar2(200) |
| 22 | showname3 | showname3 | showname3 | varchar2(200) |
| 23 | showname4 | showname4 | showname4 | varchar2(200) |
| 24 | showname5 | showname5 | showname5 | varchar2(200) |
| 25 | showname6 | showname6 | showname6 | varchar2(200) |
| 26 | specialdim | specialdim | specialdim | char(1) |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |