# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11122.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sampleplan | pk_sampleplan | pk_sampleplan | char(20) | √ |
| 2 | aql | aql | aql | number(28, 8) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | vchecklevel | vchecklevel | vchecklevel | varchar2(50) |
| 6 | vmemo | vmemo | vmemo | varchar2(50) |
| 7 | vplancode | vplancode | vplancode | varchar2(50) |
| 8 | vplanname | vplanname | vplanname | varchar2(300) |
| 9 | vplanname2 | vplanname2 | vplanname2 | varchar2(300) |
| 10 | vplanname3 | vplanname3 | vplanname3 | varchar2(300) |
| 11 | vplanname4 | vplanname4 | vplanname4 | varchar2(300) |
| 12 | vplanname5 | vplanname5 | vplanname5 | varchar2(300) |
| 13 | vplanname6 | vplanname6 | vplanname6 | varchar2(300) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |