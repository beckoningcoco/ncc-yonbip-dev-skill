# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8330.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sumrelation | pk_sumrelation | pk_sumrelation | char(20) | √ |
| 2 | des_billtype | des_billtype | des_billtype | varchar2(20) |  |  | '~' |
| 3 | des_busidate | des_busidate | des_busidate | char(19) |
| 4 | des_defdoc1 | des_defdoc1 | des_defdoc1 | varchar2(101) |
| 5 | des_defdoc2 | des_defdoc2 | des_defdoc2 | varchar2(101) |
| 6 | des_defdoc3 | des_defdoc3 | des_defdoc3 | varchar2(101) |
| 7 | des_group | des_group | des_group | varchar2(20) |  |  | '~' |
| 8 | des_operator | des_operator | des_operator | varchar2(20) |  |  | '~' |
| 9 | des_org | des_org | des_org | varchar2(20) |  |  | '~' |
| 10 | des_relationid | des_relationid | des_relationid | varchar2(50) |
| 11 | des_system | des_system | des_system | varchar2(50) |
| 12 | groupid | groupid | groupid | varchar2(50) |
| 13 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
| 14 | src_busidate | src_busidate | src_busidate | char(19) |
| 15 | src_defdoc1 | src_defdoc1 | src_defdoc1 | varchar2(101) |
| 16 | src_defdoc2 | src_defdoc2 | src_defdoc2 | varchar2(101) |
| 17 | src_defdoc3 | src_defdoc3 | src_defdoc3 | varchar2(101) |
| 18 | src_group | src_group | src_group | varchar2(20) |  |  | '~' |
| 19 | src_operator | src_operator | src_operator | varchar2(20) |  |  | '~' |
| 20 | src_org | src_org | src_org | varchar2(20) |  |  | '~' |
| 21 | src_relationid | src_relationid | src_relationid | varchar2(50) |
| 22 | src_system | src_system | src_system | varchar2(50) |
| 23 | des_freedef1 | des_freedef1 | des_freedef1 | varchar2(200) |
| 24 | des_freedef2 | des_freedef2 | des_freedef2 | varchar2(200) |
| 25 | des_freedef3 | des_freedef3 | des_freedef3 | varchar2(200) |
| 26 | des_freedef4 | des_freedef4 | des_freedef4 | varchar2(200) |
| 27 | des_freedef5 | des_freedef5 | des_freedef5 | varchar2(200) |
| 28 | src_freedef1 | src_freedef1 | src_freedef1 | varchar2(200) |
| 29 | src_freedef2 | src_freedef2 | src_freedef2 | varchar2(200) |
| 30 | src_freedef3 | src_freedef3 | src_freedef3 | varchar2(200) |
| 31 | src_freedef4 | src_freedef4 | src_freedef4 | varchar2(200) |
| 32 | src_freedef5 | src_freedef5 | src_freedef5 | varchar2(200) |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |