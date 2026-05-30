# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10139.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relateapi | pk_relateapi | pk_relateapi | char(20) | √ |
| 2 | apiuri | apiuri | apiuri | varchar2(100) |
| 3 | app_id | app_id | app_id | varchar2(100) |
| 4 | pk_api | pk_api | pk_api | varchar2(20) |
| 5 | pk_thirdapp | pk_thirdapp | pk_thirdapp | varchar2(20) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |