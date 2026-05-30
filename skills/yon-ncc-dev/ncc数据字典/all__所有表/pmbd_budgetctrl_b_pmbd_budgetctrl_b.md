# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10512.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costbgtctrl_b | pk_costbgtctrl_b | pk_costbgtctrl_b | char(20) | √ |
| 2 | bill_type | bill_type | bill_type | varchar2(30) |
| 3 | ctrlpoint | ctrlpoint | ctrlpoint | number(38, 0) |
| 4 | ctrlrule_content | ctrlrule_content | ctrlrule_content | number(38, 0) |
| 5 | ctrl_type | ctrl_type | ctrl_type | number(38, 0) |
| 6 | memo | memo | memo | varchar2(300) |
| 7 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 8 | pk_costbgtctrl | pk_costbgtctrl | pk_costbgtctrl | char(20) | √ |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 12 | rowno | rowno | rowno | varchar2(20) |
| 13 | transi_type | transi_type | transi_type | varchar2(30) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |