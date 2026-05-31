# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9505.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_comvouch_head | pk_comvouch_head | pk_comvouch_head | char(20) | √ |
| 2 | cancelstate | cancelstate | cancelstate | char(1) |
| 3 | creditname | creditname | creditname | varchar2(50) |
| 4 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 5 | debitname | debitname | debitname | varchar2(50) |
| 6 | digest | digest | digest | varchar2(50) |
| 7 | input_date | input_date | input_date | char(19) |
| 8 | parent_id | parent_id | parent_id | varchar2(20) |  |  | '~' |
| 9 | pk_dxtype | pk_dxtype | pk_dxtype | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 13 | unprojectname | unprojectname | unprojectname | varchar2(500) |
| 14 | vouchorder | vouchorder | vouchorder | varchar2(50) |
| 15 | vouchtype | vouchtype | vouchtype | varchar2(50) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |