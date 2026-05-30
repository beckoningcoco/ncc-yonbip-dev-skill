# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7981.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtapp_cfield | pk_mtapp_cfield | pk_mtapp_cfield | char(20) | √ |
| 2 | adjust_enable | adjust_enable | adjust_enable | char(1) | √ |
| 3 | fieldcode | fieldcode | fieldcode | varchar2(50) | √ |
| 4 | fieldname | fieldname | fieldname | varchar2(200) | √ |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(50) | √ |  | '~' |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |