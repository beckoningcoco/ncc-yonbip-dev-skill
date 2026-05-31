# |<<

**事项记录中间表 (scapto_matter_record_mid / nc.vo.scapto.mattermanage.matterlistreport.matterlistmid.MatterRecordMidVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5147.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | item_id | 事项记录标识 | item_id | char(20) | √ | 主键 (UFID) |
| 2 | list_id | 事项清单标识 | list_id | varchar(50) |  | 字符串 (String) |
| 3 | item_code | 事项编码 | item_code | varchar(100) |  | 字符串 (String) |
| 4 | item_order | 事项记录序号 | item_order | varchar(50) |  | 字符串 (String) |
| 5 | item_name | 事项记录名称 | item_name | varchar(200) |  | 字符串 (String) |
| 6 | oper_type | 操作类型 | oper_type | varchar(50) |  | 字符串 (String) |
| 7 | legal_flag | 是否经过法律审核 | legal_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | upload_time | 上传时间 | upload_time | char(19) |  | 日期 (UFDate) |
| 9 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 字符串 (String) |
| 10 | return_code | 返回标识 | return_code | varchar(50) |  | 字符串 (String) |
| 11 | return_msg | 返回内容 | return_msg | varchar(50) |  | 字符串 (String) |
| 12 | remark | 备注 | remark | varchar(1024) |  | 备注 (Memo) |
| 13 | pk_matterrecord | 事项记录主键 | pk_matterrecord | varchar(50) |  | 字符串 (String) |
| 14 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 15 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |