# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6782.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbom_select | cbom_select | cbom_select | char(20) | √ |
| 2 | cbom_bid | cbom_bid | cbom_bid | char(20) | √ |
| 3 | gcfeatureclassid | gcfeatureclassid | gcfeatureclassid | varchar2(20) |  |  | '~' |
| 4 | gcfeaturedatavalue | gcfeaturedatavalue | gcfeaturedatavalue | varchar2(181) |
| 5 | gcfeatureid | gcfeatureid | gcfeatureid | varchar2(20) |  |  | '~' |
| 6 | gcfeaturevalue | gcfeaturevalue | gcfeaturevalue | varchar2(181) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |