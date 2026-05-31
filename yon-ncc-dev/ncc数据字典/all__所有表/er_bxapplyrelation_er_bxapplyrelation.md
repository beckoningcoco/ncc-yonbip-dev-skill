# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7943.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | pk_relation | pk_relation | varchar2(20) | √ |
| 2 | cx_amount | cx_amount | cx_amount | number(28, 8) | √ |
| 3 | pk_jkbx | pk_jkbx | pk_jkbx | varchar2(20) | √ |
| 4 | pk_mtapp_bill | pk_mtapp_bill | pk_mtapp_bill | varchar2(20) | √ |
| 5 | defitem1 | defitem1 | defitem1 | varchar2(101) |  |  | '~' |
| 6 | defitem2 | defitem2 | defitem2 | varchar2(101) |  |  | '~' |
| 7 | defitem3 | defitem3 | defitem3 | varchar2(101) |  |  | '~' |
| 8 | defitem4 | defitem4 | defitem4 | varchar2(101) |  |  | '~' |
| 9 | defitem5 | defitem5 | defitem5 | varchar2(101) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) | √ |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |