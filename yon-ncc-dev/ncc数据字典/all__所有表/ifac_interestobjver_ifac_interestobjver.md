# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9208.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intobj_v | pk_intobj_v | pk_intobj_v | char(20) | √ |
| 2 | changedate | changedate | changedate | char(19) |
| 3 | effectivedate | effectivedate | effectivedate | char(19) |
| 4 | floatingpercent | floatingpercent | floatingpercent | number(28, 8) |
| 5 | intflag | intflag | intflag | char(1) |
| 6 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 7 | pk_accintobj | pk_accintobj | pk_accintobj | varchar2(20) |  |  | '~' |
| 8 | pk_account_g | pk_account_g | pk_account_g | varchar2(20) |  |  | '~' |
| 9 | pk_ratecode | pk_ratecode | pk_ratecode | varchar2(20) |  |  | '~' |
| 10 | remark | remark | remark | varchar2(181) |
| 11 | settledate | settledate | settledate | varchar2(20) |  |  | '~' |
| 12 | version | version | version | varchar2(10) |
| 13 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 14 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 15 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 16 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 17 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 18 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 19 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 20 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 21 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 22 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |