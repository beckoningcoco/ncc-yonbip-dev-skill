# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11162.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factorchart | pk_factorchart | pk_factorchart | char(20) | √ |
| 2 | alterchart | alterchart | alterchart | varchar2(20) |  |  | '~' |
| 3 | beginperiod | beginperiod | beginperiod | varchar2(10) |  |  | '0000-00-00' |
| 4 | controllevel | controllevel | controllevel | number(38, 0) |
| 5 | dispnamemodel | dispnamemodel | dispnamemodel | number(38, 0) |
| 6 | endperiod | endperiod | endperiod | varchar2(10) |  |  | '9999-99-99' |
| 7 | factorchartcode | factorchartcode | factorchartcode | varchar2(50) |
| 8 | factorchartname | factorchartname | factorchartname | varchar2(200) |
| 9 | factorchartname2 | factorchartname2 | factorchartname2 | varchar2(200) |
| 10 | factorchartname3 | factorchartname3 | factorchartname3 | varchar2(200) |
| 11 | factorchartname4 | factorchartname4 | factorchartname4 | varchar2(200) |
| 12 | factorchartname5 | factorchartname5 | factorchartname5 | varchar2(200) |
| 13 | factorchartname6 | factorchartname6 | factorchartname6 | varchar2(200) |
| 14 | innercode | innercode | innercode | varchar2(50) |
| 15 | isorgctrl | isorgctrl | isorgctrl | char(1) |
| 16 | ispolicychart | ispolicychart | ispolicychart | char(1) |
| 17 | memo | memo | memo | varchar2(400) |
| 18 | originalchart | originalchart | originalchart | varchar2(20) |  |  | '~' |
| 19 | pk_ca | pk_ca | pk_ca | varchar2(20) |  |  | '~' |
| 20 | pk_factorsystem | pk_factorsystem | pk_factorsystem | varchar2(20) |  |  | '~' |
| 21 | pk_fatherchart | pk_fatherchart | pk_fatherchart | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |