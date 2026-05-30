# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12184.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | cbillid | cbillid | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |
| 3 | btoiaflag | btoiaflag | btoiaflag | char(1) |  |  | 'N' |
| 4 | dbilldate | dbilldate | dbilldate | char(19) |
| 5 | dmakedate | dmakedate | dmakedate | char(19) |
| 6 | iprintcount | iprintcount | iprintcount | number(38, 0) |  |  | 0 |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 10 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |