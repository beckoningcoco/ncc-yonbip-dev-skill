# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8628.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_handitemset | pk_handitemset | pk_handitemset | char(20) | √ |
| 2 | memo | memo | memo | varchar2(500) |
| 3 | orders | orders | orders | number(38, 0) |
| 4 | pk_group | pk_group | pk_group | char(20) |
| 5 | pk_handcond | pk_handcond | pk_handcond | varchar2(20) |
| 6 | pk_handitem | pk_handitem | pk_handitem | varchar2(20) |
| 7 | pk_handler | pk_handler | pk_handler | varchar2(500) |
| 8 | pk_org | pk_org | pk_org | char(20) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |