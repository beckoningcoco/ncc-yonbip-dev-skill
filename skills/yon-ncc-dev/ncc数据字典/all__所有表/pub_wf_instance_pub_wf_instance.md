# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11026.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_instance | pk_wf_instance | pk_wf_instance | char(20) | √ |
| 2 | billcommiter | billcommiter | billcommiter | char(20) |
| 3 | billid | billid | billid | varchar2(20) |  |  | '~' |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billno | billno | billno | varchar2(256) |
| 6 | billtype | billtype | billtype | varchar2(20) |
| 7 | billversionpk | billversionpk | billversionpk | varchar2(20) |
| 8 | endts | endts | endts | char(19) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | processdefid | processdefid | processdefid | char(20) | √ |
| 11 | procresult | procresult | procresult | char(1) |
| 12 | procstatus | procstatus | procstatus | number(38, 0) |
| 13 | relevantdatas | relevantdatas | relevantdatas | blob |
| 14 | src_pk_actinstance | src_pk_actinstance | src_pk_actinstance | varchar2(20) |  |  | '~' |
| 15 | startts | startts | startts | char(19) |
| 16 | workflow_type | workflow_type | workflow_type | number(38, 0) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |