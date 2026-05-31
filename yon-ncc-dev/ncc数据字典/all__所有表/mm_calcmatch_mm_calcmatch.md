# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9870.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsmatchid | cppsmatchid | cppsmatchid | varchar2(36) | √ |
| 2 | bexmatch | bexmatch | bexmatch | char(1) |
| 3 | breservation | breservation | breservation | char(1) |
| 4 | computecode | computecode | computecode | varchar2(40) |
| 5 | cppsdemandid | cppsdemandid | cppsdemandid | varchar2(36) |  |  | '~' |
| 6 | cppsmaterialid | cppsmaterialid | cppsmaterialid | char(36) | √ |
| 7 | cppssupplyid | cppssupplyid | cppssupplyid | varchar2(36) |  |  | '~' |
| 8 | dmatchtime | dmatchtime | dmatchtime | char(19) |
| 9 | matchrowno | matchrowno | matchrowno | number(38, 0) |
| 10 | ncansupplynum | ncansupplynum | ncansupplynum | number(28, 8) |
| 11 | nrsinvnum | nrsinvnum | nrsinvnum | number(28, 8) |
| 12 | nsupplynum | nsupplynum | nsupplynum | number(28, 8) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |