# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12857.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_itemdsp | pk_wa_itemdsp | pk_wa_itemdsp | char(20) | √ |
| 2 | bshow | bshow | bshow | char(1) |
| 3 | cperiod | cperiod | cperiod | char(2) | √ |
| 4 | cyear | cyear | cyear | char(4) | √ |
| 5 | displayseq | displayseq | displayseq | number(38, 0) |
| 6 | pk_user | pk_user | pk_user | varchar2(20) | √ |
| 7 | pk_wa_class | pk_wa_class | pk_wa_class | char(20) | √ |
| 8 | pk_wa_classitem | pk_wa_classitem | pk_wa_classitem | char(20) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |