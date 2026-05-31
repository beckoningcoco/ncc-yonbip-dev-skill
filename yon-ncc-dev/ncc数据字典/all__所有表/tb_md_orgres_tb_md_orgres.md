# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12056.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | approvernames | approvernames | approvernames | varchar2(512) |
| 3 | compileresnames | compileresnames | compileresnames | varchar2(512) |
| 4 | msg_links | msg_links | msg_links | varchar2(50) |
| 5 | msg_types | msg_types | msg_types | varchar2(50) |
| 6 | pk_approveres | pk_approveres | pk_approveres | varchar2(512) |
| 7 | pk_compileres | pk_compileres | pk_compileres | varchar2(512) |
| 8 | pk_dataent | pk_dataent | pk_dataent | varchar2(20) | √ |
| 9 | pk_planent | pk_planent | pk_planent | varchar2(20) |
| 10 | pk_taskdef | pk_taskdef | pk_taskdef | varchar2(20) | √ |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |