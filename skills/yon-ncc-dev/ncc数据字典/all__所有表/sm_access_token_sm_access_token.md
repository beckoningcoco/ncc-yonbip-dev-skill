# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11501.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_access_token | pk_access_token | pk_access_token | varchar2(20) | √ |
| 2 | access_token | access_token | access_token | varchar2(200) |
| 3 | pk_refresh_token | pk_refresh_token | pk_refresh_token | varchar2(20) |
| 4 | pk_security | pk_security | pk_security | varchar2(20) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |