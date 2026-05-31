# |<<

**领导班子子表中间表 (scapto_membermid / nc.vo.scapto.enterprise.enterprisemid.MemberMidVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5174.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | member_id | 领导班子子表标识 | member_id | char(20) | √ | 主键 (UFID) |
| 2 | group_type | 领导班子类型 | group_type | varchar(50) |  | 字符串 (String) |
| 3 | name | 姓名 | name | varchar(50) |  | 字符串 (String) |
| 4 | position | 职务 | position | varchar(50) |  | 字符串 (String) |
| 5 | start_date | 任职开始日期 | start_date | char(19) |  | 日期 (UFDate) |
| 6 | end_date | 任职结束日期 | end_date | char(19) |  | 日期 (UFDate) |
| 7 | remark | 备注 | remark | varchar(1024) |  | 备注 (Memo) |
| 8 | pk_enterpriseleadership | 领导班子成员主键 | pk_enterpriseleadership | varchar(50) |  | 字符串 (String) |
| 9 | oper_type | 操作类型 | oper_type | varchar(50) |  | 字符串 (String) |
| 10 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 11 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 字符串 (String) |
| 12 | return_code | 返回标识 | return_code | varchar(50) |  | 字符串 (String) |
| 13 | return_msg | 返回内容 | return_msg | varchar(50) |  | 字符串 (String) |
| 14 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 15 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 17 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 18 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |