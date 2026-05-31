# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9802.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | assosequence | assosequence | assosequence | number(38, 0) | √ |
| 2 | id | id | id | varchar2(256) | √ |
| 3 | industry | industry | industry | varchar2(50) |
| 4 | paravalue | paravalue | paravalue | varchar2(512) |
| 5 | versiontype | versiontype | versiontype | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |