# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11049.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workitemappoint | pk_workitemappoint | pk_workitemappoint | char(20) | √ |
| 2 | appointee | appointee | appointee | char(20) | √ |
| 3 | appointer | appointer | appointer | char(20) | √ |
| 4 | old_pk_workitem | old_pk_workitem | old_pk_workitem | char(20) | √ |
| 5 | pk_workitem | pk_workitem | pk_workitem | char(20) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |