# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10399.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inventoryway_b | pk_inventoryway_b | pk_inventoryway_b | char(20) | √ |
| 2 | categincluedsub | categincluedsub | categincluedsub | char(1) |
| 3 | category_pk | category_pk | category_pk | varchar2(500) |
| 4 | deptincluedsub | deptincluedsub | deptincluedsub | char(1) |
| 5 | dept_pk | dept_pk | dept_pk | varchar2(500) |
| 6 | inventoryway | inventoryway | inventoryway | number(38, 0) |
| 7 | pk_inventory | pk_inventory | pk_inventory | char(20) | √ |
| 8 | planedcheckusername | planedcheckusername | planedcheckusername | varchar2(20) |  |  | '~' |
| 9 | rowno | rowno | rowno | varchar2(30) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |