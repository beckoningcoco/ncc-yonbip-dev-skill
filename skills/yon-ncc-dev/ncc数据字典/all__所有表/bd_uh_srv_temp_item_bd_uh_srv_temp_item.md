# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7248.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvtempitem | pk_srvtempitem | pk_srvtempitem | char(20) | √ |
| 2 | body_ris | body_ris | body_ris | varchar2(256) |
| 3 | days_ord | days_ord | days_ord | number(38, 0) |
| 4 | dt_srvtype | dt_srvtype | dt_srvtype | varchar2(50) |
| 5 | dt_useage | dt_useage | dt_useage | varchar2(50) |
| 6 | dt_usegenote | dt_usegenote | dt_usegenote | varchar2(50) |
| 7 | groupcode | groupcode | groupcode | varchar2(30) |
| 8 | note | note | note | varchar2(256) |
| 9 | ordnum | ordnum | ordnum | number(38, 0) |
| 10 | pk_dept | pk_dept | pk_dept | varchar2(20) |
| 11 | pk_dept_exec | pk_dept_exec | pk_dept_exec | varchar2(20) |
| 12 | pk_freq | pk_freq | pk_freq | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_srv | pk_srv | pk_srv | varchar2(20) |  |  | '~' |
| 16 | pk_srvtemp | pk_srvtemp | pk_srvtemp | varchar2(50) |
| 17 | pk_srvtype | pk_srvtype | pk_srvtype | varchar2(20) |
| 18 | pk_useage | pk_useage | pk_useage | varchar2(20) |  |  | '~' |
| 19 | pk_usegenote | pk_usegenote | pk_usegenote | varchar2(20) |  |  | '~' |
| 20 | quan | quan | quan | number(10, 2) |
| 21 | sortno | sortno | sortno | number(38, 0) |
| 22 | unit_med | unit_med | unit_med | varchar2(50) |
| 23 | creationtime | creationtime | creationtime | char(19) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |