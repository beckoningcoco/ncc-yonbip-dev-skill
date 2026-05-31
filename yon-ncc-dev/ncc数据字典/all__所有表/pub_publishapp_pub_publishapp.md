# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10975.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_publishapp | pk_publishapp | pk_publishapp | varchar2(20) | √ |
| 2 | oldappid | oldappid | oldappid | varchar2(20) | √ |
| 3 | pagecode | pagecode | pagecode | varchar2(100) |
| 4 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(100) | √ |
| 5 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) | √ |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |
| 7 | publishappid | publishappid | publishappid | varchar2(20) | √ |
| 8 | publishmenucode | publishmenucode | publishmenucode | varchar2(100) |
| 9 | sence | sence | sence | number(38, 0) |  |  | 1 |
| 10 | vdef1 | vdef1 | vdef1 | varchar2(100) |
| 11 | vdef2 | vdef2 | vdef2 | varchar2(100) |
| 12 | vdef3 | vdef3 | vdef3 | varchar2(100) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |