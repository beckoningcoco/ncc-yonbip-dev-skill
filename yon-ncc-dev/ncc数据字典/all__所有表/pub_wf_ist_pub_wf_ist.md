# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11029.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_ist | pk_wf_ist | pk_wf_ist | char(20) | √ |
| 2 | activitydefid | activitydefid | activitydefid | varchar2(64) |
| 3 | mainpk_wf_instance | mainpk_wf_instance | mainpk_wf_instance | char(20) |
| 4 | pk_wf_instance | pk_wf_instance | pk_wf_instance | char(20) | √ |
| 5 | timelimit | timelimit | timelimit | number(38, 0) |
| 6 | timeremind | timeremind | timeremind | number(38, 0) |
| 7 | type | type | type | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |