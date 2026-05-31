# |<<

**租赁对象 (pam_lease_target / nc.vo.aim.equip.LeaseTargetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4276.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lease_target | 租赁对象主键 | pk_lease_target | char(20) | √ | 主键 (UFID) |
| 2 | row_num | 行号 | row_num | varchar(50) |  | 字符串 (String) |
| 3 | target_name | 租赁对象 | target_name | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | describle | 描述 | describle | varchar(400) |  | 字符串 (String) |
| 6 | start_date | 启用日期 | start_date | char(19) |  | 日期 (UFDate) |
| 7 | stop_date | 停用日期 | stop_date | char(19) |  | 日期 (UFDate) |
| 8 | lease_status | 租赁状态 | lease_status | int |  | 租赁状态枚举 (LeaseStatusEnum) |  | 1=待租; |