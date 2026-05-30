# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11042.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workflowagent | pk_workflowagent | pk_workflowagent | char(20) | √ |
| 2 | billtypes | billtypes | billtypes | varchar2(256) |
| 3 | pk_corp | pk_corp | pk_corp | char(4) |
| 4 | pk_cuserid | pk_cuserid | pk_cuserid | char(20) | √ |
| 5 | pk_workflow | pk_workflow | pk_workflow | char(20) | √ |
| 6 | sysindex | sysindex | sysindex | number(38, 0) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |