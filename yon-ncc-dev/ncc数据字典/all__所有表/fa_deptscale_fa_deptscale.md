# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8126.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptscale | pk_deptscale | pk_deptscale | char(20) | √ |
| 2 | link_key | link_key | link_key | varchar2(20) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 5 | pk_dept_v | pk_dept_v | pk_dept_v | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | totalscale | totalscale | totalscale | number(28, 8) |
| 8 | usescale | usescale | usescale | number(16, 4) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |