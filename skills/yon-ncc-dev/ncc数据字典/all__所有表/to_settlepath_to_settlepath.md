# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12201.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csettlepathid | csettlepathid | csettlepathid | char(20) | √ |
| 2 | bdefaultflag | bdefaultflag | bdefaultflag | char(1) |
| 3 | bdiscountflag | bdiscountflag | bdiscountflag | char(1) |
| 4 | blatestflag | blatestflag | blatestflag | char(1) |
| 5 | cinfinanceorgid | cinfinanceorgid | cinfinanceorgid | varchar2(20) |  |  | '~' |
| 6 | corigbillid | corigbillid | corigbillid | varchar2(20) |
| 7 | coutfinanceorgid | coutfinanceorgid | coutfinanceorgid | varchar2(20) |  |  | '~' |
| 8 | creviserid | creviserid | creviserid | varchar2(20) |  |  | '~' |
| 9 | iversion | iversion | iversion | number(38, 0) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | trevisetime | trevisetime | trevisetime | varchar2(19) |
| 12 | vnote | vnote | vnote | varchar2(181) |
| 13 | vpathcode | vpathcode | vpathcode | varchar2(40) |
| 14 | vpathname | vpathname | vpathname | varchar2(45) |
| 15 | vpathname2 | vpathname2 | vpathname2 | varchar2(45) |
| 16 | vpathname3 | vpathname3 | vpathname3 | varchar2(45) |
| 17 | vpathname4 | vpathname4 | vpathname4 | varchar2(45) |
| 18 | vpathname5 | vpathname5 | vpathname5 | varchar2(45) |
| 19 | vpathname6 | vpathname6 | vpathname6 | varchar2(45) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |