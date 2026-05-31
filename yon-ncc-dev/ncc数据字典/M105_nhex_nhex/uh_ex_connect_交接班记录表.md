# |<<

**交接班记录表 (uh_ex_connect / com.yonyou.yh.nhis.ex.ns.vo.UhExConnectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6062.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_connect | 主键 | pk_connect | char(20) | √ | 主键 (UFID) |
| 2 | pk_userdept | 所属科室 | pk_userdept | varchar(20) | √ | 用户组和部门关系 (usergrpdept) |
| 3 | pk_psn | 交接人 | pk_psn | varchar(50) | √ | 字符串 (String) |
| 4 | date_connect | 交接时间 | date_connect | char(19) | √ | 日期时间 (UFDateTime) |
| 5 | role | 角色 | role | int | √ | 角色 (RoleEnum) |  | 1=医生; |