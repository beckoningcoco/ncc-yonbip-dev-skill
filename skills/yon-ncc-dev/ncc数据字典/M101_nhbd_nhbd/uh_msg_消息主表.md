# |<<

**消息主表 (uh_msg / com.yonyou.yh.nhis.bd.tpi.uhmsg.vo.UhMsgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6127.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msg | 消息主键 | pk_msg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | eu_bodytype | 消息主体类型 | eu_bodytype | varchar(50) |  | 字符串 (String) |
| 5 | code_body | 消息主体编码 | code_body | varchar(50) |  | 字符串 (String) |
| 6 | name_body | 消息主体名称 | name_body | varchar(50) |  | 字符串 (String) |
| 7 | bed_no | 病人床号 | bed_no | varchar(50) |  | 字符串 (String) |
| 8 | subj_msg | 消息主题 | subj_msg | varchar(50) |  | 字符串 (String) |
| 9 | cont_msg | 消息内容 | cont_msg | varchar(50) |  | 字符串 (String) |
| 10 | flag_reply | 需要回复标志 | flag_reply | varchar(50) |  | 字符串 (String) |
| 11 | eu_level | 消息级别 | eu_level | varchar(50) |  | 字符串 (String) |
| 12 | eu_status_msg | 消息状态 | eu_status_msg | varchar(50) |  | 字符串 (String) |
| 13 | source_msg | 数据来源 | source_msg | varchar(50) |  | 字符串 (String) |
| 14 | code_dept_source | 来源部门 | code_dept_source | varchar(50) |  | 字符串 (String) |
| 15 | date_msg | 消息日期 | date_msg | char(19) |  | 日期时间 (UFDateTime) |
| 16 | code_psn_source | 发送人员 | code_psn_source | varchar(50) |  | 字符串 (String) |
| 17 | name_psn_source | 发送人员姓名 | name_psn_source | varchar(50) |  | 字符串 (String) |
| 18 | date_send | 最近发送时间 | date_send | char(19) |  | 日期时间 (UFDateTime) |
| 19 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 20 | pk_source | 消息来源外键 | pk_source | char(20) |  | 主键 (UFID) |
| 21 | code_dept_apply | 申请科室 | code_dept_apply | varchar(50) |  | 字符串 (String) |
| 22 | code_ward_apply | 申请病区 | code_ward_apply | varchar(50) |  | 字符串 (String) |
| 23 | code_psn_apply | 申请医生工号 | code_psn_apply | varchar(50) |  | 字符串 (String) |
| 24 | name_psn_apply | 申请医生姓名 | name_psn_apply | varchar(50) |  | 字符串 (String) |
| 25 | pk_psn_auth | 消息审核人员 | pk_psn_auth | char(20) |  | 主键 (UFID) |
| 26 | date_auth | 消息审核时间 | date_auth | char(19) |  | 日期时间 (UFDateTime) |
| 27 | replytimeout | 响应超时时间(单位秒) | replytimeout | int |  | 整数 (Integer) |
| 28 | times_rept | 重复发送次数 | times_rept | int |  | 整数 (Integer) |
| 29 | flag_notify | 通知标志 | flag_notify | varchar(50) |  | 字符串 (String) |
| 30 | date_notify | 通知时间 | date_notify | char(19) |  | 日期时间 (UFDateTime) |
| 31 | code_psn_notify | 通知人员 | code_psn_notify | varchar(50) |  | 字符串 (String) |
| 32 | code_design | 被指派人 | code_design | varchar(50) |  | 字符串 (String) |
| 33 | flag_proc | 处理标志 | flag_proc | varchar(50) |  | 字符串 (String) |
| 34 | date_proc | 处理时间 | date_proc | char(19) |  | 日期时间 (UFDateTime) |
| 35 | code_psn_proc | 处理人员 | code_psn_proc | varchar(50) |  | 字符串 (String) |
| 36 | eu_msgtype | 消息类型 | eu_msgtype | varchar(50) |  | 字符串 (String) |
| 37 | flag_urge | 跟催标志 | flag_urge | varchar(50) |  | 字符串 (String) |
| 38 | name_psn_phy | 管床医生 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 39 | pk_self | 跟催消息自关联 | pk_self | char(20) |  | 主键 (UFID) |
| 40 | pk_exmsg | 外部视图主键 | pk_exmsg | varchar(50) |  | 字符串 (String) |
| 41 | def1 | 自定项1 | def1 | varchar(50) |  | 字符串 (String) |
| 42 | def2 | 自定项2 | def2 | varchar(50) |  | 字符串 (String) |
| 43 | def3 | 自定项3 | def3 | varchar(50) |  | 字符串 (String) |
| 44 | def4 | 自定项4 | def4 | varchar(50) |  | 字符串 (String) |
| 45 | def5 | 自定项5 | def5 | varchar(50) |  | 字符串 (String) |
| 46 | def6 | 自定项6 | def6 | varchar(50) |  | 字符串 (String) |
| 47 | def7 | 自定项7 | def7 | varchar(50) |  | 字符串 (String) |
| 48 | def8 | 自定项8 | def8 | varchar(50) |  | 字符串 (String) |
| 49 | def9 | 自定义项9 | def9 | varchar(50) |  | 字符串 (String) |
| 50 | def10 | 自定义项10 | def10 | varchar(50) |  | 字符串 (String) |
| 51 | def11 | 自定义项11 | def11 | varchar(50) |  | 字符串 (String) |
| 52 | def12 | 自定义项12 | def12 | varchar(50) |  | 字符串 (String) |
| 53 | def13 | 自定义项13 | def13 | varchar(50) |  | 字符串 (String) |
| 54 | def14 | 自定义项14 | def14 | varchar(50) |  | 字符串 (String) |
| 55 | def15 | 自定义项15 | def15 | varchar(50) |  | 字符串 (String) |