# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11037.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_task | pk_wf_task | pk_wf_task | char(20) | √ |
| 2 | activitydefid | activitydefid | activitydefid | varchar2(64) |
| 3 | createtime | createtime | createtime | char(19) |
| 4 | isautocomplete | isautocomplete | isautocomplete | char(1) |
| 5 | modifytime | modifytime | modifytime | char(19) |
| 6 | pk_wf_actinstance | pk_wf_actinstance | pk_wf_actinstance | char(20) |  |  | '~' |
| 7 | pk_wf_instance | pk_wf_instance | pk_wf_instance | char(20) |  |  | '~' |
| 8 | processdefid | processdefid | processdefid | char(20) | √ |
| 9 | processmode | processmode | processmode | number(38, 0) |
| 10 | processmodevalue | processmodevalue | processmodevalue | varchar2(20) |
| 11 | processpassingthreshold | processpassingthreshold | processpassingthreshold | varchar2(20) |
| 12 | rejecttacheactivityid | rejecttacheactivityid | rejecttacheactivityid | varchar2(64) |
| 13 | taskresult | taskresult | taskresult | char(1) |
| 14 | taskstatus | taskstatus | taskstatus | number(38, 0) |
| 15 | tasktype | tasktype | tasktype | number(38, 0) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |