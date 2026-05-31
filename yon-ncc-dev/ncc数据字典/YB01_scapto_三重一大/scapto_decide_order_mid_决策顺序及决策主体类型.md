# |<<

**决策顺序及决策主体类型 (scapto_decide_order_mid / nc.vo.scapto.mattermanage.matterlistreport.matterlistmid.DecideOrderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5115.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | meeting_id | 决策顺序标识 | meeting_id | char(20) | √ | 主键 (UFID) |
| 2 | item_id | 事项记录标识 | item_id | varchar(50) |  | 字符串 (String) |
| 3 | meeting_order | 决策顺序序号 | meeting_order | varchar(50) |  | 字符串 (String) |
| 4 | type_name | 决策主体类型名称 | type_name | varchar(200) |  | 字符串 (String) |
| 5 | type_code | 决策主体类型编码 | type_code | varchar(100) |  | 字符串 (String) |
| 6 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 7 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 字符串 (String) |
| 8 | list_id | 事项清单主键 | list_id | varchar(50) |  | 字符串 (String) |