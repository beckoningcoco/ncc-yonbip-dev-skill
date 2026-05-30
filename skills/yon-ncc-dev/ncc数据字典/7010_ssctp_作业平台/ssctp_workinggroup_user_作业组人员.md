# |<<

**作业组人员 (ssctp_workinggroup_user / nc.vo.ssctp.sscbd.WorkingGroupUserVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5673.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sscworkinggroup | 唯一标识 | pk_sscworkinggroup | char(20) | √ | 主键 (UFID) |
| 2 | pk_workinggroup | 共享作业组 | pk_workinggroup | char(20) |  | 字符串 (String) |
| 3 | usertype | 用户类型 | usertype | varchar(20) |  | 共享用户类型 (sscusertype) |  | chargeman=组长; |