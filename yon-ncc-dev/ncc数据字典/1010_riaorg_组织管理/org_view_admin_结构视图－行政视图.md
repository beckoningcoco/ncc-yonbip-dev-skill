# |<<

**结构视图－行政视图 (org_view_admin / nc.vo.org.orgview.OrgViewOrgSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4186.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgsub | 主键 | pk_orgsub | char(20) | √ | 主键 (UFID) |
| 2 | pk_orgunit | 组织单元 | pk_orgunit | varchar(20) |  | 组织 (org) |
| 3 | code | 编码 | code | varchar(40) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 5 | pk_fatherorg | 上级组织单元 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 6 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 7 | shortname | 简称 | shortname | varchar(200) |  | 字符串 (String) |
| 8 | mnecode | 助记码 | mnecode | varchar(200) |  | 字符串 (String) |
| 9 | orgtype1 | 人力资源组织 | orgtype1 | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | orgtype2 | 业务单元 | orgtype2 | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | orgtype3 | 部门 | orgtype3 | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | principal | 负责人 | principal | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | isvirtualdept | 虚拟部门 | isvirtualdept | char(1) |  | 布尔类型 (UFBoolean) | N |
| 14 | iswithdrawdept | 撤销部门 | iswithdrawdept | char(1) |  | 布尔类型 (UFBoolean) | N |
| 15 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |