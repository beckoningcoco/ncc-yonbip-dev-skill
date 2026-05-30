# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6971.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marasstframe | pk_marasstframe | pk_marasstframe | char(20) | √ |
| 2 | code | code | code | varchar2(40) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | fix1 | fix1 | fix1 | char(1) | √ |  | 'N' |
| 5 | fix2 | fix2 | fix2 | char(1) | √ |  | 'N' |
| 6 | fix3 | fix3 | fix3 | char(1) | √ |  | 'N' |
| 7 | fix4 | fix4 | fix4 | char(1) | √ |  | 'N' |
| 8 | fix5 | fix5 | fix5 | char(1) | √ |  | 'N' |
| 9 | fix100 | fix100 | fix100 | char(1) | √ |
| 10 | ispub | ispub | ispub | char(1) | √ |  | 'Y' |
| 11 | name | name | name | varchar2(200) | √ |
| 12 | name2 | name2 | name2 | varchar2(200) |
| 13 | name3 | name3 | name3 | varchar2(200) |
| 14 | name4 | name4 | name4 | varchar2(200) |
| 15 | name5 | name5 | name5 | varchar2(200) |
| 16 | name6 | name6 | name6 | varchar2(200) |
| 17 | pk_group | pk_group | pk_group | char(20) | √ |
| 18 | pk_org | pk_org | pk_org | char(20) | √ |
| 19 | vnote | vnote | vnote | varchar2(400) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |