# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13051.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpdict | pk_hpdict | pk_hpdict | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | dictname | dictname | dictname | varchar2(50) |
| 4 | dicttype | dicttype | dicttype | varchar2(30) |
| 5 | hiscode | hiscode | hiscode | varchar2(30) |
| 6 | hisname | hisname | hisname | varchar2(50) |
| 7 | mnecode | mnecode | mnecode | varchar2(30) |
| 8 | name | name | name | varchar2(50) |
| 9 | note | note | note | varchar2(256) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_hp | pk_hp | pk_hp | varchar2(20) |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |