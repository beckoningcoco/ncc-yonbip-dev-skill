# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7675.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvoucherid | cvoucherid | cvoucherid | char(20) | √ |
| 2 | bcreated | bcreated | bcreated | char(1) |
| 3 | cperiod | cperiod | cperiod | char(7) |
| 4 | ibilltype | ibilltype | ibilltype | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 8 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 9 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 10 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 11 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |