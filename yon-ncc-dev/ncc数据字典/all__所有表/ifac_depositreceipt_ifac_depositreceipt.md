# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9193.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depositreceipt | pk_depositreceipt | pk_depositreceipt | varchar2(20) | √ |
| 2 | autoterminatedate | autoterminatedate | autoterminatedate | char(19) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billstate | billstate | billstate | number(38, 0) |
| 5 | billtype | billtype | billtype | varchar2(50) |
| 6 | businessvariety | businessvariety | businessvariety | varchar2(20) |
| 7 | depositamount | depositamount | depositamount | number(28, 8) |
| 8 | depositcode | depositcode | depositcode | varchar2(50) |  |  | '~' |
| 9 | depositdate | depositdate | depositdate | char(19) |
| 10 | depositinterest | depositinterest | depositinterest | number(28, 8) |
| 11 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 12 | depositmode | depositmode | depositmode | varchar2(50) |
| 13 | deposittype | deposittype | deposittype | varchar2(50) |
| 14 | deposityrate | deposityrate | deposityrate | number(15, 8) |
| 15 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 16 | depostperiod | depostperiod | depostperiod | varchar2(50) |
| 17 | depostsummnt | depostsummnt | depostsummnt | number(28, 8) |
| 18 | enddate | enddate | enddate | char(19) |
| 19 | freezedate | freezedate | freezedate | char(19) |
| 20 | freezer | freezer | freezer | varchar2(20) |  |  | '~' |
| 21 | glcdepositamount | glcdepositamount | glcdepositamount | number(28, 8) |
| 22 | glcrate | glcrate | glcrate | number(15, 8) |
| 23 | gllcdepositamount | gllcdepositamount | gllcdepositamount | number(28, 8) |
| 24 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 25 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 26 | isinitial | isinitial | isinitial | char(1) |
| 27 | maxaccuredate | maxaccuredate | maxaccuredate | char(19) |
| 28 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 29 | olcdepositamount | olcdepositamount | olcdepositamount | number(28, 8) |
| 30 | olcrate | olcrate | olcrate | number(15, 8) |
| 31 | operatedate | operatedate | operatedate | char(19) |
| 32 | oridepositdate | oridepositdate | oridepositdate | char(19) |
| 33 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 34 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 35 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 36 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 37 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 38 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 39 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 40 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 41 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 42 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 43 | redepositdate | redepositdate | redepositdate | char(19) |
| 44 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 45 | remark | remark | remark | varchar2(300) |
| 46 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 47 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 48 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 49 | saga_status | saga_status | saga_status | number(38, 0) |
| 50 | unfreezedate | unfreezedate | unfreezedate | char(19) |
| 51 | unfreezer | unfreezer | unfreezer | varchar2(20) |  |  | '~' |
| 52 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 53 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 54 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 55 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 56 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 57 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 58 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 59 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 60 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 61 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 62 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 63 | creationtime | creationtime | creationtime | char(19) |
| 64 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 65 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 66 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 67 | modifier | modifier | modifier | varchar2(50) |
| 68 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |