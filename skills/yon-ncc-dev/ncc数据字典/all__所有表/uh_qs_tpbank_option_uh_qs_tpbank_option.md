# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12768.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topic_option | pk_topic_option | pk_topic_option | char(20) | √ |
| 2 | edit_flag | edit_flag | edit_flag | char(1) |
| 3 | option_desc | option_desc | option_desc | varchar2(500) |
| 4 | pk_topic | pk_topic | pk_topic | char(20) |
| 5 | qualified_flag | qualified_flag | qualified_flag | char(1) |
| 6 | score | score | score | number(12, 4) |
| 7 | sort_order | sort_order | sort_order | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |