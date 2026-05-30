# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10860.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alertruntime | pk_alertruntime | pk_alertruntime | char(20) | √ |
| 2 | active | active | active | char(1) |
| 3 | mystatus | mystatus | mystatus | varchar2(64) |
| 4 | registryid | registryid | registryid | varchar2(20) |
| 5 | registrytype | registrytype | registrytype | number(38, 0) |
| 6 | serveraddress | serveraddress | serveraddress | varchar2(32) |
| 7 | serverinstanceid | serverinstanceid | serverinstanceid | varchar2(64) |
| 8 | servername | servername | servername | varchar2(64) |
| 9 | taskid | taskid | taskid | varchar2(64) |
| 10 | creator | creator | creator | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |