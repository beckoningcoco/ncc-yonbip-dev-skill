# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8787.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prove_template | pk_prove_template | pk_prove_template | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | content | content | content | blob |
| 4 | customflag | customflag | customflag | char(1) |
| 5 | enable | enable | enable | char(1) |
| 6 | isgrouptemp | isgrouptemp | isgrouptemp | varchar2(1) |
| 7 | memo | memo | memo | varchar2(50) |
| 8 | name | name | name | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_prove_type | pk_prove_type | pk_prove_type | varchar2(20) |  |  | '~' |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |