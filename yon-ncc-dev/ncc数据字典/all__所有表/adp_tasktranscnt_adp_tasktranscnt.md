# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6438.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | contentid | contentid | contentid | char(20) | √ |
| 2 | neglecttimestamp | neglecttimestamp | neglecttimestamp | char(1) |
| 3 | restypeid | restypeid | restypeid | varchar2(20) |  |  | '~' |
| 4 | tasktranscontent | tasktranscontent | tasktranscontent | blob |
| 5 | tasktransrule | tasktransrule | tasktransrule | blob |
| 6 | transcontentid | transcontentid | transcontentid | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |