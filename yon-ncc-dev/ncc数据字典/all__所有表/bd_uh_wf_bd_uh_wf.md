# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7256.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf | pk_wf | pk_wf | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | flag_sys | flag_sys | flag_sys | char(1) |
| 4 | name | name | name | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_wfcate | pk_wfcate | pk_wfcate | char(20) | √ |
| 8 | rowno | rowno | rowno | varchar2(50) |
| 9 | wftype | wftype | wftype | number(38, 0) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |