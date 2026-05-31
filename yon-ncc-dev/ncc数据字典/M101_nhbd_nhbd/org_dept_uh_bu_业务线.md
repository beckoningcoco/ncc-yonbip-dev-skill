# |<<

**业务线 (org_dept_uh_bu / nc.vo.nhbd.res.SrvLineVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4040.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptuhbu | 业务主键 | pk_deptuhbu | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 业务线编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 业务线名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | pk_butype | 业务线类型主键 | pk_butype | varchar(20) | √ | 业务线类型(自定义档案) (Defdoc-010201) |
| 7 | mnecode | 输入码 | mnecode | varchar(30) |  | 字符串 (String) |
| 8 | note | 备注 | note | varchar(200) |  | 备注 (Memo) |
| 9 | flag_sys | 系统定义标识 | flag_sys | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | dt_butype | 业务线类型编码 | dt_butype | varchar(50) |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |