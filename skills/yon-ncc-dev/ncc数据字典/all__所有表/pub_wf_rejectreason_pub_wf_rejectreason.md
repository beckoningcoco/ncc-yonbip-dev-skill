# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11036.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_rejectreason | pk_wf_rejectreason | pk_wf_rejectreason | varchar2(20) | √ |
| 2 | activitydefid | activitydefid | activitydefid | varchar2(100) | √ |
| 3 | billid | billid | billid | varchar2(20) | √ |
| 4 | billno | billno | billno | varchar2(50) | √ |
| 5 | billversionpk | billversionpk | billversionpk | varchar2(20) | √ |
| 6 | rejectreason | rejectreason | rejectreason | varchar2(200) | √ |
| 7 | rejectstat | rejectstat | rejectstat | number(38, 0) |  |  | 1 |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |