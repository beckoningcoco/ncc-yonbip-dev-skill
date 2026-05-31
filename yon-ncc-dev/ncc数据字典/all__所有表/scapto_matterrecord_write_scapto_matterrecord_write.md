# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11341.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recordwrite | pk_recordwrite | pk_recordwrite | char(20) | √ |
| 2 | item_code | item_code | item_code | varchar2(100) |
| 3 | item_id | item_id | item_id | varchar2(50) | √ |
| 4 | item_name | item_name | item_name | varchar2(200) |
| 5 | item_order | item_order | item_order | varchar2(50) |
| 6 | legal_flag | legal_flag | legal_flag | char(1) |
| 7 | list_id | list_id | list_id | varchar2(50) | √ |
| 8 | oper_type | oper_type | oper_type | varchar2(50) |
| 9 | pk_listreportwrite | pk_listreportwrite | pk_listreportwrite | char(20) | √ |
| 10 | pk_matterrecord | pk_matterrecord | pk_matterrecord | varchar2(20) |
| 11 | remark | remark | remark | varchar2(1024) |
| 12 | return_code | return_code | return_code | varchar2(50) |
| 13 | return_msg | return_msg | return_msg | varchar2(50) |
| 14 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 15 | upload_time | upload_time | upload_time | char(19) |
| 16 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 17 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 18 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 19 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 20 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |