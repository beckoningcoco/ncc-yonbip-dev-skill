# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11345.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | item_id | item_id | item_id | char(20) | √ |
| 2 | item_code | item_code | item_code | varchar2(100) |
| 3 | item_name | item_name | item_name | varchar2(200) |
| 4 | item_order | item_order | item_order | varchar2(50) |
| 5 | legal_flag | legal_flag | legal_flag | char(1) |
| 6 | list_id | list_id | list_id | varchar2(50) |
| 7 | oper_type | oper_type | oper_type | varchar2(50) |
| 8 | pk_matterrecord | pk_matterrecord | pk_matterrecord | varchar2(50) |
| 9 | remark | remark | remark | varchar2(1024) |
| 10 | return_code | return_code | return_code | varchar2(50) |
| 11 | return_msg | return_msg | return_msg | varchar2(50) |
| 12 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 13 | upload_time | upload_time | upload_time | char(19) |
| 14 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 15 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 16 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 17 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 18 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |