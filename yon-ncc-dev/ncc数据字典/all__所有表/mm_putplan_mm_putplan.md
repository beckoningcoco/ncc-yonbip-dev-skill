# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9946.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_putplan | pk_putplan | pk_putplan | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | cbilltype | cbilltype | cbilltype | varchar2(20) |  |  | '~' |
| 5 | cclassid | cclassid | cclassid | varchar2(20) |  |  | '~' |
| 6 | cdmoid | cdmoid | cdmoid | varchar2(20) |  |  | '~' |
| 7 | chastunitid | chastunitid | chastunitid | varchar2(20) |  |  | '~' |
| 8 | chunitid | chunitid | chunitid | varchar2(20) |  |  | '~' |
| 9 | cpmoid | cpmoid | cpmoid | varchar2(20) |  |  | '~' |
| 10 | cpmorowid | cpmorowid | cpmorowid | varchar2(20) |  |  | '~' |
| 11 | cputor | cputor | cputor | varchar2(20) |  |  | '~' |
| 12 | csupervisorid | csupervisorid | csupervisorid | varchar2(20) |
| 13 | cteamid | cteamid | cteamid | varchar2(20) |  |  | '~' |
| 14 | dbilldate | dbilldate | dbilldate | char(19) |
| 15 | dmakedate | dmakedate | dmakedate | char(19) |
| 16 | fbillstatus | fbillstatus | fbillstatus | number(38, 0) |
| 17 | fpromode | fpromode | fpromode | number(38, 0) |
| 18 | nastnum | nastnum | nastnum | number(28, 8) |
| 19 | nnum | nnum | nnum | number(28, 8) |
| 20 | nplanoutastnum | nplanoutastnum | nplanoutastnum | number(28, 8) |
| 21 | nplanoutnum | nplanoutnum | nplanoutnum | number(28, 8) |
| 22 | nplanputastnum | nplanputastnum | nplanputastnum | number(28, 8) |
| 23 | nplanputnum | nplanputnum | nplanputnum | number(28, 8) |
| 24 | nputorder | nputorder | nputorder | number(38, 0) |
| 25 | nsetastnum | nsetastnum | nsetastnum | number(28, 8) |
| 26 | nsetnum | nsetnum | nsetnum | number(28, 8) |
| 27 | nwrastnum | nwrastnum | nwrastnum | number(28, 8) |
| 28 | nwrnum | nwrnum | nwrnum | number(28, 8) |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 32 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 33 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 34 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 35 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 36 | tactendtime | tactendtime | tactendtime | char(19) |
| 37 | tactstarttime | tactstarttime | tactstarttime | char(19) |
| 38 | taudittime | taudittime | taudittime | varchar2(19) |
| 39 | tplanendtime | tplanendtime | tplanendtime | char(19) |
| 40 | tplanstarttime | tplanstarttime | tplanstarttime | char(19) |
| 41 | tputdate | tputdate | tputdate | char(19) |
| 42 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 43 | vbillstatus | vbillstatus | vbillstatus | number(38, 0) |
| 44 | vfirstcode | vfirstcode | vfirstcode | varchar2(40) |
| 45 | vfirstid | vfirstid | vfirstid | varchar2(20) |
| 46 | vfirstrowid | vfirstrowid | vfirstrowid | varchar2(20) |
| 47 | vfirstrowno | vfirstrowno | vfirstrowno | varchar2(20) |
| 48 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 49 | vfirsttrantypeid | vfirsttrantypeid | vfirsttrantypeid | varchar2(20) |  |  | '~' |
| 50 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |  |  | '~' |
| 51 | vhchangerate | vhchangerate | vhchangerate | varchar2(60) |
| 52 | vnote | vnote | vnote | varchar2(181) |
| 53 | vsrccode | vsrccode | vsrccode | varchar2(40) |
| 54 | vsrcid | vsrcid | vsrcid | varchar2(20) |
| 55 | vsrcrowid | vsrcrowid | vsrcrowid | varchar2(20) |
| 56 | vsrcrowno | vsrcrowno | vsrcrowno | varchar2(20) |
| 57 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 58 | vsrctrantypeid | vsrctrantypeid | vsrctrantypeid | varchar2(20) |  |  | '~' |
| 59 | vsrctype | vsrctype | vsrctype | varchar2(20) |  |  | '~' |
| 60 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 61 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 62 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 63 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 64 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 65 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 66 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 67 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 68 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 69 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 70 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 71 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 72 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 73 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 74 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 75 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 76 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 77 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 78 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 79 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 80 | creationtime | creationtime | creationtime | char(19) |
| 81 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 82 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 83 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 84 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 85 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |