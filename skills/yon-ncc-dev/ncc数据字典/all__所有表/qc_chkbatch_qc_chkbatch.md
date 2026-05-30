# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11102.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_chkbatch | pk_chkbatch | pk_chkbatch | char(20) | √ |
| 2 | cbilltype | cbilltype | cbilltype | varchar2(20) |  |  | '~' |
| 3 | nchecknum | nchecknum | nchecknum | number(28, 8) |
| 4 | pk_applybill | pk_applybill | pk_applybill | char(20) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | vbatchcode | vbatchcode | vbatchcode | varchar2(50) |
| 7 | creationtime | creationtime | creationtime | char(19) |
| 8 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |