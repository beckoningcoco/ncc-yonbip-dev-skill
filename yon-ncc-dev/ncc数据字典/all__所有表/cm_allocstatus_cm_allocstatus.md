# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7598.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | callocstatusid | callocstatusid | callocstatusid | char(20) | √ |
| 2 | bexcute | bexcute | bexcute | char(1) |
| 3 | callocdefid | callocdefid | callocdefid | varchar2(20) |  |  | '~' |
| 4 | cperiod | cperiod | cperiod | varchar2(20) |  |  | '~' |
| 5 | fstatus | fstatus | fstatus | number(38, 0) |
| 6 | nseq | nseq | nseq | number(38, 0) |
| 7 | pk_group | pk_group | pk_group | char(20) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |