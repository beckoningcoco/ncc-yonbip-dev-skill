# |<<

**医技预约订单 (uh_ex_med_order / com.yonyou.yh.nhis.sch.med.vo.MedOrderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6082.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_medorder | 医技预约主键 | pk_medorder | char(20) | √ | 主键 (UFID) |
| 2 | order_no | 预约号 | order_no | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | pk_pati | 患者主键 | pk_pati | varchar(20) |  | 字符串 (String) |
| 7 | pk_pv | 就诊主键 | pk_pv | varchar(20) |  | 字符串 (String) |
| 8 | pk_ord | 检测申请单主键 | pk_ord | varchar(20) |  | 字符串 (String) |
| 9 | pk_res | 排班资源主键 | pk_res | varchar(20) |  | 字符串 (String) |
| 10 | pk_sch | 排班主键 | pk_sch | varchar(20) |  | 字符串 (String) |
| 11 | pk_schticket | 号源主键 | pk_schticket | varchar(20) |  | 字符串 (String) |
| 12 | seq_num | 预约顺序号 | seq_num | int |  | 整数 (Integer) |
| 13 | print_num | 打印次数 | print_num | int |  | 整数 (Integer) |
| 14 | order_status | 预约订单状态 | order_status | int |  | 整数 (Integer) |
| 15 | flag_break_app | 爽约标识 | flag_break_app | int |  | 整数 (Integer) |
| 16 | triage_flag | 分诊标识 | triage_flag | int |  | 整数 (Integer) | 0 |
| 17 | triage_seq | 分诊序号 | triage_seq | int |  | 整数 (Integer) |
| 18 | triage_user | 分诊操作员 | triage_user | varchar(20) |  | 字符串 (String) |
| 19 | triage_time | 分诊时间 | triage_time | varchar(20) |  | 字符串 (String) |
| 20 | call_status | 呼叫状态 | call_status | int |  | 整数 (Integer) | 0 |
| 21 | call_msg | 叫号消息 | call_msg | varchar(200) |  | 字符串 (String) |
| 22 | call_num | 叫号次数 | call_num | int |  | 整数 (Integer) | 0 |
| 23 | call_user | 叫号医生 | call_user | varchar(20) |  | 字符串 (String) |
| 24 | call_time | 叫号时间 | call_time | varchar(20) |  | 字符串 (String) |
| 25 | repeat_user | 重呼医生 | repeat_user | varchar(20) |  | 字符串 (String) |
| 26 | repeat_time | 重呼时间 | repeat_time | varchar(20) |  | 字符串 (String) |
| 27 | repeat_num | 重呼次数 | repeat_num | int |  | 整数 (Integer) | 0 |
| 28 | repeat_msg | 重呼消息 | repeat_msg | varchar(200) |  | 字符串 (String) |
| 29 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 30 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 31 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 32 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 33 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 34 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 35 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 36 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 37 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 38 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 39 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 40 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 41 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 42 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 43 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 44 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 45 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 46 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 47 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 48 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |
| 49 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 50 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 51 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 52 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |