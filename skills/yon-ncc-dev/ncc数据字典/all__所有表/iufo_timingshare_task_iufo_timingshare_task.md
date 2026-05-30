# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9714.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_timingshare_task | pk_timingshare_task | pk_timingshare_task | char(20) | √ |
| 2 | condsconfig_id | condsconfig_id | condsconfig_id | varchar2(50) |
| 3 | extendobj | extendobj | extendobj | blob |
| 4 | filetype | filetype | filetype | varchar2(50) |
| 5 | instance_period | instance_period | instance_period | varchar2(19) |
| 6 | instance_type | instance_type | instance_type | varchar2(200) |
| 7 | msgtext | msgtext | msgtext | varchar2(300) |
| 8 | msgtitle | msgtitle | msgtitle | varchar2(200) | √ |
| 9 | msgvars | msgvars | msgvars | varchar2(50) |
| 10 | push_type | push_type | push_type | varchar2(19) |
| 11 | receivers | receivers | receivers | blob |
| 12 | reportid | reportid | reportid | varchar2(50) |
| 13 | reportqueryvo | reportqueryvo | reportqueryvo | blob |
| 14 | schedule_id | schedule_id | schedule_id | varchar2(50) |
| 15 | sender | sender | sender | varchar2(50) |
| 16 | taskexecroom | taskexecroom | taskexecroom | blob |
| 17 | task_name | task_name | task_name | varchar2(200) | √ |
| 18 | task_name2 | task_name2 | task_name2 | varchar2(200) |
| 19 | task_name3 | task_name3 | task_name3 | varchar2(200) |
| 20 | task_name4 | task_name4 | task_name4 | varchar2(200) |
| 21 | task_name5 | task_name5 | task_name5 | varchar2(200) |
| 22 | task_name6 | task_name6 | task_name6 | varchar2(200) |
| 23 | task_note | task_note | task_note | varchar2(200) |
| 24 | task_note2 | task_note2 | task_note2 | varchar2(200) |
| 25 | task_note3 | task_note3 | task_note3 | varchar2(200) |
| 26 | task_note4 | task_note4 | task_note4 | varchar2(200) |
| 27 | task_note5 | task_note5 | task_note5 | varchar2(200) |
| 28 | task_note6 | task_note6 | task_note6 | varchar2(200) |
| 29 | timeconfig | timeconfig | timeconfig | blob |
| 30 | creationtime | creationtime | creationtime | char(19) |
| 31 | creator | creator | creator | varchar2(50) |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 34 | modifier | modifier | modifier | varchar2(50) |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |