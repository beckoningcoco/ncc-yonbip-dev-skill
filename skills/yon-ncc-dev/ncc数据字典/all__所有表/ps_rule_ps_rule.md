# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10851.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | pk_rule | pk_rule | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | code | code | code | varchar2(50) |
| 4 | dbilldate | dbilldate | dbilldate | char(19) |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |
| 6 | memo | memo | memo | varchar2(181) |
| 7 | name | name | name | varchar2(50) |
| 8 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | prioritydegree | prioritydegree | prioritydegree | number(38, 0) |
| 13 | useagemny | useagemny | useagemny | number(28, 8) |
| 14 | creationtime | creationtime | creationtime | varchar2(50) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |