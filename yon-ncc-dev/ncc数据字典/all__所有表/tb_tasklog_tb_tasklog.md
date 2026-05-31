# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12120.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | description | description | description | varchar2(512) |
| 3 | ishavefile | ishavefile | ishavefile | char(1) |
| 4 | nextstatus | nextstatus | nextstatus | char(3) |
| 5 | pk_task | pk_task | pk_task | varchar2(20) | √ |
| 6 | pk_versiontask | pk_versiontask | pk_versiontask | varchar2(20) |
| 7 | prevstatus | prevstatus | prevstatus | char(3) |
| 8 | tbaction | tbaction | tbaction | varchar2(10) | √ |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |