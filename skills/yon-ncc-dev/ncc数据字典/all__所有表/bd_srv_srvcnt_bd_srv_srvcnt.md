# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7071.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvcnt | pk_srvcnt | pk_srvcnt | char(20) | √ |
| 2 | cnt | cnt | cnt | number(38, 0) |
| 3 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 4 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 5 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |