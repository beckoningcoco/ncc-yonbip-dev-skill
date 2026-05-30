# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8535.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcile | pk_reconcile | pk_reconcile | char(20) | √ |
| 2 | code | code | code | varchar2(15) |
| 3 | name | name | name | varchar2(50) |
| 4 | pk_glbook | pk_glbook | pk_glbook | char(20) |
| 5 | pk_glorg | pk_glorg | pk_glorg | char(20) |
| 6 | pk_glorgbook | pk_glorgbook | pk_glorgbook | char(20) |
| 7 | shortname | shortname | shortname | char(10) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |