# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8322.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operatinglog | pk_operatinglog | pk_operatinglog | char(20) | √ |
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
| 16 | initflag | initflag | initflag | char(1) |
| 17 | operateflag | operateflag | operateflag | number(38, 0) |
| 18 | opmessage | opmessage | opmessage | varchar2(2000) |
| 19 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 20 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) | √ |  | 0 |
| 21 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 22 | saga_status | saga_status | saga_status | number(38, 0) | √ |  | 0 |
| 23 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
| 24 | src_busidate | src_busidate | src_busidate | char(19) |
| 25 | src_defdoc1 | src_defdoc1 | src_defdoc1 | varchar2(101) |
| 26 | src_defdoc2 | src_defdoc2 | src_defdoc2 | varchar2(101) |
| 27 | src_defdoc3 | src_defdoc3 | src_defdoc3 | varchar2(101) |
| 28 | src_group | src_group | src_group | varchar2(20) |  |  | '~' |
| 29 | src_operator | src_operator | src_operator | varchar2(20) |  |  | '~' |
| 30 | src_org | src_org | src_org | varchar2(20) |  |  | '~' |
| 31 | src_relationid | src_relationid | src_relationid | varchar2(50) |
| 32 | src_system | src_system | src_system | varchar2(50) |
| 33 | sumflag | sumflag | sumflag | char(1) |
| 34 | des_freedef1 | des_freedef1 | des_freedef1 | varchar2(200) |
| 35 | des_freedef2 | des_freedef2 | des_freedef2 | varchar2(1000) |
| 36 | des_freedef3 | des_freedef3 | des_freedef3 | varchar2(200) |
| 37 | des_freedef4 | des_freedef4 | des_freedef4 | varchar2(200) |
| 38 | des_freedef5 | des_freedef5 | des_freedef5 | varchar2(200) |
| 39 | src_freedef1 | src_freedef1 | src_freedef1 | varchar2(200) |
| 40 | src_freedef2 | src_freedef2 | src_freedef2 | varchar2(1000) |
| 41 | src_freedef3 | src_freedef3 | src_freedef3 | varchar2(200) |
| 42 | src_freedef4 | src_freedef4 | src_freedef4 | varchar2(200) |
| 43 | src_freedef5 | src_freedef5 | src_freedef5 | varchar2(200) |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |