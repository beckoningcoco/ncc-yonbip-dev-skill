# |<<

**组织实施责任落实数据写入中间表 (scapto_implementdutywrite / nc.vo.scapto.implement.write.ImplementDutyWriteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5134.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_implementdutywrite | 组织实施责任落实数据写入主键 | pk_implementdutywrite | char(20) | √ | 主键 (UFID) |
| 2 | dept_id | 组织实施责任标识 | dept_id | varchar(50) | √ | 字符串 (String) |
| 3 | dept | 落实责任部门 | dept | varchar(64) |  | 字符串 (String) |
| 4 | name | 责任人 | name | varchar(64) |  | 字符串 (String) |
| 5 | upload_time | 上传时间 | upload_time | varchar(50) |  | 字符串 (String) |
| 6 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 字符串 (String) |
| 7 | remark | 备注 | remark | varchar(50) |  | 字符串 (String) |
| 8 | pk_duty | 组织实施责任落实主键 | pk_duty | varchar(20) |  | 字符串 (String) |
| 9 | execution_id | 组织实施标识 | execution_id | varchar(50) | √ | 字符串 (String) |