# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7205.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_presreviewdt | pk_presreviewdt | pk_presreviewdt | char(20) | √ |
| 2 | code_presreviewdt | code_presreviewdt | code_presreviewdt | varchar2(50) |
| 3 | condition_judge | condition_judge | condition_judge | varchar2(50) |
| 4 | flag_active | flag_active | flag_active | char(1) |
| 5 | item_value | item_value | item_value | number(14, 2) |
| 6 | name_presreviewdt | name_presreviewdt | name_presreviewdt | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_presreview | pk_presreview | pk_presreview | char(20) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |