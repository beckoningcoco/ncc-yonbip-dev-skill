# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9119.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralhid | cgeneralhid | cgeneralhid | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | dbilldate | dbilldate | dbilldate | char(19) |
| 4 | execflag | execflag | execflag | char(1) |
| 5 | executiontime | executiontime | executiontime | char(19) |
| 6 | executor | executor | executor | varchar2(20) |  |  | '~' |
| 7 | iprintcount | iprintcount | iprintcount | number(38, 0) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |