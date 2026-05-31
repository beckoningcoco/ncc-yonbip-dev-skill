# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11033.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workflowpara | pk_workflowpara | pk_workflowpara | char(20) | √ |
| 2 | outlookthreshold | outlookthreshold | outlookthreshold | number(38, 0) |
| 3 | overduethreshold | overduethreshold | overduethreshold | number(38, 0) |
| 4 | paratype | paratype | paratype | number(38, 0) |
| 5 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 6 | unresolvethreshold | unresolvethreshold | unresolvethreshold | number(38, 0) |
| 7 | warningthreshold | warningthreshold | warningthreshold | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |