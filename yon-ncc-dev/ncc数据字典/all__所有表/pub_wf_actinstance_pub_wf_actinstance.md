# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11016.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_actinstance | pk_wf_actinstance | pk_wf_actinstance | char(20) | √ |
| 2 | activitydefid | activitydefid | activitydefid | varchar2(64) |
| 3 | actresult | actresult | actresult | char(1) |
| 4 | actstatus | actstatus | actstatus | number(38, 0) |
| 5 | createtime | createtime | createtime | char(19) |
| 6 | modifytime | modifytime | modifytime | char(19) |
| 7 | pk_wf_instance | pk_wf_instance | pk_wf_instance | char(20) | √ |
| 8 | reachjoins | reachjoins | reachjoins | number(38, 0) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |