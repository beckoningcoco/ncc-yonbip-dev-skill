# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10797.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlebill | pk_settlebill | pk_settlebill | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |
| 3 | btoia | btoia | btoia | char(1) |  |  | 'N' |
| 4 | bvirtualsettle | bvirtualsettle | bvirtualsettle | char(1) |  |  | 'N' |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |
| 6 | dbilldate | dbilldate | dbilldate | char(19) |
| 7 | dmakedate | dmakedate | dmakedate | char(19) |
| 8 | fsettletype | fsettletype | fsettletype | number(38, 0) |
| 9 | iprintcount | iprintcount | iprintcount | number(38, 0) |  |  | 0 |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 13 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 14 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 15 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 16 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 17 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |