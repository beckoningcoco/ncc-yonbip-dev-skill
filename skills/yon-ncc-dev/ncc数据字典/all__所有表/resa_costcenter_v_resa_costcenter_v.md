# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11150.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | pk_vid | pk_vid | char(20) | √ |
| 2 | account_org | account_org | account_org | varchar2(20) |  |  | '~' |
| 3 | cccode | cccode | cccode | varchar2(50) |
| 4 | ccname | ccname | ccname | varchar2(200) |
| 5 | ccname2 | ccname2 | ccname2 | varchar2(200) |
| 6 | ccname3 | ccname3 | ccname3 | varchar2(200) |
| 7 | ccname4 | ccname4 | ccname4 | varchar2(200) |
| 8 | ccname5 | ccname5 | ccname5 | varchar2(200) |
| 9 | ccname6 | ccname6 | ccname6 | varchar2(200) |
| 10 | ccshortname | ccshortname | ccshortname | varchar2(200) |
| 11 | ccshortname2 | ccshortname2 | ccshortname2 | varchar2(200) |
| 12 | ccshortname3 | ccshortname3 | ccshortname3 | varchar2(200) |
| 13 | ccshortname4 | ccshortname4 | ccshortname4 | varchar2(200) |
| 14 | ccshortname5 | ccshortname5 | ccshortname5 | varchar2(200) |
| 15 | ccshortname6 | ccshortname6 | ccshortname6 | varchar2(200) |
| 16 | cctype | cctype | cctype | number(38, 0) |
| 17 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 18 | effectivedate | effectivedate | effectivedate | char(19) |
| 19 | enablestate | enablestate | enablestate | number(38, 0) |
| 20 | expirationdate | expirationdate | expirationdate | char(19) |
| 21 | innercode | innercode | innercode | varchar2(50) |
| 22 | isbudget | isbudget | isbudget | char(1) |
| 23 | islastversion | islastversion | islastversion | char(1) |
| 24 | ispubcc | ispubcc | ispubcc | char(1) |
| 25 | pk_costcenter | pk_costcenter | pk_costcenter | char(20) | √ |
| 26 | pk_factory | pk_factory | pk_factory | varchar2(20) |  |  | '~' |
| 27 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 28 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_principal | pk_principal | pk_principal | varchar2(20) |  |  | '~' |
| 32 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 33 | vname | vname | vname | varchar2(50) |
| 34 | vname2 | vname2 | vname2 | varchar2(50) |
| 35 | vname3 | vname3 | vname3 | varchar2(50) |
| 36 | vname4 | vname4 | vname4 | varchar2(50) |
| 37 | vname5 | vname5 | vname5 | varchar2(50) |
| 38 | vno | vno | vno | varchar2(50) |
| 39 | vnote | vnote | vnote | blob |
| 40 | def1 | def1 | def1 | varchar2(101) |
| 41 | def2 | def2 | def2 | varchar2(101) |
| 42 | def3 | def3 | def3 | varchar2(101) |
| 43 | def4 | def4 | def4 | varchar2(101) |
| 44 | def5 | def5 | def5 | varchar2(101) |
| 45 | def6 | def6 | def6 | varchar2(101) |
| 46 | def7 | def7 | def7 | varchar2(101) |
| 47 | def8 | def8 | def8 | varchar2(101) |
| 48 | def9 | def9 | def9 | varchar2(101) |
| 49 | def10 | def10 | def10 | varchar2(101) |
| 50 | creationtime | creationtime | creationtime | char(19) |
| 51 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 54 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 55 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |