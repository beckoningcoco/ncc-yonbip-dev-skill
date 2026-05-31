# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9627.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_multilanglink | pk_multilanglink | pk_multilanglink | char(20) | √ |
| 2 | cur_lang | cur_lang | cur_lang | varchar2(50) |
| 3 | pk_storyboard | pk_storyboard | pk_storyboard | varchar2(20) | √ |
| 4 | remoteid | remoteid | remoteid | varchar2(50) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |