# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10078.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_upgrade | pk_upgrade | pk_upgrade | char(20) | √ |
| 2 | check_description | check_description | check_description | varchar2(400) |
| 3 | code | code | code | varchar2(50) | √ |
| 4 | execute_time | execute_time | execute_time | char(19) |
| 5 | execute_user | execute_user | execute_user | varchar2(20) |  |  | '~' |
| 6 | implementation | implementation | implementation | varchar2(100) | √ |
| 7 | name | name | name | varchar2(300) | √ |
| 8 | pk_app_upgrade | pk_app_upgrade | pk_app_upgrade | char(20) | √ |
| 9 | unexecute_time | unexecute_time | unexecute_time | char(19) |
| 10 | unexecute_user | unexecute_user | unexecute_user | varchar2(20) |  |  | '~' |
| 11 | upgrade_result | upgrade_result | upgrade_result | number(38, 0) | √ |  | 1 |
| 12 | upgrade_status | upgrade_status | upgrade_status | number(38, 0) | √ |  | 1 |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |