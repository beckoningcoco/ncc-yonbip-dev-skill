# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11690.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccreditauditbid | ccreditauditbid | ccreditauditbid | char(20) | √ |
| 2 | bupdateflag | bupdateflag | bupdateflag | char(1) |
| 3 | ccreditauditid | ccreditauditid | ccreditauditid | varchar2(20) |
| 4 | ccreditid | ccreditid | ccreditid | varchar2(20) |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) | √ |
| 6 | ccustid | ccustid | ccustid | varchar2(20) |  |  | '~' |
| 7 | cemployeeid | cemployeeid | cemployeeid | varchar2(20) |  |  | '~' |
| 8 | climitlevel | climitlevel | climitlevel | varchar2(20) |  |  | '~' |
| 9 | climittypeid | climittypeid | climittypeid | varchar2(20) | √ |
| 10 | csaledeptid | csaledeptid | csaledeptid | varchar2(20) |  |  | '~' |
| 11 | csaleorgid | csaleorgid | csaleorgid | varchar2(20) |  |  | '~' |
| 12 | dbilldate | dbilldate | dbilldate | char(19) | √ |
| 13 | dfromdate | dfromdate | dfromdate | char(19) |
| 14 | dtodate | dtodate | dtodate | char(19) |
| 15 | ncredcurrencyid | ncredcurrencyid | ncredcurrencyid | varchar2(20) |  |  | '~' |
| 16 | ncredlimitmny | ncredlimitmny | ncredlimitmny | number(28, 8) |
| 17 | nlimitmny | nlimitmny | nlimitmny | number(28, 8) | √ |
| 18 | norglimitmny | norglimitmny | norglimitmny | number(28, 8) |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 21 | vnote | vnote | vnote | varchar2(181) |
| 22 | vbdef1 | vbdef1 | vbdef1 | varchar2(101) |
| 23 | vbdef2 | vbdef2 | vbdef2 | varchar2(101) |
| 24 | vbdef3 | vbdef3 | vbdef3 | varchar2(101) |
| 25 | vbdef4 | vbdef4 | vbdef4 | varchar2(101) |
| 26 | vbdef5 | vbdef5 | vbdef5 | varchar2(101) |
| 27 | vbdef6 | vbdef6 | vbdef6 | varchar2(101) |
| 28 | vbdef7 | vbdef7 | vbdef7 | varchar2(101) |
| 29 | vbdef8 | vbdef8 | vbdef8 | varchar2(101) |
| 30 | vbdef9 | vbdef9 | vbdef9 | varchar2(101) |
| 31 | vbdef10 | vbdef10 | vbdef10 | varchar2(101) |
| 32 | vbdef11 | vbdef11 | vbdef11 | varchar2(101) |
| 33 | vbdef12 | vbdef12 | vbdef12 | varchar2(101) |
| 34 | vbdef13 | vbdef13 | vbdef13 | varchar2(101) |
| 35 | vbdef14 | vbdef14 | vbdef14 | varchar2(101) |
| 36 | vbdef15 | vbdef15 | vbdef15 | varchar2(101) |
| 37 | vbdef16 | vbdef16 | vbdef16 | varchar2(101) |
| 38 | vbdef17 | vbdef17 | vbdef17 | varchar2(101) |
| 39 | vbdef18 | vbdef18 | vbdef18 | varchar2(101) |
| 40 | vbdef19 | vbdef19 | vbdef19 | varchar2(101) |
| 41 | vbdef20 | vbdef20 | vbdef20 | varchar2(101) |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |