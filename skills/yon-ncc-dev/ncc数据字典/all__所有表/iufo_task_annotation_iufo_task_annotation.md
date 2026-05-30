# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9710.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskannotation | pk_taskannotation | pk_taskannotation | varchar2(20) | √ |
| 2 | alone_id | alone_id | alone_id | varchar2(36) |
| 3 | annotation_content | annotation_content | annotation_content | varchar2(4000) |
| 4 | annotation_person | annotation_person | annotation_person | varchar2(20) |
| 5 | annotation_time | annotation_time | annotation_time | char(19) |
| 6 | busi_type | busi_type | busi_type | number(38, 0) |
| 7 | pk_task | pk_task | pk_task | varchar2(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |