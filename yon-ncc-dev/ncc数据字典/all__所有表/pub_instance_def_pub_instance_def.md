# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10928.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_process_subflow | pk_process_subflow | pk_process_subflow | varchar2(300) | √ |
| 2 | pk_wf_def | pk_wf_def | pk_wf_def | varchar2(450) | √ |
| 3 | pk_wf_instance | pk_wf_instance | pk_wf_instance | varchar2(450) | √ |
| 4 | processdefid | processdefid | processdefid | varchar2(450) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |