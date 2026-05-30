# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11796.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_target_period | pk_target_period | pk_target_period | char(20) | √ |
| 2 | dprdbegindate | dprdbegindate | dprdbegindate | char(19) |
| 3 | dprdenddate | dprdenddate | dprdenddate | char(19) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |
| 5 | pk_target | pk_target | pk_target | char(20) | √ |
| 6 | vperiod | vperiod | vperiod | varchar2(30) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |