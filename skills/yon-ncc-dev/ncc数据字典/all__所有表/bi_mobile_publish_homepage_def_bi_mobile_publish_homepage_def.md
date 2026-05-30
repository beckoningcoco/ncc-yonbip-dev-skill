# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7319.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | varchar2(20) | √ |
| 2 | home_page_pk | home_page_pk | home_page_pk | varchar2(20) | √ |  | '~' |
| 3 | user_pk | user_pk | user_pk | varchar2(20) | √ |  | '~' |
| 4 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 5 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |