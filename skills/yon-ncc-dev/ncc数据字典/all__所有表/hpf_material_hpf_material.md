# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8720.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_material | pk_material | pk_material | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | format | format | format | varchar2(100) |
| 4 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 5 | maketime | maketime | maketime | char(19) |
| 6 | memo | memo | memo | varchar2(200) |
| 7 | name | name | name | varchar2(100) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | syscode | syscode | syscode | varchar2(20) |  |  | '~' |
| 12 | unitcode | unitcode | unitcode | varchar2(100) |
| 13 | unitname | unitname | unitname | varchar2(100) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |