# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8060.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | depositamount | depositamount | depositamount | number(28, 8) |
| 3 | depositcode | depositcode | depositcode | varchar2(20) |  |  | '~' |
| 4 | depositdate | depositdate | depositdate | char(19) |
| 5 | enddate | enddate | enddate | char(19) |
| 6 | glcdepositmnt | glcdepositmnt | glcdepositmnt | number(28, 8) |
| 7 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 8 | glcrate | glcrate | glcrate | number(28, 8) |
| 9 | gllcdepositmnt | gllcdepositmnt | gllcdepositmnt | number(28, 8) |
| 10 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 11 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 12 | interest | interest | interest | number(28, 8) |
| 13 | maxaccuredate | maxaccuredate | maxaccuredate | char(19) |
| 14 | olcdepositmnt | olcdepositmnt | olcdepositmnt | number(28, 8) |
| 15 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 16 | olcrate | olcrate | olcrate | number(28, 8) |
| 17 | opamount | opamount | opamount | number(28, 8) |
| 18 | opdate | opdate | opdate | char(19) |
| 19 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 20 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 21 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |
| 22 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 23 | pk_depositrate | pk_depositrate | pk_depositrate | varchar2(20) |  |  | '~' |
| 24 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |