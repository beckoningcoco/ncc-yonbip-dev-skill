# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11777.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_period | pk_plcy_period | pk_plcy_period | char(20) | √ |
| 2 | dcashfromdate | dcashfromdate | dcashfromdate | char(19) |
| 3 | dcashtodate | dcashtodate | dcashtodate | char(19) |
| 4 | dprdbegindate | dprdbegindate | dprdbegindate | char(19) |
| 5 | dprdenddate | dprdenddate | dprdenddate | char(19) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |
| 7 | pk_plcy | pk_plcy | pk_plcy | char(20) | √ |
| 8 | vperiod | vperiod | vperiod | varchar2(20) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |