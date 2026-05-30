# |<<

**部门参数 (org_dept_uh_his_argu / nc.vo.org.HisDeptArguVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4044.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptargu | 主键 | pk_deptargu | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织主键 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_dept | 部门主键 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | pk_argu | 参数 | pk_argu | varchar(20) |  | 参数模板设置 (sysinitemp) |
| 6 | code_argu | 参数编码 | code_argu | varchar(512) |  | 字符串 (String) |
| 7 | note_argu | 参数说明 | note_argu | varchar(512) |  | 字符串 (String) |
| 8 | arguval | 参数值 | arguval | varchar(512) |  | 字符串 (String) |
| 9 | flag_stop | 是否停用 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | editflag | 是否可编辑 | editflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | dataoriginflag | 分布式 | dataoriginflag | varchar(50) |  | 字符串 (String) |
| 12 | sysinit | 关联模板 | sysinit | varchar(512) |  | 字符串 (String) |
| 13 | valuelist | 取值范围 | valuelist | varchar(400) |  | 字符串 (String) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |