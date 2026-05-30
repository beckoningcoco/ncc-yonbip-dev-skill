# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12187.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | cbillid | cbillid | char(20) | √ |
| 2 | bgoldentaxflag | bgoldentaxflag | bgoldentaxflag | char(1) |
| 3 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |
| 4 | cdowncorpid | cdowncorpid | cdowncorpid | varchar2(20) |
| 5 | cdowncorpvid | cdowncorpvid | cdowncorpvid | varchar2(20) |
| 6 | cdownfinanceorgid | cdownfinanceorgid | cdownfinanceorgid | varchar2(20) |
| 7 | cdownfinanceorgvid | cdownfinanceorgvid | cdownfinanceorgvid | varchar2(20) |
| 8 | csettlelistid | csettlelistid | csettlelistid | varchar2(20) |
| 9 | cupcorpid | cupcorpid | cupcorpid | varchar2(20) |
| 10 | cupcorpvid | cupcorpvid | cupcorpvid | varchar2(20) |
| 11 | dbilldate | dbilldate | dbilldate | char(19) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 15 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 16 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 17 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 18 | saga_status | saga_status | saga_status | number(38, 0) |
| 19 | tgoldentaxtime | tgoldentaxtime | tgoldentaxtime | char(19) |
| 20 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 21 | vgoldentaxcode | vgoldentaxcode | vgoldentaxcode | varchar2(50) |
| 22 | vsettlelistcode | vsettlelistcode | vsettlelistcode | varchar2(40) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |