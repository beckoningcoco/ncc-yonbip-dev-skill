# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8058.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accintobj | pk_accintobj | pk_accintobj | char(20) | √ |
| 2 | begdate | begdate | begdate | char(19) |
| 3 | effectivedate | effectivedate | effectivedate | char(19) |
| 4 | floatingpercent | floatingpercent | floatingpercent | number(28, 8) |
| 5 | intarithmetic | intarithmetic | intarithmetic | varchar2(50) |
| 6 | intmode | intmode | intmode | varchar2(50) |
| 7 | intobjname | intobjname | intobjname | varchar2(75) |
| 8 | memo | memo | memo | varchar2(50) |
| 9 | objcode | objcode | objcode | varchar2(50) | √ |
| 10 | pk_account_g | pk_account_g | pk_account_g | varchar2(20) |  |  | '~' |
| 11 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 12 | pk_capitalcenter | pk_capitalcenter | pk_capitalcenter | varchar2(20) |  |  | '~' |
| 13 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 14 | pk_gaincenter | pk_gaincenter | pk_gaincenter | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_settledate | pk_settledate | pk_settledate | varchar2(20) |  |  | '~' |
| 19 | ratecode | ratecode | ratecode | varchar2(20) |  |  | '~' |
| 20 | useflag | useflag | useflag | char(1) |
| 21 | usesign | usesign | usesign | char(1) |
| 22 | version | version | version | varchar2(10) |
| 23 | verstatus | verstatus | verstatus | char(1) |
| 24 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 25 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 26 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 27 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 28 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 29 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 30 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 31 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 32 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 33 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 34 | creationtime | creationtime | creationtime | char(19) |
| 35 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 38 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |