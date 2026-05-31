# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8200.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expenselist_b | pk_expenselist_b | pk_expenselist_b | char(20) | √ |
| 2 | aoccshareamount | aoccshareamount | aoccshareamount | number(28, 4) |
| 3 | aoccunitamount | aoccunitamount | aoccunitamount | number(28, 4) |
| 4 | billmoney | billmoney | billmoney | number(28, 4) |
| 5 | chargdays | chargdays | chargdays | varchar2(3) |
| 6 | drate | drate | drate | number(28, 4) |
| 7 | endchargdate | endchargdate | endchargdate | char(19) |
| 8 | glcrate | glcrate | glcrate | number(28, 4) |
| 9 | glcsumbillamount | glcsumbillamount | glcsumbillamount | number(28, 4) |
| 10 | gllcrate | gllcrate | gllcrate | number(28, 4) |
| 11 | gllcsumbillamount | gllcsumbillamount | gllcsumbillamount | number(28, 4) |
| 12 | memo | memo | memo | varchar2(300) |
| 13 | myate | myate | myate | number(28, 4) |
| 14 | occsharerate | occsharerate | occsharerate | number(28, 4) |
| 15 | occunitrate | occunitrate | occunitrate | number(28, 4) |
| 16 | olcrate | olcrate | olcrate | number(28, 4) |
| 17 | olcsumbillamount | olcsumbillamount | olcsumbillamount | number(28, 4) |
| 18 | payocccost | payocccost | payocccost | number(28, 4) |
| 19 | pk_billcurr | pk_billcurr | pk_billcurr | varchar2(20) |  |  | '~' |
| 20 | pk_chargeperson | pk_chargeperson | pk_chargeperson | varchar2(20) |  |  | '~' |
| 21 | pk_credcurr | pk_credcurr | pk_credcurr | varchar2(20) |  |  | '~' |
| 22 | pk_expenselist | pk_expenselist | pk_expenselist | varchar2(20) |
| 23 | pk_occupyctmanage | pk_occupyctmanage | pk_occupyctmanage | varchar2(20) |  |  | '~' |
| 24 | pk_openregister | pk_openregister | pk_openregister | varchar2(50) |
| 25 | pk_register | pk_register | pk_register | varchar2(20) |  |  | '~' |
| 26 | pk_unitusect | pk_unitusect | pk_unitusect | varchar2(20) |  |  | '~' |
| 27 | shareamountcost | shareamountcost | shareamountcost | number(28, 4) |
| 28 | startchargdate | startchargdate | startchargdate | char(19) |
| 29 | unitamountcost | unitamountcost | unitamountcost | number(28, 4) |
| 30 | yrate | yrate | yrate | number(28, 4) |
| 31 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 32 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 33 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 34 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 35 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 36 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 37 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 38 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 39 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 40 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 41 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 42 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 43 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 44 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 45 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 46 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 47 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 48 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 49 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 50 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |