# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9857.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbindid | cbindid | cbindid | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 4 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 5 | cmohid | cmohid | cmohid | char(20) |
| 6 | cmoid | cmoid | cmoid | char(20) |
| 7 | cserialcodeid | cserialcodeid | cserialcodeid | char(20) |
| 8 | dmakedate | dmakedate | dmakedate | char(19) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | pk_wr_serialno | pk_wr_serialno | pk_wr_serialno | char(20) |
| 13 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 14 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 15 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 16 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 17 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 18 | vbatchcodeid | vbatchcodeid | vbatchcodeid | char(20) |
| 19 | vmobillcode | vmobillcode | vmobillcode | varchar2(50) |
| 20 | vmorowno | vmorowno | vmorowno | varchar2(50) |
| 21 | vserialcode | vserialcode | vserialcode | varchar2(40) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |