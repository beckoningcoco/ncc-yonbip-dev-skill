# |<<

**补考勤 (hrkq_attendance / nccloud.vo.hrkq.attendance.AttendanceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2713.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_attendance | 主键 | pk_attendance | char(20) | √ | 主键 (UFID) |
| 2 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 3 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_dept | 所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | fill_date | 补考勤日期 | fill_date | char(19) |  | 日期 (UFDate) |
| 8 | original_sign_time | 原始打卡时间 | original_sign_time | char(8) |  | 时间 (UFTime) |
| 9 | original_sign_status | 原始打卡状态 | original_sign_status | varchar(20) |  | 原始打卡状态 (originalsignstatus) |  | 0=正常; |