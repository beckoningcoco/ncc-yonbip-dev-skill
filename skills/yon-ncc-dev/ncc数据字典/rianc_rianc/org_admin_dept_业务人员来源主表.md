# |<<

**业务人员来源主表 (org_admin_dept / nc.vo.relation.AdminDeptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3984.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busirole | 业务人员来源主表主键 | pk_busirole | char(20) | √ | 主键 (UFID) |
| 2 | pk_adminorg | 行政组织 | pk_adminorg | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 3 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 4 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |