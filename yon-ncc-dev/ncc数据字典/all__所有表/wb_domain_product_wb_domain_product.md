# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12946.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(255) | √ |
| 2 | domain_name | domain_name | domain_name | varchar2(255) | √ |
| 3 | fe_server | fe_server | fe_server | varchar2(255) |
| 4 | icon | icon | icon | varchar2(4000) |
| 5 | products | products | products | varchar2(255) | √ |
| 6 | products_pid | products_pid | products_pid | varchar2(255) |
| 7 | sys_id | sys_id | sys_id | varchar2(255) |
| 8 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |