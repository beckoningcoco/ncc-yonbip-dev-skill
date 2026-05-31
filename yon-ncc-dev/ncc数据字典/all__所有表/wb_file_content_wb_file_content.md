# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12952.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | content | content | content | blob |
| 3 | name | name | name | varchar2(255) | √ |
| 4 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |