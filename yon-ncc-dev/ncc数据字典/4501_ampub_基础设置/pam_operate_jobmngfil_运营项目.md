# |<<

**运营项目 (pam_operate_jobmngfil / nc.vo.am.operatejobmngfil.OperateJobmngfilVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4286.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operate_jobmngfil | 运营项目主键 | pk_operate_jobmngfil | char(20) | √ | 主键 (UFID) |
| 2 | code | 运营项目编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 运营项目名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | type | 运营项目类型 | type | int |  | 运营项目类型 (JobmngfilTypeConst) | 1 | 1=累计型; |