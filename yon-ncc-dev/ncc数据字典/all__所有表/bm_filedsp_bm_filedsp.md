# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7353.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bmfiledsp | pk_bmfiledsp | pk_bmfiledsp | char(20) | √ |
| 2 | bshow | bshow | bshow | char(1) | √ |
| 3 | cperiod | cperiod | cperiod | char(2) |
| 4 | cyear | cyear | cyear | char(4) |
| 5 | displayseq | displayseq | displayseq | number(38, 0) |
| 6 | isbmitem | isbmitem | isbmitem | char(1) |
| 7 | item_key | item_key | item_key | varchar2(50) | √ |
| 8 | pk_bm_class | pk_bm_class | pk_bm_class | varchar2(20) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |
| 11 | pk_user | pk_user | pk_user | varchar2(20) |
| 12 | type | type | type | varchar2(2) | √ |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |