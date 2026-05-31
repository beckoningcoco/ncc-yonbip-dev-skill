# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8326.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | pk_relation | pk_relation | char(20) | √ |
| 2 | batchno | batchno | batchno | varchar2(20) |
| 3 | busimessage1 | busimessage1 | busimessage1 | varchar2(400) |
| 4 | busimessage2 | busimessage2 | busimessage2 | varchar2(400) |
| 5 | busimessage3 | busimessage3 | busimessage3 | varchar2(400) |
| 6 | des_billtype | des_billtype | des_billtype | varchar2(20) |  |  | '~' |
| 7 | des_busidate | des_busidate | des_busidate | char(19) |
| 8 | des_defdoc1 | des_defdoc1 | des_defdoc1 | varchar2(101) |
| 9 | des_defdoc2 | des_defdoc2 | des_defdoc2 | varchar2(101) |
| 10 | des_defdoc3 | des_defdoc3 | des_defdoc3 | varchar2(101) |
| 11 | des_group | des_group | des_group | varchar2(20) |  |  | '~' |
| 12 | des_operator | des_operator | des_operator | varchar2(20) |  |  | '~' |
| 13 | des_org | des_org | des_org | varchar2(20) |  |  | '~' |
| 14 | des_relationid | des_relationid | des_relationid | varchar2(50) |
| 15 | des_system | des_system | des_system | varchar2(50) |
| 16 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 17 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 18 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 19 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 20 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
| 21 | src_busidate | src_busidate | src_busidate | char(19) |
| 22 | src_defdoc1 | src_defdoc1 | src_defdoc1 | varchar2(101) |
| 23 | src_defdoc2 | src_defdoc2 | src_defdoc2 | varchar2(101) |
| 24 | src_defdoc3 | src_defdoc3 | src_defdoc3 | varchar2(101) |
| 25 | src_group | src_group | src_group | varchar2(20) |  |  | '~' |
| 26 | src_operator | src_operator | src_operator | varchar2(20) |  |  | '~' |
| 27 | src_org | src_org | src_org | varchar2(20) |  |  | '~' |
| 28 | src_relationid | src_relationid | src_relationid | varchar2(50) |
| 29 | src_system | src_system | src_system | varchar2(50) |
| 30 | sumflag | sumflag | sumflag | char(1) |
| 31 | des_freedef1 | des_freedef1 | des_freedef1 | varchar2(200) |
| 32 | des_freedef2 | des_freedef2 | des_freedef2 | varchar2(1000) |
| 33 | des_freedef3 | des_freedef3 | des_freedef3 | varchar2(200) |
| 34 | des_freedef4 | des_freedef4 | des_freedef4 | varchar2(200) |
| 35 | des_freedef5 | des_freedef5 | des_freedef5 | varchar2(200) |
| 36 | src_freedef1 | src_freedef1 | src_freedef1 | varchar2(200) |
| 37 | src_freedef2 | src_freedef2 | src_freedef2 | varchar2(1000) |
| 38 | src_freedef3 | src_freedef3 | src_freedef3 | varchar2(200) |
| 39 | src_freedef4 | src_freedef4 | src_freedef4 | varchar2(200) |
| 40 | src_freedef5 | src_freedef5 | src_freedef5 | varchar2(200) |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |