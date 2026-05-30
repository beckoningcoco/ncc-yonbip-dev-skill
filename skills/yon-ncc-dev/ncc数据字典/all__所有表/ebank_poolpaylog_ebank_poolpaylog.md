# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7846.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_poolpaylog | pk_poolpaylog | pk_poolpaylog | char(20) | √ |
| 2 | billnum | billnum | billnum | varchar2(50) |
| 3 | downstate | downstate | downstate | varchar2(50) |
| 4 | down_date | down_date | down_date | char(19) |
| 5 | down_time | down_time | down_time | char(8) |
| 6 | msg | msg | msg | varchar2(50) |
| 7 | ordertype | ordertype | ordertype | varchar2(50) |
| 8 | padate | padate | padate | char(19) |
| 9 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 14 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 15 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 16 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 17 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 18 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 19 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 20 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 21 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 22 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 23 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 24 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 25 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 26 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 27 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 28 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 29 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 30 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 31 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 32 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |