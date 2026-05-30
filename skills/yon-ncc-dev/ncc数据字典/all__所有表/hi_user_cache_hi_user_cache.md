# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8692.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_cache | pk_user_cache | pk_user_cache | char(20) | √ |
| 2 | cache_content | cache_content | cache_content | blob |
| 3 | cache_key | cache_key | cache_key | varchar2(200) |
| 4 | pk_user | pk_user | pk_user | char(20) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |