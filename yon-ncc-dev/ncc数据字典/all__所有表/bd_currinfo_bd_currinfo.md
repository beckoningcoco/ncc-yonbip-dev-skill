# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6837.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_currinfo | pk_currinfo | pk_currinfo | char(20) | √ |
| 2 | bpaccuracy | bpaccuracy | bpaccuracy | number(38, 0) |
| 3 | convmode | convmode | convmode | number(38, 0) |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 5 | maxconverr | maxconverr | maxconverr | number(20, 8) |
| 6 | oppcurrtype | oppcurrtype | oppcurrtype | varchar2(20) |  |  | '~' |
| 7 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 8 | pk_exratescheme | pk_exratescheme | pk_exratescheme | varchar2(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | ratedigit | ratedigit | ratedigit | number(38, 0) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |