# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9830.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | industry | industry | industry | varchar2(50) | √ |
| 3 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 4 | authorizable | authorizable | authorizable | char(1) |
| 5 | busioperationid | busioperationid | busioperationid | varchar2(50) | √ |
| 6 | operationid | operationid | operationid | varchar2(50) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |