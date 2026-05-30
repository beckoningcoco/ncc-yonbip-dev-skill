# |<<

**业务线下部门定义 (org_dept_uh_bus / nc.vo.org.HisDeptBusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4042.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptuhbus | 业务线下部门主键 | pk_deptuhbus | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_dept | 部门主键 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | sort | 排序号 | sort | varchar(0) |  | 整数 (Integer) |
| 6 | pk_deptuhbu | 业务线主键 | pk_deptuhbu | varchar(20) |  | 业务线 (srvline) |
| 7 | pk_depttype | 角色主键 | pk_depttype | varchar(20) |  | 部门类型(自定义档案) (Defdoc-010200) |
| 8 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 9 | dt_depttype | 角色编码 | dt_depttype | varchar(50) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |