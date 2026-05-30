# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8812.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hr_ifsettop | pk_hr_ifsettop | pk_hr_ifsettop | char(20) | √ |
| 2 | dateformat | dateformat | dateformat | varchar2(20) |
| 3 | icaretpos | icaretpos | icaretpos | number(38, 0) |
| 4 | ifid | ifid | ifid | char(20) |
| 5 | iflddecimal | iflddecimal | iflddecimal | number(38, 0) |
| 6 | ifldwidth | ifldwidth | ifldwidth | number(38, 0) |
| 7 | iifsum | iifsum | iifsum | number(38, 0) | √ |  | 0 |
| 8 | iseq | iseq | iseq | number(38, 0) | √ |
| 9 | vcaret | vcaret | vcaret | varchar2(2) |
| 10 | vcontent | vcontent | vcontent | varchar2(128) |
| 11 | vfieldname | vfieldname | vfieldname | varchar2(128) |
| 12 | vseparator | vseparator | vseparator | varchar2(2) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |